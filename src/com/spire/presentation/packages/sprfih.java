/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sproeh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryhh;

public class sprfih
extends sprqqe {
    private final sproeh cfr_renamed_3;
    private final sprbkh cfr_renamed_4;

    public sprbkh cfr_renamed_8323() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9("\u00063\u0013.\u0000?\u0006/C8\u0006:\u0016.\r(\u0006k\u0010\"\u0019.C$\u0005kQ"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sproeh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprbkh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static spryhh cfr_renamed_7843() {
        return new spryhh();
    }

    public static sprfih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfih) {
            return (sprfih)arg0;
        }
        if (arg0 != null) {
            return new sprfih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproeh cfr_renamed_3996() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprfih(sproeh sproeh2, sprbkh sprbkh2) {
        void arg0;
        sprfih sprfih2 = this;
        sprfih2.cfr_renamed_3 = arg0;
        sprfih2.cfr_renamed_4 = sprbkh2;
    }
}

