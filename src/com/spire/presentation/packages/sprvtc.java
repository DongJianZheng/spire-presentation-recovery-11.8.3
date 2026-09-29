/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprmed;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprvf;
import com.spire.presentation.packages.spryzc;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprvtc
implements spruj {
    private final sprvf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprmed cfr_renamed_4;

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (!arg0) {
            return null;
        }
        if (arg1 != null) {
            return arg1;
        }
        return new SecureRandom();
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger[] bigIntegerArray;
        sprvtc sprvtc2;
        sprvtc sprvtc3 = this;
        sprcld sprcld2 = sprvtc3.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprvtc3.cfr_renamed_3285(sprcld2.cfr_renamed_1604(), arg0);
        if (sprvtc3.cfr_renamed_2.cfr_renamed_3209()) {
            this.cfr_renamed_2.cfr_renamed_2420(sprcld2.cfr_renamed_1604(), ((sprlnd)this.cfr_renamed_4).cfr_renamed_1980(), arg0);
            sprvtc2 = this;
        } else {
            sprvtc sprvtc4 = this;
            sprvtc2 = sprvtc4;
            sprvtc4.cfr_renamed_2.cfr_renamed_3214(sprcld2.cfr_renamed_1604(), this.cfr_renamed_3);
        }
        BigInteger bigInteger2 = sprvtc2.cfr_renamed_2.cfr_renamed_3208();
        BigInteger bigInteger3 = sprcld2.cfr_renamed_1145().modPow(bigInteger2, sprcld2.cfr_renamed_1155()).mod(sprcld2.cfr_renamed_1604());
        bigInteger2 = bigInteger2.modInverse(sprcld2.cfr_renamed_1604()).multiply(bigInteger.add(((sprlnd)this.cfr_renamed_4).cfr_renamed_1980().multiply(bigInteger3)));
        BigInteger bigInteger4 = bigInteger2.mod(sprcld2.cfr_renamed_1604());
        BigInteger[] bigIntegerArray2 = bigIntegerArray = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger4;
        return bigIntegerArray2;
    }

    public sprvtc(sprvf sprvf2) {
        this.cfr_renamed_2 = sprvf2;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        SecureRandom secureRandom;
        boolean bl;
        sprvtc sprvtc2;
        SecureRandom secureRandom2 = null;
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                this.cfr_renamed_4 = (sprlnd)spraed2.cfr_renamed_284();
                secureRandom2 = spraed2.cfr_renamed_1295();
                sprvtc2 = this;
            } else {
                this.cfr_renamed_4 = (sprlnd)arg1;
                sprvtc2 = this;
            }
        } else {
            this.cfr_renamed_4 = (spruld)arg1;
            sprvtc2 = this;
        }
        if (arg0 && !this.cfr_renamed_2.cfr_renamed_3209()) {
            bl = true;
            secureRandom = secureRandom2;
        } else {
            bl = false;
            secureRandom = secureRandom2;
        }
        sprvtc2.cfr_renamed_3 = this.cfr_renamed_3286(bl, secureRandom);
    }

    private /* synthetic */ BigInteger cfr_renamed_3285(BigInteger arg0, byte[] arg1) {
        if (arg0.bitLength() >= arg1.length * 8) {
            return new BigInteger(1, arg1);
        }
        byte[] byArray = new byte[arg0.bitLength() / 8];
        System.arraycopy(arg1, 0, byArray, 0, byArray.length);
        return new BigInteger(1, byArray);
    }

    public sprvtc() {
        sprvtc sprvtc2 = this;
        sprvtc2.cfr_renamed_2 = new spryzc();
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprvtc sprvtc2 = this;
        sprcld sprcld2 = sprvtc2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprvtc2.cfr_renamed_3285(sprcld2.cfr_renamed_1604(), arg0);
        BigInteger bigInteger2 = BigInteger.valueOf(0L);
        if (bigInteger2.compareTo(arg1) >= 0 || sprcld2.cfr_renamed_1604().compareTo(arg1) <= 0) {
            return false;
        }
        if (bigInteger2.compareTo(arg2) >= 0 || sprcld2.cfr_renamed_1604().compareTo(arg2) <= 0) {
            return false;
        }
        BigInteger bigInteger3 = arg2.modInverse(sprcld2.cfr_renamed_1604());
        BigInteger bigInteger4 = bigInteger.multiply(bigInteger3).mod(sprcld2.cfr_renamed_1604());
        BigInteger bigInteger5 = arg1.multiply(bigInteger3).mod(sprcld2.cfr_renamed_1604());
        bigInteger4 = sprcld2.cfr_renamed_1145().modPow(bigInteger4, sprcld2.cfr_renamed_1155());
        bigInteger5 = ((spruld)this.cfr_renamed_4).spr\u3181().modPow(bigInteger5, sprcld2.cfr_renamed_1155());
        return bigInteger4.multiply(bigInteger5).mod(sprcld2.cfr_renamed_1155()).mod(sprcld2.cfr_renamed_1604()).equals(arg1);
    }
}

