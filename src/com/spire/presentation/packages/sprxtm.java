/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprfgq;
import com.spire.presentation.packages.sprknm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprxtm
extends sprqqe {
    public sprszm cfr_renamed_3;
    public sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxtm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfgq.cfr_renamed_9("|\u0017ZVM\u0013O\u0003[\u0018]\u0013\u001e\u0005W\f[L\u001e")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public static sprxtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxtm) {
            return (sprxtm)arg0;
        }
        if (arg0 != null) {
            return new sprxtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdcm[] cfr_renamed_4648() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprdcm[] sprdcmArray = new sprdcm[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            sprdcmArray[n3] = sprdcm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdcmArray;
    }

    public sprknm[] cfr_renamed_626() {
        int n;
        sprknm[] sprknmArray = new sprknm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprknmArray[n3] = sprknm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprknmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprxtm(sprknm sprknm2) {
        void arg0;
        sprxtm sprxtm2 = this;
        sprxtm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprxtm sprxtm2 = this;
        sprrvm2.cfr_renamed_5004(sprxtm2.cfr_renamed_4);
        if (sprxtm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }
}

