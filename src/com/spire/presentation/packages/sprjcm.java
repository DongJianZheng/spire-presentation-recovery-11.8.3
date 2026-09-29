/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrsq;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprjcm
extends sprqqe {
    private sprigm[] cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public sprigm[] cfr_renamed_4497() {
        return sprjcm.cfr_renamed_11137(this.cfr_renamed_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprjcm(sprszm sprszm2) {
        int n;
        Object e;
        sprszm sprszm3 = sprszm2;
        Enumeration enumeration = sprszm3.cfr_renamed_329();
        if (sprszm3.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(sprrsq.cfr_renamed_9("z848v=q4`$4>zwG2y6z#}4g\u001ez1{%y6`>{9"));
        }
        Object e2 = enumeration.nextElement();
        if (e2 instanceof sprlem) {
            this.cfr_renamed_4 = sprlem.cfr_renamed_23(e2);
            if (!enumeration.hasMoreElements()) return;
            e = e2 = enumeration.nextElement();
        } else {
            e = e2;
        }
        if (e == null) return;
        sprszm sprszm4 = sprszm.cfr_renamed_23(e2);
        this.cfr_renamed_3 = new sprigm[sprszm4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprszm4.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = sprigm.cfr_renamed_23(sprszm4.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    private static /* synthetic */ sprigm[] cfr_renamed_11137(sprigm[] arg0) {
        if (arg0 != null) {
            sprigm[] sprigmArray = new sprigm[arg0.length];
            System.arraycopy(arg0, 0, sprigmArray, 0, arg0.length);
            return sprigmArray;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprjcm(sprlem sprlem2, sprigm[] sprigmArray) {
        void arg0;
        sprjcm sprjcm2 = this;
        sprjcm2.cfr_renamed_4 = arg0;
        sprjcm2.cfr_renamed_3 = sprjcm.cfr_renamed_11137(sprigmArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprcen(this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjcm(sprlem sprlem2) {
        void arg0;
        sprjcm sprjcm2 = this;
        sprjcm2.cfr_renamed_4 = arg0;
        sprjcm2.cfr_renamed_3 = null;
    }

    public sprjcm(sprigm[] sprigmArray) {
        sprjcm sprjcm2 = this;
        sprjcm2.cfr_renamed_4 = null;
        sprjcm2.cfr_renamed_3 = sprjcm.cfr_renamed_11137(sprigmArray);
    }

    public static sprjcm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjcm) {
            return (sprjcm)arg0;
        }
        if (arg0 != null) {
            return new sprjcm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlem cfr_renamed_4496() {
        return this.cfr_renamed_4;
    }
}

