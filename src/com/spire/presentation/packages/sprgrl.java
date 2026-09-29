/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqm;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfrm;
import com.spire.presentation.packages.sprhxl;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprptm;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprqul;
import com.spire.presentation.packages.sprtig;
import com.spire.presentation.packages.sprvhm;

public class sprgrl {
    private sprqtm cfr_renamed_1;
    private sprigm cfr_renamed_2;
    private sprvhm cfr_renamed_3;
    private sprptm cfr_renamed_4;

    public sprgrl(sprptm sprptm2) {
        this.cfr_renamed_4 = sprptm2;
    }

    public sprgrl cfr_renamed_10952(sprigm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgrl cfr_renamed_10953(sprqul sprqul2, char[] cArray) throws sprcsl {
        void arg1;
        sprgrl sprgrl2 = this;
        sprgrl2.cfr_renamed_1 = sprqul2.cfr_renamed_10954((char[])arg1, sprgrl2.cfr_renamed_3);
        return sprgrl2;
    }

    public spraqm cfr_renamed_7373(sprcf arg0) {
        sprfrm sprfrm2;
        if (this.cfr_renamed_2 != null && this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprtig.cfr_renamed_9("k\"h&%\"k'%3p!i*f\b`:H\u0002Fcf\"k-j7%!j7mcg&%0`7+"));
        }
        if (this.cfr_renamed_4 != null) {
            sprfrm2 = null;
            sprhxl.cfr_renamed_10955(this.cfr_renamed_4, arg0.cfr_renamed_470());
        } else if (this.cfr_renamed_2 != null) {
            sprgrl sprgrl2 = this;
            sprfrm2 = new sprfrm(sprgrl2.cfr_renamed_2, sprgrl2.cfr_renamed_3);
            sprhxl.cfr_renamed_10955(sprfrm2, arg0.cfr_renamed_470());
        } else {
            sprgrl sprgrl3 = this;
            sprfrm2 = new sprfrm(sprgrl3.cfr_renamed_1, sprgrl3.cfr_renamed_3);
            sprhxl.cfr_renamed_10955(sprfrm2, arg0.cfr_renamed_470());
        }
        return new spraqm(sprfrm2, arg0.cfr_renamed_615(), new sprdye(arg0.cfr_renamed_79()));
    }

    public sprgrl(sprvhm sprvhm2) {
        this.cfr_renamed_3 = sprvhm2;
    }
}

