/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprokm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprgqm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    public static sprgqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgqm) {
            return (sprgqm)arg0;
        }
        if (arg0 != null) {
            return new sprgqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprokm[] cfr_renamed_4854() {
        int n;
        sprokm[] sprokmArray = new sprokm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprokmArray.length) {
            int n3 = n++;
            sprokmArray[n3] = sprokm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprokmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprgqm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }
}

