/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprwmq;
import java.security.SecureRandom;

public class sprlfd
implements sprmf {
    @Override
    public String cfr_renamed_3389() {
        return sprwmq.cfr_renamed_9("QpF");
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        int n;
        byte by = arg0[arg0.length - 1];
        int n2 = n = arg0.length - 1;
        while (n2 > 0 && arg0[n - 1] == by) {
            n2 = --n;
        }
        return arg0.length - n;
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n;
        byte by;
        int n2 = arg0.length - arg1;
        if (arg1 > 0) {
            by = (byte)((arg0[arg1 - 1] & 1) == 0 ? 255 : 0);
            n = arg1;
        } else {
            by = (byte)((arg0[arg0.length - 1] & 1) == 0 ? 255 : 0);
            n = arg1;
        }
        while (n < arg0.length) {
            arg0[arg1++] = by;
            n = arg1;
        }
        return n2;
    }
}

