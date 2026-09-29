/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcez;
import com.spire.presentation.packages.sprfrd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprzab;

public abstract class sprpxd
implements sprle {
    private sprqhb cfr_renamed_4;

    public sprpxd(sprzab sprzab2) {
        this.cfr_renamed_4 = sprzab2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprt cfr_renamed_4047(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        try {
            return sprfrd.cfr_renamed_4213(this.cfr_renamed_4.cfr_renamed_1534(arg1, arg2));
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, sprcez.cfr_renamed_9("o\ri\u0010z\u0001c\u001adU\u007f\u001b}\u0007k\u0005z\u001cd\u0012*\u001eo\f0U")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
    }
}

