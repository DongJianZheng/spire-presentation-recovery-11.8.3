/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprvhm;

public class spring {
    private final sprvhm cfr_renamed_1;
    private final sprhgm cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprnbm cfr_renamed_4;

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_4;
    }

    public spring(sprurm sprurm2) {
        spring spring2;
        sprszm sprszm2 = sprszm.cfr_renamed_23(sprurm2.cfr_renamed_206().cfr_renamed_85(0));
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            spring2 = this;
            this.cfr_renamed_4 = sprnbm.cfr_renamed_5085(sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)), true);
        } else {
            spring2 = this;
            this.cfr_renamed_4 = null;
        }
        int n2 = ++n;
        spring2.cfr_renamed_1 = sprvhm.cfr_renamed_23(sprszm2.cfr_renamed_85(n2));
        sprhgm sprhgm2 = null;
        sprddm sprddm2 = null;
        if (++n != sprszm2.cfr_renamed_84()) {
            int n3 = n;
            while (n3 < sprszm2.cfr_renamed_84()) {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
                if (sprnvm2.cfr_renamed_312() == 1) {
                    sprhgm2 = sprhgm.cfr_renamed_5085(sprnvm2, false);
                } else if (sprnvm2.cfr_renamed_312() == 2) {
                    sprddm2 = sprddm.cfr_renamed_5085(sprnvm2, false);
                } else {
                    throw new IllegalArgumentException(sprnmy.cfr_renamed_9("T\u0001J\u0001N\u0018OOU\u000eF"));
                }
                n3 = ++n;
            }
        }
        this.cfr_renamed_2 = sprhgm2;
        this.cfr_renamed_3 = sprddm2;
    }

    public sprvhm cfr_renamed_7410() {
        return this.cfr_renamed_1;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_3;
    }
}

