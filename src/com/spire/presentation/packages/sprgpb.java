/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdb;
import com.spire.presentation.packages.sprlb;
import com.spire.presentation.packages.sprmbea;
import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprunb;
import java.math.BigInteger;

public class sprgpb
extends sprmqb {
    public final sprdb cfr_renamed_3;
    public final sprpib cfr_renamed_4;

    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        if (!this.cfr_renamed_4.cfr_renamed_1931(arg0.cfr_renamed_1769())) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger = arg0.cfr_renamed_1769().cfr_renamed_1932();
        sprgpb sprgpb2 = this;
        BigInteger[] bigIntegerArray = sprgpb2.cfr_renamed_3.cfr_renamed_1933(arg1.mod(bigInteger));
        BigInteger bigInteger2 = bigIntegerArray[0];
        BigInteger bigInteger3 = bigIntegerArray[1];
        sprlb sprlb2 = sprgpb2.cfr_renamed_3.cfr_renamed_1934();
        if (sprgpb2.cfr_renamed_3.spr\u3180()) {
            return sprunb.cfr_renamed_1935(arg0, bigInteger2, sprlb2, bigInteger3);
        }
        return sprunb.cfr_renamed_1936(arg0, bigInteger2, sprlb2.cfr_renamed_1797(arg0), bigInteger3);
    }

    /*
     * WARNING - void declaration
     */
    public sprgpb(sprpib sprpib2, sprdb sprdb2) {
        void arg1;
        void arg0;
        if (sprpib2 == null || arg0.cfr_renamed_1932() == null) {
            throw new IllegalArgumentException(sprmbea.cfr_renamed_9("eFNG\u000b@^Q]F\u000bTBWC\u0003@MDTE\u0003LQDV[\u0003DQOFY"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }
}

