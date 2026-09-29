/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyg;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;

public abstract class sprgwg {
    private char[] cfr_renamed_3;
    private sprth cfr_renamed_4;

    public abstract byte[] cfr_renamed_7762(int var1, byte[] var2, byte[] var3, byte[] var4, int var5, int var6) throws sprtqg;

    /*
     * WARNING - void declaration
     */
    public sprgwg(char[] cArray, sprth sprth2) {
        void arg0;
        sprgwg sprgwg2 = this;
        sprgwg2.cfr_renamed_3 = arg0;
        sprgwg2.cfr_renamed_4 = sprth2;
    }

    public sprsm cfr_renamed_7763(int arg0) throws sprtqg {
        return this.cfr_renamed_4.cfr_renamed_576(arg0);
    }

    public byte[] cfr_renamed_7761(int arg0, sprpik arg1) throws sprtqg {
        return sprbyg.cfr_renamed_7888(this.cfr_renamed_4, arg0, arg1, this.cfr_renamed_3);
    }
}

