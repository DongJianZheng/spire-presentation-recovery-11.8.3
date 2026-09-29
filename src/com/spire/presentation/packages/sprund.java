/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprsvda;
import com.spire.presentation.packages.sprzra;

public class sprund
implements sprel {
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public byte[] cfr_renamed_3362() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprund cfr_renamed_3363(byte[] arg0) {
        return new sprund(arg0, false, null, null);
    }

    public static sprund cfr_renamed_3364(byte[] arg0, byte[] arg1) {
        return new sprund(arg0, true, null, arg1);
    }

    public byte[] cfr_renamed_1477() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_3365() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_1);
    }

    public sprund(byte[] arg0, byte[] arg1, byte[] arg2) {
        this(arg0, false, arg1, arg2);
    }

    public boolean cfr_renamed_3366() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprund(byte[] byArray, boolean bl, byte[] byArray2, byte[] byArray3) {
        void v0;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprsvda.cfr_renamed_9("iam\n\bCNZU^\u0000AESIDG\nMKTORCAF\t\nSBO_LN\u0000DO^\u0000HE\nN_LF"));
        }
        this.cfr_renamed_3 = sprzra.cfr_renamed_158((byte[])arg0);
        this.cfr_renamed_4 = arg1;
        if (arg2 == null || ((void)arg2).length == 0) {
            this.cfr_renamed_2 = null;
            v0 = arg3;
        } else {
            this.cfr_renamed_2 = sprzra.cfr_renamed_158((byte[])arg2);
            v0 = arg3;
        }
        if (v0 == null) {
            this.cfr_renamed_1 = new byte[0];
            return;
        }
        this.cfr_renamed_1 = sprzra.cfr_renamed_158((byte[])arg3);
    }
}

