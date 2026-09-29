/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqjg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtada;
import com.spire.presentation.packages.sprxgf;

public class sprrfg
extends sprqqe {
    private byte[] cfr_renamed_119;
    private sprqjg cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprqjg cfr_renamed_1157() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrfg(sprszm sprszm2) {
        void arg0;
        sprrfg sprrfg2 = this;
        sprrfg2.cfr_renamed_0 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        if (sprrfg2.cfr_renamed_0 != 0) {
            throw new IllegalArgumentException(sprjxq.cfr_renamed_9("\f(\u000b#\u001a)\u001e(\u0010<\u001c\"Y0\u001c4\n/\u0016("));
        }
        void v1 = arg0;
        sprrfg sprrfg3 = this;
        void v3 = arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v3.cfr_renamed_85(1)).cfr_renamed_186());
        sprrfg3.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v3.cfr_renamed_85(2)).cfr_renamed_186());
        sprrfg3.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(3)).cfr_renamed_186());
        this.cfr_renamed_119 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(4)).cfr_renamed_186());
        this.cfr_renamed_1 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(5)).cfr_renamed_186());
        if (arg0.cfr_renamed_84() == 7) {
            this.cfr_renamed_91 = sprqjg.cfr_renamed_23(arg0.cfr_renamed_85(6));
        }
    }

    public byte[] cfr_renamed_5949() {
        return sproze.cfr_renamed_158(this.cfr_renamed_119);
    }

    public byte[] cfr_renamed_5948() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1145() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_3369() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprrfg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5, sprqjg arg6) {
        this.cfr_renamed_0 = arg0;
        if (this.cfr_renamed_0 != 0) {
            throw new IllegalArgumentException(sprtada.cfr_renamed_9("A.F%W/S.]:Q$\u00146Q2G)[."));
        }
        sprrfg sprrfg2 = this;
        sprrfg sprrfg3 = this;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(arg1);
        sprrfg3.cfr_renamed_2 = sproze.cfr_renamed_158(arg2);
        sprrfg3.cfr_renamed_3 = sproze.cfr_renamed_158(arg3);
        sprrfg2.cfr_renamed_119 = sproze.cfr_renamed_158(arg4);
        sprrfg2.cfr_renamed_1 = sproze.cfr_renamed_158(arg5);
        this.cfr_renamed_91 = arg6;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_119));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1));
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprqjg(this.cfr_renamed_91.cfr_renamed_1144()));
        }
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_5950() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public sprrfg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, null);
    }

    public static sprrfg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrfg) {
            return (sprrfg)arg0;
        }
        if (arg0 != null) {
            return new sprrfg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_0;
    }
}

