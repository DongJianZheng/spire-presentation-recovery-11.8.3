/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.spruhf;
import com.spire.presentation.packages.sprxye;

public abstract class sprhze
extends sprtff {
    @Override
    public int cfr_renamed_5432() {
        return this.cfr_renamed_5439() + this.cfr_renamed_5440();
    }

    @Override
    public sprxye cfr_renamed_5431() {
        return new spruhf(this);
    }

    public int cfr_renamed_5441() {
        return this.cfr_renamed_5397() / 8 - 2;
    }

    @Override
    public int cfr_renamed_5435() {
        return this.cfr_renamed_5439() + this.cfr_renamed_5440();
    }

    public sprhze(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }
}

