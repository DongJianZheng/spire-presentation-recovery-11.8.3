/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgih;
import com.spire.presentation.packages.sprihh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprulh;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprxgf;

public class sprfeh
extends sprqqe {
    private final sprgih cfr_renamed_1;
    private final spranh cfr_renamed_2;
    private final sprulh cfr_renamed_3;
    private final sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfeh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("|liqz`|p9g|elqww|4j}cq9{\u007f4-"));
        }
        void v0 = arg0;
        sprfeh sprfeh2 = this;
        sprfeh2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprfeh2.cfr_renamed_3 = sprulh.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_1 = sprgih.cfr_renamed_23(v0.cfr_renamed_85(2));
        this.cfr_renamed_2 = spranh.cfr_renamed_23(v0.cfr_renamed_85(3));
    }

    public sprulh cfr_renamed_8439() {
        return this.cfr_renamed_3;
    }

    public spranh cfr_renamed_8441() {
        return this.cfr_renamed_2;
    }

    public static sprfeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfeh) {
            return (sprfeh)arg0;
        }
        if (arg0 != null) {
            return new sprfeh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprfeh(sproug sproug2, sprulh sprulh2, sprgih sprgih2, spranh spranh2) {
        void arg2;
        void arg1;
        void arg0;
        sprfeh sprfeh2 = this;
        sprfeh sprfeh3 = this;
        sprfeh3.cfr_renamed_4 = arg0;
        sprfeh3.cfr_renamed_3 = arg1;
        sprfeh2.cfr_renamed_1 = arg2;
        sprfeh2.cfr_renamed_2 = spranh2;
    }

    public static sprihh cfr_renamed_7843() {
        return new sprihh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        sprcoArray[2] = this.cfr_renamed_1;
        sprcoArray[3] = this.cfr_renamed_2;
        return new sprcen(sprcoArray);
    }

    public sprgih cfr_renamed_7458() {
        return this.cfr_renamed_1;
    }

    public sproug cfr_renamed_8447() {
        return this.cfr_renamed_4;
    }
}

