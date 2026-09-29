/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprpuf;
import com.spire.presentation.packages.sprvxf;
import com.spire.presentation.packages.sprybl;

public class sprhuf
implements sprgm {
    private byte[] cfr_renamed_3;
    private sprvxf cfr_renamed_4;

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        if (arg1[0] != (byte)(48 + this.cfr_renamed_4.cfr_renamed_0)) {
            return false;
        }
        byte[] byArray = new byte[this.cfr_renamed_4.cfr_renamed_3];
        byte[] byArray2 = new byte[arg1.length - this.cfr_renamed_4.cfr_renamed_3 - 1];
        System.arraycopy(arg1, 1, byArray, 0, this.cfr_renamed_4.cfr_renamed_3);
        System.arraycopy(arg1, this.cfr_renamed_4.cfr_renamed_3 + 1, byArray2, 0, arg1.length - this.cfr_renamed_4.cfr_renamed_3 - 1);
        boolean bl = this.cfr_renamed_4.cfr_renamed_6852(false, byArray2, byArray, arg0, this.cfr_renamed_3, 0) == 0;
        return bl;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprdwf sprdwf2 = (sprdwf)((sprbgk)arg1).cfr_renamed_284();
                this.cfr_renamed_3 = sprdwf2.cfr_renamed_91();
                sprhuf sprhuf2 = this;
                sprhuf2.cfr_renamed_4 = new sprvxf(sprdwf2.cfr_renamed_284().cfr_renamed_5943(), sprdwf2.cfr_renamed_284().cfr_renamed_6853(), ((sprbgk)arg1).cfr_renamed_1295());
                return;
            }
            sprdwf sprdwf3 = (sprdwf)arg1;
            this.cfr_renamed_3 = ((sprdwf)arg1).cfr_renamed_91();
            this.cfr_renamed_4 = new sprvxf(sprdwf3.cfr_renamed_284().cfr_renamed_5943(), sprdwf3.cfr_renamed_284().cfr_renamed_6853(), sprybl.cfr_renamed_2794());
            return;
        }
        sprpuf sprpuf2 = (sprpuf)arg1;
        sprhuf sprhuf3 = this;
        sprhuf3.cfr_renamed_3 = sprpuf2.cfr_renamed_1153();
        sprhuf3.cfr_renamed_4 = new sprvxf(sprpuf2.cfr_renamed_284().cfr_renamed_5943(), sprpuf2.cfr_renamed_284().cfr_renamed_6853(), sprybl.cfr_renamed_2794());
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        sprhuf sprhuf2 = this;
        byte[] byArray = new byte[sprhuf2.cfr_renamed_4.cfr_renamed_4];
        return sprhuf2.cfr_renamed_4.cfr_renamed_6854(0 != 0, byArray, arg0, 0, arg0.length, this.cfr_renamed_3, 0);
    }
}

