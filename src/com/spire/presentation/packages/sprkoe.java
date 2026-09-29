/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfme;
import com.spire.presentation.packages.sprjse;
import com.spire.presentation.packages.sprnvz;
import com.spire.presentation.packages.sprqne;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprwi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.util.Vector;

public final class sprkoe {
    private static String cfr_renamed_4;

    public static char[] cfr_renamed_430(byte[] arg0) {
        int n;
        char[] cArray = new char[arg0.length];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            int n3 = n++;
            cArray[n3] = (char)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return cArray;
    }

    public static void cfr_renamed_426(char[] arg0, OutputStream arg1) throws IOException {
        int n;
        char[] cArray = arg0;
        int n2 = n = 0;
        while (n2 < cArray.length) {
            char c = cArray[n];
            if (c < '\u0080') {
                arg1.write(c);
            } else if (c < '\u0800') {
                OutputStream outputStream = arg1;
                outputStream.write(0xC0 | c >> 6);
                outputStream.write(0x80 | c & 0x3F);
            } else if (c >= '\ud800' && c <= '\udfff') {
                if (n + 1 >= cArray.length) {
                    throw new IllegalStateException(sprnvz.cfr_renamed_9("( 7/-'%n\u0014\u001a\u0007cpxa-.*$>.'/:"));
                }
                char c2 = c;
                char c3 = c = cArray[++n];
                if (c2 > '\udbff') {
                    throw new IllegalStateException(sprrnm.cfr_renamed_9("pvoyuq}8LL_5(.9{v||hvqwl"));
                }
                int n3 = ((c2 & 0x3FF) << 10 | c3 & 0x3FF) + 65536;
                OutputStream outputStream = arg1;
                OutputStream outputStream2 = arg1;
                outputStream2.write(0xF0 | n3 >> 18);
                outputStream2.write(0x80 | n3 >> 12 & 0x3F);
                outputStream.write(0x80 | n3 >> 6 & 0x3F);
                outputStream.write(0x80 | n3 & 0x3F);
            } else {
                OutputStream outputStream = arg1;
                outputStream.write(0xE0 | c >> 12);
                outputStream.write(0x80 | c >> 6 & 0x3F);
                arg1.write(0x80 | c & 0x3F);
            }
            n2 = ++n;
        }
    }

    public static String[] cfr_renamed_434(String arg0, char arg1) {
        int n;
        Vector<String> vector = new Vector<String>();
        boolean bl = true;
        while (bl) {
            int n2 = arg0.indexOf(arg1);
            if (n2 > 0) {
                String string = arg0;
                String string2 = string.substring(0, n2);
                vector.addElement(string2);
                arg0 = string.substring(n2 + 1);
                continue;
            }
            bl = false;
            vector.addElement(arg0);
        }
        String[] stringArray = new String[vector.size()];
        int n3 = n = 0;
        while (n3 != stringArray.length) {
            int n4 = n++;
            stringArray[n4] = (String)vector.elementAt(n4);
            n3 = n;
        }
        return stringArray;
    }

    public static sprwi cfr_renamed_5145() {
        return new sprfme(null);
    }

    public static byte[] cfr_renamed_431(String arg0) {
        return sprkoe.cfr_renamed_432(arg0.toCharArray());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_432(char[] arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            sprkoe.cfr_renamed_426(arg0, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprnvz.cfr_renamed_9("-  /!5n$ \"!%+a=5<( &n5!a,8:$n <3/8o"));
        }
    }

    public static boolean cfr_renamed_5146(String arg0, String arg1) {
        boolean bl = arg0.length() == arg1.length();
        int n = arg0.length();
        if (bl) {
            int n2;
            int n3 = n2 = 0;
            while (n3 != n) {
                bl &= arg0.charAt(n2) == arg1.charAt(n2);
                n3 = ++n2;
            }
        } else {
            int n4;
            int n5 = n4 = 0;
            while (n5 != n) {
                bl &= arg0.charAt(n4) == ' ';
                n5 = ++n4;
            }
        }
        return bl;
    }

    public static String cfr_renamed_116(String arg0) {
        int n;
        boolean bl = false;
        char[] cArray = arg0.toCharArray();
        int n2 = n = 0;
        while (n2 != cArray.length) {
            char c = cArray[n];
            if ('a' <= c && 'z' >= c) {
                bl = true;
                cArray[n] = (char)(c - 97 + 65);
            }
            n2 = ++n;
        }
        if (bl) {
            return new String(cArray);
        }
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        try {
            cfr_renamed_4 = AccessController.doPrivileged(new sprjse());
            return;
        }
        catch (Exception exception) {
            try {
                cfr_renamed_4 = String.format(sprrnm.cfr_renamed_9("<v"), new Object[0]);
                return;
            }
            catch (Exception exception2) {
                cfr_renamed_4 = "\n";
                return;
            }
        }
    }

    public static String cfr_renamed_427(byte[] arg0) {
        char[] cArray = new char[arg0.length];
        int n = sprqne.cfr_renamed_5147(arg0, cArray);
        if (n < 0) {
            throw new IllegalArgumentException(sprnvz.cfr_renamed_9("\u0007/8 \"(*a\u001b\u0015\blva'/>4:"));
        }
        return new String(cArray, 0, n);
    }

    public static String cfr_renamed_184(byte[] arg0) {
        return new String(sprkoe.cfr_renamed_430(arg0));
    }

    public static byte[] cfr_renamed_433(String arg0) {
        int n;
        byte[] byArray = new byte[arg0.length()];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            char c = arg0.charAt(n);
            byArray[n++] = (byte)c;
            n2 = n;
        }
        return byArray;
    }

    public static int cfr_renamed_428(String arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = arg0.length();
        int n3 = n = 0;
        while (n3 < n2) {
            char c = arg0.charAt(n);
            int n4 = arg2 + n;
            arg1[n4] = (byte)c;
            n3 = ++n;
        }
        return n2;
    }

    public static String cfr_renamed_425(String arg0) {
        int n;
        boolean bl = false;
        char[] cArray = arg0.toCharArray();
        int n2 = n = 0;
        while (n2 != cArray.length) {
            char c = cArray[n];
            if ('A' <= c && 'Z' >= c) {
                bl = true;
                cArray[n] = (char)(c - 65 + 97);
            }
            n2 = ++n;
        }
        if (bl) {
            return new String(cArray);
        }
        return arg0;
    }

    public static String cfr_renamed_5114() {
        return cfr_renamed_4;
    }

    public static byte[] cfr_renamed_429(char[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public static String cfr_renamed_5148(byte[] arg0, int arg1, int arg2) {
        char[] cArray = new char[arg2];
        int n = sprqne.cfr_renamed_5149(arg0, arg1, arg2, cArray);
        if (n < 0) {
            throw new IllegalArgumentException(sprrnm.cfr_renamed_9("Qwnxtp|9MM^4 9qwhll"));
        }
        return new String(cArray, 0, n);
    }
}

