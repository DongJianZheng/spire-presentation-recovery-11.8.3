/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhwia;
import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprvof;

public final class sprlkf {
    private final byte[][] cfr_renamed_4;

    public byte[][] cfr_renamed_954() {
        return sprvof.cfr_renamed_5751(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprlkf(sprirf sprirf2, byte[][] byArray) {
        int n;
        void arg0;
        void arg1;
        if (sprirf2 == null) {
            throw new NullPointerException(sprqvn.cfr_renamed_9("~t|tcf.(35``by"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprhwia.cfr_renamed_9("~qguowkHkz.>3#`vbo"));
        }
        if (sprvof.cfr_renamed_5750((byte[][])arg1)) {
            throw new NullPointerException(sprqvn.cfr_renamed_9("e||xtzpEpw5llzp.t|gol.(35``by"));
        }
        if (((void)arg1).length != arg0.cfr_renamed_5786()) {
            throw new IllegalArgumentException(sprhwia.cfr_renamed_9("t|l`d.s|jxbzfEfw#hl|now"));
        }
        int n2 = n = 0;
        while (n2 < ((void)arg1).length) {
            if (((void)arg1[n]).length != arg0.cfr_renamed_5732()) {
                throw new IllegalArgumentException(sprqvn.cfr_renamed_9("b|z`r.e||xtzpEpw5hz|xoa"));
            }
            n2 = ++n;
        }
        this.cfr_renamed_4 = sprvof.cfr_renamed_5751((byte[][])arg1);
    }
}

