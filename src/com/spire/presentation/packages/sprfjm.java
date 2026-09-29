/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprgpr;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import java.io.IOException;
import java.math.BigInteger;

public class sprfjm
extends sprklk
implements sprar {
    public sprghm cfr_renamed_1;
    public sprghm cfr_renamed_2;
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

    public sprfjm(sprmam arg0) throws IOException {
        sprfjm sprfjm2 = this;
        this.cfr_renamed_3 = new sprghm(arg0);
        sprfjm2.cfr_renamed_4 = new sprghm(arg0);
        this.cfr_renamed_2 = new sprghm(arg0);
        this.cfr_renamed_1 = new sprghm(arg0);
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    public sprfjm(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        sprfjm sprfjm2 = this;
        this.cfr_renamed_3 = new sprghm(arg0);
        sprfjm2.cfr_renamed_4 = new sprghm(arg1);
        this.cfr_renamed_2 = new sprghm(arg2);
        this.cfr_renamed_1 = new sprghm(arg3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        void v0 = arg0;
        sprfjm sprfjm2 = this;
        arg0.cfr_renamed_7759(this.cfr_renamed_3);
        arg0.cfr_renamed_7759(sprfjm2.cfr_renamed_4);
        v0.cfr_renamed_7759(sprfjm2.cfr_renamed_2);
        v0.cfr_renamed_7759(this.cfr_renamed_1);
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    @Override
    public String cfr_renamed_7832() {
        return sprgpr.cfr_renamed_9("7K7");
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }
}

