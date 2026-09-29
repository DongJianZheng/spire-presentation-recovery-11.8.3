/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import java.util.Date;

public class sprfph
implements sprfo {
    private final int cfr_renamed_3;
    private final long cfr_renamed_4;

    @Override
    public sprfo cfr_renamed_9004() {
        return this;
    }

    @Override
    public long cfr_renamed_806() {
        return 8L;
    }

    @Override
    public byte cfr_renamed_324() {
        return 9;
    }

    public Object cfr_renamed_97() {
        return new Date(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_8159() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfph(int n, Date date) {
        void arg0;
        sprfph sprfph2 = this;
        sprfph2.cfr_renamed_3 = arg0;
        sprfph2.cfr_renamed_4 = date.getTime();
    }
}

