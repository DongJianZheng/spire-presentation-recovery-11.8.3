/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.spruin;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprold
extends sprccb {
    private int cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public int cfr_renamed_3341() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_4;
    }

    public sprold(BigInteger arg0, SecureRandom arg1, int arg2, int arg3) {
        int n = arg2;
        super(arg1, n);
        if (n < 12) {
            throw new IllegalArgumentException(spruin.cfr_renamed_9("s\u0000aEk\u0011j\u0000v\u0002l\r8\u0011w\n8\u0016u\u0004t\t"));
        }
        if (!arg0.testBit(0)) {
            throw new IllegalArgumentException(sprilaa.cfr_renamed_9("\u000b\u0007\u0019\u001e\u0012\u0011[\u0017\u0003\u0002\u0014\u001c\u001e\u001c\u000fR\u0018\u0013\u0015\u001c\u0014\u0006[\u0010\u001eR\u001e\u0004\u001e\u001c"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg3;
    }
}

