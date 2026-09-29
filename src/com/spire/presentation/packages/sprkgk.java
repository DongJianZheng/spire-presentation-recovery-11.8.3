/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkgk
implements sprjp {
    private SecureRandom cfr_renamed_2;
    private sprmuk cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ BigInteger cfr_renamed_9944(sprnzk arg0, BigInteger arg1, BigInteger arg2) {
        spreuh spreuh2;
        BigInteger bigInteger = arg0.cfr_renamed_284().cfr_renamed_1146();
        if (arg1.compareTo(sprck.cfr_renamed_4) < 0 || arg1.compareTo(bigInteger) >= 0) {
            return null;
        }
        if (arg2.compareTo(sprck.cfr_renamed_0) < 0 || arg2.compareTo(bigInteger) >= 0) {
            return null;
        }
        sprnzk sprnzk2 = arg0;
        spreuh spreuh3 = sprnzk2.cfr_renamed_284().cfr_renamed_1145();
        spreuh spreuh4 = sprmvh.cfr_renamed_8958(spreuh3, arg2, spreuh2 = sprnzk2.cfr_renamed_1604(), arg1).cfr_renamed_1775();
        if (spreuh4.cfr_renamed_1952()) {
            return null;
        }
        BigInteger bigInteger2 = spreuh4.cfr_renamed_1969().cfr_renamed_1779();
        return arg1.subtract(bigInteger2).mod(bigInteger);
    }

    public byte[] cfr_renamed_9945(BigInteger arg0, BigInteger arg1) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqad.cfr_renamed_9("J\bPGM\tM\u0013M\u0006H\u000eW\u0002@GB\bVGR\u0002V\u000eB\u001eM\tCHV\u0002G\bR\u0002V\u001e"));
        }
        sprkgk sprkgk2 = this;
        BigInteger bigInteger = sprkgk2.cfr_renamed_9944((sprnzk)sprkgk2.cfr_renamed_3, arg0, arg1);
        if (bigInteger != null) {
            return sprhdf.cfr_renamed_514(bigInteger);
        }
        return null;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprkgk sprkgk2 = this;
                sprkgk2.cfr_renamed_2 = sprbgk2.cfr_renamed_1295();
                sprkgk2.cfr_renamed_3 = (sprzuk)sprbgk2.cfr_renamed_284();
            } else {
                this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_3 = (sprzuk)arg1;
            }
        } else {
            this.cfr_renamed_3 = (sprnzk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9916(ShapeAlignmentEnum.cfr_renamed_9("sHxY"), this.cfr_renamed_3, arg0));
    }

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1146();
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqad.cfr_renamed_9("\tK\u0013\u0004\u000eJ\u000eP\u000eE\u000bM\u0014A\u0003\u0004\u0001K\u0015\u0004\u0011A\u0015M\u0001]\u000eJ\u0000"));
        }
        sprnzk sprnzk2 = (sprnzk)this.cfr_renamed_3;
        BigInteger bigInteger = sprnzk2.cfr_renamed_284().cfr_renamed_1146();
        int n = bigInteger.bitLength();
        BigInteger bigInteger2 = new BigInteger(1, arg0);
        if (bigInteger2.bitLength() > n) {
            throw new sprddl(ShapeAlignmentEnum.cfr_renamed_9("bX{C\u007f\u0016\u007fYd\u0016gWyQn\u0016mYy\u0016NuEd+]nO%"));
        }
        BigInteger bigInteger3 = this.cfr_renamed_9944(sprnzk2, arg1, arg2);
        return bigInteger3 != null && bigInteger3.equals(bigInteger2.mod(bigInteger));
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        Object object;
        sprqal sprqal2;
        sprsil sprsil2;
        Object object2;
        BigInteger[] bigIntegerArray;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprqad.cfr_renamed_9("\tK\u0013\u0004\u000eJ\u000eP\u000eE\u000bM\u0014A\u0003\u0004\u0001K\u0015\u0004\u0014M\u0000J\u000eJ\u0000"));
        }
        sprkgk sprkgk2 = this;
        BigInteger bigInteger = sprkgk2.cfr_renamed_1932();
        BigInteger bigInteger2 = new BigInteger(1, arg0);
        sprzuk sprzuk2 = (sprzuk)sprkgk2.cfr_renamed_3;
        if (bigInteger2.compareTo(bigInteger) >= 0) {
            throw new sprddl(ShapeAlignmentEnum.cfr_renamed_9("_eF~B+BdY+ZjDlS+PdD+sHxY\u0016`Sr"));
        }
        BigInteger bigInteger3 = null;
        BigInteger bigInteger4 = null;
        do {
            object = new sprqal();
            sprqal2 = object;
            sprqal2.cfr_renamed_5536(new sprftk(sprzuk2.cfr_renamed_284(), this.cfr_renamed_2));
        } while ((bigInteger3 = (bigIntegerArray = ((sprnzk)(object2 = (sprnzk)(sprsil2 = sprqal2.cfr_renamed_1223()).cfr_renamed_1224())).cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779()).add(bigInteger2).mod(bigInteger)).equals(sprck.cfr_renamed_0));
        object = sprzuk2.cfr_renamed_2112();
        object2 = ((sprzuk)sprsil2.cfr_renamed_1225()).cfr_renamed_2112();
        bigInteger4 = ((BigInteger)object2).subtract(bigInteger3.multiply((BigInteger)object)).mod(bigInteger);
        BigInteger[] bigIntegerArray2 = bigIntegerArray = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger4;
        return bigIntegerArray2;
    }
}

