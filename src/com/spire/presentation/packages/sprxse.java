/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Date;

public class sprxse
extends sprkra
implements sprkj {
    private Date cfr_renamed_2;
    private sprnte cfr_renamed_3;
    private sprrpe cfr_renamed_4;

    public sprnte cfr_renamed_652() {
        return this.cfr_renamed_3;
    }

    public sprxse(sprrpe sprrpe2) {
        this.cfr_renamed_4 = sprrpe2;
    }

    public String toString() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.toString();
        }
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.toString();
        }
        return null;
    }

    public static sprxse cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxse.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public static sprxse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxse) {
            return (sprxse)arg0;
        }
        if (arg0 instanceof sprrpe) {
            return new sprxse(sprrpe.cfr_renamed_23(arg0));
        }
        if (arg0 != null) {
            return new sprxse(sprnte.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrpe cfr_renamed_588() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxse(Date date) {
        this(new sprrpe((Date)arg0));
        void arg0;
    }

    public sprxse(sprnte sprnte2) {
        this.cfr_renamed_3 = sprnte2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4;
        }
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        return null;
    }
}

