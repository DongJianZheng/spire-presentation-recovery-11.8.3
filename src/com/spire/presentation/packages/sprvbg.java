/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprtvf;
import com.spire.presentation.packages.sprybg;

public class sprvbg
implements sprgm {
    private sprybg cfr_renamed_3;
    private sprtvf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        sprqag sprqag2 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprqag2.cfr_renamed_5542(arg0.length)];
        sprqag sprqag3 = sprqag2;
        sprqag3.cfr_renamed_6251(byArray, arg0, this.cfr_renamed_3.cfr_renamed_91());
        byte[] byArray2 = new byte[sprqag3.cfr_renamed_6252()];
        System.arraycopy(byArray, arg0.length + 4, byArray2, 0, sprqag2.cfr_renamed_6252());
        return byArray2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            this.cfr_renamed_3 = (sprybg)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprtvf)arg1;
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        sprqag sprqag2 = this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[arg0.length];
        byte[] byArray2 = sproze.cfr_renamed_527(sprpxe.cfr_renamed_436(arg1.length), arg0, arg1);
        boolean bl = sprqag2.cfr_renamed_6253(byArray, byArray2, this.cfr_renamed_4.cfr_renamed_91());
        if (!sproze.cfr_renamed_92(arg0, byArray)) {
            return false;
        }
        return bl;
    }
}

