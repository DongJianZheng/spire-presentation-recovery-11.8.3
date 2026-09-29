/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprble;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprspo;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprsre
extends sprkra
implements sprkj {
    public static final int cfr_renamed_119 = 3;
    public static final int cfr_renamed_91 = 1;
    private int cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 2;
    private spra cfr_renamed_4;

    public static sprsre cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsre.cfr_renamed_23(spryte.cfr_renamed_341(arg0, arg1));
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprsre(spryte spryte2) {
        sprsre sprsre2 = this;
        sprsre2.cfr_renamed_0 = spryte2.cfr_renamed_312();
        switch (sprsre2.cfr_renamed_0) {
            case 0: {
                void arg0;
                this.cfr_renamed_4 = sprmra.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_4 = sprble.cfr_renamed_279(sprooe.cfr_renamed_341((spryte)arg0, false).cfr_renamed_97().intValue());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_4 = sprmra.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_4 = sprmoe.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_4 = sprase.cfr_renamed_341((spryte)arg0, false);
                return;
            }
        }
        throw new IllegalArgumentException(sprspo.cfr_renamed_9("lBrBv[w\fmM~\fpB9|V|V|kEog|U"));
    }

    public spra cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    public sprsre(sprble sprble2) {
        sprsre sprsre2 = this;
        sprsre2.cfr_renamed_0 = 1;
        sprsre2.cfr_renamed_4 = sprble2;
    }

    public static sprsre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsre) {
            return (sprsre)arg0;
        }
        if (arg0 != null) {
            return new sprsre(spryte.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprsre sprsre2 = this;
        return new sprhse(false, sprsre2.cfr_renamed_0, sprsre2.cfr_renamed_4);
    }
}

