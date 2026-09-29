import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import java.util.zip.*;

/** Memory-bounded structural comparison; no classes are loaded. */
public final class CompactStructureCompare {
  static final class R {
    final DataInputStream in; final Object[] cp;
    R(byte[] bytes) { in = new DataInputStream(new ByteArrayInputStream(bytes)); cp = readCp(); }
    Object[] readCp() {
      try {
        if (in.readInt() != 0xCAFEBABE) throw new IllegalArgumentException("not class");
        in.readUnsignedShort(); in.readUnsignedShort(); Object[] c = new Object[in.readUnsignedShort()];
        for (int i=1;i<c.length;i++) { int t=in.readUnsignedByte();
          switch(t) {
            case 1 -> { int n=in.readUnsignedShort(); byte[] b=in.readNBytes(n); c[i]=new String(b, StandardCharsets.UTF_8); }
            case 3,4 -> in.skipBytes(4);
            case 5,6 -> { in.skipBytes(8); i++; }
            case 7,8,16,19,20 -> c[i]=in.readUnsignedShort();
            case 9,10,11,12,17,18 -> { in.skipBytes(4); }
            case 15 -> in.skipBytes(3);
            default -> throw new IllegalArgumentException("constant tag "+t);
          }
        }
        return c;
      } catch(IOException e) { throw new UncheckedIOException(e); }
    }
    String utf(int i) { return (String)cp[i]; }
    String cls(int i) { return utf((Integer)cp[i]); }
    String sig() {
      try {
        StringBuilder s=new StringBuilder(); int access=in.readUnsignedShort();
        String self=cls(in.readUnsignedShort()), sup=cls(in.readUnsignedShort());
        s.append("C|").append(access).append('|').append(self).append('|').append(sup);
        int ni=in.readUnsignedShort(); String[] it=new String[ni]; for(int i=0;i<ni;i++) it[i]=cls(in.readUnsignedShort()); Arrays.sort(it);
        for(String x:it)s.append("|I|").append(x);
        members(s,"F"); members(s,"M"); return s.toString();
      } catch(IOException e) { throw new UncheckedIOException(e); }
    }
    void members(StringBuilder s,String kind) throws IOException {
      int n=in.readUnsignedShort(); s.append('|').append(kind).append('#').append(n);
      for(int i=0;i<n;i++) { int a=in.readUnsignedShort(); String name=utf(in.readUnsignedShort()), desc=utf(in.readUnsignedShort());
        s.append('|').append(a).append('|').append(name).append('|').append(desc); int na=in.readUnsignedShort();
        for(int j=0;j<na;j++) { String an=utf(in.readUnsignedShort()); int len=in.readInt(); byte[] b=in.readNBytes(len);
          if (an.equals("Exceptions")) { DataInputStream x=new DataInputStream(new ByteArrayInputStream(b)); int ne=x.readUnsignedShort(); String[] ex=new String[ne]; for(int k=0;k<ne;k++) ex[k]=cls(x.readUnsignedShort()); Arrays.sort(ex); for(String e:ex)s.append("|E|").append(e); }
        }
      }
    }
  }
  static Map<String,String> read(Path jar) throws Exception { Map<String,String> m=new HashMap<>();
    try(ZipFile z=new ZipFile(jar.toFile())) { Enumeration<? extends ZipEntry> en=z.entries(); while(en.hasMoreElements()) { ZipEntry e=en.nextElement(); if(!e.getName().endsWith(".class"))continue;
      byte[] b; try(InputStream x=z.getInputStream(e)){b=x.readAllBytes();} String sig=new R(b).sig(); m.put(e.getName(),sha(sig)); }} return m; }
  static String sha(String s)throws Exception { byte[] b=MessageDigest.getInstance("SHA-256").digest(s.getBytes(StandardCharsets.UTF_8)); StringBuilder x=new StringBuilder(); for(byte v:b)x.append(String.format("%02x",v)); return x.toString(); }
  public static void main(String[] a)throws Exception { if(a.length!=2)throw new IllegalArgumentException("LEFT.jar RIGHT.jar"); Map<String,String> l=read(Paths.get(a[0])),r=read(Paths.get(a[1])); Set<String> k=new TreeSet<>();k.addAll(l.keySet());k.addAll(r.keySet());List<String>d=new ArrayList<>();for(String x:k)if(!Objects.equals(l.get(x),r.get(x)))d.add(x);System.out.println("left="+l.size()+" right="+r.size()+" rawDiffs="+d.size());for(int i=0;i<Math.min(10,d.size());i++)System.out.println(d.get(i)); }
}
