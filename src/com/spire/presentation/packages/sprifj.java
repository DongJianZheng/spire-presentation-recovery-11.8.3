/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczx;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sprifj
implements Runnable {
    private final LinkedList<Runnable> cfr_renamed_3;
    private static final Logger cfr_renamed_4 = Logger.getLogger(sprifj.class.getName());

    public sprifj() {
        sprifj sprifj2 = this;
        sprifj2.cfr_renamed_3 = new LinkedList();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_9321(Runnable arg0) {
        LinkedList<Runnable> linkedList = this.cfr_renamed_3;
        synchronized (linkedList) {
            this.cfr_renamed_3.add(arg0);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                if (!cfr_renamed_4.isLoggable(Level.FINE)) return;
                cfr_renamed_4.fine(sprczx.cfr_renamed_9("\u001f\u001f\u000e\u0003\u0015\u0001\u0003Q\u000e\u0019\b\u0014\u001b\u0015Z\u0018\u0014\u0005\u001f\u0003\b\u0004\n\u0005\u001f\u0015Z\\Z\u0014\u0002\u0018\u000e\u0018\u0014\u0016"));
                return;
            }
            LinkedList<Runnable> linkedList = this.cfr_renamed_3;
            // MONITORENTER : linkedList
            Runnable runnable = this.cfr_renamed_3.poll();
            // MONITOREXIT : linkedList
            if (runnable != null) {
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {}
                continue;
            }
            try {
                Thread.sleep(5000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                continue;
            }
            break;
        }
    }
}

