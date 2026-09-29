/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcih;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgh;
import com.spire.presentation.packages.sprhhh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.spruoo;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprlfh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_119 = 2;
    private final sprco cfr_renamed_91;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 0;
    private final int cfr_renamed_2;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 4;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_2;
    }

    public static sprlfh cfr_renamed_8273(sprhgh arg0) {
        return new sprlfh(1, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprlfh(sprnvm sprnvm2) {
        sprlfh sprlfh2 = this;
        sprlfh2.cfr_renamed_2 = sprnvm2.cfr_renamed_312();
        switch (sprlfh2.cfr_renamed_2) {
            case 0: {
                void arg0;
                this.cfr_renamed_91 = sprhhh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_91 = sprhgh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: 
            case 3: 
            case 4: {
                void arg0;
                this.cfr_renamed_91 = sprcih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spruoo.cfr_renamed_9("oHpGjOb\u0006eNiOeC&PgJsC&")).append(this.cfr_renamed_2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprlfh(int n, sprco sprco2) {
        void arg0;
        sprlfh sprlfh2 = this;
        sprlfh2.cfr_renamed_2 = arg0;
        sprlfh2.cfr_renamed_91 = sprco2;
    }

    public static sprlfh cfr_renamed_8274(sprcih arg0) {
        return new sprlfh(2, arg0);
    }

    public static sprlfh cfr_renamed_8275(sprhhh arg0) {
        return new sprlfh(0, arg0);
    }

    public static sprlfh cfr_renamed_8276(sprcih arg0) {
        return new sprlfh(3, arg0);
    }

    public static sprlfh cfr_renamed_8277(sprcih arg0) {
        return new sprlfh(4, arg0);
    }

    public static sprlfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlfh) {
            return (sprlfh)arg0;
        }
        if (arg0 != null) {
            return new sprlfh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public sprco cfr_renamed_8278() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprlfh sprlfh2 = this;
        return new sprycn(sprlfh2.cfr_renamed_2, sprlfh2.cfr_renamed_91);
    }
}

