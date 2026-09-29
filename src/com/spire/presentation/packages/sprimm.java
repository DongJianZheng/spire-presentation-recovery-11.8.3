/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprimm
extends sprqqe {
    private sprktm cfr_renamed_1;
    private sprlvm cfr_renamed_2;
    private sproug cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public byte[] cfr_renamed_580() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprimm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_1 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprimm sprimm2 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprimm2.cfr_renamed_2 = sprlvm.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprimm2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(3));
    }

    public sprlvm cfr_renamed_2589() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprimm(sprddm sprddm2, sprlvm sprlvm2, byte[] byArray) {
        void arg2;
        void arg0;
        sprimm sprimm2 = this;
        sprimm sprimm3 = this;
        sprimm3.cfr_renamed_1 = new sprktm(0L);
        sprimm2.cfr_renamed_4 = arg0;
        sprimm2.cfr_renamed_2 = sprlvm2;
        sprimm2.cfr_renamed_3 = new sprfvg(sproze.cfr_renamed_158((byte[])arg2));
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprimm sprimm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprimm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprimm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprqcn(sprrvm2);
    }

    public static sprimm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprimm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public static sprimm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprimm) {
            return (sprimm)arg0;
        }
        if (arg0 != null) {
            return new sprimm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

