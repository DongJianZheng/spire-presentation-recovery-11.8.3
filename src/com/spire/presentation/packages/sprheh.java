/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqlh;

public abstract class sprheh {
    private static final int[] cfr_renamed_1;
    private static final long cfr_renamed_2 = 0xFFFFFFFFL;
    private static final int cfr_renamed_3 = 0xFFFFFFF;
    public static final int cfr_renamed_4 = 16;

    public static void cfr_renamed_8759(int[] arg0) {
        arg0[0] = arg0[0] + 1;
    }

    public static boolean cfr_renamed_8812(int[] arg0, int[] arg1) {
        return 0 != sprheh.cfr_renamed_549(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8720(byte[] byArray, int[] nArray) {
        void arg1;
        byte[] arg0;
        sprheh.cfr_renamed_8864(arg0, 0, (int[])arg1, 0);
        sprheh.cfr_renamed_8864(arg0, 7, (int[])arg1, 2);
        sprheh.cfr_renamed_8864(arg0, 14, (int[])arg1, 4);
        sprheh.cfr_renamed_8864(arg0, 21, (int[])arg1, 6);
        sprheh.cfr_renamed_8864(arg0, 28, (int[])arg1, 8);
        sprheh.cfr_renamed_8864(arg0, 35, (int[])arg1, 10);
        sprheh.cfr_renamed_8864(arg0, 42, (int[])arg1, 12);
        sprheh.cfr_renamed_8864(arg0, 49, (int[])arg1, 14);
    }

    private static /* synthetic */ void cfr_renamed_8865(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n = arg0[arg1 + 0];
        int n2 = arg0[arg1 + 1];
        int n3 = arg0[arg1 + 2];
        int n4 = arg0[arg1 + 3];
        int n5 = arg0[arg1 + 4];
        int n6 = arg0[arg1 + 5];
        int n7 = arg0[arg1 + 6];
        int n8 = arg0[arg1 + 7];
        int n9 = arg3;
        int n10 = arg3;
        arg2[arg3 + 0] = n | n2 << 28;
        arg2[n10 + 1] = n2 >>> 4 | n3 << 24;
        arg2[n10 + 2] = n3 >>> 8 | n4 << 20;
        arg2[arg3 + 3] = n4 >>> 12 | n5 << 16;
        arg2[n9 + 4] = n5 >>> 16 | n6 << 12;
        arg2[n9 + 5] = n6 >>> 20 | n7 << 8;
        arg2[arg3 + 6] = n7 >>> 24 | n8 << 4;
    }

    public static void cfr_renamed_1636(int[] arg0, int[] arg1, int[] arg2) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        int n11 = arg0[10];
        int n12 = arg0[11];
        int n13 = arg0[12];
        int n14 = arg0[13];
        int n15 = arg0[14];
        int n16 = arg0[15];
        int n17 = arg1[0];
        int n18 = arg1[1];
        int n19 = arg1[2];
        int n20 = arg1[3];
        int n21 = arg1[4];
        int n22 = arg1[5];
        int n23 = arg1[6];
        int n24 = arg1[7];
        int n25 = arg1[8];
        int n26 = arg1[9];
        int n27 = arg1[10];
        int n28 = arg1[11];
        int n29 = arg1[12];
        int n30 = arg1[13];
        int n31 = arg1[14];
        int n32 = arg1[15];
        int n33 = n + n9;
        int n34 = n2 + n10;
        int n35 = n3 + n11;
        int n36 = n4 + n12;
        int n37 = n5 + n13;
        int n38 = n6 + n14;
        int n39 = n7 + n15;
        int n40 = n8 + n16;
        int n41 = n17 + n25;
        int n42 = n18 + n26;
        int n43 = n19 + n27;
        int n44 = n20 + n28;
        int n45 = n21 + n29;
        int n46 = n22 + n30;
        int n47 = n23 + n31;
        int n48 = n24 + n32;
        long l = (long)n * (long)n17;
        long l2 = (long)n8 * (long)n18 + (long)n7 * (long)n19 + (long)n6 * (long)n20 + (long)n5 * (long)n21 + (long)n4 * (long)n22 + (long)n3 * (long)n23 + (long)n2 * (long)n24;
        long l3 = (long)n9 * (long)n25;
        long l4 = (long)n16 * (long)n26 + (long)n15 * (long)n27 + (long)n14 * (long)n28 + (long)n13 * (long)n29 + (long)n12 * (long)n30 + (long)n11 * (long)n31 + (long)n10 * (long)n32;
        long l5 = (long)n33 * (long)n41;
        long l6 = (long)n40 * (long)n42 + (long)n39 * (long)n43 + (long)n38 * (long)n44 + (long)n37 * (long)n45 + (long)n36 * (long)n46 + (long)n35 * (long)n47 + (long)n34 * (long)n48;
        long l7 = l + l3 + l6 - l2;
        int n49 = (int)l7 & 0xFFFFFFF;
        l7 >>>= 28;
        long l8 = l4 + l5 - l + l6;
        int n50 = (int)l8 & 0xFFFFFFF;
        l8 >>>= 28;
        long l9 = (long)n2 * (long)n17 + (long)n * (long)n18;
        long l10 = (long)n8 * (long)n19 + (long)n7 * (long)n20 + (long)n6 * (long)n21 + (long)n5 * (long)n22 + (long)n4 * (long)n23 + (long)n3 * (long)n24;
        long l11 = (long)n10 * (long)n25 + (long)n9 * (long)n26;
        long l12 = (long)n16 * (long)n27 + (long)n15 * (long)n28 + (long)n14 * (long)n29 + (long)n13 * (long)n30 + (long)n12 * (long)n31 + (long)n11 * (long)n32;
        long l13 = (long)n34 * (long)n41 + (long)n33 * (long)n42;
        long l14 = (long)n40 * (long)n43 + (long)n39 * (long)n44 + (long)n38 * (long)n45 + (long)n37 * (long)n46 + (long)n36 * (long)n47 + (long)n35 * (long)n48;
        int n51 = (int)(l7 += l9 + l11 + l14 - l10) & 0xFFFFFFF;
        l7 >>>= 28;
        int n52 = (int)(l8 += l12 + l13 - l9 + l14) & 0xFFFFFFF;
        l8 >>>= 28;
        long l15 = (long)n3 * (long)n17 + (long)n2 * (long)n18 + (long)n * (long)n19;
        long l16 = (long)n8 * (long)n20 + (long)n7 * (long)n21 + (long)n6 * (long)n22 + (long)n5 * (long)n23 + (long)n4 * (long)n24;
        long l17 = (long)n11 * (long)n25 + (long)n10 * (long)n26 + (long)n9 * (long)n27;
        long l18 = (long)n16 * (long)n28 + (long)n15 * (long)n29 + (long)n14 * (long)n30 + (long)n13 * (long)n31 + (long)n12 * (long)n32;
        long l19 = (long)n35 * (long)n41 + (long)n34 * (long)n42 + (long)n33 * (long)n43;
        long l20 = (long)n40 * (long)n44 + (long)n39 * (long)n45 + (long)n38 * (long)n46 + (long)n37 * (long)n47 + (long)n36 * (long)n48;
        int n53 = (int)(l7 += l15 + l17 + l20 - l16) & 0xFFFFFFF;
        l7 >>>= 28;
        int n54 = (int)(l8 += l18 + l19 - l15 + l20) & 0xFFFFFFF;
        l8 >>>= 28;
        long l21 = (long)n4 * (long)n17 + (long)n3 * (long)n18 + (long)n2 * (long)n19 + (long)n * (long)n20;
        long l22 = (long)n8 * (long)n21 + (long)n7 * (long)n22 + (long)n6 * (long)n23 + (long)n5 * (long)n24;
        long l23 = (long)n12 * (long)n25 + (long)n11 * (long)n26 + (long)n10 * (long)n27 + (long)n9 * (long)n28;
        long l24 = (long)n16 * (long)n29 + (long)n15 * (long)n30 + (long)n14 * (long)n31 + (long)n13 * (long)n32;
        long l25 = (long)n36 * (long)n41 + (long)n35 * (long)n42 + (long)n34 * (long)n43 + (long)n33 * (long)n44;
        long l26 = (long)n40 * (long)n45 + (long)n39 * (long)n46 + (long)n38 * (long)n47 + (long)n37 * (long)n48;
        int n55 = (int)(l7 += l21 + l23 + l26 - l22) & 0xFFFFFFF;
        l7 >>>= 28;
        int n56 = (int)(l8 += l24 + l25 - l21 + l26) & 0xFFFFFFF;
        l8 >>>= 28;
        long l27 = (long)n5 * (long)n17 + (long)n4 * (long)n18 + (long)n3 * (long)n19 + (long)n2 * (long)n20 + (long)n * (long)n21;
        long l28 = (long)n8 * (long)n22 + (long)n7 * (long)n23 + (long)n6 * (long)n24;
        long l29 = (long)n13 * (long)n25 + (long)n12 * (long)n26 + (long)n11 * (long)n27 + (long)n10 * (long)n28 + (long)n9 * (long)n29;
        long l30 = (long)n16 * (long)n30 + (long)n15 * (long)n31 + (long)n14 * (long)n32;
        long l31 = (long)n37 * (long)n41 + (long)n36 * (long)n42 + (long)n35 * (long)n43 + (long)n34 * (long)n44 + (long)n33 * (long)n45;
        long l32 = (long)n40 * (long)n46 + (long)n39 * (long)n47 + (long)n38 * (long)n48;
        int n57 = (int)(l7 += l27 + l29 + l32 - l28) & 0xFFFFFFF;
        l7 >>>= 28;
        int n58 = (int)(l8 += l30 + l31 - l27 + l32) & 0xFFFFFFF;
        l8 >>>= 28;
        long l33 = (long)n6 * (long)n17 + (long)n5 * (long)n18 + (long)n4 * (long)n19 + (long)n3 * (long)n20 + (long)n2 * (long)n21 + (long)n * (long)n22;
        long l34 = (long)n8 * (long)n23 + (long)n7 * (long)n24;
        long l35 = (long)n14 * (long)n25 + (long)n13 * (long)n26 + (long)n12 * (long)n27 + (long)n11 * (long)n28 + (long)n10 * (long)n29 + (long)n9 * (long)n30;
        long l36 = (long)n16 * (long)n31 + (long)n15 * (long)n32;
        long l37 = (long)n38 * (long)n41 + (long)n37 * (long)n42 + (long)n36 * (long)n43 + (long)n35 * (long)n44 + (long)n34 * (long)n45 + (long)n33 * (long)n46;
        long l38 = (long)n40 * (long)n47 + (long)n39 * (long)n48;
        int n59 = (int)(l7 += l33 + l35 + l38 - l34) & 0xFFFFFFF;
        l7 >>>= 28;
        int n60 = (int)(l8 += l36 + l37 - l33 + l38) & 0xFFFFFFF;
        l8 >>>= 28;
        long l39 = (long)n7 * (long)n17 + (long)n6 * (long)n18 + (long)n5 * (long)n19 + (long)n4 * (long)n20 + (long)n3 * (long)n21 + (long)n2 * (long)n22 + (long)n * (long)n23;
        long l40 = (long)n8 * (long)n24;
        long l41 = (long)n15 * (long)n25 + (long)n14 * (long)n26 + (long)n13 * (long)n27 + (long)n12 * (long)n28 + (long)n11 * (long)n29 + (long)n10 * (long)n30 + (long)n9 * (long)n31;
        long l42 = (long)n16 * (long)n32;
        long l43 = (long)n39 * (long)n41 + (long)n38 * (long)n42 + (long)n37 * (long)n43 + (long)n36 * (long)n44 + (long)n35 * (long)n45 + (long)n34 * (long)n46 + (long)n33 * (long)n47;
        long l44 = (long)n40 * (long)n48;
        int n61 = (int)(l7 += l39 + l41 + l44 - l40) & 0xFFFFFFF;
        l7 >>>= 28;
        int n62 = (int)(l8 += l42 + l43 - l39 + l44) & 0xFFFFFFF;
        l8 >>>= 28;
        long l45 = (long)n8 * (long)n17 + (long)n7 * (long)n18 + (long)n6 * (long)n19 + (long)n5 * (long)n20 + (long)n4 * (long)n21 + (long)n3 * (long)n22 + (long)n2 * (long)n23 + (long)n * (long)n24;
        long l46 = (long)n16 * (long)n25 + (long)n15 * (long)n26 + (long)n14 * (long)n27 + (long)n13 * (long)n28 + (long)n12 * (long)n29 + (long)n11 * (long)n30 + (long)n10 * (long)n31 + (long)n9 * (long)n32;
        long l47 = (long)n40 * (long)n41 + (long)n39 * (long)n42 + (long)n38 * (long)n43 + (long)n37 * (long)n44 + (long)n36 * (long)n45 + (long)n35 * (long)n46 + (long)n34 * (long)n47 + (long)n33 * (long)n48;
        int n63 = (int)(l7 += l45 + l46) & 0xFFFFFFF;
        l7 >>>= 28;
        int n64 = (int)(l8 += l47 - l45) & 0xFFFFFFF;
        l7 += (l8 >>>= 28);
        l7 += (long)n50;
        n50 = (int)l7 & 0xFFFFFFF;
        l8 += (long)n49;
        n49 = (int)l8 & 0xFFFFFFF;
        n52 += (int)(l7 >>>= 28);
        arg2[0] = n49;
        arg2[1] = n51 += (int)(l8 >>>= 28);
        arg2[2] = n53;
        arg2[3] = n55;
        arg2[4] = n57;
        arg2[5] = n59;
        arg2[6] = n61;
        arg2[7] = n63;
        arg2[8] = n50;
        arg2[9] = n52;
        arg2[10] = n54;
        arg2[11] = n56;
        arg2[12] = n58;
        arg2[13] = n60;
        arg2[14] = n62;
        arg2[15] = n64;
    }

    public static void cfr_renamed_8758(int[] arg0) {
        int n;
        arg0[0] = 1;
        int n2 = n = 1;
        while (n2 < 16) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n;
            int n4 = arg0[n] + arg1[n3];
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8866(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n = arg0[arg1 + 0];
        int n2 = arg0[arg1 + 1];
        int n3 = arg0[arg1 + 2];
        int n4 = arg0[arg1 + 3];
        int n5 = arg0[arg1 + 4];
        int n6 = arg0[arg1 + 5];
        int n7 = arg0[arg1 + 6];
        int n8 = arg3;
        int n9 = arg3;
        arg2[arg3 + 0] = n & 0xFFFFFFF;
        arg2[arg3 + 1] = (n >>> 28 | n2 << 4) & 0xFFFFFFF;
        arg2[n9 + 2] = (n2 >>> 24 | n3 << 8) & 0xFFFFFFF;
        arg2[n9 + 3] = (n3 >>> 20 | n4 << 12) & 0xFFFFFFF;
        arg2[arg3 + 4] = (n4 >>> 16 | n5 << 16) & 0xFFFFFFF;
        arg2[n8 + 5] = (n5 >>> 12 | n6 << 20) & 0xFFFFFFF;
        arg2[n8 + 6] = (n6 >>> 8 | n7 << 24) & 0xFFFFFFF;
        arg2[arg3 + 7] = n7 >>> 4;
    }

    private static /* synthetic */ void cfr_renamed_8867(int[] arg0, int arg1) {
        int n;
        int n2 = arg0[15];
        int n3 = n2 & 0xFFFFFFF;
        n2 = (n2 >>> 28) + arg1;
        long l = n2;
        int n4 = n = 0;
        while (n4 < 8) {
            long l2 = l += (long)arg0[n] & 0xFFFFFFFFL;
            arg0[n] = (int)l2 & 0xFFFFFFF;
            l = l2 >> 28;
            n4 = ++n;
        }
        l += (long)n2;
        int n5 = n = 8;
        while (n5 < 15) {
            long l3 = l += (long)arg0[n] & 0xFFFFFFFFL;
            arg0[n] = (int)l3 & 0xFFFFFFF;
            l = l3 >> 28;
            n5 = ++n;
        }
        arg0[15] = n3 + (int)l;
    }

    public static int cfr_renamed_1659(int[] arg0) {
        int n;
        int n2 = arg0[0] ^ 1;
        int n3 = n = 1;
        while (n3 < 16) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static int[] cfr_renamed_8787(int arg0) {
        return new int[16 * arg0];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8868(int[] nArray, byte[] byArray) {
        void arg1;
        int[] arg0;
        sprheh.cfr_renamed_8869(arg0, 0, (byte[])arg1, 0);
        sprheh.cfr_renamed_8869(arg0, 2, (byte[])arg1, 7);
        sprheh.cfr_renamed_8869(arg0, 4, (byte[])arg1, 14);
        sprheh.cfr_renamed_8869(arg0, 6, (byte[])arg1, 21);
        sprheh.cfr_renamed_8869(arg0, 8, (byte[])arg1, 28);
        sprheh.cfr_renamed_8869(arg0, 10, (byte[])arg1, 35);
        sprheh.cfr_renamed_8869(arg0, 12, (byte[])arg1, 42);
        sprheh.cfr_renamed_8869(arg0, 14, (byte[])arg1, 49);
    }

    private static /* synthetic */ void cfr_renamed_8732(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2] = (byte)(arg0 >>> 24);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8870(int[] nArray, int[] nArray2, int n) {
        void arg2;
        void arg1;
        int[] arg0;
        sprheh.cfr_renamed_8865(arg0, 0, (int[])arg1, (int)arg2);
        sprheh.cfr_renamed_8865(arg0, 8, (int[])arg1, (int)(arg2 + 7));
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8871(int[] nArray, int n, int[] nArray2) {
        void arg2;
        void arg1;
        int[] arg0;
        sprheh.cfr_renamed_8866(arg0, (int)arg1, (int[])arg2, 0);
        sprheh.cfr_renamed_8866(arg0, n + 7, (int[])arg2, 8);
    }

    public static boolean cfr_renamed_8761(int[] arg0) {
        return 0 != sprheh.cfr_renamed_1660(arg0);
    }

    public static void cfr_renamed_8746(int[] nArray) {
        int[] arg0;
        sprheh.cfr_renamed_8867(arg0, 1);
        sprheh.cfr_renamed_8867(arg0, -1);
    }

    public static boolean cfr_renamed_8872(int[] arg0) {
        return 0 != sprheh.cfr_renamed_1659(arg0);
    }

    private static /* synthetic */ void cfr_renamed_8869(int[] arg0, int arg1, byte[] arg2, int arg3) {
        int n = arg0[arg1];
        int n2 = arg0[arg1 + 1];
        sprheh.cfr_renamed_8732(n | n2 << 28, arg2, arg3);
        sprheh.cfr_renamed_8863(n2 >>> 4, arg2, arg3 + 4);
    }

    public static int[] cfr_renamed_1631() {
        return new int[16];
    }

    public static void cfr_renamed_8743(int[] arg0, int[] arg1) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        int n11 = arg0[10];
        int n12 = arg0[11];
        int n13 = arg0[12];
        int n14 = arg0[13];
        int n15 = arg0[14];
        int n16 = arg0[15];
        int n17 = n * 2;
        int n18 = n2 * 2;
        int n19 = n3 * 2;
        int n20 = n4 * 2;
        int n21 = n5 * 2;
        int n22 = n6 * 2;
        int n23 = n7 * 2;
        int n24 = n9 * 2;
        int n25 = n10 * 2;
        int n26 = n11 * 2;
        int n27 = n12 * 2;
        int n28 = n13 * 2;
        int n29 = n14 * 2;
        int n30 = n15 * 2;
        int n31 = n + n9;
        int n32 = n2 + n10;
        int n33 = n3 + n11;
        int n34 = n4 + n12;
        int n35 = n5 + n13;
        int n36 = n6 + n14;
        int n37 = n7 + n15;
        int n38 = n8 + n16;
        int n39 = n31 * 2;
        int n40 = n32 * 2;
        int n41 = n33 * 2;
        int n42 = n34 * 2;
        int n43 = n35 * 2;
        int n44 = n36 * 2;
        int n45 = n37 * 2;
        long l = (long)n * (long)n;
        long l2 = (long)n8 * (long)n18 + (long)n7 * (long)n19 + (long)n6 * (long)n20 + (long)n5 * (long)n5;
        long l3 = (long)n9 * (long)n9;
        long l4 = (long)n16 * (long)n25 + (long)n15 * (long)n26 + (long)n14 * (long)n27 + (long)n13 * (long)n13;
        long l5 = (long)n31 * (long)n31;
        long l6 = (long)n38 * ((long)n40 & 0xFFFFFFFFL) + (long)n37 * ((long)n41 & 0xFFFFFFFFL) + (long)n36 * ((long)n42 & 0xFFFFFFFFL) + (long)n35 * (long)n35;
        long l7 = l + l3 + l6 - l2;
        int n46 = (int)l7 & 0xFFFFFFF;
        l7 >>>= 28;
        long l8 = l4 + l5 - l + l6;
        int n47 = (int)l8 & 0xFFFFFFF;
        l8 >>>= 28;
        long l9 = (long)n2 * (long)n17;
        long l10 = (long)n8 * (long)n19 + (long)n7 * (long)n20 + (long)n6 * (long)n21;
        long l11 = (long)n10 * (long)n24;
        long l12 = (long)n16 * (long)n26 + (long)n15 * (long)n27 + (long)n14 * (long)n28;
        long l13 = (long)n32 * ((long)n39 & 0xFFFFFFFFL);
        long l14 = (long)n38 * ((long)n41 & 0xFFFFFFFFL) + (long)n37 * ((long)n42 & 0xFFFFFFFFL) + (long)n36 * ((long)n43 & 0xFFFFFFFFL);
        int n48 = (int)(l7 += l9 + l11 + l14 - l10) & 0xFFFFFFF;
        l7 >>>= 28;
        int n49 = (int)(l8 += l12 + l13 - l9 + l14) & 0xFFFFFFF;
        l8 >>>= 28;
        long l15 = (long)n3 * (long)n17 + (long)n2 * (long)n2;
        long l16 = (long)n8 * (long)n20 + (long)n7 * (long)n21 + (long)n6 * (long)n6;
        long l17 = (long)n11 * (long)n24 + (long)n10 * (long)n10;
        long l18 = (long)n16 * (long)n27 + (long)n15 * (long)n28 + (long)n14 * (long)n14;
        long l19 = (long)n33 * ((long)n39 & 0xFFFFFFFFL) + (long)n32 * (long)n32;
        long l20 = (long)n38 * ((long)n42 & 0xFFFFFFFFL) + (long)n37 * ((long)n43 & 0xFFFFFFFFL) + (long)n36 * (long)n36;
        int n50 = (int)(l7 += l15 + l17 + l20 - l16) & 0xFFFFFFF;
        l7 >>>= 28;
        int n51 = (int)(l8 += l18 + l19 - l15 + l20) & 0xFFFFFFF;
        l8 >>>= 28;
        long l21 = (long)n4 * (long)n17 + (long)n3 * (long)n18;
        long l22 = (long)n8 * (long)n21 + (long)n7 * (long)n22;
        long l23 = (long)n12 * (long)n24 + (long)n11 * (long)n25;
        long l24 = (long)n16 * (long)n28 + (long)n15 * (long)n29;
        long l25 = (long)n34 * ((long)n39 & 0xFFFFFFFFL) + (long)n33 * ((long)n40 & 0xFFFFFFFFL);
        long l26 = (long)n38 * ((long)n43 & 0xFFFFFFFFL) + (long)n37 * ((long)n44 & 0xFFFFFFFFL);
        int n52 = (int)(l7 += l21 + l23 + l26 - l22) & 0xFFFFFFF;
        l7 >>>= 28;
        int n53 = (int)(l8 += l24 + l25 - l21 + l26) & 0xFFFFFFF;
        l8 >>>= 28;
        long l27 = (long)n5 * (long)n17 + (long)n4 * (long)n18 + (long)n3 * (long)n3;
        long l28 = (long)n8 * (long)n22 + (long)n7 * (long)n7;
        long l29 = (long)n13 * (long)n24 + (long)n12 * (long)n25 + (long)n11 * (long)n11;
        long l30 = (long)n16 * (long)n29 + (long)n15 * (long)n15;
        long l31 = (long)n35 * ((long)n39 & 0xFFFFFFFFL) + (long)n34 * ((long)n40 & 0xFFFFFFFFL) + (long)n33 * (long)n33;
        long l32 = (long)n38 * ((long)n44 & 0xFFFFFFFFL) + (long)n37 * (long)n37;
        int n54 = (int)(l7 += l27 + l29 + l32 - l28) & 0xFFFFFFF;
        l7 >>>= 28;
        int n55 = (int)(l8 += l30 + l31 - l27 + l32) & 0xFFFFFFF;
        l8 >>>= 28;
        long l33 = (long)n6 * (long)n17 + (long)n5 * (long)n18 + (long)n4 * (long)n19;
        long l34 = (long)n8 * (long)n23;
        long l35 = (long)n14 * (long)n24 + (long)n13 * (long)n25 + (long)n12 * (long)n26;
        long l36 = (long)n16 * (long)n30;
        long l37 = (long)n36 * ((long)n39 & 0xFFFFFFFFL) + (long)n35 * ((long)n40 & 0xFFFFFFFFL) + (long)n34 * ((long)n41 & 0xFFFFFFFFL);
        long l38 = (long)n38 * ((long)n45 & 0xFFFFFFFFL);
        int n56 = (int)(l7 += l33 + l35 + l38 - l34) & 0xFFFFFFF;
        l7 >>>= 28;
        int n57 = (int)(l8 += l36 + l37 - l33 + l38) & 0xFFFFFFF;
        l8 >>>= 28;
        long l39 = (long)n7 * (long)n17 + (long)n6 * (long)n18 + (long)n5 * (long)n19 + (long)n4 * (long)n4;
        long l40 = (long)n8 * (long)n8;
        long l41 = (long)n15 * (long)n24 + (long)n14 * (long)n25 + (long)n13 * (long)n26 + (long)n12 * (long)n12;
        long l42 = (long)n16 * (long)n16;
        long l43 = (long)n37 * ((long)n39 & 0xFFFFFFFFL) + (long)n36 * ((long)n40 & 0xFFFFFFFFL) + (long)n35 * ((long)n41 & 0xFFFFFFFFL) + (long)n34 * (long)n34;
        long l44 = (long)n38 * (long)n38;
        int n58 = (int)(l7 += l39 + l41 + l44 - l40) & 0xFFFFFFF;
        l7 >>>= 28;
        int n59 = (int)(l8 += l42 + l43 - l39 + l44) & 0xFFFFFFF;
        l8 >>>= 28;
        long l45 = (long)n8 * (long)n17 + (long)n7 * (long)n18 + (long)n6 * (long)n19 + (long)n5 * (long)n20;
        long l46 = (long)n16 * (long)n24 + (long)n15 * (long)n25 + (long)n14 * (long)n26 + (long)n13 * (long)n27;
        long l47 = (long)n38 * ((long)n39 & 0xFFFFFFFFL) + (long)n37 * ((long)n40 & 0xFFFFFFFFL) + (long)n36 * ((long)n41 & 0xFFFFFFFFL) + (long)n35 * ((long)n42 & 0xFFFFFFFFL);
        int n60 = (int)(l7 += l45 + l46) & 0xFFFFFFF;
        l7 >>>= 28;
        int n61 = (int)(l8 += l47 - l45) & 0xFFFFFFF;
        l7 += (l8 >>>= 28);
        l7 += (long)n47;
        n47 = (int)l7 & 0xFFFFFFF;
        l8 += (long)n46;
        n46 = (int)l8 & 0xFFFFFFF;
        n49 += (int)(l7 >>>= 28);
        arg1[0] = n46;
        arg1[1] = n48 += (int)(l8 >>>= 28);
        arg1[2] = n50;
        arg1[3] = n52;
        arg1[4] = n54;
        arg1[5] = n56;
        arg1[6] = n58;
        arg1[7] = n60;
        arg1[8] = n47;
        arg1[9] = n49;
        arg1[10] = n51;
        arg1[11] = n53;
        arg1[12] = n55;
        arg1[13] = n57;
        arg1[14] = n59;
        arg1[15] = n61;
    }

    public static void cfr_renamed_8546(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = arg3 + n;
            int n4 = arg0[arg1 + n];
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_8873(int[] arg0, int arg1) {
        int n = arg1;
        arg0[n] = arg0[n] + 1;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8798(int[] nArray, int n, byte[] byArray, int n2) {
        void arg3;
        void arg2;
        int[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        sprheh.cfr_renamed_8869(arg0, (int)arg1, (byte[])arg2, (int)arg3);
        sprheh.cfr_renamed_8869(arg0, (int)(arg1 + 2), (byte[])arg2, (int)(arg3 + 7));
        sprheh.cfr_renamed_8869(arg0, (int)(v1 + 4), (byte[])arg2, (int)(arg3 + 14));
        sprheh.cfr_renamed_8869(arg0, (int)(v1 + 6), (byte[])arg2, (int)(arg3 + 21));
        sprheh.cfr_renamed_8869(arg0, (int)(arg1 + 8), (byte[])arg2, (int)(arg3 + 28));
        sprheh.cfr_renamed_8869(arg0, (int)(v0 + 10), (byte[])arg2, (int)(arg3 + 35));
        sprheh.cfr_renamed_8869(arg0, (int)(v0 + 12), (byte[])arg2, (int)(arg3 + 42));
        sprheh.cfr_renamed_8869(arg0, n + 14, (byte[])arg2, (int)(arg3 + 49));
    }

    static {
        int[] nArray = new int[14];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = -2;
        nArray[8] = -1;
        nArray[9] = -1;
        nArray[10] = -1;
        nArray[11] = -1;
        nArray[12] = -1;
        nArray[13] = -1;
        cfr_renamed_1 = nArray;
    }

    public static void cfr_renamed_8734(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = arg3[arg4 + n];
            int n4 = n3 ^ arg1[arg2 + n];
            int n5 = arg4 + n;
            arg3[n5] = n3 ^= n4 & arg0;
            n2 = ++n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8864(byte[] arg0, int arg1, int[] arg2, int arg3) {
        int n = sprheh.cfr_renamed_8727(arg0, arg1);
        int n2 = sprheh.cfr_renamed_8728(arg0, arg1 + 4);
        arg2[arg3] = n & 0xFFFFFFF;
        arg2[arg3 + 1] = n >>> 28 | n2 << 4;
    }

    public static void cfr_renamed_8748(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[0];
        int n2 = nArray2[1];
        int n3 = nArray[2];
        int n4 = nArray2[3];
        int n5 = nArray[4];
        int n6 = nArray2[5];
        int n7 = nArray[6];
        int n8 = nArray2[7];
        int n9 = nArray[8];
        int n10 = nArray2[9];
        int n11 = nArray[10];
        int n12 = nArray2[11];
        int n13 = nArray[12];
        int n14 = nArray2[13];
        int n15 = nArray[14];
        int n16 = nArray2[15];
        n2 += n >>> 28;
        n &= 0xFFFFFFF;
        n6 += n5 >>> 28;
        n5 &= 0xFFFFFFF;
        n10 += n9 >>> 28;
        n9 &= 0xFFFFFFF;
        n14 += n13 >>> 28;
        n13 &= 0xFFFFFFF;
        n3 += n2 >>> 28;
        n2 &= 0xFFFFFFF;
        n7 += n6 >>> 28;
        n6 &= 0xFFFFFFF;
        n11 += n10 >>> 28;
        n10 &= 0xFFFFFFF;
        n15 += n14 >>> 28;
        n14 &= 0xFFFFFFF;
        n4 += n3 >>> 28;
        n3 &= 0xFFFFFFF;
        n8 += n7 >>> 28;
        n7 &= 0xFFFFFFF;
        n12 += n11 >>> 28;
        n11 &= 0xFFFFFFF;
        n16 += n15 >>> 28;
        n15 &= 0xFFFFFFF;
        int n17 = n16 >>> 28;
        n16 &= 0xFFFFFFF;
        n += n17;
        n9 += n17;
        n5 += n4 >>> 28;
        n4 &= 0xFFFFFFF;
        n9 += n8 >>> 28;
        n8 &= 0xFFFFFFF;
        n13 += n12 >>> 28;
        n12 &= 0xFFFFFFF;
        n2 += n >>> 28;
        n &= 0xFFFFFFF;
        n6 += n5 >>> 28;
        n5 &= 0xFFFFFFF;
        n10 += n9 >>> 28;
        n9 &= 0xFFFFFFF;
        n14 += n13 >>> 28;
        n13 &= 0xFFFFFFF;
        nArray[0] = n;
        nArray2[1] = n2;
        nArray[2] = n3;
        nArray2[3] = n4;
        nArray[4] = n5;
        nArray2[5] = n6;
        nArray[6] = n7;
        nArray2[7] = n8;
        nArray[8] = n9;
        nArray2[9] = n10;
        nArray[10] = n11;
        nArray2[11] = n12;
        nArray[12] = n13;
        nArray2[13] = n14;
        nArray[14] = n15;
        nArray2[15] = n16;
    }

    public static void cfr_renamed_8767(int arg0, int[] arg1) {
        int[] nArray = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_1641(nArray, arg1, nArray);
        sprheh.cfr_renamed_8734(-arg0, nArray, 0, arg1, 0);
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        sprheh.cfr_renamed_1641(sprheh.cfr_renamed_1631(), arg0, arg1);
    }

    public static boolean cfr_renamed_8760(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprheh.cfr_renamed_1631();
        int[] nArray2 = sprheh.cfr_renamed_1631();
        int[] nArray3 = arg0;
        sprheh.cfr_renamed_8743(nArray3, nArray);
        int[] nArray4 = nArray;
        sprheh.cfr_renamed_1636(nArray4, arg1, nArray);
        sprheh.cfr_renamed_8743(nArray, nArray2);
        sprheh.cfr_renamed_1636(nArray, nArray3, nArray4);
        sprheh.cfr_renamed_1636(nArray2, arg0, nArray2);
        sprheh.cfr_renamed_1636(nArray2, arg1, nArray2);
        int[] nArray5 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8874(nArray2, nArray5);
        int[] nArray6 = nArray5;
        sprheh.cfr_renamed_1636(nArray5, nArray, nArray6);
        int[] nArray7 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8743(nArray6, nArray7);
        sprheh.cfr_renamed_1636(nArray7, arg1, nArray7);
        sprheh.cfr_renamed_1641(arg0, nArray7, nArray7);
        sprheh.cfr_renamed_8746(nArray7);
        if (sprheh.cfr_renamed_8761(nArray7)) {
            sprheh.cfr_renamed_8546(nArray5, 0, arg2, 0);
            return true;
        }
        return false;
    }

    public static void cfr_renamed_8875(int[] arg0, int arg1, int[] arg2) {
        sprheh.cfr_renamed_8743(arg0, arg2);
        while (--arg1 > 0) {
            sprheh.cfr_renamed_8743(arg2, arg2);
        }
    }

    private static /* synthetic */ int cfr_renamed_8728(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = n2;
        n3 = n;
        n3 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16;
        return n3;
    }

    public static void cfr_renamed_8788(int[] arg0, int[] arg1) {
        int[] nArray = sprheh.cfr_renamed_1631();
        int[] nArray2 = new int[14];
        sprheh.cfr_renamed_8546(arg0, 0, nArray, 0);
        sprheh.cfr_renamed_8746(nArray);
        sprheh.cfr_renamed_8870(nArray, nArray2, 0);
        sprqlh.cfr_renamed_5233(cfr_renamed_1, nArray2, nArray2);
        sprheh.cfr_renamed_8871(nArray2, 0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8876(byte[] byArray, int n, int[] nArray) {
        void arg2;
        byte[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        sprheh.cfr_renamed_8864(arg0, (int)arg1, (int[])arg2, 0);
        sprheh.cfr_renamed_8864(arg0, (int)(arg1 + 7), (int[])arg2, 2);
        sprheh.cfr_renamed_8864(arg0, (int)(v1 + 14), (int[])arg2, 4);
        sprheh.cfr_renamed_8864(arg0, (int)(v1 + 21), (int[])arg2, 6);
        sprheh.cfr_renamed_8864(arg0, (int)(arg1 + 28), (int[])arg2, 8);
        sprheh.cfr_renamed_8864(arg0, (int)(v0 + 35), (int[])arg2, 10);
        sprheh.cfr_renamed_8864(arg0, (int)(v0 + 42), (int[])arg2, 12);
        sprheh.cfr_renamed_8864(arg0, n + 49, (int[])arg2, 14);
    }

    private static /* synthetic */ void cfr_renamed_8874(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int[] nArray6 = sprheh.cfr_renamed_1631();
        int[] nArray7 = arg0;
        sprheh.cfr_renamed_8743(arg0, nArray6);
        sprheh.cfr_renamed_1636(arg0, nArray6, nArray6);
        int[] nArray8 = nArray5 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8743(nArray6, nArray8);
        sprheh.cfr_renamed_1636(nArray7, nArray8, nArray5);
        int[] nArray9 = sprheh.cfr_renamed_1631();
        int[] nArray10 = nArray5;
        sprheh.cfr_renamed_8875(nArray10, 3, nArray9);
        sprheh.cfr_renamed_1636(nArray10, nArray9, nArray9);
        int[] nArray11 = nArray4 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray9, 3, nArray11);
        sprheh.cfr_renamed_1636(nArray5, nArray4, nArray11);
        int[] nArray12 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray4, 9, nArray12);
        sprheh.cfr_renamed_1636(nArray4, nArray12, nArray12);
        int[] nArray13 = nArray3 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8743(nArray12, nArray13);
        sprheh.cfr_renamed_1636(arg0, nArray13, nArray3);
        int[] nArray14 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray3, 18, nArray14);
        sprheh.cfr_renamed_1636(nArray12, nArray14, nArray14);
        int[] nArray15 = sprheh.cfr_renamed_1631();
        int[] nArray16 = nArray14;
        sprheh.cfr_renamed_8875(nArray16, 37, nArray15);
        sprheh.cfr_renamed_1636(nArray16, nArray15, nArray15);
        int[] nArray17 = nArray2 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray15, 37, nArray17);
        sprheh.cfr_renamed_1636(nArray14, nArray2, nArray17);
        int[] nArray18 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray2, 111, nArray18);
        sprheh.cfr_renamed_1636(nArray2, nArray18, nArray18);
        int[] nArray19 = nArray = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8743(nArray18, nArray19);
        sprheh.cfr_renamed_1636(nArray7, nArray19, nArray);
        int[] nArray20 = sprheh.cfr_renamed_1631();
        sprheh.cfr_renamed_8875(nArray, 223, nArray20);
        sprheh.cfr_renamed_1636(nArray20, nArray18, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8799(int[] nArray, byte[] byArray, int n) {
        void arg2;
        void arg1;
        int[] arg0;
        sprheh.cfr_renamed_8869(arg0, 0, (byte[])arg1, (int)arg2);
        sprheh.cfr_renamed_8869(arg0, 2, (byte[])arg1, (int)(arg2 + 7));
        sprheh.cfr_renamed_8869(arg0, 4, (byte[])arg1, (int)(arg2 + 14));
        sprheh.cfr_renamed_8869(arg0, 6, (byte[])arg1, (int)(arg2 + 21));
        sprheh.cfr_renamed_8869(arg0, 8, (byte[])arg1, (int)(arg2 + 28));
        sprheh.cfr_renamed_8869(arg0, 10, (byte[])arg1, (int)(arg2 + 35));
        sprheh.cfr_renamed_8869(arg0, 12, (byte[])arg1, (int)(arg2 + 42));
        sprheh.cfr_renamed_8869(arg0, 14, (byte[])arg1, (int)(arg2 + 49));
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1641(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        int n11 = arg0[10];
        int n12 = arg0[11];
        int n13 = arg0[12];
        int n14 = arg0[13];
        int n15 = arg0[14];
        int n16 = arg0[15];
        void v0 = arg1;
        void var19_19 = v0[0];
        void var20_20 = v0[1];
        void var21_21 = v0[2];
        void var22_22 = v0[3];
        void var23_23 = v0[4];
        void var24_24 = v0[5];
        void var25_25 = v0[6];
        void var26_26 = v0[7];
        void var27_27 = v0[8];
        void var28_28 = v0[9];
        void var29_29 = v0[10];
        void var30_30 = v0[11];
        void var31_31 = v0[12];
        void var32_32 = v0[13];
        void var33_33 = v0[14];
        int n17 = nArray2[15];
        int n18 = n + 0x1FFFFFFE - var19_19;
        int n19 = n2 + 0x1FFFFFFE - var20_20;
        int n20 = n3 + 0x1FFFFFFE - var21_21;
        int n21 = n4 + 0x1FFFFFFE - var22_22;
        int n22 = n5 + 0x1FFFFFFE - var23_23;
        int n23 = n6 + 0x1FFFFFFE - var24_24;
        int n24 = n7 + 0x1FFFFFFE - var25_25;
        int n25 = n8 + 0x1FFFFFFE - var26_26;
        int n26 = n9 + 0x1FFFFFFC - var27_27;
        int n27 = n10 + 0x1FFFFFFE - var28_28;
        int n28 = n11 + 0x1FFFFFFE - var29_29;
        int n29 = n12 + 0x1FFFFFFE - var30_30;
        int n30 = n13 + 0x1FFFFFFE - var31_31;
        int n31 = n14 + 0x1FFFFFFE - var32_32;
        int n32 = n15 + 0x1FFFFFFE - var33_33;
        int n33 = n16 + 0x1FFFFFFE - n17;
        n20 += n19 >>> 28;
        n19 &= 0xFFFFFFF;
        n24 += n23 >>> 28;
        n23 &= 0xFFFFFFF;
        n28 += n27 >>> 28;
        n27 &= 0xFFFFFFF;
        n32 += n31 >>> 28;
        n31 &= 0xFFFFFFF;
        n21 += n20 >>> 28;
        n20 &= 0xFFFFFFF;
        n25 += n24 >>> 28;
        n24 &= 0xFFFFFFF;
        n29 += n28 >>> 28;
        n28 &= 0xFFFFFFF;
        n33 += n32 >>> 28;
        n32 &= 0xFFFFFFF;
        int n34 = n33 >>> 28;
        n33 &= 0xFFFFFFF;
        n18 += n34;
        n26 += n34;
        n22 += n21 >>> 28;
        n21 &= 0xFFFFFFF;
        n26 += n25 >>> 28;
        n25 &= 0xFFFFFFF;
        n30 += n29 >>> 28;
        n29 &= 0xFFFFFFF;
        n19 += n18 >>> 28;
        n18 &= 0xFFFFFFF;
        n23 += n22 >>> 28;
        n22 &= 0xFFFFFFF;
        n27 += n26 >>> 28;
        n26 &= 0xFFFFFFF;
        n31 += n30 >>> 28;
        n30 &= 0xFFFFFFF;
        void v1 = arg2;
        void v2 = arg2;
        void v3 = arg2;
        void v4 = arg2;
        void v5 = arg2;
        void v6 = arg2;
        void v7 = arg2;
        void v8 = arg2;
        v8[0] = n18;
        v8[1] = n19;
        v7[2] = n20;
        v7[3] = n21;
        v6[4] = n22;
        v6[5] = n23;
        v5[6] = n24;
        v5[7] = n25;
        v4[8] = n26;
        v4[9] = n27;
        v3[10] = n28;
        v3[11] = n29;
        v2[12] = n30;
        v2[13] = n31;
        v1[14] = n32;
        v1[15] = n33;
    }

    public static void cfr_renamed_8745(int[] arg0) {
        int[] nArray = sprheh.cfr_renamed_1631();
        nArray[0] = 1;
        sprheh.cfr_renamed_1641(arg0, nArray, arg0);
    }

    private static /* synthetic */ int cfr_renamed_8727(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | arg0[++arg1] << 24;
        return n4;
    }

    private static /* synthetic */ void cfr_renamed_8863(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byArray[arg2++] = (byte)arg0;
        arg1[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2] = (byte)(arg0 >>> 16);
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        int[] nArray = sprheh.cfr_renamed_1631();
        int[] nArray2 = new int[14];
        sprheh.cfr_renamed_8546(arg0, 0, nArray, 0);
        sprheh.cfr_renamed_8746(nArray);
        sprheh.cfr_renamed_8870(nArray, nArray2, 0);
        sprqlh.cfr_renamed_5235(cfr_renamed_1, nArray2, nArray2);
        sprheh.cfr_renamed_8871(nArray2, 0, arg1);
    }

    public static void cfr_renamed_1643(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8877(byte[] byArray, int n, int[] nArray, int n2) {
        void arg3;
        void arg2;
        byte[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        sprheh.cfr_renamed_8864(arg0, (int)arg1, (int[])arg2, (int)arg3);
        sprheh.cfr_renamed_8864(arg0, (int)(arg1 + 7), (int[])arg2, (int)(arg3 + 2));
        sprheh.cfr_renamed_8864(arg0, (int)(v1 + 14), (int[])arg2, (int)(arg3 + 4));
        sprheh.cfr_renamed_8864(arg0, (int)(v1 + 21), (int[])arg2, (int)(arg3 + 6));
        sprheh.cfr_renamed_8864(arg0, (int)(arg1 + 28), (int[])arg2, (int)(arg3 + 8));
        sprheh.cfr_renamed_8864(arg0, (int)(v0 + 35), (int[])arg2, (int)(arg3 + 10));
        sprheh.cfr_renamed_8864(arg0, (int)(v0 + 42), (int[])arg2, (int)(arg3 + 12));
        sprheh.cfr_renamed_8864(arg0, n + 49, (int[])arg2, (int)(arg3 + 14));
    }

    public static void cfr_renamed_8851(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = 0 - arg0;
        int n3 = n = 0;
        while (n3 < 16) {
            int n4 = arg1[n];
            int n5 = arg2[n];
            int n6 = n2 & (n4 ^ n5);
            arg1[n] = n4 ^ n6;
            arg2[n++] = n5 ^ n6;
            n3 = n;
        }
    }

    public static int cfr_renamed_549(int[] arg0, int[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 16) {
            int n4 = arg0[n];
            int n5 = arg1[n];
            n2 |= n4 ^ n5;
            n3 = ++n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_8744(int[] arg0, int arg1, int[] arg2) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        int n11 = arg0[10];
        int n12 = arg0[11];
        int n13 = arg0[12];
        int n14 = arg0[13];
        int n15 = arg0[14];
        int n16 = arg0[15];
        long l = (long)n2 * (long)arg1;
        int n17 = (int)l & 0xFFFFFFF;
        l >>>= 28;
        long l2 = (long)n6 * (long)arg1;
        int n18 = (int)l2 & 0xFFFFFFF;
        l2 >>>= 28;
        long l3 = (long)n10 * (long)arg1;
        int n19 = (int)l3 & 0xFFFFFFF;
        l3 >>>= 28;
        long l4 = (long)n14 * (long)arg1;
        int n20 = (int)l4 & 0xFFFFFFF;
        l4 >>>= 28;
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        int[] nArray3 = arg2;
        arg2[2] = (int)(l += (long)n3 * (long)arg1) & 0xFFFFFFF;
        l >>>= 28;
        arg2[6] = (int)(l2 += (long)n7 * (long)arg1) & 0xFFFFFFF;
        l2 >>>= 28;
        nArray2[10] = (int)(l3 += (long)n11 * (long)arg1) & 0xFFFFFFF;
        l3 >>>= 28;
        nArray3[14] = (int)(l4 += (long)n15 * (long)arg1) & 0xFFFFFFF;
        l4 >>>= 28;
        nArray2[3] = (int)(l += (long)n4 * (long)arg1) & 0xFFFFFFF;
        l >>>= 28;
        nArray3[7] = (int)(l2 += (long)n8 * (long)arg1) & 0xFFFFFFF;
        l2 >>>= 28;
        nArray2[11] = (int)(l3 += (long)n12 * (long)arg1) & 0xFFFFFFF;
        l3 >>>= 28;
        nArray3[15] = (int)(l4 += (long)n16 * (long)arg1) & 0xFFFFFFF;
        l2 += (l4 >>>= 28);
        nArray2[4] = (int)(l += (long)n5 * (long)arg1) & 0xFFFFFFF;
        l >>>= 28;
        nArray3[8] = (int)(l2 += (long)n9 * (long)arg1) & 0xFFFFFFF;
        nArray2[12] = (int)(l3 += (long)n13 * (long)arg1) & 0xFFFFFFF;
        nArray3[0] = (int)(l4 += (long)n * (long)arg1) & 0xFFFFFFF;
        nArray[1] = n17 + (int)(l4 >>>= 28);
        arg2[5] = n18 + (int)l;
        nArray[9] = n19 + (int)(l2 >>>= 28);
        nArray[13] = n20 + (int)(l3 >>>= 28);
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 16) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }
}

