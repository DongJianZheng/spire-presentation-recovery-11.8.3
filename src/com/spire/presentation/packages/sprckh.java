/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprnyn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrlh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtdh;
import com.spire.presentation.packages.sprxgf;

public class sprckh
extends sprqqe {
    private final sprtdh cfr_renamed_2;
    private final sproug cfr_renamed_3;
    private final spranh cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprckh(sproug sproug2, sprtdh sprtdh2, spranh spranh2) {
        void arg1;
        void arg0;
        sprckh sprckh2 = this;
        this.cfr_renamed_3 = arg0;
        sprckh2.cfr_renamed_2 = arg1;
        sprckh2.cfr_renamed_4 = spranh2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        return new sprcen(sprcoArray);
    }

    public spranh cfr_renamed_8471() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_8445() {
        return this.cfr_renamed_3;
    }

    public static sprrlh cfr_renamed_7843() {
        return new sprrlh();
    }

    public static sprckh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprckh) {
            return (sprckh)arg0;
        }
        if (arg0 != null) {
            return new sprckh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtdh cfr_renamed_8446() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprckh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprnyn.cfr_renamed_9("i\u0016|\u000bo\u001ai\n,\u001di\u001fy\u000bb\riN\u007f\u0007v\u000b,\u0001jN?"));
        }
        sprckh sprckh2 = this;
        sprckh2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprckh2.cfr_renamed_2 = sprtdh.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprenh.cfr_renamed_8135(spranh.class, arg0.cfr_renamed_85(2));
    }
}

