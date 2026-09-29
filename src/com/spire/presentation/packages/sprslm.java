/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraum;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprslm
extends sprqqe {
    private sprszm cfr_renamed_4;

    public static sprslm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprslm) {
            return (sprslm)arg0;
        }
        if (arg0 != null) {
            return new sprslm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spraum[] cfr_renamed_4145() {
        int n;
        spraum[] spraumArray = new spraum[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < spraumArray.length) {
            int n3 = n++;
            spraumArray[n3] = spraum.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return spraumArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprslm(spraum[] spraumArray) {
        void arg0;
        sprslm sprslm2 = this;
        sprslm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    private /* synthetic */ sprslm(sprszm sprszm2) {
        Enumeration enumeration;
        this.cfr_renamed_4 = (sprszm)sprszm2.cfr_renamed_85(0);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spraum.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }
}

