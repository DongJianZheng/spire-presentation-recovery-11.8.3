/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sprhtj;
import com.spire.presentation.packages.sproze;
import javax.crypto.interfaces.PBEKey;

public class sprrzj
extends sprhtj
implements PBEKey {
    private final byte[] cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrzj(char[] cArray, sprgn sprgn2, byte[] byArray, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprrzj sprrzj2 = this;
        super((char[])arg0, (sprgn)arg1);
        sprrzj2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg2);
        sprrzj2.cfr_renamed_4 = n;
    }

    @Override
    public byte[] getSalt() {
        return this.cfr_renamed_3;
    }

    @Override
    public int getIterationCount() {
        return this.cfr_renamed_4;
    }
}

