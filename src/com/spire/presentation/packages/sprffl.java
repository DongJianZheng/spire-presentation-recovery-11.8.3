/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxha;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprtkc;

public class sprffl
implements sprpl {
    private sprpl cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append("(").append(this.cfr_renamed_4 * 8).append(")").toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprffl sprffl2 = this;
        byte[] byArray = new byte[sprffl2.cfr_renamed_3.cfr_renamed_1218()];
        sprffl2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        System.arraycopy(byArray, 0, arg0, arg1, this.cfr_renamed_4);
        return sprffl2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprffl(sprpl sprpl2, int n) {
        void arg0;
        void arg1;
        if (sprpl2 == null) {
            throw new IllegalArgumentException(sprgxha.cfr_renamed_9("~\u001do\u0019X\u0015{\u0019o\b<\u0011i\u000fh\\r\u0013h\\~\u0019<\u0012i\u0010p"));
        }
        if (arg1 > arg0.cfr_renamed_1218()) {
            throw new IllegalArgumentException(sprtkc.cfr_renamed_9("9Z(^\u001fR<^(O{T.O+N/\u001b5T/\u001b7Z)\\>\u001b>U4N<S{O4\u001b(N+K4I/\u001b7^5\\/S"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_3.cfr_renamed_3248();
    }
}

