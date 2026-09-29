/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public final class sprnta {
    private static final char[] cfr_renamed_4;

    public static byte[] cfr_renamed_1108(byte[] byArray, int n) {
        byte[] arg0;
        return sprnta.cfr_renamed_1109(arg0, n, arg0.length);
    }

    public static boolean cfr_renamed_1110(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == null) {
            return arg1 == null;
        }
        if (arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            bl &= arg0[n] == arg1[n];
            n2 = --n;
        }
        return bl;
    }

    public static byte[] cfr_renamed_1109(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2 - arg1];
        System.arraycopy(arg0, arg1, byArray, 0, arg2 - arg1);
        return byArray;
    }

    public static String cfr_renamed_1111(byte[] arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            byte by = arg0[n];
            int n4 = n3 = 0;
            while (n4 < 8) {
                int n5 = by >>> n3 & 1;
                string = new StringBuilder().insert(0, string).append(n5).toString();
                n4 = ++n3;
            }
            if (n != arg0.length - 1) {
                string = new StringBuilder().insert(0, string).append(" ").toString();
            }
            n2 = ++n;
        }
        return string;
    }

    public static byte[] cfr_renamed_543(byte[] arg0, byte[] arg1) {
        byte[] byArray = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
        return byArray;
    }

    public static char[] cfr_renamed_1112(byte[] arg0) {
        int n;
        char[] cArray = new char[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            cArray[n3] = (char)arg0[n3];
            n2 = n;
        }
        return cArray;
    }

    public static int cfr_renamed_1113(byte[][][] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            byte[][] byArray = arg0[n];
            n2 = 31 * n2 + sprnta.cfr_renamed_1114(byArray);
            n3 = ++n;
        }
        return n2;
    }

    public static byte[] cfr_renamed_158(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        byte[] byArray = new byte[arg0.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        return byArray;
    }

    public static boolean cfr_renamed_1115(byte[][][] arg0, byte[][][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            if (arg0[n].length != arg1[n].length) {
                return false;
            }
            int n3 = arg0[n].length - 1;
            while (n3 >= 0) {
                int n4;
                byte[] byArray = arg0[n][n4];
                byte[] byArray2 = arg1[n][n4];
                bl &= sprnta.cfr_renamed_1110(byArray, byArray2);
                n3 = --n4;
            }
            n2 = --n;
        }
        return bl;
    }

    public static int cfr_renamed_1114(byte[][] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            byte[] byArray = arg0[n];
            n2 = 31 * n2 + sprnta.cfr_renamed_1116(byArray);
            n3 = ++n;
        }
        return n2;
    }

    static {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 97;
        cArray[11] = 98;
        cArray[12] = 99;
        cArray[13] = 100;
        cArray[14] = 101;
        cArray[15] = 102;
        cfr_renamed_4 = cArray;
    }

    public static String cfr_renamed_1117(byte[] arg0, String arg1, String arg2) {
        int n;
        String string = new String(arg1);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            string = new StringBuilder().insert(0, string).append(cfr_renamed_4[arg0[n] >>> 4 & 0xF]).toString();
            string = new StringBuilder().insert(0, string).append(cfr_renamed_4[arg0[n] & 0xF]).toString();
            if (n < arg0.length - 1) {
                string = new StringBuilder().insert(0, string).append(arg2).toString();
            }
            n2 = ++n;
        }
        return string;
    }

    public static int cfr_renamed_1116(byte[] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            n2 = 31 * n2 + arg0[n++];
            n3 = n;
        }
        return n2;
    }

    public static String cfr_renamed_503(byte[] arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length) {
            string = new StringBuilder().insert(0, string).append(cfr_renamed_4[arg0[n] >>> 4 & 0xF]).toString();
            char c = cfr_renamed_4[arg0[n] & 0xF];
            string = new StringBuilder().insert(0, string).append(c).toString();
            n2 = ++n;
        }
        return string;
    }

    public static byte[] cfr_renamed_1118(String arg0) {
        int n;
        int n2;
        char[] cArray = arg0.toUpperCase().toCharArray();
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 < cArray.length) {
            if (cArray[n2] >= '0' && cArray[n2] <= '9' || cArray[n2] >= 'A' && cArray[n2] <= 'F') {
                ++n3;
            }
            n4 = ++n2;
        }
        byte[] byArray = new byte[n3 + 1 >> 1];
        int n5 = n3 & 1;
        int n6 = n = 0;
        while (n6 < cArray.length) {
            block8: {
                block7: {
                    block6: {
                        if (cArray[n] < '0' || cArray[n] > '9') break block6;
                        byte[] byArray2 = byArray;
                        byte[] byArray3 = byArray;
                        int n7 = n5 >> 1;
                        byArray2[n7] = (byte)(byArray2[n7] << 4);
                        int n8 = n5 >> 1;
                        byArray3[n8] = (byte)(byArray3[n8] | cArray[n] - 48);
                        break block7;
                    }
                    if (cArray[n] < 'A' || cArray[n] > 'F') break block8;
                    byte[] byArray4 = byArray;
                    byte[] byArray5 = byArray;
                    int n9 = n5 >> 1;
                    byArray4[n9] = (byte)(byArray4[n9] << 4);
                    int n10 = n5 >> 1;
                    byArray5[n10] = (byte)(byArray5[n10] | cArray[n] - 65 + 10);
                }
                ++n5;
            }
            n6 = ++n;
        }
        return byArray;
    }

    public static boolean cfr_renamed_1119(byte[][] arg0, byte[][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            byte[] byArray = arg0[n];
            byte[] byArray2 = arg1[n];
            bl &= sprnta.cfr_renamed_1110(byArray, byArray2);
            n2 = --n;
        }
        return bl;
    }

    private /* synthetic */ sprnta() {
    }

    public static byte[] cfr_renamed_1120(byte[][] arg0) {
        int n;
        int n2 = arg0[0].length;
        byte[] byArray = new byte[arg0.length * n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg0.length) {
            System.arraycopy(arg0[n], 0, byArray, n3, n2);
            n3 += n2;
            n4 = ++n;
        }
        return byArray;
    }

    public static byte[][] cfr_renamed_1121(byte[] arg0, int arg1) throws ArrayIndexOutOfBoundsException {
        if (arg1 > arg0.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[arg1];
        byArrayArray[1] = new byte[arg0.length - arg1];
        System.arraycopy(arg0, 0, byArrayArray[0], 0, arg1);
        System.arraycopy(arg0, arg1, byArrayArray[1], 0, arg0.length - arg1);
        return byArrayArray;
    }

    public static byte[] cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            byte by = (byte)(arg0[n] ^ arg1[n3]);
            byArray[n3] = by;
            n2 = --n;
        }
        return byArray;
    }
}

