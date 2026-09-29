/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqyy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprgrm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_91 = 0;
    private sprco cfr_renamed_0;
    private int cfr_renamed_1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 3;

    public sprco cfr_renamed_2456() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprgrm(int n, sprlrm sprlrm2) {
        void arg0;
        sprgrm sprgrm2 = this;
        sprgrm2.cfr_renamed_1 = arg0;
        sprgrm2.cfr_renamed_0 = sprlrm2;
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprgrm(sprnvm sprnvm2) {
        sprgrm sprgrm2 = this;
        sprgrm2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprgrm2.cfr_renamed_1) {
            case 0: {
                this.cfr_renamed_0 = sprpen.cfr_renamed_4;
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_0 = spraqm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 2: 
            case 3: {
                void arg0;
                this.cfr_renamed_0 = sprlrm.cfr_renamed_5085((sprnvm)arg0, true);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlfg.cfr_renamed_9("w\u001ci\u001cm\u0005lRv\u0013eH\"")).append(this.cfr_renamed_1).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprgrm sprgrm2 = this;
        return new sprycn(false, sprgrm2.cfr_renamed_1, sprgrm2.cfr_renamed_0);
    }

    public sprgrm() {
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_0 = sprpen.cfr_renamed_4;
    }

    public static sprgrm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgrm) {
            return (sprgrm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprgrm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqyy.cfr_renamed_9("ukJdPlX%SgV`_q\u0006%")).append(arg0.getClass().getName()).toString());
    }

    public sprgrm(spraqm spraqm2) {
        sprgrm sprgrm2 = this;
        sprgrm2.cfr_renamed_1 = 1;
        sprgrm2.cfr_renamed_0 = spraqm2;
    }
}

