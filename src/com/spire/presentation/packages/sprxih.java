/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhmh;
import com.spire.presentation.packages.sprlmh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprukaa;
import com.spire.presentation.packages.sprvkh;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxgf;

public class sprxih
extends sprqqe {
    private final sprbvg cfr_renamed_0;
    private final sprvrg cfr_renamed_1;
    private final sprvkh cfr_renamed_2;
    private final sprbxm cfr_renamed_3;
    private final sprhmh cfr_renamed_4;

    public sprvrg cfr_renamed_2133() {
        return this.cfr_renamed_1;
    }

    public sprbvg cfr_renamed_8456() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxih(sprhmh sprhmh2, sprvrg sprvrg2, sprbxm sprbxm2, sprbvg sprbvg2, sprvkh sprvkh2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxih sprxih2 = this;
        sprxih sprxih3 = this;
        this.cfr_renamed_4 = arg0;
        sprxih3.cfr_renamed_1 = arg1;
        sprxih3.cfr_renamed_3 = arg2;
        sprxih2.cfr_renamed_0 = arg3;
        sprxih2.cfr_renamed_2 = sprvkh2;
    }

    public static sprxih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxih) {
            return (sprxih)arg0;
        }
        if (arg0 != null) {
            return new sprxih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprlmh cfr_renamed_7843() {
        return new sprlmh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_1;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_0;
        sprcoArray[4] = this.cfr_renamed_2;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprxih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(sprukaa.cfr_renamed_9("v0c-p<v,3;v9f-}+vh`!i-3'uh&"));
        }
        void v0 = arg0;
        sprxih sprxih2 = this;
        void v2 = arg0;
        this.cfr_renamed_4 = sprhmh.cfr_renamed_23(v2.cfr_renamed_85(0));
        sprxih2.cfr_renamed_1 = sprvrg.cfr_renamed_23(v2.cfr_renamed_85(1));
        sprxih2.cfr_renamed_3 = sprbxm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_0 = sprbvg.cfr_renamed_23(v0.cfr_renamed_85(3));
        this.cfr_renamed_2 = sprvkh.cfr_renamed_23(v0.cfr_renamed_85(4));
    }

    public sprbxm cfr_renamed_8457() {
        return this.cfr_renamed_3;
    }

    public sprvkh cfr_renamed_8442() {
        return this.cfr_renamed_2;
    }

    public sprhmh cfr_renamed_3() {
        return this.cfr_renamed_4;
    }
}

