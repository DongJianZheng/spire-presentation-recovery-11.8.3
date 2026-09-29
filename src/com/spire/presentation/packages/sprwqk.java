/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprmcs;
import com.spire.presentation.packages.sprrzz;
import com.spire.presentation.packages.sprull;
import java.security.SecureRandom;

public class sprwqk
implements sprcs {
    public SecureRandom cfr_renamed_4 = null;

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n = arg0[arg0.length - 1] & 0xFF;
        if ((arg0.length - n | n - 1) >> 31 != 0) {
            throw new sprull(sprmcs.cfr_renamed_9("kA\u007f\u0000yLtCp\u0000xOiRnPoE\u007f"));
        }
        return n;
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        byte by = (byte)(arg0.length - arg1);
        int n = arg1;
        while (n < arg0.length - 1) {
            arg0[arg1] = this.cfr_renamed_4 == null ? (byte)0 : (byte)this.cfr_renamed_4.nextInt();
            n = ++arg1;
        }
        arg0[arg1] = by;
        return by;
    }

    @Override
    public String cfr_renamed_3389() {
        return sprrzz.cfr_renamed_9("\u001a\u001fl\u0014q");
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
        this.cfr_renamed_4 = arg0;
    }
}

