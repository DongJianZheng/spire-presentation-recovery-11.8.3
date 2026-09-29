/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;

public class sprzzl
extends sprqqe
implements sprhl,
sprdl {
    public sprmbm cfr_renamed_102;
    public sprgbf cfr_renamed_93;
    public sprktm cfr_renamed_86;
    public sprvhm cfr_renamed_152;
    public sprrcm cfr_renamed_112;
    public sprrcm cfr_renamed_119;
    public sprnbm cfr_renamed_91;
    public sprktm cfr_renamed_0;
    public sprddm cfr_renamed_1;
    public sprszm cfr_renamed_2;
    public sprnbm cfr_renamed_3;
    public sprgbf cfr_renamed_4;

    public sprgbf cfr_renamed_2153() {
        return this.cfr_renamed_4;
    }

    public sprktm cfr_renamed_569() {
        return this.cfr_renamed_0;
    }

    public sprddm cfr_renamed_79() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_2;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_91;
    }

    public sprmbm cfr_renamed_98() {
        return this.cfr_renamed_102;
    }

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_3;
    }

    public sprrcm cfr_renamed_2148() {
        return this.cfr_renamed_119;
    }

    public static sprzzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzzl) {
            return (sprzzl)arg0;
        }
        if (arg0 != null) {
            return new sprzzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrcm cfr_renamed_2146() {
        return this.cfr_renamed_112;
    }

    public sprgbf cfr_renamed_2156() {
        return this.cfr_renamed_93;
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprzzl(sprszm arg0) {
        int n;
        sprzzl sprzzl2;
        int n2 = 0;
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2.cfr_renamed_85(0) instanceof sprnvm) {
            this.cfr_renamed_0 = sprktm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), true);
            sprzzl2 = this;
        } else {
            n2 = -1;
            sprzzl2 = this;
            this.cfr_renamed_0 = new sprktm(0L);
        }
        sprzzl2.cfr_renamed_86 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 1));
        sprszm sprszm2 = arg0;
        int n3 = n2;
        this.cfr_renamed_1 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n3 + 2));
        this.cfr_renamed_91 = sprnbm.cfr_renamed_23(sprszm2.cfr_renamed_85(n3 + 3));
        sprszm sprszm3 = (sprszm)sprszm2.cfr_renamed_85(n2 + 4);
        sprszm sprszm4 = arg0;
        int n4 = n2;
        sprzzl sprzzl3 = this;
        sprzzl3.cfr_renamed_119 = sprrcm.cfr_renamed_23(sprszm3.cfr_renamed_85(0));
        sprzzl3.cfr_renamed_112 = sprrcm.cfr_renamed_23(sprszm3.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(n4 + 5));
        this.cfr_renamed_152 = sprvhm.cfr_renamed_23(sprszm4.cfr_renamed_85(n4 + 6));
        int n5 = n = sprszm4.cfr_renamed_84() - (n2 + 6) - 1;
        while (n5 > 0) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 6 + n));
            switch (sprnvm2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_93 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 3: {
                    this.cfr_renamed_102 = sprmbm.cfr_renamed_23(sprnvm2);
                    break;
                }
            }
            n5 = --n;
        }
        return;
    }

    public static sprzzl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprzzl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_86;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_0.cfr_renamed_5023() + 1;
    }
}

