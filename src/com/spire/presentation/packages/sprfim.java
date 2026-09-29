/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprfim
extends sprqqe {
    private final sproug cfr_renamed_2;
    private sprgxh cfr_renamed_3;
    private spreuh cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfim(sprgxh sprgxh2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_3 = sprgxh2;
        sprfim sprfim2 = this;
        this.cfr_renamed_2 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }

    public sprfim(sprgxh arg0, sproug arg1) {
        this(arg0, arg1.cfr_renamed_186());
    }

    public synchronized spreuh cfr_renamed_2322() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_2002(this.cfr_renamed_2.cfr_renamed_186()).cfr_renamed_1775();
        }
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_11113() {
        byte[] byArray = this.cfr_renamed_2.cfr_renamed_186();
        return byArray != null && byArray.length > 0 && (byArray[0] == 2 || byArray[0] == 3);
    }

    public byte[] cfr_renamed_9425() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprfim(spreuh spreuh2, boolean bl) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = spreuh2.cfr_renamed_1775();
        sprfim sprfim2 = this;
        this.cfr_renamed_2 = new sprfvg(arg0.cfr_renamed_1972((boolean)arg1));
    }
}

