/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbio;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxno;

@sprtea
public class sprumo {
    private sprxno cfr_renamed_119;
    private sprggo cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprbio cfr_renamed_2;
    private sprhio cfr_renamed_3;
    private sprwbp cfr_renamed_4;

    public sprumo(sprggo arg0) {
        sprumo sprumo2 = this;
        sprumo sprumo3 = this;
        sprumo2.cfr_renamed_91 = arg0;
        sprumo2.cfr_renamed_119 = sprumo3.cfr_renamed_91.cfr_renamed_16063();
        sprumo2.cfr_renamed_3 = sprumo2.cfr_renamed_91.cfr_renamed_16064();
        sprumo2.cfr_renamed_2 = sprumo2.cfr_renamed_91.cfr_renamed_16558();
    }

    public sprpln cfr_renamed_16724() {
        if (this.cfr_renamed_1) {
            return new sprghp(this.cfr_renamed_4);
        }
        sprumo sprumo2 = this;
        return (sprpln)sprumo2.cfr_renamed_2.cfr_renamed_576(sprumo2.cfr_renamed_0);
    }

    public void cfr_renamed_16564() {
        sprumo sprumo2 = this;
        sprumo2.cfr_renamed_1 = sprumo2.cfr_renamed_119.cfr_renamed_4690().cfr_renamed_16584(0);
        if (sprumo2.cfr_renamed_1) {
            this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_16637();
            return;
        }
        this.cfr_renamed_0 = this.cfr_renamed_3.cfr_renamed_12261();
    }
}

