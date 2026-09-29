/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprwsga;

public class sprkyk
implements spraq {
    private sprmr cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_0.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprkyk sprkyk2 = this;
        if (sprkyk2.cfr_renamed_1 == sprkyk2.cfr_renamed_3.length) {
            sprkyk sprkyk3 = this;
            sprkyk3.cfr_renamed_0.cfr_renamed_3064(sprkyk3.cfr_renamed_3, 0, this.cfr_renamed_4, 0);
            this.cfr_renamed_1 = 0;
        }
        this.cfr_renamed_3[this.cfr_renamed_1++] = arg0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprkyk sprkyk2 = this;
        sprkyk sprkyk3 = sprkyk2;
        int n = sprkyk2.cfr_renamed_0.cfr_renamed_1195();
        while (sprkyk3.cfr_renamed_1 < n) {
            sprkyk sprkyk4 = this;
            sprkyk sprkyk5 = this;
            sprkyk3 = sprkyk5;
            sprkyk4.cfr_renamed_3[sprkyk5.cfr_renamed_1] = 0;
            ++sprkyk4.cfr_renamed_1;
        }
        sprkyk sprkyk6 = this;
        sprkyk6.cfr_renamed_0.cfr_renamed_3064(sprkyk6.cfr_renamed_3, 0, this.cfr_renamed_4, 0);
        sprkyk sprkyk7 = this;
        System.arraycopy(sprkyk7.cfr_renamed_4, 0, arg0, arg1, this.cfr_renamed_2);
        sprkyk7.cfr_renamed_41();
        return sprkyk6.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprkyk sprkyk2 = this;
        sprkyk2.cfr_renamed_41();
        sprkyk2.cfr_renamed_0.cfr_renamed_5535(true, arg0);
    }

    public sprkyk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8 / 2);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_0.cfr_renamed_1315();
    }

    /*
     * WARNING - void declaration
     */
    public sprkyk(sprmr sprmr2, int n) {
        void arg1;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprrcba.cfr_renamed_9("KNE/uf|j&bs|r/dj&bscrfvcc/ii&7"));
        }
        sprkyk sprkyk2 = this;
        sprkyk sprkyk3 = this;
        sprkyk3.cfr_renamed_0 = new sprhqk((sprmr)arg0);
        sprkyk3.cfr_renamed_2 = arg1 / 8;
        sprkyk2.cfr_renamed_4 = new byte[arg0.cfr_renamed_1195()];
        sprkyk2.cfr_renamed_3 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_1 = 0;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprwsga.cfr_renamed_9("\f?!y;~'?9;o?o0*9.*&(*~&0?+;~#;!9;6n"));
        }
        int n = this.cfr_renamed_0.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_1;
        if (arg2 > n3) {
            sprkyk sprkyk2 = this;
            System.arraycopy(arg0, arg1, sprkyk2.cfr_renamed_3, sprkyk2.cfr_renamed_1, n3);
            n2 += this.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_3, 0, this.cfr_renamed_4, 0);
            this.cfr_renamed_1 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_0.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_4, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprkyk sprkyk3 = this;
        System.arraycopy(arg0, arg1, sprkyk3.cfr_renamed_3, sprkyk3.cfr_renamed_1, arg2);
        this.cfr_renamed_1 += arg2;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_2;
    }
}

