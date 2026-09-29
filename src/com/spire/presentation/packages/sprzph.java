/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprqega;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxnh;
import java.math.BigInteger;

public class sprzph
extends sprcph {
    @Override
    public spreuh cfr_renamed_8631(spreuh arg0, BigInteger arg1) {
        int n;
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        int n2 = sproyh.cfr_renamed_8900(sprgxh2);
        if (arg1.bitLength() > n2) {
            throw new IllegalStateException(sprqega.cfr_renamed_9("r`llp$df}g`)wfyk4m{lgg3}4zaydff}4zwhxhfz4eu{slf)`aug4}|l4ja{bl4ffmq{"));
        }
        sprxnh sprxnh2 = sproyh.cfr_renamed_8902(arg0);
        sprfk sprfk2 = sprxnh2.cfr_renamed_8905();
        int n3 = sprxnh2.cfr_renamed_1942();
        int n4 = (n2 + n3 - 1) / n3;
        spreuh spreuh2 = sprgxh2.cfr_renamed_1770();
        int n5 = n4 * n3;
        int[] nArray = sprvih.cfr_renamed_1720(n5, arg1);
        int n6 = n5 - 1;
        int n7 = n = 0;
        while (n7 < n4) {
            int n8 = 0;
            int n9 = n6 - n;
            while (n9 >= 0) {
                int n10;
                int n11 = nArray[n10 >>> 5] >>> (n10 & 0x1F);
                n8 ^= n11 >>> 1;
                n8 <<= 1;
                n8 ^= n11;
                n9 = n10 - n4;
            }
            spreuh spreuh3 = sprfk2.cfr_renamed_4272(n8);
            spreuh2 = spreuh2.cfr_renamed_8652(spreuh3);
            n7 = ++n;
        }
        return spreuh2.cfr_renamed_8630(sprxnh2.cfr_renamed_8906());
    }
}

