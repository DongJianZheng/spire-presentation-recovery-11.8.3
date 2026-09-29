/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.spridfa;
import com.spire.presentation.packages.sprllh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprfkh
extends sprqqe {
    private final sprdlh cfr_renamed_3;
    private final sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfkh(sprdlh sprdlh2, sproug sproug2) {
        void arg0;
        sprfkh sprfkh2 = this;
        sprfkh2.cfr_renamed_3 = arg0;
        sprfkh2.cfr_renamed_4 = sproug2;
    }

    public sprdlh cfr_renamed_8389() {
        return this.cfr_renamed_3;
    }

    public sproug cfr_renamed_8390() {
        return this.cfr_renamed_4;
    }

    public static sprllh cfr_renamed_7843() {
        return new sprllh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprfkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfkh) {
            return (sprfkh)arg0;
        }
        if (arg0 != null) {
            return new sprfkh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfkh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spridfa.cfr_renamed_9("r\u000fg\u0012t\u0003r\u00137\u0004r\u0006b\u0012y\u0014rWd\u001em\u00127\u0018qW%"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprdlh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sproug.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

