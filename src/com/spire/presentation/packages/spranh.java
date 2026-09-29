/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtg;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprfug;
import com.spire.presentation.packages.sprpdh;
import com.spire.presentation.packages.sprqbg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwgh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzch;

public class spranh
extends sprqqe {
    private final sprpdh cfr_renamed_91;
    private final sprfug cfr_renamed_0;
    private final sprwgh cfr_renamed_1;
    private final sprzch cfr_renamed_2;
    private final sprbtg cfr_renamed_3;
    private final sprszg cfr_renamed_4;

    public sprwgh cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    public sprpdh cfr_renamed_8246() {
        return this.cfr_renamed_91;
    }

    public sprszg cfr_renamed_8258() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spranh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 6) {
            throw new IllegalArgumentException(sprqbg.cfr_renamed_9("mHxUkDmT(CmA}UfSm\u0010{YrU(_n\u0010>"));
        }
        this.cfr_renamed_1 = sprenh.cfr_renamed_8135(sprwgh.class, arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprenh.cfr_renamed_8135(sprszg.class, arg0.cfr_renamed_85(1));
        this.cfr_renamed_91 = sprenh.cfr_renamed_8135(sprpdh.class, arg0.cfr_renamed_85(2));
        this.cfr_renamed_0 = sprenh.cfr_renamed_8135(sprfug.class, arg0.cfr_renamed_85(3));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprbtg.class, arg0.cfr_renamed_85(4));
        this.cfr_renamed_2 = sprenh.cfr_renamed_8135(sprzch.class, arg0.cfr_renamed_85(5));
    }

    public sprzch cfr_renamed_8248() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public spranh(sprwgh sprwgh2, sprszg sprszg2, sprpdh sprpdh2, sprfug sprfug2, sprbtg sprbtg2, sprzch sprzch2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spranh spranh2 = this;
        spranh spranh3 = this;
        spranh spranh4 = this;
        spranh4.cfr_renamed_1 = arg0;
        spranh4.cfr_renamed_4 = arg1;
        spranh3.cfr_renamed_91 = arg2;
        spranh3.cfr_renamed_0 = arg3;
        spranh2.cfr_renamed_3 = arg4;
        spranh2.cfr_renamed_2 = sprzch2;
    }

    public static spranh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spranh) {
            return (spranh)arg0;
        }
        if (arg0 != null) {
            return new spranh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[6];
        sprcoArray[0] = sprenh.cfr_renamed_23(this.cfr_renamed_1);
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_91);
        sprcoArray[3] = sprenh.cfr_renamed_23(this.cfr_renamed_0);
        sprcoArray[4] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        sprcoArray[5] = sprenh.cfr_renamed_23(this.cfr_renamed_2);
        return new sprcen(sprcoArray);
    }

    public sprbtg cfr_renamed_8239() {
        return this.cfr_renamed_3;
    }

    public sprfug cfr_renamed_8249() {
        return this.cfr_renamed_0;
    }
}

