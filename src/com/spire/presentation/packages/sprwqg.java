/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;

public abstract class sprwqg
extends sprgwg {
    public sprwqg(char[] arg0, sprth arg1) {
        super(arg0, arg1);
    }

    @Override
    public byte[] cfr_renamed_7762(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) throws sprtqg {
        return this.cfr_renamed_7900(arg0, arg1, arg2, null, arg3, arg4, arg5);
    }

    public abstract byte[] cfr_renamed_7900(int var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5, int var6, int var7) throws sprtqg;
}

