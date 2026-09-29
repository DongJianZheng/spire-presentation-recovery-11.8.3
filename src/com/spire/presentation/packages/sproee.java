/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryie;
import com.spire.presentation.packages.spryte;

public class sproee
extends sprkra
implements sprkj {
    public spra cfr_renamed_3;
    public sprvva cfr_renamed_4;

    public static sproee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sproee.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public sproee(spryee arg0) {
        sproee sproee2 = this;
        sproee sproee3 = this;
        sproee2.cfr_renamed_3 = arg0;
        sproee2.cfr_renamed_4 = sproee3.cfr_renamed_3.cfr_renamed_119();
    }

    public spra cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public static sproee cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sproee) {
            return (sproee)arg0;
        }
        if (arg0 instanceof spryie) {
            return new sproee(spryie.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spryee) {
            return new sproee((spryee)arg0);
        }
        if (arg0 instanceof spryte) {
            return new sproee(spryie.cfr_renamed_341((spryte)arg0, false));
        }
        if (arg0 instanceof sprbne) {
            return new sproee(spryee.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprope.cfr_renamed_9("\u0000.\u001e.\u001a7\u001b`\u001a\"\u001f%\u00164U)\u001b`\u0013!\u00164\u001a2\fzU")).append(arg0.getClass().getName()).toString());
    }

    public sproee(spryie spryie2) {
        this.cfr_renamed_3 = spryie2;
        sproee sproee2 = this;
        this.cfr_renamed_4 = new sprhse(0 != 0, 0, this.cfr_renamed_3);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

