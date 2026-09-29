/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import java.io.IOException;
import java.math.BigInteger;

public class sprwcm
extends sprklk
implements sprar {
    public sprghm cfr_renamed_3;
    public sprghm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_91() {
        try {
            return super.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_7759(this.cfr_renamed_4);
        v0.cfr_renamed_7759(this.cfr_renamed_3);
    }

    @Override
    public String cfr_renamed_7832() {
        return spramk.cfr_renamed_9("}n}");
    }

    /*
     * WARNING - void declaration
     */
    public sprwcm(sprmam sprmam2) throws IOException {
        void arg0;
        sprwcm sprwcm2 = this;
        this.cfr_renamed_4 = new sprghm((sprmam)arg0);
        sprwcm2.cfr_renamed_3 = new sprghm((sprmam)arg0);
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprwcm(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        sprwcm sprwcm2 = this;
        this.cfr_renamed_4 = new sprghm((BigInteger)arg0);
        sprwcm2.cfr_renamed_3 = new sprghm((BigInteger)arg1);
    }
}

