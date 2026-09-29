/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spriom;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrpja;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprenm
extends sprqqe {
    private spriom cfr_renamed_3;
    private sproug cfr_renamed_4;

    public static sprenm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprenm) {
            return (sprenm)arg0;
        }
        if (arg0 != null) {
            return new sprenm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprenm sprenm2 = this;
        sprrvm2.cfr_renamed_5004(sprenm2.cfr_renamed_3);
        if (sprenm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public spriom cfr_renamed_2096() {
        return this.cfr_renamed_3;
    }

    public static sprenm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprenm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sproug cfr_renamed_4838() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprenm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 1 && arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprmwd.cfr_renamed_9("\u000ef,v8m>f}k<p}j3`2q/f>w}m(n?f/#2e}f1f0f3w."));
        }
        this.cfr_renamed_3 = spriom.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sproug.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprenm(spriom spriom2, sproug sproug2) {
        void arg1;
        void arg0;
        if (spriom2 == null) {
            throw new IllegalArgumentException(sprrpja.cfr_renamed_9("\u0000\u0005-\u0010(\u00107\u0014)U5\u0000'\u0019,\u0016e\u001e \fe\u0016$\u001b+\u001a1U'\u0010e\u001b0\u0019)"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }
}

