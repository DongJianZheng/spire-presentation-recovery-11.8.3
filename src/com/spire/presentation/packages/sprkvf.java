/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcg;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.sprjvf;
import com.spire.presentation.packages.sprkdg;
import com.spire.presentation.packages.sprluf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprszf;

public class sprkvf {
    private final int cfr_renamed_2 = 256;
    private sprjvf cfr_renamed_3;
    private sprivf cfr_renamed_4;

    public short[] cfr_renamed_6131(sprkdg arg0, short[] arg1) {
        sprkvf sprkvf2 = this;
        return sprkvf2.cfr_renamed_6141(sprkvf2.cfr_renamed_6142(arg1, arg1, arg0.cfr_renamed_91, this.cfr_renamed_4.cfr_renamed_1186()));
    }

    public short[] cfr_renamed_6132(sprkdg arg0, short[] arg1) {
        int n;
        sprkvf sprkvf2 = this;
        int n2 = sprkvf2.cfr_renamed_4.cfr_renamed_1947();
        int n3 = sprkvf2.cfr_renamed_4.cfr_renamed_6136();
        int n4 = sprkvf2.cfr_renamed_4.cfr_renamed_6137();
        short[][] sArray = new short[256][n3 + n4];
        short[] sArray2 = sproze.cfr_renamed_5242(arg1, 0, n2);
        int n5 = n2;
        short[] sArray3 = sproze.cfr_renamed_5242(arg1, n5, n5 + n3);
        short[] sArray4 = sproze.cfr_renamed_5242(arg1, n2 + n3, arg1.length);
        sprdcg sprdcg2 = new sprdcg(arg0.cfr_renamed_0, arg0.cfr_renamed_284().cfr_renamed_6134());
        int n6 = n2;
        short[][][] sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n3, n6, n6, true);
        short[][] sArray6 = this.cfr_renamed_6142(sArray2, sArray2, sArray5, n3);
        int n7 = n3;
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n7, n2, n7, false);
        sprkvf sprkvf3 = this;
        sArray6 = sprkvf3.cfr_renamed_3.cfr_renamed_6140(sArray6, this.cfr_renamed_6142(sArray3, sArray2, sArray5, n3));
        sprkvf sprkvf4 = this;
        sArray6 = sprkvf3.cfr_renamed_3.cfr_renamed_6140(sArray6, sprkvf4.cfr_renamed_6142(sArray4, sArray2, arg0.cfr_renamed_4, n3));
        sArray6 = sprkvf4.cfr_renamed_3.cfr_renamed_6140(sArray6, this.cfr_renamed_6142(sArray3, sArray3, arg0.cfr_renamed_1, n3));
        sArray6 = sprkvf3.cfr_renamed_3.cfr_renamed_6140(sArray6, this.cfr_renamed_6142(sArray4, sArray3, arg0.cfr_renamed_119, n3));
        sArray6 = sprkvf3.cfr_renamed_3.cfr_renamed_6140(sArray6, this.cfr_renamed_6142(sArray4, sArray4, arg0.cfr_renamed_2, n3));
        int n8 = n2;
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n4, n8, n8, true);
        short[][] sArray7 = this.cfr_renamed_6142(sArray2, sArray2, sArray5, n4);
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n4, n2, n3, false);
        sArray7 = this.cfr_renamed_3.cfr_renamed_6140(sArray7, this.cfr_renamed_6142(sArray3, sArray2, sArray5, n4));
        int n9 = n4;
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n9, n2, n9, false);
        sArray7 = this.cfr_renamed_3.cfr_renamed_6140(sArray7, this.cfr_renamed_6142(sArray4, sArray2, sArray5, n4));
        int n10 = n3;
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n4, n10, n10, true);
        sArray7 = this.cfr_renamed_3.cfr_renamed_6140(sArray7, this.cfr_renamed_6142(sArray3, sArray3, sArray5, n4));
        int n11 = n4;
        sArray5 = sprluf.cfr_renamed_6127(sprdcg2, n11, n3, n11, false);
        sprkvf sprkvf5 = this;
        sArray7 = this.cfr_renamed_3.cfr_renamed_6140(sArray7, sprkvf5.cfr_renamed_6142(sArray4, sArray3, sArray5, n4));
        sArray7 = sprkvf5.cfr_renamed_3.cfr_renamed_6140(sArray7, this.cfr_renamed_6142(sArray4, sArray4, arg0.cfr_renamed_3, n4));
        int n12 = n = 0;
        while (n12 < 256) {
            int n13 = n;
            short[] sArray8 = sproze.cfr_renamed_5259(sArray6[n], sArray7[n13]);
            sArray[n13] = sArray8;
            n12 = ++n;
        }
        return this.cfr_renamed_6141(sArray);
    }

    private /* synthetic */ short[][] cfr_renamed_6142(short[] arg0, short[] arg1, short[][][] arg2, int arg3) {
        int n;
        short[][] sArray = new short[256][arg3];
        if (arg1.length != arg2[0].length || arg0.length != arg2[0][0].length || arg2.length != arg3) {
            throw new RuntimeException(spreyl.cfr_renamed_9("Y^{HuHt\\lRj\u001d{\\t^mQyIqRv\u001dvRl\u001dhRkNq_tX9"));
        }
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3;
            short[] sArray2 = this.cfr_renamed_3.cfr_renamed_1280(arg1[n], arg0);
            int n4 = n3 = 0;
            while (n4 < arg0.length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg2.length) {
                    short s = sArray2[n3];
                    if (s != 0) {
                        int n7 = n5;
                        sArray[s][n7] = sprszf.cfr_renamed_1274(sArray[s][n5], arg2[n7][n][n3]);
                    }
                    n6 = ++n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public sprkvf(sprivf sprivf2) {
        sprkvf sprkvf2 = this;
        sprkvf2.cfr_renamed_2 = 256;
        sprkvf sprkvf3 = this;
        sprkvf2.cfr_renamed_3 = new sprjvf();
        sprkvf2.cfr_renamed_4 = sprivf2;
    }

    private /* synthetic */ short[] cfr_renamed_6141(short[][] arg0) {
        int n;
        int n2 = this.cfr_renamed_4.cfr_renamed_1186();
        short[] sArray = new short[n2];
        int n3 = n = 0;
        while (n3 < 8) {
            int n4 = (int)Math.pow(2.0, n);
            short[] sArray2 = new short[n2];
            int n5 = n4;
            while (n5 < 256) {
                int n6;
                int n7;
                int n8 = n7 = 0;
                while (n8 < n4) {
                    int n9 = n6 + n7;
                    sArray2 = this.cfr_renamed_3.cfr_renamed_1286(sArray2, arg0[n9]);
                    n8 = ++n7;
                }
                n5 = n6 + n4 * 2;
            }
            sArray = this.cfr_renamed_3.cfr_renamed_1286(sArray, this.cfr_renamed_3.cfr_renamed_1280((short)n4, sArray2));
            n3 = ++n;
        }
        return sArray;
    }
}

