/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgw;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhsk;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprxlk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprytk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprzpk
implements sprjp {
    private SecureRandom cfr_renamed_2;
    private sprhsk cfr_renamed_3;
    private final sprgw cfr_renamed_4;

    private /* synthetic */ BigInteger cfr_renamed_9948(BigInteger arg0, SecureRandom arg1) {
        return sprhdf.cfr_renamed_5230(7, sprybl.cfr_renamed_5688(arg1)).add(BigInteger.valueOf(128L)).multiply(arg0);
    }

    public sprzpk(sprgw sprgw2) {
        this.cfr_renamed_4 = sprgw2;
    }

    public sprzpk() {
        sprzpk sprzpk2 = this;
        sprzpk2.cfr_renamed_4 = new sprxlk();
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        sprzpk sprzpk2;
        sprzpk sprzpk3 = this;
        sprmqk sprmqk2 = sprzpk3.cfr_renamed_3.cfr_renamed_284();
        BigInteger bigInteger = sprmqk2.cfr_renamed_1604();
        BigInteger bigInteger2 = sprzpk3.cfr_renamed_3285(bigInteger, arg0);
        BigInteger bigInteger3 = ((sprusk)sprzpk3.cfr_renamed_3).cfr_renamed_1980();
        if (this.cfr_renamed_4.cfr_renamed_3209()) {
            sprzpk sprzpk4 = this;
            sprzpk2 = sprzpk4;
            sprzpk4.cfr_renamed_4.cfr_renamed_2420(bigInteger, bigInteger3, arg0);
        } else {
            sprzpk sprzpk5 = this;
            sprzpk2 = sprzpk5;
            sprzpk5.cfr_renamed_4.cfr_renamed_3214(bigInteger, this.cfr_renamed_2);
        }
        BigInteger bigInteger4 = sprzpk2.cfr_renamed_4.cfr_renamed_3208();
        sprzpk sprzpk6 = this;
        BigInteger bigInteger5 = sprmqk2.cfr_renamed_1145().modPow(bigInteger4.add(sprzpk6.cfr_renamed_9948(bigInteger, sprzpk6.cfr_renamed_2)), sprmqk2.cfr_renamed_1155()).mod(bigInteger);
        bigInteger4 = sprhdf.cfr_renamed_5234(bigInteger, bigInteger4).multiply(bigInteger2.add(bigInteger3.multiply(bigInteger5)));
        BigInteger bigInteger6 = bigInteger4.mod(bigInteger);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger5;
        bigIntegerArray[1] = bigInteger6;
        return bigIntegerArray;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        SecureRandom secureRandom;
        boolean bl;
        SecureRandom secureRandom2 = null;
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                this.cfr_renamed_3 = (sprusk)sprbgk2.cfr_renamed_284();
                secureRandom2 = sprbgk2.cfr_renamed_1295();
            } else {
                this.cfr_renamed_3 = (sprusk)arg1;
            }
        } else {
            this.cfr_renamed_3 = (sprytk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9918("DSA", this.cfr_renamed_3, arg0));
        if (arg0 && !this.cfr_renamed_4.cfr_renamed_3209()) {
            bl = true;
            secureRandom = secureRandom2;
        } else {
            bl = false;
            secureRandom = secureRandom2;
        }
        this.cfr_renamed_2 = this.cfr_renamed_3286(bl, secureRandom);
    }

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1604();
    }

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (arg0) {
            return sprybl.cfr_renamed_5688(arg1);
        }
        return null;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprzpk sprzpk2 = this;
        sprmqk sprmqk2 = sprzpk2.cfr_renamed_3.cfr_renamed_284();
        BigInteger bigInteger = sprmqk2.cfr_renamed_1604();
        BigInteger bigInteger2 = sprzpk2.cfr_renamed_3285(bigInteger, arg0);
        BigInteger bigInteger3 = BigInteger.valueOf(0L);
        if (bigInteger3.compareTo(arg1) >= 0 || bigInteger.compareTo(arg1) <= 0) {
            return false;
        }
        if (bigInteger3.compareTo(arg2) >= 0 || bigInteger.compareTo(arg2) <= 0) {
            return false;
        }
        BigInteger bigInteger4 = sprhdf.cfr_renamed_5232(bigInteger, arg2);
        BigInteger bigInteger5 = bigInteger2.multiply(bigInteger4).mod(bigInteger);
        BigInteger bigInteger6 = arg1.multiply(bigInteger4).mod(bigInteger);
        sprmqk sprmqk3 = sprmqk2;
        BigInteger bigInteger7 = sprmqk3.cfr_renamed_1155();
        bigInteger5 = sprmqk3.cfr_renamed_1145().modPow(bigInteger5, bigInteger7);
        bigInteger6 = ((sprytk)this.cfr_renamed_3).spr\u3181().modPow(bigInteger6, bigInteger7);
        return bigInteger5.multiply(bigInteger6).mod(bigInteger7).mod(bigInteger).equals(arg1);
    }

    private /* synthetic */ BigInteger cfr_renamed_3285(BigInteger arg0, byte[] arg1) {
        if (arg0.bitLength() >= arg1.length * 8) {
            return new BigInteger(1, arg1);
        }
        byte[] byArray = new byte[arg0.bitLength() / 8];
        System.arraycopy(arg1, 0, byArray, 0, byArray.length);
        return new BigInteger(1, byArray);
    }
}

