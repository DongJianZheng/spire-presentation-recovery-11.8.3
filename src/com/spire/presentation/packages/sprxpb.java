/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsb;
import com.spire.presentation.packages.sprdb;
import com.spire.presentation.packages.sprlb;
import com.spire.presentation.packages.sprllb;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import java.math.BigInteger;

public class sprxpb
implements sprdb {
    public final sprlb cfr_renamed_2;
    public final sprpib cfr_renamed_3;
    public final sprllb cfr_renamed_4;

    @Override
    public BigInteger[] cfr_renamed_1933(BigInteger arg0) {
        sprxpb sprxpb2 = this;
        int n = this.cfr_renamed_4.cfr_renamed_1949();
        sprxpb sprxpb3 = this;
        BigInteger bigInteger = sprxpb3.cfr_renamed_1951(arg0, sprxpb3.cfr_renamed_4.cfr_renamed_1944(), n);
        sprxpb sprxpb4 = this;
        BigInteger bigInteger2 = sprxpb2.cfr_renamed_1951(arg0, sprxpb4.cfr_renamed_4.cfr_renamed_1946(), n);
        BigInteger[] bigIntegerArray = sprxpb4.cfr_renamed_4.cfr_renamed_1947();
        BigInteger[] bigIntegerArray2 = sprxpb2.cfr_renamed_4.cfr_renamed_1948();
        BigInteger bigInteger3 = arg0.subtract(bigInteger.multiply(bigIntegerArray[0]).add(bigInteger2.multiply(bigIntegerArray2[0])));
        BigInteger bigInteger4 = bigInteger.multiply(bigIntegerArray[1]).add(bigInteger2.multiply(bigIntegerArray2[1])).negate();
        BigInteger[] bigIntegerArray3 = new BigInteger[2];
        bigIntegerArray3[0] = bigInteger3;
        bigIntegerArray3[1] = bigInteger4;
        return bigIntegerArray3;
    }

    @Override
    public boolean spr\u3180() {
        return true;
    }

    @Override
    public sprlb cfr_renamed_1934() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1951(BigInteger arg0, BigInteger arg1, int arg2) {
        boolean bl = arg1.signum() < 0;
        BigInteger bigInteger = arg0.multiply(arg1.abs());
        boolean bl2 = bigInteger.testBit(arg2 - 1);
        bigInteger = bigInteger.shiftRight(arg2);
        if (bl2) {
            bigInteger = bigInteger.add(sprpb.cfr_renamed_0);
        }
        if (bl) {
            return bigInteger.negate();
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    public sprxpb(sprpib sprpib2, sprllb sprllb2) {
        void arg1;
        void arg0;
        sprxpb sprxpb2 = this;
        sprxpb2.cfr_renamed_3 = arg0;
        sprxpb2.cfr_renamed_4 = sprllb2;
        sprxpb sprxpb3 = this;
        sprxpb2.cfr_renamed_2 = new sprcsb(arg0.cfr_renamed_1652(arg1.cfr_renamed_1945()));
    }
}

