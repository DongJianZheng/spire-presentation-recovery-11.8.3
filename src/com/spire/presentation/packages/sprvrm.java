/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfxd;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprvrm
extends sprqqe {
    private final byte[] cfr_renamed_2;
    private final sprvhm cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    public static sprvrm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return new sprvrm(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprvrm(sprlem sprlem2, sprvhm sprvhm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprvrm sprvrm2 = this;
        this.cfr_renamed_4 = arg0;
        sprvrm2.cfr_renamed_3 = arg1;
        sprvrm2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprvrm sprvrm2 = this;
        sprrvm2.cfr_renamed_5004(sprvrm2.cfr_renamed_4);
        if (sprvrm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        return new sprcen(sprrvm2);
    }

    public sprlem cfr_renamed_2105() {
        return this.cfr_renamed_4;
    }

    public static sprvrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvrm) {
            return (sprvrm)arg0;
        }
        if (arg0 != null) {
            return new sprvrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvhm cfr_renamed_2096() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvrm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 2) {
            sprvrm sprvrm2 = this;
            void v1 = arg0;
            this.cfr_renamed_4 = sprlem.cfr_renamed_23(v1.cfr_renamed_85(0));
            sprvrm2.cfr_renamed_2 = sproug.cfr_renamed_23(v1.cfr_renamed_85(1)).cfr_renamed_186();
            sprvrm2.cfr_renamed_3 = null;
            return;
        }
        if (arg0.cfr_renamed_84() == 3) {
            sprvrm sprvrm3 = this;
            void v3 = arg0;
            this.cfr_renamed_4 = sprlem.cfr_renamed_23(v3.cfr_renamed_85(0));
            sprvrm3.cfr_renamed_3 = sprvhm.cfr_renamed_5085(sprnvm.cfr_renamed_23(v3.cfr_renamed_85(1)), false);
            sprvrm3.cfr_renamed_2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfxd.cfr_renamed_9("lYrYv@w\u0017jRhB|YzR9[|Y~Cq\r9")).append(arg0.cfr_renamed_84()).toString());
    }

    public byte[] cfr_renamed_7453() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }
}

