/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbzg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprocaa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrzg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprywg;

public class spriug
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_91 = 2;
    public static final int cfr_renamed_0 = 1;
    public final sprco cfr_renamed_1;
    public final int cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 3;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriug(int n, sprco sprco2) {
        void arg0;
        switch (n) {
            case 0: {
                void arg1;
                while (false) {
                }
                spriug spriug2 = this;
                this.cfr_renamed_1 = sprbzg.cfr_renamed_23(arg1);
                break;
            }
            case 1: 
            case 2: {
                void arg1;
                spriug spriug2 = this;
                this.cfr_renamed_1 = sprrzg.cfr_renamed_23(arg1);
                break;
            }
            case 3: {
                void arg1;
                spriug spriug2 = this;
                this.cfr_renamed_1 = sprywg.cfr_renamed_23(arg1);
                break;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprocaa.cfr_renamed_9("nYqVk^c\u0017d_h^dR'Af[rR'")).append((int)arg0).toString());
            }
        }
        spriug2.cfr_renamed_2 = arg0;
    }

    private /* synthetic */ spriug(sprnvm arg0) {
        this(arg0.cfr_renamed_312(), arg0.cfr_renamed_8225());
    }

    public static spriug cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriug) {
            return (spriug)arg0;
        }
        if (arg0 != null) {
            return new spriug(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static spriug cfr_renamed_8228(sprrzg arg0) {
        return new spriug(2, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_2;
    }

    public static spriug cfr_renamed_8229(sprrzg arg0) {
        return new spriug(1, arg0);
    }

    public sprco cfr_renamed_8218() {
        return this.cfr_renamed_1;
    }

    public static spriug cfr_renamed_8230(sprywg arg0) {
        return new spriug(3, arg0);
    }

    public static spriug cfr_renamed_8231(sprbzg arg0) {
        return new spriug(0, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        spriug spriug2 = this;
        return new sprycn(spriug2.cfr_renamed_2, spriug2.cfr_renamed_1);
    }
}

