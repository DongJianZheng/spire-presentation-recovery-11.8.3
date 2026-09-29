/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprall;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbxk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfjl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprprk;
import com.spire.presentation.packages.sprqtk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbil {
    private byte[] cfr_renamed_0 = null;
    private SecureRandom cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(1L);
    private boolean cfr_renamed_3;
    private sprprk cfr_renamed_4;

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (arg0) {
            return sprybl.cfr_renamed_5688(arg1);
        }
        return null;
    }

    public BigInteger cfr_renamed_3612(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprddl(sprsez.cfr_renamed_9("\u0005\b\u001c\u0013\u0018F\u0018\t\u0003F\u0000\u0007\u001e\u0001\tF\n\t\u001eF/\u0014\r\u000b\t\u0014L5\u0004\t\u0019\u0016L\u0005\u0005\u0016\u0004\u0003\u001eH"));
        }
        if (arg2 == this.cfr_renamed_1344() + 1 && this.cfr_renamed_3) {
            throw new sprddl(spruci.cfr_renamed_9("?h&s\"&\"i9&:g$a3&0i$&\u0015t7k3tvU>i#vve?v>c$("));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (bigInteger.compareTo(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()) >= 0) {
            throw new sprddl(sprsez.cfr_renamed_9("\u0005\b\u001c\u0013\u0018F\u0018\t\u0003F\u0000\u0007\u001e\u0001\tF\n\t\u001eF/\u0014\r\u000b\t\u0014L5\u0004\t\u0019\u0016L\u0005\u0005\u0016\u0004\u0003\u001eH"));
        }
        return bigInteger;
    }

    public int cfr_renamed_1344() {
        sprbil sprbil2 = this;
        int n = sprbil2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155().bitLength();
        if (sprbil2.cfr_renamed_3) {
            return (n + 7) / 8 - 1;
        }
        return (n + 7) / 8;
    }

    private /* synthetic */ BigInteger cfr_renamed_3533(BigInteger arg0, SecureRandom arg1) {
        return sprhdf.cfr_renamed_513(cfr_renamed_2, arg0.subtract(cfr_renamed_2), arg1);
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbil sprbil2;
        SecureRandom secureRandom = null;
        if (arg1 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_4 = (sprprk)sprbgk2.cfr_renamed_284();
            secureRandom = sprbgk2.cfr_renamed_1295();
            sprbil2 = this;
        } else {
            this.cfr_renamed_4 = (sprprk)arg1;
            sprbil2 = this;
        }
        sprbil2.cfr_renamed_1 = this.cfr_renamed_3286(arg0, secureRandom);
        this.cfr_renamed_3 = arg0;
        sprybl.cfr_renamed_9170(new sprfdl(spruci.cfr_renamed_9("E$g;c$U>i#v"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4, sprlrk.cfr_renamed_9915(arg0)));
    }

    public byte[] cfr_renamed_3610(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (!this.cfr_renamed_3) {
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

    public sprall cfr_renamed_3690(BigInteger arg0) {
        sprall sprall2 = null;
        if (!this.cfr_renamed_4.cfr_renamed_1352() && this.cfr_renamed_3 && this.cfr_renamed_4 instanceof sprbxk) {
            byte[] byArray;
            sprbxk sprbxk2 = (sprbxk)this.cfr_renamed_4;
            BigInteger bigInteger = sprbxk2.cfr_renamed_284().cfr_renamed_1155();
            BigInteger bigInteger2 = sprbxk2.cfr_renamed_284().cfr_renamed_1944();
            BigInteger bigInteger3 = sprbxk2.cfr_renamed_284().cfr_renamed_1946();
            BigInteger bigInteger4 = sprbxk2.cfr_renamed_1153();
            if (!this.cfr_renamed_3689(arg0, bigInteger)) {
                return sprall2;
            }
            BigInteger bigInteger5 = this.cfr_renamed_3533(bigInteger, this.cfr_renamed_1);
            BigInteger bigInteger6 = bigInteger2.modPow(bigInteger5, bigInteger);
            BigInteger bigInteger7 = bigInteger3.modPow(bigInteger5, bigInteger);
            BigInteger bigInteger8 = bigInteger4.modPow(bigInteger5, bigInteger).multiply(arg0).mod(bigInteger);
            sprgf sprgf2 = sprbxk2.cfr_renamed_284().cfr_renamed_1153();
            byte[] byArray2 = bigInteger6.toByteArray();
            sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            byte[] byArray3 = bigInteger7.toByteArray();
            sprgf2.cfr_renamed_1197(byArray3, 0, byArray3.length);
            byte[] byArray4 = bigInteger8.toByteArray();
            sprgf2.cfr_renamed_1197(byArray4, 0, byArray4.length);
            if (this.cfr_renamed_0 != null) {
                byArray = this.cfr_renamed_0;
                sprgf2.cfr_renamed_1197(byArray, 0, byArray.length);
            }
            sprgf sprgf3 = sprgf2;
            byArray = new byte[sprgf3.cfr_renamed_1218()];
            sprgf3.cfr_renamed_1219(byArray, 0);
            BigInteger bigInteger9 = new BigInteger(1, byArray);
            BigInteger bigInteger10 = sprbxk2.cfr_renamed_3369().modPow(bigInteger5, bigInteger).multiply(sprbxk2.cfr_renamed_2112().modPow(bigInteger5.multiply(bigInteger9), bigInteger)).mod(bigInteger);
            sprall2 = new sprall(bigInteger6, bigInteger7, bigInteger8, bigInteger10);
        }
        return sprall2;
    }

    public BigInteger cfr_renamed_10432(sprall arg0) throws sprfjl {
        BigInteger bigInteger = null;
        if (this.cfr_renamed_4.cfr_renamed_1352() && !this.cfr_renamed_3 && this.cfr_renamed_4 instanceof sprqtk) {
            byte[] byArray;
            sprqtk sprqtk2 = (sprqtk)this.cfr_renamed_4;
            BigInteger bigInteger2 = sprqtk2.cfr_renamed_284().cfr_renamed_1155();
            sprgf sprgf2 = sprqtk2.cfr_renamed_284().cfr_renamed_1153();
            byte[] byArray2 = arg0.cfr_renamed_3686().toByteArray();
            sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            byte[] byArray3 = arg0.cfr_renamed_3687().toByteArray();
            sprgf2.cfr_renamed_1197(byArray3, 0, byArray3.length);
            byte[] byArray4 = arg0.cfr_renamed_3688().toByteArray();
            sprgf2.cfr_renamed_1197(byArray4, 0, byArray4.length);
            if (this.cfr_renamed_0 != null) {
                byArray = this.cfr_renamed_0;
                sprgf2.cfr_renamed_1197(byArray, 0, byArray.length);
            }
            sprgf sprgf3 = sprgf2;
            byArray = new byte[sprgf3.cfr_renamed_1218()];
            sprgf3.cfr_renamed_1219(byArray, 0);
            BigInteger bigInteger3 = new BigInteger(1, byArray);
            BigInteger bigInteger4 = arg0.cfr_renamed_4.modPow(sprqtk2.cfr_renamed_3380().add(sprqtk2.cfr_renamed_3385().multiply(bigInteger3)), bigInteger2).multiply(arg0.cfr_renamed_3.modPow(sprqtk2.cfr_renamed_3384().add(sprqtk2.cfr_renamed_3386().multiply(bigInteger3)), bigInteger2)).mod(bigInteger2);
            if (arg0.cfr_renamed_2.equals(bigInteger4)) {
                sprall sprall2 = arg0;
                bigInteger = sprall2.cfr_renamed_1.multiply(sprall2.cfr_renamed_4.modPow(sprqtk2.cfr_renamed_3383(), bigInteger2).modInverse(bigInteger2)).mod(bigInteger2);
                return bigInteger;
            }
            throw new sprfjl(sprsez.cfr_renamed_9("5\u0003\u0014\u001e\u001f@F\u0018\u000e\r\u0012L\u0005\u0005\u0016\u0004\u0003\u001e\u0012\t\u001e\u0018F\u0005\u0015L\b\u0003\u0012L\u0005\u0003\u0014\u001e\u0003\u000f\u0012"));
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10433(boolean bl, sprbj sprbj2, String string) {
        void arg1;
        void arg0;
        this.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
        this.cfr_renamed_0 = sprkoe.cfr_renamed_431(string);
    }

    public int cfr_renamed_1339() {
        sprbil sprbil2 = this;
        int n = sprbil2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155().bitLength();
        if (sprbil2.cfr_renamed_3) {
            return (n + 7) / 8;
        }
        return (n + 7) / 8 - 1;
    }

    private /* synthetic */ boolean cfr_renamed_3689(BigInteger arg0, BigInteger arg1) {
        return arg0.compareTo(arg1) < 0;
    }
}

