/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkg;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmuda;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprokg
extends sprqqe {
    private byte[] cfr_renamed_0;
    private sprbkg cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        return new sprcen(sprrvm2);
    }

    public static sprokg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprokg) {
            return (sprokg)arg0;
        }
        if (arg0 != null) {
            return new sprokg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_3383() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_5950() {
        return this.cfr_renamed_4;
    }

    public sprbkg cfr_renamed_1157() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public sprokg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2 != 0) {
            throw new IllegalArgumentException(sprdsh.cfr_renamed_9("4M3F\"L&M(Y$GaU$Q2J.M"));
        }
        sprokg sprokg2 = this;
        sprokg2.cfr_renamed_0 = arg1;
        sprokg2.cfr_renamed_4 = arg2;
        this.cfr_renamed_3 = arg3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprokg(sprszm sprszm2) {
        void arg0;
        sprokg sprokg2 = this;
        sprokg2.cfr_renamed_2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        if (sprokg2.cfr_renamed_2 != 0) {
            throw new IllegalArgumentException(sprmuda.cfr_renamed_9("\u0004I\u0003B\u0012H\u0016I\u0018]\u0014CQQ\u0014U\u0002N\u001eI"));
        }
        void v1 = arg0;
        sprokg sprokg3 = this;
        sprokg3.cfr_renamed_0 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186());
        sprokg3.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_186());
        this.cfr_renamed_1 = sprbkg.cfr_renamed_23(v1.cfr_renamed_85(3));
        this.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v1.cfr_renamed_85(4)).cfr_renamed_186());
    }

    public byte[] cfr_renamed_5972() {
        return this.cfr_renamed_3;
    }

    public sprokg(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, sprbkg arg4) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2 != 0) {
            throw new IllegalArgumentException(sprdsh.cfr_renamed_9("4M3F\"L&M(Y$GaU$Q2J.M"));
        }
        sprokg sprokg2 = this;
        this.cfr_renamed_0 = arg1;
        sprokg2.cfr_renamed_4 = arg2;
        sprokg2.cfr_renamed_3 = arg3;
        this.cfr_renamed_1 = arg4;
    }
}

