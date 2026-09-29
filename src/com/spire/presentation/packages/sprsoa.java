/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprp;
import com.spire.presentation.packages.sprzbr;

public class sprsoa {
    public byte[] cfr_renamed_2;
    public sprp cfr_renamed_3;
    public int cfr_renamed_4;

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprkrl.cfr_renamed_9("\u0011!<g&`:!$%r!r.7'34;67`;.\"5&`>%<'&(s"));
        }
        int n = 0;
        int n2 = this.cfr_renamed_2.length - this.cfr_renamed_4;
        if (arg2 > n2) {
            sprsoa sprsoa2 = this;
            System.arraycopy(arg0, arg1, sprsoa2.cfr_renamed_2, sprsoa2.cfr_renamed_4, n2);
            sprsoa sprsoa3 = this;
            n += sprsoa3.cfr_renamed_3.cfr_renamed_4(sprsoa3.cfr_renamed_2, 0, this.cfr_renamed_2.length, arg3, arg4);
            this.cfr_renamed_4 = 0;
            arg4 += n;
            int n3 = arg2 -= n2;
            int n4 = n3 - n3 % this.cfr_renamed_2.length;
            n += this.cfr_renamed_3.cfr_renamed_4(arg0, arg1 += n2, n4, arg3, arg4);
            arg2 -= n4;
            arg1 += n4;
        }
        if (arg2 != 0) {
            sprsoa sprsoa4 = this;
            System.arraycopy(arg0, arg1, sprsoa4.cfr_renamed_2, this.cfr_renamed_4, arg2);
            sprsoa4.cfr_renamed_4 += arg2;
        }
        return n;
    }

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) {
        int n = 0;
        this.cfr_renamed_2[this.cfr_renamed_4++] = arg0;
        sprsoa sprsoa2 = this;
        if (sprsoa2.cfr_renamed_4 == sprsoa2.cfr_renamed_2.length) {
            sprsoa sprsoa3 = this;
            n = sprsoa3.cfr_renamed_3.cfr_renamed_4(sprsoa3.cfr_renamed_2, 0, this.cfr_renamed_2.length, arg1, arg2);
            this.cfr_renamed_4 = 0;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprsoa(sprp sprp2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (n % arg0.cfr_renamed_2() != 0) {
            throw new IllegalArgumentException(sprzbr.cfr_renamed_9("\u001fU\u001bF\u0018R]S\u0014Z\u0018\u0000\u0013O\t\u0000\u0010U\u0011T\u0014P\u0011E]O\u001b\u0000\u0014N\rU\t\u0000\u001fL\u0012C\u0016\u0000\u000eI\u0007E"));
        }
        this.cfr_renamed_2 = new byte[arg1];
        this.cfr_renamed_4 = 0;
    }
}

