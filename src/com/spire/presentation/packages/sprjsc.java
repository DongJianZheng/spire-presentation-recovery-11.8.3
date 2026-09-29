/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprcwda;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprojd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtvc;
import com.spire.presentation.packages.spruuca;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzf;
import java.math.BigInteger;

public class sprjsc
extends sprtvc {
    public sprbbd cfr_renamed_1;
    public sprzf cfr_renamed_2;
    public sprhgb cfr_renamed_3;
    public boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_2987(sprhgb sprhgb2) {
        void arg0;
        sprjsc sprjsc2 = this;
        sprjsc sprjsc3 = this;
        sprjsc2.cfr_renamed_2.cfr_renamed_1524(sprjsc3.cfr_renamed_3);
        BigInteger bigInteger = sprjsc2.cfr_renamed_2.cfr_renamed_2501((sprt)arg0);
        if (sprjsc3.cfr_renamed_4) {
            return sprvpa.cfr_renamed_514(bigInteger);
        }
        return sprvpa.cfr_renamed_512(this.cfr_renamed_2.cfr_renamed_1938(), bigInteger);
    }

    /*
     * WARNING - void declaration
     */
    public sprjsc(sprbbd sprbbd2, sprhgb sprhgb2) {
        sprjsc sprjsc2;
        void arg1;
        void arg0;
        if (sprbbd2 == null) {
            throw new IllegalArgumentException(sprign.cfr_renamed_9("\u0003*A;P B G(P,\u0003iG(J'K=\u0004+AiJ<H%"));
        }
        if (arg0.cfr_renamed_29()) {
            throw new IllegalArgumentException(sprcwda.cfr_renamed_9("\u000fZMK\\PNPKX\\\\\u000f\u0019KXFWGM\b[M\u0019MTXMQ"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprign.cfr_renamed_9("nT;M?E=A\u0002A0\u0003iG(J'K=\u0004+AiJ<H%"));
        }
        if (!arg1.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprcwda.cfr_renamed_9("\u001eXKAOIMMrM@\u000f\u0019EL[M\b[M\u0019XKAOIMM"));
        }
        if (arg1 instanceof sprrkd) {
            sprjsc2 = this;
            sprjsc sprjsc3 = this;
            this.cfr_renamed_2 = new sprojd();
            this.cfr_renamed_4 = true;
        } else if (arg1 instanceof spreed) {
            sprjsc2 = this;
            this.cfr_renamed_2 = new spruuca();
            this.cfr_renamed_4 = false;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprign.cfr_renamed_9("nT;M?E=A\u0002A0\u0003iP0T,\u0004'K=\u0004:Q9T&V=A-\u001ei")).append(arg1.getClass().getName()).toString());
        }
        sprjsc2.cfr_renamed_1 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    @Override
    public sprbbd cfr_renamed_2141() {
        return this.cfr_renamed_1;
    }
}

