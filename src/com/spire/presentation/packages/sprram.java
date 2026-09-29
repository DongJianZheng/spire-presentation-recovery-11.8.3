/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprmfm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprrjm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprshha;
import com.spire.presentation.packages.sprtgm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.spryjm;

public class sprram {
    private sprdye cfr_renamed_86;
    private sprddm cfr_renamed_152;
    private sprjfn cfr_renamed_112;
    private spryjm cfr_renamed_119;
    private sprrvm cfr_renamed_91;
    private sprhgm cfr_renamed_0;
    private sprjfn cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprtgm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprmfm cfr_renamed_4229() {
        sprrvm sprrvm2;
        if (this.cfr_renamed_2 == null || this.cfr_renamed_152 == null || this.cfr_renamed_3 == null || this.cfr_renamed_112 == null || this.cfr_renamed_1 == null || this.cfr_renamed_119 == null || this.cfr_renamed_91 == null) {
            throw new IllegalStateException(sprshha.cfr_renamed_9("B*XeM)@eA$B!M1C7UeJ,I)H6\f6I1\f,Bezw\f\u0004X1^,N0X o ^1E#E&M1I\fB#CeK B ^$X*^"));
        }
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(9);
        sprram sprram2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_119);
        sprrvm2.cfr_renamed_5004(sprram2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprram2.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprram sprram3 = this;
        sprrvm3.cfr_renamed_5004(new sprrjm(sprram3.cfr_renamed_112, sprram3.cfr_renamed_1));
        sprrvm2.cfr_renamed_5004(new sprcen(this.cfr_renamed_91));
        if (this.cfr_renamed_86 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_86);
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        }
        return sprmfm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public void cfr_renamed_10861(spryjm arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_10865(sprujm arg0) {
        this.cfr_renamed_91.cfr_renamed_5004(arg0);
    }

    public void cfr_renamed_5009(sprmbm arg0) {
        this.cfr_renamed_0 = sprhgm.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    public void cfr_renamed_11134(String arg0, sprco arg1) {
        this.cfr_renamed_91.cfr_renamed_5004(new sprujm(new sprlem(arg0), new sprocn(arg1)));
    }

    public void cfr_renamed_4994(sprdye arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public void cfr_renamed_10864(sprjfn arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_10863(sprjfn arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_10862(sprtgm arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_4996(sprddm arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public void cfr_renamed_5001(sprktm arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprram() {
        sprram sprram2 = this;
        this.cfr_renamed_4 = new sprktm(1L);
        sprram2.cfr_renamed_91 = new sprrvm();
    }

    public void cfr_renamed_9837(sprhgm arg0) {
        this.cfr_renamed_0 = arg0;
    }
}

