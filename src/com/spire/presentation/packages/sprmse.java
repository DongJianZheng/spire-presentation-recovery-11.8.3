/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;

public class sprmse {
    private boolean cfr_renamed_1;
    private spra cfr_renamed_2;
    private sprao cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprije cfr_renamed_4202() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 != null) {
            this.cfr_renamed_2 = null;
            return sprije.cfr_renamed_23(((sprao)this.cfr_renamed_2).cfr_renamed_119());
        }
        return null;
    }

    public sprxue cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        spra spra2 = this.cfr_renamed_2;
        this.cfr_renamed_2 = null;
        return sprxue.cfr_renamed_23(spra2.cfr_renamed_119());
    }

    public sprije cfr_renamed_410() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 instanceof sprhg) {
            this.cfr_renamed_2 = null;
            return sprije.cfr_renamed_341((spryte)this.cfr_renamed_2.cfr_renamed_119(), false);
        }
        return null;
    }

    public sprbl cfr_renamed_4190() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
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
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        this.cfr_renamed_2 = null;
        return (sprbl)this.cfr_renamed_2;
    }

    public sprbl cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 != null) {
            spra spra2 = this.cfr_renamed_2;
            this.cfr_renamed_2 = null;
            return (sprbl)((sprhg)spra2).cfr_renamed_4829(17, false);
        }
        return null;
    }

    public sprrve cfr_renamed_4170() throws IOException {
        this.cfr_renamed_1 = true;
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 instanceof sprhg && ((sprhg)this.cfr_renamed_2).cfr_renamed_312() == 0) {
            this.cfr_renamed_2 = null;
            return sprrve.cfr_renamed_23(((sprao)((sprhg)this.cfr_renamed_2).cfr_renamed_4829(16, false)).cfr_renamed_119());
        }
        return null;
    }

    public sprgre cfr_renamed_4839() throws IOException {
        return this.cfr_renamed_4203();
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmse(sprao sprao2) throws IOException {
        void arg0;
        sprmse sprmse2 = this;
        sprmse2.cfr_renamed_3 = arg0;
        sprmse2.cfr_renamed_4 = sprooe.cfr_renamed_23(sprao2.cfr_renamed_24());
    }

    public sprgre cfr_renamed_4203() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_2 != null) {
            sprao sprao2 = (sprao)this.cfr_renamed_2;
            this.cfr_renamed_2 = null;
            return new sprgre(sprao2);
        }
        return null;
    }
}

