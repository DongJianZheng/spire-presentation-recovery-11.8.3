/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprpd;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprsf;
import java.io.OutputStream;

public class sprfqg {
    private sprpd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprcpm cfr_renamed_1464(char[] arg0, byte[] arg1) throws sprhng {
        Object object;
        sprsf sprsf2;
        try {
            sprsf2 = this.cfr_renamed_4.cfr_renamed_1480(arg0);
            object = sprsf2.cfr_renamed_470();
            ((OutputStream)object).write(arg1);
            ((OutputStream)object).close();
        }
        catch (Exception exception) {
            throw new sprhng(new StringBuilder().insert(0, sprqgo.cfr_renamed_9("m\fy\u0000t\u00078\u0016wBh\u0010w\u0001}\u0011kB|\u0003l\u0003\"B")).append(exception.getMessage()).toString(), exception);
        }
        object = sprsf2.cfr_renamed_615();
        sprdim sprdim2 = new sprdim(this.cfr_renamed_4.cfr_renamed_1479(), sprsf2.cfr_renamed_1472());
        sprqrm sprqrm2 = sprqrm.cfr_renamed_23(((sprddm)object).cfr_renamed_284());
        return new sprcpm(sprdim2, sprqrm2.cfr_renamed_1205(), sprqrm2.cfr_renamed_1490().intValue());
    }

    public sprfqg(sprpd sprpd2) {
        this.cfr_renamed_4 = sprpd2;
    }
}

