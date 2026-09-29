/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrhg;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprtpg
extends sprqqe {
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private sprrhg cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprrhg cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprrhg(this.cfr_renamed_3.cfr_renamed_1153()));
        }
        return new sprcen(sprrvm2);
    }

    public sprtpg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprtpg(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, sprrhg sprrhg2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprtpg sprtpg2 = this;
        sprtpg sprtpg3 = this;
        this.cfr_renamed_2 = arg0;
        sprtpg3.cfr_renamed_0 = arg1;
        sprtpg3.cfr_renamed_1 = arg2;
        sprtpg2.cfr_renamed_4 = arg3;
        sprtpg2.cfr_renamed_3 = sprrhg2;
    }

    public byte[] cfr_renamed_5975() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    public byte[] cfr_renamed_1145() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public byte[] cfr_renamed_5958() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public static sprtpg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtpg) {
            return (sprtpg)arg0;
        }
        if (arg0 != null) {
            return new sprtpg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtpg(sprszm sprszm2) {
        void arg0;
        sprtpg sprtpg2 = this;
        sprtpg2.cfr_renamed_2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        if (sprtpg2.cfr_renamed_2 != 0) {
            throw new IllegalArgumentException(sprfbp.cfr_renamed_9("hqoz~pzqtex{=ixmnvrq"));
        }
        void v1 = arg0;
        this.cfr_renamed_0 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186());
        this.cfr_renamed_1 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(2)).cfr_renamed_186());
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(3)).cfr_renamed_186());
        if (arg0.cfr_renamed_84() == 5) {
            this.cfr_renamed_3 = sprrhg.cfr_renamed_23(arg0.cfr_renamed_85(4));
        }
    }
}

