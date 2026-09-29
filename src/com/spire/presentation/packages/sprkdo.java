/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzqh;

@sprtea
public final class sprkdo {
    public int cfr_renamed_112;
    public static sprkdo cfr_renamed_119;
    private int cfr_renamed_91;
    private static int cfr_renamed_0;
    private static sprdz cfr_renamed_1;
    public static sprkdo cfr_renamed_2;
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    static {
        cfr_renamed_2 = new sprkdo(sprtma.cfr_renamed_9("{k"), 0, 1);
        cfr_renamed_119 = new sprkdo(sprzqh.cfr_renamed_9("Z0"), 1, 4);
        cfr_renamed_1 = new sprvrx();
        cfr_renamed_0 = 0;
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprkdo(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprkdo sprkdo2 = this;
        this.cfr_renamed_91 = arg2;
        sprkdo2.cfr_renamed_3 = arg0;
        sprkdo2.cfr_renamed_4 = cfr_renamed_0++;
        sprkdo2.cfr_renamed_112 = n;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_15472() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        return this.cfr_renamed_3;
    }

    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_1;
    }

    public static sprkdo cfr_renamed_15474(String arg0) {
        for (sprkdo sprkdo2 : cfr_renamed_1) {
            if (!sprraia.cfr_renamed_11730(sprkdo2.cfr_renamed_3, arg0)) continue;
            return sprkdo2;
        }
        throw new IllegalArgumentException(arg0);
    }
}

