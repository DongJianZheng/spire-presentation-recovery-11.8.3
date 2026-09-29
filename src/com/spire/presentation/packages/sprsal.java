/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprucaa;
import com.spire.presentation.packages.spruzk;
import com.spire.presentation.packages.sprvrb;

public class sprsal
implements spraq {
    private int cfr_renamed_91;
    private spruzk cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprcs cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprvrb.cfr_renamed_9("\\bq$k#wbif?b?mzd~wvuz#vmovk#sfqdkk>"));
        }
        int n = this.cfr_renamed_0.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_91;
        if (arg2 > n3) {
            sprsal sprsal2 = this;
            System.arraycopy(arg0, arg1, sprsal2.cfr_renamed_3, sprsal2.cfr_renamed_91, n3);
            n2 += this.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_3, 0, this.cfr_renamed_2, 0);
            this.cfr_renamed_91 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_0.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_2, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprsal sprsal3 = this;
        System.arraycopy(arg0, arg1, sprsal3.cfr_renamed_3, sprsal3.cfr_renamed_91, arg2);
        this.cfr_renamed_91 += arg2;
    }

    public sprsal(sprmr arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, null);
    }

    public sprsal(sprmr arg0, sprcs arg1) {
        sprmr sprmr2 = arg0;
        this(sprmr2, 8, sprmr2.cfr_renamed_1195() * 8 / 2, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprsal(sprmr sprmr2, int n, int n2, sprcs sprcs2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = null;
        if (n2 % 8 != 0) {
            throw new IllegalArgumentException(sprucaa.cfr_renamed_9("(u&\u0014\u0016]\u001fQEY\u0010G\u0011\u0014\u0007QEY\u0010X\u0011]\u0015X\u0000\u0014\nRE\f"));
        }
        sprsal sprsal2 = this;
        this.cfr_renamed_2 = new byte[arg0.cfr_renamed_1195()];
        sprsal sprsal3 = this;
        sprsal3.cfr_renamed_0 = new spruzk((sprmr)arg0, (int)arg1);
        this.cfr_renamed_4 = arg3;
        sprsal2.cfr_renamed_1 = arg2 / 8;
        sprsal2.cfr_renamed_3 = new byte[this.cfr_renamed_0.cfr_renamed_1195()];
        this.cfr_renamed_91 = 0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprsal sprsal2 = this;
        int n = sprsal2.cfr_renamed_0.cfr_renamed_1195();
        if (sprsal2.cfr_renamed_4 == null) {
            sprsal sprsal3 = this;
            while (sprsal3.cfr_renamed_91 < n) {
                sprsal sprsal4 = this;
                sprsal sprsal5 = this;
                sprsal3 = sprsal5;
                sprsal4.cfr_renamed_3[sprsal5.cfr_renamed_91] = 0;
                ++sprsal4.cfr_renamed_91;
            }
        } else {
            sprsal sprsal6 = this;
            sprsal6.cfr_renamed_4.cfr_renamed_3210(sprsal6.cfr_renamed_3, this.cfr_renamed_91);
        }
        sprsal sprsal7 = this;
        sprsal7.cfr_renamed_0.cfr_renamed_3064(sprsal7.cfr_renamed_3, 0, this.cfr_renamed_2, 0);
        sprsal sprsal8 = this;
        sprsal sprsal9 = this;
        sprsal8.cfr_renamed_0.cfr_renamed_3474(sprsal9.cfr_renamed_2);
        System.arraycopy(sprsal8.cfr_renamed_2, 0, arg0, arg1, this.cfr_renamed_1);
        sprsal9.cfr_renamed_41();
        return sprsal7.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprsal sprsal2 = this;
        if (sprsal2.cfr_renamed_91 == sprsal2.cfr_renamed_3.length) {
            sprsal sprsal3 = this;
            sprsal3.cfr_renamed_0.cfr_renamed_3064(sprsal3.cfr_renamed_3, 0, this.cfr_renamed_2, 0);
            this.cfr_renamed_91 = 0;
        }
        this.cfr_renamed_3[this.cfr_renamed_91++] = arg0;
    }

    public sprsal(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, 8, sprmr2.cfr_renamed_1195() * 8 / 2, null);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_91 = 0;
        this.cfr_renamed_0.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_1;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_0.cfr_renamed_1315();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprsal sprsal2 = this;
        sprsal2.cfr_renamed_41();
        sprsal2.cfr_renamed_0.cfr_renamed_5692(arg0);
    }
}

