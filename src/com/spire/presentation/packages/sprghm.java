/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprwiea;
import java.io.IOException;
import java.math.BigInteger;

public class sprghm
extends sprklk {
    public BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        int n;
        sprghm sprghm2 = this;
        int n2 = n = sprghm2.cfr_renamed_4.bitLength();
        arg0.write(n2 >> 8);
        sprjah2.write(n2);
        byte[] byArray = sprghm2.cfr_renamed_4.toByteArray();
        if (byArray[0] == 0) {
            arg0.write(byArray, 1, byArray.length - 1);
            return;
        }
        arg0.write(byArray, 0, byArray.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprghm(BigInteger bigInteger) {
        void arg0;
        this.cfr_renamed_4 = null;
        if (bigInteger == null || arg0.signum() < 0) {
            throw new IllegalArgumentException(sprwiea.cfr_renamed_9("\r/\u0017;\u001en\u0016;\b:[ \u0014:[,\u001en\u0015;\u0017\"Wn\u0014<[ \u001e)\u001a:\u00128\u001e"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprghm(sprmam sprmam2) throws IOException {
        void arg0;
        sprmam sprmam3 = sprmam2;
        sprghm sprghm2 = this;
        sprghm2.cfr_renamed_4 = null;
        byte[] byArray = new byte[((sprmam3.read() << 8 | arg0.read()) + 7) / 8];
        sprmam3.cfr_renamed_4932(byArray);
        sprghm sprghm3 = this;
        sprghm2.cfr_renamed_4 = new BigInteger(1, byArray);
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }
}

