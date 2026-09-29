/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.TextHighLightingOptions;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprpjd;
import java.security.SecureRandom;

public class sprzcd
implements sprmf {
    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n = arg0.length - arg1;
        int n2 = arg1;
        while (n2 < arg0.length) {
            arg0[arg1++] = 0;
            n2 = arg1;
        }
        return n;
    }

    @Override
    public String cfr_renamed_3389() {
        return TextHighLightingOptions.cfr_renamed_9("=\u0002\u0015\b%\u001e\u0013\u0002");
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        byte[] byArray;
        int n;
        block2: {
            int n2 = n = arg0.length;
            while (n2 > 0) {
                if (arg0[n - 1] != 0) {
                    byArray = arg0;
                    break block2;
                }
                n2 = --n;
            }
            byArray = arg0;
        }
        return byArray.length - n;
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }
}

