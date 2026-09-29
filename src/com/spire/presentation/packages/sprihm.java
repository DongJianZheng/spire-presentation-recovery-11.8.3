/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spreqy;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprihm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public static sprihm cfr_renamed_11191(sprqqe arg0) {
        if (arg0 instanceof sprihm) {
            return (sprihm)arg0;
        }
        if (arg0 != null) {
            return new sprihm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprfdn(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprihm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spreqy.cfr_renamed_9("M^UB]\fIIKY_BYI\u001a_SV_\fSB\u001aOUBIXHYYXU^\u0000\f")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = v0.cfr_renamed_85(1);
    }

    public static sprihm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprihm.cfr_renamed_11191(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprihm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprihm sprihm2 = this;
        sprihm2.cfr_renamed_4 = arg0;
        sprihm2.cfr_renamed_3 = sprco2;
    }
}

