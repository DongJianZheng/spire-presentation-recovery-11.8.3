/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfmk;
import com.spire.presentation.packages.sproek;
import com.spire.presentation.packages.sprrfh;
import com.spire.presentation.packages.sprszg;
import com.spire.presentation.packages.spruhh;
import com.spire.presentation.packages.sprvrg;
import java.util.Date;

public class sprnik {
    private final long cfr_renamed_2;
    private final sproek cfr_renamed_3;
    private final sprrfh cfr_renamed_4;

    public static sprfmk cfr_renamed_9539(Date arg0) {
        return new sprfmk(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprnik(sprszg sprszg2) {
        void arg0;
        sprnik sprnik2 = this;
        sprnik2.cfr_renamed_2 = arg0.cfr_renamed_3156().cfr_renamed_97().longValue();
        spruhh spruhh2 = sprszg2.cfr_renamed_8333();
        sprnik2.cfr_renamed_4 = spruhh2.cfr_renamed_8333();
        sprnik2.cfr_renamed_3 = sproek.values()[spruhh2.cfr_renamed_8227()];
    }

    /*
     * WARNING - void declaration
     */
    public sprnik(long l, sprrfh sprrfh2, sproek sproek2) {
        void arg1;
        void arg0;
        sprnik sprnik2 = this;
        this.cfr_renamed_2 = arg0;
        sprnik2.cfr_renamed_4 = arg1;
        sprnik2.cfr_renamed_3 = sproek2;
    }

    public sprszg cfr_renamed_568() {
        return sprszg.cfr_renamed_7843().cfr_renamed_9540(new sprvrg(this.cfr_renamed_2 / 1000L)).cfr_renamed_9541(new spruhh(sproek.cfr_renamed_9542(this.cfr_renamed_3), this.cfr_renamed_4)).cfr_renamed_9543();
    }

    public Date cfr_renamed_2148() {
        return new Date(this.cfr_renamed_2);
    }
}

