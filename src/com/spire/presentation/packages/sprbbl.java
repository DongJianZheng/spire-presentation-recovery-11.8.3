/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdzk;
import com.spire.presentation.packages.sprgoha;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryky;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbbl
implements sprwn {
    private sprkik cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(1L);
    private SecureRandom cfr_renamed_3;
    private sprdzk cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbj sprbj2 = arg1;
        this.cfr_renamed_4.cfr_renamed_5535(arg0, sprbj2);
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_1 = (sprkik)sprbgk2.cfr_renamed_284();
            if (this.cfr_renamed_1 instanceof sprkhk) {
                this.cfr_renamed_3 = sprbgk2.cfr_renamed_1295();
                return;
            }
            this.cfr_renamed_3 = null;
            return;
        }
        this.cfr_renamed_1 = (sprkik)arg1;
        sprbbl sprbbl2 = this;
        if (this.cfr_renamed_1 instanceof sprkhk) {
            sprbbl2.cfr_renamed_3 = sprybl.cfr_renamed_2794();
            return;
        }
        sprbbl2.cfr_renamed_3 = null;
    }

    public sprbbl() {
        sprbbl sprbbl2 = this;
        sprbbl2.cfr_renamed_4 = new sprdzk();
    }

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_4.cfr_renamed_1339();
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        BigInteger bigInteger;
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(sprgoha.cfr_renamed_9("3} \u000e\u0004@\u0006G\u000fKA@\u000eZAG\u000fG\u0015G\u0000B\b]\u0004J"));
        }
        sprbbl sprbbl2 = this;
        BigInteger bigInteger2 = sprbbl2.cfr_renamed_4.cfr_renamed_3612(arg0, arg1, arg2);
        if (sprbbl2.cfr_renamed_1 instanceof sprkhk) {
            sprkhk sprkhk2 = (sprkhk)this.cfr_renamed_1;
            BigInteger bigInteger3 = sprkhk2.cfr_renamed_2296();
            if (bigInteger3 != null) {
                BigInteger bigInteger4;
                BigInteger bigInteger5 = sprkhk2.cfr_renamed_2295();
                BigInteger bigInteger6 = sprhdf.cfr_renamed_513(cfr_renamed_2, bigInteger5.subtract(cfr_renamed_2), this.cfr_renamed_3);
                BigInteger bigInteger7 = bigInteger6.modPow(bigInteger3, bigInteger5).multiply(bigInteger2).mod(bigInteger5);
                BigInteger bigInteger8 = this.cfr_renamed_4.cfr_renamed_3611(bigInteger7);
                bigInteger = bigInteger8.multiply(bigInteger4 = sprhdf.cfr_renamed_5234(bigInteger5, bigInteger6)).mod(bigInteger5);
                if (!bigInteger2.equals(bigInteger.modPow(bigInteger3, bigInteger5))) {
                    throw new IllegalStateException(spryky.cfr_renamed_9("\u0000.\u0013]7\u00135\u0014<\u0018r\u001b3\b>\t+]6\u00181\u000f+\r&\u0014=\u0013}\u000e;\u001a<\u0014<\u001ar\u00197\t7\u001e&\u00186"));
                }
            } else {
                bigInteger = this.cfr_renamed_4.cfr_renamed_3611(bigInteger2);
            }
        } else {
            bigInteger = this.cfr_renamed_4.cfr_renamed_3611(bigInteger2);
        }
        return this.cfr_renamed_4.cfr_renamed_3610(bigInteger);
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_4.cfr_renamed_1344();
    }
}

