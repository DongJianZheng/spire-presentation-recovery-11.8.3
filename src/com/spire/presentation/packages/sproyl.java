/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprfjo;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import java.io.IOException;
import java.math.BigInteger;

public class sproyl
extends sprklk
implements sprar {
    public sprghm cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_7759(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sproyl(sprmam sprmam2) throws IOException {
        void arg0;
        sproyl sproyl2 = this;
        sproyl2.cfr_renamed_4 = new sprghm((sprmam)arg0);
    }

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4.cfr_renamed_97();
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

    @Override
    public String cfr_renamed_7832() {
        return sprfjo.cfr_renamed_9("~r~");
    }

    /*
     * WARNING - void declaration
     */
    public sproyl(BigInteger bigInteger) {
        void arg0;
        sproyl sproyl2 = this;
        sproyl2.cfr_renamed_4 = new sprghm((BigInteger)arg0);
    }
}

