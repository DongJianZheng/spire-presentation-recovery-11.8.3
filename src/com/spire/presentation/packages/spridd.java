/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprajd;
import com.spire.presentation.packages.sprcjd;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class spridd
implements sprh {
    private BigInteger cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprcjd cfr_renamed_3;
    private sprmtc cfr_renamed_4;

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }

    public spridd() {
        spridd spridd2 = this;
        spridd2.cfr_renamed_3 = new sprcjd();
    }

    private /* synthetic */ BigInteger cfr_renamed_3613(BigInteger arg0) {
        spridd spridd2 = this;
        BigInteger bigInteger = spridd2.cfr_renamed_4.cfr_renamed_2295();
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = spridd2.cfr_renamed_1.modInverse(bigInteger);
        bigInteger2 = bigInteger2.multiply(bigInteger3);
        bigInteger2 = bigInteger2.mod(bigInteger);
        return bigInteger2;
    }

    private /* synthetic */ BigInteger cfr_renamed_3614(BigInteger arg0) {
        BigInteger bigInteger = this.cfr_renamed_1;
        bigInteger = arg0.multiply(bigInteger.modPow(this.cfr_renamed_4.cfr_renamed_360(), this.cfr_renamed_4.cfr_renamed_2295()));
        bigInteger = bigInteger.mod(this.cfr_renamed_4.cfr_renamed_2295());
        return bigInteger;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        spridd spridd2;
        sprajd sprajd2;
        if (arg1 instanceof spraed) {
            sprajd2 = (sprajd)((spraed)arg1).cfr_renamed_284();
            spridd2 = this;
        } else {
            sprajd2 = (sprajd)arg1;
            spridd2 = this;
        }
        spridd2.cfr_renamed_3.cfr_renamed_1217(arg0, sprajd2.cfr_renamed_1157());
        spridd spridd3 = this;
        this.cfr_renamed_2 = arg0;
        spridd3.cfr_renamed_4 = sprajd2.cfr_renamed_1157();
        spridd3.cfr_renamed_1 = sprajd2.cfr_renamed_3342();
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        spridd spridd2;
        spridd spridd3 = this;
        BigInteger bigInteger = spridd3.cfr_renamed_3.cfr_renamed_3612(arg0, arg1, arg2);
        if (spridd3.cfr_renamed_2) {
            spridd spridd4 = this;
            spridd2 = spridd4;
            bigInteger = spridd4.cfr_renamed_3614(bigInteger);
        } else {
            spridd spridd5 = this;
            spridd2 = spridd5;
            bigInteger = spridd5.cfr_renamed_3613(bigInteger);
        }
        return spridd2.cfr_renamed_3.cfr_renamed_3610(bigInteger);
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }
}

