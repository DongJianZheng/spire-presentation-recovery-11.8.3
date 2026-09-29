/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprrte
extends sprkra
implements sprkj {
    private spra cfr_renamed_4;

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof spryte;
    }

    /*
     * WARNING - void declaration
     */
    public sprrte(sprxue sprxue2) {
        void arg0;
        sprrte sprrte2 = this;
        sprrte2.cfr_renamed_4 = new sprhse(0 != 0, 0, (spra)arg0);
    }

    public sprrte(sprvre sprvre2) {
        this.cfr_renamed_4 = sprvre2;
    }

    public sprrte(sprvva sprvva2) {
        this.cfr_renamed_4 = sprvva2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public static sprrte cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrte) {
            return (sprrte)arg0;
        }
        if (arg0 instanceof sprvre) {
            return new sprrte((sprvre)arg0);
        }
        if (arg0 instanceof sprxue) {
            return new sprrte((sprxue)arg0);
        }
        if (arg0 instanceof sprvva) {
            return new sprrte((sprvva)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproyh.cfr_renamed_9("3z\u0016s\u001dw\u00166\u0015t\u0010s\u0019bZ\u007f\u00146(s\u0019\u007f\n\u007f\u001fx\u000e_\u001es\u0014b\u0013p\u0013s\b,Z")).append(arg0.getClass().getName()).toString());
    }

    public spra cfr_renamed_19() {
        if (this.cfr_renamed_4 instanceof spryte) {
            return sprxue.cfr_renamed_341((spryte)this.cfr_renamed_4, false);
        }
        return sprvre.cfr_renamed_23(this.cfr_renamed_4);
    }
}

