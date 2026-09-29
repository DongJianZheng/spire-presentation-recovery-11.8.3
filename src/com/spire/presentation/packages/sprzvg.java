/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprqyg;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprwil;
import java.io.OutputStream;

public class sprzvg
implements sprsm {
    private sprgf cfr_renamed_4;

    @Override
    public int cfr_renamed_593() {
        return 2;
    }

    public sprzvg() {
        sprzvg sprzvg2 = this;
        sprzvg2.cfr_renamed_4 = new sprwil();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return new sprqyg(this.cfr_renamed_4);
    }

    @Override
    public byte[] cfr_renamed_580() {
        sprzvg sprzvg2 = this;
        byte[] byArray = new byte[sprzvg2.cfr_renamed_4.cfr_renamed_1218()];
        sprzvg2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

