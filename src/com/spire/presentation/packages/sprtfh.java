/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdmh;
import com.spire.presentation.packages.sprkug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryfh;

public class sprtfh
extends sprqqe {
    private final spryfh cfr_renamed_3;
    private final sprkug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtfh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprrxg.cfr_renamed_9("X#M>^/X?\u001d(X*H>S8X{N2G>\u001d4[{\u000f"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = spryfh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprkug.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprkug cfr_renamed_8455() {
        return this.cfr_renamed_4;
    }

    public spryfh cfr_renamed_8433() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public static sprdmh cfr_renamed_7843() {
        return new sprdmh();
    }

    public static sprtfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtfh) {
            return (sprtfh)arg0;
        }
        if (arg0 != null) {
            return new sprtfh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtfh(spryfh spryfh2, sprkug sprkug2) {
        void arg0;
        sprtfh sprtfh2 = this;
        sprtfh2.cfr_renamed_3 = arg0;
        sprtfh2.cfr_renamed_4 = sprkug2;
    }
}

