/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprseaa;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprwme
extends sprkra
implements sprkj {
    private spra cfr_renamed_4;

    public static sprwme cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprwme) {
            return (sprwme)arg0;
        }
        if (arg0 instanceof sprvre) {
            return new sprwme((sprvre)arg0);
        }
        if (arg0 instanceof sprxue) {
            return new sprwme((sprxue)arg0);
        }
        if (arg0 instanceof sprvva) {
            return new sprwme((sprvva)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprseaa.cfr_renamed_9("r=W4\\0WqT3Q4X%\u001b8Uqh8\\?^#r5^?O8]8^#\u0001q")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof spryte;
    }

    /*
     * WARNING - void declaration
     */
    public sprwme(sprxue sprxue2) {
        void arg0;
        sprwme sprwme2 = this;
        sprwme2.cfr_renamed_4 = new sprhse(0 != 0, 0, (spra)arg0);
    }

    public sprwme(sprvva sprvva2) {
        this.cfr_renamed_4 = sprvva2;
    }

    public sprwme(sprvre sprvre2) {
        this.cfr_renamed_4 = sprvre2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public spra cfr_renamed_19() {
        if (this.cfr_renamed_4 instanceof spryte) {
            return sprxue.cfr_renamed_341((spryte)this.cfr_renamed_4, false);
        }
        return this.cfr_renamed_4;
    }
}

