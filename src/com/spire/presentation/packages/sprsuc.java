/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfld;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprqjba;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprwfp;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprsuc
implements spruj {
    private boolean cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprfld cfr_renamed_4;

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprrlb sprrlb2;
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprwfp.cfr_renamed_9("\u000eF\u0014\t\tG\t]\tH\f@\u0013L\u0004\t\u0006F\u0012\t\u0016L\u0012@\u0006P\tG\u0007"));
        }
        sprwmd sprwmd2 = (sprwmd)this.cfr_renamed_4;
        BigInteger bigInteger = sprwmd2.cfr_renamed_284().cfr_renamed_1146();
        int n = bigInteger.bitLength();
        BigInteger bigInteger2 = new BigInteger(1, arg0);
        if (bigInteger2.bitLength() > n) {
            throw new sprjkd(sprqjba.cfr_renamed_9("L=U&QsQ<JsI2W4@sC<Ws`\u0010k\u0001\u00058@*\u000b"));
        }
        if (arg1.compareTo(sprpb.cfr_renamed_0) < 0 || arg1.compareTo(bigInteger) >= 0) {
            return false;
        }
        if (arg2.compareTo(sprpb.cfr_renamed_1) < 0 || arg2.compareTo(bigInteger) >= 0) {
            return false;
        }
        sprwmd sprwmd3 = sprwmd2;
        sprrlb sprrlb3 = sprwmd3.cfr_renamed_284().cfr_renamed_1145();
        sprrlb sprrlb4 = sprunb.cfr_renamed_2006(sprrlb3, arg2, sprrlb2 = sprwmd3.cfr_renamed_1604(), arg1).cfr_renamed_1775();
        if (sprrlb4.cfr_renamed_1952()) {
            return false;
        }
        BigInteger bigInteger3 = sprrlb4.cfr_renamed_1969().cfr_renamed_1779();
        return arg1.subtract(bigInteger3).mod(bigInteger).equals(bigInteger2);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprsuc sprsuc2 = this;
                sprsuc2.cfr_renamed_3 = spraed2.cfr_renamed_1295();
                sprsuc2.cfr_renamed_4 = (spreed)spraed2.cfr_renamed_284();
                return;
            }
            this.cfr_renamed_3 = new SecureRandom();
            this.cfr_renamed_4 = (spreed)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprwmd)arg1;
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        Object object;
        sprmdd sprmdd2;
        sprwnd sprwnd2;
        Object object2;
        BigInteger[] bigIntegerArray;
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprwfp.cfr_renamed_9("\u000eF\u0014\t\tG\t]\tH\f@\u0013L\u0004\t\u0006F\u0012\t\u0013@\u0007G\tG\u0007"));
        }
        BigInteger bigInteger = ((spreed)this.cfr_renamed_4).cfr_renamed_284().cfr_renamed_1146();
        int n = bigInteger.bitLength();
        BigInteger bigInteger2 = new BigInteger(1, arg0);
        int n2 = bigInteger2.bitLength();
        spreed spreed2 = (spreed)this.cfr_renamed_4;
        if (n2 > n) {
            throw new sprjkd(sprqjba.cfr_renamed_9("L=U&QsQ<JsI2W4@sC<Ws`\u0010k\u0001\u00058@*\u000b"));
        }
        BigInteger bigInteger3 = null;
        BigInteger bigInteger4 = null;
        do {
            object = new sprmdd();
            sprmdd2 = object;
            sprmdd2.cfr_renamed_1222(new sprdld(spreed2.cfr_renamed_284(), this.cfr_renamed_3));
        } while ((bigInteger3 = (bigIntegerArray = ((sprwmd)(object2 = (sprwmd)(sprwnd2 = sprmdd2.cfr_renamed_1223()).cfr_renamed_1224())).cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779()).add(bigInteger2).mod(bigInteger)).equals(sprpb.cfr_renamed_1));
        object = spreed2.cfr_renamed_2112();
        object2 = ((spreed)sprwnd2.cfr_renamed_1225()).cfr_renamed_2112();
        bigInteger4 = ((BigInteger)object2).subtract(bigInteger3.multiply((BigInteger)object)).mod(bigInteger);
        BigInteger[] bigIntegerArray2 = bigIntegerArray = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger4;
        return bigIntegerArray2;
    }
}

