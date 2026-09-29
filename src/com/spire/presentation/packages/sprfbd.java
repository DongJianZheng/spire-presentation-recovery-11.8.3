/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprivc;
import com.spire.presentation.packages.sprkf;
import com.spire.presentation.packages.sprlsc;
import com.spire.presentation.packages.sproj;
import java.io.IOException;

public class sprfbd
extends sprivc {
    public sprkf cfr_renamed_4;

    public sprfbd(sprkf sprkf2) {
        this.cfr_renamed_4 = sprkf2;
    }

    @Override
    public sproj cfr_renamed_3036() throws IOException {
        return new sprlsc(this.cfr_renamed_4);
    }
}

