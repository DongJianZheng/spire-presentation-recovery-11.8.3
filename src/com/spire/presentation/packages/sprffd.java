/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprmxe;
import com.spire.presentation.packages.sprsaz;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class sprffd
implements spruc {
    private sprmf cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private sprff cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_4.cfr_renamed_41();
    }

    public sprffd(sprff arg0, int arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprffd sprffd2 = this;
        if (sprffd2.cfr_renamed_0 == sprffd2.cfr_renamed_1.length) {
            sprffd sprffd3 = this;
            sprffd3.cfr_renamed_4.cfr_renamed_3064(sprffd3.cfr_renamed_1, 0, this.cfr_renamed_2, 0);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_1[this.cfr_renamed_0++] = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprffd(sprff sprff2, int n, sprmf sprmf2) {
        void arg1;
        void arg2;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprmxe.cfr_renamed_9("%R+3\u001bz\u0012vH~\u001d`\u001c3\nvH~\u001d\u007f\u001cz\u0018\u007f\r3\u0007uH+"));
        }
        sprffd sprffd2 = this;
        sprffd sprffd3 = this;
        this.cfr_renamed_4 = new sprgnd((sprff)arg0);
        sprffd3.cfr_renamed_91 = arg2;
        sprffd3.cfr_renamed_3 = arg1 / 8;
        sprffd2.cfr_renamed_2 = new byte[arg0.cfr_renamed_1195()];
        sprffd2.cfr_renamed_1 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_0 = 0;
    }

    public sprffd(sprff arg0) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8 / 2, null);
    }

    public sprffd(sprff arg0, sprmf arg1) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8 / 2, arg1);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_4.cfr_renamed_1315();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprffd sprffd2 = this;
        int n = sprffd2.cfr_renamed_4.cfr_renamed_1195();
        if (sprffd2.cfr_renamed_91 == null) {
            sprffd sprffd3 = this;
            while (sprffd3.cfr_renamed_0 < n) {
                sprffd sprffd4 = this;
                sprffd sprffd5 = this;
                sprffd3 = sprffd5;
                sprffd4.cfr_renamed_1[sprffd5.cfr_renamed_0] = 0;
                ++sprffd4.cfr_renamed_0;
            }
        } else {
            if (this.cfr_renamed_0 == n) {
                sprffd sprffd6 = this;
                sprffd6.cfr_renamed_4.cfr_renamed_3064(sprffd6.cfr_renamed_1, 0, this.cfr_renamed_2, 0);
                this.cfr_renamed_0 = 0;
            }
            sprffd sprffd7 = this;
            sprffd7.cfr_renamed_91.cfr_renamed_3210(sprffd7.cfr_renamed_1, this.cfr_renamed_0);
        }
        sprffd sprffd8 = this;
        sprffd8.cfr_renamed_4.cfr_renamed_3064(sprffd8.cfr_renamed_1, 0, this.cfr_renamed_2, 0);
        sprffd sprffd9 = this;
        System.arraycopy(sprffd9.cfr_renamed_2, 0, arg0, arg1, this.cfr_renamed_3);
        sprffd9.cfr_renamed_41();
        return sprffd8.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        sprffd sprffd2 = this;
        sprffd2.cfr_renamed_41();
        sprffd2.cfr_renamed_4.cfr_renamed_1217(true, arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprsaz.cfr_renamed_9("?5\u0012s\bt\u00145\n1\\5\\:\u00193\u001d \u0015\"\u0019t\u0015:\f!\bt\u00101\u00123\b<]"));
        }
        int n = this.cfr_renamed_4.cfr_renamed_1195();
        int n2 = n - this.cfr_renamed_0;
        if (arg2 > n2) {
            sprffd sprffd2 = this;
            System.arraycopy(arg0, arg1, sprffd2.cfr_renamed_1, this.cfr_renamed_0, n2);
            sprffd2.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_2, 0);
            this.cfr_renamed_0 = 0;
            arg1 += n2;
            int n3 = arg2 -= n2;
            while (n3 > n) {
                this.cfr_renamed_4.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_2, 0);
                arg1 += n;
                n3 = arg2 -= n;
            }
        }
        sprffd sprffd3 = this;
        System.arraycopy(arg0, arg1, sprffd3.cfr_renamed_1, sprffd3.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
    }
}

