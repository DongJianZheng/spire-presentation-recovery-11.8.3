/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprzwf {
    private final int cfr_renamed_2;
    private final long cfr_renamed_3;
    private final int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6589(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, long[] arg6, int arg7, int arg8, int arg9) {
        int n;
        int n2 = n = 0;
        while (n2 < arg9) {
            int n3 = n;
            arg0[n3 + arg1] = arg4[n + arg5] ^ arg4[n + arg8 + arg5];
            long l = arg6[n + arg7] ^ arg6[n + arg8 + arg7];
            arg2[n3 + arg3] = l;
            n2 = ++n;
        }
        if (arg9 < arg8) {
            int n4 = arg9;
            arg0[n4 + arg1] = arg4[arg9 + arg5];
            arg2[n4 + arg3] = arg6[arg9 + arg7];
        }
    }

    private /* synthetic */ void cfr_renamed_6590(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, int arg6, long[] arg7, int arg8) {
        if (arg6 == 1) {
            this.cfr_renamed_6591(arg0, arg1, arg2[0 + arg3], arg4[0 + arg5]);
            return;
        }
        int n = arg6 / 2;
        int n2 = (arg6 + 1) / 2;
        int n3 = arg8;
        int n4 = n3 + n2;
        int n5 = n4 + n2;
        int n6 = arg1 + n2 * 2;
        int n7 = arg3 + n2;
        int n8 = arg5 + n2;
        sprzwf sprzwf2 = this;
        sprzwf sprzwf3 = this;
        sprzwf3.cfr_renamed_6590(arg0, arg1, arg2, arg3, arg4, arg5, n2, arg7, arg8 += 4 * n2);
        sprzwf3.cfr_renamed_6590(arg0, n6, arg2, n7, arg4, n8, n, arg7, arg8);
        this.cfr_renamed_6589(arg7, n3, arg7, n4, arg2, arg3, arg4, arg5, n2, n);
        sprzwf2.cfr_renamed_6590(arg7, n5, arg7, n3, arg7, n4, n2, arg7, arg8);
        sprzwf2.cfr_renamed_6592(arg0, arg1, arg7, n5, arg0, n6, n2, n);
    }

    private /* synthetic */ void cfr_renamed_6593(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            long l = arg1[n + this.cfr_renamed_4 - 1] >>> (this.cfr_renamed_2 & 0x3F);
            long l2 = arg1[n + this.cfr_renamed_4] << (int)(64L - ((long)this.cfr_renamed_2 & 0x3FL));
            int n3 = n++;
            arg0[n3] = arg1[n3] ^ l ^ l2;
            n2 = n;
        }
        int n4 = this.cfr_renamed_4 - 1;
        arg0[n4] = arg0[n4] & this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_6591(long[] arg0, int arg1, long arg2, long arg3) {
        long l;
        int n;
        long l2 = 0L;
        long l3 = 0L;
        long[] lArray = new long[16];
        long[] lArray2 = new long[4];
        lArray[0] = 0L;
        lArray[1] = arg3 & 0xFFFFFFFFFFFFFFFL;
        lArray[2] = lArray[1] << 1;
        lArray[3] = lArray[2] ^ lArray[1];
        lArray[4] = lArray[2] << 1;
        lArray[5] = lArray[4] ^ lArray[1];
        lArray[6] = lArray[3] << 1;
        lArray[7] = lArray[6] ^ lArray[1];
        lArray[8] = lArray[4] << 1;
        lArray[9] = lArray[8] ^ lArray[1];
        lArray[10] = lArray[5] << 1;
        lArray[11] = lArray[10] ^ lArray[1];
        lArray[12] = lArray[6] << 1;
        lArray[13] = lArray[12] ^ lArray[1];
        lArray[14] = lArray[7] << 1;
        lArray[15] = lArray[14] ^ lArray[1];
        long l4 = 0L;
        long l5 = arg2 & 0xFL;
        int n2 = n = 0;
        while (n2 < 16) {
            l = l5 - (long)n;
            long l6 = lArray[n];
            long l7 = l;
            l4 ^= l6 & -(1L - ((l7 | -l7) >>> 63));
            n2 = ++n;
        }
        l3 = l4;
        l2 = 0L;
        int n3 = n = 4;
        while (n3 < 64) {
            int n4;
            l4 = 0L;
            l = arg2 >> n & 0xFL;
            int n5 = n4 = 0;
            while (n5 < 16) {
                long l8 = l - (long)n4;
                long l9 = lArray[n4];
                long l10 = l8;
                l4 ^= l9 & -(1L - ((l10 | -l10) >>> 63));
                n5 = ++n4;
            }
            l3 ^= l4 << n;
            l2 ^= l4 >>> 64 - n;
            n3 = n = (int)((byte)(n + 4));
        }
        lArray2[0] = -(arg3 >> 60 & 1L);
        lArray2[1] = -(arg3 >> 61 & 1L);
        lArray2[2] = -(arg3 >> 62 & 1L);
        lArray2[3] = -(arg3 >> 63 & 1L);
        l3 ^= arg2 << 60 & lArray2[0];
        l2 ^= arg2 >>> 4 & lArray2[0];
        l3 ^= arg2 << 61 & lArray2[1];
        l2 ^= arg2 >>> 3 & lArray2[1];
        l3 ^= arg2 << 62 & lArray2[2];
        l2 ^= arg2 >>> 2 & lArray2[2];
        arg0[0 + arg1] = l3 ^= arg2 << 63 & lArray2[3];
        arg0[1 + arg1] = l2 ^= arg2 >>> 1 & lArray2[3];
    }

    private /* synthetic */ void cfr_renamed_6592(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, int arg6, int arg7) {
        int n;
        int n2 = n = 0;
        while (n2 < 2 * arg6) {
            arg2[++n + arg3] = arg2[n + arg3] ^ arg0[n + arg1];
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < 2 * arg7) {
            arg2[++n + arg3] = arg2[n + arg3] ^ arg4[n + arg5];
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < 2 * arg6) {
            arg0[++n + arg6 + arg1] = arg0[n + arg6 + arg1] ^ arg2[n + arg3];
            n4 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzwf(int n, int n2, long l) {
        void arg1;
        void arg0;
        sprzwf sprzwf2 = this;
        this.cfr_renamed_4 = arg0;
        sprzwf2.cfr_renamed_2 = arg1;
        sprzwf2.cfr_renamed_3 = l;
    }

    public static void cfr_renamed_6587(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n;
            long l = arg1[n3] ^ arg2[n];
            arg0[n3] = l;
            n2 = ++n;
        }
    }

    public void cfr_renamed_6586(long[] arg0, long[] arg1, long[] arg2) {
        sprzwf sprzwf2 = this;
        long[] lArray = new long[sprzwf2.cfr_renamed_4 << 3];
        long[] lArray2 = new long[(sprzwf2.cfr_renamed_4 << 1) + 1];
        sprzwf2.cfr_renamed_6590(lArray2, 0, arg1, 0, arg2, 0, this.cfr_renamed_4, lArray, 0);
        sprzwf2.cfr_renamed_6593(arg0, lArray2);
    }
}

