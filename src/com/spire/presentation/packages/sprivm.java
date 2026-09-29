/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprivm
extends sprqqe {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 6;
    private sprqvg cfr_renamed_0;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    /*
     * WARNING - void declaration
     */
    public sprivm(int n) {
        this(new sprqvg((int)arg0));
        void arg0;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_0.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_0;
    }

    public static sprivm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprivm) {
            return (sprivm)arg0;
        }
        if (arg0 != null) {
            return new sprivm(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_9108() {
        return this.cfr_renamed_0.cfr_renamed_5023();
    }

    private /* synthetic */ sprivm(sprqvg sprqvg2) {
        this.cfr_renamed_0 = sprqvg2;
    }
}

