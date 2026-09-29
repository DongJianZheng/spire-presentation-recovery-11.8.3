/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtck;
import com.spire.presentation.packages.sprvj;
import com.spire.presentation.packages.sprzgn;

public class sprdme {
    public byte[] cfr_renamed_2;
    public int cfr_renamed_3;
    public sprvj cfr_renamed_4;

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprtck.cfr_renamed_9("W6zp`w|6b24649q0u#}!qw}9d\"`wx2z0`?5"));
        }
        int n = 0;
        int n2 = this.cfr_renamed_2.length - this.cfr_renamed_3;
        if (arg2 > n2) {
            sprdme sprdme2 = this;
            System.arraycopy(arg0, arg1, sprdme2.cfr_renamed_2, sprdme2.cfr_renamed_3, n2);
            sprdme sprdme3 = this;
            n += sprdme3.cfr_renamed_4.cfr_renamed_4(sprdme3.cfr_renamed_2, 0, this.cfr_renamed_2.length, arg3, arg4);
            this.cfr_renamed_3 = 0;
            arg4 += n;
            int n3 = arg2 -= n2;
            int n4 = n3 - n3 % this.cfr_renamed_2.length;
            n += this.cfr_renamed_4.cfr_renamed_4(arg0, arg1 += n2, n4, arg3, arg4);
            arg2 -= n4;
            arg1 += n4;
        }
        if (arg2 != 0) {
            sprdme sprdme4 = this;
            System.arraycopy(arg0, arg1, sprdme4.cfr_renamed_2, this.cfr_renamed_3, arg2);
            sprdme4.cfr_renamed_3 += arg2;
        }
        return n;
    }

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) {
        int n = 0;
        this.cfr_renamed_2[this.cfr_renamed_3++] = arg0;
        sprdme sprdme2 = this;
        if (sprdme2.cfr_renamed_3 == sprdme2.cfr_renamed_2.length) {
            sprdme sprdme3 = this;
            n = sprdme3.cfr_renamed_4.cfr_renamed_4(sprdme3.cfr_renamed_2, 0, this.cfr_renamed_2.length, arg1, arg2);
            this.cfr_renamed_3 = 0;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprdme(sprvj sprvj2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (n % arg0.cfr_renamed_2() != 0) {
            throw new IllegalArgumentException(sprzgn.cfr_renamed_9("[z_i\\}\u0019|Pu\\/W`M/TzU{P\u007fUj\u0019`_/PaIzM/[cVlR/JfCj"));
        }
        this.cfr_renamed_2 = new byte[arg1];
        this.cfr_renamed_3 = 0;
    }
}

