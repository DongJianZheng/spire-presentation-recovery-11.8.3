/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfsm;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprmsm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqsm;
import com.spire.presentation.packages.sprskm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprarm
extends sprqqe {
    private final sprmsm[] cfr_renamed_1;
    private final sprqsm[] cfr_renamed_2;
    private final sprskm[] cfr_renamed_3;
    private final sprfsm[] cfr_renamed_4;

    private /* synthetic */ sprskm[] cfr_renamed_11378(sprskm[] arg0) {
        sprskm[] sprskmArray = new sprskm[arg0.length];
        System.arraycopy(arg0, 0, sprskmArray, 0, sprskmArray.length);
        return sprskmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprarm(sprqsm[] sprqsmArray, sprfsm[] sprfsmArray, sprmsm[] sprmsmArray, sprskm[] sprskmArray) {
        void arg2;
        void arg1;
        void arg0;
        sprarm sprarm2 = this;
        sprarm sprarm3 = this;
        sprarm3.cfr_renamed_2 = sprarm3.cfr_renamed_11379((sprqsm[])arg0);
        sprarm2.cfr_renamed_4 = sprarm2.cfr_renamed_11380((sprfsm[])arg1);
        this.cfr_renamed_1 = sprarm2.cfr_renamed_11381((sprmsm[])arg2);
        this.cfr_renamed_3 = this.cfr_renamed_11378(sprskmArray);
    }

    public sprskm[] cfr_renamed_11376() {
        sprarm sprarm2 = this;
        return sprarm2.cfr_renamed_11378(sprarm2.cfr_renamed_3);
    }

    public sprqsm[] cfr_renamed_11375() {
        sprarm sprarm2 = this;
        return sprarm2.cfr_renamed_11379(sprarm2.cfr_renamed_2);
    }

    private /* synthetic */ sprmsm[] cfr_renamed_11381(sprmsm[] arg0) {
        sprmsm[] sprmsmArray = new sprmsm[arg0.length];
        System.arraycopy(arg0, 0, sprmsmArray, 0, sprmsmArray.length);
        return sprmsmArray;
    }

    public sprmsm[] cfr_renamed_11377() {
        sprarm sprarm2 = this;
        return sprarm2.cfr_renamed_11381(sprarm2.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprarm(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprizc.cfr_renamed_9("O{mkyp\u007f{<psj<*<{p{q{rjo0"));
        }
        sprszm sprszm3 = (sprszm)arg0.cfr_renamed_85(0);
        this.cfr_renamed_2 = new sprqsm[sprszm3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.length) {
            int n3 = n++;
            this.cfr_renamed_2[n3] = sprqsm.cfr_renamed_23(sprszm3.cfr_renamed_85(n3));
            n2 = n;
        }
        sprszm3 = (sprszm)arg0.cfr_renamed_85(1);
        this.cfr_renamed_4 = new sprfsm[sprszm3.cfr_renamed_84()];
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4.length) {
            int n5 = n++;
            this.cfr_renamed_4[n5] = sprfsm.cfr_renamed_23(sprszm3.cfr_renamed_85(n5));
            n4 = n;
        }
        sprszm3 = (sprszm)arg0.cfr_renamed_85(2);
        this.cfr_renamed_1 = new sprmsm[sprszm3.cfr_renamed_84()];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_1.length) {
            int n7 = n++;
            this.cfr_renamed_1[n7] = sprmsm.cfr_renamed_23(sprszm3.cfr_renamed_85(n7));
            n6 = n;
        }
        sprszm3 = (sprszm)arg0.cfr_renamed_85(3);
        this.cfr_renamed_3 = new sprskm[sprszm3.cfr_renamed_84()];
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_3.length) {
            int n9 = n++;
            this.cfr_renamed_3[n9] = sprskm.cfr_renamed_23(sprszm3.cfr_renamed_85(n9));
            n8 = n;
        }
    }

    public sprfsm[] cfr_renamed_11382() {
        sprarm sprarm2 = this;
        return sprarm2.cfr_renamed_11380(sprarm2.cfr_renamed_4);
    }

    private /* synthetic */ sprqsm[] cfr_renamed_11379(sprqsm[] arg0) {
        sprqsm[] sprqsmArray = new sprqsm[arg0.length];
        System.arraycopy(arg0, 0, sprqsmArray, 0, sprqsmArray.length);
        return sprqsmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = new sprcen(this.cfr_renamed_2);
        sprcoArray[1] = new sprcen(this.cfr_renamed_4);
        sprcoArray[2] = new sprcen(this.cfr_renamed_1);
        sprcoArray[3] = new sprcen(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    private /* synthetic */ sprfsm[] cfr_renamed_11380(sprfsm[] arg0) {
        sprfsm[] sprfsmArray = new sprfsm[arg0.length];
        System.arraycopy(arg0, 0, sprfsmArray, 0, sprfsmArray.length);
        return sprfsmArray;
    }

    public static sprarm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprarm) {
            return (sprarm)arg0;
        }
        if (arg0 != null) {
            return new sprarm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

