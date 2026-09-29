/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprjbm
extends sprqqe {
    private sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjbm(sprrgm[] sprrgmArray) {
        void arg0;
        sprjbm sprjbm2 = this;
        sprjbm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public sprrgm[] cfr_renamed_5354() {
        int n;
        sprrgm[] sprrgmArray = new sprrgm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprrgmArray.length) {
            int n3 = n++;
            sprrgmArray[n3] = sprrgm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprrgmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprjbm(sprszm arg0) {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(arg0.cfr_renamed_84());
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprrvm2.cfr_renamed_5004(sprrgm.cfr_renamed_23(enumeration3.nextElement()));
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjbm(sprrgm sprrgm2) {
        void arg0;
        sprjbm sprjbm2 = this;
        sprjbm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public sprjbm cfr_renamed_11190(sprrgm arg0) {
        int n;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.cfr_renamed_84() + 1);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_85(n++));
            n2 = n;
        }
        sprrvm2.cfr_renamed_5004(arg0);
        return new sprjbm(new sprcen(sprrvm2));
    }

    public static sprjbm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjbm) {
            return (sprjbm)arg0;
        }
        if (arg0 != null) {
            return new sprjbm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

