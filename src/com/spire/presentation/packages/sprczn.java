/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprrgga;

public class sprczn {
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ byte cfr_renamed_14898(int arg0) {
        switch (arg0) {
            case 10: {
                return 0;
            }
            case 11: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 13: {
                return 3;
            }
            case 14: {
                return 4;
            }
        }
        throw new IllegalArgumentException(sprqje.cfr_renamed_9("Dsbham~oexu=aotyx~erc=edax"));
    }

    private /* synthetic */ byte cfr_renamed_14899(int arg0, int arg1) {
        int n = arg1 - this.cfr_renamed_3 >= 0 ? this.cfr_renamed_1[arg1 - this.cfr_renamed_3] & 0xFF : 0;
        return (byte)((arg0 - n) % 256);
    }

    /*
     * WARNING - void declaration
     */
    public sprczn(int n, int n2, int n3, int n4) {
        void arg2;
        void arg3;
        void arg1;
        sprczn sprczn2 = this;
        sprczn sprczn3 = this;
        sprczn.cfr_renamed_14900((int)arg1, (int)arg3);
        sprczn3.cfr_renamed_4 = arg1;
        sprczn3.cfr_renamed_112 = arg2;
        sprczn2.cfr_renamed_119 = arg3;
        sprczn2.cfr_renamed_2 = n;
    }

    private /* synthetic */ int cfr_renamed_14901() {
        int n;
        int n2 = 1;
        double d = Double.POSITIVE_INFINITY;
        byte[] byArray = new byte[this.cfr_renamed_91];
        int n3 = n = 10;
        while (n3 != 15) {
            double d2;
            int n4;
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_91) {
                int n7 = n5++;
                byArray[n7] = this.cfr_renamed_1[n7];
                n6 = n5;
            }
            int n8 = n5 = 0;
            while (n8 < this.cfr_renamed_91) {
                int n9 = n5;
                byte by = this.cfr_renamed_14902(n, byArray[n5] & 0xFF, n5);
                byArray[n9] = by;
                n8 = ++n5;
            }
            double d3 = 0.0;
            int n10 = n4 = 0;
            while (n10 < this.cfr_renamed_91) {
                int n11 = byArray[n4] & 0xFF;
                d3 += (double)n11;
                n10 = ++n4;
            }
            d3 /= (double)this.cfr_renamed_91;
            if (d2 < d) {
                n2 = n;
                d = d3;
            }
            n3 = ++n;
        }
        return n2;
    }

    private static /* synthetic */ int cfr_renamed_14903(int arg0, int arg1, int arg2) {
        int n = arg0 + arg1 - arg2;
        int n2 = sprrgga.cfr_renamed_6433(n - arg0);
        int n3 = sprrgga.cfr_renamed_6433(n - arg1);
        int n4 = sprrgga.cfr_renamed_6433(n - arg2);
        if (n2 <= n3 && n2 <= n4) {
            int n5 = arg0;
            return n5;
        }
        if (n3 <= n4) {
            int n6 = arg1;
            return n6;
        }
        int n7 = arg2;
        return n7;
    }

    private /* synthetic */ byte cfr_renamed_14904(int arg0, int arg1) {
        int n = arg1 - this.cfr_renamed_3 >= 0 ? this.cfr_renamed_1[arg1 - this.cfr_renamed_3] & 0xFF : 0;
        int n2 = arg1 - this.cfr_renamed_3 >= 0 ? this.cfr_renamed_152[arg1 - this.cfr_renamed_3] & 0xFF : 0;
        int n3 = this.cfr_renamed_152[arg1] & 0xFF;
        return (byte)((arg0 - sprczn.cfr_renamed_14903(n, n3, n2)) % 256);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte cfr_renamed_14902(int arg0, int arg1, int arg2) {
        switch (arg0) {
            case 10: {
                return (byte)arg1;
            }
            case 1: {
                return this.cfr_renamed_14905(arg1, arg2);
            }
            case 11: {
                return this.cfr_renamed_14899(arg1, arg2);
            }
            case 12: {
                return this.cfr_renamed_14906(arg1, arg2);
            }
            case 13: {
                return this.cfr_renamed_14905(arg1, arg2);
            }
            case 14: {
                return this.cfr_renamed_14904(arg1, arg2);
            }
        }
        throw new IllegalStateException(sprbxp.cfr_renamed_9("NC{NmJ>]{_q]j\u000f{W}Jn[w@p\u0001"));
    }

    public sprpdja cfr_renamed_14907(sprpdja arg0) {
        int n;
        sprczn sprczn2 = this;
        sprpdja sprpdja2 = new sprpdja((int)((double)arg0.cfr_renamed_806() + sprrgga.cfr_renamed_12793((double)arg0.cfr_renamed_806() / (double)(sprczn2.cfr_renamed_4 * sprczn2.cfr_renamed_112))));
        arg0.cfr_renamed_11548(0L);
        sprpdja2.cfr_renamed_11548(0L);
        sprczn sprczn3 = this;
        this.cfr_renamed_3 = (int)((double)sprczn3.cfr_renamed_4 * sprrgga.cfr_renamed_12793((double)this.cfr_renamed_119 / 8.0));
        sprczn3.cfr_renamed_91 = sprczn3.cfr_renamed_3 * this.cfr_renamed_112;
        this.cfr_renamed_1 = new byte[this.cfr_renamed_91];
        this.cfr_renamed_152 = new byte[this.cfr_renamed_91];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            this.cfr_renamed_152[n++] = 0;
            n2 = n;
        }
        byte[] byArray = new byte[this.cfr_renamed_91];
        sprpdja sprpdja3 = arg0;
        while (sprpdja3.cfr_renamed_3274() < arg0.cfr_renamed_806()) {
            int n3;
            block6: {
                sprczn sprczn4;
                int n4 = n3 = 0;
                while (n4 < this.cfr_renamed_91) {
                    int n5 = arg0.cfr_renamed_12137();
                    if (n5 == -1) {
                        sprczn4 = this;
                        break block6;
                    }
                    this.cfr_renamed_1[n3++] = (byte)n5;
                    n4 = n3;
                }
                sprczn4 = this;
            }
            sprczn4.cfr_renamed_0 = this.cfr_renamed_2 == 15 ? this.cfr_renamed_14901() : this.cfr_renamed_2;
            int n6 = n3 = 0;
            while (n6 < this.cfr_renamed_91) {
                int n7 = n3;
                sprczn sprczn5 = this;
                byte by = sprczn5.cfr_renamed_14902(this.cfr_renamed_0, sprczn5.cfr_renamed_1[n3] & 0xFF, n3);
                byArray[n7] = by;
                n6 = ++n3;
            }
            int n8 = n3 = 0;
            while (n8 < this.cfr_renamed_91) {
                sprczn sprczn6 = this;
                int n9 = n3++;
                sprczn6.cfr_renamed_152[n9] = sprczn6.cfr_renamed_1[n9];
                n8 = n3;
            }
            sprpdja2.cfr_renamed_11594(sprczn.cfr_renamed_14898(this.cfr_renamed_0));
            sprpdja2.cfr_renamed_4924(byArray, 0, this.cfr_renamed_91);
            sprpdja3 = arg0;
        }
        return sprpdja2;
    }

    private /* synthetic */ byte cfr_renamed_14905(int arg0, int arg1) {
        int n = arg1 - this.cfr_renamed_3 >= 0 ? this.cfr_renamed_1[arg1 - this.cfr_renamed_3] & 0xFF : 0;
        n = (n + (this.cfr_renamed_152[arg1] & 0xFF)) / 2;
        return (byte)(sprrgga.cfr_renamed_14908(arg0 - n) % 256.0);
    }

    private /* synthetic */ byte cfr_renamed_14906(int arg0, int arg1) {
        int n = this.cfr_renamed_152[arg1] & 0xFF;
        return (byte)((arg0 - n) % 256);
    }

    private static /* synthetic */ void cfr_renamed_14900(int arg0, int arg1) {
        if (arg0 > 4 || arg0 < 1) {
            throw new IllegalArgumentException(sprqje.cfr_renamed_9("Xsg|}tu=rr}rc3"));
        }
        switch (arg1) {
            case 1: 
            case 2: 
            case 4: 
            case 8: {
                return;
            }
        }
        throw new IllegalArgumentException(sprbxp.cfr_renamed_9("WAhNrFz\u000f|_n\u0001"));
    }
}

