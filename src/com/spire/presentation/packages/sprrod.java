/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfse;
import com.spire.presentation.packages.sprggb;
import com.spire.presentation.packages.sprlrd;
import com.spire.presentation.packages.sprsne;
import com.spire.presentation.packages.sprza;

public class sprrod {
    private sprza cfr_renamed_3;
    private sprsne cfr_renamed_4;

    public sprsne cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprlrd[] cfr_renamed_4425() {
        int n;
        sprfse[] sprfseArray = this.cfr_renamed_4.cfr_renamed_4426();
        sprlrd[] sprlrdArray = new sprlrd[sprfseArray.length];
        int n2 = n = 0;
        while (n2 != sprlrdArray.length) {
            int n3 = n;
            sprlrd sprlrd2 = new sprlrd(this.cfr_renamed_3, sprfseArray[n]);
            sprlrdArray[n3] = sprlrd2;
            n2 = ++n;
        }
        return sprlrdArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprrod(sprsne sprsne2, sprza sprza2) {
        void arg1;
        sprrod sprrod2 = this;
        sprrod2.cfr_renamed_3 = arg1;
        sprrod2.cfr_renamed_4 = sprsne2;
    }

    public sprrod(sprsne arg0) {
        this(arg0, new sprggb());
    }
}

