/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmrm
extends sprqqe {
    private final sprrdm[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmrm(sprrdm sprrdm2) {
        void arg0;
        sprrdm[] sprrdmArray = new sprrdm[1];
        sprrdmArray[0] = arg0;
        this.cfr_renamed_4 = sprrdmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    public static sprmrm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprmrm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprmrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmrm) {
            return (sprmrm)arg0;
        }
        if (arg0 != null) {
            return new sprmrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmrm(sprrdm[] sprrdmArray) {
        this.cfr_renamed_4 = sprcrm.cfr_renamed_11359(sprrdmArray);
    }

    public sprrdm[] cfr_renamed_98() {
        return sprcrm.cfr_renamed_11359(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmrm(sprszm sprszm2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new sprrdm[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprrdm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }
}

