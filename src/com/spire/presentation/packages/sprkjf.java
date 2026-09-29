/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.DestroyFailedException;

public class sprkjf
implements sprki {
    private final byte[] cfr_renamed_2;
    private final AtomicBoolean cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_3880() {
        sprkjf sprkjf2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprkjf2.cfr_renamed_2);
        sprkjf2.cfr_renamed_5944();
        return byArray;
    }

    public void cfr_renamed_5944() {
        if (this.isDestroyed()) {
            throw new IllegalStateException(sprizda.cfr_renamed_9("$c4c`j!q``%g.\"$g3v2m9g$"));
        }
    }

    @Override
    public boolean isDestroyed() {
        return this.cfr_renamed_3.get();
    }

    @Override
    public byte[] cfr_renamed_5684() {
        sprkjf sprkjf2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprkjf2.cfr_renamed_4);
        sprkjf2.cfr_renamed_5944();
        return byArray;
    }

    @Override
    public void destroy() throws DestroyFailedException {
        if (!this.cfr_renamed_3.getAndSet(true)) {
            sprkjf sprkjf2 = this;
            sproze.cfr_renamed_3408(sprkjf2.cfr_renamed_2);
            sproze.cfr_renamed_3408(sprkjf2.cfr_renamed_4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkjf(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprkjf sprkjf2 = this;
        sprkjf sprkjf3 = this;
        sprkjf3.cfr_renamed_3 = new AtomicBoolean(false);
        sprkjf2.cfr_renamed_2 = arg0;
        sprkjf2.cfr_renamed_4 = byArray2;
    }
}

