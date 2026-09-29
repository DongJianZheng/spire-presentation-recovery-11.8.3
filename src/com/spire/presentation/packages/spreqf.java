/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprftfa;
import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprtoba;
import com.spire.presentation.packages.sprvof;

public final class spreqf {
    private byte[][] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreqf(sprirf sprirf2, byte[][] byArray) {
        int n;
        void arg0;
        void arg1;
        if (sprirf2 == null) {
            throw new NullPointerException(sprftfa.cfr_renamed_9("x?z?e-(c5~f+d2"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprtoba.cfr_renamed_9("'f3a5{!}1/i2ta!c8"));
        }
        if (sprvof.cfr_renamed_5750((byte[][])arg1)) {
            throw new NullPointerException(sprftfa.cfr_renamed_9("{7o0i*},m~j'|;(?z,i'(c5~f+d2"));
        }
        if (((void)arg1).length != arg0.cfr_renamed_5786()) {
            throw new IllegalArgumentException(sprtoba.cfr_renamed_9("x&`:ht|=h:n z&jt|=u1"));
        }
        int n2 = n = 0;
        while (n2 < ((void)arg1).length) {
            if (((void)arg1[n]).length != arg0.cfr_renamed_5732()) {
                throw new IllegalArgumentException(sprftfa.cfr_renamed_9("\u007f,g0o~{7o0i*},m~n1z3i*"));
            }
            n2 = ++n;
        }
        this.cfr_renamed_4 = sprvof.cfr_renamed_5751((byte[][])arg1);
    }

    public byte[][] cfr_renamed_954() {
        return sprvof.cfr_renamed_5751(this.cfr_renamed_4);
    }
}

