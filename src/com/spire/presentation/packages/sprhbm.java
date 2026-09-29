/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spriko;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprxgi;
import java.io.IOException;
import java.math.BigInteger;

public class sprhbm
extends sprklk
implements sprar {
    public sprghm cfr_renamed_119;
    public BigInteger cfr_renamed_91;
    public sprghm cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    public sprghm cfr_renamed_2;
    public sprghm cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public sprhbm(sprmam arg0) throws IOException {
        sprhbm sprhbm2 = this;
        sprhbm sprhbm3 = this;
        sprhbm2.cfr_renamed_119 = new sprghm(arg0);
        sprhbm3.cfr_renamed_0 = new sprghm(arg0);
        sprhbm2.cfr_renamed_2 = new sprghm(arg0);
        sprhbm2.cfr_renamed_3 = new sprghm(arg0);
        sprhbm2.cfr_renamed_1 = sprhbm2.cfr_renamed_119.cfr_renamed_97().remainder(this.cfr_renamed_0.cfr_renamed_97().subtract(BigInteger.valueOf(1L)));
        sprhbm2.cfr_renamed_91 = sprhbm2.cfr_renamed_119.cfr_renamed_97().remainder(this.cfr_renamed_2.cfr_renamed_97().subtract(BigInteger.valueOf(1L)));
        sprhbm2.cfr_renamed_4 = sprhdf.cfr_renamed_5234(sprhbm2.cfr_renamed_0.cfr_renamed_97(), this.cfr_renamed_2.cfr_renamed_97());
    }

    public BigInteger cfr_renamed_7983() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        void v0 = arg0;
        sprhbm sprhbm2 = this;
        arg0.cfr_renamed_7759(this.cfr_renamed_119);
        arg0.cfr_renamed_7759(sprhbm2.cfr_renamed_0);
        v0.cfr_renamed_7759(sprhbm2.cfr_renamed_2);
        v0.cfr_renamed_7759(this.cfr_renamed_3);
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

    public BigInteger cfr_renamed_7981() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_0.cfr_renamed_97().multiply(this.cfr_renamed_2.cfr_renamed_97());
    }

    @Override
    public String cfr_renamed_7832() {
        return sprxgi.cfr_renamed_9("y\u007fy");
    }

    public BigInteger cfr_renamed_7980() {
        return this.cfr_renamed_0.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprhbm(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg0;
        void arg1;
        void arg2;
        int n = bigInteger2.compareTo((BigInteger)arg2);
        if (n >= 0) {
            if (n == 0) {
                throw new IllegalArgumentException(spriko.cfr_renamed_9("Y\u0007HIM\u0007X\u0007JFGIFS\tEL\u0007LV\\FE"));
            }
            void v0 = arg1;
            arg1 = arg2;
            arg2 = v0;
        }
        void v1 = arg2;
        sprhbm sprhbm2 = this;
        sprhbm sprhbm3 = this;
        sprhbm3.cfr_renamed_119 = new sprghm((BigInteger)arg0);
        sprhbm sprhbm4 = this;
        sprhbm3.cfr_renamed_0 = new sprghm((BigInteger)arg1);
        sprhbm4.cfr_renamed_2 = new sprghm((BigInteger)arg2);
        sprhbm2.cfr_renamed_3 = new sprghm(sprhdf.cfr_renamed_5234((BigInteger)arg2, (BigInteger)arg1));
        sprhbm2.cfr_renamed_1 = arg0.remainder(arg1.subtract(BigInteger.valueOf(1L)));
        this.cfr_renamed_91 = arg0.remainder(v1.subtract(BigInteger.valueOf(1L)));
        this.cfr_renamed_4 = sprhdf.cfr_renamed_5234((BigInteger)arg1, (BigInteger)v1);
    }

    public BigInteger cfr_renamed_2299() {
        return this.cfr_renamed_119.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_7984() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_7982() {
        return this.cfr_renamed_1;
    }
}

