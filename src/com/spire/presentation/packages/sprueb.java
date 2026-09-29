/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprecb;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxld;
import java.io.IOException;

public class sprueb
extends sprecb {
    public sprueb(sprije arg0, sprhgb arg1) {
        super(arg0, arg1);
    }

    public sprueb(sprije arg0, sprdce arg1) throws IOException {
        super(arg0, sprhcd.cfr_renamed_1531(arg1));
    }

    @Override
    public sprh cfr_renamed_1583(sprtzd arg0) {
        return new sprpmd(new sprxld());
    }
}

