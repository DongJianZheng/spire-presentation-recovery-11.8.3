/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprvof;

public final class sprojf {
    private final byte[][] cfr_renamed_4;

    public byte[][] cfr_renamed_954() {
        return sprvof.cfr_renamed_5751(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprojf(sprirf sprirf2, byte[][] byArray) {
        int n;
        void arg0;
        void arg1;
        if (sprirf2 == null) {
            throw new NullPointerException(sprprca.cfr_renamed_9("&U$U;Gv\tk\u00148A:X"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprrmo.cfr_renamed_9("5\u007f'f,i\u000eo<*x7ed0f)"));
        }
        if (sprvof.cfr_renamed_5750((byte[][])arg1)) {
            throw new NullPointerException(sprprca.cfr_renamed_9("&A4X?W\u001dQ/\u00144M\"QvU$F7Mv\tk\u00148A:X"));
        }
        if (((void)arg1).length != arg0.cfr_renamed_5786()) {
            throw new IllegalArgumentException(sprrmo.cfr_renamed_9("}7e+mez0h)c&A sey,p "));
        }
        int n2 = n = 0;
        while (n2 < ((void)arg1).length) {
            if (((void)arg1[n]).length != arg0.cfr_renamed_5732()) {
                throw new IllegalArgumentException(sprprca.cfr_renamed_9("!F9Z1\u0014&A4X?W\u001dQ/\u00140[$Y7@"));
            }
            n2 = ++n;
        }
        this.cfr_renamed_4 = sprvof.cfr_renamed_5751((byte[][])arg1);
    }
}

