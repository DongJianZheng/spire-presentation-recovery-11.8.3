/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprecb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprueb;
import com.spire.presentation.packages.sprytd;
import java.io.IOException;

public class sprtsd
extends sprytd {
    public sprtsd(byte[] arg0, sprije arg1, sprhgb arg2) {
        byte[] byArray = arg0;
        super(arg0, (sprecb)new sprueb(arg1, arg2));
    }

    public sprtsd(sprcyd arg0) throws IOException {
        sprcyd sprcyd2 = arg0;
        sprcyd sprcyd3 = arg0;
        super(sprcyd3, (sprecb)new sprueb(sprcyd3.cfr_renamed_1489().cfr_renamed_1473(), arg0.cfr_renamed_1489()));
    }
}

