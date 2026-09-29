/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprlfn
extends spreen {
    private long cfr_renamed_2;
    private spreen cfr_renamed_3;
    private long cfr_renamed_4;

    public void cfr_renamed_11922(long arg0) {
        sprlfn sprlfn2 = this;
        sprlfn2.cfr_renamed_2 -= arg0;
        if (sprlfn2.cfr_renamed_2 < 0L) {
            throw new IllegalStateException();
        }
        if (spresca.cfr_renamed_11777(this.cfr_renamed_3, sprlfn.class) != null) {
            ((sprlfn)this.cfr_renamed_3).cfr_renamed_11922(arg0);
        }
    }

    @Override
    public boolean cfr_renamed_11552() {
        return this.cfr_renamed_3.cfr_renamed_11552();
    }

    @Override
    public void cfr_renamed_11561(long arg0) {
        this.cfr_renamed_3.cfr_renamed_11561(arg0);
    }

    public sprlfn(spreen spreen2) {
        this.cfr_renamed_3 = spreen2;
    }

    @Override
    public boolean cfr_renamed_11557() {
        return this.cfr_renamed_3.cfr_renamed_11557();
    }

    @Override
    public long cfr_renamed_806() {
        return this.cfr_renamed_3.cfr_renamed_806();
    }

    @Override
    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        sprlfn sprlfn2 = this;
        int n = sprlfn2.cfr_renamed_3.cfr_renamed_11556(arg0, arg1, arg2);
        sprlfn2.cfr_renamed_4 += (long)n;
        return n;
    }

    @Override
    public void cfr_renamed_11548(long arg0) {
        this.cfr_renamed_3.cfr_renamed_11547(arg0, 0);
    }

    @Override
    public boolean cfr_renamed_11560() {
        return this.cfr_renamed_3.cfr_renamed_11560();
    }

    public long cfr_renamed_11778() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_2947() {
        this.cfr_renamed_3.cfr_renamed_2947();
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        sprlfn sprlfn2 = this;
        sprlfn2.cfr_renamed_3.cfr_renamed_4924(arg0, arg1, arg2);
        sprlfn2.cfr_renamed_2 += (long)arg2;
    }

    @Override
    public long cfr_renamed_3274() {
        return this.cfr_renamed_3.cfr_renamed_3274();
    }

    @Override
    public long cfr_renamed_11547(long arg0, int arg1) {
        return this.cfr_renamed_3.cfr_renamed_11547(arg0, arg1);
    }
}

