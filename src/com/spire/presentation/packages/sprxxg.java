/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdvg;
import com.spire.presentation.packages.sprmsg;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryd;

public class sprxxg
extends sprqqe
implements spryd {
    private final sprbvg cfr_renamed_3;
    private final sprdvg cfr_renamed_4;

    public static sprmsg cfr_renamed_7843() {
        return new sprmsg();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxxg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprppy.cfr_renamed_9("`!u<f-`=%*`(p<k:`yv0\u007f<%6cy7"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprbvg.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprdvg.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprxxg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxxg) {
            return (sprxxg)arg0;
        }
        if (arg0 != null) {
            return new sprxxg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbvg cfr_renamed_8246() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprxxg(sprbvg sprbvg2, sprdvg sprdvg2) {
        void arg0;
        sprxxg sprxxg2 = this;
        sprxxg2.cfr_renamed_3 = arg0;
        sprxxg2.cfr_renamed_4 = sprdvg2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public sprdvg cfr_renamed_8364() {
        return this.cfr_renamed_4;
    }
}

