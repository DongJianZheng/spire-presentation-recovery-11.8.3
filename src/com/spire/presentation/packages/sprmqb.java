/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprunb;
import java.math.BigInteger;

public abstract class sprmqb
implements spreb {
    public abstract sprrlb cfr_renamed_1768(sprrlb var1, BigInteger var2);

    @Override
    public sprrlb cfr_renamed_1968(sprrlb arg0, BigInteger arg1) {
        int n = arg1.signum();
        if (n == 0 || arg0.cfr_renamed_1952()) {
            return arg0.cfr_renamed_1769().cfr_renamed_1770();
        }
        sprrlb sprrlb2 = this.cfr_renamed_1768(arg0, arg1.abs());
        sprrlb sprrlb3 = n > 0 ? sprrlb2 : sprrlb2.cfr_renamed_1773();
        return sprunb.cfr_renamed_2005(sprrlb3);
    }
}

