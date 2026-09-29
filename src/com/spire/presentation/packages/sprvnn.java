/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryx;

@sprtea
public class sprvnn
implements spryx {
    private sprwbp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvnn(sprwbp sprwbp2) {
        void arg0;
        sprvnn sprvnn2 = this;
        sprvnn2.cfr_renamed_4 = new sprwbp(arg0.cfr_renamed_1778(), arg0.cfr_renamed_3353(), arg0.cfr_renamed_1145(), arg0.cfr_renamed_1997());
    }

    public void cfr_renamed_12497(Object arg0) {
        sprmqja sprmqja2 = (sprmqja)arg0;
        sprvnn sprvnn2 = this;
        sprvnn2.cfr_renamed_4 = new sprwbp(sprmqja2.cfr_renamed_1778() & 0xFF, sprmqja2.cfr_renamed_3353() & 0xFF, sprmqja2.cfr_renamed_1145() & 0xFF, sprmqja2.cfr_renamed_1997() & 0xFF);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4.cfr_renamed_12795();
    }

    @Override
    public byte cfr_renamed_12602() {
        return (byte)this.cfr_renamed_4.cfr_renamed_1778();
    }

    public sprvnn() {
        this.cfr_renamed_4 = sprwbp.cfr_renamed_1447;
    }

    /*
     * WARNING - void declaration
     */
    public sprvnn(byte by, byte by2, byte by3) {
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprwbp.cfr_renamed_12796(by & 0xFF, arg1 & 0xFF, arg2 & 0xFF);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12797(byte by) {
        void arg0;
        sprvnn sprvnn2 = this;
        sprvnn2.cfr_renamed_4 = new sprwbp((int)(arg0 & 0xFF), this.cfr_renamed_4);
    }

    public byte cfr_renamed_1997() {
        return (byte)this.cfr_renamed_4.cfr_renamed_1997();
    }

    public byte cfr_renamed_1145() {
        return (byte)this.cfr_renamed_4.cfr_renamed_1145();
    }

    @Override
    public spryx cfr_renamed_12099() {
        sprvnn sprvnn2 = new sprvnn(this.cfr_renamed_3353(), this.cfr_renamed_1145(), this.cfr_renamed_1997());
        sprvnn2.cfr_renamed_12797(this.cfr_renamed_12602());
        return sprvnn2;
    }

    public byte cfr_renamed_3353() {
        return (byte)this.cfr_renamed_4.cfr_renamed_3353();
    }

    /*
     * WARNING - void declaration
     */
    public sprvnn(byte by, byte by2, byte by3, byte by4) {
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprwbp.cfr_renamed_12555(by & 0xFF, arg1 & 0xFF, arg2 & 0xFF, arg3 & 0xFF);
    }
}

