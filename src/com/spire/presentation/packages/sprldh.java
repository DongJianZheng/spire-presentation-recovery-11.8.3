/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxda;

public class sprldh
extends sprqqe {
    private final byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprfvg(this.cfr_renamed_4);
    }

    public static sprldh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprldh) {
            return (sprldh)arg0;
        }
        if (arg0 != null) {
            return new sprldh(sprfvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprldh(sproug arg0) {
        this(arg0.cfr_renamed_186());
    }

    private /* synthetic */ void cfr_renamed_8375() {
        if (this.cfr_renamed_4.length != 2) {
            throw new IllegalArgumentException(sprxxda.cfr_renamed_9("8\u0000\u001d\u0005t\f!\u0012 A6\u0004tSt\u000e7\u00151\u0015'"));
        }
    }

    public sprldh(byte[] byArray) {
        sprldh sprldh2 = this;
        sprldh2.cfr_renamed_4 = byArray;
        sprldh2.cfr_renamed_8375();
    }

    public byte[] cfr_renamed_8376() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

