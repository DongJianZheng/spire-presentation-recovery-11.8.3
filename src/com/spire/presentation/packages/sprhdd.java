/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraf;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.spremy;
import com.spire.presentation.packages.sprloja;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrhd;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import java.math.BigInteger;

public class sprhdd
implements spraf {
    private BigInteger cfr_renamed_3;
    private sprwmd cfr_renamed_4;

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        if (!(arg0 instanceof sprwmd)) {
            throw new IllegalArgumentException(spremy.cfr_renamed_9("@\u0012U$g=l2N4|\u0001d#d<`%`#vqd#`qw4t$l#`5%7j#%7l)`5%%w0k\"c>w<+"));
        }
        this.cfr_renamed_4 = (sprwmd)arg0;
    }

    @Override
    public BigInteger cfr_renamed_3227() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprrhd cfr_renamed_1449(sprrhd arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprloja.cfr_renamed_9("{\u0015x?F3Z\u0002L7P%X9L;\u001e8Q\"\u001e?P?J?_:W%[2"));
        }
        sprhdd sprhdd2 = this;
        sprqid sprqid2 = sprhdd2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        spreb spreb2 = sprhdd2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprhdd2.cfr_renamed_3.mod(bigInteger);
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger2).cfr_renamed_1772(arg0.cfr_renamed_1980());
        sprrlbArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_1772(arg0.spr\u3181());
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprqid2.cfr_renamed_1769().cfr_renamed_1805(sprrlbArray2);
        return new sprrhd(sprrlbArray2[0], sprrlbArray2[1]);
    }

    public sprhdd(BigInteger bigInteger) {
        this.cfr_renamed_3 = bigInteger;
    }
}

