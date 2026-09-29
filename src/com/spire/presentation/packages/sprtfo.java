/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprpjo;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxaea;
import com.spire.presentation.packages.sprxsp;

@sprtea
public class sprtfo
extends sprpjo {
    private String cfr_renamed_3 = "";
    private int cfr_renamed_4;

    @Override
    public boolean cfr_renamed_16882(char arg0, char arg1, int arg2) {
        return this.cfr_renamed_16883(sprxsp.cfr_renamed_16884(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean cfr_renamed_16883(int n) {
        void arg0;
        sprtfo sprtfo2 = this;
        sprtfo sprtfo3 = this;
        sprtfo2.cfr_renamed_3 = sprrbaa.cfr_renamed_9("\u0012vL") + sprebp.cfr_renamed_16885((int)arg0) + sprxaea.cfr_renamed_9("M");
        sprtfo2.cfr_renamed_4 = 0;
        return true;
    }

    @Override
    public boolean cfr_renamed_16886(char arg0, int arg1) {
        return this.cfr_renamed_16883(arg0);
    }

    @Override
    public boolean cfr_renamed_16887() {
        sprtfo sprtfo2 = this;
        --sprtfo2.cfr_renamed_4;
        if (sprtfo2.cfr_renamed_4 >= 0) {
            return true;
        }
        this.cfr_renamed_4 = 0;
        return false;
    }

    @Override
    public char cfr_renamed_16888() {
        sprtfo sprtfo2 = this;
        if (sprtfo2.cfr_renamed_4 < sprtfo2.cfr_renamed_3.length()) {
            sprtfo sprtfo3 = this;
            char c = this.cfr_renamed_3.charAt(sprtfo3.cfr_renamed_4);
            ++sprtfo3.cfr_renamed_4;
            return c;
        }
        return '\u0000';
    }

    @Override
    public int cfr_renamed_4583() {
        return this.cfr_renamed_3.length() - this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_41() {
        sprtfo sprtfo2 = this;
        sprtfo2.cfr_renamed_3 = "";
        sprtfo2.cfr_renamed_4 = 0;
    }
}

