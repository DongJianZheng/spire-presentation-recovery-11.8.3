/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruck;
import javax.crypto.interfaces.PBEKey;

public class sprcwj
extends spruck
implements PBEKey {
    private final byte[] cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcwj(char[] cArray, boolean bl, byte[] byArray, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprcwj sprcwj2 = this;
        super((char[])arg0, (boolean)arg1);
        sprcwj2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg2);
        sprcwj2.cfr_renamed_4 = n;
    }

    @Override
    public int getIterationCount() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcwj(char[] cArray, byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprcwj sprcwj2 = this;
        super((char[])arg0);
        sprcwj2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg1);
        sprcwj2.cfr_renamed_4 = n;
    }

    @Override
    public byte[] getSalt() {
        return this.cfr_renamed_3;
    }
}

