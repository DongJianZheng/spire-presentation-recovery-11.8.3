/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcvz;
import com.spire.presentation.packages.sprgih;
import com.spire.presentation.packages.sprlkh;
import com.spire.presentation.packages.sprmmh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqfh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprwlh
extends sprqqe {
    private final sprgih cfr_renamed_1;
    private final sprmmh cfr_renamed_2;
    private final sprqfh cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public static sprlkh cfr_renamed_7843() {
        return new sprlkh();
    }

    public sprqfh cfr_renamed_8448() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwlh(sprgih sprgih2, sproug sproug2, sprmmh sprmmh2, sprqfh sprqfh2) {
        void arg2;
        void arg1;
        void arg0;
        sprwlh sprwlh2 = this;
        sprwlh sprwlh3 = this;
        sprwlh3.cfr_renamed_1 = arg0;
        sprwlh3.cfr_renamed_4 = arg1;
        sprwlh2.cfr_renamed_2 = arg2;
        sprwlh2.cfr_renamed_3 = sprqfh2;
    }

    public sprgih cfr_renamed_7458() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_1;
        sprcoArray[1] = this.cfr_renamed_4;
        sprcoArray[2] = this.cfr_renamed_2;
        sprcoArray[3] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public sprmmh cfr_renamed_8449() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwlh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprcvz.cfr_renamed_9(" z5g&v feq s0g+a \"6k?gem#\"q"));
        }
        void v0 = arg0;
        sprwlh sprwlh2 = this;
        sprwlh2.cfr_renamed_1 = sprgih.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprwlh2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprmmh.cfr_renamed_23(v0.cfr_renamed_85(2));
        this.cfr_renamed_3 = sprqfh.cfr_renamed_23(v0.cfr_renamed_85(3));
    }

    public static sprwlh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwlh) {
            return (sprwlh)arg0;
        }
        if (arg0 != null) {
            return new sprwlh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_8450() {
        return this.cfr_renamed_4;
    }
}

