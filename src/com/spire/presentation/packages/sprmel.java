/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprmgl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprts;
import com.spire.presentation.packages.sprueaa;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprvro;

public class sprmel
implements sprts {
    private final sprgf cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprvro.cfr_renamed_9("\"79286m 8$+'?b9-\"b>/,.!"));
        }
        sprmel sprmel2 = this;
        sprmel2.cfr_renamed_0.cfr_renamed_1197(sprmel2.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        byte[] byArray = sprpxe.cfr_renamed_453(this.cfr_renamed_1++);
        this.cfr_renamed_0.cfr_renamed_1197(byArray, 0, byArray.length);
        if (this.cfr_renamed_4 != null) {
            sprmel sprmel3 = this;
            sprmel3.cfr_renamed_0.cfr_renamed_1197(sprmel3.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        }
        sprmel sprmel4 = this;
        sprmel4.cfr_renamed_0.cfr_renamed_1219(sprmel4.cfr_renamed_2, 0);
        sprmel sprmel5 = this;
        System.arraycopy(sprmel5.cfr_renamed_2, 0, arg0, arg1, arg2);
        sproze.cfr_renamed_3408(sprmel5.cfr_renamed_2);
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmel(sprgf sprgf2) {
        void arg0;
        sprmel sprmel2 = this;
        sprmel2.cfr_renamed_0 = arg0;
        sprmel2.cfr_renamed_2 = new byte[sprgf2.cfr_renamed_1218()];
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (arg0 instanceof sprmgl) {
            this.cfr_renamed_3 = ((sprmgl)arg0).cfr_renamed_3383();
            this.cfr_renamed_1 = ((sprmgl)arg0).cfr_renamed_10618();
            this.cfr_renamed_4 = ((sprmgl)arg0).cfr_renamed_596();
            return;
        }
        throw new IllegalArgumentException(sprueaa.cfr_renamed_9("9g'f;gly-{-d)}){?)8p<l"));
    }
}

