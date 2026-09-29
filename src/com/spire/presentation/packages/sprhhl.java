/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccl;
import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sprhkl;
import com.spire.presentation.packages.sprlil;

public abstract class sprhhl
extends Enum<sprhhl>
implements sprgn {
    public static final /* enum */ sprhhl cfr_renamed_1;
    public static final /* enum */ sprhhl cfr_renamed_2;
    public static final /* enum */ sprhhl cfr_renamed_3;
    private static final /* synthetic */ sprhhl[] cfr_renamed_4;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ sprhhl() {
        void arg1;
        void arg0;
    }

    public static sprhhl[] values() {
        return (sprhhl[])cfr_renamed_4.clone();
    }

    static {
        cfr_renamed_3 = new sprlil();
        cfr_renamed_2 = new sprhkl();
        cfr_renamed_1 = new sprccl();
        sprhhl[] sprhhlArray = new sprhhl[3];
        sprhhlArray[0] = cfr_renamed_3;
        sprhhlArray[1] = cfr_renamed_2;
        sprhhlArray[2] = cfr_renamed_1;
        cfr_renamed_4 = sprhhlArray;
    }

    public static sprhhl valueOf(String arg0) {
        return Enum.valueOf(sprhhl.class, arg0);
    }

    public /* synthetic */ sprhhl(String arg0, int arg1, sprlil arg2) {
        this(arg0, arg1);
    }
}

