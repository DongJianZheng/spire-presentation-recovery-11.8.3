/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctr;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzra;

public class sprirc
implements sprzc {
    public spruuc cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    @Override
    public synchronized byte[] cfr_renamed_2811() {
        return this.cfr_renamed_4;
    }

    @Override
    public synchronized void cfr_renamed_2812() {
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_722();
            this.cfr_renamed_3 = null;
        }
    }

    @Override
    public synchronized spruuc cfr_renamed_2813() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_461();
    }

    /*
     * WARNING - void declaration
     */
    public sprirc(byte[] byArray, spruuc spruuc2) {
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprhsh.cfr_renamed_9("f $ 2:.=\b\u0017fs\"2/=.'a1$s/&-?"));
        }
        if (((void)arg0).length < 1 || ((void)arg0).length > 32) {
            throw new IllegalArgumentException(sprctr.cfr_renamed_9("b! !6;*<\f\u0016br('6&e:$$ r)7+51:e0 &27 <ece3+6eawr'+176~e;+1)'6;37"));
        }
        this.cfr_renamed_4 = sprzra.cfr_renamed_158((byte[])arg0);
        this.cfr_renamed_3 = arg1;
    }

    @Override
    public synchronized boolean cfr_renamed_2814() {
        return this.cfr_renamed_3 != null;
    }
}

