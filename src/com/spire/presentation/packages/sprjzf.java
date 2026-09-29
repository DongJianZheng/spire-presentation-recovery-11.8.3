/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracg;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprjdg;
import com.spire.presentation.packages.sprovf;
import com.spire.presentation.packages.sproze;

public class sprjzf
extends spracg {
    private final sprjdg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjzf(sprovf sprovf2, byte[] byArray) {
        void arg1;
        void arg0;
        void v0 = arg0;
        super(false, (sprovf)v0);
        int n = v0.cfr_renamed_1146();
        if (byArray.length != 2 * n) {
            throw new IllegalArgumentException(sprdmo.cfr_renamed_9("M\u0002_\u001bT\u0014\u001d\u001cX\u000e\u001d\u0012S\u0014R\u0013T\u0019ZWY\u0018X\u0004\u001d\u0019R\u0003\u001d\u001a\\\u0003^\u001f\u001d\u0007\\\u0005\\\u001aX\u0003X\u0005N"));
        }
        int n2 = n;
        this.cfr_renamed_4 = new sprjdg(sproze.cfr_renamed_533((byte[])arg1, 0, n), sproze.cfr_renamed_533((byte[])arg1, n2, 2 * n2));
    }

    /*
     * WARNING - void declaration
     */
    public sprjzf(sprovf sprovf2, sprjdg sprjdg2) {
        super(false, (sprovf)arg0);
        void arg0;
        this.cfr_renamed_4 = sprjdg2;
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_527(this.cfr_renamed_284().cfr_renamed_91(), this.cfr_renamed_4.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_4);
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_3);
    }
}

