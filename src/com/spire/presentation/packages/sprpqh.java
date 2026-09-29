/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import com.spire.presentation.packages.sprlob;

public class sprpqh
implements sprfo {
    private final int cfr_renamed_3;
    private final long cfr_renamed_4;

    @Override
    public long cfr_renamed_806() {
        return 4L;
    }

    @Override
    public sprfo cfr_renamed_9004() {
        return this;
    }

    @Override
    public int cfr_renamed_8159() {
        return this.cfr_renamed_3;
    }

    public Object cfr_renamed_97() {
        return new Long(this.cfr_renamed_4);
    }

    @Override
    public byte cfr_renamed_324() {
        return 10;
    }

    /*
     * WARNING - void declaration
     */
    public sprpqh(int n, long l) {
        void arg0;
        void arg1;
        if (l > 0xFFFFFFFFL || arg1 < 0L) {
            throw new IllegalArgumentException(sprlob.cfr_renamed_9("bQ\u007fZyIjS+IjS~Z+P~K+Pm\u001fy^eXn"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }
}

