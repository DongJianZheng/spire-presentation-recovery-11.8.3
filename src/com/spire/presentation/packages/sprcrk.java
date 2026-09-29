/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprshha;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;

public class sprcrk
implements sproh {
    private final sprkik cfr_renamed_2;
    private sprjs cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprcrk sprcrk2 = this;
        BigInteger bigInteger = sprcrk2.cfr_renamed_2.cfr_renamed_2295();
        BigInteger bigInteger2 = sprcrk2.cfr_renamed_2.cfr_renamed_360();
        BigInteger bigInteger3 = new BigInteger(1, arg0).modPow(bigInteger2, bigInteger);
        return spratk.cfr_renamed_10123(sprcrk2.cfr_renamed_3, bigInteger, bigInteger3, this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprcrk(sprkik sprkik2, int n, sprjs sprjs2) {
        void arg2;
        void arg1;
        void arg0;
        if (!sprkik2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprhah.cfr_renamed_9(" \u00159\u00111\u00135G;\u0002)G\"\u0002!\u00129\u00155\u0003p\u0001?\u0015p\u0002>\u0004\"\u001e \u00139\b>"));
        }
        sprcrk sprcrk2 = this;
        sprcrk2.cfr_renamed_2 = arg0;
        sprcrk2.cfr_renamed_4 = arg1;
        this.cfr_renamed_3 = arg2;
        sprybl.cfr_renamed_9170(new sprfdl(sprshha.cfr_renamed_9("\u0017\u007f\u0004g A"), sprrkl.cfr_renamed_9919(this.cfr_renamed_2.cfr_renamed_2295()), arg0, spriil.cfr_renamed_152));
    }

    @Override
    public int cfr_renamed_5687() {
        return (this.cfr_renamed_2.cfr_renamed_2295().bitLength() + 7) / 8;
    }
}

