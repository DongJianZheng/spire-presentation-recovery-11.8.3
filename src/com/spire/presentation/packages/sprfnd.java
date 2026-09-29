/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spraf;
import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprbhd;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprmuda;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrhd;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprfnd
implements spraf {
    private sprwmd cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public sprrhd cfr_renamed_1449(sprrhd arg0) {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprmuda.cfr_renamed_9("4d?B\u0006u\u0010I\u0015H\u001cI\u0014T\u0002s\u0003F\u001fT\u0017H\u0003JQI\u001eSQN\u001fN\u0005N\u0010K\u0018T\u0014C"));
        }
        sprfnd sprfnd2 = this;
        sprqid sprqid2 = sprfnd2.cfr_renamed_2.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        spreb spreb2 = sprfnd2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprbhd.cfr_renamed_3743(bigInteger, this.cfr_renamed_3);
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger2).cfr_renamed_1772(arg0.cfr_renamed_1980());
        sprrlbArray[1] = this.cfr_renamed_2.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_1772(arg0.spr\u3181());
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprqid2.cfr_renamed_1769().cfr_renamed_1805(sprrlbArray2);
        this.cfr_renamed_4 = bigInteger2;
        return new sprrhd(sprrlbArray2[0], sprrlbArray2[1]);
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        if (arg0 instanceof spraed) {
            spraed spraed2 = (spraed)arg0;
            if (!(spraed2.cfr_renamed_284() instanceof sprwmd)) {
                throw new IllegalArgumentException(sprajp.cfr_renamed_9("\u0003A\u0016w$n/a\rg?R'p'o#v#p5\"'p#\"4g7w/p#ffd)pfl#ufp'l\"m+l#q5\"2p'l5d)p+,"));
            }
            this.cfr_renamed_2 = (sprwmd)spraed2.cfr_renamed_284();
            this.cfr_renamed_3 = spraed2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprwmd)) {
            throw new IllegalArgumentException(sprmuda.cfr_renamed_9("4d!R\u0013K\u0018D:B\bw\u0010U\u0010J\u0014S\u0014U\u0002\u0007\u0010U\u0014\u0007\u0003B\u0000R\u0018U\u0014CQA\u001eUQI\u0014PQU\u0010I\u0015H\u001cI\u0014T\u0002\u0007\u0005U\u0010I\u0002A\u001eU\u001c\t"));
        }
        this.cfr_renamed_2 = (sprwmd)arg0;
        sprfnd sprfnd2 = this;
        sprfnd2.cfr_renamed_3 = new SecureRandom();
    }

    @Override
    public BigInteger cfr_renamed_3227() {
        return this.cfr_renamed_4;
    }
}

