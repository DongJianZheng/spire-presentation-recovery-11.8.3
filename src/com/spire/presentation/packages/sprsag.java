/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;

public class sprsag {
    public final byte[] cfr_renamed_1;
    public int cfr_renamed_2;
    public long[][] cfr_renamed_3;
    public int[][] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6021(byte[] arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = arg2 + (n << 2);
            arg1[n++] = arg0[n3] & 0xFF | arg0[n3 + 1] << 8 & 0xFF00 | arg0[n3 + 2] << 16 & 0xFF0000 | arg0[n3 + 3] << 24;
            n2 = n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_6022(int[] arg0, int arg1, int arg2, int arg3) {
        int[] nArray;
        int n = 0;
        int n2 = 0;
        switch (arg1) {
            case 1: {
                n = 0x55555555;
                n2 = -1431655766;
                nArray = arg0;
                break;
            }
            case 2: {
                n = 0x33333333;
                n2 = -858993460;
                nArray = arg0;
                break;
            }
            case 4: {
                n = 0xF0F0F0F;
                n2 = -252645136;
            }
            default: {
                nArray = arg0;
            }
        }
        int n3 = nArray[arg2];
        int[] nArray2 = arg0;
        int n4 = nArray2[arg3];
        arg0[arg2] = n3 & n | (n4 & n) << arg1;
        nArray2[arg3] = (n3 & n2) >>> arg1 | n4 & n2;
    }

    private /* synthetic */ void cfr_renamed_6023(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = arg0[n];
            arg0[n++] = n3 & 0xFF | (n3 & 0xFC00) >>> 2 | (n3 & 0x300) << 6 | (n3 & 0xF00000) >>> 4 | (n3 & 0xF0000) << 4 | (n3 & 0xC0000000) >>> 6 | (n3 & 0x3F000000) << 2;
            n2 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_6024(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[7];
        int n2 = nArray2[6];
        int n3 = nArray[5];
        int n4 = nArray2[4];
        int n5 = nArray[3];
        int n6 = nArray2[2];
        int n7 = nArray[1];
        int n8 = nArray2[0];
        int n9 = n4 ^ n6;
        int n10 = n ^ n7;
        int n11 = n ^ n4;
        int n12 = n ^ n6;
        int n13 = n2 ^ n3;
        int n14 = n13 ^ n8;
        int n15 = n14 ^ n4;
        int n16 = n10 ^ n9;
        int n17 = n14 ^ n;
        int n18 = n14 ^ n7;
        int n19 = n18 ^ n12;
        int n20 = n5 ^ n16;
        int n21 = n20 ^ n6;
        int n22 = n20 ^ n2;
        int n23 = n21 ^ n8;
        int n24 = n21 ^ n13;
        int n25 = n22 ^ n11;
        int n26 = n8 ^ n25;
        int n27 = n24 ^ n25;
        int n28 = n24 ^ n12;
        int n29 = n13 ^ n25;
        int n30 = n10 ^ n29;
        int n31 = n ^ n29;
        int n32 = n16 & n21;
        int n33 = n19 & n23 ^ n32;
        int n34 = n15 & n8 ^ n32;
        int n35 = n10 & n29;
        int n36 = n18 & n14 ^ n35;
        int n37 = n17 & n26 ^ n35;
        int n38 = n11 & n25;
        int n39 = n9 & n27 ^ n38;
        int n40 = n12 & n24 ^ n38;
        int n41 = n33 ^ n39;
        int n42 = n34 ^ n40;
        int n43 = n36 ^ n39;
        int n44 = n37 ^ n40;
        int n45 = n41 ^ n22;
        int n46 = n42 ^ n28;
        int n47 = n43 ^ n30;
        int n48 = n44 ^ n31;
        int n49 = n45 ^ n46;
        int n50 = n45 & n47;
        int n51 = n48 ^ n50;
        int n52 = n49 & n51 ^ n46;
        int n53 = n47 ^ n48;
        int n54 = (n46 ^ n50) & n53 ^ n48;
        int n55 = n47 ^ n54;
        int n56 = n51 ^ n54;
        int n57 = n48 & n56;
        int n58 = n57 ^ n55;
        int n59 = n51 ^ n57;
        int n60 = n52 & n59;
        int n61 = n49 ^ n60;
        int n62 = n61 ^ n58;
        int n63 = n52 ^ n54;
        int n64 = n52 ^ n61;
        int n65 = n54 ^ n58;
        int n66 = n63 ^ n62;
        int n67 = n65 & n21;
        int n68 = n58 & n23;
        int n69 = n54 & n8;
        int n70 = n64 & n29;
        int n71 = n61 & n14;
        int n72 = n52 & n26;
        int n73 = n63 & n25;
        int n74 = n66 & n27;
        int n75 = n62 & n24;
        int n76 = n65 & n16;
        int n77 = n58 & n19;
        int n78 = n54 & n15;
        int n79 = n64 & n10;
        int n80 = n61 & n18;
        int n81 = n52 & n17;
        int n82 = n63 & n11;
        int n83 = n66 & n9;
        int n84 = n62 & n12;
        int n85 = n82 ^ n83;
        int n86 = n77 ^ n78;
        int n87 = n72 ^ n80;
        int n88 = n76 ^ n77;
        int n89 = n69 ^ n79;
        int n90 = n69 ^ n72;
        int n91 = n74 ^ n75;
        int n92 = n67 ^ n70;
        int n93 = n73 ^ n74;
        int n94 = n83 ^ n84;
        int n95 = n79 ^ n87;
        int n96 = n89 ^ n92;
        int n97 = n71 ^ n85;
        int n98 = n70 ^ n93;
        int n99 = n85 ^ n96;
        int n100 = n81 ^ n96;
        int n101 = n91 ^ n97;
        int n102 = n88 ^ n97;
        int n103 = n71 ^ n98;
        int n104 = n100 ^ n101;
        int n105 = n68 ^ n102;
        int n106 = n98 ^ n102;
        int n107 = n95 ^ ~n101;
        int n108 = n87 ^ ~n99;
        int n109 = n103 ^ n104;
        int n110 = n92 ^ n105;
        int n111 = n90 ^ n105;
        int n112 = n86 ^ n104;
        int n113 = n103 ^ ~n110;
        int n114 = n94 ^ ~n109;
        nArray[7] = n106;
        nArray2[6] = n113;
        nArray[5] = n114;
        nArray2[4] = n110;
        nArray[3] = n111;
        nArray2[2] = n112;
        nArray[1] = n107;
        nArray2[0] = n108;
    }

    private /* synthetic */ void cfr_renamed_6025(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[7];
        long l2 = lArray2[6];
        long l3 = lArray[5];
        long l4 = lArray2[4];
        long l5 = lArray[3];
        long l6 = lArray2[2];
        long l7 = lArray[1];
        long l8 = lArray2[0];
        long l9 = l4 ^ l6;
        long l10 = l ^ l7;
        long l11 = l ^ l4;
        long l12 = l ^ l6;
        long l13 = l2 ^ l3;
        long l14 = l13 ^ l8;
        long l15 = l14 ^ l4;
        long l16 = l10 ^ l9;
        long l17 = l14 ^ l;
        long l18 = l14 ^ l7;
        long l19 = l18 ^ l12;
        long l20 = l5 ^ l16;
        long l21 = l20 ^ l6;
        long l22 = l20 ^ l2;
        long l23 = l21 ^ l8;
        long l24 = l21 ^ l13;
        long l25 = l22 ^ l11;
        long l26 = l8 ^ l25;
        long l27 = l24 ^ l25;
        long l28 = l24 ^ l12;
        long l29 = l13 ^ l25;
        long l30 = l10 ^ l29;
        long l31 = l ^ l29;
        long l32 = l16 & l21;
        long l33 = l19 & l23 ^ l32;
        long l34 = l15 & l8 ^ l32;
        long l35 = l10 & l29;
        long l36 = l18 & l14 ^ l35;
        long l37 = l17 & l26 ^ l35;
        long l38 = l11 & l25;
        long l39 = l9 & l27 ^ l38;
        long l40 = l12 & l24 ^ l38;
        long l41 = l33 ^ l39;
        long l42 = l34 ^ l40;
        long l43 = l36 ^ l39;
        long l44 = l37 ^ l40;
        long l45 = l41 ^ l22;
        long l46 = l42 ^ l28;
        long l47 = l43 ^ l30;
        long l48 = l44 ^ l31;
        long l49 = l45 ^ l46;
        long l50 = l45 & l47;
        long l51 = l48 ^ l50;
        long l52 = l49 & l51 ^ l46;
        long l53 = l47 ^ l48;
        long l54 = (l46 ^ l50) & l53 ^ l48;
        long l55 = l47 ^ l54;
        long l56 = l51 ^ l54;
        long l57 = l48 & l56;
        long l58 = l57 ^ l55;
        long l59 = l51 ^ l57;
        long l60 = l52 & l59;
        long l61 = l49 ^ l60;
        long l62 = l61 ^ l58;
        long l63 = l52 ^ l54;
        long l64 = l52 ^ l61;
        long l65 = l54 ^ l58;
        long l66 = l63 ^ l62;
        long l67 = l65 & l21;
        long l68 = l58 & l23;
        long l69 = l54 & l8;
        long l70 = l64 & l29;
        long l71 = l61 & l14;
        long l72 = l52 & l26;
        long l73 = l63 & l25;
        long l74 = l66 & l27;
        long l75 = l62 & l24;
        long l76 = l65 & l16;
        long l77 = l58 & l19;
        long l78 = l54 & l15;
        long l79 = l64 & l10;
        long l80 = l61 & l18;
        long l81 = l52 & l17;
        long l82 = l63 & l11;
        long l83 = l66 & l9;
        long l84 = l62 & l12;
        long l85 = l82 ^ l83;
        long l86 = l77 ^ l78;
        long l87 = l72 ^ l80;
        long l88 = l76 ^ l77;
        long l89 = l69 ^ l79;
        long l90 = l69 ^ l72;
        long l91 = l74 ^ l75;
        long l92 = l67 ^ l70;
        long l93 = l73 ^ l74;
        long l94 = l83 ^ l84;
        long l95 = l79 ^ l87;
        long l96 = l89 ^ l92;
        long l97 = l71 ^ l85;
        long l98 = l70 ^ l93;
        long l99 = l85 ^ l96;
        long l100 = l81 ^ l96;
        long l101 = l91 ^ l97;
        long l102 = l88 ^ l97;
        long l103 = l71 ^ l98;
        long l104 = l100 ^ l101;
        long l105 = l68 ^ l102;
        long l106 = l98 ^ l102;
        long l107 = l95 ^ (l101 ^ 0xFFFFFFFFFFFFFFFFL);
        long l108 = l87 ^ (l99 ^ 0xFFFFFFFFFFFFFFFFL);
        long l109 = l103 ^ l104;
        long l110 = l92 ^ l105;
        long l111 = l90 ^ l105;
        long l112 = l86 ^ l104;
        long l113 = l103 ^ (l110 ^ 0xFFFFFFFFFFFFFFFFL);
        long l114 = l94 ^ (l109 ^ 0xFFFFFFFFFFFFFFFFL);
        lArray[7] = l106;
        lArray2[6] = l113;
        lArray[5] = l114;
        lArray2[4] = l110;
        lArray[3] = l111;
        lArray2[2] = l112;
        lArray[1] = l107;
        lArray2[0] = l108;
    }

    public void cfr_renamed_6020(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int[] nArray = new int[16];
        this.cfr_renamed_6021(arg1, nArray, arg2);
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = n++;
            this.cfr_renamed_6026(arg0, n3, nArray, n3 << 2);
            n2 = n;
        }
        this.cfr_renamed_6027(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_6028(long[] arg0, int arg1, int arg2, int arg3) {
        long[] lArray;
        long l = 0L;
        long l2 = 0L;
        switch (arg1) {
            case 1: {
                l = 0x5555555555555555L;
                l2 = -6148914691236517206L;
                lArray = arg0;
                break;
            }
            case 2: {
                l = 0x3333333333333333L;
                l2 = -3689348814741910324L;
                lArray = arg0;
                break;
            }
            case 4: {
                l = 0xF0F0F0F0F0F0F0FL;
                l2 = -1085102592571150096L;
                lArray = arg0;
                break;
            }
            default: {
                return;
            }
        }
        long l3 = lArray[arg2];
        long[] lArray2 = arg0;
        long l4 = lArray2[arg3];
        arg0[arg2] = l3 & l | (l4 & l) << arg1;
        lArray2[arg3] = (l3 & l2) >>> arg1 | l4 & l2;
    }

    private /* synthetic */ void cfr_renamed_6029(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            long l = arg0[n];
            arg0[n++] = l & 0xFFFFL | (l & 0xFFF00000L) >>> 4 | (l & 0xF0000L) << 12 | (l & 0xFF0000000000L) >>> 8 | (l & 0xFF00000000L) << 8 | (l & 0xF000000000000000L) >>> 12 | (l & 0xFFF000000000000L) << 4;
            n2 = n;
        }
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_2 = 0;
        sproze.cfr_renamed_3408(this.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_6030(int[] arg0) {
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
        int n9 = n >>> 8 | n << 24;
        int n10 = n2 >>> 8 | n2 << 24;
        int n11 = n3 >>> 8 | n3 << 24;
        int n12 = n4 >>> 8 | n4 << 24;
        int n13 = n5 >>> 8 | n5 << 24;
        int n14 = n6 >>> 8 | n6 << 24;
        int n15 = n7 >>> 8 | n7 << 24;
        int n16 = n8 >>> 8 | n8 << 24;
        nArray[0] = n8 ^ n16 ^ n9 ^ this.cfr_renamed_6031(n ^ n9);
        nArray2[1] = n ^ n9 ^ n8 ^ n16 ^ n10 ^ this.cfr_renamed_6031(n2 ^ n10);
        nArray[2] = n2 ^ n10 ^ n11 ^ this.cfr_renamed_6031(n3 ^ n11);
        nArray2[3] = n3 ^ n11 ^ n8 ^ n16 ^ n12 ^ this.cfr_renamed_6031(n4 ^ n12);
        nArray[4] = n4 ^ n12 ^ n8 ^ n16 ^ n13 ^ this.cfr_renamed_6031(n5 ^ n13);
        nArray2[5] = n5 ^ n13 ^ n14 ^ this.cfr_renamed_6031(n6 ^ n14);
        nArray[6] = n6 ^ n14 ^ n15 ^ this.cfr_renamed_6031(n7 ^ n15);
        nArray2[7] = n7 ^ n15 ^ n16 ^ this.cfr_renamed_6031(n8 ^ n16);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6032(int[] nArray) {
        void arg0;
        sprsag sprsag2 = this;
        void v1 = arg0;
        sprsag sprsag3 = this;
        void v3 = arg0;
        sprsag sprsag4 = this;
        void v5 = arg0;
        sprsag sprsag5 = this;
        void v7 = arg0;
        this.cfr_renamed_6022((int[])v7, 1, 0, 1);
        sprsag5.cfr_renamed_6022((int[])v7, 1, 2, 3);
        sprsag5.cfr_renamed_6022((int[])arg0, 1, 4, 5);
        this.cfr_renamed_6022((int[])v5, 1, 6, 7);
        sprsag4.cfr_renamed_6022((int[])v5, 2, 0, 2);
        sprsag4.cfr_renamed_6022((int[])arg0, 2, 1, 3);
        this.cfr_renamed_6022((int[])v3, 2, 4, 6);
        sprsag3.cfr_renamed_6022((int[])v3, 2, 5, 7);
        sprsag3.cfr_renamed_6022((int[])arg0, 4, 0, 4);
        this.cfr_renamed_6022((int[])v1, 4, 1, 5);
        sprsag2.cfr_renamed_6022((int[])v1, 4, 2, 6);
        sprsag2.cfr_renamed_6022(nArray, 4, 3, 7);
    }

    public void cfr_renamed_6018(byte[] arg0) {
        int n;
        int n2;
        int[] nArray = new int[16];
        long[] lArray = new long[8];
        sprsag sprsag2 = this;
        sprsag2.cfr_renamed_6021(sprsag2.cfr_renamed_1, nArray, 0);
        int n3 = n2 = 0;
        while (n3 < 4) {
            int n4 = n2++;
            this.cfr_renamed_6026(lArray, n4, nArray, n4 << 2);
            n3 = n2;
        }
        this.cfr_renamed_6027(lArray);
        int n5 = n2 = 0;
        while (n5 < 5) {
            int n6 = n = 0;
            while (n6 < 2) {
                sprsag sprsag3 = this;
                this.cfr_renamed_6025(lArray);
                this.cfr_renamed_6029(lArray);
                sprsag3.cfr_renamed_6033(lArray);
                int n7 = (n2 << 1) + n;
                sprsag3.cfr_renamed_6034(lArray, sprsag3.cfr_renamed_3[n7]);
                n6 = ++n;
            }
            int n8 = n = 0;
            while (n8 < 8) {
                long l = lArray[n];
                lArray[n++] = (l & 0x1000100010001L) << 5 | (l & 0x2000200020002L) << 12 | (l & 0x4000400040004L) >>> 1 | (l & 0x8000800080008L) << 6 | (l & 0x20002000200020L) << 9 | (l & 0x40004000400040L) >>> 4 | (l & 0x80008000800080L) << 3 | (l & 0x2100210021002100L) >>> 5 | (l & 0x210021002100210L) << 2 | (l & 0x800080008000800L) << 4 | (l & 0x1000100010001000L) >>> 12 | (l & 0x4000400040004000L) >>> 10 | (l & 0x8400840084008400L) >>> 3;
                n8 = n;
            }
            n5 = ++n2;
        }
        this.cfr_renamed_6027(lArray);
        int n9 = n2 = 0;
        while (n9 < 4) {
            this.cfr_renamed_6035(nArray, lArray, n2++);
            n9 = n2;
        }
        int n10 = n2 = 0;
        while (n10 < 16) {
            int n11 = n = 0;
            while (n11 < 4) {
                int n12 = (n2 << 2) + n;
                byte by = (byte)(nArray[n2] >>> (n << 3) & 0xFF);
                arg0[n12] = by;
                n11 = ++n;
            }
            n10 = ++n2;
        }
    }

    private /* synthetic */ int cfr_renamed_6036(byte[] arg0, int arg1) {
        return arg0[arg1] & 0xFF | arg0[arg1 + 1] << 8 & 0xFF00 | arg0[arg1 + 2] << 16 & 0xFF0000 | arg0[arg1 + 3] << 24;
    }

    private /* synthetic */ void cfr_renamed_6035(int[] arg0, long[] arg1, int arg2) {
        long l = arg1[arg2] & 0xFF00FF00FF00FFL;
        long l2 = arg1[arg2 + 4] & 0xFF00FF00FF00FFL;
        long l3 = arg1[arg2] >>> 8 & 0xFF00FF00FF00FFL;
        long l4 = arg1[arg2 + 4] >>> 8 & 0xFF00FF00FF00FFL;
        long l5 = l;
        l = l5 | l5 >>> 8;
        long l6 = l2;
        l2 = l6 | l6 >>> 8;
        long l7 = l3;
        l3 = l7 | l7 >>> 8;
        long l8 = l4;
        l4 = l8 | l8 >>> 8;
        l2 &= 0xFFFF0000FFFFL;
        l3 &= 0xFFFF0000FFFFL;
        l4 &= 0xFFFF0000FFFFL;
        int n = arg2 <<= 2;
        long l9 = l &= 0xFFFF0000FFFFL;
        arg0[arg2] = (int)(l9 | l9 >>> 16);
        long l10 = l2;
        arg0[n + 1] = (int)(l10 | l10 >>> 16);
        long l11 = l3;
        arg0[n + 2] = (int)(l11 | l11 >>> 16);
        long l12 = l4;
        arg0[arg2 + 3] = (int)(l12 | l12 >>> 16);
    }

    private /* synthetic */ int cfr_renamed_6031(int arg0) {
        return arg0 << 16 | arg0 >>> 16;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6037(int[] nArray, int[] nArray2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        v3[0] = v3[0] ^ arg1[0];
        v3[1] = v3[1] ^ arg1[1];
        v2[2] = v2[2] ^ arg1[2];
        v2[3] = v2[3] ^ arg1[3];
        v1[4] = v1[4] ^ arg1[4];
        v1[5] = v1[5] ^ arg1[5];
        v0[6] = v0[6] ^ arg1[6];
        v0[7] = v0[7] ^ arg1[7];
    }

    private /* synthetic */ void cfr_renamed_6033(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = lArray[2];
        long l4 = lArray2[3];
        long l5 = lArray[4];
        long l6 = lArray2[5];
        long l7 = lArray[6];
        long l8 = lArray2[7];
        long l9 = l >>> 16 | l << 48;
        long l10 = l2 >>> 16 | l2 << 48;
        long l11 = l3 >>> 16 | l3 << 48;
        long l12 = l4 >>> 16 | l4 << 48;
        long l13 = l5 >>> 16 | l5 << 48;
        long l14 = l6 >>> 16 | l6 << 48;
        long l15 = l7 >>> 16 | l7 << 48;
        long l16 = l8 >>> 16 | l8 << 48;
        lArray[0] = l8 ^ l16 ^ l9 ^ this.cfr_renamed_6038(l ^ l9);
        lArray2[1] = l ^ l9 ^ l8 ^ l16 ^ l10 ^ this.cfr_renamed_6038(l2 ^ l10);
        lArray[2] = l2 ^ l10 ^ l11 ^ this.cfr_renamed_6038(l3 ^ l11);
        lArray2[3] = l3 ^ l11 ^ l8 ^ l16 ^ l12 ^ this.cfr_renamed_6038(l4 ^ l12);
        lArray[4] = l4 ^ l12 ^ l8 ^ l16 ^ l13 ^ this.cfr_renamed_6038(l5 ^ l13);
        lArray2[5] = l5 ^ l13 ^ l14 ^ this.cfr_renamed_6038(l6 ^ l14);
        lArray[6] = l6 ^ l14 ^ l15 ^ this.cfr_renamed_6038(l7 ^ l15);
        lArray2[7] = l7 ^ l15 ^ l16 ^ this.cfr_renamed_6038(l8 ^ l16);
    }

    public void cfr_renamed_6019(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            arg0[n << 1] = this.cfr_renamed_6036(arg1, arg2 + (n << 2));
            int n3 = (n << 1) + 1;
            int n4 = this.cfr_renamed_6036(arg1, arg2 + (n << 2) + 16);
            arg0[n3] = n4;
            n2 = ++n;
        }
        this.cfr_renamed_6032(arg0);
    }

    public void cfr_renamed_6039(byte[] arg0) {
        int n;
        int[] nArray = new int[8];
        sprsag sprsag2 = this;
        sprsag2.cfr_renamed_6019(nArray, sprsag2.cfr_renamed_1, 0);
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 2) {
                sprsag.cfr_renamed_6024(nArray);
                sprsag sprsag3 = this;
                this.cfr_renamed_6023(nArray);
                sprsag3.cfr_renamed_6030(nArray);
                int n5 = (n << 1) + n3;
                sprsag3.cfr_renamed_6037(nArray, sprsag3.cfr_renamed_4[n5]);
                n4 = ++n3;
            }
            int n6 = n3 = 0;
            while (n6 < 8) {
                int n7 = nArray[n3];
                nArray[n3++] = n7 & 0x81818181 | (n7 & 0x2020202) << 1 | (n7 & 0x4040404) << 2 | (n7 & 0x8080808) << 3 | (n7 & 0x10101010) >>> 3 | (n7 & 0x20202020) >>> 2 | (n7 & 0x40404040) >>> 1;
                n6 = n3;
            }
            n2 = ++n;
        }
        this.cfr_renamed_6032(nArray);
        int n8 = n = 0;
        while (n8 < 4) {
            sprsag sprsag4 = this;
            sprsag4.cfr_renamed_6040(arg0, nArray[n << 1], n << 2);
            int n9 = nArray[(n << 1) + 1];
            int n10 = n << 2;
            sprsag4.cfr_renamed_6040(arg0, n9, n10 + 16);
            n8 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_6040(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = arg2 + n;
            byte by = (byte)(arg1 >> (n << 3));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6034(long[] lArray, long[] lArray2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        v3[0] = v3[0] ^ arg1[0];
        v3[1] = v3[1] ^ arg1[1];
        v2[2] = v2[2] ^ arg1[2];
        v2[3] = v2[3] ^ arg1[3];
        v1[4] = v1[4] ^ arg1[4];
        v1[5] = v1[5] ^ arg1[5];
        v0[6] = v0[6] ^ arg1[6];
        v0[7] = v0[7] ^ arg1[7];
    }

    private /* synthetic */ void cfr_renamed_6026(long[] arg0, int arg1, int[] arg2, int arg3) {
        long l = (long)arg2[arg3] & 0xFFFFFFFFL;
        long l2 = (long)arg2[arg3 + 1] & 0xFFFFFFFFL;
        long l3 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        long l4 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l5 = l;
        l = l5 | l5 << 16;
        long l6 = l2;
        l2 = l6 | l6 << 16;
        long l7 = l3;
        l3 = l7 | l7 << 16;
        long l8 = l4;
        l4 = l8 | l8 << 16;
        l3 &= 0xFFFF0000FFFFL;
        l4 &= 0xFFFF0000FFFFL;
        long l9 = l &= 0xFFFF0000FFFFL;
        l = l9 | l9 << 8;
        long l10 = l2 &= 0xFFFF0000FFFFL;
        l2 = l10 | l10 << 8;
        long l11 = l3;
        l3 = l11 | l11 << 8;
        long l12 = l4;
        l4 = l12 | l12 << 8;
        arg0[arg1] = (l &= 0xFF00FF00FF00FFL) | (l3 &= 0xFF00FF00FF00FFL) << 8;
        arg0[arg1 + 4] = (l2 &= 0xFF00FF00FF00FFL) | (l4 &= 0xFF00FF00FF00FFL) << 8;
    }

    public sprsag() {
        long[][] lArrayArray = new long[10][];
        long[] lArray = new long[8];
        lArray[0] = 2652350495371256459L;
        lArray[1] = -4767360454786055294L;
        lArray[2] = -2778808723033108313L;
        lArray[3] = -6138960262205972599L;
        lArray[4] = 4944264682582508575L;
        lArray[5] = 5312892415214084856L;
        lArray[6] = 390034814247088728L;
        lArray[7] = 2584105839607850161L;
        lArrayArray[0] = lArray;
        long[] lArray2 = new long[8];
        lArray2[0] = -2829930801980875922L;
        lArray2[1] = 9137660425067592590L;
        lArray2[2] = 7974068014816832049L;
        lArray2[3] = -4665944065725157058L;
        lArray2[4] = 2602240152241800734L;
        lArray2[5] = -1525694355931290902L;
        lArray2[6] = 8634660511727056099L;
        lArray2[7] = 1757945485816280992L;
        lArrayArray[1] = lArray2;
        long[] lArray3 = new long[8];
        lArray3[0] = 1181946526362588450L;
        lArray3[1] = -2765192619992380293L;
        lArray3[2] = 3395396416743122529L;
        lArray3[3] = -5116273100549372423L;
        lArray3[4] = -1285454309797503998L;
        lArray3[5] = -3363297609815171261L;
        lArray3[6] = -8360835858392998991L;
        lArray3[7] = -2371352336613968487L;
        lArrayArray[2] = lArray3;
        long[] lArray4 = new long[8];
        lArray4[0] = -2500853454776756032L;
        lArray4[1] = 8465221333286591414L;
        lArray4[2] = 8817016078209461823L;
        lArray4[3] = 9067727467981428858L;
        lArray4[4] = 4244107674518258433L;
        lArray4[5] = -4347326460570889538L;
        lArray4[6] = 1711371409274742987L;
        lArray4[7] = 6486926172609168623L;
        lArrayArray[3] = lArray4;
        long[] lArray5 = new long[8];
        lArray5[0] = 1689001080716996467L;
        lArray5[1] = -491496126278250673L;
        lArray5[2] = 1273395568185090836L;
        lArray5[3] = 5805238412293617850L;
        lArray5[4] = -3441289770925384855L;
        lArray5[5] = 4592753210857527691L;
        lArray5[6] = 7062886034259989751L;
        lArray5[7] = -7974393977033172556L;
        lArrayArray[4] = lArray5;
        long[] lArray6 = new long[8];
        lArray6[0] = -797818098819718290L;
        lArray6[1] = -41460260651793472L;
        lArray6[2] = 476036171179798187L;
        lArray6[3] = 7391697506481003962L;
        lArray6[4] = -855662275170689475L;
        lArray6[5] = -3489340839585811635L;
        lArray6[6] = -4891525734487956488L;
        lArray6[7] = 9110006695579921767L;
        lArrayArray[5] = lArray6;
        long[] lArray7 = new long[8];
        lArray7[0] = -886938081943560790L;
        lArray7[1] = 4212830408327159617L;
        lArray7[2] = -3546674487567282635L;
        lArray7[3] = -1955379422127038289L;
        lArray7[4] = 3174578079917510314L;
        lArray7[5] = 5156046680874954380L;
        lArray7[6] = -318545805834821831L;
        lArray7[7] = -6176414008149462342L;
        lArrayArray[6] = lArray7;
        long[] lArray8 = new long[8];
        lArray8[0] = 2529785914229181047L;
        lArray8[1] = 2966313764524854080L;
        lArray8[2] = 6363694428402697361L;
        lArray8[3] = 8292109690175819701L;
        lArray8[4] = -8497546332135459587L;
        lArray8[5] = -3211108476154815616L;
        lArray8[6] = -5526938793786642321L;
        lArray8[7] = -4975969843627057770L;
        lArrayArray[7] = lArray8;
        long[] lArray9 = new long[8];
        lArray9[0] = 3357847021085574721L;
        lArray9[1] = -4764837212565187058L;
        lArray9[2] = -626391829400648692L;
        lArray9[3] = 2124133995575340009L;
        lArray9[4] = 7425858999829294301L;
        lArray9[5] = -3432032868905637771L;
        lArray9[6] = 1119301198758921294L;
        lArray9[7] = 1907812968586478892L;
        lArrayArray[8] = lArray9;
        long[] lArray10 = new long[8];
        lArray10[0] = -8986524826712832802L;
        lArray10[1] = 3356175496741300052L;
        lArray10[2] = -5764600317639896362L;
        lArray10[3] = 4002747967109689317L;
        lArray10[4] = -8718925159733497197L;
        lArray10[5] = -1938063772587374661L;
        lArray10[6] = -8003749789895945835L;
        lArray10[7] = 7302960353763723932L;
        lArrayArray[9] = lArray10;
        this.cfr_renamed_3 = lArrayArray;
        this.cfr_renamed_4 = new int[10][8];
        sprsag sprsag2 = this;
        sprsag2.cfr_renamed_1 = new byte[64];
        sprsag2.cfr_renamed_2 = 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6027(long[] lArray) {
        void arg0;
        sprsag sprsag2 = this;
        void v1 = arg0;
        sprsag sprsag3 = this;
        void v3 = arg0;
        sprsag sprsag4 = this;
        void v5 = arg0;
        sprsag sprsag5 = this;
        void v7 = arg0;
        this.cfr_renamed_6028((long[])v7, 1, 0, 1);
        sprsag5.cfr_renamed_6028((long[])v7, 1, 2, 3);
        sprsag5.cfr_renamed_6028((long[])arg0, 1, 4, 5);
        this.cfr_renamed_6028((long[])v5, 1, 6, 7);
        sprsag4.cfr_renamed_6028((long[])v5, 2, 0, 2);
        sprsag4.cfr_renamed_6028((long[])arg0, 2, 1, 3);
        this.cfr_renamed_6028((long[])v3, 2, 4, 6);
        sprsag3.cfr_renamed_6028((long[])v3, 2, 5, 7);
        sprsag3.cfr_renamed_6028((long[])arg0, 4, 0, 4);
        this.cfr_renamed_6028((long[])v1, 4, 1, 5);
        sprsag2.cfr_renamed_6028((long[])v1, 4, 2, 6);
        sprsag2.cfr_renamed_6028(lArray, 4, 3, 7);
    }

    private /* synthetic */ long cfr_renamed_6038(long arg0) {
        return arg0 << 32 | arg0 >>> 32;
    }

    public static void cfr_renamed_6041(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg6) {
            int n3 = arg5 + n;
            byte by = (byte)(arg0[arg1 + n] ^ arg2[arg3 + n]);
            arg4[n3] = by;
            n2 = ++n;
        }
    }
}

