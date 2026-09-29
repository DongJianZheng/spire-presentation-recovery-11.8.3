/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprxgf;

public class sprfle
extends sprqqe {
    public sprujm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfle(String string, sprco sprco2) {
        void arg1;
        void arg0;
        sprfle sprfle2 = this;
        sprfle2.cfr_renamed_4 = new sprujm(new sprlem((String)arg0), new sprocn((sprco)arg1));
    }

    public sprfle(sprco sprco2) {
        this.cfr_renamed_4 = sprujm.cfr_renamed_23(sprco2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprfle(String string, sprrvm sprrvm2) {
        void arg1;
        void arg0;
        sprfle sprfle2 = this;
        sprfle2.cfr_renamed_4 = new sprujm(new sprlem((String)arg0), new sprocn((sprrvm)arg1));
    }

    public String cfr_renamed_113() {
        return this.cfr_renamed_4.cfr_renamed_204().cfr_renamed_19();
    }

    public sprco[] cfr_renamed_205() {
        int n;
        spridn spridn2 = this.cfr_renamed_4.cfr_renamed_206();
        sprco[] sprcoArray = new sprco[spridn2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spridn2.cfr_renamed_84()) {
            int n3 = n++;
            sprcoArray[n3] = spridn2.cfr_renamed_85(n3);
            n2 = n;
        }
        return sprcoArray;
    }
}

