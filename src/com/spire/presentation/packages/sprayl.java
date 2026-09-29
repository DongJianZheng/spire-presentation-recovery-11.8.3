/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprax;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprep;
import com.spire.presentation.packages.sprfj;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprhsd;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprtpl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprayl {
    private sprhkm cfr_renamed_3;
    private sprep cfr_renamed_4;

    public sprcom cfr_renamed_10969(sprax arg0) throws sprcsl {
        return sprcom.cfr_renamed_23(this.cfr_renamed_10970(arg0));
    }

    public sprddm cfr_renamed_4356() {
        return this.cfr_renamed_3.cfr_renamed_4356();
    }

    public char[] cfr_renamed_10971(sprax arg0) throws sprcsl {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_10970(arg0)).toCharArray();
    }

    public sprayl(sprhkm sprhkm2) {
        this.cfr_renamed_3 = sprhkm2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_10970(sprax arg0) throws sprcsl {
        if (this.cfr_renamed_3.cfr_renamed_4357() != null) {
            throw new UnsupportedOperationException();
        }
        sprfj sprfj2 = arg0.cfr_renamed_10951(this.cfr_renamed_3.cfr_renamed_4358(), this.cfr_renamed_3.cfr_renamed_4359(), this.cfr_renamed_3.cfr_renamed_4360().cfr_renamed_81());
        InputStream inputStream = sprfj2.cfr_renamed_1447(new ByteArrayInputStream(this.cfr_renamed_3.cfr_renamed_4361().cfr_renamed_81()));
        try {
            byte[] byArray = sprkqe.cfr_renamed_471(inputStream);
            if (this.cfr_renamed_4 == null) return byArray;
            return this.cfr_renamed_4.cfr_renamed_4362(byArray);
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprhsd.cfr_renamed_9("\u0015=829(v,7.%9v83?$%&(38v87(7fv")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprayl(sprhkm sprhkm2, sprep sprep2) {
        void arg0;
        sprayl sprayl2 = this;
        sprayl2.cfr_renamed_3 = arg0;
        sprayl2.cfr_renamed_4 = sprep2;
    }

    public sprtpl cfr_renamed_10972(sprax arg0) throws sprcsl {
        return new sprtpl(sprndm.cfr_renamed_23(this.cfr_renamed_10970(arg0)));
    }
}

