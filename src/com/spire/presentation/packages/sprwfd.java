/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqufa;
import com.spire.presentation.packages.sprysb;
import java.security.SecureRandom;

public class sprwfd
implements sprmf {
    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        byte by = (byte)(arg0.length - arg1);
        int n = arg1;
        while (n < arg0.length) {
            arg0[arg1++] = by;
            n = arg1;
        }
        return by;
    }

    @Override
    public String cfr_renamed_3389() {
        return "PKCS7";
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprpjd {
        int n;
        int n2 = arg0[arg0.length - 1] & 0xFF;
        if (n2 > arg0.length || n2 == 0) {
            throw new sprpjd(sprysb.cfr_renamed_9("2\u0014&U \u0019-\u0016)U!\u001a0\u00077\u00056\u0010&"));
        }
        int n3 = n = 1;
        while (n3 <= n2) {
            if (arg0[arg0.length - n] != n2) {
                throw new sprpjd(sprqufa.cfr_renamed_9("/\r;L=\u00000\u000f4L<\u0003-\u001e*\u001c+\t;"));
            }
            n3 = ++n;
        }
        return n2;
    }
}

