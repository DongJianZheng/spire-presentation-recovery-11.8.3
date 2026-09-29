/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhcea;
import com.spire.presentation.packages.sprmkm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprpqm
extends sprqqe {
    private sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    public static sprpqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpqm) {
            return (sprpqm)arg0;
        }
        if (arg0 != null) {
            return new sprpqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpqm(sprszm sprszm2) {
        Enumeration enumeration;
        void arg0;
        if (sprszm2.cfr_renamed_84() != 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhcea.cfr_renamed_9("C<e}r8p(d3b8!.h'dg!")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = (sprszm)arg0.cfr_renamed_85(0);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprmkm.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpqm(sprmkm[] sprmkmArray) {
        void arg0;
        sprpqm sprpqm2 = this;
        sprpqm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public sprmkm[] cfr_renamed_4672() {
        int n;
        sprmkm[] sprmkmArray = new sprmkm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprmkmArray.length) {
            int n3 = n++;
            sprmkmArray[n3] = sprmkm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprmkmArray;
    }
}

