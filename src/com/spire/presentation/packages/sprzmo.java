/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprieo;
import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprzmo
extends sprieo {
    private byte[] cfr_renamed_4;

    public sprzmo(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public sprpln cfr_renamed_16280(sprioo arg0) {
        sprpip sprpip2 = new sprpip(this.cfr_renamed_4, 0);
        sprpip2.cfr_renamed_12643(arg0.cfr_renamed_16286());
        return sprpip2;
    }
}

