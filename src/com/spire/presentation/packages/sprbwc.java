/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprtj;

public class sprbwc
implements sprtj {
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private static long cfr_renamed_1 = 10L;
    private sprlc cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3240(byte[] arg0, int arg1, int arg2) {
        sprbwc sprbwc2 = this;
        synchronized (sprbwc2) {
            int n;
            int n2 = 0;
            this.cfr_renamed_3331();
            int n3 = arg1 + arg2;
            int n4 = n = arg1;
            while (n4 != n3) {
                if (n2 == this.cfr_renamed_0.length) {
                    this.cfr_renamed_3331();
                    n2 = 0;
                }
                byte by = this.cfr_renamed_0[n2];
                ++n2;
                arg0[n++] = by;
                n4 = n;
            }
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_3331() {
        sprbwc sprbwc2 = this;
        sprbwc2.cfr_renamed_3332(sprbwc2.cfr_renamed_4++);
        sprbwc sprbwc3 = this;
        sprbwc3.cfr_renamed_3333(sprbwc3.cfr_renamed_0);
        sprbwc3.cfr_renamed_3333(sprbwc3.cfr_renamed_91);
        sprbwc3.cfr_renamed_3334(sprbwc3.cfr_renamed_0);
        if (sprbwc3.cfr_renamed_4 % cfr_renamed_1 == 0L) {
            this.cfr_renamed_3335();
        }
    }

    private /* synthetic */ void cfr_renamed_3335() {
        sprbwc sprbwc2 = this;
        sprbwc2.cfr_renamed_3333(sprbwc2.cfr_renamed_91);
        sprbwc2.cfr_renamed_3332(sprbwc2.cfr_renamed_3++);
        sprbwc sprbwc3 = this;
        sprbwc3.cfr_renamed_3334(sprbwc3.cfr_renamed_91);
    }

    @Override
    public void cfr_renamed_1354(byte[] arg0) {
        this.cfr_renamed_3240(arg0, 0, arg0.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3290(long arg0) {
        sprbwc sprbwc2 = this;
        synchronized (sprbwc2) {
            sprbwc sprbwc3 = this;
            sprbwc3.cfr_renamed_3332(arg0);
            sprbwc3.cfr_renamed_3333(sprbwc3.cfr_renamed_91);
            sprbwc3.cfr_renamed_3334(sprbwc3.cfr_renamed_91);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_1353(byte[] arg0) {
        sprbwc sprbwc2 = this;
        synchronized (sprbwc2) {
            sprbwc sprbwc3 = this;
            sprbwc3.cfr_renamed_3333(arg0);
            sprbwc3.cfr_renamed_3333(sprbwc3.cfr_renamed_91);
            sprbwc3.cfr_renamed_3334(sprbwc3.cfr_renamed_91);
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_3332(long arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != 8) {
            long l = arg0;
            this.cfr_renamed_2.cfr_renamed_1221((byte)l);
            arg0 = l >>> 8;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3333(byte[] arg0) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    private /* synthetic */ void cfr_renamed_3334(byte[] arg0) {
        this.cfr_renamed_2.cfr_renamed_1219(arg0, 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprbwc(sprlc sprlc2) {
        void arg0;
        sprbwc sprbwc2 = this;
        sprbwc sprbwc3 = this;
        this.cfr_renamed_2 = arg0;
        sprbwc3.cfr_renamed_91 = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
        sprbwc3.cfr_renamed_3 = 1L;
        sprbwc2.cfr_renamed_0 = new byte[arg0.cfr_renamed_1218()];
        sprbwc2.cfr_renamed_4 = 1L;
    }
}

