/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprqxn;
import com.spire.presentation.packages.sprtll;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprzgp;

public class sprmrk
implements spraq {
    private byte[] cfr_renamed_112;
    private sprmr cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprtpk cfr_renamed_0;
    private sprcs cfr_renamed_1;
    private int cfr_renamed_2;
    private sprtpk cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return sprzgp.cfr_renamed_9("qxw\u0012\u000f\u0012\u000fjTL\u000b");
    }

    public sprmrk(sprmr arg0, sprcs arg1) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8, arg1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5692(sprbj sprbj2) {
        void v0;
        sprtpk sprtpk2;
        sprtpk sprtpk3;
        sprtpk sprtpk4;
        void arg0;
        this.cfr_renamed_41();
        if (!(sprbj2 instanceof sprtpk) && !(arg0 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("6Z4Z+HfV3H2\u001b$^fZ(\u001b/U5O'U%^fT \u001b\r^?k'I'V#O#IfT4\u001b\u0016Z4Z+^2^4H\u0011R2S\u000fm"));
        }
        byte[] byArray = (arg0 instanceof sprtpk ? (sprtpk4 = (sprtpk)arg0) : (sprtpk3 = (sprtpk)((sprkpk)arg0).cfr_renamed_284())).cfr_renamed_1521();
        if (byArray.length == 16) {
            sprtpk2 = new sprtpk(byArray, 0, 8);
            v0 = arg0;
            sprmrk sprmrk2 = this;
            sprmrk sprmrk3 = this;
            sprmrk2.cfr_renamed_3 = new sprtpk(byArray, 8, 8);
            sprmrk2.cfr_renamed_0 = sprtpk2;
        } else if (byArray.length == 24) {
            sprtpk2 = new sprtpk(byArray, 0, 8);
            v0 = arg0;
            sprmrk sprmrk4 = this;
            sprmrk4.cfr_renamed_3 = new sprtpk(byArray, 8, 8);
            sprmrk4.cfr_renamed_0 = new sprtpk(byArray, 16, 8);
        } else {
            throw new IllegalArgumentException(sprzgp.cfr_renamed_9("`]R\u0018FMXL\u000bZN\u0018NQ_PNJ\u000b\t\u001a\n\u000bWY\u0018\u001a\u000e\u0013\u0018IQ_\u0018GWE_"));
        }
        sprmrk sprmrk5 = this;
        if (v0 instanceof sprkpk) {
            sprmrk5.cfr_renamed_119.cfr_renamed_5535(true, new sprkpk(sprtpk2, ((sprkpk)arg0).cfr_renamed_1205()));
            return;
        }
        sprmrk5.cfr_renamed_119.cfr_renamed_5535(true, sprtpk2);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_119.cfr_renamed_41();
    }

    public sprmrk(sprmr arg0, int arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("x'UaOfS'M#\u001b'\u001b(^!Z2R0^fR(K3OfW#U!O.\u001a"));
        }
        int n = this.cfr_renamed_119.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_2;
        if (arg2 > n3) {
            sprmrk sprmrk2 = this;
            System.arraycopy(arg0, arg1, sprmrk2.cfr_renamed_112, sprmrk2.cfr_renamed_2, n3);
            n2 += this.cfr_renamed_119.cfr_renamed_3064(this.cfr_renamed_112, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_2 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_119.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_91, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprmrk sprmrk3 = this;
        System.arraycopy(arg0, arg1, sprmrk3.cfr_renamed_112, sprmrk3.cfr_renamed_2, arg2);
        this.cfr_renamed_2 += arg2;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprtll sprtll2;
        sprmrk sprmrk2 = this;
        int n = sprmrk2.cfr_renamed_119.cfr_renamed_1195();
        if (sprmrk2.cfr_renamed_1 == null) {
            sprmrk sprmrk3 = this;
            while (sprmrk3.cfr_renamed_2 < n) {
                sprmrk sprmrk4 = this;
                sprmrk sprmrk5 = this;
                sprmrk3 = sprmrk5;
                sprmrk4.cfr_renamed_112[sprmrk5.cfr_renamed_2] = 0;
                ++sprmrk4.cfr_renamed_2;
            }
        } else {
            if (this.cfr_renamed_2 == n) {
                sprmrk sprmrk6 = this;
                sprmrk6.cfr_renamed_119.cfr_renamed_3064(sprmrk6.cfr_renamed_112, 0, this.cfr_renamed_91, 0);
                this.cfr_renamed_2 = 0;
            }
            sprmrk sprmrk7 = this;
            sprmrk7.cfr_renamed_1.cfr_renamed_3210(sprmrk7.cfr_renamed_112, this.cfr_renamed_2);
        }
        sprmrk sprmrk8 = this;
        sprmrk8.cfr_renamed_119.cfr_renamed_3064(sprmrk8.cfr_renamed_112, 0, this.cfr_renamed_91, 0);
        sprtll sprtll3 = sprtll2 = new sprtll();
        sprtll3.cfr_renamed_5535(false, this.cfr_renamed_3);
        sprtll3.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        sprtll sprtll4 = sprtll2;
        sprtll4.cfr_renamed_5535(true, this.cfr_renamed_0);
        sprtll4.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        sprmrk sprmrk9 = this;
        System.arraycopy(sprmrk9.cfr_renamed_91, 0, arg0, arg1, this.cfr_renamed_4);
        sprmrk9.cfr_renamed_41();
        return sprmrk8.cfr_renamed_4;
    }

    public sprmrk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8, null);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprmrk sprmrk2 = this;
        if (sprmrk2.cfr_renamed_2 == sprmrk2.cfr_renamed_112.length) {
            sprmrk sprmrk3 = this;
            sprmrk3.cfr_renamed_119.cfr_renamed_3064(sprmrk3.cfr_renamed_112, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_2 = 0;
        }
        this.cfr_renamed_112[this.cfr_renamed_2++] = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrk(sprmr sprmr2, int n, sprcs sprcs2) {
        void arg1;
        void arg2;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprzgp.cfr_renamed_9("fyh\u0018XQQ]\u000bU^K_\u0018I]\u000bU^T_Q[TN\u0018D^\u000b\u0000"));
        }
        if (!(arg0 instanceof sprtll)) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("%R6S#IfV3H2\u001b$^fR(H2Z(X#\u001b)]f\u007f#H\u0003U!R(^"));
        }
        sprmrk sprmrk2 = this;
        sprmrk sprmrk3 = this;
        this.cfr_renamed_119 = sprhqk.cfr_renamed_7530((sprmr)arg0);
        sprmrk3.cfr_renamed_1 = arg2;
        sprmrk3.cfr_renamed_4 = arg1 / 8;
        sprmrk2.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprmrk2.cfr_renamed_112 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_2 = 0;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4;
    }
}

