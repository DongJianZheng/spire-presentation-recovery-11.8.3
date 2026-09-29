/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxrc;

public class sprksm
extends sprqqe {
    private final sprdsm cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public byte[] cfr_renamed_4669() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    public sprksm(byte[] arg0) {
        this(null, arg0);
    }

    public sprdsm cfr_renamed_11317() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprksm(sprdsm sprdsm2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_3 = sprdsm2;
        sprksm sprksm2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }

    public static sprksm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprksm) {
            return (sprksm)arg0;
        }
        if (arg0 != null) {
            return new sprksm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprksm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 1) {
            sprksm sprksm2 = this;
            sprksm2.cfr_renamed_3 = null;
            sprksm2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
            return;
        }
        if (arg0.cfr_renamed_84() == 2) {
            sprksm sprksm3 = this;
            sprksm3.cfr_renamed_3 = sprdsm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            sprksm3.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        throw new IllegalArgumentException(sprxrc.cfr_renamed_9("GZEJQQWZ\u0014HFPZX\u0014SQQSK\\\u001fRPF\u001fpWgVSl@^@VW"));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

