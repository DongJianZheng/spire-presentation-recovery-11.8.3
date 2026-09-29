/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkxy;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsph;

public class sprzeg {
    public long[] cfr_renamed_91 = new long[26];
    public byte[] cfr_renamed_0 = new byte[192];
    public int cfr_renamed_1;
    private static long[] cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6555(int arg0) {
        sprzeg sprzeg2 = this;
        int n = sprzeg2.cfr_renamed_1 >> 3;
        sprzeg sprzeg3 = this;
        long[] lArray = sprzeg2.cfr_renamed_91;
        int n2 = (int)sprzeg3.cfr_renamed_91[25] >> 3;
        lArray[n2] = lArray[n2] ^ sprzeg.cfr_renamed_6556(arg0) << (int)(8L * (this.cfr_renamed_91[25] & 7L));
        int n3 = n - 1 >> 3;
        sprzeg3.cfr_renamed_91[n3] = sprzeg3.cfr_renamed_91[n3] ^ sprzeg.cfr_renamed_6556(128) << 8 * (n - 1 & 7);
        sprzeg2.cfr_renamed_91[25] = 0L;
    }

    private /* synthetic */ void cfr_renamed_6557(byte[] arg0, int arg1) {
        int n;
        int n2 = this.cfr_renamed_1 >> 3;
        int n3 = n = 0;
        while (n3 < arg1 && (long)n < this.cfr_renamed_91[25]) {
            int n4 = n;
            byte by = (byte)(this.cfr_renamed_91[(int)((long)n2 - this.cfr_renamed_91[25] + (long)n >> 3)] >> (int)(8L * ((long)n2 - this.cfr_renamed_91[25] + (long)n & 7L)));
            arg0[n4] = by;
            n3 = ++n;
        }
        int n5 = n;
        int n6 = arg1 = arg1 - n;
        this.cfr_renamed_91[25] = this.cfr_renamed_91[25] - (long)n;
        while (n6 > 0) {
            sprzeg.cfr_renamed_6558(this.cfr_renamed_91);
            int n7 = n = 0;
            while (n7 < arg1 && n < n2) {
                int n8 = n5 + n;
                byte by = (byte)(this.cfr_renamed_91[n >> 3] >> 8 * (n & 7));
                arg0[n8] = by;
                n7 = ++n;
            }
            n5 += n;
            n6 = arg1 - n;
            this.cfr_renamed_91[25] = n2 - n;
        }
    }

    private /* synthetic */ void cfr_renamed_6559(int arg0) {
        if (arg0 <= 0 || arg0 >= 1600 || arg0 % 64 != 0) {
            throw new IllegalStateException(sprkxy.cfr_renamed_9(" B?M%E-\f;M=IiZ(@<I"));
        }
        sprzeg sprzeg2 = this;
        this.cfr_renamed_1 = arg0;
        sproze.cfr_renamed_516(sprzeg2.cfr_renamed_91, 0L);
        sproze.cfr_renamed_492(sprzeg2.cfr_renamed_0, (byte)0);
        sprzeg2.cfr_renamed_4 = 0;
        this.cfr_renamed_3 = (1600 - arg0) / 2;
    }

    public void cfr_renamed_6560(byte[] arg0, int arg1) {
        byte[] byArray = new byte[1];
        byArray[0] = 2;
        byte[] byArray2 = byArray;
        sprzeg sprzeg2 = this;
        this.cfr_renamed_6561(arg0, arg1);
        sprzeg2.cfr_renamed_6561(byArray2, 1);
        sprzeg2.cfr_renamed_6555(31);
    }

    public void cfr_renamed_6562(byte[] arg0, int arg1) {
        int n = arg1 & 7;
        this.cfr_renamed_6557(arg0, arg1 - n);
        if (n != 0) {
            byte[] byArray = new byte[8];
            this.cfr_renamed_6557(byArray, 8);
            System.arraycopy(byArray, 0, arg0, arg1 - n, n);
        }
    }

    public sprzeg() {
        this(288);
    }

    public sprzeg(int n) {
        this.cfr_renamed_3446(n);
    }

    private static /* synthetic */ long cfr_renamed_6556(int arg0) {
        return (long)arg0 & 0xFFFFFFFFL;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_3446(int arg0) {
        switch (arg0) {
            case 128: 
            case 224: 
            case 256: 
            case 288: 
            case 384: 
            case 512: {
                this.cfr_renamed_6559(1600 - (arg0 << 1));
                return;
            }
        }
        throw new IllegalArgumentException(sprsph.cfr_renamed_9("*\u001d<8-\u001a/\u0000 T%\u0001;\u0000h\u0016-T'\u001a-T'\u0012hEzLdTzF|XhF}BdTzLpXhGp@dT'\u0006hAyFf"));
    }

    static {
        long[] lArray = new long[24];
        lArray[0] = 1L;
        lArray[1] = 32898L;
        lArray[2] = -9223372036854742902L;
        lArray[3] = -9223372034707259392L;
        lArray[4] = 32907L;
        lArray[5] = 0x80000001L;
        lArray[6] = -9223372034707259263L;
        lArray[7] = -9223372036854743031L;
        lArray[8] = 138L;
        lArray[9] = 136L;
        lArray[10] = 0x80008009L;
        lArray[11] = 0x8000000AL;
        lArray[12] = 0x8000808BL;
        lArray[13] = -9223372036854775669L;
        lArray[14] = -9223372036854742903L;
        lArray[15] = -9223372036854743037L;
        lArray[16] = -9223372036854743038L;
        lArray[17] = -9223372036854775680L;
        lArray[18] = 32778L;
        lArray[19] = -9223372034707292150L;
        lArray[20] = -9223372034707259263L;
        lArray[21] = -9223372036854742912L;
        lArray[22] = 0x80000001L;
        lArray[23] = -9223372034707259384L;
        cfr_renamed_2 = lArray;
    }

    public void cfr_renamed_6563(byte[] arg0, int arg1) {
        this.cfr_renamed_6557(arg0, arg1);
    }

    private static /* synthetic */ void cfr_renamed_6558(long[] arg0) {
        int n;
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        long l8 = arg0[7];
        long l9 = arg0[8];
        long l10 = arg0[9];
        long l11 = arg0[10];
        long l12 = arg0[11];
        long l13 = arg0[12];
        long l14 = arg0[13];
        long l15 = arg0[14];
        long l16 = arg0[15];
        long l17 = arg0[16];
        long l18 = arg0[17];
        long l19 = arg0[18];
        long l20 = arg0[19];
        long l21 = arg0[20];
        long l22 = arg0[21];
        long l23 = arg0[22];
        long l24 = arg0[23];
        long l25 = arg0[24];
        int n2 = n = 0;
        while (n2 < 24) {
            long l26 = l ^ l6 ^ l11 ^ l16 ^ l21;
            long l27 = l2 ^ l7 ^ l12 ^ l17 ^ l22;
            long l28 = l3 ^ l8 ^ l13 ^ l18 ^ l23;
            long l29 = l4 ^ l9 ^ l14 ^ l19 ^ l24;
            long l30 = l5 ^ l10 ^ l15 ^ l20 ^ l25;
            long l31 = (l27 << 1 | l27 >>> -1) ^ l30;
            long l32 = (l28 << 1 | l28 >>> -1) ^ l26;
            long l33 = (l29 << 1 | l29 >>> -1) ^ l27;
            long l34 = (l30 << 1 | l30 >>> -1) ^ l28;
            long l35 = (l26 << 1 | l26 >>> -1) ^ l29;
            l ^= l31;
            l6 ^= l31;
            l11 ^= l31;
            l16 ^= l31;
            l21 ^= l31;
            l2 ^= l32;
            l7 ^= l32;
            l12 ^= l32;
            l17 ^= l32;
            l22 ^= l32;
            l3 ^= l33;
            l8 ^= l33;
            l13 ^= l33;
            l18 ^= l33;
            l23 ^= l33;
            l4 ^= l34;
            l9 ^= l34;
            l14 ^= l34;
            l19 ^= l34;
            l24 ^= l34;
            l5 ^= l35;
            l10 ^= l35;
            l15 ^= l35;
            l20 ^= l35;
            l25 ^= l35;
            l27 = l2 << 1 | l2 >>> 63;
            l2 = l7 << 44 | l7 >>> 20;
            l7 = l10 << 20 | l10 >>> 44;
            l10 = l23 << 61 | l23 >>> 3;
            l23 = l15 << 39 | l15 >>> 25;
            l15 = l21 << 18 | l21 >>> 46;
            l21 = l3 << 62 | l3 >>> 2;
            l3 = l13 << 43 | l13 >>> 21;
            l13 = l14 << 25 | l14 >>> 39;
            l14 = l20 << 8 | l20 >>> 56;
            l20 = l24 << 56 | l24 >>> 8;
            l24 = l16 << 41 | l16 >>> 23;
            l16 = l5 << 27 | l5 >>> 37;
            l5 = l25 << 14 | l25 >>> 50;
            l25 = l22 << 2 | l22 >>> 62;
            l22 = l9 << 55 | l9 >>> 9;
            l9 = l17 << 45 | l17 >>> 19;
            l17 = l6 << 36 | l6 >>> 28;
            l6 = l4 << 28 | l4 >>> 36;
            l4 = l19 << 21 | l19 >>> 43;
            l19 = l18 << 15 | l18 >>> 49;
            l18 = l12 << 10 | l12 >>> 54;
            l12 = l8 << 6 | l8 >>> 58;
            l8 = l11 << 3 | l11 >>> 61;
            l11 = l27;
            l26 = l ^ (l2 ^ 0xFFFFFFFFFFFFFFFFL) & l3;
            l27 = l2 ^ (l3 ^ 0xFFFFFFFFFFFFFFFFL) & l4;
            l3 ^= (l4 ^ 0xFFFFFFFFFFFFFFFFL) & l5;
            l4 ^= (l5 ^ 0xFFFFFFFFFFFFFFFFL) & l;
            l5 ^= (l ^ 0xFFFFFFFFFFFFFFFFL) & l2;
            l = l26;
            l2 = l27;
            l26 = l6 ^ (l7 ^ 0xFFFFFFFFFFFFFFFFL) & l8;
            l27 = l7 ^ (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l9;
            l8 ^= (l9 ^ 0xFFFFFFFFFFFFFFFFL) & l10;
            l9 ^= (l10 ^ 0xFFFFFFFFFFFFFFFFL) & l6;
            l10 ^= (l6 ^ 0xFFFFFFFFFFFFFFFFL) & l7;
            l6 = l26;
            l7 = l27;
            l26 = l11 ^ (l12 ^ 0xFFFFFFFFFFFFFFFFL) & l13;
            l27 = l12 ^ (l13 ^ 0xFFFFFFFFFFFFFFFFL) & l14;
            l13 ^= (l14 ^ 0xFFFFFFFFFFFFFFFFL) & l15;
            l14 ^= (l15 ^ 0xFFFFFFFFFFFFFFFFL) & l11;
            l15 ^= (l11 ^ 0xFFFFFFFFFFFFFFFFL) & l12;
            l11 = l26;
            l12 = l27;
            l26 = l16 ^ (l17 ^ 0xFFFFFFFFFFFFFFFFL) & l18;
            l27 = l17 ^ (l18 ^ 0xFFFFFFFFFFFFFFFFL) & l19;
            l18 ^= (l19 ^ 0xFFFFFFFFFFFFFFFFL) & l20;
            l19 ^= (l20 ^ 0xFFFFFFFFFFFFFFFFL) & l16;
            l20 ^= (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l17;
            l16 = l26;
            l17 = l27;
            l26 = l21 ^ (l22 ^ 0xFFFFFFFFFFFFFFFFL) & l23;
            l27 = l22 ^ (l23 ^ 0xFFFFFFFFFFFFFFFFL) & l24;
            l23 ^= (l24 ^ 0xFFFFFFFFFFFFFFFFL) & l25;
            l24 ^= (l25 ^ 0xFFFFFFFFFFFFFFFFL) & l21;
            l25 ^= (l21 ^ 0xFFFFFFFFFFFFFFFFL) & l22;
            l21 = l26;
            l22 = l27;
            l ^= cfr_renamed_2[n++];
            n2 = n;
        }
        arg0[0] = l;
        arg0[1] = l2;
        arg0[2] = l3;
        arg0[3] = l4;
        arg0[4] = l5;
        arg0[5] = l6;
        arg0[6] = l7;
        arg0[7] = l8;
        arg0[8] = l9;
        arg0[9] = l10;
        arg0[10] = l11;
        arg0[11] = l12;
        arg0[12] = l13;
        arg0[13] = l14;
        arg0[14] = l15;
        arg0[15] = l16;
        arg0[16] = l17;
        arg0[17] = l18;
        arg0[18] = l19;
        arg0[19] = l20;
        arg0[20] = l21;
        arg0[21] = l22;
        arg0[22] = l23;
        arg0[23] = l24;
        arg0[24] = l25;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6564(byte[] byArray, byte[] byArray2, int n, byte[] byArray3) {
        void arg0;
        void arg2;
        void arg1;
        sprzeg sprzeg2 = this;
        sproze.cfr_renamed_516(this.cfr_renamed_91, 0L);
        sprzeg2.cfr_renamed_6561((byte[])arg1, (int)arg2);
        sprzeg2.cfr_renamed_6561(byArray3, byArray3.length);
        sprzeg sprzeg3 = this;
        sprzeg3.cfr_renamed_6555(31);
        sprzeg3.cfr_renamed_6557((byte[])arg0, 64);
    }

    private /* synthetic */ void cfr_renamed_6561(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = this.cfr_renamed_1 >> 3;
        int n5 = arg1;
        while ((long)n5 + this.cfr_renamed_91[25] >= (long)n4) {
            int n6 = n2 = 0;
            while ((long)n6 < (long)n4 - this.cfr_renamed_91[25]) {
                sprzeg sprzeg2 = this;
                int n7 = n = (int)(sprzeg2.cfr_renamed_91[25] + (long)n2) >> 3;
                long l = sprzeg2.cfr_renamed_91[n7] ^ sprzeg.cfr_renamed_6556(arg0[n2 + n3] & 0xFF) << (int)(8L * (this.cfr_renamed_91[25] + (long)n2 & 7L));
                sprzeg2.cfr_renamed_91[n7] = l;
                n6 = ++n2;
            }
            arg1 = (int)((long)arg1 - ((long)n4 - this.cfr_renamed_91[25]));
            n3 = (int)((long)n3 + ((long)n4 - this.cfr_renamed_91[25]));
            n5 = arg1;
            sprzeg sprzeg3 = this;
            sprzeg3.cfr_renamed_91[25] = 0L;
            sprzeg.cfr_renamed_6558(sprzeg3.cfr_renamed_91);
        }
        int n8 = n2 = 0;
        while (n8 < arg1) {
            sprzeg sprzeg4 = this;
            int n9 = n = (int)(sprzeg4.cfr_renamed_91[25] + (long)n2) >> 3;
            long l = sprzeg4.cfr_renamed_91[n9] ^ sprzeg.cfr_renamed_6556(arg0[n2 + n3] & 0xFF) << (int)(8L * (this.cfr_renamed_91[25] + (long)n2 & 7L));
            sprzeg4.cfr_renamed_91[n9] = l;
            n8 = ++n2;
        }
        this.cfr_renamed_91[25] = this.cfr_renamed_91[25] + (long)arg1;
    }

    public void cfr_renamed_6565(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        byte[] byArray = new byte[1];
        byArray[0] = 1;
        sprzeg sprzeg2 = this;
        this.cfr_renamed_6561(arg0, arg2);
        sprzeg2.cfr_renamed_6561(arg1, arg3);
        sprzeg2.cfr_renamed_6561(byArray, byArray.length);
        this.cfr_renamed_6555(31);
    }
}

