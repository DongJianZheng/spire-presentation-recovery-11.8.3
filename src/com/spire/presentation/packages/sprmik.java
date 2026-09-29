/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbva;

public class sprmik
implements sprbj {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_1521() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_3343() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmik(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray.length > 255) {
            throw new IllegalArgumentException(sprbva.cfr_renamed_9("Aa&\u0002xGj\u0002\u007fG}EgJ3ArL3@v\u0002}M3EaGrVvP3V{C}\u0002!\u0017&"));
        }
        this.cfr_renamed_4 = new byte[((void)arg0).length];
        this.cfr_renamed_3 = arg1;
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }
}

