/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprew;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprqnp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprytp;

@sprtea
public class sprbwo
implements sprew {
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private String cfr_renamed_3;
    private sprqnp cfr_renamed_4;

    @Override
    public boolean cfr_renamed_15064() {
        if (!this.cfr_renamed_2) {
            return false;
        }
        boolean bl = true;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int n = (Integer)this.cfr_renamed_4.cfr_renamed_15484();
            int n2 = sprbwo.cfr_renamed_17059(n);
            if (bl) {
                this.cfr_renamed_1 = n2;
                bl = false;
            }
            if (n2 != this.cfr_renamed_1) {
                this.cfr_renamed_3 = stringBuilder.toString();
                return true;
            }
            sprghha.cfr_renamed_12279(stringBuilder, sprxsp.cfr_renamed_12396(n));
        } while (this.cfr_renamed_4.cfr_renamed_15064());
        sprbwo sprbwo2 = this;
        sprbwo2.cfr_renamed_3 = stringBuilder.toString();
        sprbwo2.cfr_renamed_2 = false;
        return true;
    }

    @Override
    public String cfr_renamed_17060() {
        return this.cfr_renamed_3;
    }

    private static /* synthetic */ boolean cfr_renamed_17061(int arg0) {
        return arg0 == 10 || arg0 == 13;
    }

    private static /* synthetic */ int cfr_renamed_17059(int arg0) {
        if (sprbwo.cfr_renamed_17062(arg0)) {
            return 1;
        }
        if (sprbwo.cfr_renamed_17061(arg0)) {
            return 2;
        }
        if (sprytp.cfr_renamed_17063((char)arg0)) {
            return 3;
        }
        return 0;
    }

    public void cfr_renamed_15489(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.cfr_renamed_4 = new sprqnp(new sprcop(arg0));
        this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_15064();
    }

    @Override
    public int cfr_renamed_16767() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        return this.cfr_renamed_17060();
    }

    private static /* synthetic */ boolean cfr_renamed_17062(int arg0) {
        return arg0 == 32 || arg0 == 9;
    }
}

