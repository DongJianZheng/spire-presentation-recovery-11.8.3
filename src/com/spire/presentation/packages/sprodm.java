/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafz;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprodm {
    public sprddm cfr_renamed_112;
    public sprnbm cfr_renamed_119;
    public sprktm cfr_renamed_91;
    public sprvhm cfr_renamed_0;
    public sprrcm cfr_renamed_1;
    public sprycn cfr_renamed_2;
    public sprrcm cfr_renamed_3;
    public sprnbm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11127(sprgen sprgen2) {
        void arg0;
        sprodm sprodm2 = this;
        sprodm2.cfr_renamed_3 = new sprrcm((sprxgf)arg0);
    }

    public void cfr_renamed_10846(sprnbm arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_5005(sprrcm arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_5006(sprvhm arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_4999(sprrcm arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_5010(sprjii arg0) {
        this.cfr_renamed_4 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    public sprodm() {
        sprodm sprodm2 = this;
        sprodm2.cfr_renamed_2 = new sprycn(true, 0, (sprco)new sprktm(0L));
    }

    public void cfr_renamed_5001(sprktm arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_4996(sprddm arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_10847(sprnbm arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprdzl cfr_renamed_32() {
        sprrvm sprrvm2;
        sprrvm sprrvm3;
        if (this.cfr_renamed_91 == null || this.cfr_renamed_112 == null || this.cfr_renamed_119 == null || this.cfr_renamed_3 == null || this.cfr_renamed_1 == null || this.cfr_renamed_4 == null || this.cfr_renamed_0 == null) {
            throw new IllegalStateException(sprafz.cfr_renamed_9("~\u0019dVq\u001a|V}\u0017~\u0012q\u0002\u007f\u0004iVv\u001fu\u001at\u00050\u0005u\u00020\u001f~VFG0\"R%s\u0013b\u0002y\u0010y\u0015q\u0002uVw\u0013~\u0013b\u0017d\u0019b"));
        }
        sprrvm sprrvm4 = sprrvm3 = new sprrvm(6);
        sprodm sprodm2 = this;
        sprrvm3.cfr_renamed_5004(sprodm2.cfr_renamed_91);
        sprrvm4.cfr_renamed_5004(sprodm2.cfr_renamed_112);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_119);
        sprrvm sprrvm5 = sprrvm2 = new sprrvm(2);
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(new sprcen(sprrvm2));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        return sprdzl.cfr_renamed_23(new sprcen(sprrvm3));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11126(sprgen sprgen2) {
        void arg0;
        sprodm sprodm2 = this;
        sprodm2.cfr_renamed_1 = new sprrcm((sprxgf)arg0);
    }

    public void cfr_renamed_5007(sprjii arg0) {
        this.cfr_renamed_119 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_119());
    }
}

