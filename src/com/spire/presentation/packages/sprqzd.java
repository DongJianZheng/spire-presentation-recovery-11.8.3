/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprqzd
extends sprkra
implements sprs,
sprm {
    public spruzd cfr_renamed_102;
    public sprdce cfr_renamed_93;
    public sprbne cfr_renamed_86;
    public spruzd cfr_renamed_152;
    public sprooe cfr_renamed_112;
    public sprije cfr_renamed_119;
    public sprmra cfr_renamed_91;
    public spruhe cfr_renamed_0;
    public sprude cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public spruhe cfr_renamed_3;
    public sprmra cfr_renamed_4;

    public sprije cfr_renamed_79() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_112.cfr_renamed_97().intValue() + 1;
    }

    public static sprqzd cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprqzd.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprooe cfr_renamed_569() {
        return this.cfr_renamed_112;
    }

    public sprude cfr_renamed_98() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprqzd(sprbne arg0) {
        int n;
        sprqzd sprqzd2;
        int n2 = 0;
        this.cfr_renamed_86 = arg0;
        if (this.cfr_renamed_86.cfr_renamed_85(0) instanceof sprhse) {
            this.cfr_renamed_112 = sprooe.cfr_renamed_341((spryte)arg0.cfr_renamed_85(0), true);
            sprqzd2 = this;
        } else {
            n2 = -1;
            sprqzd2 = this;
            this.cfr_renamed_112 = new sprooe(0L);
        }
        sprqzd2.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 1));
        sprbne sprbne2 = arg0;
        int n3 = n2;
        this.cfr_renamed_119 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(n3 + 2));
        this.cfr_renamed_3 = spruhe.cfr_renamed_23(sprbne2.cfr_renamed_85(n3 + 3));
        sprbne sprbne3 = (sprbne)sprbne2.cfr_renamed_85(n2 + 4);
        sprbne sprbne4 = arg0;
        int n4 = n2;
        sprqzd sprqzd3 = this;
        sprqzd3.cfr_renamed_102 = spruzd.cfr_renamed_23(sprbne3.cfr_renamed_85(0));
        sprqzd3.cfr_renamed_152 = spruzd.cfr_renamed_23(sprbne3.cfr_renamed_85(1));
        this.cfr_renamed_0 = spruhe.cfr_renamed_23(arg0.cfr_renamed_85(n4 + 5));
        this.cfr_renamed_93 = sprdce.cfr_renamed_23(sprbne4.cfr_renamed_85(n4 + 6));
        int n5 = n = sprbne4.cfr_renamed_84() - (n2 + 6) - 1;
        while (n5 > 0) {
            sprhse sprhse2 = (sprhse)arg0.cfr_renamed_85(n2 + 6 + n);
            switch (sprhse2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4 = sprmra.cfr_renamed_341(sprhse2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_91 = sprmra.cfr_renamed_341(sprhse2, false);
                    break;
                }
                case 3: {
                    this.cfr_renamed_1 = sprude.cfr_renamed_23(sprhse2);
                    break;
                }
            }
            n5 = --n;
        }
        return;
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_93;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_86;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public spruhe cfr_renamed_1485() {
        return this.cfr_renamed_0;
    }

    public sprmra cfr_renamed_2156() {
        return this.cfr_renamed_91;
    }

    public sprmra cfr_renamed_2153() {
        return this.cfr_renamed_4;
    }

    public spruzd cfr_renamed_2148() {
        return this.cfr_renamed_102;
    }

    public spruzd cfr_renamed_2146() {
        return this.cfr_renamed_152;
    }

    public static sprqzd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqzd) {
            return (sprqzd)arg0;
        }
        if (arg0 != null) {
            return new sprqzd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

