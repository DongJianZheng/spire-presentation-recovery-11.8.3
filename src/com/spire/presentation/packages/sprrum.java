/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfzl;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprrum
extends sprqqe {
    private sprjfn cfr_renamed_3;
    private sprfzl cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrum sprrum2 = this;
        sprrvm2.cfr_renamed_5004(sprrum2.cfr_renamed_3);
        if (sprrum2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sprfzl cfr_renamed_4273() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprrum(sprjfn sprjfn2, sprfzl sprfzl2) {
        void arg0;
        sprrum sprrum2 = this;
        sprrum2.cfr_renamed_3 = arg0;
        sprrum2.cfr_renamed_4 = sprfzl2;
    }

    private /* synthetic */ sprrum(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprjfn.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprfzl.cfr_renamed_23(sprqvg.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true));
        }
    }

    public sprjfn cfr_renamed_4274() {
        return this.cfr_renamed_3;
    }

    public static sprrum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprrum.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprrum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrum) {
            return (sprrum)arg0;
        }
        if (arg0 != null) {
            return new sprrum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrum(sprjfn arg0) {
        this(arg0, null);
    }
}

