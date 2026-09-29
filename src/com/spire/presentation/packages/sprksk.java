/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprau;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrzk;

public class sprksk
implements sprau {
    private long[][][] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        int n;
        sprksk sprksk2;
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new long[2][256][2];
            sprksk2 = this;
        } else {
            if (0 != sprrzk.cfr_renamed_92(this.cfr_renamed_4, arg0)) {
                return;
            }
            sprksk2 = this;
        }
        sprksk2.cfr_renamed_4 = new byte[16];
        sprrzk.cfr_renamed_10068(arg0, this.cfr_renamed_4);
        int n2 = n = 0;
        while (n2 < 2) {
            int n3;
            long[][] lArray = this.cfr_renamed_3[n];
            sprksk sprksk3 = this;
            if (n == 0) {
                sprrzk.cfr_renamed_3450(sprksk3.cfr_renamed_4, lArray[1]);
                sprrzk.cfr_renamed_10069(lArray[1], lArray[1]);
            } else {
                sprrzk.cfr_renamed_10070(sprksk3.cfr_renamed_3[n - 1][1], lArray[1]);
            }
            int n4 = n3 = 2;
            while (n4 < 256) {
                int n5 = n3;
                sprrzk.cfr_renamed_10071(lArray[n5 >> 1], lArray[n3]);
                int n6 = n3 + 1;
                sprrzk.cfr_renamed_3446(lArray[n5], lArray[1], lArray[n6]);
                n4 = n3 += 2;
            }
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_3237(byte[] arg0) {
        int n;
        sprksk sprksk2 = this;
        long[][] lArray = sprksk2.cfr_renamed_3[0];
        long[][] lArray2 = sprksk2.cfr_renamed_3[1];
        long[] lArray3 = lArray[arg0[14] & 0xFF];
        long[] lArray4 = lArray2[arg0[15] & 0xFF];
        long l = lArray3[0] ^ lArray4[0];
        long l2 = lArray3[1] ^ lArray4[1];
        int n2 = n = 12;
        while (n2 >= 0) {
            lArray3 = lArray[arg0[n] & 0xFF];
            lArray4 = lArray2[arg0[n + 1] & 0xFF];
            long l3 = l2 << 48;
            l2 = lArray3[1] ^ lArray4[1] ^ (l2 >>> 16 | l << 48);
            l = lArray3[0] ^ lArray4[0] ^ l >>> 16 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
            n2 = n -= 2;
        }
        sprpxe.cfr_renamed_450(l, arg0, 0);
        sprpxe.cfr_renamed_450(l2, arg0, 8);
    }
}

