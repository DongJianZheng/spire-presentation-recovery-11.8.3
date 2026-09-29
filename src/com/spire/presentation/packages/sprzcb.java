/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprfcb;
import com.spire.presentation.packages.sprjta;

public class sprzcb
extends sprcza {
    private sprjta cfr_renamed_1;
    private int cfr_renamed_2;
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzcb(String string, int n, int n2, byte[] byArray, sprfcb sprfcb2) {
        void arg3;
        void arg1;
        void arg0;
        void arg4;
        sprzcb sprzcb2 = this;
        super(false, (sprfcb)arg4);
        this.cfr_renamed_3 = arg0;
        sprzcb2.cfr_renamed_2 = arg1;
        sprzcb2.cfr_renamed_4 = n2;
        sprzcb sprzcb3 = this;
        sprzcb2.cfr_renamed_1 = new sprjta((byte[])arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprzcb(String string, int n, int n2, sprjta sprjta2, sprfcb sprfcb2) {
        void arg3;
        void arg1;
        void arg0;
        void arg4;
        sprzcb sprzcb2 = this;
        super(false, (sprfcb)arg4);
        this.cfr_renamed_3 = arg0;
        sprzcb2.cfr_renamed_2 = arg1;
        sprzcb2.cfr_renamed_4 = n2;
        sprzcb sprzcb3 = this;
        sprzcb2.cfr_renamed_1 = new sprjta((sprjta)arg3);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_4;
    }

    public sprjta cfr_renamed_1154() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_1.cfr_renamed_884();
    }
}

