/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbte;
import com.spire.presentation.packages.sprdqe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmqe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprweaa;
import com.spire.presentation.packages.sprxne;
import com.spire.presentation.packages.sprxxy;
import com.spire.presentation.packages.sprype;
import com.spire.presentation.packages.spryte;

public class sprnue
extends sprkra
implements sprkj {
    public spra cfr_renamed_4;

    public static sprnue cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprnue) {
            return (sprnue)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprnue((sprbne)arg0);
        }
        if (arg0 instanceof spryte) {
            return new sprnue((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxxy.cfr_renamed_9("#r=r9k8<9~<y5hvu8<0}5h9n/&v")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof spryte;
    }

    public sprnue(sprbte sprbte2) {
        this.cfr_renamed_4 = sprbte2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnue(sprmqe sprmqe2) {
        void arg0;
        sprnue sprnue2 = this;
        sprnue2.cfr_renamed_4 = new sprhse(false, 4, (spra)arg0);
    }

    public sprnue(sprvva sprvva2) {
        this.cfr_renamed_4 = sprvva2;
    }

    private /* synthetic */ sprxne cfr_renamed_4833(spryte arg0) {
        if (arg0.cfr_renamed_4567()) {
            return sprxne.cfr_renamed_341(arg0, true);
        }
        return sprxne.cfr_renamed_341(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprnue(sprxne sprxne2) {
        void arg0;
        sprnue sprnue2 = this;
        sprnue2.cfr_renamed_4 = new sprhse(false, 2, (spra)arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprooe cfr_renamed_3() {
        if (!(this.cfr_renamed_4 instanceof spryte)) {
            return sprbte.cfr_renamed_23(this.cfr_renamed_4).cfr_renamed_3();
        }
        spryte spryte2 = (spryte)this.cfr_renamed_4;
        switch (spryte2.cfr_renamed_312()) {
            case 1: {
                return sprype.cfr_renamed_341(spryte2, false).cfr_renamed_3();
            }
            case 2: {
                return this.cfr_renamed_4833(spryte2).cfr_renamed_3();
            }
            case 3: {
                return sprdqe.cfr_renamed_341(spryte2, false).cfr_renamed_3();
            }
            case 4: {
                return new sprooe(0L);
            }
        }
        throw new IllegalStateException(sprweaa.cfr_renamed_9("Ck]kYrX%BdQ"));
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprnue(sprdqe sprdqe2) {
        void arg0;
        sprnue sprnue2 = this;
        sprnue2.cfr_renamed_4 = new sprhse(false, 3, (spra)arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public spra cfr_renamed_3365() {
        if (!(this.cfr_renamed_4 instanceof spryte)) {
            return sprbte.cfr_renamed_23(this.cfr_renamed_4);
        }
        spryte spryte2 = (spryte)this.cfr_renamed_4;
        switch (spryte2.cfr_renamed_312()) {
            case 1: {
                return sprype.cfr_renamed_341(spryte2, false);
            }
            case 2: {
                return this.cfr_renamed_4833(spryte2);
            }
            case 3: {
                return sprdqe.cfr_renamed_341(spryte2, false);
            }
            case 4: {
                return sprmqe.cfr_renamed_341(spryte2, false);
            }
        }
        throw new IllegalStateException(sprxxy.cfr_renamed_9("#r=r9k8<\"}1"));
    }

    /*
     * WARNING - void declaration
     */
    public sprnue(sprype sprype2) {
        void arg0;
        sprnue sprnue2 = this;
        sprnue2.cfr_renamed_4 = new sprhse(false, 1, (spra)arg0);
    }
}

