/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcb;
import com.spire.presentation.packages.sprfbb;
import com.spire.presentation.packages.sprjta;

public class sprgeb
extends sprfbb {
    private int cfr_renamed_1;
    private String cfr_renamed_2;
    private sprjta cfr_renamed_3;
    private int cfr_renamed_4;

    public String cfr_renamed_1143() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_3.cfr_renamed_884();
    }

    /*
     * WARNING - void declaration
     */
    public sprgeb(String string, int n, int n2, sprjta sprjta2, sprdcb sprdcb2) {
        void arg3;
        void arg1;
        void arg0;
        void arg4;
        sprgeb sprgeb2 = this;
        super(false, (sprdcb)arg4);
        this.cfr_renamed_2 = arg0;
        sprgeb2.cfr_renamed_1 = arg1;
        sprgeb2.cfr_renamed_4 = n2;
        sprgeb sprgeb3 = this;
        sprgeb2.cfr_renamed_3 = new sprjta((sprjta)arg3);
    }

    public sprjta cfr_renamed_1145() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgeb(String string, int n, int n2, byte[] byArray, sprdcb sprdcb2) {
        void arg3;
        void arg2;
        void arg0;
        void arg4;
        sprgeb sprgeb2 = this;
        super(false, (sprdcb)arg4);
        this.cfr_renamed_2 = arg0;
        sprgeb2.cfr_renamed_1 = arg2;
        sprgeb2.cfr_renamed_4 = n;
        sprgeb sprgeb3 = this;
        sprgeb2.cfr_renamed_3 = new sprjta((byte[])arg3);
    }
}

