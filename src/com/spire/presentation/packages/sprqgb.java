/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprdmp;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.spru;
import com.spire.presentation.packages.sprucq;

public class sprqgb
implements sprta {
    private final spru cfr_renamed_2;
    private final sprlc cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqgb(spru spru2, sprlc sprlc2) {
        void arg0;
        sprqgb sprqgb2 = this;
        sprqgb2.cfr_renamed_2 = arg0;
        sprqgb2.cfr_renamed_3 = sprlc2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprucq.cfr_renamed_9("j5^2P2^|k9H)P.\\/\u0019\fK5O=M9\u0019\u0017\\%\u0017"));
        }
        if (arg0 == false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprdmp.cfr_renamed_9("\u0006f\"j6j3b$j?mpQ5r%j\"f##\u0000v2o9`pH5z~"));
        }
        sprqgb sprqgb2 = this;
        sprqgb2.cfr_renamed_41();
        sprqgb2.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        return this.cfr_renamed_1435(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public boolean cfr_renamed_1435(byte[] arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprucq.cfr_renamed_9("\u000eX5W>V+}5^9J(j5^2\\.\u00192V(\u00195W5M5X0P/\\8\u0019:V.\u0019*\\.P:P?X(P3W"));
        }
        sprqgb sprqgb2 = this;
        byte[] byArray = new byte[sprqgb2.cfr_renamed_3.cfr_renamed_1218()];
        sprqgb2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprqgb2.cfr_renamed_2.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprdmp.cfr_renamed_9("\u0002b9m2l'G9d5p$P9d>f\"#>l$#9m9w9b<j#f4#6l\"##j7m1w%q5#7f>f\"b$j?m~"));
        }
        sprqgb sprqgb2 = this;
        byte[] byArray = new byte[sprqgb2.cfr_renamed_3.cfr_renamed_1218()];
        sprqgb2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprqgb2.cfr_renamed_2.cfr_renamed_125(byArray);
    }
}

