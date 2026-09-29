/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhea;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprnkp;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprzlk
extends sprgye {
    private BigInteger cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_3341() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_3;
    }

    public sprzlk(BigInteger arg0, SecureRandom arg1, int arg2, int arg3) {
        int n = arg2;
        super(arg1, n);
        if (n < 12) {
            throw new IllegalArgumentException(sprbhea.cfr_renamed_9("h(zmp9q(m*w%#9l\"#>n,o!"));
        }
        if (!arg0.testBit(0)) {
            throw new IllegalArgumentException(sprnkp.cfr_renamed_9("\u001c\u0011\u000e\b\u0005\u0007L\u0001\u0014\u0014\u0003\n\t\n\u0018D\u000f\u0005\u0002\n\u0003\u0010L\u0006\tD\t\u0012\t\n"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg3;
    }
}

