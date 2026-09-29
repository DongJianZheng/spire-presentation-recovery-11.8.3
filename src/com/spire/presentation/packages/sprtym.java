/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprtym
extends sprqqe {
    private final sprybn[] cfr_renamed_4;

    private /* synthetic */ sprtym(sprszm sprszm2) {
        this.cfr_renamed_4 = sprcrm.cfr_renamed_11360(sprszm2);
    }

    public static sprtym cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtym) {
            return (sprtym)arg0;
        }
        if (arg0 != null) {
            return new sprtym(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtym(sprybn[] sprybnArray) {
        this.cfr_renamed_4 = sprcrm.cfr_renamed_11358(sprybnArray);
    }

    public sprybn[] cfr_renamed_11425() {
        return sprcrm.cfr_renamed_11358(this.cfr_renamed_4);
    }

    public static sprtym cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtym.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprtym(sprybn sprybn2) {
        void arg0;
        sprybn[] sprybnArray = new sprybn[1];
        sprybnArray[0] = arg0;
        this.cfr_renamed_4 = sprybnArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }
}

