/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruw;

public class sprtek
implements spruw {
    private sprgf cfr_renamed_91;
    private long cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private long cfr_renamed_2;
    private static long cfr_renamed_3 = 10L;
    private byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3333(byte[] arg0) {
        this.cfr_renamed_91.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3290(long arg0) {
        sprtek sprtek2 = this;
        synchronized (sprtek2) {
            sprtek sprtek3 = this;
            sprtek3.cfr_renamed_3332(arg0);
            sprtek3.cfr_renamed_3333(sprtek3.cfr_renamed_1);
            sprtek3.cfr_renamed_3334(sprtek3.cfr_renamed_1);
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_3334(byte[] arg0) {
        this.cfr_renamed_91.cfr_renamed_1219(arg0, 0);
    }

    @Override
    public void cfr_renamed_1354(byte[] arg0) {
        this.cfr_renamed_3240(arg0, 0, arg0.length);
    }

    private /* synthetic */ void cfr_renamed_3331() {
        sprtek sprtek2 = this;
        sprtek2.cfr_renamed_3332(sprtek2.cfr_renamed_2++);
        sprtek sprtek3 = this;
        sprtek3.cfr_renamed_3333(sprtek3.cfr_renamed_4);
        sprtek3.cfr_renamed_3333(sprtek3.cfr_renamed_1);
        sprtek3.cfr_renamed_3334(sprtek3.cfr_renamed_4);
        if (sprtek3.cfr_renamed_2 % cfr_renamed_3 == 0L) {
            this.cfr_renamed_3335();
        }
    }

    private /* synthetic */ void cfr_renamed_3332(long arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != 8) {
            long l = arg0;
            this.cfr_renamed_91.cfr_renamed_1221((byte)l);
            arg0 = l >>> 8;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3335() {
        sprtek sprtek2 = this;
        sprtek2.cfr_renamed_3333(sprtek2.cfr_renamed_1);
        sprtek2.cfr_renamed_3332(sprtek2.cfr_renamed_0++);
        sprtek sprtek3 = this;
        sprtek3.cfr_renamed_3334(sprtek3.cfr_renamed_1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_1353(byte[] arg0) {
        sprtek sprtek2 = this;
        synchronized (sprtek2) {
            if (!sproze.cfr_renamed_5247(arg0)) {
                this.cfr_renamed_3333(arg0);
            }
            sprtek sprtek3 = this;
            sprtek3.cfr_renamed_3333(sprtek3.cfr_renamed_1);
            sprtek3.cfr_renamed_3334(sprtek3.cfr_renamed_1);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtek(sprgf sprgf2) {
        void arg0;
        sprtek sprtek2 = this;
        sprtek sprtek3 = this;
        this.cfr_renamed_91 = arg0;
        sprtek3.cfr_renamed_1 = new byte[this.cfr_renamed_91.cfr_renamed_1218()];
        sprtek3.cfr_renamed_0 = 1L;
        sprtek2.cfr_renamed_4 = new byte[arg0.cfr_renamed_1218()];
        sprtek2.cfr_renamed_2 = 1L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3240(byte[] arg0, int arg1, int arg2) {
        sprtek sprtek2 = this;
        synchronized (sprtek2) {
            int n;
            int n2 = 0;
            this.cfr_renamed_3331();
            int n3 = arg1 + arg2;
            int n4 = n = arg1;
            while (n4 != n3) {
                if (n2 == this.cfr_renamed_4.length) {
                    this.cfr_renamed_3331();
                    n2 = 0;
                }
                byte by = this.cfr_renamed_4[n2];
                ++n2;
                arg0[n++] = by;
                n4 = n;
            }
            return;
        }
    }
}

