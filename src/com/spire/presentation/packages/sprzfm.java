/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnjb;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzna;

public class sprzfm
extends sprqqe {
    public static final int cfr_renamed_119 = 999;
    public sprktm cfr_renamed_91;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 999;
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public sprktm cfr_renamed_666() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzfm(sprszm sprszm2) {
        void arg0;
        int n;
        sprzfm sprzfm2 = this;
        this.cfr_renamed_2 = null;
        sprzfm2.cfr_renamed_3 = null;
        sprzfm2.cfr_renamed_91 = null;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_84()) {
            if (arg0.cfr_renamed_85(n) instanceof sprktm) {
                this.cfr_renamed_2 = (sprktm)arg0.cfr_renamed_85(n);
            } else if (arg0.cfr_renamed_85(n) instanceof sprnvm) {
                sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        while (false) {
                        }
                        this.cfr_renamed_3 = sprktm.cfr_renamed_5085(sprnvm2, false);
                        int n3 = this.cfr_renamed_3.cfr_renamed_5023();
                        if (n3 >= 1 && n3 <= 999) break;
                        throw new IllegalArgumentException(sprnjb.cfr_renamed_9(")3\u0016<\f4\u0004}\r4\f1\t.@;\t8\f9@g@3\u000f)@4\u000e}HlNsYdYt"));
                    }
                    case 1: {
                        this.cfr_renamed_91 = sprktm.cfr_renamed_5085(sprnvm2, false);
                        int n4 = this.cfr_renamed_91.cfr_renamed_5023();
                        if (n4 >= 1 && n4 <= 999) break;
                        throw new IllegalArgumentException(sprzna.cfr_renamed_9("Bg}hg`o)f`h{dz+oblgm+3+gd}+`e)#8%'202 "));
                    }
                    default: {
                        throw new IllegalArgumentException(sprnjb.cfr_renamed_9(")3\u0016<\f4\u0004}\u0014<\u0007}\u000e(\r?\u0005/"));
                    }
                }
            }
            n2 = ++n;
        }
    }

    public sprktm cfr_renamed_668() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_91));
        }
        return new sprcen(sprrvm2);
    }

    public static sprzfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzfm) {
            return (sprzfm)arg0;
        }
        if (arg0 != null) {
            return new sprzfm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzfm() {
    }

    /*
     * WARNING - void declaration
     */
    public sprzfm(sprktm sprktm2, sprktm sprktm3, sprktm sprktm4) {
        void arg0;
        void arg2;
        int n;
        void arg1;
        if (null != arg1 && ((n = arg1.cfr_renamed_5023()) < 1 || n > 999)) {
            throw new IllegalArgumentException(sprzna.cfr_renamed_9("Bg}hg`o)f`gebz+oblgm+3+gd}+`e)#8%'202 "));
        }
        if (null != arg2 && ((n = arg2.cfr_renamed_5023()) < 1 || n > 999)) {
            throw new IllegalArgumentException(sprnjb.cfr_renamed_9(")3\u0016<\f4\u0004}\r4\u0003/\u000f.@;\t8\f9@g@3\u000f)@4\u000e}HlNsYdYt"));
        }
        sprzfm sprzfm2 = this;
        sprzfm2.cfr_renamed_2 = arg0;
        sprzfm2.cfr_renamed_3 = arg1;
        this.cfr_renamed_91 = arg2;
    }

    public sprktm cfr_renamed_670() {
        return this.cfr_renamed_3;
    }
}

