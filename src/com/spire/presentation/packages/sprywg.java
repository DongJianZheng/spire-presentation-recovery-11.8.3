/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrah;
import com.spire.presentation.packages.sprrvg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxmh;

public class sprywg
extends sprqqe {
    private final sprxmh cfr_renamed_3;
    private final sprrah cfr_renamed_4;

    public static sprywg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprywg) {
            return (sprywg)arg0;
        }
        if (arg0 != null) {
            return new sprywg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprywg(sprrah sprrah2, sprxmh sprxmh2) {
        void arg0;
        sprywg sprywg2 = this;
        sprywg2.cfr_renamed_4 = arg0;
        sprywg2.cfr_renamed_3 = sprxmh2;
    }

    public sprrah cfr_renamed_8371() {
        return this.cfr_renamed_4;
    }

    public static sprrvg cfr_renamed_7843() {
        return new sprrvg();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprywg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprlhca.cfr_renamed_9(":\u001a/\u0007<\u0016:\u0006\u007f\u0011:\u0013*\u00071\u0001:B,\u000b%\u0007\u007f\r9Bm"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprrah.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprxmh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprxmh cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }
}

