/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.drawing.GradientStopData;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;

public class sprdzk {
    private sprkik cfr_renamed_3;
    private boolean cfr_renamed_4;

    public int cfr_renamed_1339() {
        sprdzk sprdzk2 = this;
        int n = sprdzk2.cfr_renamed_3.cfr_renamed_2295().bitLength();
        if (sprdzk2.cfr_renamed_4) {
            return (n + 7) / 8;
        }
        return (n + 7) / 8 - 1;
    }

    public BigInteger cfr_renamed_3611(BigInteger arg0) {
        if (this.cfr_renamed_3 instanceof sprkhk) {
            sprkhk sprkhk2 = (sprkhk)this.cfr_renamed_3;
            BigInteger bigInteger = sprkhk2.cfr_renamed_1155();
            BigInteger bigInteger2 = sprkhk2.cfr_renamed_1604();
            BigInteger bigInteger3 = sprkhk2.cfr_renamed_2305();
            BigInteger bigInteger4 = sprkhk2.cfr_renamed_2306();
            BigInteger bigInteger5 = sprkhk2.cfr_renamed_1148();
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
        return arg0.modPow(this.cfr_renamed_3.cfr_renamed_360(), this.cfr_renamed_3.cfr_renamed_2295());
    }

    public byte[] cfr_renamed_3610(BigInteger arg0) {
        byte[] byArray;
        byte[] byArray2;
        byte[] byArray3 = arg0.toByteArray();
        if (this.cfr_renamed_4) {
            if (byArray3[0] == 0 && byArray3.length > this.cfr_renamed_1339()) {
                byte[] byArray4 = new byte[byArray3.length - 1];
                System.arraycopy(byArray3, 1, byArray4, 0, byArray4.length);
                return byArray4;
            }
            if (byArray3.length < this.cfr_renamed_1339()) {
                byte[] byArray5 = new byte[this.cfr_renamed_1339()];
                System.arraycopy(byArray3, 0, byArray5, byArray5.length - byArray3.length, byArray3.length);
                return byArray5;
            }
            return byArray3;
        }
        if (byArray3[0] == 0) {
            byArray2 = new byte[byArray3.length - 1];
            System.arraycopy(byArray3, 1, byArray2, 0, byArray2.length);
            byArray = byArray3;
        } else {
            byArray2 = new byte[byArray3.length];
            System.arraycopy(byArray3, 0, byArray2, 0, byArray2.length);
            byArray = byArray3;
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        return byArray2;
    }

    private /* synthetic */ spriil cfr_renamed_10348(boolean arg0, boolean arg1) {
        boolean bl;
        boolean bl2 = arg0 && arg1;
        boolean bl3 = !arg0 && arg1;
        boolean bl4 = bl = !arg0 && !arg1;
        if (bl2) {
            return spriil.cfr_renamed_1;
        }
        if (bl3) {
            return spriil.cfr_renamed_3;
        }
        if (bl) {
            return spriil.cfr_renamed_93;
        }
        return spriil.cfr_renamed_152;
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprdzk sprdzk2;
        if (arg1 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_3 = (sprkik)sprbgk2.cfr_renamed_284();
            sprdzk2 = this;
        } else {
            this.cfr_renamed_3 = (sprkik)arg1;
            sprdzk2 = this;
        }
        sprdzk2.cfr_renamed_4 = arg0;
        sprdzk sprdzk3 = this;
        sprybl.cfr_renamed_9170(new sprfdl("RSA", sprrkl.cfr_renamed_9919(this.cfr_renamed_3.cfr_renamed_2295()), this.cfr_renamed_3, sprdzk3.cfr_renamed_10348(sprdzk3.cfr_renamed_3.cfr_renamed_1352(), arg0)));
    }

    public BigInteger cfr_renamed_3612(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprddl(GradientStopData.cfr_renamed_9("4N-U)\u0000)O2\u00001A/G8\u0000;O/\u0000\u000fs\u001c\u0000>I-H8Rs"));
        }
        if (arg2 == this.cfr_renamed_1344() + 1 && !this.cfr_renamed_4) {
            throw new sprddl(sprmye.cfr_renamed_9("9! :$o$ ?o<.\"(5o6 \"o\u0002\u001c\u0011o3& '5=~"));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (bigInteger.compareTo(this.cfr_renamed_3.cfr_renamed_2295()) >= 0) {
            throw new sprddl(GradientStopData.cfr_renamed_9("4N-U)\u0000)O2\u00001A/G8\u0000;O/\u0000\u000fs\u001c\u0000>I-H8Rs"));
        }
        return bigInteger;
    }

    public int cfr_renamed_1344() {
        sprdzk sprdzk2 = this;
        int n = sprdzk2.cfr_renamed_3.cfr_renamed_2295().bitLength();
        if (sprdzk2.cfr_renamed_4) {
            return (n + 7) / 8 - 1;
        }
        return (n + 7) / 8;
    }
}

