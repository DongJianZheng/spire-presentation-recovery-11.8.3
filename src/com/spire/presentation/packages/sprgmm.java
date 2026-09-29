/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhwia;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsom;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprycn;

public class sprgmm
extends sprqqe {
    private final sprszm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgmm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_84() > 1) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, true);
        }
        this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(n));
    }

    public static sprgmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgmm) {
            return (sprgmm)arg0;
        }
        if (arg0 != null) {
            return new sprgmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsom[] cfr_renamed_3262() {
        int n;
        sprsom[] sprsomArray = new sprsom[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprsomArray.length) {
            int n3 = n++;
            sprsomArray[n3] = sprsom.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsomArray;
    }

    public sprxpm[] cfr_renamed_4896() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprxpm[] sprxpmArray = new sprxpm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprxpmArray.length) {
            int n3 = n++;
            sprxpmArray[n3] = sprxpm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprxpmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_4));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgmm(sprxpm[] sprxpmArray, sprsom[] sprsomArray) {
        void arg1;
        void arg0;
        if (sprsomArray == null) {
            throw new IllegalArgumentException(sprhwia.cfr_renamed_9("$|f}sam}f)#mb`maw.ak#`vbo"));
        }
        if (arg0 != null && ((void)arg0).length != 0) {
            sprgmm sprgmm2 = this;
            sprgmm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
        }
        this.cfr_renamed_3 = new sprcen((sprco[])arg1);
    }
}

