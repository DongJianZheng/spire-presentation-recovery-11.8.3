/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprdse;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;

public class sprvue {
    private boolean cfr_renamed_1;
    private spra cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprao cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvue(sprao sprao2) throws IOException {
        void arg0;
        sprvue sprvue2 = this;
        sprvue2.cfr_renamed_4 = arg0;
        sprvue2.cfr_renamed_3 = sprooe.cfr_renamed_23(sprao2.cfr_renamed_24());
    }

    public sprdse cfr_renamed_4189() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 != null) {
            sprao sprao2 = (sprao)this.cfr_renamed_2;
            this.cfr_renamed_2 = null;
            return new sprdse(sprao2);
        }
        return null;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public sprrve cfr_renamed_4170() throws IOException {
        this.cfr_renamed_1 = true;
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 instanceof sprhg && ((sprhg)this.cfr_renamed_2).cfr_renamed_312() == 0) {
            this.cfr_renamed_2 = null;
            return sprrve.cfr_renamed_23(((sprao)((sprhg)this.cfr_renamed_2).cfr_renamed_4829(16, false)).cfr_renamed_119());
        }
        return null;
    }

    public sprxue cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        spra spra2 = this.cfr_renamed_2;
        this.cfr_renamed_2 = null;
        return sprxue.cfr_renamed_23(spra2.cfr_renamed_119());
    }

    public sprbl cfr_renamed_4190() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 instanceof sprhg) {
            spra spra2 = this.cfr_renamed_2;
            this.cfr_renamed_2 = null;
            return (sprbl)((sprhg)spra2).cfr_renamed_4829(17, false);
        }
        return null;
    }

    public sprbl cfr_renamed_4171() throws IOException {
        if (!this.cfr_renamed_1) {
            this.cfr_renamed_4170();
        }
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        this.cfr_renamed_2 = null;
        return (sprbl)this.cfr_renamed_2;
    }

    public sprbl cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 != null) {
            spra spra2 = this.cfr_renamed_2;
            this.cfr_renamed_2 = null;
            return (sprbl)((sprhg)spra2).cfr_renamed_4829(17, false);
        }
        return null;
    }
}

