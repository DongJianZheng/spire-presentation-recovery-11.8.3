/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabz;
import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import java.io.IOException;
import java.math.BigInteger;

public class sprlam
extends sprklk
implements sprar {
    public sprghm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlam(sprmam sprmam2) throws IOException {
        void arg0;
        sprlam sprlam2 = this;
        sprlam2.cfr_renamed_4 = new sprghm((sprmam)arg0);
    }

    @Override
    public String cfr_renamed_7832() {
        return sprabz.cfr_renamed_9("eZe");
    }

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprlam(BigInteger bigInteger) {
        void arg0;
        sprlam sprlam2 = this;
        sprlam2.cfr_renamed_4 = new sprghm((BigInteger)arg0);
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_7759(this.cfr_renamed_4);
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
}

