/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjnn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprogh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprudh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprqeh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    private final sprco cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprqeh(sprnvm sprnvm2) {
        sprqeh sprqeh2 = this;
        sprqeh2.cfr_renamed_4 = sprnvm2.cfr_renamed_312();
        switch (sprqeh2.cfr_renamed_4) {
            case 0: {
                void arg0;
                this.cfr_renamed_3 = sprogh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_3 = sprudh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjnn.cfr_renamed_9("\u00131\f>\u00166\u001e\u007f\u00197\u00156\u0019:Z)\u001b3\u000f:Z")).append(this.cfr_renamed_4).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprqeh(int n, sprco sprco2) {
        void arg0;
        sprqeh sprqeh2 = this;
        sprqeh2.cfr_renamed_4 = arg0;
        sprqeh2.cfr_renamed_3 = sprco2;
    }

    public sprco cfr_renamed_8467() {
        return this.cfr_renamed_3;
    }

    public static sprqeh cfr_renamed_8468(sprudh arg0) {
        return new sprqeh(1, arg0);
    }

    public static sprqeh cfr_renamed_8469(sprogh arg0) {
        return new sprqeh(0, arg0);
    }

    public static sprqeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqeh) {
            return (sprqeh)arg0;
        }
        if (arg0 != null) {
            return new sprqeh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprqeh sprqeh2 = this;
        return new sprycn(sprqeh2.cfr_renamed_4, sprqeh2.cfr_renamed_3);
    }
}

