/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqkm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;

public class sprlmm
extends sprqqe {
    private sproug cfr_renamed_0;
    private sprupm cfr_renamed_1;
    private spramm cfr_renamed_2;
    private sprqkm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public static sprlmm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlmm) {
            return (sprlmm)arg0;
        }
        return new sprlmm(sprszm.cfr_renamed_23(arg0));
    }

    public sprqkm cfr_renamed_683() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprlmm sprlmm2 = this;
        sprrvm2.cfr_renamed_5004(sprlmm2.cfr_renamed_4);
        if (sprlmm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprqcn(sprrvm2);
    }

    public spramm cfr_renamed_684() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlmm(sprszm sprszm2) {
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(0));
        int n = 1;
        if (v0.cfr_renamed_85(1) instanceof sprupm) {
            this.cfr_renamed_1 = sprupm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_85(n) instanceof sprqkm || arg0.cfr_renamed_85(n) instanceof sprszm) {
            this.cfr_renamed_3 = sprqkm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_85(n) instanceof sproug) {
            this.cfr_renamed_0 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        this.cfr_renamed_2 = spramm.cfr_renamed_23(arg0.cfr_renamed_85(n));
    }

    public sprnrm cfr_renamed_695() {
        if (null == this.cfr_renamed_1 || this.cfr_renamed_1 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_1;
        }
        return new sprnrm(this.cfr_renamed_1.cfr_renamed_314(), false);
    }

    /*
     * WARNING - void declaration
     */
    public sprlmm(sprupm sprupm2, sprqkm sprqkm2, sproug sproug2, spramm spramm2) {
        void arg2;
        void arg1;
        void arg0;
        sprlmm sprlmm2 = this;
        sprlmm sprlmm3 = this;
        sprlmm sprlmm4 = this;
        sprlmm4.cfr_renamed_4 = new sprktm(1L);
        sprlmm3.cfr_renamed_1 = arg0;
        sprlmm3.cfr_renamed_3 = arg1;
        sprlmm2.cfr_renamed_0 = arg2;
        sprlmm2.cfr_renamed_2 = spramm2;
    }

    public sprupm cfr_renamed_5388() {
        return this.cfr_renamed_1;
    }

    public sproug cfr_renamed_480() {
        return this.cfr_renamed_0;
    }
}

