/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtny;
import com.spire.presentation.packages.sprvsm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzbs;

public class sprplm
extends sprqqe {
    private sprvsm cfr_renamed_2;
    private sprjfn cfr_renamed_3;
    private sproug cfr_renamed_4;

    public sproug cfr_renamed_327() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprplm(byte[] byArray, sprjfn sprjfn2, sprvsm sprvsm2) {
        void arg1;
        void arg0;
        sprplm sprplm2 = this;
        sprplm sprplm3 = this;
        sprplm3.cfr_renamed_4 = new sprfvg((byte[])arg0);
        sprplm2.cfr_renamed_3 = arg1;
        sprplm2.cfr_renamed_2 = sprvsm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprplm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = (sproug)sprszm2.cfr_renamed_85(0);
        switch (arg0.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                if (arg0.cfr_renamed_85(1) instanceof sprjfn) {
                    this.cfr_renamed_3 = (sprjfn)arg0.cfr_renamed_85(1);
                    return;
                }
                this.cfr_renamed_2 = sprvsm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            case 3: {
                this.cfr_renamed_3 = (sprjfn)arg0.cfr_renamed_85(1);
                this.cfr_renamed_2 = sprvsm.cfr_renamed_23(arg0.cfr_renamed_85(2));
                return;
            }
        }
        throw new IllegalArgumentException(sprtny.cfr_renamed_9("_k`dzlr%]@]Lr`xq\u007fc\u007f`d"));
    }

    public static sprplm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprplm) {
            return (sprplm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprplm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzbs.cfr_renamed_9("\r\u001f2\u0010(\u0018 Q\u000f4\u000f8 \u0014*\u0005-\u0017-\u00146Kd")).append(arg0.getClass().getName()).toString());
    }

    public sprjfn cfr_renamed_110() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprplm sprplm2 = this;
        sprrvm2.cfr_renamed_5004(sprplm2.cfr_renamed_4);
        if (sprplm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public static sprplm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprplm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprvsm cfr_renamed_4836() {
        return this.cfr_renamed_2;
    }
}

