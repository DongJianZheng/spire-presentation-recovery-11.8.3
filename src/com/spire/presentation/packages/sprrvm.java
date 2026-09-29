/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmmia;
import com.spire.presentation.packages.spropo;

public class sprrvm {
    private sprco[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    public static final sprco[] cfr_renamed_2 = new sprco[0];
    private static final int cfr_renamed_3 = 10;
    private int cfr_renamed_4;

    public int cfr_renamed_84() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_5004(sprco arg0) {
        sprrvm sprrvm2;
        boolean bl;
        if (null == arg0) {
            throw new NullPointerException(sprmmia.cfr_renamed_9("\u000egEgDgGv\u000e\"JcGlFv\t`L\"GwEn"));
        }
        int n = this.cfr_renamed_4 + 1;
        int n2 = this.cfr_renamed_0.length;
        if (n > n2) {
            bl = true;
            sprrvm2 = this;
        } else {
            bl = false;
            sprrvm2 = this;
        }
        if (bl | sprrvm2.cfr_renamed_1) {
            this.cfr_renamed_11517(n);
        }
        sprrvm sprrvm3 = this;
        sprrvm3.cfr_renamed_0[sprrvm3.cfr_renamed_4] = arg0;
        this.cfr_renamed_4 = n;
    }

    public sprrvm() {
        this(10);
    }

    public void cfr_renamed_11518(sprco[] arg0) {
        if (null == arg0) {
            throw new NullPointerException(spropo.cfr_renamed_9("cx0\u007f!e70dt%y*x07&rdy1{("));
        }
        this.cfr_renamed_11519(arg0, sprmmia.cfr_renamed_9("\u000em]jLpZ%\tgEgDgGvZ\"JcGlFv\t`L\"GwEn"));
    }

    private /* synthetic */ void cfr_renamed_11519(sprco[] arg0, String arg1) {
        sprrvm sprrvm2;
        boolean bl;
        int n = arg0.length;
        if (n < 1) {
            return;
        }
        int n2 = this.cfr_renamed_4 + n;
        int n3 = this.cfr_renamed_0.length;
        if (n2 > n3) {
            bl = true;
            sprrvm2 = this;
        } else {
            bl = false;
            sprrvm2 = this;
        }
        if (bl | sprrvm2.cfr_renamed_1) {
            this.cfr_renamed_11517(n2);
        }
        int n4 = 0;
        do {
            sprco sprco2;
            if (null == (sprco2 = arg0[n4])) {
                throw new NullPointerException(arg1);
            }
            sprrvm sprrvm3 = this;
            int n5 = sprrvm3.cfr_renamed_4 + n4;
            sprrvm3.cfr_renamed_0[n5] = sprco2;
        } while (++n4 < n);
        this.cfr_renamed_4 = n2;
    }

    public sprco[] cfr_renamed_11489() {
        if (0 == this.cfr_renamed_4) {
            return cfr_renamed_2;
        }
        sprco[] sprcoArray = new sprco[this.cfr_renamed_4];
        System.arraycopy(this.cfr_renamed_0, 0, sprcoArray, 0, this.cfr_renamed_4);
        return sprcoArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprrvm(int n) {
        void arg0;
        if (n < 0) {
            throw new IllegalArgumentException(spropo.cfr_renamed_9("0-y-c-v(T%g%t-c=0dz1d07*x07&rdy!p%c-a!"));
        }
        this.cfr_renamed_0 = arg0 == false ? cfr_renamed_2 : new sprco[arg0];
        sprrvm sprrvm2 = this;
        sprrvm2.cfr_renamed_4 = 0;
        sprrvm2.cfr_renamed_1 = false;
    }

    public void cfr_renamed_11520(sprrvm arg0) {
        if (null == arg0) {
            throw new NullPointerException(sprmmia.cfr_renamed_9("\u000em]jLp\u000e\"JcGlFv\t`L\"GwEn"));
        }
        this.cfr_renamed_11519(arg0.cfr_renamed_0, spropo.cfr_renamed_9("cx0\u007f!ec7!{!z!y0ddt%y*x07&rdy1{("));
    }

    public sprco cfr_renamed_576(int arg0) {
        if (arg0 >= this.cfr_renamed_4) {
            throw new ArrayIndexOutOfBoundsException(arg0 + sprmmia.cfr_renamed_9("\t<\u0014\"") + this.cfr_renamed_4);
        }
        return this.cfr_renamed_0[arg0];
    }

    public static sprco[] cfr_renamed_11488(sprco[] arg0) {
        if (arg0.length < 1) {
            return cfr_renamed_2;
        }
        return (sprco[])arg0.clone();
    }

    public sprco[] cfr_renamed_11217() {
        if (0 == this.cfr_renamed_4) {
            return cfr_renamed_2;
        }
        if (this.cfr_renamed_0.length == this.cfr_renamed_4) {
            this.cfr_renamed_1 = true;
            return this.cfr_renamed_0;
        }
        sprco[] sprcoArray = new sprco[this.cfr_renamed_4];
        System.arraycopy(this.cfr_renamed_0, 0, sprcoArray, 0, this.cfr_renamed_4);
        return sprcoArray;
    }

    private /* synthetic */ void cfr_renamed_11517(int arg0) {
        int n = arg0;
        sprco[] sprcoArray = new sprco[Math.max(this.cfr_renamed_0.length, n + (n >> 1))];
        sprrvm sprrvm2 = this;
        System.arraycopy(this.cfr_renamed_0, 0, sprcoArray, 0, this.cfr_renamed_4);
        sprrvm2.cfr_renamed_0 = sprcoArray;
        sprrvm2.cfr_renamed_1 = false;
    }
}

