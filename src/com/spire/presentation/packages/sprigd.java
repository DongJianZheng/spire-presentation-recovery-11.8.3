/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprpjd;
import java.security.SecureRandom;

public class sprigd
implements sprmf {
    @Override
    public String cfr_renamed_3389() {
        return spramk.cfr_renamed_9("dzb\u001e\u0015\u0018\u001b\u0004\u0019");
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n = arg0.length - arg1;
        arg0[arg1++] = -128;
        int n2 = arg1;
        while (n2 < arg0.length) {
            arg0[arg1++] = 0;
            n2 = arg1;
        }
        return n;
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 > 0 && arg0[n] == 0) {
            n2 = --n;
        }
        if (arg0[n] != -128) {
            throw new sprpjd(sprfql.cfr_renamed_9("Iw]6[zVuR6ZyKdLfMs]"));
        }
        return arg0.length - n;
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }
}

