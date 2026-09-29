/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdnaa;
import com.spire.presentation.packages.sprezg;
import com.spire.presentation.packages.sprivg;
import com.spire.presentation.packages.sprjdh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpyg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprpdh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 3;
    private final sprco cfr_renamed_1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 1;
    private final int cfr_renamed_4;

    public static sprpdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpdh) {
            return (sprpdh)arg0;
        }
        if (arg0 != null) {
            return new sprpdh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprpdh sprpdh2 = this;
        return new sprycn(sprpdh2.cfr_renamed_4, sprpdh2.cfr_renamed_1);
    }

    public static sprpdh cfr_renamed_8382(sprezg arg0) {
        return new sprpdh(1, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_4;
    }

    public static sprpdh cfr_renamed_8383(sprpyg arg0) {
        return new sprpdh(2, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprpdh(sprnvm sprnvm2) {
        sprpdh sprpdh2 = this;
        sprpdh2.cfr_renamed_4 = sprnvm2.cfr_renamed_312();
        switch (sprpdh2.cfr_renamed_4) {
            case 0: {
                void arg0;
                this.cfr_renamed_1 = sprjdh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_1 = sprezg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_1 = sprpyg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_1 = sprivg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdnaa.cfr_renamed_9("t!k.q&yo~'r&~*=9|#h*=")).append(this.cfr_renamed_4).toString());
    }

    public sprco cfr_renamed_8384() {
        return this.cfr_renamed_1;
    }

    public static sprpdh cfr_renamed_8385(sprjdh arg0) {
        return new sprpdh(0, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpdh(int n, sprco sprco2) {
        void arg0;
        sprpdh sprpdh2 = this;
        sprpdh2.cfr_renamed_4 = arg0;
        sprpdh2.cfr_renamed_1 = sprco2;
    }

    public static sprpdh cfr_renamed_8386(sprivg arg0) {
        return new sprpdh(3, arg0);
    }
}

