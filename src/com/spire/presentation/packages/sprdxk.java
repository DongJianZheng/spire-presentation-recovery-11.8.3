/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprzpf;

public class sprdxk
implements sprbj {
    private sprquk cfr_renamed_2;
    private sprryk cfr_renamed_3;
    private sprquk cfr_renamed_4;

    public sprryk cfr_renamed_2096() {
        return this.cfr_renamed_3;
    }

    public sprdxk(sprquk arg0, sprquk arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprdxk(sprquk sprquk2, sprquk sprquk3, sprryk sprryk2) {
        sprdxk sprdxk2;
        sprryk arg2;
        void arg0;
        void arg1;
        if (sprquk2 == null) {
            throw new NullPointerException(sprzpf.cfr_renamed_9("*o8o0x\ti0m8o<P<byx8u7t-;;~yu,w5"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprosc.cfr_renamed_9("\u0006Z\u000bO\u000eO\u0011K\u000fz\u0011C\u0015K\u0017O(O\u001a\n\u0000K\rD\f^CH\u0006\n\r_\u000fF"));
        }
        sprwsk sprwsk2 = arg0.cfr_renamed_284();
        if (!sprwsk2.equals(arg1.cfr_renamed_284())) {
            throw new IllegalArgumentException(sprzpf.cfr_renamed_9("H-z-r:;8u=;<k1~4~+z5;)i0m8o<;2~ hys8m<;=r?}<i<u-;=t4z0uyk8i8v<o<i*"));
        }
        if (arg2 == null) {
            arg2 = new sprryk(sprwsk2.cfr_renamed_1145().modPow(arg1.cfr_renamed_1980(), sprwsk2.cfr_renamed_1155()), sprwsk2);
            sprdxk2 = this;
        } else {
            if (!sprwsk2.equals(arg2.cfr_renamed_284())) {
                throw new IllegalArgumentException(sprosc.cfr_renamed_9("&Z\u000bO\u000eO\u0011K\u000f\n\u0013_\u0001F\nICA\u0006SCB\u0002YCN\nL\u0005O\u0011O\r^CN\fG\u0002C\r\n\u0013K\u0011K\u000eO\u0017O\u0011Y"));
            }
            sprdxk2 = this;
        }
        sprdxk2.cfr_renamed_2 = arg0;
        sprdxk sprdxk3 = this;
        sprdxk3.cfr_renamed_4 = arg1;
        sprdxk3.cfr_renamed_3 = arg2;
    }

    public sprquk cfr_renamed_2094() {
        return this.cfr_renamed_4;
    }

    public sprquk cfr_renamed_2095() {
        return this.cfr_renamed_2;
    }
}

