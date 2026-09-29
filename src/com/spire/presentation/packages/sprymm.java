/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcqy;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprymm
extends sprqqe {
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public sprymm(byte[] arg0, byte[] arg1) {
        this(arg0, null, arg1);
    }

    public byte[] cfr_renamed_11312() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprymm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprymm) {
            return (sprymm)arg0;
        }
        if (arg0 != null) {
            return new sprymm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprymm(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        void arg1;
        void arg0;
        sprymm sprymm2 = this;
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprymm2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg1);
        sprymm2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray3);
    }

    public byte[] cfr_renamed_4010() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_10712() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprfvg(this.cfr_renamed_4)));
        }
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprymm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 2) {
            sprymm sprymm2 = this;
            void v1 = arg0;
            this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(0)).cfr_renamed_186());
            sprymm2.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(1)).cfr_renamed_186());
            sprymm2.cfr_renamed_3 = null;
            return;
        }
        if (arg0.cfr_renamed_84() == 3) {
            sprymm sprymm3 = this;
            void v3 = arg0;
            this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v3.cfr_renamed_85(0)).cfr_renamed_186());
            sprymm3.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_5085(sprnvm.cfr_renamed_23(v3.cfr_renamed_85(1)), false).cfr_renamed_186());
            sprymm3.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_186());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcqy.cfr_renamed_9("\u000e\n\u0010\n\u0014\u0013\u0015D\b\u0001\n\u0011\u001e\n\u0018\u0001[\b\u001e\n\u001c\u0010\u0013^[")).append(arg0.cfr_renamed_84()).toString());
    }
}

