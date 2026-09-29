/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprffm
extends sprqqe {
    public sprddm cfr_renamed_0;
    public int cfr_renamed_1;
    public sprgbf cfr_renamed_2;
    public sprtfm cfr_renamed_3;
    public boolean cfr_renamed_4 = false;

    public int cfr_renamed_569() {
        return this.cfr_renamed_3.cfr_renamed_569();
    }

    public static sprffm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprffm) {
            return (sprffm)arg0;
        }
        if (arg0 != null) {
            return new sprffm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprffm(sprszm sprszm2) {
        if (sprszm2.cfr_renamed_84() == 3) {
            void arg0;
            sprffm sprffm2 = this;
            void v1 = arg0;
            this.cfr_renamed_3 = sprtfm.cfr_renamed_23(v1.cfr_renamed_85(0));
            sprffm2.cfr_renamed_0 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
            sprffm2.cfr_renamed_2 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        throw new IllegalArgumentException(sprprc.cfr_renamed_9("fadqpjva5sgk{c5w|~p$skg$Vagp|b|gtppH|wa"));
    }

    public sprpim[] cfr_renamed_4232() {
        return this.cfr_renamed_3.cfr_renamed_4232();
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_0;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_3.cfr_renamed_102();
    }

    public static sprffm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprffm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprrcm cfr_renamed_2132() {
        return this.cfr_renamed_3.cfr_renamed_2132();
    }

    public sprrcm cfr_renamed_2133() {
        return this.cfr_renamed_3.cfr_renamed_2133();
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_1 = super.hashCode();
            this.cfr_renamed_4 = true;
        }
        return this.cfr_renamed_1;
    }

    public Enumeration cfr_renamed_2135() {
        return this.cfr_renamed_3.cfr_renamed_2135();
    }

    public sprtfm cfr_renamed_2134() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprffm sprffm2 = this;
        sprrvm2.cfr_renamed_5004(sprffm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprffm2.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_2;
    }
}

