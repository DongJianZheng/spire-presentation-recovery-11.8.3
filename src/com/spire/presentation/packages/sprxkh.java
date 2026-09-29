/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spremh;
import com.spire.presentation.packages.sprgih;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrfz;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprxkh
extends sprqqe {
    private final spranh cfr_renamed_3;
    private final sprgih cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public static spremh cfr_renamed_7843() {
        return new spremh();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxkh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprrfz.cfr_renamed_9("\u0007@\u0012]\u0001L\u0007\\BK\u0007I\u0017]\f[\u0007\u0018\u0011Q\u0018]BW\u0004\u0018P"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprgih.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = spranh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprxkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxkh) {
            return (sprxkh)arg0;
        }
        if (arg0 != null) {
            return new sprxkh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxkh(sprgih sprgih2, spranh spranh2) {
        void arg0;
        sprxkh sprxkh2 = this;
        sprxkh2.cfr_renamed_4 = arg0;
        sprxkh2.cfr_renamed_3 = spranh2;
    }

    public spranh cfr_renamed_8441() {
        return this.cfr_renamed_3;
    }

    public sprgih cfr_renamed_7458() {
        return this.cfr_renamed_4;
    }
}

