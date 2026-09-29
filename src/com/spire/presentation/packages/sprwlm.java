/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzsm;

public class sprwlm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwlm(sprzsm[] sprzsmArray) {
        void arg0;
        sprwlm sprwlm2 = this;
        sprwlm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    private /* synthetic */ sprwlm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprwlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwlm) {
            return (sprwlm)arg0;
        }
        if (arg0 != null) {
            return new sprwlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzsm[] cfr_renamed_4888() {
        int n;
        sprzsm[] sprzsmArray = new sprzsm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprzsmArray.length) {
            int n3 = n++;
            sprzsmArray[n3] = sprzsm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprzsmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprwlm(sprzsm sprzsm2) {
        void arg0;
        sprwlm sprwlm2 = this;
        sprwlm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }
}

