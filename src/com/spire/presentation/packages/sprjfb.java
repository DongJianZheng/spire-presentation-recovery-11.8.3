/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprdeb;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkib;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprudb;
import com.spire.presentation.packages.sprva;

public class sprjfb
implements spraa {
    private sprva cfr_renamed_4 = sprudb.cfr_renamed_4;

    @Override
    public sprpa cfr_renamed_578(sprije arg0) throws sprfya {
        sprko sprko2 = this.cfr_renamed_4.cfr_renamed_578(arg0);
        sprdeb sprdeb2 = new sprdeb(this, sprko2);
        return new sprkib(this, arg0, sprdeb2);
    }
}

