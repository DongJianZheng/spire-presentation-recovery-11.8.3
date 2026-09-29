/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprntl;
import com.spire.presentation.packages.sprool;
import com.spire.presentation.packages.sprqsl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvqm;
import com.spire.presentation.packages.sprxsm;
import java.util.Date;

public class sprqvl {
    private sprxsm cfr_renamed_4;

    public sprhgm cfr_renamed_4278() {
        return this.cfr_renamed_4.cfr_renamed_4278();
    }

    public sprool cfr_renamed_4276() {
        return new sprool(this.cfr_renamed_4.cfr_renamed_4277());
    }

    public sprqvl(sprxsm sprxsm2) {
        this.cfr_renamed_4 = sprxsm2;
    }

    public Date cfr_renamed_4279() {
        return sprntl.cfr_renamed_10908(this.cfr_renamed_4.cfr_renamed_4279());
    }

    public sprqsl[] cfr_renamed_4280() {
        int n;
        sprszm sprszm2 = this.cfr_renamed_4.cfr_renamed_4280();
        sprqsl[] sprqslArray = new sprqsl[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqslArray.length) {
            int n3 = n;
            sprqsl sprqsl2 = new sprqsl(sprvqm.cfr_renamed_23(sprszm2.cfr_renamed_85(n)));
            sprqslArray[n3] = sprqsl2;
            n2 = ++n;
        }
        return sprqslArray;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3().cfr_renamed_5023() + 1;
    }
}

