/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqzd;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprucaa;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprdee
extends sprkra
implements sprs,
sprm {
    public sprqzd cfr_renamed_1;
    public sprije cfr_renamed_2;
    public sprbne cfr_renamed_3;
    public sprmra cfr_renamed_4;

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_1.cfr_renamed_114();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    public spruhe cfr_renamed_1485() {
        return this.cfr_renamed_1.cfr_renamed_1485();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_1.cfr_renamed_3();
    }

    public spruzd cfr_renamed_2148() {
        return this.cfr_renamed_1.cfr_renamed_2148();
    }

    public static sprdee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprdee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public spruzd cfr_renamed_2146() {
        return this.cfr_renamed_1.cfr_renamed_2146();
    }

    public sprdee(sprbne arg0) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3.cfr_renamed_84() == 3) {
            sprdee sprdee2 = this;
            sprbne sprbne2 = arg0;
            this.cfr_renamed_1 = sprqzd.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
            sprdee2.cfr_renamed_2 = sprije.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
            sprdee2.cfr_renamed_4 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        throw new IllegalArgumentException(sprucaa.cfr_renamed_9("G\u0000E\u0010Q\u000bW\u0000\u0014\u0012F\nZ\u0002\u0014\u0016]\u001fQER\nFEUEW\u0000F\u0011]\u0003]\u0006U\u0011Q"));
    }

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_1.cfr_renamed_1489();
    }

    public sprqzd cfr_renamed_2151() {
        return this.cfr_renamed_1;
    }

    public static sprdee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdee) {
            return (sprdee)arg0;
        }
        if (arg0 != null) {
            return new sprdee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_1.cfr_renamed_102();
    }
}

