/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprycm;

public class sprqqg {
    public static byte[] cfr_renamed_7865(int arg0, int arg1, byte[] arg2, byte[] arg3, byte[] arg4) throws sprtqg {
        sprjzk sprjzk2;
        sprivk sprivk2 = new sprivk(arg2, arg3, arg4);
        sprjzk sprjzk3 = sprjzk2 = new sprjzk(new sprohl());
        sprjzk3.cfr_renamed_5671(sprivk2);
        int n = sprycm.cfr_renamed_7909(arg1);
        int n2 = sprsgm.cfr_renamed_7910(arg0);
        byte[] byArray = new byte[n + n2 - 8];
        sprjzk3.cfr_renamed_2341(byArray, 0, byArray.length);
        return byArray;
    }
}

