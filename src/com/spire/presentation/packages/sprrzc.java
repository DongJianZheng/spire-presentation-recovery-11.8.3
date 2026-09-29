/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprpi;
import com.spire.presentation.packages.sprzmd;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprrzc
implements sprpi {
    private sprzmd cfr_renamed_4;

    public sprrzc(sprzmd sprzmd2) {
        this.cfr_renamed_4 = sprzmd2;
    }

    @Override
    public sprhgb cfr_renamed_3338(InputStream arg0) throws IOException {
        byte[] byArray = new byte[(this.cfr_renamed_4.cfr_renamed_1155().bitLength() + 7) / 8];
        arg0.read(byArray, 0, byArray.length);
        return new sprmgd(new BigInteger(1, byArray), this.cfr_renamed_4);
    }
}

