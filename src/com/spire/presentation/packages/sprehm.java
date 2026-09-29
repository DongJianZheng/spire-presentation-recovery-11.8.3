/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprhhf;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import java.io.IOException;
import java.math.BigInteger;

public class sprehm
extends sprklk
implements sprar {
    public sprghm cfr_renamed_2;
    public sprghm cfr_renamed_3;
    public sprghm cfr_renamed_4;

    public BigInteger spr\u3181() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

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

    public sprehm(sprmam arg0) throws IOException {
        sprehm sprehm2 = this;
        this.cfr_renamed_3 = new sprghm(arg0);
        sprehm2.cfr_renamed_4 = new sprghm(arg0);
        this.cfr_renamed_2 = new sprghm(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        void v0 = arg0;
        sprehm sprehm2 = this;
        arg0.cfr_renamed_7759(sprehm2.cfr_renamed_3);
        v0.cfr_renamed_7759(sprehm2.cfr_renamed_4);
        v0.cfr_renamed_7759(this.cfr_renamed_2);
    }

    public sprehm(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        sprehm sprehm2 = this;
        this.cfr_renamed_3 = new sprghm(arg0);
        sprehm2.cfr_renamed_4 = new sprghm(arg1);
        this.cfr_renamed_2 = new sprghm(arg2);
    }

    @Override
    public String cfr_renamed_7832() {
        return sprhhf.cfr_renamed_9("J\u0006J");
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }
}

