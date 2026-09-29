/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprghh;
import com.spire.presentation.packages.sprkch;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprojn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprvdh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.spryd;

public class sprmch
extends sprqqe
implements sprlm,
spryd {
    private final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    private final sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprmch(sprnvm sprnvm2) {
        sprmch sprmch2 = this;
        sprmch2.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprmch2.cfr_renamed_0) {
            case 0: {
                void arg0;
                this.cfr_renamed_4 = sprkch.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_4 = sprvdh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_4 = sprghh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprojn.cfr_renamed_9("2--\"7*?c8+4*8&{5:/.&{")).append(this.cfr_renamed_0).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprmch sprmch2 = this;
        return new sprycn(sprmch2.cfr_renamed_0, sprmch2.cfr_renamed_4);
    }

    public sprco cfr_renamed_8377() {
        return this.cfr_renamed_4;
    }

    public static sprmch cfr_renamed_8378(sprghh arg0) {
        return new sprmch(2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmch(int n, sprco sprco2) {
        void arg0;
        sprmch sprmch2 = this;
        sprmch2.cfr_renamed_0 = arg0;
        sprmch2.cfr_renamed_4 = sprco2;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }

    public static sprmch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmch) {
            return (sprmch)arg0;
        }
        if (arg0 != null) {
            return new sprmch(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprmch cfr_renamed_8379(sprvdh arg0) {
        return new sprmch(1, arg0);
    }

    public static sprmch cfr_renamed_8380(sprkch arg0) {
        return new sprmch(0, arg0);
    }
}

