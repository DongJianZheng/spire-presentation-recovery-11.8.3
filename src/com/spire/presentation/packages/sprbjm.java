/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprijm;
import com.spire.presentation.packages.sprkem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprbjm
extends sprqqe {
    private sprszm cfr_renamed_4;

    private /* synthetic */ sprbjm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbjm(sprijm[] sprijmArray) {
        this(new sprkem((sprijm[])arg0));
        void arg0;
    }

    public static sprbjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbjm) {
            return (sprbjm)arg0;
        }
        if (arg0 != null) {
            return new sprbjm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbjm(sprkem sprkem2) {
        void arg0;
        sprbjm sprbjm2 = this;
        sprbjm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public sprkem[] cfr_renamed_187() {
        Enumeration enumeration;
        sprkem[] sprkemArray = new sprkem[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprkemArray[++n] = sprkem.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprkemArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

