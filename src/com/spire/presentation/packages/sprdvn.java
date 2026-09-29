/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprdvn {
    private String cfr_renamed_1;
    private sprzyn cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprpdja cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14995(sprzyn sprzyn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        v3.cfr_renamed_14968(this.cfr_renamed_1);
        v3.cfr_renamed_14970((byte)-117);
        v2.cfr_renamed_14973((byte)91);
        v2.cfr_renamed_15118((this.cfr_renamed_4.cfr_renamed_806() & 0xFFFFFFFFL) + 16L);
        v1.cfr_renamed_14970((byte)-116);
        v1.cfr_renamed_14973((byte)92);
        v0.cfr_renamed_15115(this.cfr_renamed_4);
        v0.cfr_renamed_14973((byte)93);
    }

    @sprtea
    public sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public sprdvn(String string) {
        sprdvn sprdvn2 = this;
        sprdvn sprdvn3 = this;
        sprdvn2.cfr_renamed_4 = new sprpdja();
        sprdvn2.cfr_renamed_2 = new sprzyn(this.cfr_renamed_4);
        sprdvn2.cfr_renamed_1 = string;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_15014(sprzyn sprzyn2) {
        void arg0;
        void v0 = arg0;
        arg0.cfr_renamed_14968(this.cfr_renamed_1);
        v0.cfr_renamed_14970((byte)-117);
        v0.cfr_renamed_14973((byte)94);
    }

    @sprtea
    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_15013(sprzyn arg0) {
        if (this.cfr_renamed_3) {
            return;
        }
        this.cfr_renamed_14995(arg0);
        this.cfr_renamed_3 = true;
    }
}

