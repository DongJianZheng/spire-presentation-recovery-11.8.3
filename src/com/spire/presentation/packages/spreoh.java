/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprcph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprqvh;
import com.spire.presentation.packages.sprzh;
import java.math.BigInteger;

public class spreoh
extends sprcph {
    public final sprzh cfr_renamed_3;
    public final sprgxh cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreoh(sprgxh sprgxh2, sprzh sprzh2) {
        void arg1;
        void arg0;
        if (sprgxh2 == null || arg0.cfr_renamed_1932() == null) {
            throw new IllegalArgumentException(sprbgp.cfr_renamed_9("\f)'(b/7>4)b;+8*l)\"-;,l%>-92l->&)0"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    @Override
    public spreuh cfr_renamed_8631(spreuh arg0, BigInteger arg1) {
        if (!this.cfr_renamed_4.cfr_renamed_8896(arg0.cfr_renamed_1769())) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger = arg0.cfr_renamed_1769().cfr_renamed_1932();
        spreoh spreoh2 = this;
        BigInteger[] bigIntegerArray = spreoh2.cfr_renamed_3.cfr_renamed_1933(arg1.mod(bigInteger));
        BigInteger bigInteger2 = bigIntegerArray[0];
        BigInteger bigInteger3 = bigIntegerArray[1];
        if (spreoh2.cfr_renamed_3.spr\u3180()) {
            return sprmvh.cfr_renamed_8897(this.cfr_renamed_3, arg0, bigInteger2, bigInteger3);
        }
        spreuh spreuh2 = sprqvh.cfr_renamed_8898(this.cfr_renamed_3, arg0);
        return sprmvh.cfr_renamed_8899(arg0, bigInteger2, spreuh2, bigInteger3);
    }
}

