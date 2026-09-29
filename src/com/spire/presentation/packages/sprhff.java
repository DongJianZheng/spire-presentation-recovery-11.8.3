/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprvcf;
import com.spire.presentation.packages.sprwff;

public class sprhff
extends sprvcf {
    private String cfr_renamed_86;
    private sprwff cfr_renamed_152;
    private sprwff cfr_renamed_112;
    private int cfr_renamed_119;
    private sprnhf cfr_renamed_91;
    private spraye cfr_renamed_0;
    private int cfr_renamed_1;
    private spricf cfr_renamed_2;
    private spricf[] cfr_renamed_3;
    private spraye cfr_renamed_4;

    public spraye cfr_renamed_1153() {
        return this.cfr_renamed_0;
    }

    public spraye cfr_renamed_1149() {
        return this.cfr_renamed_4;
    }

    public sprnhf cfr_renamed_845() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprhff(int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, byte[] byArray6, byte[][] byArray7) {
        void arg8;
        int n3;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhff sprhff2 = this;
        sprhff sprhff3 = this;
        sprhff sprhff4 = this;
        super(true, null);
        sprhff4.cfr_renamed_1 = arg0;
        sprhff4.cfr_renamed_119 = arg1;
        sprhff sprhff5 = this;
        sprhff3.cfr_renamed_91 = new sprnhf((byte[])arg2);
        sprhff5.cfr_renamed_2 = new spricf(this.cfr_renamed_91, (byte[])arg3);
        sprhff3.cfr_renamed_4 = new spraye((byte[])arg4);
        sprhff3.cfr_renamed_112 = new sprwff((byte[])arg5);
        sprhff2.cfr_renamed_152 = new sprwff((byte[])arg6);
        sprhff2.cfr_renamed_0 = new spraye((byte[])arg7);
        sprhff2.cfr_renamed_3 = new spricf[byArray7.length];
        int n4 = n3 = 0;
        while (n4 < ((void)arg8).length) {
            int n5 = n3;
            spricf spricf2 = new spricf(this.cfr_renamed_91, (byte[])arg8[n3]);
            this.cfr_renamed_3[n5] = spricf2;
            n4 = ++n3;
        }
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_119;
    }

    public sprwff cfr_renamed_1151() {
        return this.cfr_renamed_152;
    }

    public sprwff cfr_renamed_1152() {
        return this.cfr_renamed_112;
    }

    public spricf[] cfr_renamed_1148() {
        return this.cfr_renamed_3;
    }

    public spricf cfr_renamed_1147() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhff(int n, int n2, sprnhf sprnhf2, spricf spricf2, sprwff sprwff2, sprwff sprwff3, spraye spraye2) {
        void arg5;
        void arg4;
        void arg6;
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        sprhff sprhff2 = this;
        sprhff sprhff3 = this;
        sprhff sprhff4 = this;
        sprhff sprhff5 = this;
        super(true, null);
        sprhff5.cfr_renamed_119 = arg1;
        sprhff5.cfr_renamed_1 = arg0;
        sprhff4.cfr_renamed_91 = arg2;
        sprhff4.cfr_renamed_2 = arg3;
        sprhff3.cfr_renamed_4 = arg6;
        sprhff3.cfr_renamed_112 = arg4;
        sprhff2.cfr_renamed_152 = arg5;
        sprhff2.cfr_renamed_0 = sprtef.cfr_renamed_5488(sprnhf2, (spricf)arg3);
        sprhff2.cfr_renamed_3 = new sprmze((sprnhf)arg2, (spricf)arg3).cfr_renamed_812();
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }
}

