/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdwy;
import com.spire.presentation.packages.sprdzk;
import com.spire.presentation.packages.sprwn;

public class sprowk
implements sprwn {
    private sprdzk cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (this.cfr_renamed_4 == null) {
            sprowk sprowk2 = this;
            sprowk2.cfr_renamed_4 = new sprdzk();
        }
        this.cfr_renamed_4.cfr_renamed_5535(arg0, arg1);
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprdwy.cfr_renamed_9("\u000b1\u0018B<\f>\u000b7\u0007y\f6\u0016y\u000b7\u000b-\u000b8\u000e0\u0011<\u0006"));
        }
        sprowk sprowk2 = this;
        return sprowk2.cfr_renamed_4.cfr_renamed_3610(sprowk2.cfr_renamed_4.cfr_renamed_3611(this.cfr_renamed_4.cfr_renamed_3612(arg0, arg1, arg2)));
    }

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_4.cfr_renamed_1339();
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_4.cfr_renamed_1344();
    }
}

