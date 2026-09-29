/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprold;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import java.math.BigInteger;

public class sprdgd
implements spry {
    private sprold cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_3 = (sprold)arg0;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        sprdgd sprdgd2 = this;
        sprdgd sprdgd3 = sprdgd2;
        int n = sprdgd2.cfr_renamed_3.cfr_renamed_3483();
        int n2 = n >>> 1;
        int n3 = n - n2;
        int n4 = n / 3;
        int n5 = n >>> 2;
        BigInteger bigInteger4 = sprdgd2.cfr_renamed_3.cfr_renamed_2296();
        BigInteger bigInteger5 = sprdgd2.cfr_renamed_3501(n3, bigInteger4);
        while (true) {
            if ((bigInteger3 = (bigInteger2 = sprdgd3.cfr_renamed_3501(n2, bigInteger4)).subtract(bigInteger5).abs()).bitLength() < n4) {
                sprdgd3 = this;
                continue;
            }
            bigInteger = bigInteger5.multiply(bigInteger2);
            if (bigInteger.bitLength() != n) {
                bigInteger5 = bigInteger5.max(bigInteger2);
                sprdgd3 = this;
                continue;
            }
            if (sprotb.cfr_renamed_1794(bigInteger) >= n5) break;
            sprdgd sprdgd4 = this;
            sprdgd3 = sprdgd4;
            bigInteger5 = sprdgd4.cfr_renamed_3501(n3, bigInteger4);
        }
        if (bigInteger5.compareTo(bigInteger2) < 0) {
            BigInteger bigInteger6 = bigInteger5;
            bigInteger5 = bigInteger2;
            bigInteger2 = bigInteger6;
        }
        BigInteger bigInteger7 = bigInteger5.subtract(cfr_renamed_4);
        BigInteger bigInteger8 = bigInteger2;
        BigInteger bigInteger9 = bigInteger8.subtract(cfr_renamed_4);
        BigInteger bigInteger10 = bigInteger7.multiply(bigInteger9);
        BigInteger bigInteger11 = bigInteger4.modInverse(bigInteger10);
        bigInteger3 = bigInteger11.remainder(bigInteger7);
        BigInteger bigInteger12 = bigInteger11.remainder(bigInteger9);
        BigInteger bigInteger13 = bigInteger8.modInverse(bigInteger5);
        return new sprwnd(new sprmtc(false, bigInteger, bigInteger4), new sprisc(bigInteger, bigInteger4, bigInteger11, bigInteger5, bigInteger2, bigInteger3, bigInteger12, bigInteger13));
    }

    public BigInteger cfr_renamed_3501(int arg0, BigInteger arg1) {
        BigInteger bigInteger;
        while ((bigInteger = new BigInteger(arg0, 1, this.cfr_renamed_3.cfr_renamed_1295())).mod(arg1).equals(cfr_renamed_4) || !bigInteger.isProbablePrime(this.cfr_renamed_3.cfr_renamed_3341()) || !arg1.gcd(bigInteger.subtract(cfr_renamed_4)).equals(cfr_renamed_4)) {
        }
        return bigInteger;
    }
}

