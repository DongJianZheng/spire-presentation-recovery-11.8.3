/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprihf {
    public static boolean cfr_renamed_1263(short[][][] arg0, short[][][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            short[][] sArray = arg0[n];
            short[][] sArray2 = arg1[n];
            bl &= sprihf.cfr_renamed_1230(sArray, sArray2);
            n2 = --n;
        }
        return bl;
    }

    public static byte[][] cfr_renamed_1267(short[][] arg0) {
        int n;
        byte[][] byArray = new byte[arg0.length][arg0[0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5 = n3++;
                byArray[n][n5] = (byte)arg0[n][n5];
                n4 = n3;
            }
            n2 = ++n;
        }
        return byArray;
    }

    public static int[] cfr_renamed_1265(byte[] arg0) {
        int n;
        int[] nArray = new int[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            nArray[n3] = arg0[n3] & 0xFF;
            n2 = n;
        }
        return nArray;
    }

    public static byte[] cfr_renamed_1270(short[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public static short[] cfr_renamed_1271(byte[] arg0) {
        int n;
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            sArray[n3] = (short)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return sArray;
    }

    public static short[][] cfr_renamed_1266(byte[][] arg0) {
        int n;
        short[][] sArray = new short[arg0.length][arg0[0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5 = n3++;
                sArray[n][n5] = (short)(arg0[n][n5] & 0xFF);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public static byte[][][] cfr_renamed_1269(short[][][] arg0) {
        int n;
        byte[][][] byArray = new byte[arg0.length][arg0[0].length][arg0[0][0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg0[0][0].length) {
                    int n7 = n5++;
                    byArray[n][n3][n7] = (byte)arg0[n][n3][n7];
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return byArray;
    }

    public static byte[] cfr_renamed_1268(int[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public static boolean cfr_renamed_1230(short[][] arg0, short[][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            short[] sArray = arg0[n];
            short[] sArray2 = arg1[n];
            bl &= sprihf.cfr_renamed_1231(sArray, sArray2);
            n2 = --n;
        }
        return bl;
    }

    public static short[][][] cfr_renamed_1264(byte[][][] arg0) {
        int n;
        short[][][] sArray = new short[arg0.length][arg0[0].length][arg0[0][0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg0[0][0].length) {
                    int n7 = n5++;
                    sArray[n][n3][n7] = (short)(arg0[n][n3][n7] & 0xFF);
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public static boolean cfr_renamed_1231(short[] arg0, short[] arg1) {
        int n;
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
}

