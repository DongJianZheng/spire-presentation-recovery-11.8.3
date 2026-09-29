/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprtgf;
import java.util.HashMap;
import java.util.Map;

public abstract class sprggf
implements spren {
    private Map<sprtgf, byte[]> cfr_renamed_4;

    public abstract byte[] cfr_renamed_5328(sprjj var1, byte[] var2);

    public sprggf() {
        sprggf sprggf2 = this;
        sprggf2.cfr_renamed_4 = new HashMap<sprtgf, byte[]>();
    }

    @Override
    public byte[] cfr_renamed_3221(sprjj arg0, byte[] arg1) {
        sprtgf sprtgf2 = new sprtgf(arg0.cfr_renamed_615(), arg1, null);
        if (this.cfr_renamed_4.containsKey(sprtgf2)) {
            return this.cfr_renamed_4.get(sprtgf2);
        }
        sprggf sprggf2 = this;
        byte[] byArray = sprggf2.cfr_renamed_5328(arg0, arg1);
        sprggf2.cfr_renamed_4.put(sprtgf2, byArray);
        return byArray;
    }
}

