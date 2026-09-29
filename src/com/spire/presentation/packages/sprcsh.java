/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.spec.AlgorithmParameterSpec;

public class sprcsh
implements AlgorithmParameterSpec {
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprcsh(byte[] arg0, byte[] arg1, int arg2, int arg3, byte[] arg4) {
        this(arg0, arg1, arg2, arg3, arg4, false);
    }

    public byte[] cfr_renamed_2097() {
        return sproze.cfr_renamed_158(this.cfr_renamed_91);
    }

    public byte[] cfr_renamed_2099() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprcsh(byte[] arg0, byte[] arg1, int arg2) {
        this(arg0, arg1, arg2, -1, null, false);
    }

    public void cfr_renamed_9049(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public boolean cfr_renamed_9050() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcsh(byte[] byArray, byte[] byArray2, int n, int n2, byte[] byArray3, boolean bl) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        sprcsh sprcsh2;
        void v0;
        void arg1;
        if (byArray != null) {
            void arg0;
            this.cfr_renamed_91 = new byte[((void)arg0).length];
            System.arraycopy(arg0, 0, this.cfr_renamed_91, 0, ((void)arg0).length);
            v0 = arg1;
        } else {
            this.cfr_renamed_91 = null;
            v0 = arg1;
        }
        if (v0 != null) {
            this.cfr_renamed_4 = new byte[((void)arg1).length];
            System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
            sprcsh2 = this;
        } else {
            sprcsh2 = this;
            this.cfr_renamed_4 = null;
        }
        sprcsh2.cfr_renamed_3 = arg2;
        sprcsh sprcsh3 = this;
        this.cfr_renamed_1 = arg3;
        sprcsh3.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg4);
        sprcsh3.cfr_renamed_2 = arg5;
    }

    public int cfr_renamed_2100() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_2098() {
        return this.cfr_renamed_1;
    }
}

