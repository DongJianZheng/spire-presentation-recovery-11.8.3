/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcv;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprjgl;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprscl;
import com.spire.presentation.packages.sprvrb;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprysb;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprsgl
implements sprcv {
    private SecureRandom cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private sprnzk cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_3227() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprscl cfr_renamed_10458(sprscl arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprysb.cfr_renamed_9("0\u0001;'\u0002\u0010\u0014,\u0011-\u0018,\u00101\u0006\u0016\u0007#\u001b1\u0013-\u0007/U,\u001a6U+\u001b+\u0001+\u0014.\u001c1\u0010&"));
        }
        sprsgl sprsgl2 = this;
        sprqxk sprqxk2 = sprsgl2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        sprfe sprfe2 = sprsgl2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprjgl.cfr_renamed_3743(bigInteger, this.cfr_renamed_2);
        spreuh[] spreuhArray = new spreuh[2];
        spreuhArray[0] = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger2).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.cfr_renamed_1980()));
        spreuhArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.spr\u3181()));
        spreuh[] spreuhArray2 = spreuhArray;
        sprqxk2.cfr_renamed_1769().cfr_renamed_8691(spreuhArray2);
        this.cfr_renamed_3 = bigInteger2;
        return new sprscl(spreuhArray2[0], spreuhArray2[1]);
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        if (arg0 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg0;
            if (!(sprbgk2.cfr_renamed_284() instanceof sprnzk)) {
                throw new IllegalArgumentException(sprvrb.cfr_renamed_9("F\\Sjasj|HzzObmbrfkfmp?bmf?qzrjjmf{#ylm#qfh#mbqgpnqflp?wmbqpylmn1"));
            }
            this.cfr_renamed_4 = (sprnzk)sprbgk2.cfr_renamed_284();
            this.cfr_renamed_2 = sprbgk2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprnzk)) {
            throw new IllegalArgumentException(sprysb.cfr_renamed_9("0\u0001%7\u0017.\u001c!>'\f\u0012\u00140\u0014/\u00106\u00100\u0006b\u00140\u0010b\u0007'\u00047\u001c0\u0010&U$\u001a0U,\u00105U0\u0014,\u0011-\u0018,\u00101\u0006b\u00010\u0014,\u0006$\u001a0\u0018l"));
        }
        this.cfr_renamed_4 = (sprnzk)arg0;
        this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }
}

