/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprau;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrzk;

public class spruuk
implements sprau {
    private long[][][] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3237(byte[] arg0) {
        spruuk spruuk2 = this;
        long[] lArray = spruuk2.cfr_renamed_3[0][arg0[0] & 0xFF];
        long[] lArray2 = spruuk2.cfr_renamed_3[1][arg0[1] & 0xFF];
        long[] lArray3 = spruuk2.cfr_renamed_3[2][arg0[2] & 0xFF];
        long[] lArray4 = spruuk2.cfr_renamed_3[3][arg0[3] & 0xFF];
        long[] lArray5 = spruuk2.cfr_renamed_3[4][arg0[4] & 0xFF];
        long[] lArray6 = spruuk2.cfr_renamed_3[5][arg0[5] & 0xFF];
        long[] lArray7 = spruuk2.cfr_renamed_3[6][arg0[6] & 0xFF];
        long[] lArray8 = spruuk2.cfr_renamed_3[7][arg0[7] & 0xFF];
        long[] lArray9 = spruuk2.cfr_renamed_3[8][arg0[8] & 0xFF];
        long[] lArray10 = spruuk2.cfr_renamed_3[9][arg0[9] & 0xFF];
        long[] lArray11 = spruuk2.cfr_renamed_3[10][arg0[10] & 0xFF];
        long[] lArray12 = spruuk2.cfr_renamed_3[11][arg0[11] & 0xFF];
        long[] lArray13 = spruuk2.cfr_renamed_3[12][arg0[12] & 0xFF];
        long[] lArray14 = spruuk2.cfr_renamed_3[13][arg0[13] & 0xFF];
        long[] lArray15 = spruuk2.cfr_renamed_3[14][arg0[14] & 0xFF];
        long[] lArray16 = spruuk2.cfr_renamed_3[15][arg0[15] & 0xFF];
        long l = lArray[0] ^ lArray2[0] ^ lArray3[0] ^ lArray4[0] ^ lArray5[0] ^ lArray6[0] ^ lArray7[0] ^ lArray8[0] ^ lArray9[0] ^ lArray10[0] ^ lArray11[0] ^ lArray12[0] ^ lArray13[0] ^ lArray14[0] ^ lArray15[0] ^ lArray16[0];
        long l2 = lArray[1] ^ lArray2[1] ^ lArray3[1] ^ lArray4[1] ^ lArray5[1] ^ lArray6[1] ^ lArray7[1] ^ lArray8[1] ^ lArray9[1] ^ lArray10[1] ^ lArray11[1] ^ lArray12[1] ^ lArray13[1] ^ lArray14[1] ^ lArray15[1] ^ lArray16[1];
        sprpxe.cfr_renamed_450(l, arg0, 0);
        sprpxe.cfr_renamed_450(l2, arg0, 8);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        int n;
        spruuk spruuk2;
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new long[16][256][2];
            spruuk2 = this;
        } else {
            if (0 != sprrzk.cfr_renamed_92(this.cfr_renamed_4, arg0)) {
                return;
            }
            spruuk2 = this;
        }
        spruuk2.cfr_renamed_4 = new byte[16];
        sprrzk.cfr_renamed_10068(arg0, this.cfr_renamed_4);
        int n2 = n = 0;
        while (n2 < 16) {
            int n3;
            long[][] lArray = this.cfr_renamed_3[n];
            spruuk spruuk3 = this;
            if (n == 0) {
                sprrzk.cfr_renamed_3450(spruuk3.cfr_renamed_4, lArray[1]);
                sprrzk.cfr_renamed_10069(lArray[1], lArray[1]);
            } else {
                sprrzk.cfr_renamed_10070(spruuk3.cfr_renamed_3[n - 1][1], lArray[1]);
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
}

