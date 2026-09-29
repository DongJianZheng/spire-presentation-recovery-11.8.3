/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzyaa;

public class sprafg
extends sprqqe {
    private sprktm cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprafg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzyaa.cfr_renamed_9("\tA\u0000MZG\u001c\b\tM\u000b\bG\b")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sproug.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_186();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public sprafg(byte[] byArray) {
        sprafg sprafg2 = this;
        this.cfr_renamed_3 = new sprktm(0L);
        this.cfr_renamed_4 = byArray;
    }

    public static sprafg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprafg) {
            return (sprafg)arg0;
        }
        if (arg0 != null) {
            return new sprafg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_1157() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

