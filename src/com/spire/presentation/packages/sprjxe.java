/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggf;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprohf;

public class sprjxe
extends sprggf {
    private final byte[] cfr_renamed_4;

    public sprjxe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public byte[] cfr_renamed_5328(sprjj arg0, byte[] arg1) {
        byte[] byArray = sprohf.cfr_renamed_5322(arg0, this.cfr_renamed_4);
        if (arg1 != null) {
            return sprohf.cfr_renamed_5323(arg0, arg1, byArray);
        }
        return byArray;
    }
}

