/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprlqo;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprhun
extends sprcrn {
    private sproxn cfr_renamed_4;

    public void cfr_renamed_14893() {
        int n;
        int n2;
        int n3;
        sprdsp sprdsp2 = this.cfr_renamed_4.cfr_renamed_13484();
        sprdsp sprdsp3 = new sprdsp(sprdsp2.cfr_renamed_11861());
        int n4 = n3 = 0;
        while (n4 < sprdsp2.cfr_renamed_11861()) {
            n2 = (Integer)sprdsp2.cfr_renamed_13485(n3);
            sprdsp3.cfr_renamed_12962(n2, 0);
            n4 = ++n3;
        }
        sprdsp sprdsp4 = sprdsp3;
        n3 = sprdsp4.cfr_renamed_7861(sprdsp4.cfr_renamed_11861() - 1);
        n2 = spryxp.cfr_renamed_14894(n3 + 1, 8);
        byte[] byArray = new byte[n2];
        sprlqo sprlqo2 = new sprlqo(byArray);
        int n5 = n = 0;
        while (n5 <= n3) {
            if (sprdsp3.cfr_renamed_14000(n)) {
                sprlqo2.cfr_renamed_14895();
            }
            sprlqo2.cfr_renamed_14896();
            n5 = ++n;
        }
        sprlqo2.cfr_renamed_2947();
        super.cfr_renamed_4923(byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprhun(sprgdo sprgdo2, sproxn sproxn2) {
        super((sprgdo)arg0);
        void arg0;
        this.cfr_renamed_4 = sproxn2;
    }
}

