/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprtno;
import com.spire.presentation.packages.sprybo;
import java.security.SecureRandom;

public class sprsdd
implements sprmf {
    public SecureRandom cfr_renamed_4;

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        int n = arg0[arg0.length - 1] & 0xFF;
        if (n > arg0.length) {
            throw new sprpjd(sprybo.cfr_renamed_9("v<b}d1i>m}e2t/s-r8b"));
        }
        return n;
    }

    @Override
    public String cfr_renamed_3389() {
        return sprtno.cfr_renamed_9("\u0003A\u0005#z#x$g ");
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
        if (arg0 != null) {
            this.cfr_renamed_4 = arg0;
            return;
        }
        this.cfr_renamed_4 = new SecureRandom();
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        byte by = (byte)(arg0.length - arg1);
        int n = arg1;
        while (n < arg0.length - 1) {
            arg0[arg1++] = (byte)this.cfr_renamed_4.nextInt();
            n = arg1;
        }
        arg0[arg1] = by;
        return by;
    }
}

