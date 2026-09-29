/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprywj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public final class sprywa {
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 2 << 3 ^ (2 ^ 5);
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
                    throw new IllegalStateException(sprlsa.cfr_renamed_9("*,5#/+'b\u0016\u0016\u0005ortc!,&&2,+-6"));
                }
                char c2 = c;
                char c3 = c = cArray[++n];
                if (c2 > '\udbff') {
                    throw new IllegalStateException(sprywj.cfr_renamed_9("u\u0004j\u000bp\u0003xJI>ZG-\\<\ts\u000ey\u001as\u0003r\u001e"));
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

    public static String cfr_renamed_427(byte[] arg0) {
        int n = 0;
        int n2 = 0;
        int n3 = n;
        while (n3 < arg0.length) {
            ++n2;
            if ((arg0[n] & 0xF0) == 240) {
                n3 = n += 4;
                ++n2;
                continue;
            }
            if ((arg0[n] & 0xE0) == 224) {
                n3 = n += 3;
                continue;
            }
            if ((arg0[n] & 0xC0) == 192) {
                n3 = n += 2;
                continue;
            }
            n3 = ++n;
        }
        char[] cArray = new char[n2];
        n = 0;
        n2 = 0;
        int n4 = n;
        while (n4 < arg0.length) {
            char c;
            char[] cArray2;
            if ((arg0[n] & 0xF0) == 240) {
                cArray2 = cArray;
                int n5 = ((arg0[n] & 3) << 18 | (arg0[n + 1] & 0x3F) << 12 | (arg0[n + 2] & 0x3F) << 6 | arg0[n + 3] & 0x3F) - 65536;
                char c2 = (char)(0xD800 | n5 >> 10);
                char c3 = (char)(0xDC00 | n5 & 0x3FF);
                int n6 = n2++;
                n += 4;
                cArray[n6] = c2;
                c = c3;
            } else if ((arg0[n] & 0xE0) == 224) {
                cArray2 = cArray;
                int n7 = (arg0[n] & 0xF) << 12 | (arg0[n + 1] & 0x3F) << 6;
                int n8 = arg0[n + 2] & 0x3F;
                n += 3;
                c = (char)(n7 | n8);
            } else if ((arg0[n] & 0xD0) == 208) {
                cArray2 = cArray;
                int n9 = (arg0[n] & 0x1F) << 6;
                int n10 = arg0[n + 1] & 0x3F;
                n += 2;
                c = (char)(n9 | n10);
            } else if ((arg0[n] & 0xC0) == 192) {
                cArray2 = cArray;
                int n11 = (arg0[n] & 0x1F) << 6;
                int n12 = arg0[n + 1] & 0x3F;
                n += 2;
                c = (char)(n11 | n12);
            } else {
                byte by = arg0[n];
                c = (char)(by & 0xFF);
                cArray2 = cArray;
            }
            cArray2[n2++] = c;
            n4 = ++n;
        }
        return new String(cArray);
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

    public static String cfr_renamed_184(byte[] arg0) {
        return new String(sprywa.cfr_renamed_430(arg0));
    }

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

    public static byte[] cfr_renamed_431(String arg0) {
        return sprywa.cfr_renamed_432(arg0.toCharArray());
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_432(char[] arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            sprywa.cfr_renamed_426(arg0, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprlsa.cfr_renamed_9("!\",--7b&, -''c170*,$b7-c :6&b\"01#:c"));
        }
    }
}

