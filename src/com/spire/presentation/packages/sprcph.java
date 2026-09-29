/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprmvh;
import java.math.BigInteger;

public abstract class sprcph
implements sprfe {
    public abstract spreuh cfr_renamed_8631(spreuh var1, BigInteger var2);

    @Override
    public spreuh cfr_renamed_8926(spreuh arg0, BigInteger arg1) {
        int n = arg1.signum();
        if (n == 0 || arg0.cfr_renamed_1952()) {
            return arg0.cfr_renamed_1769().cfr_renamed_1770();
        }
        spreuh spreuh2 = this.cfr_renamed_8631(arg0, arg1.abs());
        spreuh spreuh3 = n > 0 ? spreuh2 : spreuh2.cfr_renamed_1773();
        return this.cfr_renamed_9003(spreuh3);
    }

    public spreuh cfr_renamed_9003(spreuh arg0) {
        return sprmvh.cfr_renamed_8953(arg0);
    }
}

