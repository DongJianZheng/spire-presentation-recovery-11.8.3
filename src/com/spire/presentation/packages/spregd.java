/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbhd;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprfjn;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrhd;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrm;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spregd
implements sprrm {
    private SecureRandom cfr_renamed_3;
    private sprwmd cfr_renamed_4;

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        if (arg0 instanceof spraed) {
            spraed spraed2 = (spraed)arg0;
            if (!(spraed2.cfr_renamed_284() instanceof sprwmd)) {
                throw new IllegalArgumentException(sprfjn.cfr_renamed_9("4\u0005!3\u0013*\u0018%:#\b\u0016\u00104\u0010+\u00142\u00144\u0002f\u00104\u0014f\u0003#\u00003\u00184\u0014\"Q \u001e4Q(\u00141Q6\u0004$\u001d/\u0012f\u001a#\bf\u00054\u0010(\u0002 \u001e4\u001ch"));
            }
            this.cfr_renamed_4 = (sprwmd)spraed2.cfr_renamed_284();
            this.cfr_renamed_3 = spraed2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprwmd)) {
            throw new IllegalArgumentException(sprfql.cfr_renamed_9("SzFLtU\u007fZ]\\oiwKwTsMsKe\u0019wKs\u0019d\\gL\u007fKs]6_yK6WsN6Ic[zPu\u0019}\\o\u0019bKwWe_yK{\u0017"));
        }
        this.cfr_renamed_4 = (sprwmd)arg0;
        spregd spregd2 = this;
        spregd2.cfr_renamed_3 = new SecureRandom();
    }

    @Override
    public sprrhd cfr_renamed_1449(sprrhd arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprfjn.cfr_renamed_9("\u00032\b\u00141!3\u0013*\u0018%:#\b\u0012\u0003'\u001f5\u0017)\u0003+Q(\u001e2Q/\u001f/\u0005/\u0010*\u00185\u0014\""));
        }
        spregd spregd2 = this;
        sprqid sprqid2 = spregd2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        spreb spreb2 = spregd2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprbhd.cfr_renamed_3743(bigInteger, this.cfr_renamed_3);
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger2);
        sprrlbArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_1772(arg0.spr\u3181());
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprqid2.cfr_renamed_1769().cfr_renamed_1805(sprrlbArray2);
        return new sprrhd(sprrlbArray2[0], sprrlbArray2[1]);
    }
}

