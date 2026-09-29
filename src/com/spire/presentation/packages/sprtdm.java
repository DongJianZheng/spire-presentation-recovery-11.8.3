/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprian;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprljm;
import com.spire.presentation.packages.sprmem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprrle;
import com.spire.presentation.packages.sprsjm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjm;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprtdm {
    public static String cfr_renamed_4457(String arg0) {
        if (arg0.indexOf("  ") < 0) {
            return arg0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char c = arg0.charAt(0);
        stringBuffer.append(c);
        int n = 1;
        int n2 = n;
        while (n2 < arg0.length()) {
            char c2 = arg0.charAt(n);
            if (c != ' ' || c2 != ' ') {
                stringBuffer.append(c2);
                c = c2;
            }
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    private static /* synthetic */ boolean cfr_renamed_4558(char arg0) {
        return '0' <= arg0 && arg0 <= '9' || 'a' <= arg0 && arg0 <= 'f' || 'A' <= arg0 && arg0 <= 'F';
    }

    public static String cfr_renamed_4456(String arg0) {
        int n;
        sprxgf sprxgf2;
        if (arg0.length() > 0 && arg0.charAt(0) == '#' && (sprxgf2 = sprtdm.cfr_renamed_4450(arg0)) instanceof sprml) {
            arg0 = ((sprml)((Object)sprxgf2)).cfr_renamed_314();
        }
        if ((n = (arg0 = sprkoe.cfr_renamed_425(arg0)).length()) < 2) {
            return arg0;
        }
        int n2 = 0;
        int n3 = n - 1;
        int n4 = n2;
        while (n4 < n3 && arg0.charAt(n2) == '\\' && arg0.charAt(n2 + 1) == ' ') {
            n4 = n2 += 2;
        }
        int n5 = n3;
        int n6 = n2 + 1;
        int n7 = n5;
        while (n7 > n6 && arg0.charAt(n5 - 1) == '\\' && arg0.charAt(n5) == ' ') {
            n7 = n5 -= 2;
        }
        if (n2 > 0 || n5 < n3) {
            arg0 = arg0.substring(n2, n5 + 1);
        }
        return sprtdm.cfr_renamed_4457(arg0);
    }

    public static sprlem cfr_renamed_4546(String arg0, Hashtable arg1) {
        if (sprkoe.cfr_renamed_116(arg0).startsWith(sprrle.cfr_renamed_9("(>#Y"))) {
            return new sprlem(arg0.substring(4));
        }
        if (arg0.charAt(0) >= '0' && arg0.charAt(0) <= '9') {
            return new sprlem(arg0);
        }
        sprlem sprlem2 = (sprlem)arg1.get(sprkoe.cfr_renamed_425(arg0));
        if (sprlem2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjuaa.cfr_renamed_9("&,\u0018,\u001c5\u001db\u001c \u0019'\u00106S+\u0017b^b")).append(arg0).append(sprrle.cfr_renamed_9("WJW\u0017\u0016\u0014\u0004\u0002\u0013G\u0003\bW\u0003\u001e\u0014\u0003\u000e\u0019\u0000\u0002\u000e\u0004\u000f\u0012\u0003W\t\u0016\n\u0012")).toString());
        }
        return sprlem2;
    }

    public static String[] cfr_renamed_11172(sprlem arg0, Hashtable arg1) {
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

    private static /* synthetic */ int cfr_renamed_4556(char arg0) {
        if ('0' <= arg0 && arg0 <= '9') {
            return arg0 - 48;
        }
        if ('a' <= arg0 && arg0 <= 'f') {
            return arg0 - 97 + 10;
        }
        return arg0 - 65 + 10;
    }

    public static void cfr_renamed_11171(StringBuffer arg0, sprxjm arg1, Hashtable arg2) {
        if (arg1.cfr_renamed_4539()) {
            int n;
            sprmem[] sprmemArray = arg1.cfr_renamed_4540();
            boolean bl = true;
            int n2 = n = 0;
            while (n2 != sprmemArray.length) {
                StringBuffer stringBuffer;
                if (bl) {
                    bl = false;
                    stringBuffer = arg0;
                } else {
                    StringBuffer stringBuffer2 = arg0;
                    stringBuffer = stringBuffer2;
                    stringBuffer2.append('+');
                }
                sprtdm.cfr_renamed_11174(stringBuffer, sprmemArray[n++], arg2);
                n2 = n;
            }
        } else if (arg1.cfr_renamed_4541() != null) {
            sprtdm.cfr_renamed_11174(arg0, arg1.cfr_renamed_4541(), arg2);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
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

    private static /* synthetic */ boolean cfr_renamed_11175(sprmem arg0, sprmem arg1) {
        String string;
        sprlem sprlem2;
        if (arg0 == arg1) {
            return true;
        }
        if (null == arg0 || null == arg1) {
            return false;
        }
        sprlem sprlem3 = arg0.cfr_renamed_324();
        if (!sprlem3.cfr_renamed_5078(sprlem2 = arg1.cfr_renamed_324())) {
            return false;
        }
        String string2 = sprtdm.cfr_renamed_11176(arg0.cfr_renamed_97());
        return string2.equals(string = sprtdm.cfr_renamed_11176(arg1.cfr_renamed_97()));
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
            stringBuffer.append(sprjuaa.cfr_renamed_9("/a"));
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
                if (bl && sprtdm.cfr_renamed_4558(c2)) {
                    if (c != '\u0000') {
                        stringBuffer.append((char)(sprtdm.cfr_renamed_4556(c) * 16 + sprtdm.cfr_renamed_4556(c2)));
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

    public static String cfr_renamed_11176(sprco arg0) {
        return sprtdm.cfr_renamed_4456(sprtdm.cfr_renamed_11177(arg0));
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

    public static sprxjm[] cfr_renamed_11170(String arg0, spruu arg1) {
        sprsjm sprsjm2 = new sprsjm(arg0);
        sprljm sprljm2 = new sprljm(arg1);
        while (sprsjm2.cfr_renamed_4444()) {
            Object object;
            String string;
            Object object2;
            sprsjm sprsjm3;
            String string2 = sprsjm2.cfr_renamed_4445();
            if (string2.indexOf(43) > 0) {
                sprsjm3 = new sprsjm(string2, '+');
                object2 = new sprsjm(sprsjm3.cfr_renamed_4445(), '=');
                string = ((sprsjm)object2).cfr_renamed_4445();
                if (!((sprsjm)object2).cfr_renamed_4444()) {
                    throw new IllegalArgumentException(sprrle.cfr_renamed_9("\u0005\u0016\u0003\u001b\u001eW\u0001\u0018\u0015\u001a\u0006\u0003\u0013\u0012\u0003W\u0003\u001e\u0015\u0012\u0004\u0003\b\u0005\u001eW\u0014\u0003\u0015\u001e\t\u0010"));
                }
                object = ((sprsjm)object2).cfr_renamed_4445();
                sprlem sprlem2 = arg1.cfr_renamed_4531(string.trim());
                if (sprsjm3.cfr_renamed_4444()) {
                    Vector<sprlem> vector = new Vector<sprlem>();
                    Vector<String> vector2 = new Vector<String>();
                    sprsjm sprsjm4 = sprsjm3;
                    vector.addElement(sprlem2);
                    vector2.addElement(sprtdm.cfr_renamed_4455((String)object));
                    while (sprsjm4.cfr_renamed_4444()) {
                        object2 = new sprsjm(sprsjm3.cfr_renamed_4445(), '=');
                        string = ((sprsjm)object2).cfr_renamed_4445();
                        if (!((sprsjm)object2).cfr_renamed_4444()) {
                            throw new IllegalArgumentException(sprjuaa.cfr_renamed_9("\u0011#\u0017.\nb\u0015-\u0001/\u00126\u0007'\u0017b\u0017+\u0001'\u00106\u001c0\nb\u00006\u0001+\u001d%"));
                        }
                        object = ((sprsjm)object2).cfr_renamed_4445();
                        sprlem2 = arg1.cfr_renamed_4531(string.trim());
                        sprsjm4 = sprsjm3;
                        vector.addElement(sprlem2);
                        vector2.addElement(sprtdm.cfr_renamed_4455((String)object));
                    }
                    sprljm2.cfr_renamed_11161(sprtdm.cfr_renamed_4554(vector), sprtdm.cfr_renamed_4553(vector2));
                    continue;
                }
                sprljm2.cfr_renamed_9498(sprlem2, sprtdm.cfr_renamed_4455((String)object));
                continue;
            }
            sprsjm3 = new sprsjm(string2, '=');
            object2 = sprsjm3.cfr_renamed_4445();
            if (!sprsjm3.cfr_renamed_4444()) {
                throw new IllegalArgumentException(sprrle.cfr_renamed_9("\u0005\u0016\u0003\u001b\u001eW\u0001\u0018\u0015\u001a\u0006\u0003\u0013\u0012\u0003W\u0003\u001e\u0015\u0012\u0004\u0003\b\u0005\u001eW\u0014\u0003\u0015\u001e\t\u0010"));
            }
            string = sprsjm3.cfr_renamed_4445();
            object = arg1.cfr_renamed_4531(((String)object2).trim());
            sprljm2.cfr_renamed_9498((sprlem)object, sprtdm.cfr_renamed_4455(string));
        }
        return sprljm2.cfr_renamed_1451().cfr_renamed_4544();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprxgf cfr_renamed_4450(String arg0) {
        try {
            return sprxgf.cfr_renamed_184(sprfqe.cfr_renamed_5216(arg0, 1, arg0.length() - 1));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprjuaa.cfr_renamed_9("\u0006,\u0018,\u001c5\u001db\u0016,\u0010-\u0017+\u001d%S+\u001db\u001d#\u001e'Ib")).append(iOException).toString());
        }
    }

    public static sprco cfr_renamed_4555(String arg0, int arg1) throws IOException {
        int n;
        byte[] byArray = new byte[(arg0.length() - arg1) / 2];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            String string = arg0;
            char c = string.charAt(n * 2 + arg1);
            char c2 = string.charAt(n * 2 + arg1 + 1);
            byArray[n++] = (byte)(sprtdm.cfr_renamed_4556(c) << 4 | sprtdm.cfr_renamed_4556(c2));
            n2 = n;
        }
        return sprxgf.cfr_renamed_184(byArray);
    }

    private static /* synthetic */ sprlem[] cfr_renamed_4554(Vector arg0) {
        int n;
        sprlem[] sprlemArray = new sprlem[arg0.size()];
        int n2 = n = 0;
        while (n2 != sprlemArray.length) {
            int n3 = n++;
            sprlemArray[n3] = (sprlem)arg0.elementAt(n3);
            n2 = n;
        }
        return sprlemArray;
    }

    public static boolean cfr_renamed_7348(sprxjm arg0, sprxjm arg1) {
        int n;
        sprmem[] sprmemArray;
        if (arg0.cfr_renamed_84() != arg1.cfr_renamed_84()) {
            return false;
        }
        sprmem[] sprmemArray2 = arg0.cfr_renamed_4540();
        if (sprmemArray2.length != (sprmemArray = arg1.cfr_renamed_4540()).length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != sprmemArray2.length) {
            if (!sprtdm.cfr_renamed_11175(sprmemArray2[n], sprmemArray[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String cfr_renamed_11177(sprco arg0) {
        int n;
        int n2;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (arg0 instanceof sprml && !(arg0 instanceof sprian)) {
            String string = ((sprml)((Object)arg0)).cfr_renamed_314();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer2.append('\\');
            }
            StringBuffer stringBuffer3 = stringBuffer2;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(string);
        } else {
            try {
                stringBuffer2.append('#');
                stringBuffer2.append(sprfqe.cfr_renamed_503(arg0.cfr_renamed_119().cfr_renamed_104("DER")));
                stringBuffer = stringBuffer2;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprrle.cfr_renamed_9("8\u0013\u001f\u0002\u0005G\u0001\u0006\u001b\u0012\u0012G\u001f\u0006\u0004G\u0019\bW\u0002\u0019\u0004\u0018\u0003\u0012\u0003W\u0001\u0018\u0015\u001a"));
            }
        }
        int n3 = stringBuffer.length();
        int n4 = 0;
        if (stringBuffer2.length() >= 2 && stringBuffer2.charAt(0) == '\\' && stringBuffer2.charAt(1) == '#') {
            n4 += 2;
        }
        int n5 = n4;
        block5: while (n5 != n3) {
            switch (stringBuffer2.charAt(n4)) {
                case '\"': 
                case '+': 
                case ',': 
                case ';': 
                case '<': 
                case '=': 
                case '>': 
                case '\\': {
                    int n6 = n4;
                    stringBuffer2.insert(n6, "\\");
                    ++n3;
                    n5 = n4 += 2;
                    continue block5;
                }
            }
            n5 = ++n4;
        }
        if (stringBuffer2.length() > 0) {
            StringBuffer stringBuffer4 = stringBuffer2;
            for (n2 = 0; stringBuffer4.length() > n2 && stringBuffer2.charAt(n2) == ' '; n2 += 2) {
                StringBuffer stringBuffer5 = stringBuffer2;
                stringBuffer4 = stringBuffer5;
                int n7 = n2;
                stringBuffer5.insert(n7, "\\");
            }
        }
        int n8 = n = stringBuffer2.length() - 1;
        while (n8 >= n2 && stringBuffer2.charAt(n) == ' ') {
            stringBuffer2.insert(n--, '\\');
            n8 = n;
        }
        return stringBuffer2.toString();
    }

    public static void cfr_renamed_11174(StringBuffer arg0, sprmem arg1, Hashtable arg2) {
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
        arg0.append(sprtdm.cfr_renamed_11177(arg1.cfr_renamed_97()));
    }
}

