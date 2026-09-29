/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprgkh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryfh;
import com.spire.presentation.packages.sprzos;

public class sprufh
extends sprqqe {
    private final sprvch cfr_renamed_2;
    private final spryfh cfr_renamed_3;
    private final spryfh cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_2;
        sprcoArray[1] = this.cfr_renamed_3;
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        return new sprcen(sprcoArray);
    }

    public spryfh cfr_renamed_8452() {
        return this.cfr_renamed_3;
    }

    public static sprgkh cfr_renamed_7843() {
        return new sprgkh();
    }

    public static sprufh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprufh) {
            return (sprufh)arg0;
        }
        if (arg0 != null) {
            return new sprufh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprufh(sprvch sprvch2, spryfh spryfh2, spryfh spryfh3) {
        void arg1;
        void arg0;
        sprufh sprufh2 = this;
        this.cfr_renamed_2 = arg0;
        sprufh2.cfr_renamed_3 = arg1;
        sprufh2.cfr_renamed_4 = spryfh3;
    }

    public sprvch cfr_renamed_8453() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprufh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprzos.cfr_renamed_9("\u000f1\u001a,\t=\u000f-J:\u000f8\u001f,\u0004*\u000fi\u0019 \u0010,J&\fiY"));
        }
        sprufh sprufh2 = this;
        sprufh2.cfr_renamed_2 = sprvch.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprufh2.cfr_renamed_3 = spryfh.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprenh.cfr_renamed_8135(spryfh.class, arg0.cfr_renamed_85(2));
    }

    public spryfh cfr_renamed_8454() {
        return this.cfr_renamed_4;
    }
}

