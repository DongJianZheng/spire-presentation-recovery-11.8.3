/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprgida;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprxed;

public class sprzkb
implements sprib {
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprlc cfr_renamed_4;

    public sprzkb(sprlc sprlc2) {
        this.cfr_renamed_4 = sprlc2;
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprjkd(sprpgm.cfr_renamed_9("X^C[B_\u0017IBMQNE\u000bCDX\u000bDFVG["));
        }
        long l = arg2 * 8;
        if (l > (long)(this.cfr_renamed_4.cfr_renamed_1218() * 8) * 29L) {
            new IllegalArgumentException(sprgida.cfr_renamed_9("k&P#Q'\u0004?A=C'LsP<\u0004?E!C6"));
        }
        int n2 = (int)(l / (long)this.cfr_renamed_4.cfr_renamed_1218());
        byte[] byArray = null;
        byArray = new byte[this.cfr_renamed_4.cfr_renamed_1218()];
        int n3 = n = 1;
        while (n3 <= n2) {
            sprzkb sprzkb2 = this;
            sprzkb2.cfr_renamed_4.cfr_renamed_1197(sprzkb2.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            sprzkb sprzkb3 = this;
            sprzkb3.cfr_renamed_4.cfr_renamed_1221((byte)(n & 0xFF));
            sprzkb3.cfr_renamed_4.cfr_renamed_1221((byte)(n >> 8 & 0xFF));
            sprzkb3.cfr_renamed_4.cfr_renamed_1221((byte)(n >> 16 & 0xFF));
            sprzkb3.cfr_renamed_4.cfr_renamed_1221((byte)(n >> 24 & 0xFF));
            sprzkb3.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            if (arg2 - arg1 > byArray.length) {
                System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
                arg1 += byArray.length;
            } else {
                int n4 = arg1;
                System.arraycopy(byArray, 0, arg0, n4, arg2 - n4);
            }
            n3 = ++n;
        }
        this.cfr_renamed_4.cfr_renamed_41();
        return arg2;
    }

    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        if (!(arg0 instanceof sprxed)) {
            throw new IllegalArgumentException(sprpgm.cfr_renamed_9("|oq\u000bGJEJZNCNEX\u0017YRZBBENS\u000bQDE\u000b|oq\u0019pNYNEJCDE"));
        }
        sprxed sprxed2 = (sprxed)arg0;
        sprzkb sprzkb2 = this;
        sprzkb2.cfr_renamed_3 = sprxed2.cfr_renamed_2343();
        sprzkb2.cfr_renamed_2 = sprxed2.cfr_renamed_1205();
    }
}

