/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprt;

public class sprild
implements sprt {
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public byte[] cfr_renamed_1521() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3343() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprild(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray.length > 255) {
            throw new IllegalArgumentException(sprhtc.cfr_renamed_9("G\u0003 `~%l`y%{'a(5#t.5\"p`{/5'g%t4p254}!{`'u "));
        }
        this.cfr_renamed_3 = new byte[((void)arg0).length];
        this.cfr_renamed_4 = arg1;
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, ((void)arg0).length);
    }
}

