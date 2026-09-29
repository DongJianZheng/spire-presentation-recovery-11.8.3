/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprau;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrzk;

public class sprhrk
implements sprau {
    private byte[] cfr_renamed_3;
    private long[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_3237(byte[] arg0) {
        int n;
        long[] lArray = this.cfr_renamed_4[arg0[15] & 0xFF];
        long l = lArray[0];
        long l2 = lArray[1];
        int n2 = n = 14;
        while (n2 >= 0) {
            lArray = this.cfr_renamed_4[arg0[n] & 0xFF];
            long l3 = l2 << 56;
            l2 = lArray[1] ^ (l2 >>> 8 | l << 56);
            l = lArray[0] ^ l >>> 8 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
            n2 = --n;
        }
        sprpxe.cfr_renamed_450(l, arg0, 0);
        sprpxe.cfr_renamed_450(l2, arg0, 8);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        int n;
        sprhrk sprhrk2;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new long[256][2];
            sprhrk2 = this;
        } else {
            if (0 != sprrzk.cfr_renamed_92(this.cfr_renamed_3, arg0)) {
                return;
            }
            sprhrk2 = this;
        }
        sprhrk2.cfr_renamed_3 = new byte[16];
        sprhrk sprhrk3 = this;
        sprrzk.cfr_renamed_10068(arg0, sprhrk3.cfr_renamed_3);
        sprrzk.cfr_renamed_3450(sprhrk3.cfr_renamed_3, this.cfr_renamed_4[1]);
        sprrzk.cfr_renamed_10069(sprhrk3.cfr_renamed_4[1], this.cfr_renamed_4[1]);
        int n2 = n = 2;
        while (n2 < 256) {
            sprhrk sprhrk4 = this;
            sprrzk.cfr_renamed_10071(this.cfr_renamed_4[n >> 1], sprhrk4.cfr_renamed_4[n]);
            long[] lArray = sprhrk4.cfr_renamed_4[n];
            int n3 = n + 1;
            sprrzk.cfr_renamed_3446(lArray, this.cfr_renamed_4[1], this.cfr_renamed_4[n3]);
            n2 = n += 2;
        }
    }
}

