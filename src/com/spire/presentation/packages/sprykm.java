/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfzl;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpaz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprykm
extends sprqqe {
    private sprjfn cfr_renamed_91;
    private final sprfzl cfr_renamed_0;
    private final sprktm cfr_renamed_1;
    private sprkgn cfr_renamed_2;
    private sproug cfr_renamed_3;
    private final sprnbm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprykm(sprnbm sprnbm2, sprktm sprktm2, sprfzl sprfzl2, sprjfn sprjfn2, sproug sproug2, sprkgn sprkgn2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprykm sprykm2 = this;
        sprykm sprykm3 = this;
        sprykm sprykm4 = this;
        sprykm4.cfr_renamed_4 = arg0;
        sprykm4.cfr_renamed_1 = arg1;
        sprykm3.cfr_renamed_0 = arg2;
        sprykm3.cfr_renamed_91 = arg3;
        sprykm2.cfr_renamed_3 = arg4;
        sprykm2.cfr_renamed_2 = sprkgn2;
    }

    public sprnbm cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    public spraen cfr_renamed_11363() {
        if (null == this.cfr_renamed_2 || this.cfr_renamed_2 instanceof spraen) {
            return (spraen)this.cfr_renamed_2;
        }
        return new spraen(this.cfr_renamed_2.cfr_renamed_314());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprykm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 6) {
            throw new IllegalArgumentException(sprpaz.cfr_renamed_9("M/G.V3A\"PaW$U4A/G$\u00042M;A"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_0 = sprfzl.cfr_renamed_23(v0.cfr_renamed_85(2));
        int n = 3;
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sprjfn) {
            this.cfr_renamed_91 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sproug) {
            this.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sprkgn) {
            this.cfr_renamed_2 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(n));
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprykm sprykm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprykm2.cfr_renamed_0);
        if (sprykm2.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    public void cfr_renamed_11364(sprjfn arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_11365(sproug arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_11366(sprkgn arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sproug cfr_renamed_11367() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_11368() {
        if (this.cfr_renamed_3 != null) {
            return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_186());
        }
        return null;
    }

    public static sprykm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprykm) {
            return (sprykm)arg0;
        }
        if (arg0 != null) {
            return new sprykm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkgn cfr_renamed_11369() {
        return this.cfr_renamed_2;
    }

    public sprjfn cfr_renamed_11370() {
        return this.cfr_renamed_91;
    }

    public sprfzl cfr_renamed_11371() {
        return this.cfr_renamed_0;
    }
}

