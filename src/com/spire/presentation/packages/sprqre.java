/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreqe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprpnn;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprqre
extends sprkra
implements sprkj {
    private spreqe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqre(spryte spryte2) {
        if (spryte2.cfr_renamed_312() == 0) {
            void arg0;
            this.cfr_renamed_4 = spreqe.cfr_renamed_341((spryte)arg0, false);
        }
    }

    public static sprqre cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprqre) {
            return (sprqre)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprqre(spryte.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(sprpnn.cfr_renamed_9("`k~kzr{%zg\u007f`vq5l{%r`aL{vad{fp"));
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return new sprhse(0 != 0, 0, this.cfr_renamed_4);
        }
        return null;
    }

    public spreqe cfr_renamed_685() {
        return this.cfr_renamed_4;
    }

    public sprqre(spreqe spreqe2) {
        this.cfr_renamed_4 = spreqe2;
    }
}

