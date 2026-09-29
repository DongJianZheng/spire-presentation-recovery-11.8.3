/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprven;

@sprtea
public class spragn
extends spreen {
    private spreen cfr_renamed_91;
    private boolean cfr_renamed_1;
    private sprven cfr_renamed_2;
    private long cfr_renamed_3;
    private static long cfr_renamed_4 = -99L;

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            this.cfr_renamed_2.cfr_renamed_11596(arg0, arg1, arg2);
        }
        this.cfr_renamed_91.cfr_renamed_4924(arg0, arg1, arg2);
    }

    @Override
    public void dispose() {
        this.cfr_renamed_2637();
    }

    public void cfr_renamed_12081(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public spragn(spreen arg0, long arg1, boolean arg2) {
        long l = arg1;
        this(arg2, l, arg0);
        if (l < 0L) {
            throw new IllegalArgumentException("length");
        }
    }

    @Override
    public void cfr_renamed_11561(long arg0) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spragn(boolean bl, long l, spreen spreen2) {
        void arg1;
        void arg2;
        spragn spragn2 = this;
        spragn spragn3 = this;
        spragn3.cfr_renamed_3 = -99L;
        spragn3.cfr_renamed_91 = arg2;
        spragn spragn4 = this;
        spragn3.cfr_renamed_2 = new sprven();
        spragn2.cfr_renamed_3 = arg1;
        spragn2.cfr_renamed_1 = bl;
    }

    @Override
    public boolean cfr_renamed_11557() {
        return this.cfr_renamed_91.cfr_renamed_11557();
    }

    public int cfr_renamed_11732() {
        return this.cfr_renamed_2.cfr_renamed_11600();
    }

    @Override
    public void cfr_renamed_11548(long arg0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long cfr_renamed_11547(long arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long cfr_renamed_806() {
        if (this.cfr_renamed_3 == cfr_renamed_4) {
            return this.cfr_renamed_91.cfr_renamed_806();
        }
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_12082() {
        return this.cfr_renamed_1;
    }

    @Override
    public boolean cfr_renamed_11552() {
        return this.cfr_renamed_91.cfr_renamed_11552();
    }

    public spragn(spreen arg0) {
        this(true, cfr_renamed_4, arg0);
    }

    @Override
    public boolean cfr_renamed_11560() {
        return this.cfr_renamed_91.cfr_renamed_11560();
    }

    @Override
    public void cfr_renamed_2637() {
        spragn spragn2 = this;
        super.cfr_renamed_2637();
        if (!spragn2.cfr_renamed_1) {
            this.cfr_renamed_91.cfr_renamed_2637();
        }
    }

    @Override
    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = arg2;
        if (this.cfr_renamed_3 != cfr_renamed_4) {
            if (this.cfr_renamed_2.cfr_renamed_11603() >= this.cfr_renamed_3) {
                return 0;
            }
            long l = this.cfr_renamed_3 - this.cfr_renamed_2.cfr_renamed_11603();
            if (l < (long)arg2) {
                n2 = (int)l;
            }
        }
        if ((n = this.cfr_renamed_91.cfr_renamed_11556(arg0, arg1, n2)) > 0) {
            this.cfr_renamed_2.cfr_renamed_11596(arg0, arg1, n);
        }
        return n;
    }

    @Override
    public void cfr_renamed_2947() {
        this.cfr_renamed_91.cfr_renamed_2947();
    }

    public long cfr_renamed_11921() {
        return this.cfr_renamed_2.cfr_renamed_11603();
    }

    @Override
    public long cfr_renamed_3274() {
        return this.cfr_renamed_2.cfr_renamed_11603();
    }

    public spragn(spreen arg0, long arg1) {
        long l = arg1;
        this(true, l, arg0);
        if (l < 0L) {
            throw new IllegalArgumentException("length");
        }
    }

    public spragn(spreen arg0, boolean arg1) {
        this(arg1, cfr_renamed_4, arg0);
    }
}

