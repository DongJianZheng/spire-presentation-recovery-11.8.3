/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafd;
import com.spire.presentation.packages.spramb;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlaq;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnk;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprxed;

public class sprwgd
implements sprnk {
    private byte[] cfr_renamed_1;
    private sprlc cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprjkd(spramb.cfr_renamed_9("Y%B C$\u00162C6P5DpB?YpE=W<Z"));
        }
        long l = arg2;
        int n2 = this.cfr_renamed_2.cfr_renamed_1218();
        if (l > 0x1FFFFFFFFL) {
            throw new IllegalArgumentException(sprlaq.cfr_renamed_9("\u00042?7>3k+.),3#g?($g'&9 ."));
        }
        int n3 = (int)((l + (long)n2 - 1L) / (long)n2);
        sprwgd sprwgd2 = this;
        byte[] byArray = new byte[sprwgd2.cfr_renamed_2.cfr_renamed_1218()];
        byte[] byArray2 = new byte[4];
        sprtsa.cfr_renamed_442(sprwgd2.cfr_renamed_3, byArray2, 0);
        int n4 = sprwgd2.cfr_renamed_3 & 0xFFFFFF00;
        int n5 = n = 0;
        while (n5 < n3) {
            byte[] byArray3;
            sprwgd sprwgd3 = this;
            sprwgd3.cfr_renamed_2.cfr_renamed_1197(sprwgd3.cfr_renamed_1, 0, this.cfr_renamed_1.length);
            this.cfr_renamed_2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            if (this.cfr_renamed_4 != null) {
                sprwgd sprwgd4 = this;
                sprwgd4.cfr_renamed_2.cfr_renamed_1197(sprwgd4.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            }
            this.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
            if (arg2 > n2) {
                byArray3 = byArray2;
                System.arraycopy(byArray, 0, arg0, arg1, n2);
                arg1 += n2;
                arg2 -= n2;
            } else {
                System.arraycopy(byArray, 0, arg0, arg1, arg2);
                byArray3 = byArray2;
            }
            if ((byArray3[3] = (byte)(byArray3[3] + 1)) == 0) {
                sprtsa.cfr_renamed_442(n4 += 256, byArray2, 0);
            }
            n5 = ++n;
        }
        this.cfr_renamed_2.cfr_renamed_41();
        return (int)l;
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        if (arg0 instanceof sprxed) {
            sprxed sprxed2 = (sprxed)arg0;
            sprwgd sprwgd2 = this;
            sprwgd2.cfr_renamed_1 = sprxed2.cfr_renamed_2343();
            sprwgd2.cfr_renamed_4 = sprxed2.cfr_renamed_1205();
            return;
        }
        if (arg0 instanceof sprafd) {
            sprafd sprafd2 = (sprafd)arg0;
            sprwgd sprwgd3 = this;
            sprwgd3.cfr_renamed_1 = sprafd2.cfr_renamed_2113();
            sprwgd3.cfr_renamed_4 = null;
            return;
        }
        throw new IllegalArgumentException(spramb.cfr_renamed_9("}\u0014ppF1D1[5B5D#\u0016\"S!C9D5RpP?Dp}\u0014pbq5X5D1B?D"));
    }

    /*
     * WARNING - void declaration
     */
    public sprwgd(int n, sprlc sprlc2) {
        void arg0;
        sprwgd sprwgd2 = this;
        sprwgd2.cfr_renamed_3 = arg0;
        sprwgd2.cfr_renamed_2 = sprlc2;
    }

    @Override
    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_2;
    }
}

