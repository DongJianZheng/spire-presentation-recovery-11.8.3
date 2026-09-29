/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbim;
import com.spire.presentation.packages.sprkgka;
import com.spire.presentation.packages.sprko;

public class sprhed
implements sprko {
    private sprko cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprhed sprhed2 = this;
        byte[] byArray = new byte[sprhed2.cfr_renamed_3.cfr_renamed_1218()];
        sprhed2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        System.arraycopy(byArray, 0, arg0, arg1, this.cfr_renamed_4);
        return sprhed2.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_3.cfr_renamed_3248();
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append("(").append(this.cfr_renamed_4 * 8).append(")").toString();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public sprhed(sprko sprko2, int n) {
        void arg0;
        void arg1;
        if (sprko2 == null) {
            throw new IllegalArgumentException(sprbim.cfr_renamed_9("\u0006\u0010\u0017\u0014 \u0018\u0003\u0014\u0017\u0005D\u001c\u0011\u0002\u0010Q\n\u001e\u0010Q\u0006\u0014D\u001f\u0011\u001d\b"));
        }
        if (arg1 > arg0.cfr_renamed_1218()) {
            throw new IllegalArgumentException(sprkgka.cfr_renamed_9("\u0010\u0014\u0001\u00106\u001c\u0015\u0010\u0001\u0001R\u001a\u0007\u0001\u0002\u0000\u0006U\u001c\u001a\u0006U\u001e\u0014\u0000\u0012\u0017U\u0017\u001b\u001d\u0000\u0015\u001dR\u0001\u001dU\u0001\u0000\u0002\u0005\u001d\u0007\u0006U\u001e\u0010\u001c\u0012\u0006\u001d"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }
}

