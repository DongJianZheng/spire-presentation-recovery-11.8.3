/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprkgh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprbkh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_2;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkh(int n, sprco sprco2) {
        void arg0;
        sprbkh sprbkh2 = this;
        sprbkh2.cfr_renamed_2 = arg0;
        sprbkh2.cfr_renamed_3 = sprco2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprbkh sprbkh2 = this;
        return new sprycn(sprbkh2.cfr_renamed_2, sprbkh2.cfr_renamed_3);
    }

    public static sprbkh cfr_renamed_8260(sprkgh arg0) {
        return new sprbkh(0, arg0);
    }

    public static sprbkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbkh) {
            return (sprbkh)arg0;
        }
        if (arg0 != null) {
            return new sprbkh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprbkh(sprnvm sprnvm2) {
        sprbkh sprbkh2 = this;
        sprbkh2.cfr_renamed_2 = sprnvm2.cfr_renamed_312();
        switch (sprbkh2.cfr_renamed_2) {
            case 0: {
                void arg0;
                this.cfr_renamed_3 = sprkgh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjre.cfr_renamed_9("v%i*s\"{k|#p\"|.?=~'j.?")).append(this.cfr_renamed_2).toString());
    }

    public sprco cfr_renamed_8261() {
        return this.cfr_renamed_3;
    }
}

