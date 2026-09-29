/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcap;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprkr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzo;
import com.spire.presentation.packages.sprvuo;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryoo;

@sprtea
public class sprofo
extends spryoo {
    private static /* synthetic */ sprcap cfr_renamed_16766(sprcap arg0, String arg1) {
        return new sprtzo(arg0.cfr_renamed_16532(), arg0.cfr_renamed_13257(), arg1, arg0.cfr_renamed_16767());
    }

    @Override
    public boolean cfr_renamed_16768() {
        sprofo sprofo2 = this;
        sprkr sprkr2 = (sprkr)sprofo2.cfr_renamed_3.get(sprofo2.cfr_renamed_4);
        if (sprkr2.cfr_renamed_324() == 2) {
            sprofo sprofo3 = this;
            sprofo3.cfr_renamed_91 += sprkr2.cfr_renamed_16769();
            ++sprofo3.cfr_renamed_4;
            return 1 != 0;
        }
        if (sprkr2.cfr_renamed_16769() > this.cfr_renamed_0) {
            sprofo sprofo4 = this;
            sprofo4.cfr_renamed_16770(sprofo4.cfr_renamed_0);
        }
        sprofo sprofo5 = this;
        sprkr sprkr3 = (sprkr)sprofo5.cfr_renamed_3.get(sprofo5.cfr_renamed_4);
        sprofo sprofo6 = this;
        sprofo6.cfr_renamed_91 += sprkr3.cfr_renamed_16769();
        ++sprofo6.cfr_renamed_4;
        return false;
    }

    private static /* synthetic */ sprcap[] cfr_renamed_16771(sprcap arg0, double arg1) {
        if (arg0.cfr_renamed_16767() == 1) {
            sprcap[] sprcapArray = new sprcap[2];
            sprcapArray[0] = arg0;
            sprcapArray[1] = null;
            return sprcapArray;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        sprcap[] sprcapArray = new sprcop(arg0.toString()).iterator();
        block0: while (true) {
            sprcap[] sprcapArray2 = sprcapArray;
            while (sprcapArray2.hasNext()) {
                int n = (Integer)sprcapArray.next();
                if (bl) {
                    sprcapArray2 = sprcapArray;
                    sprghha.cfr_renamed_12279(stringBuilder2, sprxsp.cfr_renamed_12396(n));
                    continue;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                StringBuilder stringBuilder4 = stringBuilder;
                if (sprofo.cfr_renamed_16766(arg0, stringBuilder3.append((Object)stringBuilder).append(sprxsp.cfr_renamed_12396(n)).toString()).cfr_renamed_1942() <= arg1) {
                    sprghha.cfr_renamed_12279(stringBuilder4, sprxsp.cfr_renamed_12396(n));
                    continue block0;
                }
                if (stringBuilder4.length() == 0) {
                    sprghha.cfr_renamed_12279(stringBuilder, sprxsp.cfr_renamed_12396(n));
                } else {
                    sprghha.cfr_renamed_12279(stringBuilder2, sprxsp.cfr_renamed_12396(n));
                }
                bl = true;
                continue block0;
            }
            break;
        }
        sprcapArray = new sprcap[]{sprofo.cfr_renamed_16766(arg0, stringBuilder.toString()), stringBuilder2.length() == 0 ? null : sprofo.cfr_renamed_16766(arg0, stringBuilder2.toString())};
        return sprcapArray;
    }

    @Override
    public void cfr_renamed_16772() {
        if (this.cfr_renamed_91 > this.cfr_renamed_0) {
            return;
        }
        super.cfr_renamed_16772();
    }

    @Override
    public boolean cfr_renamed_16773(double arg0) {
        double d = 0.02;
        return this.cfr_renamed_91 + arg0 > this.cfr_renamed_0 + d;
    }

    private /* synthetic */ void cfr_renamed_16770(double arg0) {
        sprvuo sprvuo2;
        sprofo sprofo2 = this;
        sprkr sprkr2 = (sprkr)sprofo2.cfr_renamed_3.get(sprofo2.cfr_renamed_4);
        if (sprkr2.cfr_renamed_324() != 0) {
            return;
        }
        sprvuo sprvuo3 = (sprvuo)sprkr2;
        if (sprvuo2.cfr_renamed_16774() <= this.cfr_renamed_0) {
            return;
        }
        sprvuo sprvuo4 = new sprvuo();
        sprvuo sprvuo5 = new sprvuo();
        double d = 0.0;
        boolean bl = false;
        for (sprcap sprcap2 : sprvuo3.cfr_renamed_16775()) {
            if (bl) {
                sprvuo5.cfr_renamed_16776(sprcap2);
                continue;
            }
            if (d + sprcap2.cfr_renamed_1942() <= arg0) {
                sprvuo4.cfr_renamed_16776(sprcap2);
                d += sprcap2.cfr_renamed_1942();
                continue;
            }
            sprcap[] sprcapArray = sprofo.cfr_renamed_16771(sprcap2, arg0 - d);
            sprvuo4.cfr_renamed_16776(sprcapArray[0]);
            if (sprcapArray[1] != null) {
                sprvuo5.cfr_renamed_16776(sprcapArray[1]);
            }
            bl = true;
        }
        if (sprvuo5.cfr_renamed_16775().size() == 0) {
            return;
        }
        sprofo sprofo3 = this;
        sprofo3.cfr_renamed_3.set(sprofo3.cfr_renamed_4, sprvuo4);
        sprofo sprofo4 = this;
        sprofo4.cfr_renamed_3.add(sprofo4.cfr_renamed_4 + 1, sprvuo5);
    }
}

