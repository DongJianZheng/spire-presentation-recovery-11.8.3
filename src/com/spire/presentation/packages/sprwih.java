/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryih;

public class sprwih
extends sprqqe {
    private final sprgfh cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public sproug cfr_renamed_8390() {
        return this.cfr_renamed_4;
    }

    public static sprwih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwih) {
            return (sprwih)arg0;
        }
        if (arg0 != null) {
            return new sprwih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgfh cfr_renamed_8389() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static spryih cfr_renamed_7843() {
        return new spryih();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprqap.cfr_renamed_9("kH~UmDkT.CkA{U`Sk\u0010}YtU._h\u0010<"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprgfh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sproug.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    /*
     * WARNING - void declaration
     */
    public sprwih(sprgfh sprgfh2, sproug sproug2) {
        void arg0;
        sprwih sprwih2 = this;
        sprwih2.cfr_renamed_3 = arg0;
        sprwih2.cfr_renamed_4 = sproug2;
    }
}

