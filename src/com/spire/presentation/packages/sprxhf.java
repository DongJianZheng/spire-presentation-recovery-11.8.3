/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxz;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprrgf;

public class sprxhf
implements sprbj {
    public static final int cfr_renamed_119 = 50;
    private int cfr_renamed_91;
    public static final int cfr_renamed_0 = 11;
    private int cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprxhf(sprgf arg0) {
        this(11, 50, arg0);
    }

    public sprxhf(int arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprxhf(int n, sprgf sprgf2) {
        void arg1;
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(spraxz.cfr_renamed_9("<\\.\u0019$P-\\wT\"J#\u00195\\wI8J>M>O2"));
        }
        sprxhf sprxhf2 = this;
        sprxhf sprxhf3 = this;
        sprxhf3.cfr_renamed_3 = 0;
        sprxhf3.cfr_renamed_1 = 1;
        while (sprxhf2.cfr_renamed_1 < arg0) {
            sprxhf sprxhf4 = this;
            sprxhf2 = sprxhf4;
            sprxhf4.cfr_renamed_1 <<= 1;
            ++sprxhf4.cfr_renamed_3;
        }
        sprxhf sprxhf5 = this;
        sprxhf5.cfr_renamed_91 = sprxhf5.cfr_renamed_1 >>> 1;
        sprxhf5.cfr_renamed_91 /= this.cfr_renamed_3;
        sprxhf5.cfr_renamed_4 = sprrgf.cfr_renamed_826(sprxhf5.cfr_renamed_3);
        this.cfr_renamed_2 = arg1;
    }

    public sprxhf() {
        this(11, 50);
    }

    public sprxhf(int arg0, int arg1, int arg2, sprgf arg3) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3 < 1) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("\u000fb\u000f7\u00116B \u0007b\u0012-\u0011+\u0016+\u0014'"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(spraxz.cfr_renamed_9("wTwP$\u0019#V8\u0019;X%^2"));
        }
        this.cfr_renamed_1 = 1 << arg0;
        this.cfr_renamed_91 = arg1;
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("\u0016b\u000f7\u00116B \u0007b\u0012-\u0011+\u0016+\u0014'"));
        }
        if (arg1 > this.cfr_renamed_1) {
            throw new IllegalArgumentException(spraxz.cfr_renamed_9("#\u0019:L$Mw[2\u0019;\\$JwM?X9\u00199\u0019j\u0019eg:"));
        }
        if (sprrgf.cfr_renamed_824(arg2) != arg0 || !sprrgf.cfr_renamed_827(arg2)) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("\u0012-\u000e;\f-\u000f+\u0003.B+\u0011b\f-\u0016b\u0003b\u0004+\u0007.\u0006b\u0012-\u000e;\f-\u000f+\u0003.B$\r0B\u0005$jP\u001c\u000fk"));
        }
        sprxhf sprxhf2 = this;
        sprxhf2.cfr_renamed_4 = arg2;
        sprxhf2.cfr_renamed_2 = arg3;
    }

    public int cfr_renamed_1185() {
        return this.cfr_renamed_4;
    }

    public sprxhf(int arg0, int arg1) {
        this(arg0, arg1, null);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }

    public sprxhf(int arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprxhf(int n, int n2, sprgf sprgf2) {
        void arg2;
        void arg1;
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(spraxz.cfr_renamed_9("TwT\"J#\u00195\\wI8J>M>O2"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("\u000fb\u000b1B6\r-B.\u00030\u0005'"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_1 = 1 << arg0;
        if (arg1 < 0) {
            throw new IllegalArgumentException(spraxz.cfr_renamed_9("MwT\"J#\u00195\\wI8J>M>O2"));
        }
        if (arg1 > this.cfr_renamed_1) {
            throw new IllegalArgumentException(sprfkba.cfr_renamed_9("6B/\u00171\u0016b\u0000'B.\u00071\u0011b\u0016*\u0003,B,B\u007fBp</"));
        }
        sprxhf sprxhf2 = this;
        sprxhf2.cfr_renamed_91 = arg1;
        sprxhf2.cfr_renamed_4 = sprrgf.cfr_renamed_826((int)arg0);
        this.cfr_renamed_2 = arg2;
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }
}

