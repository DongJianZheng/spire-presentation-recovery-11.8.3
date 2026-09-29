/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.spravg;
import com.spire.presentation.packages.sprazg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.spriam;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprqrg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprssg;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtvg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwvg;
import com.spire.presentation.packages.sprzyg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.SignatureException;
import java.util.Iterator;

public class sprjsg {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 4;
        int cfr_ignored_0 = 5 << 4 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ boolean cfr_renamed_8085(byte arg0) {
        return sprjsg.cfr_renamed_8086(arg0) || arg0 == 9 || arg0 == 32;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_8087(ByteArrayOutputStream byteArrayOutputStream, int n, InputStream inputStream) throws IOException {
        int n2;
        int arg1;
        block2: {
            void arg2;
            ByteArrayOutputStream arg0;
            arg0.reset();
            int n3 = n;
            do {
                arg0.write(n3);
                if (n3 != 13 && n3 != 10) continue;
                arg1 = sprjsg.cfr_renamed_8088(arg0, n3, (InputStream)arg2);
                n2 = n3;
                break block2;
            } while ((n3 = arg2.read()) >= 0);
            n2 = n3;
        }
        if (n2 < 0) {
            arg1 = -1;
        }
        return arg1;
    }

    private static /* synthetic */ int cfr_renamed_8089(byte[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && sprjsg.cfr_renamed_8085(arg0[n])) {
            n2 = --n;
        }
        return n + 1;
    }

    private static /* synthetic */ void cfr_renamed_8090(InputStream arg0, InputStream arg1, String arg2) throws Exception {
        Object object;
        spriam spriam2 = new spriam(arg0);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arg2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = sprjsg.cfr_renamed_8091(byteArrayOutputStream, spriam2);
        byte[] byArray = sprjsg.cfr_renamed_8092();
        if (n != -1 && spriam2.cfr_renamed_8093()) {
            object = byteArrayOutputStream.toByteArray();
            int n2 = n;
            BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
            ((OutputStream)bufferedOutputStream2).write((byte[])object, 0, sprjsg.cfr_renamed_8089((byte[])object));
            ((OutputStream)bufferedOutputStream2).write(byArray);
            while (n2 != -1 && spriam2.cfr_renamed_8093()) {
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                n = sprjsg.cfr_renamed_8087(byteArrayOutputStream2, n, spriam2);
                object = byteArrayOutputStream2.toByteArray();
                n2 = n;
                BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream;
                Object object2 = object;
                ((OutputStream)bufferedOutputStream3).write((byte[])object2, 0, sprjsg.cfr_renamed_8089((byte[])object2));
                ((OutputStream)bufferedOutputStream3).write(byArray);
            }
        } else if (n != -1) {
            object = byteArrayOutputStream.toByteArray();
            BufferedOutputStream bufferedOutputStream4 = bufferedOutputStream;
            ((OutputStream)bufferedOutputStream4).write((byte[])object, 0, sprjsg.cfr_renamed_8089((byte[])object));
            ((OutputStream)bufferedOutputStream4).write(byArray);
        }
        ((OutputStream)bufferedOutputStream).close();
        object = new sprryg(arg1, (sprrk)new sprmwg());
        sprzyg sprzyg2 = ((sprtvg)new sprwvg(spriam2).cfr_renamed_7703()).cfr_renamed_576(0);
        sprvbh sprvbh2 = ((sprryg)object).cfr_renamed_7720(sprzyg2.cfr_renamed_7541());
        sprzyg sprzyg3 = sprzyg2;
        sprzyg3.cfr_renamed_7694(new spravg().cfr_renamed_1499("BC"), sprvbh2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg2));
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        n = sprjsg.cfr_renamed_8091(byteArrayOutputStream3, bufferedInputStream);
        sprjsg.cfr_renamed_8094(sprzyg3, byteArrayOutputStream3.toByteArray());
        if (n != -1) {
            do {
                n = sprjsg.cfr_renamed_8087(byteArrayOutputStream, n, bufferedInputStream);
                sprzyg sprzyg4 = sprzyg2;
                sprzyg2.cfr_renamed_1221((byte)13);
                sprzyg4.cfr_renamed_1221((byte)10);
                sprjsg.cfr_renamed_8094(sprzyg4, byteArrayOutputStream.toByteArray());
            } while (n != -1);
        }
        ((InputStream)bufferedInputStream).close();
        if (sprzyg2.cfr_renamed_1626()) {
            System.out.println(ShapeAlignmentEnum.cfr_renamed_9("x_lXjB~Dn\u0016}Sy_m_nR%"));
            return;
        }
        System.out.println(sprlpb.cfr_renamed_9("\t\u0013\u001d\u0014\u001b\u000e\u000f\b\u001fZ\f\u001f\b\u0013\u001c\u0013\u0019\u001b\u000e\u0013\u0015\u0014Z\u001c\u001b\u0013\u0016\u001f\u001eT"));
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0[0].equals(ShapeAlignmentEnum.cfr_renamed_9("\u001bx"))) {
            InputStream inputStream = sprmxg.cfr_renamed_7556(new FileInputStream(arg0[2]));
            FileOutputStream fileOutputStream = new FileOutputStream(new StringBuilder().insert(0, arg0[1]).append(sprlpb.cfr_renamed_9("T\u001b\t\u0019")).toString());
            if (arg0.length == 4) {
                sprjsg.cfr_renamed_8095(arg0[1], inputStream, fileOutputStream, arg0[3].toCharArray(), "SHA1");
                return;
            }
            sprjsg.cfr_renamed_8095(arg0[1], inputStream, fileOutputStream, arg0[3].toCharArray(), arg0[4]);
            return;
        }
        if (arg0[0].equals(ShapeAlignmentEnum.cfr_renamed_9("\u001b}"))) {
            if (arg0[1].indexOf(sprlpb.cfr_renamed_9("T\u001b\t\u0019")) < 0) {
                System.err.println(ShapeAlignmentEnum.cfr_renamed_9("m_gS+XnSoE+Bd\u0016nXo\u0016bX+\u0014%WxU)"));
                System.exit(1);
            }
            FileInputStream fileInputStream = new FileInputStream(arg0[1]);
            InputStream inputStream = sprmxg.cfr_renamed_7556(new FileInputStream(arg0[2]));
            sprjsg.cfr_renamed_8090(fileInputStream, inputStream, arg0[1].substring(0, arg0[1].length() - 4));
            return;
        }
        System.err.println(sprlpb.cfr_renamed_9("\u000f\t\u001b\u001d\u001f@Z9\u0016\u001f\u001b\b)\u0013\u001d\u0014\u001f\u001e<\u0013\u0016\u001f*\b\u0015\u0019\u001f\t\t\u0015\bZ!W\tZ\u001c\u0013\u0016\u001fZ\u0011\u001f\u0003\u001c\u0013\u0016\u001fZ\n\u001b\t\t*\u0012\b\u001b\t\u001f'\u0006!W\fZ\t\u0013\u001d<\u0013\u0016\u001fZ\u0011\u001f\u0003<\u0013\u0016\u001f'"));
    }

    private static /* synthetic */ boolean cfr_renamed_8086(byte arg0) {
        return arg0 == 13 || arg0 == 10;
    }

    private static /* synthetic */ int cfr_renamed_8096(byte[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && sprjsg.cfr_renamed_8085(arg0[n])) {
            n2 = --n;
        }
        return n + 1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_8091(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) throws IOException {
        void arg1;
        int n;
        ByteArrayOutputStream arg0;
        arg0.reset();
        int n2 = -1;
        while ((n = arg1.read()) >= 0) {
            int n3 = n;
            arg0.write(n3);
            if (n3 != 13 && n != 10) continue;
            n2 = sprjsg.cfr_renamed_8088(arg0, n, (InputStream)arg1);
            return n2;
        }
        return n2;
    }

    private static /* synthetic */ byte[] cfr_renamed_8092() {
        int n;
        String string = sprkoe.cfr_renamed_5114();
        byte[] byArray = new byte[string.length()];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)string.charAt(n3);
            n2 = n;
        }
        return byArray;
    }

    private static /* synthetic */ int cfr_renamed_8088(ByteArrayOutputStream arg0, int arg1, InputStream arg2) throws IOException {
        int n = arg2.read();
        if (arg1 == 13 && n == 10) {
            arg0.write(n);
            n = arg2.read();
        }
        return n;
    }

    private static /* synthetic */ void cfr_renamed_8094(sprzyg arg0, byte[] arg1) throws SignatureException, IOException {
        int n = sprjsg.cfr_renamed_8096(arg1);
        if (n > 0) {
            arg0.cfr_renamed_1197(arg1, 0, n);
        }
    }

    private static /* synthetic */ void cfr_renamed_8097(OutputStream arg0, sprssg arg1, byte[] arg2) throws SignatureException, IOException {
        int n = sprjsg.cfr_renamed_8096(arg2);
        if (n > 0) {
            arg1.cfr_renamed_1197(arg2, 0, n);
        }
        arg0.write(arg2, 0, arg2.length);
    }

    private static /* synthetic */ void cfr_renamed_8095(String arg0, InputStream arg1, OutputStream arg2, char[] arg3, String arg4) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, sprtqg, SignatureException {
        spriyg spriyg2;
        InputStream inputStream;
        int n;
        if (arg4.equals("SHA256")) {
            n = 8;
            inputStream = arg1;
        } else if (arg4.equals("SHA384")) {
            n = 9;
            inputStream = arg1;
        } else if (arg4.equals("SHA512")) {
            n = 10;
            inputStream = arg1;
        } else if (arg4.equals("MD5")) {
            n = 1;
            inputStream = arg1;
        } else if (arg4.equals("RIPEMD160")) {
            n = 3;
            inputStream = arg1;
        } else {
            n = 2;
            inputStream = arg1;
        }
        spriyg spriyg3 = spriyg2 = sprazg.cfr_renamed_8058(inputStream);
        sprmah sprmah2 = spriyg3.cfr_renamed_7744(new sprqrg().cfr_renamed_1499("BC").cfr_renamed_1480(arg3));
        sprssg sprssg2 = new sprssg(new sprebh(spriyg2.cfr_renamed_1157().cfr_renamed_593(), n).cfr_renamed_1499("BC"));
        sprsxg sprsxg2 = new sprsxg();
        sprssg2.cfr_renamed_7538(1, sprmah2);
        Iterator<String> iterator = spriyg3.cfr_renamed_1157().cfr_renamed_7712();
        if (iterator.hasNext()) {
            sprsxg2.cfr_renamed_7641(false, iterator.next());
        }
        sprssg2.cfr_renamed_7666(sprsxg2.cfr_renamed_31());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        sprczl sprczl2 = new sprczl(arg2);
        sprczl2.cfr_renamed_8098(n);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = sprjsg.cfr_renamed_8091(byteArrayOutputStream, bufferedInputStream);
        sprjsg.cfr_renamed_8097(sprczl2, sprssg2, byteArrayOutputStream.toByteArray());
        if (n2 != -1) {
            do {
                n2 = sprjsg.cfr_renamed_8087(byteArrayOutputStream, n2, bufferedInputStream);
                sprssg sprssg3 = sprssg2;
                sprssg3.cfr_renamed_1221((byte)13);
                sprssg3.cfr_renamed_1221((byte)10);
                sprjsg.cfr_renamed_8097(sprczl2, sprssg3, byteArrayOutputStream.toByteArray());
            } while (n2 != -1);
        }
        ((InputStream)bufferedInputStream).close();
        sprczl2.cfr_renamed_8099();
        sprczl sprczl3 = sprczl2;
        sprjah sprjah2 = new sprjah(sprczl3);
        sprssg2.cfr_renamed_31().cfr_renamed_2623(sprjah2);
        sprczl3.close();
    }
}

