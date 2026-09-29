/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjch;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprgmh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_0 = 1;
    private final sprco cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    private final int cfr_renamed_4;

    public static sprgmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgmh) {
            return (sprgmh)arg0;
        }
        if (arg0 != null) {
            return new sprgmh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgmh(int n, sprco sprco2) {
        void arg0;
        sprgmh sprgmh2 = this;
        sprgmh2.cfr_renamed_4 = arg0;
        sprgmh2.cfr_renamed_1 = sprco2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprgmh sprgmh2 = this;
        return new sprycn(sprgmh2.cfr_renamed_4, sprgmh2.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprgmh(sprnvm sprnvm2) {
        void arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_312();
        sprqqe sprqqe2 = sprnvm2.cfr_renamed_8225();
        switch (this.cfr_renamed_4) {
            case 0: 
            case 2: {
                this.cfr_renamed_1 = sprjfh.cfr_renamed_23(sprqqe2);
                return;
            }
            case 1: {
                this.cfr_renamed_1 = sprjch.cfr_renamed_23(sprqqe2);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproen.cfr_renamed_9("Y|Fs\\{T2Sz_{Sw\u0010dQ~Ew\u0010")).append(this.cfr_renamed_4).toString());
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_8290() {
        return this.cfr_renamed_4 == 1;
    }

    public static sprgmh cfr_renamed_8291(sprjch arg0) {
        return new sprgmh(1, arg0);
    }

    public static sprgmh cfr_renamed_8292(sprjfh arg0) {
        return new sprgmh(2, arg0);
    }

    public sprco cfr_renamed_8293() {
        return this.cfr_renamed_1;
    }

    public static sprgmh cfr_renamed_8294(sprjfh arg0) {
        return new sprgmh(0, arg0);
    }
}

