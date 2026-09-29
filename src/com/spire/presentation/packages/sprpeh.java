/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sproch;
import com.spire.presentation.packages.spromh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtaca;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;

public class sprpeh
extends sprqqe {
    private final sprvch cfr_renamed_2;
    private final sproug cfr_renamed_3;
    private final sproch cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpeh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprtaca.cfr_renamed_9("S?F\"U3S#\u00164S6C\"X$SgE.L\"\u0016(Pg\u0005"));
        }
        sprpeh sprpeh2 = this;
        sprpeh2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprpeh2.cfr_renamed_4 = sproch.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprenh.cfr_renamed_8135(sprvch.class, arg0.cfr_renamed_85(2));
    }

    public sproch cfr_renamed_8446() {
        return this.cfr_renamed_4;
    }

    public static sprpeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpeh) {
            return (sprpeh)arg0;
        }
        if (arg0 != null) {
            return new sprpeh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprpeh(sproug sproug2, sproch sproch2, sprvch sprvch2) {
        void arg1;
        void arg0;
        sprpeh sprpeh2 = this;
        this.cfr_renamed_3 = arg0;
        sprpeh2.cfr_renamed_4 = arg1;
        sprpeh2.cfr_renamed_2 = sprvch2;
    }

    public static spromh cfr_renamed_7843() {
        return new spromh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_2);
        return new sprcen(sprcoArray);
    }

    public sproug cfr_renamed_8445() {
        return this.cfr_renamed_3;
    }

    public sprvch cfr_renamed_2141() {
        return this.cfr_renamed_2;
    }
}

