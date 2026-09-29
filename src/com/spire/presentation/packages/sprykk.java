/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgw;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwsia;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprykk
implements sprgw {
    private final sprfwk cfr_renamed_0;
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(0L);
    private BigInteger cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_2420(BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprykk sprykk2 = this;
        sprykk2.cfr_renamed_2 = arg0;
        sproze.cfr_renamed_492(sprykk2.cfr_renamed_4, (byte)1);
        sproze.cfr_renamed_492(sprykk2.cfr_renamed_3, (byte)0);
        int n = sprhdf.cfr_renamed_5229(bigInteger);
        byte[] byArray2 = new byte[n];
        byte[] byArray3 = sprhdf.cfr_renamed_514((BigInteger)arg1);
        System.arraycopy(byArray3, 0, byArray2, byArray2.length - byArray3.length, byArray3.length);
        byte[] byArray4 = new byte[n];
        BigInteger bigInteger3 = this.cfr_renamed_3283((byte[])arg2);
        if (bigInteger3.compareTo((BigInteger)arg0) >= 0) {
            bigInteger3 = bigInteger3.subtract((BigInteger)arg0);
        }
        byte[] byArray5 = sprhdf.cfr_renamed_514(bigInteger3);
        System.arraycopy(byArray5, 0, byArray4, byArray4.length - byArray5.length, byArray5.length);
        sprykk sprykk3 = this;
        sprykk3.cfr_renamed_0.cfr_renamed_5692(new sprtpk(this.cfr_renamed_3));
        sprykk3.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprykk sprykk4 = this;
        sprykk4.cfr_renamed_0.cfr_renamed_1221((byte)0);
        sprykk4.cfr_renamed_0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_0.cfr_renamed_1197(byArray4, 0, byArray4.length);
        sprykk sprykk5 = this;
        sprykk5.cfr_renamed_9935(sprykk5.cfr_renamed_0);
        sprykk5.cfr_renamed_0.cfr_renamed_1219(this.cfr_renamed_3, 0);
        this.cfr_renamed_0.cfr_renamed_5692(new sprtpk(this.cfr_renamed_3));
        sprykk5.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprykk sprykk6 = this;
        this.cfr_renamed_0.cfr_renamed_1219(sprykk6.cfr_renamed_4, 0);
        sprykk6.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprykk sprykk7 = this;
        sprykk7.cfr_renamed_0.cfr_renamed_1221((byte)1);
        sprykk7.cfr_renamed_0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_0.cfr_renamed_1197(byArray4, 0, byArray4.length);
        sprykk sprykk8 = this;
        sprykk sprykk9 = this;
        sprykk8.cfr_renamed_0.cfr_renamed_1219(sprykk8.cfr_renamed_3, 0);
        sprykk9.cfr_renamed_0.cfr_renamed_5692(new sprtpk(this.cfr_renamed_3));
        sprykk9.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprykk sprykk10 = this;
        sprykk10.cfr_renamed_0.cfr_renamed_1219(sprykk10.cfr_renamed_4, 0);
    }

    @Override
    public boolean cfr_renamed_3209() {
        return true;
    }

    @Override
    public void cfr_renamed_3214(BigInteger arg0, SecureRandom arg1) {
        throw new IllegalStateException(sprwsia.cfr_renamed_9("\tb#`'f/}(2(}225g6b)`2w\""));
    }

    public sprykk(sprgf arg0) {
        sprykk sprykk2 = this;
        sprykk2.cfr_renamed_0 = new sprfwk(arg0);
        sprykk2.cfr_renamed_4 = new byte[this.cfr_renamed_0.cfr_renamed_2404()];
        sprykk2.cfr_renamed_3 = new byte[sprykk2.cfr_renamed_0.cfr_renamed_2404()];
    }

    @Override
    public BigInteger cfr_renamed_3208() {
        byte[] byArray = new byte[sprhdf.cfr_renamed_5229(this.cfr_renamed_2)];
        while (true) {
            int n;
            int n2 = n = 0;
            while (n2 < byArray.length) {
                sprykk sprykk2 = this;
                sprykk2.cfr_renamed_0.cfr_renamed_1197(sprykk2.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                sprykk sprykk3 = this;
                sprykk3.cfr_renamed_0.cfr_renamed_1219(sprykk3.cfr_renamed_4, 0);
                int n3 = Math.min(byArray.length - n, this.cfr_renamed_4.length);
                System.arraycopy(this.cfr_renamed_4, 0, byArray, n, n3);
                n2 = n + n3;
            }
            BigInteger bigInteger = this.cfr_renamed_3283(byArray);
            if (bigInteger.compareTo(cfr_renamed_1) > 0 && bigInteger.compareTo(this.cfr_renamed_2) < 0) {
                return bigInteger;
            }
            sprykk sprykk4 = this;
            sprykk4.cfr_renamed_0.cfr_renamed_1197(sprykk4.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprykk sprykk5 = this;
            sprykk5.cfr_renamed_0.cfr_renamed_1221((byte)0);
            sprykk sprykk6 = this;
            sprykk5.cfr_renamed_0.cfr_renamed_1219(this.cfr_renamed_3, 0);
            sprykk6.cfr_renamed_0.cfr_renamed_5692(new sprtpk(this.cfr_renamed_3));
            sprykk6.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprykk sprykk7 = this;
            sprykk7.cfr_renamed_0.cfr_renamed_1219(sprykk7.cfr_renamed_4, 0);
        }
    }

    public void cfr_renamed_9935(sprfwk arg0) {
    }

    private /* synthetic */ BigInteger cfr_renamed_3283(byte[] arg0) {
        BigInteger bigInteger = new BigInteger(1, arg0);
        if (arg0.length * 8 > this.cfr_renamed_2.bitLength()) {
            bigInteger = bigInteger.shiftRight(arg0.length * 8 - this.cfr_renamed_2.bitLength());
        }
        return bigInteger;
    }
}

