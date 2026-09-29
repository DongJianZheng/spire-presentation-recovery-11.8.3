/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryxha;

public class sprysm
extends sprqqe
implements sprdl {
    private spruom cfr_renamed_3;
    private sprcpm cfr_renamed_4;

    public sprcpm cfr_renamed_1470() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprysm sprysm2 = this;
        sprrvm2.cfr_renamed_5004(new sprktm(3L));
        sprrvm2.cfr_renamed_5004(sprysm2.cfr_renamed_3);
        if (sprysm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprqcn(sprrvm2);
    }

    public spruom cfr_renamed_1475() {
        return this.cfr_renamed_3;
    }

    public static sprysm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprysm) {
            return (sprysm)arg0;
        }
        if (arg0 != null) {
            return new sprysm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprysm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = null;
        if (!sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_7241(3)) {
            throw new IllegalArgumentException(spryxha.cfr_renamed_9("K8S$[jJ/N9U%RjZ%Njl\fdjl\u000ei"));
        }
        this.cfr_renamed_3 = spruom.cfr_renamed_23(arg0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprcpm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprysm(spruom spruom2, sprcpm sprcpm2) {
        void arg0;
        sprysm sprysm2 = this;
        this.cfr_renamed_4 = null;
        sprysm2.cfr_renamed_3 = arg0;
        sprysm2.cfr_renamed_4 = sprcpm2;
    }
}

