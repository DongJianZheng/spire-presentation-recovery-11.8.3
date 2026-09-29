/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprdv;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.sprymk;

public class sprxmk
implements sprdv {
    private long cfr_renamed_112;
    private sprwj cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 262144;
    private static final long cfr_renamed_1 = 0x800000000000L;
    private spraq cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3300() {
        byte[] byArray = this.cfr_renamed_119.cfr_renamed_3300();
        if (byArray.length < (this.cfr_renamed_3 + 7) / 8) {
            throw new IllegalStateException(sprizc.cfr_renamed_9("Wrmixzw\u007fwyph>yphlsne>llshuzyz<|e>yphlsne>oqil\u007f{"));
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprxmk(spraq spraq2, int n, sprwj sprwj2, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        if (n > sprymk.cfr_renamed_9964((spraq)arg0)) {
            throw new IllegalArgumentException(sprffb.cfr_renamed_9("\fU/E;C*U:\u0010-U=E,Y*I~C*B;^9D6\u00107C~^1D~C+@._,D;T~R'\u0010*X;\u0010:U,Y(Q*Y1^~V+^=D7_0"));
        }
        if (arg2.cfr_renamed_3225() < arg1) {
            throw new IllegalArgumentException(sprizc.cfr_renamed_9("Psj<{rqiyt>yphlsne>zqn>o{\u007fknwhg<mhlyp{jt>n{mkulyz"));
        }
        this.cfr_renamed_3 = arg1;
        this.cfr_renamed_119 = arg2;
        this.cfr_renamed_2 = arg0;
        byte[] byArray3 = sproze.cfr_renamed_527(this.cfr_renamed_3300(), (byte[])arg4, (byte[])arg3);
        this.cfr_renamed_91 = new byte[arg0.cfr_renamed_2404()];
        this.cfr_renamed_4 = new byte[this.cfr_renamed_91.length];
        sproze.cfr_renamed_492(this.cfr_renamed_4, (byte)1);
        this.cfr_renamed_3308(byArray3);
        this.cfr_renamed_112 = 1L;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_4.length * 8;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        int n2 = arg0.length * 8;
        if (n2 > 262144) {
            throw new IllegalArgumentException(sprffb.cfr_renamed_9("~+]<U,\u00101V~R7D-\u0010.U,\u0010,U/E;C*\u00102Y3Y*U:\u0010*_~\u0002h\u0002o\u0004j"));
        }
        if (this.cfr_renamed_112 > 0x800000000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            this.cfr_renamed_3308(arg1);
        }
        byte[] byArray = new byte[arg0.length];
        int n3 = arg0.length / this.cfr_renamed_4.length;
        this.cfr_renamed_2.cfr_renamed_5692(new sprtpk(this.cfr_renamed_91));
        int n4 = n = 0;
        while (n4 < n3) {
            sprxmk sprxmk2 = this;
            sprxmk2.cfr_renamed_2.cfr_renamed_1197(sprxmk2.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprxmk sprxmk3 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprxmk3.cfr_renamed_4, 0);
            int n5 = n * this.cfr_renamed_4.length;
            System.arraycopy(sprxmk3.cfr_renamed_4, 0, byArray, n5, this.cfr_renamed_4.length);
            n4 = ++n;
        }
        if (n3 * this.cfr_renamed_4.length < byArray.length) {
            sprxmk sprxmk4 = this;
            sprxmk4.cfr_renamed_2.cfr_renamed_1197(sprxmk4.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprxmk sprxmk5 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprxmk5.cfr_renamed_4, 0);
            System.arraycopy(sprxmk5.cfr_renamed_4, 0, byArray, n3 * this.cfr_renamed_4.length, byArray.length - n3 * this.cfr_renamed_4.length);
        }
        sprxmk sprxmk6 = this;
        sprxmk6.cfr_renamed_3308(arg1);
        ++sprxmk6.cfr_renamed_112;
        System.arraycopy(byArray, 0, arg0, 0, arg0.length);
        return n2;
    }

    private /* synthetic */ void cfr_renamed_3309(byte[] arg0, byte arg1) {
        sprxmk sprxmk2 = this;
        sprxmk2.cfr_renamed_2.cfr_renamed_5692(new sprtpk(this.cfr_renamed_91));
        sprxmk2.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        this.cfr_renamed_2.cfr_renamed_1221(arg1);
        if (arg0 != null) {
            this.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
        }
        sprxmk sprxmk3 = this;
        sprxmk3.cfr_renamed_2.cfr_renamed_1219(sprxmk3.cfr_renamed_91, 0);
        this.cfr_renamed_2.cfr_renamed_5692(new sprtpk(this.cfr_renamed_91));
        sprxmk3.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprxmk sprxmk4 = this;
        sprxmk4.cfr_renamed_2.cfr_renamed_1219(sprxmk4.cfr_renamed_4, 0);
    }

    private /* synthetic */ void cfr_renamed_3308(byte[] arg0) {
        this.cfr_renamed_3309(arg0, (byte)0);
        if (arg0 != null) {
            this.cfr_renamed_3309(arg0, (byte)1);
        }
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        sprxmk sprxmk2 = this;
        sprxmk2.cfr_renamed_3308(sproze.cfr_renamed_543(sprxmk2.cfr_renamed_3300(), arg0));
        sprxmk2.cfr_renamed_112 = 1L;
    }
}

