/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprrs;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprwpk
implements sprrs {
    private sprwsk cfr_renamed_4;

    public sprwpk(sprwsk sprwsk2) {
        this.cfr_renamed_4 = sprwsk2;
    }

    @Override
    public spryye cfr_renamed_3338(InputStream arg0) throws IOException {
        byte[] byArray = new byte[(this.cfr_renamed_4.cfr_renamed_1155().bitLength() + 7) / 8];
        sprkqe.cfr_renamed_473(arg0, byArray, 0, byArray.length);
        return new sprryk(new BigInteger(1, byArray), this.cfr_renamed_4);
    }
}

