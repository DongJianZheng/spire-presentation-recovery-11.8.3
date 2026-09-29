/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public abstract class sprybh
extends sprqqe {
    public final BigInteger cfr_renamed_4;

    public sprybh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public sprybh(int arg0) {
        this(BigInteger.valueOf(arg0));
    }

    public abstract void cfr_renamed_8334();

    public sprybh(BigInteger bigInteger) {
        sprybh sprybh2 = this;
        sprybh2.cfr_renamed_4 = bigInteger;
        sprybh2.cfr_renamed_8334();
    }

    public sprybh(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }
}

