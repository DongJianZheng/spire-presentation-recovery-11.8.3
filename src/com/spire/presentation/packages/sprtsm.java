/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprutm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprycn;

public class sprtsm {
    private sprdye cfr_renamed_86;
    private sprdye cfr_renamed_152;
    private sprvhm cfr_renamed_112;
    private sprnbm cfr_renamed_119;
    private sprutm cfr_renamed_91;
    private sprddm cfr_renamed_0;
    private sprnbm cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprhgm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtsm cfr_renamed_4767(int n) {
        void arg0;
        this.cfr_renamed_2 = new sprktm((long)arg0);
        return this;
    }

    public sprtsm cfr_renamed_10981(sprutm arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprikm cfr_renamed_1451() {
        sprrvm sprrvm2 = new sprrvm(10);
        sprtsm sprtsm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprtsm sprtsm3 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprtsm sprtsm4 = this;
        sprrvm sprrvm5 = sprrvm2;
        this.cfr_renamed_11318(sprrvm2, 0, false, this.cfr_renamed_2);
        this.cfr_renamed_11318(sprrvm5, 1, false, this.cfr_renamed_4);
        sprtsm4.cfr_renamed_11318(sprrvm5, 2, false, this.cfr_renamed_0);
        sprtsm4.cfr_renamed_11318(sprrvm2, 3, true, this.cfr_renamed_119);
        this.cfr_renamed_11318(sprrvm4, 4, false, this.cfr_renamed_91);
        sprtsm3.cfr_renamed_11318(sprrvm4, 5, true, this.cfr_renamed_1);
        sprtsm3.cfr_renamed_11318(sprrvm2, 6, false, this.cfr_renamed_112);
        this.cfr_renamed_11318(sprrvm3, 7, false, this.cfr_renamed_86);
        sprtsm2.cfr_renamed_11318(sprrvm3, 8, false, this.cfr_renamed_152);
        sprtsm2.cfr_renamed_11318(sprrvm2, 9, false, this.cfr_renamed_3);
        return sprikm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public sprtsm cfr_renamed_5009(sprmbm arg0) {
        return this.cfr_renamed_9837(sprhgm.cfr_renamed_23(arg0));
    }

    public sprtsm cfr_renamed_10847(sprnbm arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_5001(sprktm arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_11319(sprdye arg0) {
        this.cfr_renamed_152 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_10965(sprvhm arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_10846(sprnbm arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_11320(sprddm arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_9837(sprhgm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprtsm cfr_renamed_11321(sprdye arg0) {
        this.cfr_renamed_86 = arg0;
        return this;
    }

    private /* synthetic */ void cfr_renamed_11318(sprrvm arg0, int arg1, boolean arg2, sprco arg3) {
        if (arg3 != null) {
            arg0.cfr_renamed_5004(new sprycn(arg2, arg1, arg3));
        }
    }
}

