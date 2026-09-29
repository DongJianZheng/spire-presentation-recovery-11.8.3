/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spromm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprgvm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    public static sprgvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgvm) {
            return (sprgvm)arg0;
        }
        if (arg0 != null) {
            return new sprgvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprgvm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public spromm[] cfr_renamed_4426() {
        int n;
        spromm[] sprommArray = new spromm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprommArray.length) {
            int n3 = n++;
            sprommArray[n3] = spromm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprommArray;
    }
}

