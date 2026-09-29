/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracda;
import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprcjd {
    private boolean cfr_renamed_3;
    private sprmtc cfr_renamed_4;

    public int cfr_renamed_1344() {
        sprcjd sprcjd2 = this;
        int n = sprcjd2.cfr_renamed_4.cfr_renamed_2295().bitLength();
        if (sprcjd2.cfr_renamed_3) {
            return (n + 7) / 8 - 1;
        }
        return (n + 7) / 8;
    }

    public byte[] cfr_renamed_3610(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (this.cfr_renamed_3) {
            if (byArray[0] == 0 && byArray.length > this.cfr_renamed_1339()) {
                byte[] byArray2 = new byte[byArray.length - 1];
                System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
                return byArray2;
            }
            if (byArray.length < this.cfr_renamed_1339()) {
                byte[] byArray3 = new byte[this.cfr_renamed_1339()];
                System.arraycopy(byArray, 0, byArray3, byArray3.length - byArray.length, byArray.length);
                return byArray3;
            }
        } else if (byArray[0] == 0) {
            byte[] byArray4 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray4, 0, byArray4.length);
            return byArray4;
        }
        return byArray;
    }

    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprcjd sprcjd2;
        if (arg1 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            this.cfr_renamed_4 = (sprmtc)spraed2.cfr_renamed_284();
            sprcjd2 = this;
        } else {
            this.cfr_renamed_4 = (sprmtc)arg1;
            sprcjd2 = this;
        }
        sprcjd2.cfr_renamed_3 = arg0;
    }

    public int cfr_renamed_1339() {
        sprcjd sprcjd2 = this;
        int n = sprcjd2.cfr_renamed_4.cfr_renamed_2295().bitLength();
        if (sprcjd2.cfr_renamed_3) {
            return (n + 7) / 8;
        }
        return (n + 7) / 8 - 1;
    }

    public BigInteger cfr_renamed_3612(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprjkd(sprpon.cfr_renamed_9("cgz|~)~fe)fhxno)lfx)XZK)i`zao{$"));
        }
        if (arg2 == this.cfr_renamed_1344() + 1 && !this.cfr_renamed_3) {
            throw new sprjkd(spracda.cfr_renamed_9("'\u0007>\u001c:I:\u0006!I\"\b<\u000e+I(\u0006<I\u001c:\u000fI-\u0000>\u0001+\u001b`"));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (bigInteger.compareTo(this.cfr_renamed_4.cfr_renamed_2295()) >= 0) {
            throw new sprjkd(sprpon.cfr_renamed_9("cgz|~)~fe)fhxno)lfx)XZK)i`zao{$"));
        }
        return bigInteger;
    }

    public BigInteger cfr_renamed_3611(BigInteger arg0) {
        if (this.cfr_renamed_4 instanceof sprisc) {
            sprisc sprisc2 = (sprisc)this.cfr_renamed_4;
            BigInteger bigInteger = sprisc2.cfr_renamed_1155();
            BigInteger bigInteger2 = sprisc2.cfr_renamed_1604();
            BigInteger bigInteger3 = sprisc2.cfr_renamed_2305();
            BigInteger bigInteger4 = sprisc2.cfr_renamed_2306();
            BigInteger bigInteger5 = sprisc2.cfr_renamed_1148();
            BigInteger bigInteger6 = arg0;
            BigInteger bigInteger7 = bigInteger6.remainder(bigInteger).modPow(bigInteger3, bigInteger);
            BigInteger bigInteger8 = bigInteger6.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
            BigInteger bigInteger9 = bigInteger7.subtract(bigInteger8);
            bigInteger9 = bigInteger9.multiply(bigInteger5);
            bigInteger9 = bigInteger9.mod(bigInteger);
            BigInteger bigInteger10 = bigInteger9.multiply(bigInteger2);
            bigInteger10 = bigInteger10.add(bigInteger8);
            return bigInteger10;
        }
        return arg0.modPow(this.cfr_renamed_4.cfr_renamed_360(), this.cfr_renamed_4.cfr_renamed_2295());
    }
}

