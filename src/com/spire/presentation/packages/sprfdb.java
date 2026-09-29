/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprade;
import com.spire.presentation.packages.spraje;
import com.spire.presentation.packages.sprbbe;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprkbe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprtke;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxue;

public class sprfdb {
    public static final sprtzd cfr_renamed_2 = sprm.cfr_renamed_1456;
    private spraje cfr_renamed_3;
    public static final sprtzd cfr_renamed_4 = sprm.cfr_renamed_135;

    public sprtzd cfr_renamed_324() {
        return this.cfr_renamed_3.cfr_renamed_1457();
    }

    public Object cfr_renamed_1458() {
        if (this.cfr_renamed_324().equals(sprm.cfr_renamed_614)) {
            return new sprdgb(sprbbe.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1458()));
        }
        if (this.cfr_renamed_324().equals(sprm.cfr_renamed_114)) {
            sprtke sprtke2 = sprtke.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1458());
            return new sprcyd(sprcge.cfr_renamed_23(sprxue.cfr_renamed_23(sprtke2.cfr_renamed_1459()).cfr_renamed_186()));
        }
        if (this.cfr_renamed_324().equals(sprm.cfr_renamed_1328)) {
            return sprmke.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1458());
        }
        if (this.cfr_renamed_324().equals(sprm.cfr_renamed_1452)) {
            sprkbe sprkbe2 = sprkbe.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1458());
            return new spreud(sproje.cfr_renamed_23(sprxue.cfr_renamed_23(sprkbe2.cfr_renamed_1460()).cfr_renamed_186()));
        }
        return this.cfr_renamed_3.cfr_renamed_1458();
    }

    public spraje cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public sprfdb(spraje spraje2) {
        this.cfr_renamed_3 = spraje2;
    }

    public sprade[] cfr_renamed_82() {
        int n;
        sprere sprere2 = this.cfr_renamed_3.cfr_renamed_1461();
        if (sprere2 == null) {
            return null;
        }
        sprade[] spradeArray = new sprade[sprere2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprere2.cfr_renamed_84()) {
            int n3 = n++;
            spradeArray[n3] = sprade.cfr_renamed_23(sprere2.cfr_renamed_85(n3));
            n2 = n;
        }
        return spradeArray;
    }
}

