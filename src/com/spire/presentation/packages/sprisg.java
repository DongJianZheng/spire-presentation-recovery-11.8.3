/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlwg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpmh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprisg
extends sprqqe
implements sprlm {
    private final sprco cfr_renamed_0;
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 0;
    private final int cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_3;
    }

    public static sprisg cfr_renamed_8262() {
        return new sprisg(1, sprpen.cfr_renamed_4);
    }

    public sprco cfr_renamed_8344() {
        return this.cfr_renamed_0;
    }

    public static sprisg cfr_renamed_8345(sprlwg arg0) {
        return new sprisg(0, arg0);
    }

    public static sprisg cfr_renamed_8346(sprpmh arg0) {
        return new sprisg(2, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprisg sprisg2 = this;
        return new sprycn(sprisg2.cfr_renamed_3, sprisg2.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprisg(int n, sprco sprco2) {
        void arg1;
        void arg0;
        switch (n) {
            case 0: 
            case 1: 
            case 2: {
                break;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprbyfa.cfr_renamed_9(";#$,>$6m1%=$1(r;3!'(r")).append((int)arg0).toString());
            }
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_0 = arg1;
    }

    private /* synthetic */ sprisg(sprnvm arg0) {
        this(arg0.cfr_renamed_312(), arg0.cfr_renamed_8225());
    }

    public static sprisg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprisg) {
            return (sprisg)arg0;
        }
        if (arg0 != null) {
            return new sprisg(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }
}

