/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprljn;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprxme
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprvqe cfr_renamed_4;

    public static sprxme cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprxme) {
            return (sprxme)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprxme((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprljn.cfr_renamed_9("9^\u0006Q\u001cY\u0014\u0010=a&E\u0003U\u0002{\u0015I\u0019^\u0017}\u0011D\u0015B\u0019Q\u001c\nP")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprxme sprxme2 = this;
        sprlre2.cfr_renamed_49(sprxme2.cfr_renamed_4);
        if (sprxme2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public static sprxme cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxme.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprvqe cfr_renamed_2096() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxme(sprvqe sprvqe2, sprxue sprxue2) {
        void arg0;
        sprxme sprxme2 = this;
        sprxme2.cfr_renamed_4 = arg0;
        sprxme2.cfr_renamed_3 = sprxue2;
    }

    private /* synthetic */ sprxme(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprvqe.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprxue.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), true);
        }
    }

    public sprxue cfr_renamed_4838() {
        return this.cfr_renamed_3;
    }
}

