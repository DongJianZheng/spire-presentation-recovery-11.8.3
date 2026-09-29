/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbld;
import com.spire.presentation.packages.sprijd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprloia;
import com.spire.presentation.packages.sprmid;
import com.spire.presentation.packages.sprpfd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzbp;
import com.spire.presentation.packages.sprzdd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprghd {
    private boolean cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprzdd cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private String cfr_renamed_4 = null;

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (!arg0) {
            return null;
        }
        if (arg1 != null) {
            return arg1;
        }
        return new SecureRandom();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3684(boolean bl, sprt sprt2, String string) {
        void arg1;
        void arg0;
        this.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
        this.cfr_renamed_4 = string;
    }

    public int cfr_renamed_1339() {
        sprghd sprghd2 = this;
        int n = sprghd2.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1155().bitLength();
        if (sprghd2.cfr_renamed_0) {
            return (n + 7) / 8;
        }
        return (n + 7) / 8 - 1;
    }

    public BigInteger cfr_renamed_3612(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprjkd(sprloia.cfr_renamed_9("\"i;r?'?h$''f9`.'-h9'\bu*j.ukT#h>wkd\"w#b9)"));
        }
        if (arg2 == this.cfr_renamed_1344() + 1 && this.cfr_renamed_0) {
            throw new sprjkd(sprzbp.cfr_renamed_9("Dj]qY$YkB$Ae_cH$Kk_$nvLiHv\rWEkXt\rgDtEa_*"));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (bigInteger.compareTo(this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1155()) >= 0) {
            throw new sprjkd(sprloia.cfr_renamed_9("\"i;r?'?h$''f9`.'-h9'\bu*j.ukT#h>wkd\"w#b9)"));
        }
        return bigInteger;
    }

    public BigInteger cfr_renamed_3685(sprpfd arg0) throws sprmid {
        BigInteger bigInteger = null;
        if (this.cfr_renamed_2.cfr_renamed_1352() && !this.cfr_renamed_0 && this.cfr_renamed_2 instanceof sprbld) {
            byte[] byArray;
            sprbld sprbld2 = (sprbld)this.cfr_renamed_2;
            BigInteger bigInteger2 = sprbld2.cfr_renamed_284().cfr_renamed_1155();
            sprlc sprlc2 = sprbld2.cfr_renamed_284().cfr_renamed_1153();
            byte[] byArray2 = arg0.cfr_renamed_3686().toByteArray();
            sprlc2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            byte[] byArray3 = arg0.cfr_renamed_3687().toByteArray();
            sprlc2.cfr_renamed_1197(byArray3, 0, byArray3.length);
            byte[] byArray4 = arg0.cfr_renamed_3688().toByteArray();
            sprlc2.cfr_renamed_1197(byArray4, 0, byArray4.length);
            if (this.cfr_renamed_4 != null) {
                byArray = this.cfr_renamed_4.getBytes();
                sprlc2.cfr_renamed_1197(byArray, 0, byArray.length);
            }
            sprlc sprlc3 = sprlc2;
            byArray = new byte[sprlc3.cfr_renamed_1218()];
            sprlc3.cfr_renamed_1219(byArray, 0);
            BigInteger bigInteger3 = new BigInteger(1, byArray);
            BigInteger bigInteger4 = arg0.cfr_renamed_2.modPow(sprbld2.cfr_renamed_3380().add(sprbld2.cfr_renamed_3385().multiply(bigInteger3)), bigInteger2).multiply(arg0.cfr_renamed_4.modPow(sprbld2.cfr_renamed_3384().add(sprbld2.cfr_renamed_3386().multiply(bigInteger3)), bigInteger2)).mod(bigInteger2);
            if (arg0.cfr_renamed_3.equals(bigInteger4)) {
                sprpfd sprpfd2 = arg0;
                bigInteger = sprpfd2.cfr_renamed_1.multiply(sprpfd2.cfr_renamed_2.modPow(sprbld2.cfr_renamed_3383(), bigInteger2).modInverse(bigInteger2)).mod(bigInteger2);
                return bigInteger;
            }
            throw new sprmid(sprzbp.cfr_renamed_9("WBv_}\u0001$YlLp\rgDtEa_pH|Y$Dw\rjBp\rgBv_aNp"));
        }
        return bigInteger;
    }

    public int cfr_renamed_1344() {
        sprghd sprghd2 = this;
        int n = sprghd2.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1155().bitLength();
        if (sprghd2.cfr_renamed_0) {
            return (n + 7) / 8 - 1;
        }
        return (n + 7) / 8;
    }

    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprghd sprghd2;
        SecureRandom secureRandom = null;
        if (arg1 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            this.cfr_renamed_2 = (sprzdd)spraed2.cfr_renamed_284();
            secureRandom = spraed2.cfr_renamed_1295();
            sprghd2 = this;
        } else {
            this.cfr_renamed_2 = (sprzdd)arg1;
            sprghd2 = this;
        }
        sprghd2.cfr_renamed_1 = this.cfr_renamed_3286(arg0, secureRandom);
        this.cfr_renamed_0 = arg0;
    }

    private /* synthetic */ BigInteger cfr_renamed_3533(BigInteger arg0, SecureRandom arg1) {
        return sprvpa.cfr_renamed_513(cfr_renamed_3, arg0.subtract(cfr_renamed_3), arg1);
    }

    private /* synthetic */ boolean cfr_renamed_3689(BigInteger arg0, BigInteger arg1) {
        return arg0.compareTo(arg1) < 0;
    }

    public byte[] cfr_renamed_3610(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (!this.cfr_renamed_0) {
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

    public sprpfd cfr_renamed_3690(BigInteger arg0) {
        sprpfd sprpfd2 = null;
        if (!this.cfr_renamed_2.cfr_renamed_1352() && this.cfr_renamed_0 && this.cfr_renamed_2 instanceof sprijd) {
            byte[] byArray;
            sprijd sprijd2 = (sprijd)this.cfr_renamed_2;
            BigInteger bigInteger = sprijd2.cfr_renamed_284().cfr_renamed_1155();
            BigInteger bigInteger2 = sprijd2.cfr_renamed_284().cfr_renamed_1944();
            BigInteger bigInteger3 = sprijd2.cfr_renamed_284().cfr_renamed_1946();
            BigInteger bigInteger4 = sprijd2.cfr_renamed_1153();
            if (!this.cfr_renamed_3689(arg0, bigInteger)) {
                return sprpfd2;
            }
            BigInteger bigInteger5 = this.cfr_renamed_3533(bigInteger, this.cfr_renamed_1);
            BigInteger bigInteger6 = bigInteger2.modPow(bigInteger5, bigInteger);
            BigInteger bigInteger7 = bigInteger3.modPow(bigInteger5, bigInteger);
            BigInteger bigInteger8 = bigInteger4.modPow(bigInteger5, bigInteger).multiply(arg0).mod(bigInteger);
            sprlc sprlc2 = sprijd2.cfr_renamed_284().cfr_renamed_1153();
            byte[] byArray2 = bigInteger6.toByteArray();
            sprlc2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            byte[] byArray3 = bigInteger7.toByteArray();
            sprlc2.cfr_renamed_1197(byArray3, 0, byArray3.length);
            byte[] byArray4 = bigInteger8.toByteArray();
            sprlc2.cfr_renamed_1197(byArray4, 0, byArray4.length);
            if (this.cfr_renamed_4 != null) {
                byArray = this.cfr_renamed_4.getBytes();
                sprlc2.cfr_renamed_1197(byArray, 0, byArray.length);
            }
            sprlc sprlc3 = sprlc2;
            byArray = new byte[sprlc3.cfr_renamed_1218()];
            sprlc3.cfr_renamed_1219(byArray, 0);
            BigInteger bigInteger9 = new BigInteger(1, byArray);
            BigInteger bigInteger10 = sprijd2.cfr_renamed_3369().modPow(bigInteger5, bigInteger).multiply(sprijd2.cfr_renamed_2112().modPow(bigInteger5.multiply(bigInteger9), bigInteger)).mod(bigInteger);
            sprpfd2 = new sprpfd(bigInteger6, bigInteger7, bigInteger8, bigInteger10);
        }
        return sprpfd2;
    }
}

