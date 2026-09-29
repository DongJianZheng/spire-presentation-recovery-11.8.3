/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjtk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtel
implements sprwn {
    private boolean cfr_renamed_119;
    private SecureRandom cfr_renamed_91;
    private static final BigInteger cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private int cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private sprjtk cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprtel sprtel2;
        Object object;
        if (arg1 instanceof sprbgk) {
            object = (sprbgk)arg1;
            this.cfr_renamed_4 = (sprjtk)((sprbgk)object).cfr_renamed_284();
            sprtel2 = this;
            this.cfr_renamed_91 = ((sprbgk)object).cfr_renamed_1295();
        } else {
            this.cfr_renamed_4 = (sprjtk)arg1;
            sprtel2 = this;
            this.cfr_renamed_91 = sprybl.cfr_renamed_2794();
        }
        sprtel2.cfr_renamed_119 = arg0;
        object = this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155();
        this.cfr_renamed_2 = ((BigInteger)object).bitLength();
        if (arg0) {
            if (!(this.cfr_renamed_4 instanceof sprssk)) {
                throw new IllegalArgumentException(spronq.cfr_renamed_9("pwrzXzYK@yYrVPPbezGzX~A~Gh\u0015zG~\u0015iPj@rG~Q;StG;PuViLkArZu\u001b"));
            }
        } else if (!(this.cfr_renamed_4 instanceof sprwrk)) {
            throw new IllegalArgumentException(sprdyg.cfr_renamed_9("u\u001ew\u0013]\u0013\\\"B\u001bF\u0013D\u0017{\u0017I\"Q\u0000Q\u001fU\u0006U\u0000CRQ\u0000URB\u0017A\u0007Y\u0000U\u0016\u0010\u0014_\u0000\u0010\u0016U\u0011B\u000b@\u0006Y\u001d^\\"));
        }
        sprybl.cfr_renamed_9170(new sprfdl("RSA", sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4, sprlrk.cfr_renamed_9915(arg0)));
    }

    @Override
    public int cfr_renamed_1344() {
        if (this.cfr_renamed_119) {
            return (this.cfr_renamed_2 - 1) / 8;
        }
        return 2 * ((this.cfr_renamed_2 + 7) / 8);
    }

    static {
        cfr_renamed_3 = BigInteger.valueOf(0L);
        cfr_renamed_1 = BigInteger.valueOf(1L);
        cfr_renamed_0 = BigInteger.valueOf(2L);
    }

    @Override
    public int cfr_renamed_1339() {
        if (this.cfr_renamed_119) {
            return 2 * ((this.cfr_renamed_2 + 7) / 8);
        }
        return (this.cfr_renamed_2 - 1) / 8;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        BigInteger bigInteger;
        byte[] byArray2;
        int n;
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(spronq.cfr_renamed_9("^Y\\TvTw\u0015~[|\\uP;[tA;\\u\\o\\zYrF~Q"));
        }
        int n2 = n = this.cfr_renamed_119 ? (this.cfr_renamed_2 - 1 + 7) / 8 : this.cfr_renamed_1344();
        if (arg2 > n) {
            throw new sprddl(sprdyg.cfr_renamed_9("Y\u001c@\u0007DRD\u001d_R\\\u0013B\u0015URV\u001dBRu\u001ew\u0013]\u0013\\RS\u001b@\u001aU\u0000\u001ex"));
        }
        sprtel sprtel2 = this;
        BigInteger bigInteger2 = sprtel2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155();
        if (sprtel2.cfr_renamed_4 instanceof sprwrk) {
            byte[] byArray3 = new byte[arg2 / 2];
            byte[] byArray4 = new byte[arg2 / 2];
            System.arraycopy(arg0, arg1, byArray3, 0, byArray3.length);
            System.arraycopy(arg0, arg1 + byArray3.length, byArray4, 0, byArray4.length);
            BigInteger bigInteger3 = new BigInteger(1, byArray3);
            BigInteger bigInteger4 = new BigInteger(1, byArray4);
            sprwrk sprwrk2 = (sprwrk)this.cfr_renamed_4;
            BigInteger bigInteger5 = bigInteger3.modPow(bigInteger2.subtract(cfr_renamed_1).subtract(sprwrk2.cfr_renamed_1980()), bigInteger2).multiply(bigInteger4).mod(bigInteger2);
            return sprhdf.cfr_renamed_514(bigInteger5);
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray2 = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray2, 0, arg2);
        } else {
            byArray2 = arg0;
        }
        BigInteger bigInteger6 = new BigInteger(1, byArray2);
        if (bigInteger6.compareTo(bigInteger2) >= 0) {
            throw new sprddl(spronq.cfr_renamed_9("r[k@o\u0015oZt\u0015wTiR~\u0015}Zi\u0015^Y\\TvTw\u0015x\\k]~G5?"));
        }
        sprssk sprssk2 = (sprssk)this.cfr_renamed_4;
        int n3 = bigInteger2.bitLength();
        BigInteger bigInteger7 = bigInteger = sprhdf.cfr_renamed_5230(n3, this.cfr_renamed_91);
        while (bigInteger7.equals(cfr_renamed_3) || bigInteger.compareTo(bigInteger2.subtract(cfr_renamed_0)) > 0) {
            bigInteger7 = sprhdf.cfr_renamed_5230(n3, this.cfr_renamed_91);
        }
        sprtel sprtel3 = this;
        BigInteger bigInteger8 = sprtel3.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1145();
        BigInteger bigInteger9 = bigInteger8.modPow(bigInteger, bigInteger2);
        BigInteger bigInteger10 = bigInteger6.multiply(sprssk2.spr\u3181().modPow(bigInteger, bigInteger2)).mod(bigInteger2);
        byte[] byArray5 = bigInteger9.toByteArray();
        byte[] byArray6 = bigInteger10.toByteArray();
        byte[] byArray7 = new byte[sprtel3.cfr_renamed_1339()];
        if (byArray5.length > byArray7.length / 2) {
            System.arraycopy(byArray5, 1, byArray7, byArray7.length / 2 - (byArray5.length - 1), byArray5.length - 1);
            byArray = byArray6;
        } else {
            System.arraycopy(byArray5, 0, byArray7, byArray7.length / 2 - byArray5.length, byArray5.length);
            byArray = byArray6;
        }
        if (byArray.length > byArray7.length / 2) {
            System.arraycopy(byArray6, 1, byArray7, byArray7.length - (byArray6.length - 1), byArray6.length - 1);
            return byArray7;
        }
        System.arraycopy(byArray6, 0, byArray7, byArray7.length - byArray6.length, byArray6.length);
        return byArray7;
    }
}

