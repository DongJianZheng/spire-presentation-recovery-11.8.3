/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtcz;

public class sprnwc {
    private static final long cfr_renamed_1 = 0xFFFFFFFFFFFFL;
    private static final long cfr_renamed_2 = 64L;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    public void cfr_renamed_3125(long arg0) {
        if ((arg0 & 0xFFFFFFFFFFFFL) != arg0) {
            throw new IllegalArgumentException(sprtcz.cfr_renamed_9("qd3fq79b\"79qve7y1r"));
        }
        if (arg0 <= this.cfr_renamed_4) {
            long l = this.cfr_renamed_4 - arg0;
            if (l < 64L) {
                this.cfr_renamed_3 |= 1L << (int)l;
                return;
            }
        } else {
            sprnwc sprnwc2;
            long l = arg0 - this.cfr_renamed_4;
            if (l >= 64L) {
                sprnwc2 = this;
                this.cfr_renamed_3 = 1L;
            } else {
                sprnwc sprnwc3 = this;
                sprnwc2 = sprnwc3;
                sprnwc3.cfr_renamed_3 <<= (int)l;
                sprnwc3.cfr_renamed_3 |= 1L;
            }
            sprnwc2.cfr_renamed_4 = arg0;
        }
    }

    public void cfr_renamed_41() {
        sprnwc sprnwc2 = this;
        sprnwc2.cfr_renamed_4 = -1L;
        sprnwc2.cfr_renamed_3 = 0L;
    }

    public boolean cfr_renamed_3126(long arg0) {
        if ((arg0 & 0xFFFFFFFFFFFFL) != arg0) {
            return true;
        }
        if (arg0 <= this.cfr_renamed_4) {
            long l = this.cfr_renamed_4 - arg0;
            if (l >= 64L) {
                return true;
            }
            if ((this.cfr_renamed_3 & 1L << (int)l) != 0L) {
                return true;
            }
        }
        return false;
    }

    public sprnwc() {
        sprnwc sprnwc2 = this;
        sprnwc2.cfr_renamed_4 = -1L;
        sprnwc2.cfr_renamed_3 = 0L;
    }
}

