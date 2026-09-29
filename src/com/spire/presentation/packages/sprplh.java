/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.util.Arrays;

public class sprplh
extends sprqqe {
    private final byte[] cfr_renamed_4;

    public sprplh(byte[] byArray) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprfvg(this.cfr_renamed_4);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_4);
        return n;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        if (!super.equals(arg0)) {
            return false;
        }
        sprplh sprplh2 = (sprplh)arg0;
        return Arrays.equals(this.cfr_renamed_4, sprplh2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_8282() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

