/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.spryxaa;

public class sprmze {
    public spricf[] cfr_renamed_1;
    private sprnhf cfr_renamed_2;
    private spricf cfr_renamed_3;
    public spricf[] cfr_renamed_4;

    public spricf[] cfr_renamed_815() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_810() {
        int n;
        int n2 = this.cfr_renamed_3.cfr_renamed_813();
        spricf[] spricfArray = new spricf[n2];
        int n3 = n = n2 - 1;
        while (n3 >= 0) {
            int n4 = n;
            spricf spricf2 = new spricf(this.cfr_renamed_4[n]);
            spricfArray[n4] = spricf2;
            n3 = --n;
        }
        this.cfr_renamed_1 = new spricf[n2];
        int n5 = n = n2 - 1;
        while (n5 >= 0) {
            int n6 = n;
            spricf spricf3 = new spricf(this.cfr_renamed_2, n);
            this.cfr_renamed_1[n6] = spricf3;
            n5 = --n;
        }
        int n7 = n = 0;
        while (n7 < n2) {
            int n8;
            int n9;
            int n10;
            if (spricfArray[n].cfr_renamed_816(n) == 0) {
                n10 = 0;
                int n11 = n9 = n + 1;
                while (n11 < n2) {
                    if (spricfArray[n9].cfr_renamed_816(n) != 0) {
                        n10 = 1;
                        sprmze.cfr_renamed_5469(spricfArray, n, n9);
                        sprmze.cfr_renamed_5469(this.cfr_renamed_1, n, n9);
                        n9 = n2;
                    }
                    n11 = ++n9;
                }
                if (n10 == 0) {
                    throw new ArithmeticException(spryxaa.cfr_renamed_9("\u0016L0\\7T+ZeP$I7T=\u001d,NeS*IeT+K O1T'Q \u0013"));
                }
            }
            n10 = spricfArray[n].cfr_renamed_816(n);
            n9 = this.cfr_renamed_2.cfr_renamed_817(n10);
            spricfArray[n].cfr_renamed_818(n9);
            this.cfr_renamed_1[n].cfr_renamed_818(n9);
            int n12 = n8 = 0;
            while (n12 < n2) {
                if (n8 != n && (n10 = spricfArray[n8].cfr_renamed_816(n)) != 0) {
                    spricf spricf4 = spricfArray[n].cfr_renamed_819(n10);
                    spricf spricf5 = this.cfr_renamed_1[n].cfr_renamed_819(n10);
                    spricfArray[n8].cfr_renamed_5470(spricf4);
                    this.cfr_renamed_1[n8].cfr_renamed_5470(spricf5);
                }
                n12 = ++n8;
            }
            n7 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_5469(spricf[] spricfArray, int n, int n2) {
        void arg2;
        spricf[] arg0;
        spricf spricf2 = spricfArray[n];
        spricfArray[arg1] = arg0[arg2];
        arg0[arg2] = spricf2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ 2 << 1;
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

    private /* synthetic */ void cfr_renamed_809() {
        int[] nArray;
        int n;
        int n2 = this.cfr_renamed_3.cfr_renamed_813();
        this.cfr_renamed_4 = new spricf[n2];
        int n3 = n = 0;
        while (n3 < n2 >> 1) {
            nArray = new int[(n << 1) + 1];
            nArray[n << 1] = 1;
            this.cfr_renamed_4[n++] = new spricf(this.cfr_renamed_2, nArray);
            n3 = n;
        }
        int n4 = n = n2 >> 1;
        while (n4 < n2) {
            int[] nArray2 = new int[(n << 1) + 1];
            nArray = nArray2;
            nArray2[n << 1] = 1;
            spricf spricf2 = new spricf(this.cfr_renamed_2, nArray);
            this.cfr_renamed_4[n++] = spricf2.cfr_renamed_5471(this.cfr_renamed_3);
            n4 = n;
        }
    }

    public sprmze(sprnhf arg0, spricf arg1) {
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_3 = arg1;
        this.cfr_renamed_809();
        this.cfr_renamed_810();
    }

    public spricf[] cfr_renamed_812() {
        return this.cfr_renamed_1;
    }
}

