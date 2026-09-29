/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprznj;

public class sprzeh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_1;
    private final sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    @Override
    public sprxgf cfr_renamed_119() {
        sprzeh sprzeh2 = this;
        return new sprycn(sprzeh2.cfr_renamed_1, sprzeh2.cfr_renamed_2);
    }

    public static sprzeh cfr_renamed_8232(sprctg arg0) {
        return new sprzeh(0, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    public sprco cfr_renamed_8233() {
        return this.cfr_renamed_2;
    }

    public static sprzeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzeh) {
            return (sprzeh)arg0;
        }
        if (arg0 != null) {
            return new sprzeh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprzeh(sprnvm sprnvm2) {
        sprzeh sprzeh2 = this;
        sprzeh2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprzeh2.cfr_renamed_1) {
            case 0: {
                void arg0;
                this.cfr_renamed_2 = sprctg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_2 = sprgfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprznj.cfr_renamed_9("dv{yaqi8npbqn}-nltx}-")).append(this.cfr_renamed_1).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprzeh(int n, sprco sprco2) {
        void arg0;
        sprzeh sprzeh2 = this;
        sprzeh2.cfr_renamed_1 = arg0;
        sprzeh2.cfr_renamed_2 = sprco2;
    }

    public static sprzeh cfr_renamed_8234(sprgfh arg0) {
        return new sprzeh(1, arg0);
    }
}

