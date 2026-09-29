/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdiaa;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprjgl;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprpz;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprscl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprdkl
implements sprpz {
    private SecureRandom cfr_renamed_3;
    private sprnzk cfr_renamed_4;

    @Override
    public sprscl cfr_renamed_10460(spreuh arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprdiaa.cfr_renamed_9("6+6\u00044\t\u001e\t\u001f-\u001d\u000b\u0001\u0011\u0003\u001c\u001c\u001aS\u0006\u001c\u001cS\u0001\u001d\u0001\u0007\u0001\u0012\u0004\u001a\u001b\u0016\f"));
        }
        sprdkl sprdkl2 = this;
        sprqxk sprqxk2 = sprdkl2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprjgl.cfr_renamed_3743(sprqxk2.cfr_renamed_1146(), this.cfr_renamed_3);
        sprfe sprfe2 = sprdkl2.cfr_renamed_3284();
        spreuh[] spreuhArray = new spreuh[2];
        spreuhArray[0] = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger);
        spreuhArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0));
        spreuh[] spreuhArray2 = spreuhArray;
        sprqxk2.cfr_renamed_1769().cfr_renamed_8691(spreuhArray2);
        return new sprscl(spreuhArray2[0], spreuhArray2[1]);
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        if (arg0 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg0;
            if (!(sprbgk2.cfr_renamed_284() instanceof sprnzk)) {
                throw new IllegalArgumentException(sproqr.cfr_renamed_9("*&?\u0010\r\t\u0006\u0006$\u0000\u00165\u000e\u0017\u000e\b\n\u0011\n\u0017\u001cE\u000e\u0017\nE\u001d\u0000\u001e\u0010\u0006\u0017\n\u0001O\u0003\u0000\u0017O\u0000\u0001\u0006\u001d\u001c\u001f\u0011\u0006\n\u0001K"));
            }
            this.cfr_renamed_4 = (sprnzk)sprbgk2.cfr_renamed_284();
            this.cfr_renamed_3 = sprbgk2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprnzk)) {
            throw new IllegalArgumentException(sprdiaa.cfr_renamed_9("6+#\u001d\u0011\u0004\u001a\u000b8\r\n8\u0012\u001a\u0012\u0005\u0016\u001c\u0016\u001a\u0000H\u0012\u001a\u0016H\u0001\r\u0002\u001d\u001a\u001a\u0016\fS\u000e\u001c\u001aS\r\u001d\u000b\u0001\u0011\u0003\u001c\u001a\u0007\u001dF"));
        }
        this.cfr_renamed_4 = (sprnzk)arg0;
        this.cfr_renamed_3 = sprybl.cfr_renamed_2794();
    }
}

