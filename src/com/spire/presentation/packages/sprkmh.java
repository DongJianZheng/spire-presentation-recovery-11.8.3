/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprydh;
import com.spire.presentation.packages.spryfh;

public class sprkmh
extends sprqqe {
    private final sprvch cfr_renamed_2;
    private final sprvch cfr_renamed_3;
    private final spryfh cfr_renamed_4;

    public spryfh cfr_renamed_8435() {
        return this.cfr_renamed_4;
    }

    public static sprydh cfr_renamed_7843() {
        return new sprydh();
    }

    public sprvch cfr_renamed_8436() {
        return this.cfr_renamed_3;
    }

    public static sprkmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkmh) {
            return (sprkmh)arg0;
        }
        if (arg0 != null) {
            return new sprkmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkmh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprrnl.cfr_renamed_9("h*}7n&h6-!h#x7c1hr~;w7-=kr>"));
        }
        this.cfr_renamed_3 = sprvch.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprenh.cfr_renamed_8135(sprvch.class, arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = spryfh.cfr_renamed_23(arg0.cfr_renamed_85(2));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_2);
        sprcoArray[2] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprkmh(sprvch sprvch2, sprvch sprvch3, spryfh spryfh2) {
        void arg1;
        void arg0;
        sprkmh sprkmh2 = this;
        this.cfr_renamed_3 = arg0;
        sprkmh2.cfr_renamed_2 = arg1;
        sprkmh2.cfr_renamed_4 = spryfh2;
    }

    public sprvch cfr_renamed_8437() {
        return this.cfr_renamed_2;
    }
}

