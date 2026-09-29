/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruxo;
import com.spire.presentation.packages.sprwpo;
import com.spire.presentation.packages.sprxsp;

@sprtea
public class spruyo
extends sprwpo {
    private int cfr_renamed_4;

    private static /* synthetic */ int[] cfr_renamed_18628(sprmzo arg0, int arg1) {
        int n;
        int[] nArray = new int[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            nArray[n++] = arg0.cfr_renamed_12254();
            n2 = n;
        }
        return nArray;
    }

    private static /* synthetic */ void cfr_renamed_18629(int[] arg0, sprruo arg1) {
        int n;
        int[] nArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            arg1.cfr_renamed_14639(nArray[n++]);
            n3 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spruyo(int n, int n2, sprdsp sprdsp2, int n3) {
        super((int)arg0, (int)arg1, spruyo.cfr_renamed_18630((sprdsp)arg2));
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = n3;
    }

    public int cfr_renamed_13895() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_18252(sprruo sprruo2) {
        int n;
        void arg0;
        void v0 = arg0;
        int n2 = (int)v0.cfr_renamed_14060().cfr_renamed_3274();
        v0.cfr_renamed_14639(4);
        int n3 = 65535;
        int n4 = 0;
        boolean bl = !this.cfr_renamed_18631().cfr_renamed_14000(n3);
        int n5 = this.cfr_renamed_18631().cfr_renamed_11861() + (bl ? 1 : 0);
        int n6 = n5 * 2;
        int n7 = 2 << (int)sprrgga.cfr_renamed_14908(sprrgga.cfr_renamed_904(n5) / sprrgga.cfr_renamed_904(2.0));
        int n8 = (int)(sprrgga.cfr_renamed_904((double)n7 / 2.0) / sprrgga.cfr_renamed_904(2.0));
        int n9 = 2 * n5 - n7;
        int[] nArray = new int[n5];
        int[] nArray2 = new int[n5];
        int[] nArray3 = new int[n5];
        int[] nArray4 = new int[n5];
        int[] nArray5 = new int[]{};
        int n10 = n = 0;
        while (n10 < this.cfr_renamed_18631().cfr_renamed_11861()) {
            spruyo spruyo2 = this;
            int n11 = spruyo2.cfr_renamed_18631().cfr_renamed_7861(n);
            int n12 = (Integer)spruyo2.cfr_renamed_18631().cfr_renamed_13485(n);
            int n13 = n;
            nArray[n] = n11;
            nArray2[n13] = n11;
            nArray3[n13] = n12 - n11;
            n10 = ++n;
        }
        if (bl) {
            int n14 = n5;
            nArray[n5 - 1] = n3;
            nArray2[n14 - 1] = n3;
            nArray3[n14 - 1] = n4 - n3;
        }
        n = 16 + n6 * 4 + nArray5.length * 2;
        void v5 = arg0;
        void v6 = arg0;
        void v7 = arg0;
        void v8 = arg0;
        void v9 = arg0;
        v9.cfr_renamed_14639(n);
        v9.cfr_renamed_14639(this.cfr_renamed_4);
        v8.cfr_renamed_14639(n6);
        v8.cfr_renamed_14639(n7);
        v7.cfr_renamed_14639(n8);
        v7.cfr_renamed_14639(n9);
        spruyo.cfr_renamed_18629(nArray, (sprruo)v7);
        v6.cfr_renamed_14639(0);
        spruyo.cfr_renamed_18629(nArray2, (sprruo)v6);
        spruyo.cfr_renamed_18629(nArray3, (sprruo)v6);
        spruyo.cfr_renamed_18629(nArray4, (sprruo)v5);
        spruyo.cfr_renamed_18629(nArray5, (sprruo)v5);
    }

    private static /* synthetic */ sprdsp cfr_renamed_18630(sprdsp arg0) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            int n3 = arg0.cfr_renamed_7861(n);
            if (sprxsp.cfr_renamed_13307(n3)) {
                return sprdsp2;
            }
            sprdsp2.cfr_renamed_13414(n3, arg0.cfr_renamed_13485(n++));
            n2 = n;
        }
        return sprdsp2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static spruyo cfr_renamed_18632(sprmzo arg0, spruxo arg1) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        sprmzo sprmzo2 = arg0;
        sprmzo2.cfr_renamed_14060().cfr_renamed_11548(arg1.cfr_renamed_3274());
        int n2 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        int n3 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        int n4 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        int n5 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        sprmzo2.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        int n6 = n5 / 2;
        sprmzo sprmzo3 = arg0;
        int[] nArray = spruyo.cfr_renamed_18633(sprmzo3, n6);
        sprmzo3.cfr_renamed_13218();
        sprmzo sprmzo4 = arg0;
        int[] nArray2 = spruyo.cfr_renamed_18633(sprmzo4, n6);
        int[] nArray3 = spruyo.cfr_renamed_18628(sprmzo4, n6);
        int[] nArray4 = spruyo.cfr_renamed_18633(sprmzo4, n6);
        int n7 = (int)arg1.cfr_renamed_3274() + n3;
        int n8 = (n7 - (int)arg0.cfr_renamed_14060().cfr_renamed_3274()) / 2;
        int n9 = 4;
        if ((long)(n7 + n9) <= arg0.cfr_renamed_14060().cfr_renamed_806()) {
            n8 += n9 / 2;
        }
        int[] nArray5 = spruyo.cfr_renamed_18633(arg0, n8);
        int n10 = n = 0;
        while (n10 < n6) {
            int n11 = nArray2[n];
            while (n11 <= nArray[n]) {
                sprdsp sprdsp3;
                int n12;
                int n13;
                block9: {
                    block8: {
                        if (n13 != 65535) break block8;
                        n12 = 0;
                        sprdsp3 = sprdsp2;
                        break block9;
                    }
                    switch (nArray4[n]) {
                        case 0: {
                            n12 = n13 + nArray3[n] & 0xFFFF;
                            if (n12 != 65535) break;
                            n12 = 0;
                            sprdsp3 = sprdsp2;
                            break block9;
                        }
                        case 65535: {
                            n12 = 0;
                            sprdsp3 = sprdsp2;
                            break block9;
                        }
                        default: {
                            int n14 = n13 - nArray2[n];
                            n12 = nArray5[nArray4[n] / 2 + n14 - n6 + n];
                            if (n12 == 0) break;
                            n12 = n12 + nArray3[n] & 0xFFFF;
                            sprdsp3 = sprdsp2;
                            break block9;
                        }
                    }
                    sprdsp3 = sprdsp2;
                }
                sprdsp3.cfr_renamed_12962(n13++, n12);
                n11 = n13;
            }
            n10 = ++n;
        }
        return new spruyo(arg1.cfr_renamed_18634(), arg1.cfr_renamed_18635(), sprdsp2, n4);
    }

    private static /* synthetic */ int[] cfr_renamed_18633(sprmzo arg0, int arg1) {
        int n;
        int[] nArray = new int[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            nArray[n++] = arg0.cfr_renamed_13218() & 0xFFFF;
            n2 = n;
        }
        return nArray;
    }
}

