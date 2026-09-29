/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprlik;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprjuk
implements sprcs {
    public SecureRandom cfr_renamed_4;

    @Override
    public String cfr_renamed_3389() {
        return sprfbp.cfr_renamed_9("TLR.-./)0-");
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
        this.cfr_renamed_4 = sprybl.cfr_renamed_5688(arg0);
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n = arg0[arg0.length - 1] & 0xFF;
        if ((arg0.length - n | n - 1) >> 31 != 0) {
            throw new sprull(sprlik.cfr_renamed_9("\n:\u001e{\u00187\u00158\u0011{\u00194\b)\u000f+\u000e>\u001e"));
        }
        return n;
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

