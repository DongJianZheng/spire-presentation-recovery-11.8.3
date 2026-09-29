/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcie;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprpde
extends sprkra
implements sprkj {
    private sprxue cfr_renamed_3;
    private sprcie cfr_renamed_4;

    public sprije cfr_renamed_579() {
        if (null == this.cfr_renamed_4) {
            return new sprije(sprdh.cfr_renamed_86);
        }
        return this.cfr_renamed_4.cfr_renamed_579();
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (null == this.cfr_renamed_4) {
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprpde(sprcie sprcie2) {
        this.cfr_renamed_4 = sprcie2;
    }

    private /* synthetic */ sprpde(sprxue sprxue2) {
        this.cfr_renamed_3 = sprxue2;
    }

    /*
     * WARNING - void declaration
     */
    public sprpde(byte[] byArray) {
        void arg0;
        sprpde sprpde2 = this;
        sprpde2.cfr_renamed_3 = new sprlqe((byte[])arg0);
    }

    public byte[] cfr_renamed_4669() {
        if (null == this.cfr_renamed_4) {
            return this.cfr_renamed_3.cfr_renamed_186();
        }
        return this.cfr_renamed_4.cfr_renamed_4669().cfr_renamed_186();
    }

    public static sprpde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpde) {
            return (sprpde)arg0;
        }
        if (arg0 instanceof sprxue) {
            return new sprpde((sprxue)arg0);
        }
        return new sprpde(sprcie.cfr_renamed_23(arg0));
    }
}

