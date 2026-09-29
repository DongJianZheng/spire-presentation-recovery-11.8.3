/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtfk
implements sprjp {
    private SecureRandom cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprmuk cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1146();
    }

    private static /* synthetic */ sprlsh cfr_renamed_9947(sprgxh arg0, byte[] arg1) {
        byte[] byArray = sproze.cfr_renamed_537(arg1);
        sprgxh sprgxh2 = arg0;
        sprgxh sprgxh3 = arg0;
        return sprgxh3.cfr_renamed_1652(sprtfk.cfr_renamed_3289(new BigInteger(1, byArray), sprgxh3.cfr_renamed_1938()));
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        sprlsh sprlsh2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        sprlsh sprlsh3;
        sprqxk sprqxk2 = this.cfr_renamed_4.cfr_renamed_284();
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        sprlsh sprlsh4 = sprtfk.cfr_renamed_9947(sprgxh2, arg0);
        if (sprlsh4.cfr_renamed_805()) {
            sprlsh4 = sprgxh2.cfr_renamed_1652(cfr_renamed_3);
        }
        BigInteger bigInteger4 = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger5 = ((sprzuk)this.cfr_renamed_4).cfr_renamed_2112();
        sprfe sprfe2 = this.cfr_renamed_3284();
        do {
            bigInteger3 = sprtfk.cfr_renamed_3287(bigInteger4, this.cfr_renamed_2);
        } while ((sprlsh3 = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger3).cfr_renamed_1775().cfr_renamed_1969()).cfr_renamed_805() || (bigInteger2 = sprtfk.cfr_renamed_3289((sprlsh2 = sprlsh4.cfr_renamed_8682(sprlsh3)).cfr_renamed_1779(), bigInteger4.bitLength() - 1)).signum() == 0 || (bigInteger = bigInteger2.multiply(bigInteger5).add(bigInteger3).mod(bigInteger4)).signum() == 0);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3287(BigInteger arg0, SecureRandom arg1) {
        return sprhdf.cfr_renamed_5230(arg0.bitLength() - 1, arg1);
    }

    private static /* synthetic */ BigInteger cfr_renamed_3289(BigInteger arg0, int arg1) {
        if (arg0.bitLength() > arg1) {
            arg0 = arg0.mod(cfr_renamed_3.shiftLeft(arg1));
        }
        return arg0;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        spreuh spreuh2;
        if (arg1.signum() <= 0 || arg2.signum() <= 0) {
            return false;
        }
        sprqxk sprqxk2 = this.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        if (arg1.compareTo(bigInteger) >= 0 || arg2.compareTo(bigInteger) >= 0) {
            return false;
        }
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        sprlsh sprlsh2 = sprtfk.cfr_renamed_9947(sprgxh2, arg0);
        if (sprlsh2.cfr_renamed_805()) {
            sprlsh2 = sprgxh2.cfr_renamed_1652(cfr_renamed_3);
        }
        if ((spreuh2 = sprmvh.cfr_renamed_8958(sprqxk2.cfr_renamed_1145(), arg2, ((sprnzk)this.cfr_renamed_4).cfr_renamed_1604(), arg1).cfr_renamed_1775()).cfr_renamed_1952()) {
            return false;
        }
        sprlsh sprlsh3 = sprlsh2.cfr_renamed_8682(spreuh2.cfr_renamed_1969());
        return sprtfk.cfr_renamed_3289(sprlsh3.cfr_renamed_1779(), bigInteger.bitLength() - 1).compareTo(arg1) == 0;
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            sprtfk sprtfk2;
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprtfk2 = this;
                this.cfr_renamed_2 = sprbgk2.cfr_renamed_1295();
                arg1 = sprbgk2.cfr_renamed_284();
            } else {
                sprtfk2 = this;
                this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
            }
            sprtfk2.cfr_renamed_4 = (sprzuk)arg1;
        } else {
            this.cfr_renamed_4 = (sprnzk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9916("DSTU4145", this.cfr_renamed_4, arg0));
    }
}

