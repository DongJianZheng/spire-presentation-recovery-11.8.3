/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprroa;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprxta;
import java.security.SecureRandom;

public final class sprqra {
    private /* synthetic */ sprqra() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprroa cfr_renamed_944(sprjta arg0, SecureRandom arg1) {
        sprjta sprjta2;
        sprjta sprjta3;
        sprkqa sprkqa2;
        boolean bl;
        int n = arg0.cfr_renamed_883();
        sprjta sprjta4 = null;
        boolean bl2 = false;
        do {
            sprkqa2 = new sprkqa(n, arg1);
            sprjta3 = (sprjta)arg0.cfr_renamed_879(sprkqa2);
            sprjta2 = sprjta3.cfr_renamed_945();
            try {
                bl2 = true;
                sprjta4 = (sprjta)sprjta2.cfr_renamed_875();
                bl = bl2;
            }
            catch (ArithmeticException arithmeticException) {
                bl = bl2 = false;
            }
        } while (!bl);
        sprjta sprjta5 = (sprjta)sprjta4.cfr_renamed_882(sprjta3);
        sprjta sprjta6 = sprjta5.cfr_renamed_946();
        return new sprroa(sprjta2, sprjta6, sprkqa2);
    }

    public static sprsma cfr_renamed_947(sprsma arg0, sprmpa arg1, sprxta arg2, sprxta[] arg3) {
        int n = 1 << arg1.cfr_renamed_813();
        sprsma sprsma2 = new sprsma(n);
        if (!arg0.cfr_renamed_805()) {
            int n2;
            sprxta sprxta2;
            sprxta sprxta3 = new sprxta(arg0.cfr_renamed_948(arg1)).cfr_renamed_868(arg2).cfr_renamed_831(1);
            sprxta3 = sprxta3.cfr_renamed_864(arg3);
            sprxta[] sprxtaArray = sprxta3.cfr_renamed_869(arg2);
            sprxta sprxta4 = sprxtaArray[0].cfr_renamed_856(sprxtaArray[0]);
            sprxta sprxta5 = sprxtaArray[1].cfr_renamed_856(sprxtaArray[1]).cfr_renamed_860(1);
            sprxta sprxta6 = sprxta2 = sprxta4.cfr_renamed_861(sprxta5);
            sprxta sprxta7 = sprxta6.cfr_renamed_819(arg1.cfr_renamed_817(sprxta6.cfr_renamed_853()));
            int n3 = n2 = 0;
            while (n3 < n) {
                if (sprxta7.cfr_renamed_837(n2) == 0) {
                    sprsma2.cfr_renamed_949(n2);
                }
                n3 = ++n2;
            }
        }
        return sprsma2;
    }

    /*
     * WARNING - void declaration
     */
    public static sprjta cfr_renamed_950(sprmpa sprmpa2, sprxta sprxta2) {
        int n;
        int n2;
        void arg1;
        int n3;
        sprmpa arg0;
        int n4 = arg0.cfr_renamed_813();
        int n5 = 1 << n4;
        int n6 = sprxta2.cfr_renamed_813();
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
        return new sprjta(n5, nArray3);
    }
}

