/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcph;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprssh;
import com.spire.presentation.packages.spruaf;
import java.math.BigInteger;

public class sprexh
extends sprcph {
    /*
     * WARNING - void declaration
     */
    @Override
    public spreuh cfr_renamed_8631(spreuh spreuh2, BigInteger bigInteger) {
        spreuh[] spreuhArray;
        int n;
        int n2;
        int n3;
        int n4;
        void arg0;
        void arg1;
        int n5 = sprdvh.cfr_renamed_1807(arg1.bitLength());
        sprssh sprssh2 = sprdvh.cfr_renamed_8642((spreuh)arg0, n5, true);
        spreuh[] spreuhArray2 = sprssh2.cfr_renamed_1777();
        spreuh[] spreuhArray3 = sprssh2.cfr_renamed_1806();
        int n6 = sprssh2.cfr_renamed_1942();
        int[] nArray = sprdvh.cfr_renamed_1811(n6, (BigInteger)arg1);
        spreuh spreuh3 = spreuh2.cfr_renamed_1769().cfr_renamed_1770();
        int n7 = nArray.length;
        if (n7 > 1) {
            spreuh spreuh4;
            n4 = nArray[--n7];
            n3 = n4 >> 16;
            n2 = n4 & 0xFFFF;
            n = Math.abs(n3);
            spreuh[] spreuhArray4 = spreuhArray = n3 < 0 ? spreuhArray3 : spreuhArray2;
            if (n << 2 < 1 << n6) {
                int n8 = 32 - spruaf.cfr_renamed_5201(n);
                int n9 = n6 - n8;
                int n10 = n ^ 1 << n8 - 1;
                int n11 = (1 << n6 - 1) - 1;
                int n12 = (n10 << n9) + 1;
                spreuh3 = spreuhArray[n11 >>> 1].cfr_renamed_8630(spreuhArray[n12 >>> 1]);
                n2 -= n9;
                spreuh4 = spreuh3;
            } else {
                spreuh4 = spreuh3 = spreuhArray[n >>> 1];
            }
            spreuh3 = spreuh4.cfr_renamed_1771(n2);
        }
        int n13 = n7;
        while (n13 > 0) {
            n4 = nArray[--n7];
            n3 = n4 >> 16;
            n2 = n4 & 0xFFFF;
            n = Math.abs(n3);
            spreuhArray = n3 < 0 ? spreuhArray3 : spreuhArray2;
            spreuh spreuh5 = spreuhArray[n >>> 1];
            spreuh3 = spreuh3.cfr_renamed_8652(spreuh5);
            spreuh3 = spreuh3.cfr_renamed_1771(n2);
            n13 = n7;
        }
        return spreuh3;
    }
}

