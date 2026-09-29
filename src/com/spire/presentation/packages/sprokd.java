/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxxd;
import com.spire.presentation.packages.spryqp;

public class sprokd {
    private final sprh cfr_renamed_2;
    public int cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_3882() {
        return this.cfr_renamed_3;
    }

    public sprh cfr_renamed_2349() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1339() {
        return this.cfr_renamed_2.cfr_renamed_1339();
    }

    public int cfr_renamed_1344() {
        return this.cfr_renamed_2.cfr_renamed_1344();
    }

    public byte[] cfr_renamed_1206() throws sprpjd {
        sprokd sprokd2 = this;
        byte[] byArray = this.cfr_renamed_2.cfr_renamed_1337(sprokd2.cfr_renamed_4, 0, this.cfr_renamed_3);
        sprokd2.cfr_renamed_41();
        return byArray;
    }

    public void cfr_renamed_2494(byte[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return;
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(spryqp.cfr_renamed_9("]\u0019p_jXv\u0019h\u001d>\u0019>\u0016{\u001f\u007f\fw\u000e{Xw\u0016n\rjXr\u001dp\u001fj\u0010?"));
        }
        if (this.cfr_renamed_3 + arg2 > this.cfr_renamed_4.length) {
            throw new sprjkd(sprxxd.cfr_renamed_9("\u0006\u001e\u0013\u000f\n\u001a\u0013J\u0013\u0005G\u001a\u0015\u0005\u0004\u000f\u0014\u0019G\u0007\u0002\u0019\u0014\u000b\u0000\u000fG\u001e\b\u0005G\u0006\b\u0004\u0000J\u0001\u0005\u0015J\u0004\u0003\u0017\u0002\u0002\u0018"));
        }
        sprokd sprokd2 = this;
        System.arraycopy(arg0, arg1, sprokd2.cfr_renamed_4, sprokd2.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
    }

    public sprokd(sprh sprh2) {
        this.cfr_renamed_2 = sprh2;
    }

    public void cfr_renamed_3883(byte arg0) {
        sprokd sprokd2 = this;
        if (sprokd2.cfr_renamed_3 >= sprokd2.cfr_renamed_4.length) {
            throw new sprjkd(spryqp.cfr_renamed_9("\u0019j\f{\u0015n\f>\fqXn\nq\u001b{\u000bmXs\u001dm\u000b\u007f\u001f{Xj\u0017qXr\u0017p\u001f>\u001eq\n>\u001bw\bv\u001dl"));
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
    }

    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprokd sprokd2 = this;
        sprokd2.cfr_renamed_41();
        sprokd2.cfr_renamed_2.cfr_renamed_1217(arg0, arg1);
        sprokd2.cfr_renamed_4 = new byte[sprokd2.cfr_renamed_2.cfr_renamed_1344() + (arg0 ? 1 : 0)];
        this.cfr_renamed_3 = 0;
    }

    public void cfr_renamed_41() {
        if (this.cfr_renamed_4 != null) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4.length) {
                this.cfr_renamed_4[n++] = 0;
                n2 = n;
            }
        }
        this.cfr_renamed_3 = 0;
    }
}

