/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprgw;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproxz;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprxlk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprplk
implements sprck,
sprjp {
    private final sprgw cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprmuk cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    public sprlsh cfr_renamed_9946(int arg0, spreuh arg1) {
        switch (arg0) {
            case 1: 
            case 6: 
            case 7: {
                return arg1.cfr_renamed_1964(0);
            }
            case 2: 
            case 3: 
            case 4: {
                return arg1.cfr_renamed_1964(0).cfr_renamed_1048();
            }
        }
        return null;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        SecureRandom secureRandom;
        boolean bl;
        SecureRandom secureRandom2 = null;
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                this.cfr_renamed_4 = (sprzuk)sprbgk2.cfr_renamed_284();
                secureRandom2 = sprbgk2.cfr_renamed_1295();
            } else {
                this.cfr_renamed_4 = (sprzuk)arg1;
            }
        } else {
            this.cfr_renamed_4 = (sprnzk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9916(sproxz.cfr_renamed_9("PuQeT"), this.cfr_renamed_4, arg0));
        if (arg0 && !this.cfr_renamed_2.cfr_renamed_3209()) {
            bl = true;
            secureRandom = secureRandom2;
        } else {
            bl = false;
            secureRandom = secureRandom2;
        }
        this.cfr_renamed_3 = this.cfr_renamed_3286(bl, secureRandom);
    }

    /*
     * WARNING - void declaration
     */
    public BigInteger cfr_renamed_3285(BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        int n = arg0.bitLength();
        int n2 = byArray.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, (byte[])arg1);
        if (n < n2) {
            bigInteger2 = bigInteger2.shiftRight(n2 - n);
        }
        return bigInteger2;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprlsh sprlsh2;
        BigInteger bigInteger;
        spreuh spreuh2;
        sprplk sprplk2 = this;
        sprqxk sprqxk2 = sprplk2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger2 = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger3 = sprplk2.cfr_renamed_3285(bigInteger2, arg0);
        if (arg1.compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || arg1.compareTo(bigInteger2) >= 0) {
            return false;
        }
        if (arg2.compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || arg2.compareTo(bigInteger2) >= 0) {
            return false;
        }
        BigInteger bigInteger4 = sprhdf.cfr_renamed_5232(bigInteger2, arg2);
        BigInteger bigInteger5 = bigInteger3.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigInteger6 = arg1.multiply(bigInteger4).mod(bigInteger2);
        spreuh spreuh3 = sprqxk2.cfr_renamed_1145();
        spreuh spreuh4 = sprmvh.cfr_renamed_8958(spreuh3, bigInteger5, spreuh2 = ((sprnzk)this.cfr_renamed_4).cfr_renamed_1604(), bigInteger6);
        if (spreuh4.cfr_renamed_1952()) {
            return false;
        }
        sprgxh sprgxh2 = spreuh4.cfr_renamed_1769();
        if (sprgxh2 != null && (bigInteger = sprgxh2.cfr_renamed_1843()) != null && bigInteger.compareTo((BigInteger)((Object)cfr_renamed_3)) <= 0 && (sprlsh2 = this.cfr_renamed_9946(sprgxh2.cfr_renamed_1874(), spreuh4)) != null && !sprlsh2.cfr_renamed_805()) {
            sprlsh sprlsh3 = spreuh4.cfr_renamed_1832();
            sprgxh sprgxh3 = sprgxh2;
            while (sprgxh3.cfr_renamed_8943(arg1)) {
                if (sprgxh2.cfr_renamed_1652(arg1).cfr_renamed_8682(sprlsh2).equals(sprlsh3)) {
                    return true;
                }
                arg1 = arg1.add(bigInteger2);
                sprgxh3 = sprgxh2;
            }
            return false;
        }
        bigInteger = spreuh4.cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2);
        return bigInteger.equals(arg1);
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        sprplk sprplk2;
        sprplk sprplk3 = this;
        sprqxk sprqxk2 = sprplk3.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger4 = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger5 = sprplk3.cfr_renamed_3285(bigInteger4, arg0);
        BigInteger bigInteger6 = ((sprzuk)sprplk3.cfr_renamed_4).cfr_renamed_2112();
        if (this.cfr_renamed_2.cfr_renamed_3209()) {
            sprplk sprplk4 = this;
            sprplk2 = sprplk4;
            sprplk4.cfr_renamed_2.cfr_renamed_2420(bigInteger4, bigInteger6, arg0);
        } else {
            sprplk sprplk5 = this;
            sprplk2 = sprplk5;
            sprplk5.cfr_renamed_2.cfr_renamed_3214(bigInteger4, this.cfr_renamed_3);
        }
        sprfe sprfe2 = sprplk2.cfr_renamed_3284();
        do {
            bigInteger2 = this.cfr_renamed_2.cfr_renamed_3208();
        } while ((bigInteger3 = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger2).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger4)).equals(cfr_renamed_0) || (bigInteger = sprhdf.cfr_renamed_5234(bigInteger4, bigInteger2).multiply(bigInteger5.add(bigInteger6.multiply(bigInteger3))).mod(bigInteger4)).equals(cfr_renamed_0));
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1146();
    }

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (arg0) {
            return sprybl.cfr_renamed_5688(arg1);
        }
        return null;
    }

    public sprplk(sprgw sprgw2) {
        this.cfr_renamed_2 = sprgw2;
    }

    public sprplk() {
        sprplk sprplk2 = this;
        sprplk2.cfr_renamed_2 = new sprxlk();
    }
}

