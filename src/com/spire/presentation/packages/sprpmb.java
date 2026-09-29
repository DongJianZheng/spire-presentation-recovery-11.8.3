/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzra;
import java.security.spec.AlgorithmParameterSpec;

public class sprpmb
implements AlgorithmParameterSpec {
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_2097() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public int cfr_renamed_2098() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_2099() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprpmb(byte[] byArray, byte[] byArray2, int n, int n2, byte[] byArray3) {
        void arg4;
        void arg3;
        void arg2;
        sprpmb sprpmb2;
        void v0;
        void arg1;
        if (byArray != null) {
            void arg0;
            this.cfr_renamed_3 = new byte[((void)arg0).length];
            System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, ((void)arg0).length);
            v0 = arg1;
        } else {
            this.cfr_renamed_3 = null;
            v0 = arg1;
        }
        if (v0 != null) {
            this.cfr_renamed_4 = new byte[((void)arg1).length];
            System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
            sprpmb2 = this;
        } else {
            sprpmb2 = this;
            this.cfr_renamed_4 = null;
        }
        sprpmb2.cfr_renamed_2 = arg2;
        sprpmb sprpmb3 = this;
        sprpmb3.cfr_renamed_0 = arg3;
        sprpmb3.cfr_renamed_1 = sprzra.cfr_renamed_158((byte[])arg4);
    }

    public sprpmb(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    public byte[] cfr_renamed_596() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_1);
    }

    public int cfr_renamed_2100() {
        return this.cfr_renamed_2;
    }

    public sprpmb(byte[] arg0, byte[] arg1, int arg2) {
        this(arg0, arg1, arg2, -1);
    }
}

