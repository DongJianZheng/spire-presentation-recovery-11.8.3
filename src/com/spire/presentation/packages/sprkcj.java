/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhmy;
import com.spire.presentation.packages.spriz;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprnraa;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sprkcj
implements Runnable {
    private static final Logger cfr_renamed_0 = Logger.getLogger(sprkcj.class.getName());
    private final AtomicBoolean cfr_renamed_1;
    private final AtomicReference<byte[]> cfr_renamed_2;
    private final spriz cfr_renamed_3;
    private final long cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ long cfr_renamed_9320() {
        String string = sprjcf.cfr_renamed_5153(sprnraa.cfr_renamed_9("=Q3\u0010-N7L;\u0010.M3Q:[2\u0010-[=K,W*GpZ,\\9\u00109_*V;L\u0001N?K-[\u0001M;]-"));
        if (string == null) {
            return 5000L;
        }
        try {
            return Long.parseLong(string) * 1000L;
        }
        catch (Exception exception) {
            return 5000L;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            sprkcj sprkcj2 = this;
            sprkcj2.cfr_renamed_2.set(sprkcj2.cfr_renamed_3.cfr_renamed_9319(this.cfr_renamed_4));
            sprkcj2.cfr_renamed_1.set(true);
            return;
        }
        catch (InterruptedException interruptedException) {
            if (cfr_renamed_0.isLoggable(Level.FINE)) {
                cfr_renamed_0.fine(sprhmy.cfr_renamed_9("\\1M-V/@\u007fK:H*\\,M\u007fP1M:K-L/M:]\u007f\u0014\u007f\\'P+P1^"));
            }
            Thread.currentThread().interrupt();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkcj(spriz spriz2, AtomicBoolean atomicBoolean, AtomicReference<byte[]> atomicReference) {
        void arg1;
        void arg0;
        sprkcj sprkcj2 = this;
        this.cfr_renamed_3 = arg0;
        sprkcj2.cfr_renamed_1 = arg1;
        sprkcj2.cfr_renamed_2 = atomicReference;
        sprkcj2.cfr_renamed_4 = sprkcj.cfr_renamed_9320();
    }
}

