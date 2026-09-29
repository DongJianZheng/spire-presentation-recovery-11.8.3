/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;

public class sprsed
implements sprff {
    public static final int cfr_renamed_1 = 8;
    private int[] cfr_renamed_2 = null;
    private static final int cfr_renamed_3 = 65535;
    private static final int cfr_renamed_4 = 65537;

    public int cfr_renamed_3656(int arg0) {
        return 0 - arg0 & 0xFFFF;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprjxq.cfr_renamed_9("0\u0002<\u0007");
    }

    private /* synthetic */ int[] cfr_renamed_3657(int[] arg0) {
        int n;
        int n2 = 52;
        int[] nArray = new int[52];
        int n3 = 0;
        sprsed sprsed2 = this;
        sprsed sprsed3 = this;
        int n4 = sprsed3.cfr_renamed_3658(arg0[n3]);
        int n5 = sprsed3.cfr_renamed_3656(arg0[++n3]);
        int n6 = sprsed2.cfr_renamed_3656(arg0[++n3]);
        int n7 = sprsed2.cfr_renamed_3658(arg0[++n3]);
        ++n3;
        int[] nArray2 = nArray;
        int n8 = --n2;
        nArray2[n8] = n7;
        int n9 = --n2;
        nArray[n9] = n6;
        int n10 = --n2;
        nArray2[n10] = n5;
        nArray2[--n2] = n4;
        int n11 = n = 1;
        while (n11 < 8) {
            n4 = arg0[n3];
            n5 = arg0[++n3];
            ++n3;
            int[] nArray3 = nArray;
            int n12 = --n2;
            nArray[n12] = n5;
            nArray[--n2] = n4;
            sprsed sprsed4 = this;
            n4 = this.cfr_renamed_3658(arg0[n3]);
            n5 = this.cfr_renamed_3656(arg0[++n3]);
            n6 = sprsed4.cfr_renamed_3656(arg0[++n3]);
            n7 = sprsed4.cfr_renamed_3658(arg0[++n3]);
            ++n3;
            int n13 = --n2;
            nArray3[n13] = n7;
            int n14 = --n2;
            nArray[n14] = n5;
            int n15 = --n2;
            nArray3[n15] = n6;
            nArray3[--n2] = n4;
            n11 = ++n;
        }
        n4 = arg0[n3];
        n5 = arg0[++n3];
        ++n3;
        int[] nArray4 = nArray;
        int[] nArray5 = nArray;
        int n16 = --n2;
        nArray[n16] = n5;
        nArray[--n2] = n4;
        sprsed sprsed5 = this;
        n4 = sprsed5.cfr_renamed_3658(arg0[n3]);
        n5 = sprsed5.cfr_renamed_3656(arg0[++n3]);
        n6 = this.cfr_renamed_3656(arg0[++n3]);
        n7 = this.cfr_renamed_3658(arg0[++n3]);
        int n17 = --n2;
        nArray4[n17] = n7;
        int n18 = --n2;
        nArray[n18] = n6;
        int n19 = --n2;
        nArray5[n19] = n5;
        nArray4[--n2] = n4;
        return nArray5;
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ void cfr_renamed_3659(int[] arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = 0;
        sprsed sprsed2 = this;
        int n3 = this.cfr_renamed_3562(arg1, arg2);
        int n4 = this.cfr_renamed_3562(arg1, arg2 + 2);
        int n5 = sprsed2.cfr_renamed_3562(arg1, arg2 + 4);
        int n6 = sprsed2.cfr_renamed_3562(arg1, arg2 + 6);
        int n7 = n = 0;
        while (n7 < 8) {
            sprsed sprsed3 = this;
            n3 = sprsed3.cfr_renamed_3660(n3, arg0[n2]);
            int n8 = n4 + arg0[++n2];
            n4 = n8;
            n4 = n8 & 0xFFFF;
            int n9 = n5 + arg0[++n2];
            n5 = n9;
            n5 = n9 & 0xFFFF;
            n6 = sprsed3.cfr_renamed_3660(n6, arg0[++n2]);
            int n10 = n4;
            int n11 = n5;
            n5 ^= n3;
            n4 ^= n6;
            n5 = sprsed3.cfr_renamed_3660(n5, arg0[++n2]);
            n4 += n5;
            n4 &= 0xFFFF;
            n4 = sprsed3.cfr_renamed_3660(n4, arg0[++n2]);
            ++n2;
            n5 += n4;
            n3 ^= n4;
            n6 ^= (n5 &= 0xFFFF);
            n4 ^= n11;
            n5 ^= n10;
            n7 = ++n;
        }
        sprsed sprsed4 = this;
        int n12 = sprsed4.cfr_renamed_3660(n3, arg0[n2]);
        sprsed4.cfr_renamed_3582(n12, arg3, arg4);
        int n13 = n5 + arg0[++n2];
        sprsed4.cfr_renamed_3582(n13, arg3, arg4 + 2);
        int n14 = n4 + arg0[++n2];
        sprsed4.cfr_renamed_3582(n14, arg3, arg4 + 4);
        sprsed4.cfr_renamed_3582(sprsed4.cfr_renamed_3660(n6, arg0[++n2]), arg3, arg4 + 6);
    }

    private /* synthetic */ int cfr_renamed_3658(int arg0) {
        int n;
        if (arg0 < 2) {
            return arg0;
        }
        int n2 = 1;
        int n3 = 65537 / arg0;
        int n4 = n = 65537 % arg0;
        while (n4 != 1) {
            int n5 = arg0 / n;
            n2 = n2 + n3 * n5 & 0xFFFF;
            if ((arg0 %= n) == 1) {
                return n2;
            }
            n5 = n / arg0;
            n3 = n3 + n2 * n5 & 0xFFFF;
            n4 = n %= arg0;
        }
        return 1 - n3 & 0xFFFF;
    }

    private /* synthetic */ int cfr_renamed_3562(byte[] arg0, int arg1) {
        return (arg0[arg1] << 8 & 0xFF00) + (arg0[arg1 + 1] & 0xFF);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3582(int n, byte[] byArray, int n2) {
        void arg0;
        void arg1;
        void v0 = arg1;
        v0[arg2] = (byte)(arg0 >>> 8);
        v0[n2 + 1] = (byte)arg0;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    private /* synthetic */ int[] cfr_renamed_3323(byte[] arg0) {
        int n;
        int[] nArray = new int[52];
        if (arg0.length < 16) {
            byte[] byArray = new byte[16];
            System.arraycopy(arg0, 0, byArray, byArray.length - arg0.length, arg0.length);
            arg0 = byArray;
        }
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = n++;
            nArray[n3] = this.cfr_renamed_3562(arg0, n3 * 2);
            n2 = n;
        }
        int n4 = n = 8;
        while (n4 < 52) {
            if ((n & 7) < 6) {
                int n5 = n;
                nArray[n5] = ((nArray[n5 - 7] & 0x7F) << 9 | nArray[n - 6] >> 7) & 0xFFFF;
            } else if ((n & 7) == 6) {
                int n6 = n;
                nArray[n6] = ((nArray[n6 - 7] & 0x7F) << 9 | nArray[n - 14] >> 7) & 0xFFFF;
            } else {
                int n7 = n;
                nArray[n7] = ((nArray[n - 15] & 0x7F) << 9 | nArray[n7 - 14] >> 7) & 0xFFFF;
            }
            n4 = ++n;
        }
        return nArray;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprewi.cfr_renamed_9("\u0014^\u0018[}\u007f3}4t8:3u):4t4n4{1s.\u007f9"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprjkd(sprjxq.cfr_renamed_9("\u0010(\t3\rf\u001b3\u001f \u001c4Y2\u0016)Y5\u0011)\u000b2"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new spreid(sprewi.cfr_renamed_9("2o)j(n}x(|;\u007f/:)u2:.r2h)"));
        }
        sprsed sprsed2 = this;
        sprsed2.cfr_renamed_3659(sprsed2.cfr_renamed_2, arg0, arg1, arg2, arg3);
        return 8;
    }

    private /* synthetic */ int cfr_renamed_3660(int arg0, int arg1) {
        int n;
        return (arg0 == 0 ? (arg0 = 65537 - arg1) : (arg1 == 0 ? (arg0 = 65537 - arg0) : (arg0 = arg1 - arg0 + ((arg1 = (n = arg0 * arg1) & 0xFFFF) < (arg0 = n >>> 16) ? 1 : 0)))) & 0xFFFF;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_2 = this.cfr_renamed_3661(arg0, ((sprnld)arg1).cfr_renamed_1521());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjxq.cfr_renamed_9("\u0010(\u000f'\u0015/\u001df\t'\u000b'\u0014#\r#\u000bf\t'\n5\u001c\"Y2\u0016f0\u0002<\u0007Y/\u0017/\rfTf")).append(arg1.getClass().getName()).toString());
    }

    private /* synthetic */ int[] cfr_renamed_3661(boolean arg0, byte[] arg1) {
        if (arg0) {
            return this.cfr_renamed_3323(arg1);
        }
        sprsed sprsed2 = this;
        return sprsed2.cfr_renamed_3657(sprsed2.cfr_renamed_3323(arg1));
    }
}

