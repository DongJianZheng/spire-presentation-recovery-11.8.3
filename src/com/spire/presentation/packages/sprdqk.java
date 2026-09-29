/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdzk;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprvjk;
import com.spire.presentation.packages.sprwn;
import java.math.BigInteger;

public class sprdqk
implements sprwn {
    private sprkik cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private sprdzk cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprdqk sprdqk2;
        sprvjk sprvjk2;
        if (arg1 instanceof sprbgk) {
            sprvjk2 = (sprvjk)((sprbgk)arg1).cfr_renamed_284();
            sprdqk2 = this;
        } else {
            sprvjk2 = (sprvjk)arg1;
            sprdqk2 = this;
        }
        sprdqk2.cfr_renamed_3.cfr_renamed_5535(arg0, sprvjk2.cfr_renamed_1157());
        sprdqk sprdqk3 = this;
        this.cfr_renamed_4 = arg0;
        sprdqk3.cfr_renamed_1 = sprvjk2.cfr_renamed_1157();
        sprdqk3.cfr_renamed_2 = sprvjk2.cfr_renamed_3342();
    }

    private /* synthetic */ BigInteger cfr_renamed_3614(BigInteger arg0) {
        BigInteger bigInteger = this.cfr_renamed_2;
        bigInteger = arg0.multiply(bigInteger.modPow(this.cfr_renamed_1.cfr_renamed_360(), this.cfr_renamed_1.cfr_renamed_2295()));
        bigInteger = bigInteger.mod(this.cfr_renamed_1.cfr_renamed_2295());
        return bigInteger;
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }

    private /* synthetic */ BigInteger cfr_renamed_3613(BigInteger arg0) {
        BigInteger bigInteger = this.cfr_renamed_1.cfr_renamed_2295();
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = sprhdf.cfr_renamed_5234(bigInteger, this.cfr_renamed_2);
        bigInteger2 = bigInteger2.multiply(bigInteger3);
        bigInteger2 = bigInteger2.mod(bigInteger);
        return bigInteger2;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        sprdqk sprdqk2;
        sprdqk sprdqk3 = this;
        BigInteger bigInteger = sprdqk3.cfr_renamed_3.cfr_renamed_3612(arg0, arg1, arg2);
        if (sprdqk3.cfr_renamed_4) {
            sprdqk sprdqk4 = this;
            sprdqk2 = sprdqk4;
            bigInteger = sprdqk4.cfr_renamed_3614(bigInteger);
        } else {
            sprdqk sprdqk5 = this;
            sprdqk2 = sprdqk5;
            bigInteger = sprdqk5.cfr_renamed_3613(bigInteger);
        }
        return sprdqk2.cfr_renamed_3.cfr_renamed_3610(bigInteger);
    }

    public sprdqk() {
        sprdqk sprdqk2 = this;
        sprdqk2.cfr_renamed_3 = new sprdzk();
    }

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }
}

