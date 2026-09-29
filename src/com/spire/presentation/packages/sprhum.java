/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwmq;
import com.spire.presentation.packages.sprxgf;

public class sprhum
extends sprqqe {
    private sprjhm cfr_renamed_3;
    private sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhum(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwmq.cfr_renamed_9("GSa\u0012vWtG`\\fW%AlH`\b%")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprjhm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhum(byte[] byArray, sprjhm sprjhm2) {
        void arg0;
        sprhum sprhum2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
        this.cfr_renamed_3 = sprjhm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhum(byte[] byArray) {
        void arg0;
        sprhum sprhum2 = this;
        sprhum2.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
    }

    public static sprhum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhum) {
            return (sprhum)arg0;
        }
        if (arg0 != null) {
            return new sprhum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjhm cfr_renamed_630() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprhum sprhum2 = this;
        sprrvm2.cfr_renamed_5004(sprhum2.cfr_renamed_4);
        if (sprhum2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_629() {
        return this.cfr_renamed_4.cfr_renamed_186();
    }
}

