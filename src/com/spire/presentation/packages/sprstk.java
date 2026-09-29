/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprjhb;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxpe;
import com.spire.presentation.packages.sprybl;

public class sprstk
implements sprmr {
    private int[] cfr_renamed_0 = null;
    private boolean cfr_renamed_1;
    private static final int cfr_renamed_2 = 65537;
    private static final int cfr_renamed_3 = 65535;
    public static final int cfr_renamed_4 = 8;

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    private /* synthetic */ int cfr_renamed_3562(byte[] arg0, int arg1) {
        return (arg0[arg1] << 8 & 0xFF00) + (arg0[arg1 + 1] & 0xFF);
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

    public sprstk() {
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128));
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg1 instanceof sprtpk) {
            byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
            this.cfr_renamed_0 = this.cfr_renamed_3661(arg0, byArray);
            this.cfr_renamed_1 = arg0;
            sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjhb.cfr_renamed_9("EgZh@`H)\\h^hAlXl^)\\h_zIm\f}C)eMiH\f`B`X)\u0001)")).append(arg1.getClass().getName()).toString());
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_0 == null) {
            throw new IllegalStateException(sprxpe.cfr_renamed_9("BZN_+{eybpn>eq\u007f>bpbjb\u007fgwx{o"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprjhb.cfr_renamed_9("Eg\\|X)N|JoI{\f}Cf\fzDf^}"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(sprxpe.cfr_renamed_9("dk\u007fn~j+|~xm{y>\u007fqd>xvdl\u007f"));
        }
        sprstk sprstk2 = this;
        sprstk2.cfr_renamed_3659(sprstk2.cfr_renamed_0, arg0, arg1, arg2, arg3);
        return 8;
    }

    private /* synthetic */ void cfr_renamed_3659(int[] arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = 0;
        sprstk sprstk2 = this;
        int n3 = this.cfr_renamed_3562(arg1, arg2);
        int n4 = this.cfr_renamed_3562(arg1, arg2 + 2);
        int n5 = sprstk2.cfr_renamed_3562(arg1, arg2 + 4);
        int n6 = sprstk2.cfr_renamed_3562(arg1, arg2 + 6);
        int n7 = n = 0;
        while (n7 < 8) {
            sprstk sprstk3 = this;
            n3 = sprstk3.cfr_renamed_3660(n3, arg0[n2]);
            int n8 = n4 + arg0[++n2];
            n4 = n8;
            n4 = n8 & 0xFFFF;
            int n9 = n5 + arg0[++n2];
            n5 = n9;
            n5 = n9 & 0xFFFF;
            n6 = sprstk3.cfr_renamed_3660(n6, arg0[++n2]);
            int n10 = n4;
            int n11 = n5;
            n5 ^= n3;
            n4 ^= n6;
            n5 = sprstk3.cfr_renamed_3660(n5, arg0[++n2]);
            n4 += n5;
            n4 &= 0xFFFF;
            n4 = sprstk3.cfr_renamed_3660(n4, arg0[++n2]);
            ++n2;
            n5 += n4;
            n3 ^= n4;
            n6 ^= (n5 &= 0xFFFF);
            n4 ^= n11;
            n5 ^= n10;
            n7 = ++n;
        }
        sprstk sprstk4 = this;
        int n12 = sprstk4.cfr_renamed_3660(n3, arg0[n2]);
        sprstk4.cfr_renamed_3582(n12, arg3, arg4);
        int n13 = n5 + arg0[++n2];
        sprstk4.cfr_renamed_3582(n13, arg3, arg4 + 2);
        int n14 = n4 + arg0[++n2];
        sprstk4.cfr_renamed_3582(n14, arg3, arg4 + 4);
        sprstk4.cfr_renamed_3582(sprstk4.cfr_renamed_3660(n6, arg0[++n2]), arg3, arg4 + 6);
    }

    @Override
    public void cfr_renamed_41() {
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

    private /* synthetic */ int[] cfr_renamed_3657(int[] arg0) {
        int n;
        int n2 = 52;
        int[] nArray = new int[52];
        int n3 = 0;
        sprstk sprstk2 = this;
        sprstk sprstk3 = this;
        int n4 = sprstk3.cfr_renamed_3658(arg0[n3]);
        int n5 = sprstk3.cfr_renamed_3656(arg0[++n3]);
        int n6 = sprstk2.cfr_renamed_3656(arg0[++n3]);
        int n7 = sprstk2.cfr_renamed_3658(arg0[++n3]);
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
            sprstk sprstk4 = this;
            n4 = this.cfr_renamed_3658(arg0[n3]);
            n5 = this.cfr_renamed_3656(arg0[++n3]);
            n6 = sprstk4.cfr_renamed_3656(arg0[++n3]);
            n7 = sprstk4.cfr_renamed_3658(arg0[++n3]);
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
        sprstk sprstk5 = this;
        n4 = sprstk5.cfr_renamed_3658(arg0[n3]);
        n5 = sprstk5.cfr_renamed_3656(arg0[++n3]);
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
    public String cfr_renamed_1315() {
        return sprjhb.cfr_renamed_9("eMiH");
    }

    public int cfr_renamed_3656(int arg0) {
        return 0 - arg0 & 0xFFFF;
    }

    private /* synthetic */ int cfr_renamed_3660(int arg0, int arg1) {
        int n;
        return (arg0 == 0 ? (arg0 = 65537 - arg1) : (arg1 == 0 ? (arg0 = 65537 - arg0) : (arg0 = arg1 - arg0 + ((arg1 = (n = arg0 * arg1) & 0xFFFF) < (arg0 = n >>> 16) ? 1 : 0)))) & 0xFFFF;
    }

    private /* synthetic */ int[] cfr_renamed_3661(boolean arg0, byte[] arg1) {
        if (arg0) {
            return this.cfr_renamed_3323(arg1);
        }
        sprstk sprstk2 = this;
        return sprstk2.cfr_renamed_3657(sprstk2.cfr_renamed_3323(arg1));
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
}

