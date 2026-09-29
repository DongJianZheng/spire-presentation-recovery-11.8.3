/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproxc;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.spryrg;

public class sprxeh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_1;
    private final sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    public static sprxeh cfr_renamed_8262() {
        return new sprxeh(1, sprpen.cfr_renamed_4);
    }

    public static sprxeh cfr_renamed_8263(spryrg arg0) {
        return new sprxeh(0, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprxeh(int n, sprco sprco2) {
        void arg1;
        sprxeh sprxeh2 = this;
        sprxeh2.cfr_renamed_2 = arg1;
        sprxeh2.cfr_renamed_1 = n;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprxeh sprxeh2 = this;
        return new sprycn(sprxeh2.cfr_renamed_1, sprxeh2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprxeh(sprnvm sprnvm2) {
        sprxeh sprxeh2 = this;
        sprxeh2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprxeh2.cfr_renamed_1) {
            case 0: {
                void arg0;
                this.cfr_renamed_2 = spryrg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_2 = sprfan.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproxc.cfr_renamed_9("\u001eF\u0001I\u001bA\u0013\b\u0014@\u0018A\u0014MW^\u0016D\u0002MW")).append(this.cfr_renamed_1).toString());
    }

    public sprco cfr_renamed_8264() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    public static sprxeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxeh) {
            return (sprxeh)arg0;
        }
        if (arg0 != null) {
            return new sprxeh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }
}

