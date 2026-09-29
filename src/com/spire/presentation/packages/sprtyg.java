/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprfxg;
import com.spire.presentation.packages.sprgtg;
import com.spire.presentation.packages.sprisg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprtyg
extends sprqqe {
    private final sprisg cfr_renamed_3;
    private final sprfxg cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    public static sprgtg cfr_renamed_7843() {
        return new sprgtg();
    }

    /*
     * WARNING - void declaration
     */
    public sprtyg(sprfxg sprfxg2, sprisg sprisg2) {
        void arg0;
        sprtyg sprtyg2 = this;
        sprtyg2.cfr_renamed_4 = arg0;
        sprtyg2.cfr_renamed_3 = sprisg2;
    }

    public sprfxg cfr_renamed_8305() {
        return this.cfr_renamed_4;
    }

    public sprisg cfr_renamed_8344() {
        return this.cfr_renamed_3;
    }

    public static sprtyg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtyg) {
            return (sprtyg)arg0;
        }
        if (arg0 != null) {
            return new sprtyg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtyg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprbyfa.cfr_renamed_9("75\"(197)r>7<'(<.7m!$((r\"4m`"));
        }
        this.cfr_renamed_4 = sprfxg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprisg.class, arg0.cfr_renamed_85(1));
    }
}

