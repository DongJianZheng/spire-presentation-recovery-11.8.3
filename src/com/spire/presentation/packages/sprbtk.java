/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbad;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.DestroyFailedException;

public class sprbtk
implements sprki {
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final AtomicBoolean cfr_renamed_4;

    public void cfr_renamed_5944() {
        if (this.isDestroyed()) {
            throw new IllegalStateException(sprbad.cfr_renamed_9("8\u0011(\u0011|\u0018=\u0003|\u00129\u00152P8\u0015/\u0004.\u001f%\u00158"));
        }
    }

    @Override
    public byte[] cfr_renamed_3880() {
        sprbtk sprbtk2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprbtk2.cfr_renamed_3);
        sprbtk2.cfr_renamed_5944();
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbtk(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprbtk sprbtk2 = this;
        sprbtk sprbtk3 = this;
        sprbtk3.cfr_renamed_4 = new AtomicBoolean(false);
        sprbtk2.cfr_renamed_3 = arg0;
        sprbtk2.cfr_renamed_2 = byArray2;
    }

    @Override
    public void destroy() throws DestroyFailedException {
        if (!this.cfr_renamed_4.getAndSet(true)) {
            sprbtk sprbtk2 = this;
            sproze.cfr_renamed_3408(sprbtk2.cfr_renamed_3);
            sproze.cfr_renamed_3408(sprbtk2.cfr_renamed_2);
        }
    }

    @Override
    public boolean isDestroyed() {
        return this.cfr_renamed_4.get();
    }

    @Override
    public byte[] cfr_renamed_5684() {
        sprbtk sprbtk2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprbtk2.cfr_renamed_2);
        sprbtk2.cfr_renamed_5944();
        return byArray;
    }
}

