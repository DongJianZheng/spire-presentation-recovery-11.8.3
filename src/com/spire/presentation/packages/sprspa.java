/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprvly;
import com.spire.presentation.packages.sprxta;

public class sprspa {
    private sprxta cfr_renamed_1;
    private sprmpa cfr_renamed_2;
    public sprxta[] cfr_renamed_3;
    public sprxta[] cfr_renamed_4;

    public sprspa(sprmpa arg0, sprxta arg1) {
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_1 = arg1;
        this.cfr_renamed_809();
        this.cfr_renamed_810();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_811(sprxta[] sprxtaArray, int n, int n2) {
        void arg2;
        sprxta[] arg0;
        sprxta sprxta2 = sprxtaArray[n];
        sprxtaArray[arg1] = arg0[arg2];
        arg0[arg2] = sprxta2;
    }

    public sprxta[] cfr_renamed_812() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_809() {
        int[] nArray;
        int n;
        int n2 = this.cfr_renamed_1.cfr_renamed_813();
        this.cfr_renamed_4 = new sprxta[n2];
        int n3 = n = 0;
        while (n3 < n2 >> 1) {
            nArray = new int[(n << 1) + 1];
            nArray[n << 1] = 1;
            this.cfr_renamed_4[n++] = new sprxta(this.cfr_renamed_2, nArray);
            n3 = n;
        }
        int n4 = n = n2 >> 1;
        while (n4 < n2) {
            int[] nArray2 = new int[(n << 1) + 1];
            nArray = nArray2;
            nArray2[n << 1] = 1;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_2, nArray);
            this.cfr_renamed_4[n++] = sprxta2.cfr_renamed_814(this.cfr_renamed_1);
            n4 = n;
        }
    }

    public sprxta[] cfr_renamed_815() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_810() {
        int n;
        int n2 = this.cfr_renamed_1.cfr_renamed_813();
        sprxta[] sprxtaArray = new sprxta[n2];
        int n3 = n = n2 - 1;
        while (n3 >= 0) {
            int n4 = n;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_4[n]);
            sprxtaArray[n4] = sprxta2;
            n3 = --n;
        }
        this.cfr_renamed_3 = new sprxta[n2];
        int n5 = n = n2 - 1;
        while (n5 >= 0) {
            int n6 = n;
            sprxta sprxta3 = new sprxta(this.cfr_renamed_2, n);
            this.cfr_renamed_3[n6] = sprxta3;
            n5 = --n;
        }
        int n7 = n = 0;
        while (n7 < n2) {
            int n8;
            int n9;
            int n10;
            if (sprxtaArray[n].cfr_renamed_816(n) == 0) {
                n10 = 0;
                int n11 = n9 = n + 1;
                while (n11 < n2) {
                    if (sprxtaArray[n9].cfr_renamed_816(n) != 0) {
                        n10 = 1;
                        sprspa.cfr_renamed_811(sprxtaArray, n, n9);
                        sprspa.cfr_renamed_811(this.cfr_renamed_3, n, n9);
                        n9 = n2;
                    }
                    n11 = ++n9;
                }
                if (n10 == 0) {
                    throw new ArithmeticException(sprvly.cfr_renamed_9("H3n#i+u%;/z6i+cbr1;,t6;+u4~0o+y.~l"));
                }
            }
            n10 = sprxtaArray[n].cfr_renamed_816(n);
            n9 = this.cfr_renamed_2.cfr_renamed_817(n10);
            sprxtaArray[n].cfr_renamed_818(n9);
            this.cfr_renamed_3[n].cfr_renamed_818(n9);
            int n12 = n8 = 0;
            while (n12 < n2) {
                if (n8 != n && (n10 = sprxtaArray[n8].cfr_renamed_816(n)) != 0) {
                    sprxta sprxta4 = sprxtaArray[n].cfr_renamed_819(n10);
                    sprxta sprxta5 = this.cfr_renamed_3[n].cfr_renamed_819(n10);
                    sprxtaArray[n8].cfr_renamed_820(sprxta4);
                    this.cfr_renamed_3[n8].cfr_renamed_820(sprxta5);
                }
                n12 = ++n8;
            }
            n7 = ++n;
        }
    }
}

