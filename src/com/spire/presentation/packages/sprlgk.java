/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprsva;

public class sprlgk {
    private final int cfr_renamed_1;
    private final spreuh cfr_renamed_2;
    private final int cfr_renamed_3;
    private final spreuh cfr_renamed_4;

    public int cfr_renamed_1843() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3318() {
        return (this.cfr_renamed_2.cfr_renamed_1769().cfr_renamed_1938() - (13 + sprlgk.cfr_renamed_1340(this.cfr_renamed_3))) / 8 * 8;
    }

    public spreuh cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_3316() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprlgk(int n, spreuh spreuh2, spreuh spreuh3, int n2) {
        void arg3;
        void arg1;
        void arg0;
        void arg2;
        if (!spreuh2.cfr_renamed_1769().cfr_renamed_8896(arg2.cfr_renamed_1769())) {
            throw new IllegalArgumentException(sprsva.cfr_renamed_9("\f\b\u0015\t\b\u0014\\\t\u0019\u0002\u0018G\b\b\\\u0005\u0019G\u0013\t\\\u0013\u0014\u0002\\\u0014\u001d\n\u0019G\u001f\u0012\u000e\u0011\u0019"));
        }
        sprlgk sprlgk2 = this;
        this.cfr_renamed_1 = arg0;
        sprlgk2.cfr_renamed_2 = arg1;
        sprlgk2.cfr_renamed_4 = arg2;
        this.cfr_renamed_3 = arg3;
    }

    public int cfr_renamed_3317() {
        return this.cfr_renamed_2.cfr_renamed_1769().cfr_renamed_1938();
    }

    private static /* synthetic */ int cfr_renamed_1340(int arg0) {
        int n = 0;
        int n2 = arg0;
        while ((arg0 = n2 >> 1) != 0) {
            n2 = arg0;
            ++n;
        }
        return n;
    }

    public spreuh cfr_renamed_1155() {
        return this.cfr_renamed_2;
    }
}

