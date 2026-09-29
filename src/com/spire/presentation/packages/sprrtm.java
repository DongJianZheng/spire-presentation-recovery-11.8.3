/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprrtm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprktm[] cfr_renamed_4853() {
        int n;
        sprktm[] sprktmArray = new sprktm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprktmArray.length) {
            int n3 = n++;
            sprktmArray[n3] = sprktm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprktmArray;
    }

    public static sprrtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrtm) {
            return (sprrtm)arg0;
        }
        if (arg0 != null) {
            return new sprrtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprrtm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }
}

