/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sprpjd;
import java.security.SecureRandom;

public class sprpid
implements sprmf {
    public SecureRandom cfr_renamed_4 = null;

    @Override
    public String cfr_renamed_3389() {
        return sprogb.cfr_renamed_9("Mh;c&");
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
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        int n = arg0[arg0.length - 1] & 0xFF;
        if (n > arg0.length) {
            throw new sprpjd(sprnwj.cfr_renamed_9("c,wmq!|.xmp\"a?f=g(w"));
        }
        return n;
    }
}

