/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwbp;

@sprtea
public abstract class sprqkn
extends sprvjn {
    private static sprwbp cfr_renamed_91 = sprwbp.cfr_renamed_955;
    private boolean cfr_renamed_0;
    private sprwbp cfr_renamed_1;
    private String cfr_renamed_2;
    private sprwbp cfr_renamed_3;
    private sprgeja cfr_renamed_4;

    public sprwbp cfr_renamed_13973() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprqkn(sprgeja sprgeja2, String string, sprwbp sprwbp2, sprwbp sprwbp3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqkn sprqkn2 = this;
        sprqkn sprqkn3 = this;
        this.cfr_renamed_0 = true;
        sprqkn3.cfr_renamed_4 = arg0;
        sprqkn3.cfr_renamed_2 = arg1;
        sprqkn2.cfr_renamed_3 = arg2;
        sprqkn2.cfr_renamed_1 = sprwbp3.cfr_renamed_29() ? cfr_renamed_91 : arg3;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_13974(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_13579(sprgeja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprsuja cfr_renamed_13110() {
        return new sprsuja(this.cfr_renamed_13550().cfr_renamed_13430(), this.cfr_renamed_13550().cfr_renamed_13429());
    }

    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_13975() {
        return this.cfr_renamed_0;
    }

    public sprwbp cfr_renamed_13976() {
        return this.cfr_renamed_3;
    }
}

