/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhnm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprxrm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprxrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxrm) {
            return (sprxrm)arg0;
        }
        if (arg0 != null) {
            return new sprxrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxrm(sprhnm[] sprhnmArray) {
        void arg0;
        sprxrm sprxrm2 = this;
        sprxrm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprxrm(sprhnm sprhnm2) {
        void arg0;
        sprxrm sprxrm2 = this;
        sprxrm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public sprhnm[] cfr_renamed_4860() {
        int n;
        sprhnm[] sprhnmArray = new sprhnm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprhnmArray.length) {
            int n3 = n++;
            sprhnmArray[n3] = sprhnm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprhnmArray;
    }

    public sprxrm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }
}

