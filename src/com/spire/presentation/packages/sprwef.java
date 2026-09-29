/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcf;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprlye;
import com.spire.presentation.packages.spryi;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzff;

public class sprwef
implements spryi {
    private final sprlye cfr_renamed_3;
    private sprbcf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprgmg.cfr_renamed_9("(M<J2J<\u00040A\"\u00045K{H4J<A)\u0004.W:F7A"));
        }
        sprwef sprwef2 = this;
        byte[] byArray = sprwef2.cfr_renamed_3.cfr_renamed_125(arg0);
        sprwef2.cfr_renamed_4 = sprwef2.cfr_renamed_4.cfr_renamed_1429();
        return byArray;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!arg0) ** GOTO lbl8
        if (arg1 instanceof sprbgk) {
            var3_3 = (sprbgk)arg1;
            this.cfr_renamed_4 = (sprbcf)var3_3.cfr_renamed_284();
            v0 = this;
        } else {
            this.cfr_renamed_4 = (sprbcf)arg1;
lbl8:
            // 2 sources

            v0 = this;
        }
        v0.cfr_renamed_3.cfr_renamed_5535(arg0, arg1);
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        return this.cfr_renamed_3.cfr_renamed_129(arg0, arg1);
    }

    @Override
    public spryye cfr_renamed_5643() {
        sprbcf sprbcf2 = this.cfr_renamed_4;
        this.cfr_renamed_4 = null;
        return sprbcf2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwef(sprgf sprgf2) {
        void arg0;
        if (!(sprgf2 instanceof sprhx)) {
            throw new IllegalArgumentException(sprjfd.cfr_renamed_9(".@-L9]jD?Z>\t#D:E/D/G>\t\u0007L'F+K&L"));
        }
        sprhx sprhx2 = ((sprhx)arg0).cfr_renamed_461();
        sprwef sprwef2 = this;
        sprwef2.cfr_renamed_3 = new sprlye(new sprzff(this, sprhx2));
    }
}

