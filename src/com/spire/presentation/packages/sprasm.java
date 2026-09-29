/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycq;

public class sprasm
extends sprqqe {
    private final sprfan cfr_renamed_4;

    public sprasm() {
        this.cfr_renamed_4 = sprpen.cfr_renamed_4;
    }

    private /* synthetic */ sprasm(sprfan sprfan2) {
        this.cfr_renamed_4 = sprfan2;
    }

    public static sprasm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprasm) {
            return (sprasm)arg0;
        }
        if (arg0 instanceof sprfan) {
            return new sprasm((sprfan)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprycq.cfr_renamed_9("f9Y6C>Kw@5E2L#\u0015w")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

