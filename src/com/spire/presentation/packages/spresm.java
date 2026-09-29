/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnkm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class spresm
extends sprqqe {
    private sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static spresm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spresm) {
            return (spresm)arg0;
        }
        if (arg0 != null) {
            return new spresm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprnkm[] cfr_renamed_4682() {
        int n;
        sprnkm[] sprnkmArray = new sprnkm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprnkmArray.length) {
            int n3 = n++;
            sprnkmArray[n3] = sprnkm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprnkmArray;
    }

    /*
     * WARNING - void declaration
     */
    public spresm(sprnkm[] sprnkmArray) {
        void arg0;
        spresm spresm2 = this;
        spresm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spresm(sprszm sprszm2) {
        void arg0;
        Enumeration enumeration;
        Enumeration enumeration2 = enumeration = sprszm2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprnkm.cfr_renamed_23(enumeration3.nextElement());
        }
        this.cfr_renamed_4 = arg0;
    }
}

