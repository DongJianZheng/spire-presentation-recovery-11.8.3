/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbcca;
import com.spire.presentation.packages.sprbqe;
import com.spire.presentation.packages.spribe;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.sprqge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvfe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprywa;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprzzd {
    public static String cfr_renamed_4550(spra arg0) {
        int n;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (!(arg0 instanceof sprx) || arg0 instanceof sprbqe) {
            try {
                stringBuffer2.append(new StringBuilder().insert(0, "#").append(sprzzd.cfr_renamed_4451(sprmma.cfr_renamed_485(arg0.cfr_renamed_119().cfr_renamed_104("DER")))).toString());
                stringBuffer = stringBuffer2;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprbcca.cfr_renamed_9("V!q0kuo4u |uq4juw:90w6v1|193v't"));
            }
        } else {
            String string = ((sprx)((Object)arg0)).cfr_renamed_314();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer2.append("\\" + string);
            } else {
                stringBuffer2.append(string);
            }
            stringBuffer = stringBuffer2;
        }
        int n2 = stringBuffer.length();
        int n3 = 0;
        if (stringBuffer2.length() >= 2 && stringBuffer2.charAt(0) == '\\' && stringBuffer2.charAt(1) == '#') {
            n3 += 2;
        }
        int n4 = n3;
        while (n4 != n2) {
            if (stringBuffer2.charAt(n3) == ',' || stringBuffer2.charAt(n3) == '\"' || stringBuffer2.charAt(n3) == '\\' || stringBuffer2.charAt(n3) == '+' || stringBuffer2.charAt(n3) == '=' || stringBuffer2.charAt(n3) == '<' || stringBuffer2.charAt(n3) == '>' || stringBuffer2.charAt(n3) == ';') {
                stringBuffer2.insert(n3++, "\\");
                ++n2;
            }
            n4 = ++n3;
        }
        if (stringBuffer2.length() > 0) {
            StringBuffer stringBuffer3 = stringBuffer2;
            for (int i = 0; stringBuffer3.length() > i && stringBuffer2.charAt(i) == ' '; i += 2) {
                StringBuffer stringBuffer4 = stringBuffer2;
                stringBuffer3 = stringBuffer4;
                int n5 = i;
                stringBuffer4.insert(n5, "\\");
            }
        }
        int n6 = n = stringBuffer2.length() - 1;
        while (n6 >= 0 && stringBuffer2.charAt(n) == ' ') {
            stringBuffer2.insert(n--, '\\');
            n6 = n;
        }
        return stringBuffer2.toString();
    }

    public static String cfr_renamed_4457(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        if (arg0.length() != 0) {
            char c = arg0.charAt(0);
            stringBuffer.append(c);
            int n = 1;
            int n2 = n;
            while (n2 < arg0.length()) {
                char c2 = arg0.charAt(n);
                if (c != ' ' || c2 != ' ') {
                    stringBuffer.append(c2);
                }
                c = c2;
                n2 = ++n;
            }
        }
        return stringBuffer.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cfr_renamed_4551(sprnke arg0, sprnke arg1) {
        if (arg0.cfr_renamed_4539()) {
            int n;
            sprqge[] sprqgeArray;
            if (!arg1.cfr_renamed_4539()) return false;
            sprqge[] sprqgeArray2 = arg0.cfr_renamed_4540();
            if (sprqgeArray2.length != (sprqgeArray = arg1.cfr_renamed_4540()).length) {
                return false;
            }
            int n2 = n = 0;
            while (n2 != sprqgeArray2.length) {
                if (!sprzzd.cfr_renamed_4552(sprqgeArray2[n], sprqgeArray[n])) {
                    return false;
                }
                n2 = ++n;
            }
            return true;
        } else {
            if (arg1.cfr_renamed_4539()) return false;
            return sprzzd.cfr_renamed_4552(arg0.cfr_renamed_4541(), arg1.cfr_renamed_4541());
        }
    }

    private static /* synthetic */ String[] cfr_renamed_4553(Vector arg0) {
        int n;
        String[] stringArray = new String[arg0.size()];
        int n2 = n = 0;
        while (n2 != stringArray.length) {
            int n3 = n++;
            stringArray[n3] = (String)arg0.elementAt(n3);
            n2 = n;
        }
        return stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvva cfr_renamed_4450(String arg0) {
        try {
            return sprvva.cfr_renamed_184(sprmma.cfr_renamed_488(arg0.substring(1)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprjyk.cfr_renamed_9("5@+@/Y.\u000e%@#A$G.I`G.\u000e.O-Kz\u000e")).append(iOException).toString());
        }
    }

    public static String[] cfr_renamed_4547(sprtzd arg0, Hashtable arg1) {
        int n = 0;
        String[] stringArray = arg1.elements();
        block0: while (true) {
            String[] stringArray2 = stringArray;
            while (stringArray2.hasMoreElements()) {
                if (!arg0.equals(stringArray.nextElement())) continue block0;
                stringArray2 = stringArray;
                ++n;
            }
            break;
        }
        stringArray = new String[n];
        n = 0;
        Enumeration enumeration = arg1.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (!arg0.equals(arg1.get(string))) continue;
            stringArray[n++] = string;
        }
        return stringArray;
    }

    public static String cfr_renamed_4456(String arg0) {
        sprvva sprvva2;
        String string = sprywa.cfr_renamed_425(arg0.trim());
        if (string.length() > 0 && string.charAt(0) == '#' && (sprvva2 = sprzzd.cfr_renamed_4450(string)) instanceof sprx) {
            string = sprywa.cfr_renamed_425(((sprx)((Object)sprvva2)).cfr_renamed_314().trim());
        }
        string = sprzzd.cfr_renamed_4457(string);
        return string;
    }

    private static /* synthetic */ sprtzd[] cfr_renamed_4554(Vector arg0) {
        int n;
        sprtzd[] sprtzdArray = new sprtzd[arg0.size()];
        int n2 = n = 0;
        while (n2 != sprtzdArray.length) {
            int n3 = n++;
            sprtzdArray[n3] = (sprtzd)arg0.elementAt(n3);
            n2 = n;
        }
        return sprtzdArray;
    }

    public static spra cfr_renamed_4555(String arg0, int arg1) throws IOException {
        int n;
        byte[] byArray = new byte[(arg0.length() - arg1) / 2];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            String string = arg0;
            char c = string.charAt(n * 2 + arg1);
            char c2 = string.charAt(n * 2 + arg1 + 1);
            byArray[n++] = (byte)(sprzzd.cfr_renamed_4556(c) << 4 | sprzzd.cfr_renamed_4556(c2));
            n2 = n;
        }
        return sprvva.cfr_renamed_184(byArray);
    }

    public static sprtzd cfr_renamed_4546(String arg0, Hashtable arg1) {
        if (sprywa.cfr_renamed_116(arg0).startsWith(sprbcca.cfr_renamed_9("\u001aP\u00117"))) {
            return new sprtzd(arg0.substring(4));
        }
        if (arg0.charAt(0) >= '0' && arg0.charAt(0) <= '9') {
            return new sprtzd(arg0);
        }
        sprtzd sprtzd2 = (sprtzd)arg1.get(sprywa.cfr_renamed_425(arg0));
        if (sprtzd2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyk.cfr_renamed_9("\u0015@+@/Y.\u000e/L*K#Z`G$\u000em\u000e")).append(arg0).append(sprbcca.cfr_renamed_9("9x9%x&j0}um:91p&m<w2l<j=|19;x8|")).toString());
        }
        return sprtzd2;
    }

    public static void cfr_renamed_4548(StringBuffer arg0, sprnke arg1, Hashtable arg2) {
        if (arg1.cfr_renamed_4539()) {
            int n;
            sprqge[] sprqgeArray = arg1.cfr_renamed_4540();
            boolean bl = true;
            int n2 = n = 0;
            while (n2 != sprqgeArray.length) {
                StringBuffer stringBuffer;
                if (bl) {
                    bl = false;
                    stringBuffer = arg0;
                } else {
                    StringBuffer stringBuffer2 = arg0;
                    stringBuffer = stringBuffer2;
                    stringBuffer2.append('+');
                }
                sprzzd.cfr_renamed_4557(stringBuffer, sprqgeArray[n++], arg2);
                n2 = n;
            }
        } else {
            sprzzd.cfr_renamed_4557(arg0, arg1.cfr_renamed_4541(), arg2);
        }
    }

    private static /* synthetic */ boolean cfr_renamed_4552(sprqge arg0, sprqge arg1) {
        String string;
        sprtzd sprtzd2;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (arg1 == null) {
            return false;
        }
        sprtzd sprtzd3 = arg0.cfr_renamed_324();
        if (!sprtzd3.equals(sprtzd2 = arg1.cfr_renamed_324())) {
            return false;
        }
        String string2 = sprzzd.cfr_renamed_4456(sprzzd.cfr_renamed_4550(arg0.cfr_renamed_97()));
        return string2.equals(string = sprzzd.cfr_renamed_4456(sprzzd.cfr_renamed_4550(arg1.cfr_renamed_97())));
    }

    private static /* synthetic */ int cfr_renamed_4556(char arg0) {
        if ('0' <= arg0 && arg0 <= '9') {
            return arg0 - 48;
        }
        if ('a' <= arg0 && arg0 <= 'f') {
            return arg0 - 97 + 10;
        }
        return arg0 - 65 + 10;
    }

    public static sprnke[] cfr_renamed_4545(String arg0, sprok arg1) {
        spribe spribe2 = new spribe(arg0);
        sprvfe sprvfe2 = new sprvfe(arg1);
        while (spribe2.cfr_renamed_4444()) {
            Object object;
            String string;
            Object object2;
            spribe spribe3;
            String string2 = spribe2.cfr_renamed_4445();
            if (string2.indexOf(43) > 0) {
                spribe3 = new spribe(string2, '+');
                object2 = new spribe(spribe3.cfr_renamed_4445(), '=');
                string = ((spribe)object2).cfr_renamed_4445();
                if (!((spribe)object2).cfr_renamed_4444()) {
                    throw new IllegalArgumentException(sprjyk.cfr_renamed_9("\"O$B9\u000e&A2C!Z4K$\u000e$G2K#Z/\\9\u000e3Z2G.I"));
                }
                object = ((spribe)object2).cfr_renamed_4445();
                sprtzd sprtzd2 = arg1.cfr_renamed_4531(string.trim());
                if (spribe3.cfr_renamed_4444()) {
                    Vector<sprtzd> vector = new Vector<sprtzd>();
                    Vector<String> vector2 = new Vector<String>();
                    spribe spribe4 = spribe3;
                    vector.addElement(sprtzd2);
                    vector2.addElement(sprzzd.cfr_renamed_4455((String)object));
                    while (spribe4.cfr_renamed_4444()) {
                        object2 = new spribe(spribe3.cfr_renamed_4445(), '=');
                        string = ((spribe)object2).cfr_renamed_4445();
                        if (!((spribe)object2).cfr_renamed_4444()) {
                            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("7x1u,93v't4m!|191p'|6m:k,9&m'p;~"));
                        }
                        object = ((spribe)object2).cfr_renamed_4445();
                        sprtzd2 = arg1.cfr_renamed_4531(string.trim());
                        spribe4 = spribe3;
                        vector.addElement(sprtzd2);
                        vector2.addElement(sprzzd.cfr_renamed_4455((String)object));
                    }
                    sprvfe2.cfr_renamed_4535(sprzzd.cfr_renamed_4554(vector), sprzzd.cfr_renamed_4553(vector2));
                    continue;
                }
                sprvfe2.cfr_renamed_4533(sprtzd2, sprzzd.cfr_renamed_4455((String)object));
                continue;
            }
            spribe3 = new spribe(string2, '=');
            object2 = spribe3.cfr_renamed_4445();
            if (!spribe3.cfr_renamed_4444()) {
                throw new IllegalArgumentException(sprjyk.cfr_renamed_9("\"O$B9\u000e&A2C!Z4K$\u000e$G2K#Z/\\9\u000e3Z2G.I"));
            }
            string = spribe3.cfr_renamed_4445();
            object = arg1.cfr_renamed_4531(((String)object2).trim());
            sprvfe2.cfr_renamed_4533((sprtzd)object, sprzzd.cfr_renamed_4455(string));
        }
        return sprvfe2.cfr_renamed_1451().cfr_renamed_4544();
    }

    private static /* synthetic */ String cfr_renamed_4455(String arg0) {
        int n;
        if (arg0.length() == 0 || arg0.indexOf(92) < 0 && arg0.indexOf(34) < 0) {
            return arg0.trim();
        }
        char[] cArray = arg0.toCharArray();
        boolean bl = false;
        boolean bl2 = false;
        StringBuffer stringBuffer = new StringBuffer(arg0.length());
        int n2 = 0;
        if (cArray[0] == '\\' && cArray[1] == '#') {
            n2 = 2;
            stringBuffer.append(sprbcca.cfr_renamed_9("\t:"));
        }
        boolean bl3 = false;
        int n3 = 0;
        char c = '\u0000';
        int n4 = n = n2;
        while (n4 != cArray.length) {
            char c2 = cArray[n];
            if (c2 != ' ') {
                bl3 = true;
            }
            if (c2 == '\"') {
                if (!bl) {
                    bl2 = !bl2;
                } else {
                    stringBuffer.append(c2);
                }
                bl = false;
            } else if (c2 == '\\' && !bl && !bl2) {
                bl = true;
                n3 = stringBuffer.length();
            } else if (c2 != ' ' || bl || bl3) {
                if (bl && sprzzd.cfr_renamed_4558(c2)) {
                    if (c != '\u0000') {
                        stringBuffer.append((char)(sprzzd.cfr_renamed_4556(c) * 16 + sprzzd.cfr_renamed_4556(c2)));
                        bl = false;
                        c = '\u0000';
                    } else {
                        c = c2;
                    }
                } else {
                    stringBuffer.append(c2);
                    bl = false;
                }
            }
            n4 = ++n;
        }
        if (stringBuffer.length() > 0) {
            StringBuffer stringBuffer2 = stringBuffer;
            while (stringBuffer2.charAt(stringBuffer.length() - 1) == ' ' && n3 != stringBuffer.length() - 1) {
                StringBuffer stringBuffer3 = stringBuffer;
                stringBuffer2 = stringBuffer3;
                stringBuffer3.setLength(stringBuffer3.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static void cfr_renamed_4557(StringBuffer arg0, sprqge arg1, Hashtable arg2) {
        StringBuffer stringBuffer;
        String string = (String)arg2.get(arg1.cfr_renamed_324());
        if (string != null) {
            StringBuffer stringBuffer2 = arg0;
            stringBuffer = stringBuffer2;
            stringBuffer2.append(string);
        } else {
            StringBuffer stringBuffer3 = arg0;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(arg1.cfr_renamed_324().cfr_renamed_19());
        }
        stringBuffer.append('=');
        arg0.append(sprzzd.cfr_renamed_4550(arg1.cfr_renamed_97()));
    }

    private static /* synthetic */ boolean cfr_renamed_4558(char arg0) {
        return '0' <= arg0 && arg0 <= '9' || 'a' <= arg0 && arg0 <= 'f' || 'A' <= arg0 && arg0 <= 'F';
    }

    private static /* synthetic */ String cfr_renamed_4451(byte[] arg0) {
        int n;
        char[] cArray = new char[arg0.length];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            int n3 = n++;
            cArray[n3] = (char)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return new String(cArray);
    }
}

