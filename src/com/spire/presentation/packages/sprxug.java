/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyg;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvh;

public abstract class sprxug
implements sprvh {
    private sprth cfr_renamed_3;
    private char[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxug(char[] cArray, sprth sprth2) {
        void arg0;
        sprxug sprxug2 = this;
        sprxug2.cfr_renamed_4 = arg0;
        sprxug2.cfr_renamed_3 = sprth2;
    }

    public abstract byte[] cfr_renamed_7820(int var1, byte[] var2, byte[] var3) throws sprtqg;

    public byte[] cfr_renamed_7761(int arg0, sprpik arg1) throws sprtqg {
        return sprbyg.cfr_renamed_7888(this.cfr_renamed_3, arg0, arg1, this.cfr_renamed_4);
    }

    public abstract byte[] cfr_renamed_7824(sprjem var1, byte[] var2) throws sprtqg;
}

