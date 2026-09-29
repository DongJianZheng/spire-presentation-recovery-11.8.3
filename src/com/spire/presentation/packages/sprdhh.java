/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprqch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxoa;

public class sprdhh
extends sprqqe {
    private final sprjfh cfr_renamed_3;
    private final sprvrg cfr_renamed_4;

    public sprvrg cfr_renamed_8430() {
        return this.cfr_renamed_4;
    }

    public static sprdhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdhh) {
            return (sprdhh)arg0;
        }
        if (arg0 != null) {
            return new sprdhh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprqch cfr_renamed_7843() {
        return new sprqch();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        return new sprcen(sprcoArray);
    }

    public sprjfh cfr_renamed_8428() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdhh(sprjfh sprjfh2, sprvrg sprvrg2) {
        void arg0;
        sprdhh sprdhh2 = this;
        sprdhh2.cfr_renamed_3 = arg0;
        sprdhh2.cfr_renamed_4 = sprvrg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdhh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprxoa.cfr_renamed_9("T\u0011A\fR\u001dT\r\u0011\u001aT\u0018D\f_\nTIB\u0000K\f\u0011\u0006WI\u0003"));
        }
        this.cfr_renamed_3 = sprjfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprenh.cfr_renamed_8135(sprvrg.class, arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_4 = null;
    }
}

