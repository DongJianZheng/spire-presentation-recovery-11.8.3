/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprucda;
import com.spire.presentation.packages.sprvf;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryxc
implements sprvf {
    private final byte[] cfr_renamed_0;
    private final sprced cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(0L);
    private final byte[] cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public spryxc(sprlc arg0) {
        spryxc spryxc2 = this;
        spryxc2.cfr_renamed_1 = new sprced(arg0);
        spryxc2.cfr_renamed_0 = new byte[this.cfr_renamed_1.cfr_renamed_2404()];
        spryxc2.cfr_renamed_3 = new byte[spryxc2.cfr_renamed_1.cfr_renamed_2404()];
    }

    @Override
    public BigInteger cfr_renamed_3208() {
        byte[] byArray = new byte[(this.cfr_renamed_4.bitLength() + 7) / 8];
        while (true) {
            int n;
            int n2 = n = 0;
            while (n2 < byArray.length) {
                spryxc spryxc2 = this;
                spryxc2.cfr_renamed_1.cfr_renamed_1197(spryxc2.cfr_renamed_0, 0, this.cfr_renamed_0.length);
                spryxc spryxc3 = this;
                spryxc3.cfr_renamed_1.cfr_renamed_1219(spryxc3.cfr_renamed_0, 0);
                int n3 = Math.min(byArray.length - n, this.cfr_renamed_0.length);
                System.arraycopy(this.cfr_renamed_0, 0, byArray, n, n3);
                n2 = n + n3;
            }
            BigInteger bigInteger = this.cfr_renamed_3283(byArray);
            if (bigInteger.compareTo(cfr_renamed_2) > 0 && bigInteger.compareTo(this.cfr_renamed_4) < 0) {
                return bigInteger;
            }
            spryxc spryxc4 = this;
            spryxc4.cfr_renamed_1.cfr_renamed_1197(spryxc4.cfr_renamed_0, 0, this.cfr_renamed_0.length);
            spryxc spryxc5 = this;
            spryxc5.cfr_renamed_1.cfr_renamed_1221((byte)0);
            spryxc spryxc6 = this;
            spryxc5.cfr_renamed_1.cfr_renamed_1219(this.cfr_renamed_3, 0);
            spryxc6.cfr_renamed_1.cfr_renamed_1524(new sprnld(this.cfr_renamed_3));
            spryxc6.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
            spryxc spryxc7 = this;
            spryxc7.cfr_renamed_1.cfr_renamed_1219(spryxc7.cfr_renamed_0, 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_2420(BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        spryxc spryxc2 = this;
        spryxc2.cfr_renamed_4 = arg0;
        sprzra.cfr_renamed_492(spryxc2.cfr_renamed_0, (byte)1);
        sprzra.cfr_renamed_492(spryxc2.cfr_renamed_3, (byte)0);
        byte[] byArray2 = new byte[(bigInteger.bitLength() + 7) / 8];
        byte[] byArray3 = sprvpa.cfr_renamed_514((BigInteger)arg1);
        System.arraycopy(byArray3, 0, byArray2, byArray2.length - byArray3.length, byArray3.length);
        byte[] byArray4 = new byte[(arg0.bitLength() + 7) / 8];
        BigInteger bigInteger3 = this.cfr_renamed_3283((byte[])arg2);
        if (bigInteger3.compareTo((BigInteger)arg0) > 0) {
            bigInteger3 = bigInteger3.subtract((BigInteger)arg0);
        }
        byte[] byArray5 = sprvpa.cfr_renamed_514(bigInteger3);
        System.arraycopy(byArray5, 0, byArray4, byArray4.length - byArray5.length, byArray5.length);
        spryxc spryxc3 = this;
        spryxc3.cfr_renamed_1.cfr_renamed_1524(new sprnld(this.cfr_renamed_3));
        spryxc3.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spryxc spryxc4 = this;
        spryxc4.cfr_renamed_1.cfr_renamed_1221((byte)0);
        spryxc4.cfr_renamed_1.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_1.cfr_renamed_1197(byArray4, 0, byArray4.length);
        spryxc spryxc5 = this;
        spryxc spryxc6 = this;
        spryxc5.cfr_renamed_1.cfr_renamed_1219(spryxc5.cfr_renamed_3, 0);
        spryxc6.cfr_renamed_1.cfr_renamed_1524(new sprnld(this.cfr_renamed_3));
        spryxc6.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spryxc spryxc7 = this;
        this.cfr_renamed_1.cfr_renamed_1219(spryxc7.cfr_renamed_0, 0);
        spryxc7.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spryxc spryxc8 = this;
        spryxc8.cfr_renamed_1.cfr_renamed_1221((byte)1);
        spryxc8.cfr_renamed_1.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_1.cfr_renamed_1197(byArray4, 0, byArray4.length);
        spryxc spryxc9 = this;
        spryxc spryxc10 = this;
        spryxc9.cfr_renamed_1.cfr_renamed_1219(spryxc9.cfr_renamed_3, 0);
        spryxc10.cfr_renamed_1.cfr_renamed_1524(new sprnld(this.cfr_renamed_3));
        spryxc10.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spryxc spryxc11 = this;
        spryxc11.cfr_renamed_1.cfr_renamed_1219(spryxc11.cfr_renamed_0, 0);
    }

    @Override
    public void cfr_renamed_3214(BigInteger arg0, SecureRandom arg1) {
        throw new IllegalStateException(sprucda.cfr_renamed_9("Tk~izortu;uto;hnkktio~\u007f"));
    }

    private /* synthetic */ BigInteger cfr_renamed_3283(byte[] arg0) {
        BigInteger bigInteger = new BigInteger(1, arg0);
        if (arg0.length * 8 > this.cfr_renamed_4.bitLength()) {
            bigInteger = bigInteger.shiftRight(arg0.length * 8 - this.cfr_renamed_4.bitLength());
        }
        return bigInteger;
    }

    @Override
    public boolean cfr_renamed_3209() {
        return true;
    }
}

