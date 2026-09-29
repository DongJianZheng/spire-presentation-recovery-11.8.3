/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapn;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprlin;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprohn {
    private static sprdsp cfr_renamed_0 = new sprdsp();
    private static Object cfr_renamed_1 = new Object();
    private int cfr_renamed_2;
    private int[][] cfr_renamed_3;
    private int[] cfr_renamed_4;

    @sprtea
    public sprohn(int n) {
        sprohn sprohn2 = this;
        sprohn2.cfr_renamed_3446(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static /* synthetic */ void cfr_renamed_13999(int arg0, sprapn arg1) {
        Object object = cfr_renamed_1;
        // MONITORENTER : object
        Object object2 = cfr_renamed_0.cfr_renamed_576(arg0);
        // MONITOREXIT : object
        if (object2 != null) return;
        object = cfr_renamed_1;
        // MONITORENTER : object
        if (!cfr_renamed_0.cfr_renamed_14000(arg0)) {
            cfr_renamed_0.cfr_renamed_12962(arg0, arg1);
        }
        // MONITOREXIT : object
    }

    private /* synthetic */ void cfr_renamed_14001(sprvyo arg0, sprlin arg1, sprlin arg2) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_1452()) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg0.cfr_renamed_1942()) {
                int n7;
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                int n12 = 0;
                int n13 = n2 - this.cfr_renamed_2;
                int n14 = n7 = 0;
                while (n14 < this.cfr_renamed_4.length) {
                    if (n13 >= n3 && n13 < n3 + arg0.cfr_renamed_1942()) {
                        n8 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1997()[n13]];
                        n9 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1145()[n13]];
                        n10 += this.cfr_renamed_3[n7][arg1.cfr_renamed_3353()[n13]];
                        n11 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1778()[n13]];
                        n12 += this.cfr_renamed_4[n7];
                    }
                    ++n13;
                    n14 = ++n7;
                }
                sprlin sprlin2 = arg2;
                sprlin2.cfr_renamed_1997()[n2] = n8 / n12;
                sprlin2.cfr_renamed_1145()[n2] = n9 / n12;
                sprlin2.cfr_renamed_3353()[n2] = n10 / n12;
                sprlin2.cfr_renamed_1778()[n2++] = n11 / n12;
                n6 = ++n5;
            }
            n3 += arg0.cfr_renamed_1942();
            n4 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3446(int arg0) {
        int n;
        this.cfr_renamed_2 = arg0 = sprrgga.cfr_renamed_12461(sprrgga.cfr_renamed_2548(1, arg0), 248);
        sprapn sprapn2 = sprohn.cfr_renamed_14002(this.cfr_renamed_2);
        if (sprapn2 != null) {
            sprohn sprohn2 = this;
            sprohn2.cfr_renamed_4 = sprapn2.cfr_renamed_3;
            sprohn2.cfr_renamed_3 = sprapn2.cfr_renamed_4;
            return;
        }
        int n2 = 1 + arg0 * 2;
        sprohn sprohn3 = this;
        sprohn3.cfr_renamed_4 = new int[n2];
        sprohn3.cfr_renamed_3 = new int[n2][256];
        int n3 = n = 1;
        while (n3 < arg0) {
            int n4;
            int n5 = arg0 - n;
            int n6 = arg0 + n;
            sprohn sprohn4 = this;
            int n7 = n5;
            sprohn4.cfr_renamed_4[n6] = n7 * n7;
            sprohn4.cfr_renamed_4[n5] = this.cfr_renamed_4[n6];
            int n8 = n4 = 0;
            while (n8 < 256) {
                sprohn sprohn5 = this;
                this.cfr_renamed_3[n6][n4] = sprohn5.cfr_renamed_4[n5] * n4;
                int n9 = n4++;
                sprohn5.cfr_renamed_3[n5][n9] = this.cfr_renamed_3[n6][n9];
                n8 = n4;
            }
            n3 = ++n;
        }
        int n10 = arg0;
        this.cfr_renamed_4[n10] = n10 * n10;
        int n11 = n = 0;
        while (n11 < 256) {
            int n12 = n++;
            this.cfr_renamed_3[arg0][n12] = this.cfr_renamed_4[arg0] * n12;
            n11 = n;
        }
        sprohn sprohn6 = this;
        sprohn.cfr_renamed_13999(arg0, new sprapn(sprohn6.cfr_renamed_4, sprohn6.cfr_renamed_3));
    }

    private static /* synthetic */ void cfr_renamed_14003(sprvyo arg0, sprlin arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.cfr_renamed_1452()) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg0.cfr_renamed_1942()) {
                sprwbp sprwbp2 = new sprwbp(arg0.cfr_renamed_14004(n4, n));
                sprlin sprlin2 = arg1;
                sprlin2.cfr_renamed_1997()[n2] = sprwbp2.cfr_renamed_1997();
                sprlin2.cfr_renamed_1145()[n2] = sprwbp2.cfr_renamed_1145();
                sprlin2.cfr_renamed_3353()[n2] = sprwbp2.cfr_renamed_3353();
                sprlin2.cfr_renamed_1778()[n2++] = sprwbp2.cfr_renamed_1778();
                n5 = ++n4;
            }
            n3 = ++n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static /* synthetic */ sprapn cfr_renamed_14002(int arg0) {
        Object object = cfr_renamed_1;
        // MONITORENTER : object
        sprapn sprapn2 = (sprapn)cfr_renamed_0.cfr_renamed_576(arg0);
        // MONITOREXIT : object
        if (sprapn2 != null) return sprapn2;
        object = cfr_renamed_1;
        // MONITORENTER : object
        if (cfr_renamed_0.cfr_renamed_14000(arg0)) {
            sprapn2 = (sprapn)cfr_renamed_0.cfr_renamed_576(arg0);
        }
        // MONITOREXIT : object
        return sprapn2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_13995(sprvyo sprvyo2) {
        void arg0;
        void v0 = arg0;
        int n = sprvyo2.cfr_renamed_1942() * v0.cfr_renamed_1452();
        sprlin sprlin2 = new sprlin(n);
        sprohn.cfr_renamed_14003((sprvyo)v0, sprlin2);
        sprlin sprlin3 = new sprlin(n);
        sprohn sprohn2 = this;
        sprohn2.cfr_renamed_14001((sprvyo)arg0, sprlin2, sprlin3);
        sprohn2.cfr_renamed_14005((sprvyo)arg0, sprlin3);
    }

    private /* synthetic */ void cfr_renamed_14005(sprvyo arg0, sprlin arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_1452()) {
            int n3;
            int n4 = n - this.cfr_renamed_2;
            int n5 = n4 * arg0.cfr_renamed_1942();
            int n6 = n3 = 0;
            while (n6 < arg0.cfr_renamed_1942()) {
                int n7;
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                int n12 = 0;
                int n13 = n5 + n3;
                int n14 = n4;
                int n15 = n7 = 0;
                while (n15 < this.cfr_renamed_4.length) {
                    if (n14 >= 0 && n14 < arg0.cfr_renamed_1452()) {
                        n8 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1997()[n13]];
                        n9 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1145()[n13]];
                        n10 += this.cfr_renamed_3[n7][arg1.cfr_renamed_3353()[n13]];
                        n11 += this.cfr_renamed_3[n7][arg1.cfr_renamed_1778()[n13]];
                        n12 += this.cfr_renamed_4[n7];
                    }
                    ++n14;
                    n13 += arg0.cfr_renamed_1942();
                    n15 = ++n7;
                }
                arg0.cfr_renamed_14006(n3++, n, sprwbp.cfr_renamed_12555(n11 / n12, n10 / n12, n9 / n12, n8 / n12));
                n6 = n3;
            }
            n2 = ++n;
        }
    }
}

