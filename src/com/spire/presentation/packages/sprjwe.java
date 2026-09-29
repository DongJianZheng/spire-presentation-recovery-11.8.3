/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkte;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprjwe
extends sprkra
implements sprkj {
    private sprase cfr_renamed_3;
    private sprkte cfr_renamed_4;

    public sprjwe(sprkte sprkte2) {
        this.cfr_renamed_4 = sprkte2;
    }

    public static sprjwe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjwe) {
            return (sprjwe)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprjwe(sprase.cfr_renamed_341((spryte)arg0, false));
        }
        if (arg0 instanceof sprkte) {
            return new sprjwe((sprkte)arg0);
        }
        return new sprjwe(sprkte.cfr_renamed_23(arg0));
    }

    public sprjwe(sprase sprase2) {
        this.cfr_renamed_3 = sprase2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return new sprhse(0 != 0, 0, this.cfr_renamed_3);
    }

    public spra cfr_renamed_97() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4;
        }
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_4342() {
        return this.cfr_renamed_4 != null;
    }
}

