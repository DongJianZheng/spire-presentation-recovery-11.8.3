/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprzcf;

public class sprfjd
implements spruc {
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private sprff cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprfjd sprfjd2 = this;
        sprfjd sprfjd3 = sprfjd2;
        int n = sprfjd2.cfr_renamed_4.cfr_renamed_1195();
        while (sprfjd3.cfr_renamed_3 < n) {
            sprfjd sprfjd4 = this;
            sprfjd sprfjd5 = this;
            sprfjd3 = sprfjd5;
            sprfjd4.cfr_renamed_0[sprfjd5.cfr_renamed_3] = 0;
            ++sprfjd4.cfr_renamed_3;
        }
        sprfjd sprfjd6 = this;
        sprfjd6.cfr_renamed_4.cfr_renamed_3064(sprfjd6.cfr_renamed_0, 0, this.cfr_renamed_1, 0);
        sprfjd sprfjd7 = this;
        System.arraycopy(sprfjd7.cfr_renamed_1, 0, arg0, arg1, this.cfr_renamed_2);
        sprfjd7.cfr_renamed_41();
        return sprfjd6.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfjd(sprff sprff2, int n) {
        void arg1;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprzcf.cfr_renamed_9("~ pA@\bI\u0004\u0013\fF\u0012GAQ\u0004\u0013\fF\rG\bC\rVA\\\u0007\u0013Y"));
        }
        sprfjd sprfjd2 = this;
        sprfjd sprfjd3 = this;
        sprfjd3.cfr_renamed_4 = new sprgnd((sprff)arg0);
        sprfjd3.cfr_renamed_2 = arg1 / 8;
        sprfjd2.cfr_renamed_1 = new byte[arg0.cfr_renamed_1195()];
        sprfjd2.cfr_renamed_0 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_3 = 0;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        sprfjd sprfjd2 = this;
        sprfjd2.cfr_renamed_41();
        sprfjd2.cfr_renamed_4.cfr_renamed_1217(true, arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprlfg.cfr_renamed_9("A\u0013lUvRj\u0013t\u0017\"\u0013\"\u001cg\u0015c\u0006k\u0004gRk\u001cr\u0007vRn\u0017l\u0015v\u001a#"));
        }
        int n = this.cfr_renamed_4.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_3;
        if (arg2 > n3) {
            sprfjd sprfjd2 = this;
            System.arraycopy(arg0, arg1, sprfjd2.cfr_renamed_0, sprfjd2.cfr_renamed_3, n3);
            n2 += this.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_0, 0, this.cfr_renamed_1, 0);
            this.cfr_renamed_3 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_4.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_1, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprfjd sprfjd3 = this;
        System.arraycopy(arg0, arg1, sprfjd3.cfr_renamed_0, sprfjd3.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_2;
    }

    public sprfjd(sprff arg0) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8 / 2);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_4.cfr_renamed_1315();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprfjd sprfjd2 = this;
        if (sprfjd2.cfr_renamed_3 == sprfjd2.cfr_renamed_0.length) {
            sprfjd sprfjd3 = this;
            sprfjd3.cfr_renamed_4.cfr_renamed_3064(sprfjd3.cfr_renamed_0, 0, this.cfr_renamed_1, 0);
            this.cfr_renamed_3 = 0;
        }
        this.cfr_renamed_0[this.cfr_renamed_3++] = arg0;
    }
}

