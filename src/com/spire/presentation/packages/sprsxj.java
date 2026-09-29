/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sproak;
import com.spire.presentation.packages.sproze;
import javax.crypto.interfaces.PBEKey;

public class sprsxj
extends sproak
implements PBEKey {
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public byte[] getSalt() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsxj(char[] cArray, sprgn sprgn2, byte[] byArray, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprsxj sprsxj2 = this;
        super((char[])arg0, (sprgn)arg1);
        sprsxj2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg2);
        sprsxj2.cfr_renamed_3 = n;
    }

    @Override
    public int getIterationCount() {
        return this.cfr_renamed_3;
    }
}

