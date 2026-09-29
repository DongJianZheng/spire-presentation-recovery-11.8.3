/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdxk;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprhpg;
import com.spire.presentation.packages.sprmbl;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;

public class sprtdl
implements spruy {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    public sprdxk cfr_renamed_4;

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprdxk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10590(sprqwg.cfr_renamed_9("\u001aC\u0001"), this.cfr_renamed_4.cfr_renamed_2095()));
    }

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        sprmbl sprmbl2 = (sprmbl)arg0;
        sprtdl sprtdl2 = this;
        sprquk sprquk2 = sprtdl2.cfr_renamed_4.cfr_renamed_2095();
        if (!sprtdl2.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().equals(sprmbl2.cfr_renamed_3351().cfr_renamed_284())) {
            throw new IllegalStateException(sprhpg.cfr_renamed_9("N\u001eUos:a#j,#$f6#,l\"s m*m;pok.u*#8q m(#+l\"b&mos.q.n*w*q<"));
        }
        if (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1604() == null) {
            throw new IllegalStateException(sprqwg.cfr_renamed_9("\u001aC\u00012<w.23}:s>|wb6`6\u007f2f2`$23}w|8fwz6d22\u00062$w#"));
        }
        BigInteger bigInteger = this.cfr_renamed_10617(sprquk2.cfr_renamed_284(), sprquk2, sprmbl2.cfr_renamed_3351(), this.cfr_renamed_4.cfr_renamed_2094(), this.cfr_renamed_4.cfr_renamed_2096(), sprmbl2.cfr_renamed_2096());
        if (bigInteger.equals(cfr_renamed_3)) {
            throw new IllegalStateException(sprhpg.cfr_renamed_9("2oj<#!l;#.#9b#j+#.d=f*n*m;#9b#v*#)l=#\u0002R\u0019"));
        }
        return bigInteger;
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
    }

    private /* synthetic */ BigInteger cfr_renamed_10617(sprwsk arg0, sprquk arg1, sprryk arg2, sprquk arg3, sprryk arg4, sprryk arg5) {
        BigInteger bigInteger = arg0.cfr_renamed_1604();
        int n = (bigInteger.bitLength() + 1) / 2;
        BigInteger bigInteger2 = BigInteger.valueOf(2L).pow(n);
        BigInteger bigInteger3 = arg4.spr\u3181().mod(bigInteger2).add(bigInteger2);
        BigInteger bigInteger4 = arg3.cfr_renamed_1980().add(bigInteger3.multiply(arg1.cfr_renamed_1980())).mod(bigInteger);
        sprryk sprryk2 = arg5;
        BigInteger bigInteger5 = sprryk2.spr\u3181().mod(bigInteger2).add(bigInteger2);
        return sprryk2.spr\u3181().multiply(arg2.spr\u3181().modPow(bigInteger5, arg0.cfr_renamed_1155())).modPow(bigInteger4, arg0.cfr_renamed_1155());
    }
}

