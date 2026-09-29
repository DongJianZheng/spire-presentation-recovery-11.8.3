/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprvaea;

public class spreqk
implements spraq {
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private sprcs cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprmr cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_4.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public spreqk(sprmr sprmr2, int n, sprcs sprcs2) {
        void arg1;
        void arg2;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(spripe.cfr_renamed_9("u\n{kK\"B.\u0018&M8LkZ.\u0018&M'L\"H']kW-\u0018s"));
        }
        spreqk spreqk2 = this;
        spreqk spreqk3 = this;
        this.cfr_renamed_4 = sprhqk.cfr_renamed_7530((sprmr)arg0);
        spreqk3.cfr_renamed_1 = arg2;
        spreqk3.cfr_renamed_2 = arg1 / 8;
        spreqk2.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        spreqk2.cfr_renamed_3 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_0 = 0;
    }

    public spreqk(sprmr arg0, sprcs arg1) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8 / 2, arg1);
    }

    public spreqk(sprmr arg0, int arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        spreqk spreqk2 = this;
        int n = spreqk2.cfr_renamed_4.cfr_renamed_1195();
        if (spreqk2.cfr_renamed_1 == null) {
            spreqk spreqk3 = this;
            while (spreqk3.cfr_renamed_0 < n) {
                spreqk spreqk4 = this;
                spreqk spreqk5 = this;
                spreqk3 = spreqk5;
                spreqk4.cfr_renamed_3[spreqk5.cfr_renamed_0] = 0;
                ++spreqk4.cfr_renamed_0;
            }
        } else {
            if (this.cfr_renamed_0 == n) {
                spreqk spreqk6 = this;
                spreqk6.cfr_renamed_4.cfr_renamed_3064(spreqk6.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
                this.cfr_renamed_0 = 0;
            }
            spreqk spreqk7 = this;
            spreqk7.cfr_renamed_1.cfr_renamed_3210(spreqk7.cfr_renamed_3, this.cfr_renamed_0);
        }
        spreqk spreqk8 = this;
        spreqk8.cfr_renamed_4.cfr_renamed_3064(spreqk8.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
        spreqk spreqk9 = this;
        System.arraycopy(spreqk9.cfr_renamed_91, 0, arg0, arg1, this.cfr_renamed_2);
        spreqk9.cfr_renamed_41();
        return spreqk8.cfr_renamed_2;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_4.cfr_renamed_1315();
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_2;
    }

    public spreqk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8 / 2, null);
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        spreqk spreqk2 = this;
        spreqk2.cfr_renamed_41();
        spreqk2.cfr_renamed_4.cfr_renamed_5535(true, arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprvaea.cfr_renamed_9("]4prjuv4h0>4>;{2\u007f!w#{uw;n jur0p2j=?"));
        }
        int n = this.cfr_renamed_4.cfr_renamed_1195();
        int n2 = n - this.cfr_renamed_0;
        if (arg2 > n2) {
            spreqk spreqk2 = this;
            System.arraycopy(arg0, arg1, spreqk2.cfr_renamed_3, this.cfr_renamed_0, n2);
            spreqk2.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_0 = 0;
            arg1 += n2;
            int n3 = arg2 -= n2;
            while (n3 > n) {
                this.cfr_renamed_4.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_91, 0);
                arg1 += n;
                n3 = arg2 -= n;
            }
        }
        spreqk spreqk3 = this;
        System.arraycopy(arg0, arg1, spreqk3.cfr_renamed_3, spreqk3.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        spreqk spreqk2 = this;
        if (spreqk2.cfr_renamed_0 == spreqk2.cfr_renamed_3.length) {
            spreqk spreqk3 = this;
            spreqk3.cfr_renamed_4.cfr_renamed_3064(spreqk3.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_3[this.cfr_renamed_0++] = arg0;
    }
}

