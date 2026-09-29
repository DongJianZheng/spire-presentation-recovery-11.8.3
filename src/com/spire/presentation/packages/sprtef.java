/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprmef;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprwff;
import java.security.SecureRandom;

public final class sprtef {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprmef cfr_renamed_5487(spraye arg0, SecureRandom arg1) {
        spraye spraye2;
        spraye spraye3;
        sprwff sprwff2;
        boolean bl;
        int n = arg0.cfr_renamed_883();
        spraye spraye4 = null;
        boolean bl2 = false;
        do {
            sprwff2 = new sprwff(n, arg1);
            spraye3 = (spraye)arg0.cfr_renamed_5483(sprwff2);
            spraye2 = spraye3.cfr_renamed_945();
            try {
                bl2 = true;
                spraye4 = (spraye)spraye2.cfr_renamed_875();
                bl = bl2;
            }
            catch (ArithmeticException arithmeticException) {
                bl = bl2 = false;
            }
        } while (!bl);
        spraye spraye5 = (spraye)spraye4.cfr_renamed_5486(spraye3);
        spraye spraye6 = spraye5.cfr_renamed_946();
        return new sprmef(spraye2, spraye6, sprwff2);
    }

    /*
     * WARNING - void declaration
     */
    public static spraye cfr_renamed_5488(sprnhf sprnhf2, spricf spricf2) {
        int n;
        int n2;
        void arg1;
        int n3;
        sprnhf arg0;
        int n4 = arg0.cfr_renamed_813();
        int n5 = 1 << n4;
        int n6 = spricf2.cfr_renamed_813();
        int[][] nArray = new int[n6][n5];
        int[][] nArray2 = new int[n6][n5];
        int n7 = n3 = 0;
        while (n7 < n5) {
            int n8 = n3++;
            nArray2[0][n8] = arg0.cfr_renamed_817(arg1.cfr_renamed_837(n8));
            n7 = n3;
        }
        int n9 = n3 = 1;
        while (n9 < n6) {
            int n10 = n2 = 0;
            while (n10 < n5) {
                int n11 = n2;
                int n12 = arg0.cfr_renamed_838(nArray2[n3 - 1][n11], n2);
                nArray2[n3][n11] = n12;
                n10 = ++n2;
            }
            n9 = ++n3;
        }
        int n13 = n3 = 0;
        while (n13 < n6) {
            int n14 = n2 = 0;
            while (n14 < n5) {
                int n15 = n = 0;
                while (n15 <= n3) {
                    int n16 = n2;
                    int n17 = arg0.cfr_renamed_825(nArray[n3][n16], arg0.cfr_renamed_838(nArray2[n][n2], arg1.cfr_renamed_816(n6 + n - n3)));
                    nArray[n3][n16] = n17;
                    n15 = ++n;
                }
                n14 = ++n2;
            }
            n13 = ++n3;
        }
        int[][] nArray3 = new int[n6 * n4][n5 + 31 >>> 5];
        int n18 = n2 = 0;
        while (n18 < n5) {
            int n19;
            n = n2 >>> 5;
            int n20 = 1 << (n2 & 0x1F);
            int n21 = n19 = 0;
            while (n21 < n6) {
                int n22;
                int n23 = nArray[n19][n2];
                int n24 = n22 = 0;
                while (n24 < n4) {
                    if ((n23 >>> n22 & 1) != 0) {
                        int n25 = (n19 + 1) * n4 - n22 - 1;
                        int[] nArray4 = nArray3[n25];
                        int n26 = n;
                        nArray4[n26] = nArray4[n26] ^ n20;
                    }
                    n24 = ++n22;
                }
                n21 = ++n19;
            }
            n18 = ++n2;
        }
        return new spraye(n5, nArray3);
    }

    private /* synthetic */ sprtef() {
    }

    public static spradf cfr_renamed_5489(spradf arg0, sprnhf arg1, spricf arg2, spricf[] arg3) {
        int n = 1 << arg1.cfr_renamed_813();
        spradf spradf2 = new spradf(n);
        if (!arg0.cfr_renamed_805()) {
            int n2;
            spricf spricf2;
            spricf spricf3 = new spricf(arg0.cfr_renamed_5490(arg1)).cfr_renamed_5476(arg2).cfr_renamed_831(1);
            spricf3 = spricf3.cfr_renamed_5482(arg3);
            spricf[] spricfArray = spricf3.cfr_renamed_5472(arg2);
            spricf spricf4 = spricfArray[0].cfr_renamed_5473(spricfArray[0]);
            spricf spricf5 = spricfArray[1].cfr_renamed_5473(spricfArray[1]).cfr_renamed_860(1);
            spricf spricf6 = spricf2 = spricf4.cfr_renamed_5475(spricf5);
            spricf spricf7 = spricf6.cfr_renamed_819(arg1.cfr_renamed_817(spricf6.cfr_renamed_853()));
            int n3 = n2 = 0;
            while (n3 < n) {
                if (spricf7.cfr_renamed_837(n2) == 0) {
                    spradf2.cfr_renamed_949(n2);
                }
                n3 = ++n2;
            }
        }
        return spradf2;
    }
}

