/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spripg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprngg
extends sprqqe {
    private byte[] cfr_renamed_0;
    private spripg cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprngg(sprszm sprszm2) {
        void arg0;
        sprngg sprngg2 = this;
        sprngg2.cfr_renamed_3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        if (sprngg2.cfr_renamed_3 != 0) {
            throw new IllegalArgumentException(sprqed.cfr_renamed_9("\u001fA\u0018J\t@\rA\u0003U\u000fKJY\u000f]\u0019F\u0005A"));
        }
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186());
        int n = 1;
        if (arg0.cfr_renamed_84() == 5) {
            n = 0;
            this.cfr_renamed_1 = spripg.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
        void v1 = arg0;
        this.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(3 - n)).cfr_renamed_186());
        this.cfr_renamed_0 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(4 - n)).cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprngg(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, spripg spripg2) {
        void arg2;
        void arg4;
        void arg1;
        void arg0;
        sprngg sprngg2 = this;
        sprngg sprngg3 = this;
        this.cfr_renamed_3 = arg0;
        sprngg3.cfr_renamed_4 = arg1;
        sprngg3.cfr_renamed_1 = arg4;
        sprngg2.cfr_renamed_2 = arg2;
        sprngg2.cfr_renamed_0 = byArray3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new spripg(this.cfr_renamed_1.cfr_renamed_1144(), this.cfr_renamed_1.cfr_renamed_5955()));
        }
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0));
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_5950() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public spripg cfr_renamed_1157() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_5972() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    public static sprngg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprngg) {
            return (sprngg)arg0;
        }
        if (arg0 != null) {
            return new sprngg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprngg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3;
    }
}

