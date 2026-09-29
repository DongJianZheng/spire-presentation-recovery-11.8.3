/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmpp;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvfo;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprys;
import java.io.IOException;
import java.math.BigInteger;

public class sprkmk
implements sprys {
    public static final sprkmk cfr_renamed_4 = new sprkmk();

    public BigInteger cfr_renamed_9921(BigInteger arg0, BigInteger arg1) {
        if (arg1.signum() < 0 || null != arg0 && arg1.compareTo(arg0) >= 0) {
            throw new IllegalArgumentException(sprvfo.cfr_renamed_9("\tS3G:\u00120G+\u00120T\u007f@>\\8W"));
        }
        return arg1;
    }

    @Override
    public byte[] cfr_renamed_9388(BigInteger arg0, BigInteger arg1, BigInteger arg2) throws IOException {
        sprrvm sprrvm2 = new sprrvm();
        sprkmk sprkmk2 = this;
        sprkmk2.cfr_renamed_9922(arg0, sprrvm2, arg1);
        sprkmk2.cfr_renamed_9922(arg0, sprrvm2, arg2);
        return new sprcen(sprrvm2).cfr_renamed_104("DER");
    }

    public BigInteger cfr_renamed_9923(BigInteger arg0, sprszm arg1, int arg2) {
        return this.cfr_renamed_9921(arg0, ((sprktm)arg1.cfr_renamed_85(arg2)).cfr_renamed_97());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9922(BigInteger bigInteger, sprrvm sprrvm2, BigInteger bigInteger2) {
        void arg2;
        void arg0;
        void arg1;
        arg1.cfr_renamed_5004(new sprktm(this.cfr_renamed_9921((BigInteger)arg0, (BigInteger)arg2)));
    }

    @Override
    public BigInteger[] cfr_renamed_9387(BigInteger arg0, byte[] arg1) throws IOException {
        sprszm sprszm2 = (sprszm)sprxgf.cfr_renamed_184(arg1);
        if (sprszm2.cfr_renamed_84() == 2) {
            BigInteger bigInteger;
            sprkmk sprkmk2 = this;
            BigInteger bigInteger2 = sprkmk2.cfr_renamed_9923(arg0, sprszm2, 0);
            if (sproze.cfr_renamed_92(sprkmk2.cfr_renamed_9388(arg0, bigInteger2, bigInteger = sprkmk2.cfr_renamed_9923(arg0, sprszm2, 1)), arg1)) {
                BigInteger[] bigIntegerArray = new BigInteger[2];
                bigIntegerArray[0] = bigInteger2;
                bigIntegerArray[1] = bigInteger;
                return bigIntegerArray;
            }
        }
        throw new IllegalArgumentException(sprmpp.cfr_renamed_9("\u000f\u001d.\u001a-\u000e/\u0019&\\1\u0015%\u0012#\b7\u000e'"));
    }
}

