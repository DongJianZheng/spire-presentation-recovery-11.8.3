/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprlje
extends sprkra {
    public sprtzd cfr_renamed_3;
    public sprxue cfr_renamed_4;

    public static sprlje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprlje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprlje(sprtzd sprtzd2, sprxue sprxue2) {
        void arg0;
        sprlje sprlje2 = this;
        sprlje2.cfr_renamed_3 = arg0;
        sprlje2.cfr_renamed_4 = sprxue2;
    }

    public static sprlje cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlje) {
            return (sprlje)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprlje((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprokk.cfr_renamed_9("\u001fi\u0001i\u0005p\u0004'\u0005e\u0000b\tsJn\u0004'\ff\ts\u0005u\u0013=J")).append(arg0.getClass().getName()).toString());
    }

    public sprxue cfr_renamed_3262() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprlje(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprxue)arg0.cfr_renamed_85(1);
    }

    public sprtzd cfr_renamed_4286() {
        return this.cfr_renamed_3;
    }
}

