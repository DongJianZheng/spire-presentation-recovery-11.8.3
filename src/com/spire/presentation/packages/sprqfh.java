/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprljh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprreh;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprqfh
extends sprqqe
implements sprlm {
    private final sprco cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    private final int cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public static sprqfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqfh) {
            return (sprqfh)arg0;
        }
        if (arg0 != null) {
            return new sprqfh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public sprco cfr_renamed_8448() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprqfh sprqfh2 = this;
        return new sprycn(sprqfh2.cfr_renamed_3, sprqfh2.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprqfh(sprnvm sprnvm2) {
        sprqfh sprqfh2 = this;
        sprqfh2.cfr_renamed_3 = sprnvm2.cfr_renamed_312();
        switch (sprqfh2.cfr_renamed_3) {
            case 0: {
                void arg0;
                this.cfr_renamed_1 = sprreh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_1 = sprljh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("\u001fz\u0000u\u001a}\u00124\u0015|\u0019}\u0015qVb\u0017x\u0003qV")).append(this.cfr_renamed_3).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprqfh(int n, sprco sprco2) {
        void arg0;
        sprqfh sprqfh2 = this;
        sprqfh2.cfr_renamed_3 = arg0;
        sprqfh2.cfr_renamed_1 = sprco2;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_3;
    }
}

