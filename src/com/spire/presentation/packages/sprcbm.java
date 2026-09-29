/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprukq;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzzl;

public class sprcbm
extends sprqqe
implements sprhl,
sprdl {
    public sprszm cfr_renamed_1;
    public sprgbf cfr_renamed_2;
    public sprzzl cfr_renamed_3;
    public sprddm cfr_renamed_4;

    public sprcbm(sprszm arg0) {
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_1.cfr_renamed_84() == 3) {
            sprcbm sprcbm2 = this;
            sprszm sprszm2 = arg0;
            this.cfr_renamed_3 = sprzzl.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
            sprcbm2.cfr_renamed_4 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
            sprcbm2.cfr_renamed_2 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        throw new IllegalArgumentException(sprukq.cfr_renamed_9("H@JP^KX@\u001bRIJUB\u001bVR_^\u0005]JI\u0005Z\u0005X@IQRCRFZQ^"));
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_3();
    }

    public sprrcm cfr_renamed_2148() {
        return this.cfr_renamed_3.cfr_renamed_2148();
    }

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_3.cfr_renamed_1485();
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_3.cfr_renamed_102();
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_4;
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    public static sprcbm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcbm) {
            return (sprcbm)arg0;
        }
        if (arg0 != null) {
            return new sprcbm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzzl cfr_renamed_2151() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_1;
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_114();
    }

    public static sprcbm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprcbm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprrcm cfr_renamed_2146() {
        return this.cfr_renamed_3.cfr_renamed_2146();
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_3.cfr_renamed_1489();
    }
}

