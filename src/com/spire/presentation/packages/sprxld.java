/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjd;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprpdi;
import com.spire.presentation.packages.sprt;

public class sprxld
implements sprh {
    private sprcjd cfr_renamed_4;

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_4.cfr_renamed_1339();
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_4.cfr_renamed_1344();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (this.cfr_renamed_4 == null) {
            sprxld sprxld2 = this;
            sprxld2.cfr_renamed_4 = new sprcjd();
        }
        this.cfr_renamed_4.cfr_renamed_1217(arg0, arg1);
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprpdi.cfr_renamed_9("(X;+\u001fe\u001db\u0014nZe\u0015\u007fZb\u0014b\u000eb\u001bg\u0013x\u001fo"));
        }
        sprxld sprxld2 = this;
        return sprxld2.cfr_renamed_4.cfr_renamed_3610(sprxld2.cfr_renamed_4.cfr_renamed_3611(this.cfr_renamed_4.cfr_renamed_3612(arg0, arg1, arg2)));
    }
}

