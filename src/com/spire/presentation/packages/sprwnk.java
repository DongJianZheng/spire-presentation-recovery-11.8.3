/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprqyy;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;

public class sprwnk
implements sprbj {
    private sprzuk cfr_renamed_2;
    private sprnzk cfr_renamed_3;
    private sprzuk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwnk(sprzuk sprzuk2, sprzuk sprzuk3, sprnzk sprnzk2) {
        sprwnk sprwnk2;
        sprnzk arg2;
        void arg0;
        void arg1;
        if (sprzuk2 == null) {
            throw new NullPointerException(sprboj.cfr_renamed_9("y\\k\\cKZZc^k\\ocoQ*KkFdG~\bhM*F\u007fDf"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprqyy.cfr_renamed_9("YuT`Q`NdPUNlJdH`w`E%_dRkSq\u001cgY%RpPi"));
        }
        sprqxk sprqxk2 = arg0.cfr_renamed_284();
        if (!sprqxk2.equals(arg1.cfr_renamed_284())) {
            throw new IllegalArgumentException(sprboj.cfr_renamed_9("{~I~Ai\bkFn\boXbMgMxIf\bzZc^k\\o\baMs[*@k^o\bnAlNoZoF~\bnGgIcF*XkZkEo\\oZy"));
        }
        if (arg2 == null) {
            spreuh spreuh2 = new sprzph().cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), arg1.cfr_renamed_2112());
            arg2 = new sprnzk(spreuh2, sprqxk2);
            sprwnk2 = this;
        } else {
            if (!sprqxk2.equals(arg2.cfr_renamed_284())) {
                throw new IllegalArgumentException(sprqyy.cfr_renamed_9("yuT`Q`NdP%Lp^iUf\u001cnY|\u001cm]v\u001caUcZ`N`Rq\u001caSh]lR%LdNdQ`H`Nv"));
            }
            sprwnk2 = this;
        }
        sprwnk2.cfr_renamed_4 = arg0;
        sprwnk sprwnk3 = this;
        sprwnk3.cfr_renamed_2 = arg1;
        sprwnk3.cfr_renamed_3 = arg2;
    }

    public sprzuk cfr_renamed_2094() {
        return this.cfr_renamed_2;
    }

    public sprwnk(sprzuk arg0, sprzuk arg1) {
        this(arg0, arg1, null);
    }

    public sprnzk cfr_renamed_2096() {
        return this.cfr_renamed_3;
    }

    public sprzuk cfr_renamed_2095() {
        return this.cfr_renamed_4;
    }
}

