/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvo;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprxaea;
import com.spire.presentation.packages.sprztk;
import java.math.BigInteger;

public class sprryk
extends sprztk {
    private BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(2L);

    private static /* synthetic */ int cfr_renamed_9989(BigInteger arg0, BigInteger arg1) {
        int n = arg1.bitLength();
        int[] nArray = sprvih.cfr_renamed_1720(n, arg0);
        int[] nArray2 = sprvih.cfr_renamed_1720(n, arg1);
        int n2 = 0;
        int n3 = nArray2.length;
        int[] nArray3 = nArray;
        while (true) {
            int n4;
            if (nArray3[0] == 0) {
                sprvih.cfr_renamed_1736(n3, nArray, 0);
                nArray3 = nArray;
                continue;
            }
            int n5 = spruaf.cfr_renamed_5203(nArray[0]);
            if (n5 > 0) {
                sprvih.cfr_renamed_1689(n3, nArray, n5, 0);
                int n6 = n4 = nArray2[0];
                n2 ^= (n6 ^ n6 >>> 1) & n5 << 1;
            }
            if ((n4 = sprvih.cfr_renamed_8572(n3, nArray, nArray2)) == 0) break;
            if (n4 < 0) {
                n2 ^= nArray[0] & nArray2[0];
                int[] nArray4 = nArray;
                nArray = nArray2;
                nArray2 = nArray4;
            }
            int[] nArray5 = nArray;
            while (nArray5[n3 - 1] == 0) {
                --n3;
                nArray5 = nArray;
            }
            sprvih.cfr_renamed_1707(n3, nArray, nArray2, nArray);
            nArray3 = nArray;
        }
        if (sprvih.cfr_renamed_1710(n3, nArray2)) {
            return 1 - (n2 & 2);
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprryk(BigInteger bigInteger, sprwsk sprwsk2) {
        void arg1;
        sprryk sprryk2 = this;
        super(false, (sprwsk)arg1);
        sprryk2.cfr_renamed_2 = sprryk2.cfr_renamed_9990(bigInteger, (sprwsk)arg1);
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ BigInteger cfr_renamed_9990(BigInteger arg0, sprwsk arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprcvo.cfr_renamed_9("H1Gp]dT1Rp_\u007f^e\u0011sT1_d]}"));
        }
        BigInteger bigInteger = arg1.cfr_renamed_1155();
        if (arg0.compareTo(cfr_renamed_4) < 0 || arg0.compareTo(bigInteger.subtract(cfr_renamed_4)) > 0) {
            throw new IllegalArgumentException(sprxaea.cfr_renamed_9("\u001fC\u0000L\u001aD\u0012\r2eV]\u0003O\u001aD\u0015\r\u001dH\u000f"));
        }
        BigInteger bigInteger2 = arg1.cfr_renamed_1604();
        if (bigInteger2 == null) {
            return arg0;
        }
        if (bigInteger.testBit(0) && bigInteger.bitLength() - 1 == bigInteger2.bitLength() && bigInteger.shiftRight(1).equals(bigInteger2) ? 1 == sprryk.cfr_renamed_9989(arg0, bigInteger) : cfr_renamed_3.equals(arg0.modPow(bigInteger2, bigInteger))) {
            return arg0;
        }
        throw new IllegalArgumentException(sprcvo.cfr_renamed_9("h1Gp]dT1U~Tb\u0011\u007f^e\u0011pAaTpC1E~\u0011sT1X\u007f\u0011r^cCtRe\u0011vC~Da"));
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_2.hashCode() ^ super.hashCode();
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprryk)) {
            return false;
        }
        return ((sprryk)arg0).spr\u3181().equals(this.cfr_renamed_2) && super.equals(arg0);
    }
}

