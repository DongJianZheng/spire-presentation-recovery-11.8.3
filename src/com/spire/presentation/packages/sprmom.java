/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprivm;
import com.spire.presentation.packages.sprlom;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprmom
extends sprqqe {
    public sprivm cfr_renamed_3;
    public sprlom cfr_renamed_4;

    public static sprmom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmom) {
            return (sprmom)arg0;
        }
        if (arg0 != null) {
            return new sprmom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprivm cfr_renamed_4115() {
        return this.cfr_renamed_3;
    }

    public sprlom cfr_renamed_4285() {
        return this.cfr_renamed_4;
    }

    public static sprmom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprmom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprmom(sprivm sprivm2, sprlom sprlom2) {
        void arg0;
        sprmom sprmom2 = this;
        sprmom2.cfr_renamed_3 = arg0;
        sprmom2.cfr_renamed_4 = sprlom2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprmom sprmom2 = this;
        sprrvm2.cfr_renamed_5004(sprmom2.cfr_renamed_3);
        if (sprmom2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprmom(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprivm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprlom.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true);
        }
    }
}

