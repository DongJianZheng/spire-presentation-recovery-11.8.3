/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdhh;
import com.spire.presentation.packages.sprhfh;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjh;

public class sprmgh
extends sprqqe {
    private final sprhfh cfr_renamed_1;
    public static final sprhfh cfr_renamed_2 = new sprhfh(1L);
    public static final sprhfh cfr_renamed_3 = new sprhfh(2L);
    private final sprco cfr_renamed_4;

    public sprco cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmgh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprpgm.cfr_renamed_9("RSGNT_RO\u0017XRZBNYHR\u000bDBMN\u0017DQ\u000b\u0005"));
        }
        this.cfr_renamed_1 = sprhfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (this.cfr_renamed_1.equals(cfr_renamed_2)) {
            this.cfr_renamed_4 = sprdhh.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        if (this.cfr_renamed_1.equals(cfr_renamed_3)) {
            this.cfr_renamed_4 = sprxjh.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        throw new IllegalArgumentException(sprnnp.cfr_renamed_9("7,~&1<~y~`\u001b<-!\n;oxlqjy\u001d:2\u001a;9+--<wh1:~z~`\u001b<-!\n;oxlqjy\u001a-2<?\u000b*$\f-/=;;*a"));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_1;
        sprcoArray[1] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public static sprmgh cfr_renamed_8426(sprxjh arg0) {
        return new sprmgh(cfr_renamed_3, arg0);
    }

    public sprmgh(sprhfh arg0, sprco arg1) {
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_1.cfr_renamed_8425().intValue() != 1 && arg0.cfr_renamed_8425().intValue() != 2) {
            throw new IllegalArgumentException(sprpgm.cfr_renamed_9("BS\u000bYDC\u000b\u0006\u000b\u001fnCX^\u007fD\u001a\u0007\u0019\u000e\u001f\u0006hEGeNF^RXC\u0002\u0017DE\u000b\u0005\u000b\u001fnCX^\u007fD\u001a\u0007\u0019\u000e\u001f\u0006oRGCJt_[yRZBND_\u001e"));
        }
        this.cfr_renamed_4 = arg1;
    }

    public sprhfh cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    public static sprmgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmgh) {
            return (sprmgh)arg0;
        }
        if (arg0 != null) {
            return new sprmgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprmgh cfr_renamed_8427(sprdhh arg0) {
        return new sprmgh(cfr_renamed_2, arg0);
    }
}

