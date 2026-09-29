/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafja;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprztm
extends sprqqe {
    private final int cfr_renamed_1;
    private static final byte[] cfr_renamed_2 = new byte[0];
    private final byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 256;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprztm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(sprafja.cfr_renamed_9("\u0013\u0019\u0011\t\u0005\u0012\u0003\u0019@\u000f\t\u0006\u0005\\\u0007\u000e\u0005\u001d\u0014\u0019\u0012\\\u0014\u0014\u0001\u0012@N"));
        }
        if (arg0.cfr_renamed_84() == 2) {
            sprztm sprztm2 = this;
            sprztm2.cfr_renamed_1 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_5023();
            sprztm2.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186());
            return;
        }
        if (arg0.cfr_renamed_84() == 1) {
            if (arg0.cfr_renamed_85(0) instanceof sprktm) {
                sprztm sprztm3 = this;
                sprztm3.cfr_renamed_1 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_5023();
                sprztm3.cfr_renamed_3 = cfr_renamed_2;
                return;
            }
            this.cfr_renamed_1 = 256;
            this.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_186());
            return;
        }
        sprztm sprztm4 = this;
        sprztm4.cfr_renamed_1 = 256;
        sprztm4.cfr_renamed_3 = cfr_renamed_2;
    }

    public sprztm(int n) {
        this.cfr_renamed_1 = n;
        this.cfr_renamed_3 = cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        if (this.cfr_renamed_1 != 256) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        }
        if (this.cfr_renamed_3.length != 0) {
            sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_11206()));
        }
        return new sprcen(sprrvm2);
    }

    public int cfr_renamed_11207() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprztm(int n, byte[] byArray) {
        void arg0;
        sprztm sprztm2 = this;
        sprztm2.cfr_renamed_1 = arg0;
        sprztm2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_11206() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprztm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprztm) {
            return (sprztm)arg0;
        }
        if (arg0 != null) {
            return new sprztm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

