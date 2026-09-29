/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprhxr;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprzto;

@sprtea
public class spryyo
extends sprzto {
    private sprujo cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryyo(spreen spreen2, boolean bl) {
        super(bl);
        void arg0;
        spryyo spryyo2 = this;
        spryyo2.cfr_renamed_4 = new sprujo((spreen)arg0);
    }

    private /* synthetic */ boolean cfr_renamed_17442() {
        return sproup.cfr_renamed_17443(this.cfr_renamed_3, this.cfr_renamed_17439());
    }

    public long cfr_renamed_17444(int arg0) {
        int n;
        if (this.cfr_renamed_4 == false) {
            throw new UnsupportedOperationException(sprhxr.cfr_renamed_9("#\u0005\u0010\u0004\u0018\u000e\u0016@=33@\u001e\u0012\u0015\u0005\u0003\u0005\u0015@\u0007\u0001\u001d\u0015\u0014\u0013Q\t\u0002@\u001f\u000f\u0005@\u0002\u0015\u0001\u0010\u001e\u0012\u0005\u0005\u0015N"));
        }
        if (arg0 < 0 || arg0 > 63) {
            throw new IllegalArgumentException(sprkzn.cfr_renamed_9("]-\u007f-`)y)\u007flc-`)7la)c+y$"));
        }
        if (arg0 == 0) {
            return 0L;
        }
        long l = 0L;
        long l2 = 1 << arg0 - 1;
        int n2 = n = 0;
        while (n2 < arg0) {
            l += this.cfr_renamed_17445() ? l2 : 0L;
            l2 >>= 1;
            n2 = ++n;
        }
        return l;
    }

    public boolean cfr_renamed_17445() {
        if (this.cfr_renamed_2 == 0) {
            this.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_12137();
        }
        spryyo spryyo2 = this;
        boolean bl = spryyo2.cfr_renamed_17442();
        ++spryyo2.cfr_renamed_2;
        if (spryyo2.cfr_renamed_2 == 8) {
            this.cfr_renamed_2 = 0;
        }
        return bl;
    }
}

