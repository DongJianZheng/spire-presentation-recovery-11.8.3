/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwlp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

public class sprhei
implements AlgorithmParameterSpec,
Destroyable {
    private volatile byte[] cfr_renamed_2;
    private volatile AlgorithmParameterSpec cfr_renamed_3;
    private final AtomicBoolean cfr_renamed_4;

    public byte[] cfr_renamed_1144() {
        sprhei sprhei2 = this;
        byte[] byArray = sprhei2.cfr_renamed_2;
        sprhei2.cfr_renamed_5944();
        return byArray;
    }

    @Override
    public void destroy() {
        if (!this.cfr_renamed_4.getAndSet(true)) {
            sprhei sprhei2 = this;
            sproze.cfr_renamed_3408(this.cfr_renamed_2);
            sprhei2.cfr_renamed_2 = null;
            sprhei2.cfr_renamed_3 = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhei(byte[] byArray, AlgorithmParameterSpec algorithmParameterSpec) {
        void arg0;
        sprhei sprhei2 = this;
        sprhei sprhei3 = this;
        sprhei3.cfr_renamed_4 = new AtomicBoolean(false);
        sprhei2.cfr_renamed_2 = arg0;
        sprhei2.cfr_renamed_3 = algorithmParameterSpec;
    }

    @Override
    public boolean isDestroyed() {
        return this.cfr_renamed_4.get();
    }

    public AlgorithmParameterSpec cfr_renamed_9203() {
        sprhei sprhei2 = this;
        AlgorithmParameterSpec algorithmParameterSpec = sprhei2.cfr_renamed_3;
        sprhei2.cfr_renamed_5944();
        return algorithmParameterSpec;
    }

    private /* synthetic */ void cfr_renamed_5944() {
        if (this.isDestroyed()) {
            throw new IllegalStateException(sprwlp.cfr_renamed_9("|\u0004j\u0017/\u001cn\u0007/\u0016j\u0011aTk\u0011|\u0000}\u001bv\u0011k"));
        }
    }
}

