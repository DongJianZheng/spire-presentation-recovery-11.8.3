/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfrd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.spribb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnf;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxjaa;

public abstract class spraod
implements sprnf {
    private sprhgb cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprt cfr_renamed_4047(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        spribb spribb2 = new spribb(arg0, this.cfr_renamed_4);
        try {
            return sprfrd.cfr_renamed_4213(spribb2.cfr_renamed_1534(arg1, arg2));
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, sprxjaa.cfr_renamed_9("\u000e7\b*\u001b;\u0002 \u0005o\u001e!\u001c=\n?\u001b&\u0005(K$\u000e6Qo")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
    }

    public spraod(sprhgb sprhgb2) {
        this.cfr_renamed_4 = sprhgb2;
    }
}

