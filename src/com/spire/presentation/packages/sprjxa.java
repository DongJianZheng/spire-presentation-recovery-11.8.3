/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprage;
import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprca;
import com.spire.presentation.packages.sprfdb;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprgde;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprpcb;
import com.spire.presentation.packages.sprpgb;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsyd;
import com.spire.presentation.packages.sprzie;
import java.io.IOException;

public class sprjxa {
    private sprlre cfr_renamed_4;

    public sprjxa cfr_renamed_1462(sprfdb arg0) throws IOException {
        sprjxa sprjxa2 = this;
        sprjxa2.cfr_renamed_4.cfr_renamed_49(new sproce(sprm.cfr_renamed_1223, new sprlqe(new sprhle(arg0.cfr_renamed_568()).cfr_renamed_91())));
        return sprjxa2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprffb cfr_renamed_1463(sprca arg0, char[] arg1) throws sprfxa {
        Object object;
        byte[] byArray;
        sprzie sprzie2 = sprzie.cfr_renamed_23(new sprhle(this.cfr_renamed_4));
        try {
            byArray = sprzie2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprfxa(new StringBuilder().insert(0, sprald.cfr_renamed_9("Z)N%C\"\u000f3@gJ)L(K\"\u000f\u0006Z3G\"A3F$N3J#|&I\"\u0015g")).append(iOException.getMessage()).toString(), iOException);
        }
        sproce sproce2 = new sproce(sprm.cfr_renamed_1223, new sprlqe(byArray));
        sprage sprage2 = null;
        if (arg0 != null) {
            object = new sprpgb(arg0);
            sprage2 = ((sprpgb)object).cfr_renamed_1464(arg1, byArray);
        }
        object = new sprgde(sproce2, sprage2);
        return new sprffb((sprgde)object);
    }

    public sprjxa cfr_renamed_1465(sproa arg0, sprfdb[] arg1) throws IOException {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != arg1.length) {
            sprlre2.cfr_renamed_49(arg1[n++].cfr_renamed_568());
            n2 = n;
        }
        return this.cfr_renamed_1466(arg0, new sprhle(sprlre2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprjxa cfr_renamed_1466(sproa arg0, sprbne arg1) throws IOException {
        sprsyd sprsyd2 = new sprsyd();
        try {
            this.cfr_renamed_4.cfr_renamed_49(sprsyd2.cfr_renamed_1467(new sprard(arg1.cfr_renamed_91()), arg0).cfr_renamed_568());
            return this;
        }
        catch (sprlqd sprlqd2) {
            throw new sprpcb(sprlqd2.getMessage(), sprlqd2.getCause());
        }
    }

    public sprjxa() {
        sprjxa sprjxa2 = this;
        sprjxa2.cfr_renamed_4 = new sprlre();
    }

    public sprjxa cfr_renamed_1468(sproa arg0, sprfdb arg1) throws IOException {
        return this.cfr_renamed_1466(arg0, new sprpse(arg1.cfr_renamed_568()));
    }
}

