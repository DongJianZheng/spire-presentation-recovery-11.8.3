/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdtr;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprcsm
extends sprqqe {
    private final sprddm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    public sprddm cfr_renamed_4336() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcsm(sprddm sprddm2, sprddm sprddm3) {
        void arg0;
        sprcsm sprcsm2 = this;
        sprcsm2.cfr_renamed_4 = arg0;
        sprcsm2.cfr_renamed_3 = sprddm3;
    }

    public static sprcsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcsm) {
            return (sprcsm)arg0;
        }
        if (arg0 != null) {
            return new sprcsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcsm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprdtr.cfr_renamed_9("S\u0016F\u000bU\u001a_\u0000QNE\u000bG\u001bS\u0000U\u000b\u0016\u001d_\u0014SNY\b\u0016\\"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public sprddm cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }
}

