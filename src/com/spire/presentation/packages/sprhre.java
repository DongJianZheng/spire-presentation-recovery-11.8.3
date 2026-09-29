/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprgne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprhre
extends sprkra
implements sprkj {
    private sprvre cfr_renamed_3;
    private sprgne cfr_renamed_4;

    public sprgne cfr_renamed_4029() {
        return this.cfr_renamed_4;
    }

    public sprhre(sprgne sprgne2) {
        sprhre sprhre2 = this;
        sprhre2.cfr_renamed_3 = null;
        sprhre2.cfr_renamed_4 = sprgne2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhre(sprvre sprvre2) {
        void arg0;
        sprhre sprhre2 = this;
        sprhre2.cfr_renamed_3 = arg0;
        sprhre2.cfr_renamed_4 = null;
    }

    public static sprhre cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprhre) {
            return (sprhre)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprhre(sprvre.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spryte && ((spryte)arg0).cfr_renamed_312() == 0) {
            return new sprhre(sprgne.cfr_renamed_341((spryte)arg0, false));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("s\u001aL\u0015V\u001d^Tq\u0011C5]\u0006_\u0011h\u0011Y\u001dJ\u001d_\u001aN=^\u0011T\u0000S\u0012S\u0011HN\u001a")).append(arg0.getClass().getName()).toString());
    }

    public sprvre cfr_renamed_4024() {
        return this.cfr_renamed_3;
    }

    public static sprhre cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprhre.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        return new sprhse(0 != 0, 0, this.cfr_renamed_4);
    }
}

