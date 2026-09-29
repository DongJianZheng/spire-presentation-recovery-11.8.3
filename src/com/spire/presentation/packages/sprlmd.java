/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbhd;
import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprcg;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprjqc;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrhd;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprlmd
implements sprcg {
    private SecureRandom cfr_renamed_3;
    private sprwmd cfr_renamed_4;

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        if (arg0 instanceof spraed) {
            spraed spraed2 = (spraed)arg0;
            if (!(spraed2.cfr_renamed_284() instanceof sprwmd)) {
                throw new IllegalArgumentException(sprbrz.cfr_renamed_9(")x<N\u000eW\u0005X'^\u0015k\rI\rV\tO\tI\u001f\u001b\rI\t\u001b\u001e^\u001dN\u0005I\t_L]\u0003IL^\u0002X\u001eB\u001cO\u0005T\u0002\u0015"));
            }
            this.cfr_renamed_4 = (sprwmd)spraed2.cfr_renamed_284();
            this.cfr_renamed_3 = spraed2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprwmd)) {
            throw new IllegalArgumentException(sprjqc.cfr_renamed_9("(d=R\u000fK\u0004D&B\u0014w\fU\fJ\bS\bU\u001e\u0007\fU\b\u0007\u001fB\u001cR\u0004U\bCMA\u0002UMB\u0003D\u001f^\u001dS\u0004H\u0003\t"));
        }
        this.cfr_renamed_4 = (sprwmd)arg0;
        sprlmd sprlmd2 = this;
        sprlmd2.cfr_renamed_3 = new SecureRandom();
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public sprrhd cfr_renamed_3230(sprrlb arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprbrz.cfr_renamed_9(")x)W+Z\u0001Z\u0000~\u0002X\u001eB\u001cO\u0003ILU\u0003OLR\u0002R\u0018R\rW\u0005H\t_"));
        }
        sprlmd sprlmd2 = this;
        sprqid sprqid2 = sprlmd2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprbhd.cfr_renamed_3743(sprqid2.cfr_renamed_1146(), this.cfr_renamed_3);
        spreb spreb2 = sprlmd2.cfr_renamed_3284();
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger);
        sprrlbArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger).cfr_renamed_1772(arg0);
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprqid2.cfr_renamed_1769().cfr_renamed_1805(sprrlbArray2);
        return new sprrhd(sprrlbArray2[0], sprrlbArray2[1]);
    }
}

