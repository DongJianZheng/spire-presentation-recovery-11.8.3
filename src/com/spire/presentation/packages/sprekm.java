/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdxba;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprekm
extends sprqqe {
    private final byte[] cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprekm sprekm2 = this;
        sprrvm2.cfr_renamed_5004(sprekm2.cfr_renamed_4);
        if (sprekm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public static sprekm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprekm) {
            return (sprekm)arg0;
        }
        if (arg0 != null) {
            return new sprekm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprekm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 2) {
            sprekm sprekm2 = this;
            sprekm2.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
            sprekm2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186();
            return;
        }
        if (arg0.cfr_renamed_84() == 1) {
            sprekm sprekm3 = this;
            sprekm3.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
            sprekm3.cfr_renamed_3 = null;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdxba.cfr_renamed_9("\u0018^\u0006^\u0002G\u0003\u0010\u001eU\u001cE\b^\u000eUM\\\b^\nD\u0005\nM")).append(arg0.cfr_renamed_84()).toString());
    }

    public sprlem cfr_renamed_2105() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_7453() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public sprekm(sprlem arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprekm(sprlem sprlem2, byte[] byArray) {
        void arg0;
        sprekm sprekm2 = this;
        sprekm2.cfr_renamed_4 = arg0;
        sprekm2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }
}

