/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprugk;

public class sprvfd
implements spruc {
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private spradd cfr_renamed_2;
    private int cfr_renamed_3;
    private sprmf cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprugk.cfr_renamed_9(")%\u0004c\u001ed\u0002%\u001c!J%J*\u000f#\u000b0\u00032\u000fd\u0003*\u001a1\u001ed\u0006!\u0004#\u001e,K"));
        }
        int n = this.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_0;
        if (arg2 > n3) {
            sprvfd sprvfd2 = this;
            System.arraycopy(arg0, arg1, sprvfd2.cfr_renamed_1, sprvfd2.cfr_renamed_0, n3);
            n2 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_0 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_91, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprvfd sprvfd3 = this;
        System.arraycopy(arg0, arg1, sprvfd3.cfr_renamed_1, sprvfd3.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprvfd sprvfd2 = this;
        int n = sprvfd2.cfr_renamed_2.cfr_renamed_1195();
        if (sprvfd2.cfr_renamed_4 == null) {
            sprvfd sprvfd3 = this;
            while (sprvfd3.cfr_renamed_0 < n) {
                sprvfd sprvfd4 = this;
                sprvfd sprvfd5 = this;
                sprvfd3 = sprvfd5;
                sprvfd4.cfr_renamed_1[sprvfd5.cfr_renamed_0] = 0;
                ++sprvfd4.cfr_renamed_0;
            }
        } else {
            sprvfd sprvfd6 = this;
            sprvfd6.cfr_renamed_4.cfr_renamed_3210(sprvfd6.cfr_renamed_1, this.cfr_renamed_0);
        }
        sprvfd sprvfd7 = this;
        sprvfd7.cfr_renamed_2.cfr_renamed_3064(sprvfd7.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
        sprvfd sprvfd8 = this;
        sprvfd sprvfd9 = this;
        sprvfd8.cfr_renamed_2.cfr_renamed_3474(sprvfd9.cfr_renamed_91);
        System.arraycopy(sprvfd8.cfr_renamed_91, 0, arg0, arg1, this.cfr_renamed_3);
        sprvfd9.cfr_renamed_41();
        return sprvfd7.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_3;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_2.cfr_renamed_1315();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprvfd sprvfd2 = this;
        if (sprvfd2.cfr_renamed_0 == sprvfd2.cfr_renamed_1.length) {
            sprvfd sprvfd3 = this;
            sprvfd3.cfr_renamed_2.cfr_renamed_3064(sprvfd3.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_1[this.cfr_renamed_0++] = arg0;
    }

    public sprvfd(sprff arg0, sprmf arg1) {
        sprff sprff2 = arg0;
        this(sprff2, 8, sprff2.cfr_renamed_1195() * 8 / 2, arg1);
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        sprvfd sprvfd2 = this;
        sprvfd2.cfr_renamed_41();
        sprvfd2.cfr_renamed_2.cfr_renamed_1524(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvfd(sprff sprff2, int n, int n2, sprmf sprmf2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = null;
        if (n2 % 8 != 0) {
            throw new IllegalArgumentException(sprlfo.cfr_renamed_9("_\u0014Qua<h028g&fup028g9f<b9wu}32m"));
        }
        sprvfd sprvfd2 = this;
        this.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprvfd sprvfd3 = this;
        sprvfd3.cfr_renamed_2 = new spradd((sprff)arg0, (int)arg1);
        this.cfr_renamed_4 = arg3;
        sprvfd2.cfr_renamed_3 = arg2 / 8;
        sprvfd2.cfr_renamed_1 = new byte[this.cfr_renamed_2.cfr_renamed_1195()];
        this.cfr_renamed_0 = 0;
    }

    public sprvfd(sprff arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, null);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    public sprvfd(sprff arg0) {
        sprff sprff2 = arg0;
        this(sprff2, 8, sprff2.cfr_renamed_1195() * 8 / 2, null);
    }
}

