/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgbo;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprqgl
implements spruy {
    private sprzuk cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        spreuh spreuh2;
        sprnzk sprnzk2 = (sprnzk)arg0;
        sprqxk sprqxk2 = this.cfr_renamed_4.cfr_renamed_284();
        if (!sprqxk2.equals(sprnzk2.cfr_renamed_284())) {
            throw new IllegalStateException(sprgyz.cfr_renamed_9("5\\4WPo\u0005}\u001cv\u0013?\u001bz\t?\u0018~\u0003?\u0007m\u001fq\u0017?\u0014p\u001d~\u0019qPo\u0011m\u0011r\u0015k\u0015m\u0003"));
        }
        BigInteger bigInteger = this.cfr_renamed_4.cfr_renamed_2112();
        spreuh spreuh3 = sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), sprnzk2.cfr_renamed_1604());
        if (spreuh3.cfr_renamed_1952()) {
            throw new IllegalStateException(sprgbo.cfr_renamed_9("MWbPjPp@$Pw\u0019jVp\u0019e\u0019rXhP`\u0019tLfUmZ$Ra@$_kK$|G}L"));
        }
        BigInteger bigInteger2 = sprqxk2.cfr_renamed_1153();
        if (!bigInteger2.equals(sprck.cfr_renamed_4)) {
            bigInteger = sprqxk2.cfr_renamed_9987().multiply(bigInteger).mod(sprqxk2.cfr_renamed_1146());
            spreuh3 = sprmvh.cfr_renamed_8921(spreuh3, bigInteger2);
        }
        if ((spreuh2 = spreuh3.cfr_renamed_1830(bigInteger).cfr_renamed_1775()).cfr_renamed_1952()) {
            throw new IllegalStateException(sprgyz.cfr_renamed_9("V\u001ey\u0019q\u0019k\t?\u0019lPq\u001fkP~Pi\u0011s\u0019{P~\u0017m\u0015z\u001dz\u001ekPi\u0011s\u0005zPy\u001fmPZ3[8"));
        }
        return spreuh2.cfr_renamed_1969().cfr_renamed_1779();
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprzuk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprgbo.cfr_renamed_9("|G}L"), this.cfr_renamed_4));
    }
}

