/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbg;
import com.spire.presentation.packages.sprdbg;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprpuf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvxf;
import java.security.SecureRandom;

public class sprgeg
implements sprii {
    private int cfr_renamed_119;
    private sprvxf cfr_renamed_91;
    private sprdbg cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprgeg sprgeg2 = this;
        byte[] byArray = new byte[sprgeg2.cfr_renamed_4];
        byte[] byArray2 = new byte[sprgeg2.cfr_renamed_3];
        byte[][] byArray3 = sprgeg2.cfr_renamed_91.cfr_renamed_6898(byArray, 0, byArray2, 0);
        sprbbg sprbbg2 = sprgeg2.cfr_renamed_0.cfr_renamed_284();
        sprdwf sprdwf2 = new sprdwf(sprbbg2, byArray3[1], byArray3[2], byArray3[3], byArray3[0]);
        sprpuf sprpuf2 = new sprpuf(sprbbg2, byArray3[0]);
        return new sprsil(sprpuf2, sprdwf2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprgeg sprgeg2;
        this.cfr_renamed_0 = (sprdbg)arg0;
        sprgeg sprgeg3 = this;
        sprgeg3.cfr_renamed_1 = arg0.cfr_renamed_1295();
        sprgeg3.cfr_renamed_2 = ((sprdbg)arg0).cfr_renamed_284().cfr_renamed_5943();
        this.cfr_renamed_119 = ((sprdbg)arg0).cfr_renamed_284().cfr_renamed_6853();
        sprgeg sprgeg4 = this;
        sprgeg sprgeg5 = this;
        this.cfr_renamed_91 = new sprvxf(this.cfr_renamed_2, sprgeg5.cfr_renamed_119, sprgeg5.cfr_renamed_1);
        int n = 1 << this.cfr_renamed_2;
        int n2 = 8;
        if (n == 1024) {
            n2 = 5;
            sprgeg2 = this;
        } else if (n == 256 || n == 512) {
            n2 = 6;
            sprgeg2 = this;
        } else {
            if (n == 64 || n == 128) {
                n2 = 7;
            }
            sprgeg2 = this;
        }
        sprgeg2.cfr_renamed_4 = 1 + 14 * n / 8;
        this.cfr_renamed_3 = 1 + 2 * n2 * n / 8 + n;
    }
}

