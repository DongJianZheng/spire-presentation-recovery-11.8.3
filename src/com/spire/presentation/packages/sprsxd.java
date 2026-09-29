/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprgse;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkk;
import com.spire.presentation.packages.sprnd;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzod;
import com.spire.presentation.packages.sprzwd;
import java.security.SecureRandom;

public class sprsxd {
    private sprije cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprgse cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprkk cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4334(int arg0) {
        if (this.cfr_renamed_91 > 0 && arg0 > this.cfr_renamed_91) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbrz.cfr_renamed_9("R\u0018^\u001eZ\u0018R\u0003ULX\u0003N\u0002OL^\u0014X\t^\bHLW\u0005V\u0005OL\u0013")).append(arg0).append(sprokp.cfr_renamed_9("}*}")).append(this.cfr_renamed_91).append(")").toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsxd(sprije sprije2, int n, sprije sprije3, sprkk sprkk2) {
        void arg2;
        void arg1;
        void arg0;
        sprsxd sprsxd2 = this;
        sprsxd sprsxd3 = this;
        this.cfr_renamed_0 = 20;
        sprsxd3.cfr_renamed_112 = arg0;
        sprsxd3.cfr_renamed_1 = arg1;
        sprsxd2.cfr_renamed_3 = arg2;
        sprsxd2.cfr_renamed_4 = sprkk2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsxd cfr_renamed_4332(sprgse sprgse2) {
        void arg0;
        sprsxd sprsxd2 = this;
        sprsxd2.cfr_renamed_4334(arg0.cfr_renamed_1478().cfr_renamed_97().intValue());
        sprsxd2.cfr_renamed_2 = sprgse2;
        return sprsxd2;
    }

    private /* synthetic */ sprha cfr_renamed_4335(sprgse arg0, char[] arg1) throws sprzod {
        byte[] byArray = sprywa.cfr_renamed_432(arg1);
        byte[] byArray2 = arg0.cfr_renamed_1477().cfr_renamed_186();
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        sprgse sprgse2 = arg0;
        this.cfr_renamed_4.cfr_renamed_3247(arg0.cfr_renamed_4336(), sprgse2.cfr_renamed_1472());
        int n = sprgse2.cfr_renamed_1478().cfr_renamed_97().intValue();
        do {
            byArray3 = this.cfr_renamed_4.cfr_renamed_3213(byArray3);
        } while (--n > 0);
        byte[] byArray4 = byArray3;
        return new sprzwd(this, arg0, byArray4);
    }

    public sprsxd cfr_renamed_1616(int arg0) {
        if (arg0 < 100) {
            throw new IllegalArgumentException(sprbrz.cfr_renamed_9("\u0005O\tI\rO\u0005T\u0002\u001b\u000fT\u0019U\u0018\u001b\u0001N\u001fOLY\t\u001b\rOLW\tZ\u001fOL\n\\\u000b"));
        }
        this.cfr_renamed_4334(arg0);
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprsxd cfr_renamed_4337(int arg0) {
        if (arg0 < 8) {
            throw new IllegalArgumentException(sprokp.cfr_renamed_9("g<x)41q3s)|}y(g)4?q}u)41q<g)4e4?m)q."));
        }
        this.cfr_renamed_0 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprsxd(sprkk sprkk2, int n) {
        void arg1;
        sprsxd sprsxd2 = this;
        this.cfr_renamed_0 = 20;
        sprsxd2.cfr_renamed_91 = arg1;
        sprsxd2.cfr_renamed_4 = sprkk2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsxd(sprkk sprkk2) {
        this(new sprije(sprdh.cfr_renamed_86), 1000, new sprije(sprnd.cfr_renamed_0, sprume.cfr_renamed_3), (sprkk)arg0);
        void arg0;
    }

    public sprha cfr_renamed_1480(char[] arg0) throws sprzod {
        if (this.cfr_renamed_2 != null) {
            sprsxd sprsxd2 = this;
            return sprsxd2.cfr_renamed_4335(sprsxd2.cfr_renamed_2, arg0);
        }
        sprsxd sprsxd3 = this;
        byte[] byArray = new byte[sprsxd3.cfr_renamed_0];
        if (sprsxd3.cfr_renamed_119 == null) {
            sprsxd sprsxd4 = this;
            sprsxd4.cfr_renamed_119 = new SecureRandom();
        }
        sprsxd sprsxd5 = this;
        sprsxd5.cfr_renamed_119.nextBytes(byArray);
        sprsxd sprsxd6 = this;
        return sprsxd5.cfr_renamed_4335(new sprgse(byArray, sprsxd6.cfr_renamed_112, sprsxd6.cfr_renamed_1, this.cfr_renamed_3), arg0);
    }

    public static /* synthetic */ sprkk cfr_renamed_4338(sprsxd arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprsxd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }
}

