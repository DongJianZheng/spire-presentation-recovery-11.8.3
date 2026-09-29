/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryim;
import java.math.BigInteger;

public class sprbcm
extends sprqqe {
    public sprbxm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public sprktm cfr_renamed_5086() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        if (this.cfr_renamed_4 == null) {
            return new StringBuilder().insert(0, sprawha.cfr_renamed_9("pbAjQ@]mAw@b[mFp\b#[pqb\u001a")).append(this.cfr_renamed_296()).append(")").toString();
        }
        return new StringBuilder().insert(0, sprboj.cfr_renamed_9("HIyAikeFy\\xIcF~[0\bc[II\"")).append(this.cfr_renamed_296()).append(sprawha.cfr_renamed_9("\u001b/\u0012sSwZOWmql\\pFqSj\\w\u0012>\u0012")).append(this.cfr_renamed_4.cfr_renamed_97()).toString();
    }

    public sprbcm(boolean bl) {
        sprbcm sprbcm2;
        sprbcm sprbcm3 = this;
        sprbcm3.cfr_renamed_3 = sprbxm.cfr_renamed_655(false);
        sprbcm3.cfr_renamed_4 = null;
        if (bl) {
            sprbcm2 = this;
            this.cfr_renamed_3 = sprbxm.cfr_renamed_655(true);
        } else {
            sprbcm2 = this;
            this.cfr_renamed_3 = null;
        }
        sprbcm2.cfr_renamed_4 = null;
    }

    public static sprbcm cfr_renamed_5322(sprhgm arg0) {
        return sprbcm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_133));
    }

    public static sprbcm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprbcm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprbcm(int n) {
        void arg0;
        sprbcm sprbcm2 = this;
        this.cfr_renamed_3 = sprbxm.cfr_renamed_655(false);
        sprbcm2.cfr_renamed_4 = null;
        sprbcm2.cfr_renamed_3 = sprbxm.cfr_renamed_655(true);
        sprbcm sprbcm3 = this;
        sprbcm2.cfr_renamed_4 = new sprktm((long)arg0);
    }

    public static sprbcm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbcm) {
            return (sprbcm)arg0;
        }
        if (arg0 instanceof spryim) {
            return sprbcm.cfr_renamed_23(spryim.cfr_renamed_11124((spryim)arg0));
        }
        if (arg0 != null) {
            return new sprbcm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbcm(sprszm sprszm2) {
        void v3;
        void arg0;
        sprbcm sprbcm2 = this;
        sprbcm2.cfr_renamed_3 = sprbxm.cfr_renamed_655(false);
        sprbcm2.cfr_renamed_4 = null;
        if (sprszm2.cfr_renamed_84() == 0) {
            sprbcm sprbcm3 = this;
            sprbcm3.cfr_renamed_3 = null;
            sprbcm3.cfr_renamed_4 = null;
            return;
        }
        if (arg0.cfr_renamed_85(0) instanceof sprbxm) {
            void v2 = arg0;
            v3 = v2;
            this.cfr_renamed_3 = sprbxm.cfr_renamed_23(v2.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_3 = null;
            this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v3 = arg0;
        }
        if (v3.cfr_renamed_84() > 1) {
            if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            throw new IllegalArgumentException(sprboj.cfr_renamed_9("}ZeFm\byM{]oFiM*Ad\biGd[~Z\u007fK~Gx"));
        }
    }

    public boolean cfr_renamed_296() {
        return this.cfr_renamed_3 != null && this.cfr_renamed_3.cfr_renamed_587();
    }

    public BigInteger cfr_renamed_299() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_97();
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }
}

