/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcum;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprfoo;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spranm
extends sprqqe
implements sprlm {
    private sprcum cfr_renamed_3;
    private sprdsm cfr_renamed_4;

    public static spranm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spranm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3);
    }

    public spranm(sprcum sprcum2) {
        spranm spranm2 = this;
        spranm2.cfr_renamed_4 = null;
        spranm2.cfr_renamed_3 = sprcum2;
    }

    public static spranm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spranm) {
            return (spranm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new spranm(sprdsm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm && ((sprnvm)arg0).cfr_renamed_312() == 0) {
            return new spranm(sprcum.cfr_renamed_5085((sprnvm)arg0, false));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfoo.cfr_renamed_9("`\u001a_\u0015E\u001dMTb\u0011P5N\u0006L\u0011{\u0011J\u001dY\u001dL\u001a]=M\u0011G\u0000@\u0012@\u0011[N\t")).append(arg0.getClass().getName()).toString());
    }

    public sprdsm cfr_renamed_4024() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spranm(sprdsm sprdsm2) {
        void arg0;
        spranm spranm2 = this;
        spranm2.cfr_renamed_4 = arg0;
        spranm2.cfr_renamed_3 = null;
    }

    public sprcum cfr_renamed_4029() {
        return this.cfr_renamed_3;
    }
}

