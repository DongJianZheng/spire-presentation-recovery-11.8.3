/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprmfh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprujaa;
import com.spire.presentation.packages.sprulh;
import com.spire.presentation.packages.sprxgf;

public class sprmmh
extends sprqqe {
    private final spranh cfr_renamed_1;
    private final sproug cfr_renamed_2;
    private final sprjfh cfr_renamed_3;
    private final sprulh cfr_renamed_4;

    public sprjfh cfr_renamed_8438() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmmh(sprjfh sprjfh2, sproug sproug2, sprulh sprulh2, spranh spranh2) {
        void arg2;
        void arg1;
        void arg0;
        sprmmh sprmmh2 = this;
        sprmmh sprmmh3 = this;
        sprmmh3.cfr_renamed_3 = arg0;
        sprmmh3.cfr_renamed_2 = arg1;
        sprmmh2.cfr_renamed_4 = arg2;
        sprmmh2.cfr_renamed_1 = spranh2;
    }

    public sprulh cfr_renamed_8439() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_8440() {
        return this.cfr_renamed_2;
    }

    public static sprmfh cfr_renamed_7843() {
        return new sprmfh();
    }

    public static sprmmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmmh) {
            return (sprmmh)arg0;
        }
        if (arg0 != null) {
            return new sprmmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmmh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprujaa.cfr_renamed_9("\u000e2\u001b/\b>\u000e.K9\u000e;\u001e/\u0005)\u000ej\u0018#\u0011/K%\rj_"));
        }
        void v0 = arg0;
        sprmmh sprmmh2 = this;
        sprmmh2.cfr_renamed_3 = sprjfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprmmh2.cfr_renamed_2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprulh.cfr_renamed_23(v0.cfr_renamed_85(2));
        this.cfr_renamed_1 = spranh.cfr_renamed_23(v0.cfr_renamed_85(3));
    }

    public spranh cfr_renamed_8441() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = this.cfr_renamed_4;
        sprcoArray[3] = this.cfr_renamed_1;
        return new sprcen(sprcoArray);
    }
}

