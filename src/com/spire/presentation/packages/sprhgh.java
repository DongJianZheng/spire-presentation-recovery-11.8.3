/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkh;
import com.spire.presentation.packages.sprclh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spreqea;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprplh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprhgh
extends sprqqe {
    private final sprbkh cfr_renamed_3;
    private final sprjfh cfr_renamed_4;

    public sprplh cfr_renamed_7267() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhgh(sprjfh sprjfh2, sprbkh sprbkh2) {
        void arg0;
        sprhgh sprhgh2 = this;
        sprhgh2.cfr_renamed_4 = arg0;
        sprhgh2.cfr_renamed_3 = sprbkh2;
    }

    public static sprclh cfr_renamed_7843() {
        return new sprclh();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhgh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spreqea.cfr_renamed_9("HS]NN_HO\rXHZXNCHH\u000b^BWN\rDK\u000b\u001f"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprjfh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprbkh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprbkh cfr_renamed_8259() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprhgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhgh) {
            return (sprhgh)arg0;
        }
        if (arg0 != null) {
            return new sprhgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

