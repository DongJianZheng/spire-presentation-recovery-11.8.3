/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.sprjen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprowm
extends sprgzm {
    public sprowm(sprlem arg0, sprktm arg1, sprxgf arg2, sprycn arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    @Override
    public sprszm cfr_renamed_11294() {
        sprowm sprowm2;
        boolean bl;
        sprrvm sprrvm2 = new sprrvm(4);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0.cfr_renamed_4615());
        }
        if (0 == this.cfr_renamed_4) {
            bl = true;
            sprowm2 = this;
        } else {
            bl = false;
            sprowm2 = this;
        }
        sprrvm2.cfr_renamed_5004(new sprycn(bl, sprowm2.cfr_renamed_4, (sprco)this.cfr_renamed_3));
        return new sprcen(sprrvm2);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return this;
    }

    public sprowm(sprlem arg0, sprktm arg1, sprxgf arg2, int arg3, sprxgf arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    public sprowm(sprrvm arg0) {
        this(sprjen.cfr_renamed_11287(arg0));
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    public sprowm(sprcen arg0) {
        super(arg0);
    }
}

