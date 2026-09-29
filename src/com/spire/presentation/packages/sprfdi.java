/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprpen;
import javax.crypto.spec.PBEKeySpec;

public class sprfdi
extends PBEKeySpec {
    private static final sprddm cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_1763, sprpen.cfr_renamed_4);
    private sprddm cfr_renamed_4;

    public sprddm cfr_renamed_2386() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprfdi(char[] cArray, byte[] byArray, int n, int n2, sprddm sprddm2) {
        super((char[])arg0, (byte[])arg1, (int)arg2, (int)arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprddm2;
    }

    public boolean cfr_renamed_2431() {
        return cfr_renamed_3.equals(this.cfr_renamed_4);
    }
}

