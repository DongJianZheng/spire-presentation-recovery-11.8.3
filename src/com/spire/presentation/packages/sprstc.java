/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsdp;
import com.spire.presentation.packages.sprtj;
import com.spire.presentation.packages.sprvzca;

public class sprstc
implements sprtj {
    private final sprtj cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_3301(byte[] arg0, int arg1, int arg2) {
        sprstc sprstc2 = this;
        synchronized (sprstc2) {
            int n;
            int n2 = n = 0;
            while (n2 < arg2) {
                if (this.cfr_renamed_3 < 1) {
                    sprstc sprstc3 = this;
                    sprstc3.cfr_renamed_2.cfr_renamed_3240(sprstc3.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                    this.cfr_renamed_3 = this.cfr_renamed_4.length;
                }
                int n3 = arg1 + n;
                arg0[n3] = this.cfr_renamed_4[--this.cfr_renamed_3];
                n2 = ++n;
            }
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
        sprstc sprstc2 = this;
        synchronized (sprstc2) {
            this.cfr_renamed_3 = 0;
            this.cfr_renamed_2.cfr_renamed_1353(arg0);
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
    public void cfr_renamed_3290(long arg0) {
        sprstc sprstc2 = this;
        synchronized (sprstc2) {
            this.cfr_renamed_3 = 0;
            this.cfr_renamed_2.cfr_renamed_3290(arg0);
            return;
        }
    }

    @Override
    public void cfr_renamed_1354(byte[] arg0) {
        this.cfr_renamed_3301(arg0, 0, arg0.length);
    }

    @Override
    public void cfr_renamed_3240(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3301(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprstc(sprtj sprtj2, int n) {
        void arg0;
        void arg1;
        if (sprtj2 == null) {
            throw new IllegalArgumentException(sprsdp.cfr_renamed_9("\u001eM\u0017M\u000bI\rG\u000b\b\u001aI\u0017F\u0016\\YJ\u001c\b\u0017]\u0015D"));
        }
        if (arg1 < 2) {
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9("\u000f\t\u0016\u0004\u0017\u0017+\t\u0002\u0005X\r\r\u0013\f@\u001a\u0005X\u0001\f@\u0014\u0005\u0019\u0013\f@J"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = new byte[arg1];
    }
}

