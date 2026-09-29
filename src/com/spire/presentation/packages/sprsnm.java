/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrbia;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprsnm
extends sprqqe {
    private final sprszm cfr_renamed_3;
    private final sprikm cfr_renamed_4;

    public static sprsnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsnm) {
            return (sprsnm)arg0;
        }
        if (arg0 != null) {
            return new sprsnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprikm cfr_renamed_4351() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsnm(sprikm sprikm2, sprszm sprszm2) {
        void arg0;
        sprsnm sprsnm2 = this;
        sprsnm2.cfr_renamed_4 = arg0;
        sprsnm2.cfr_renamed_3 = sprszm2;
    }

    public sprszm cfr_renamed_2369() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprsnm sprsnm2 = this;
        sprrvm2.cfr_renamed_5004(sprsnm2.cfr_renamed_4);
        if (sprsnm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsnm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 1 && arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprrbia.cfr_renamed_9("\u0001\u0014\u0014\t\u0007\u0018\u0001\bD\u001f\u0001\u001d\u0011\t\n\u000f\u0001L\u0017\u0005\u001e\tD\u0003\u0002LUL\u000b\u001eD^"));
        }
        this.cfr_renamed_4 = sprikm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_3 = null;
    }
}

