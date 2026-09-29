/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhlaa;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruyl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.spryyl;
import java.util.Enumeration;

public class sprtfm
extends sprqqe {
    public sprszm cfr_renamed_119;
    public sprrcm cfr_renamed_91;
    public sprnbm cfr_renamed_0;
    public sprhgm cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprrcm cfr_renamed_3;
    public sprddm cfr_renamed_4;

    public static sprtfm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtfm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public sprrcm cfr_renamed_2133() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprtfm(sprszm sprszm2) {
        sprtfm sprtfm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 7) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhlaa.cfr_renamed_9("\u00047\"v537##8%3f%/,#lf")).append(arg0.cfr_renamed_84()).toString());
        }
        int n = 0;
        if (arg0.cfr_renamed_85(n) instanceof sprktm) {
            sprtfm2 = this;
            this.cfr_renamed_2 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        } else {
            sprtfm2 = this;
            this.cfr_renamed_2 = null;
        }
        sprtfm2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n));
        sprtfm sprtfm3 = this;
        sprtfm3.cfr_renamed_0 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(++n));
        sprtfm3.cfr_renamed_3 = sprrcm.cfr_renamed_23(arg0.cfr_renamed_85(++n));
        if (++n < arg0.cfr_renamed_84() && (arg0.cfr_renamed_85(n) instanceof sprgen || arg0.cfr_renamed_85(n) instanceof sprjfn || arg0.cfr_renamed_85(n) instanceof sprrcm)) {
            this.cfr_renamed_91 = sprrcm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && !(arg0.cfr_renamed_85(n) instanceof sprnvm)) {
            this.cfr_renamed_119 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprnvm) {
            this.cfr_renamed_1 = sprhgm.cfr_renamed_23(sprszm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(n), true));
        }
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_1;
    }

    public static sprtfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtfm) {
            return (sprtfm)arg0;
        }
        if (arg0 != null) {
            return new sprtfm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprpim[] cfr_renamed_4232() {
        int n;
        if (this.cfr_renamed_119 == null) {
            return new sprpim[0];
        }
        sprpim[] sprpimArray = new sprpim[this.cfr_renamed_119.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprpimArray.length) {
            int n3 = n++;
            sprpimArray[n3] = sprpim.cfr_renamed_23(this.cfr_renamed_119.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprpimArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(7);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        sprrvm sprrvm3 = sprrvm2;
        sprtfm sprtfm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprtfm2.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(sprtfm2.cfr_renamed_3);
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        }
        if (this.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_119);
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public Enumeration cfr_renamed_2135() {
        if (this.cfr_renamed_119 == null) {
            return new spryyl(null);
        }
        return new spruyl(this.cfr_renamed_119.cfr_renamed_329());
    }

    public sprrcm cfr_renamed_2132() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_569() {
        if (this.cfr_renamed_2 == null) {
            return 1;
        }
        return this.cfr_renamed_2.cfr_renamed_5023() + 1;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_0;
    }
}

