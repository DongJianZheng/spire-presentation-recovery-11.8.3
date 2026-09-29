/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spral;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sproze;

public class sprcxe {
    private long[] cfr_renamed_3;
    private int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprhgf cfr_renamed_131() {
        int n;
        int[] nArray = new int[this.cfr_renamed_4];
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4) {
            int n5 = nArray[n] = (int)(this.cfr_renamed_3[n2] >> n3 & 0x7FFL);
            if ((n3 += 12) >= 60) {
                ++n2;
                n3 = 0;
            }
            n4 = ++n;
        }
        return new sprhgf(nArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcxe(long[] lArray, int n) {
        void arg0;
        sprcxe sprcxe2 = this;
        sprcxe2.cfr_renamed_3 = arg0;
        sprcxe2.cfr_renamed_4 = n;
    }

    public sprcxe cfr_renamed_5447(spral arg0) {
        int n;
        long l;
        long l2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        long[][] lArray = new long[5][this.cfr_renamed_3.length + (arg0.cfr_renamed_84() + 4) / 5 - 1];
        int[] nArray = arg0.cfr_renamed_724();
        int n9 = n8 = 0;
        while (n9 != nArray.length) {
            n7 = nArray[n8];
            n6 = n7 / 5;
            n5 = n7 - n6 * 5;
            int n10 = n4 = 0;
            while (n10 < this.cfr_renamed_3.length) {
                int n11 = n6++;
                lArray[n5][n11] = lArray[n5][n11] + this.cfr_renamed_3[n4] & 0x7FF7FF7FF7FF7FFL;
                n10 = ++n4;
            }
            n9 = ++n8;
        }
        int[] nArray2 = arg0.cfr_renamed_185();
        int n12 = n7 = 0;
        while (n12 != nArray2.length) {
            int n13;
            n6 = nArray2[n7];
            n5 = n6 / 5;
            n4 = n6 - n5 * 5;
            int n14 = n13 = 0;
            while (n14 < this.cfr_renamed_3.length) {
                int n15 = n5;
                long l3 = 0x800800800800800L + lArray[n4][n5] - this.cfr_renamed_3[n13] & 0x7FF7FF7FF7FF7FFL;
                ++n5;
                lArray[n4][n15] = l3;
                n14 = ++n13;
            }
            n12 = ++n7;
        }
        long[] lArray2 = sproze.cfr_renamed_524(lArray[0], lArray[0].length + 1);
        int n16 = n6 = 1;
        while (n16 <= 4) {
            n5 = n6 * 12;
            n4 = 60 - n5;
            long l4 = (1L << n4) - 1L;
            n3 = lArray[n6].length;
            int n17 = n2 = 0;
            while (n17 < n3) {
                l2 = lArray[n6][n2] >> n4;
                l = lArray[n6][n2] & l4;
                int n18 = n2;
                lArray2[n18] = lArray2[n2] + (l << n5) & 0x7FF7FF7FF7FF7FFL;
                n = n18 + 1;
                lArray2[n] = lArray2[n] + l2 & 0x7FF7FF7FF7FF7FFL;
                n17 = ++n2;
            }
            n16 = ++n6;
        }
        n6 = 12 * (this.cfr_renamed_4 % 5);
        int n19 = n5 = this.cfr_renamed_3.length - 1;
        while (n19 < lArray2.length) {
            int n20;
            int n21;
            long l5;
            if (n5 == this.cfr_renamed_3.length - 1) {
                l5 = this.cfr_renamed_4 == 5 ? 0L : lArray2[n5] >> n6;
                n20 = n21 = 0;
            } else {
                l5 = lArray2[n5];
                n20 = n5 * 5 - this.cfr_renamed_4;
            }
            n3 = n20 / 5;
            n2 = n21 - n3 * 5;
            l2 = l5 << 12 * n2;
            l = l5 >> 12 * (5 - n2);
            int n22 = n3;
            lArray2[n22] = lArray2[n3] + l2 & 0x7FF7FF7FF7FF7FFL;
            n = n22 + 1;
            if (n < this.cfr_renamed_3.length) {
                lArray2[n] = lArray2[n] + l & 0x7FF7FF7FF7FF7FFL;
            }
            n19 = ++n5;
        }
        return new sprcxe(lArray2, this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprcxe(sprhgf sprhgf2) {
        int n;
        this.cfr_renamed_4 = sprhgf2.cfr_renamed_3.length;
        this.cfr_renamed_3 = new long[(this.cfr_renamed_4 + 4) / 5];
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4) {
            void arg0;
            int n5 = n2++;
            long l = this.cfr_renamed_3[n5] = this.cfr_renamed_3[n5] | (long)arg0.cfr_renamed_3[n] << n3;
            if ((n3 += 12) >= 60) {
                n3 = 0;
            }
            n4 = ++n;
        }
    }
}

