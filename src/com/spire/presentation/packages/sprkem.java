/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprijm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprkem
extends sprqqe {
    private sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprkem(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    public sprijm[] cfr_renamed_188() {
        Enumeration enumeration;
        sprijm[] sprijmArray = new sprijm[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprijmArray[++n] = sprijm.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprijmArray;
    }

    public static sprkem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkem) {
            return (sprkem)arg0;
        }
        if (arg0 != null) {
            return new sprkem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprkem(sprijm[] sprijmArray) {
        void arg0;
        sprkem sprkem2 = this;
        sprkem2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }
}

