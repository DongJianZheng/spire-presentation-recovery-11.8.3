/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprang;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprhqg
extends sprqqe {
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprang cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprang cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_5968() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprang(this.cfr_renamed_3.cfr_renamed_5970(), this.cfr_renamed_3.cfr_renamed_5971()));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhqg(int n, byte[] byArray, byte[] byArray2, sprang sprang2) {
        void arg2;
        void arg1;
        void arg0;
        sprhqg sprhqg2 = this;
        sprhqg sprhqg3 = this;
        sprhqg3.cfr_renamed_1 = arg0;
        sprhqg3.cfr_renamed_2 = arg1;
        sprhqg2.cfr_renamed_4 = arg2;
        sprhqg2.cfr_renamed_3 = sprang2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhqg(sprszm sprszm2) {
        void arg0;
        sprhqg sprhqg2 = this;
        sprhqg2.cfr_renamed_1 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        if (sprhqg2.cfr_renamed_1 != 0) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("\u0017,\u0010'\u0001-\u0005,\u000b8\u0007&B4\u00070\u0011+\r,"));
        }
        void v1 = arg0;
        this.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(1)).cfr_renamed_186());
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(2)).cfr_renamed_186());
        if (arg0.cfr_renamed_84() == 4) {
            this.cfr_renamed_3 = sprang.cfr_renamed_23(arg0.cfr_renamed_85(3));
        }
    }

    public static sprhqg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhqg) {
            return (sprhqg)arg0;
        }
        if (arg0 != null) {
            return new sprhqg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_5969() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprhqg(int arg0, byte[] arg1, byte[] arg2) {
        this(arg0, arg1, arg2, null);
    }
}

