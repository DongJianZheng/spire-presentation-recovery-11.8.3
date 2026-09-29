/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprawba;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjid;
import com.spire.presentation.packages.sprkfd;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprncs;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprnkd {
    private SecureRandom cfr_renamed_1;
    private sprrkd cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private sprzmd cfr_renamed_4;

    public BigInteger cfr_renamed_3949() {
        sprkfd sprkfd2;
        sprkfd sprkfd3 = sprkfd2 = new sprkfd();
        sprnkd sprnkd2 = this;
        sprkfd3.cfr_renamed_1222(new sprjid(sprnkd2.cfr_renamed_1, sprnkd2.cfr_renamed_4));
        sprwnd sprwnd2 = sprkfd3.cfr_renamed_1223();
        this.cfr_renamed_3 = ((sprrkd)sprwnd2.cfr_renamed_1225()).cfr_renamed_1980();
        return ((sprmgd)sprwnd2.cfr_renamed_1224()).spr\u3181();
    }

    public BigInteger cfr_renamed_3950(sprmgd arg0, BigInteger arg1) {
        if (!arg0.cfr_renamed_284().equals(this.cfr_renamed_4)) {
            throw new IllegalArgumentException(sprncs.cfr_renamed_9("\u0013\u00101\u001f>\u001cz12\u0015;\u00146\u0017w\t\"\u001b;\u00104Y<\u001c.Y?\u0018$Y \u000b8\u00170Y'\u0018%\u0018:\u001c#\u001c%\ny"));
        }
        BigInteger bigInteger = this.cfr_renamed_4.cfr_renamed_1155();
        return arg1.modPow(this.cfr_renamed_2.cfr_renamed_1980(), bigInteger).multiply(arg0.spr\u3181().modPow(this.cfr_renamed_3, bigInteger)).mod(bigInteger);
    }

    public void cfr_renamed_1524(sprt arg0) {
        sprhgb sprhgb2;
        sprhgb sprhgb3;
        if (arg0 instanceof spraed) {
            spraed spraed2;
            spraed spraed3 = spraed2 = (spraed)arg0;
            this.cfr_renamed_1 = spraed3.cfr_renamed_1295();
            sprhgb2 = sprhgb3 = (sprhgb)spraed3.cfr_renamed_284();
        } else {
            this.cfr_renamed_1 = new SecureRandom();
            sprhgb2 = sprhgb3 = (sprhgb)arg0;
        }
        if (!(sprhgb2 instanceof sprrkd)) {
            throw new IllegalArgumentException(sprawba.cfr_renamed_9("%9$\u001f\u0006\u0018\u000f\u0014A\u0014\u0019\u0001\u0004\u0012\u0015\u0002A5)!\u0013\u0018\u0017\u0010\u0015\u0014*\u0014\u0018!\u0000\u0003\u0000\u001c\u0004\u0005\u0004\u0003\u0012"));
        }
        this.cfr_renamed_2 = (sprrkd)sprhgb3;
        this.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_284();
    }
}

