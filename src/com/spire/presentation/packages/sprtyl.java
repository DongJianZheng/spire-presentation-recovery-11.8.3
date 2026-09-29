/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprtyl
extends sprqqe {
    private sprszm cfr_renamed_4;

    private /* synthetic */ sprtyl(sprszm arg0) throws IllegalArgumentException {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(arg0.cfr_renamed_84());
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprrvm2.cfr_renamed_5004(sprjbm.cfr_renamed_23(enumeration3.nextElement()));
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    public sprjbm[] cfr_renamed_5353() {
        int n;
        sprjbm[] sprjbmArray = new sprjbm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprjbmArray.length) {
            int n3 = n++;
            sprjbmArray[n3] = sprjbm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprjbmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprtyl(sprjbm[] sprjbmArray) {
        void arg0;
        sprtyl sprtyl2 = this;
        sprtyl2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprtyl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjbm) {
            return (sprtyl)arg0;
        }
        if (arg0 != null) {
            return new sprtyl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtyl(sprjbm sprjbm2) {
        void arg0;
        sprtyl sprtyl2 = this;
        sprtyl2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public sprtyl cfr_renamed_11189(sprjbm arg0) {
        int n;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.cfr_renamed_84() + 1);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_85(n++));
            n2 = n;
        }
        sprrvm2.cfr_renamed_5004(arg0);
        return new sprtyl(new sprcen(sprrvm2));
    }
}

