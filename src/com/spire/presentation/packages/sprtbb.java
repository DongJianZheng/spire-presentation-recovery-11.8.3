/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprddb;
import com.spire.presentation.packages.sprhfb;
import com.spire.presentation.packages.sprjya;
import com.spire.presentation.packages.sprkgb;
import com.spire.presentation.packages.sprteb;
import com.spire.presentation.packages.spruxa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.sprygb;
import java.security.SecureRandom;

public class sprtbb
implements spry {
    private short[] cfr_renamed_79;
    private int[] cfr_renamed_107;
    private short[][] cfr_renamed_132;
    private short[] cfr_renamed_102;
    private sprjya[] cfr_renamed_93;
    private short[][] cfr_renamed_86;
    private SecureRandom cfr_renamed_152;
    private boolean cfr_renamed_112 = false;
    private short[] cfr_renamed_119;
    private spruxa cfr_renamed_91;
    private int cfr_renamed_0;
    private short[][] cfr_renamed_1;
    private short[][] cfr_renamed_2;
    private short[][] cfr_renamed_3;
    private short[][] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1296() {
        int n;
        this.cfr_renamed_93 = new sprjya[this.cfr_renamed_0];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3 = n;
            sprjya sprjya2 = new sprjya(this.cfr_renamed_107[n], this.cfr_renamed_107[n + 1], this.cfr_renamed_152);
            this.cfr_renamed_93[n3] = sprjya2;
            n2 = ++n;
        }
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_1298() {
        sprtbb sprtbb2 = this;
        sprtbb2.cfr_renamed_1299();
        sprtbb2.cfr_renamed_1300();
        sprtbb2.cfr_renamed_1296();
        sprtbb2.cfr_renamed_1301();
    }

    private /* synthetic */ void cfr_renamed_1302(short[][][] arg0) {
        int n;
        int n2 = arg0.length;
        int n3 = arg0[0].length;
        int n4 = n3 * (n3 + 1) / 2;
        this.cfr_renamed_2 = new short[n2][n4];
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < n2) {
            int n7;
            n5 = 0;
            int n8 = n7 = 0;
            while (n8 < n3) {
                int n9 = n7;
                while (n9 < n3) {
                    int n10;
                    this.cfr_renamed_2[n][n5] = n10 == n7 ? arg0[n][n7][n10] : sprddb.cfr_renamed_1274(arg0[n][n7][n10], arg0[n][n10][n7]);
                    ++n5;
                    n9 = ++n10;
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
    }

    public sprwnd cfr_renamed_1297() {
        if (!this.cfr_renamed_112) {
            this.cfr_renamed_1303();
        }
        this.cfr_renamed_1298();
        sprtbb sprtbb2 = this;
        sprtbb sprtbb3 = this;
        sprtbb sprtbb4 = this;
        sprygb sprygb2 = new sprygb(sprtbb2.cfr_renamed_132, sprtbb2.cfr_renamed_102, sprtbb3.cfr_renamed_4, sprtbb3.cfr_renamed_119, sprtbb4.cfr_renamed_107, sprtbb4.cfr_renamed_93);
        sprtbb sprtbb5 = this;
        sprtbb sprtbb6 = this;
        sprhfb sprhfb2 = new sprhfb(sprtbb5.cfr_renamed_107[sprtbb5.cfr_renamed_107.length - 1] - this.cfr_renamed_107[0], sprtbb6.cfr_renamed_2, sprtbb6.cfr_renamed_86, this.cfr_renamed_79);
        return new sprwnd(sprhfb2, sprygb2);
    }

    private /* synthetic */ void cfr_renamed_1299() {
        int n;
        int n2;
        sprtbb sprtbb2 = this;
        int n3 = n2 = sprtbb2.cfr_renamed_107[sprtbb2.cfr_renamed_107.length - 1] - this.cfr_renamed_107[0];
        this.cfr_renamed_1 = new short[n3][n3];
        this.cfr_renamed_132 = null;
        sprteb sprteb2 = new sprteb();
        sprtbb sprtbb3 = this;
        while (sprtbb3.cfr_renamed_132 == null) {
            int n4 = n = 0;
            while (n4 < n2) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < n2) {
                    this.cfr_renamed_1[n][n5++] = (short)(this.cfr_renamed_152.nextInt() & 0xFF);
                    n6 = n5;
                }
                n4 = ++n;
            }
            sprtbb3 = this;
            this.cfr_renamed_132 = sprteb2.cfr_renamed_1288(this.cfr_renamed_1);
        }
        this.cfr_renamed_102 = new short[n2];
        int n7 = n = 0;
        while (n7 < n2) {
            this.cfr_renamed_102[n++] = (short)(this.cfr_renamed_152.nextInt() & 0xFF);
            n7 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_1303() {
        spruxa spruxa2 = new spruxa(new SecureRandom(), new sprkgb());
        this.cfr_renamed_1304(spruxa2);
    }

    private /* synthetic */ void cfr_renamed_1300() {
        int n;
        int n2;
        sprtbb sprtbb2 = this;
        int n3 = n2 = sprtbb2.cfr_renamed_107[sprtbb2.cfr_renamed_107.length - 1];
        this.cfr_renamed_3 = new short[n3][n3];
        this.cfr_renamed_4 = null;
        sprteb sprteb2 = new sprteb();
        sprtbb sprtbb3 = this;
        while (sprtbb3.cfr_renamed_4 == null) {
            int n4 = n = 0;
            while (n4 < n2) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < n2) {
                    this.cfr_renamed_3[n][n5++] = (short)(this.cfr_renamed_152.nextInt() & 0xFF);
                    n6 = n5;
                }
                n4 = ++n;
            }
            sprtbb3 = this;
            this.cfr_renamed_4 = sprteb2.cfr_renamed_1288(this.cfr_renamed_3);
        }
        this.cfr_renamed_119 = new short[n2];
        int n7 = n = 0;
        while (n7 < n2) {
            this.cfr_renamed_119[n++] = (short)(this.cfr_renamed_152.nextInt() & 0xFF);
            n7 = n;
        }
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_1304(arg0);
    }

    private /* synthetic */ void cfr_renamed_1301() {
        int n;
        int n2;
        int n3;
        sprteb sprteb2 = new sprteb();
        sprtbb sprtbb2 = this;
        int n4 = sprtbb2.cfr_renamed_107[sprtbb2.cfr_renamed_107.length - 1] - this.cfr_renamed_107[0];
        sprtbb sprtbb3 = this;
        int n5 = n3 = sprtbb3.cfr_renamed_107[sprtbb3.cfr_renamed_107.length - 1];
        short[][][] sArray = new short[n4][n5][n5];
        this.cfr_renamed_86 = new short[n4][n3];
        this.cfr_renamed_79 = new short[n4];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        short[] sArray2 = new short[n3];
        short s = 0;
        int n9 = n2 = 0;
        while (n9 < this.cfr_renamed_93.length) {
            int n10;
            sprtbb sprtbb4 = this;
            short[][][] sArray3 = sprtbb4.cfr_renamed_93[n2].cfr_renamed_1305();
            short[][][] sArray4 = sprtbb4.cfr_renamed_93[n2].cfr_renamed_1306();
            short[][] sArray5 = sprtbb4.cfr_renamed_93[n2].cfr_renamed_1307();
            short[] sArray6 = sprtbb4.cfr_renamed_93[n2].cfr_renamed_1308();
            n6 = sArray3[0].length;
            n7 = sArray4[0].length;
            int n11 = n10 = 0;
            while (n11 < n6) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < n6) {
                    int n14 = n = 0;
                    while (n14 < n7) {
                        sprteb sprteb3 = sprteb2;
                        sArray2 = sprteb3.cfr_renamed_1280(sArray3[n10][n12][n], this.cfr_renamed_3[n12 + n7]);
                        sArray[n8 + n10] = sprteb2.cfr_renamed_1287(sArray[n8 + n10], sprteb2.cfr_renamed_1283(sArray2, this.cfr_renamed_3[n]));
                        sArray2 = sprteb3.cfr_renamed_1280(this.cfr_renamed_119[n], sArray2);
                        int n15 = n10;
                        this.cfr_renamed_86[n8 + n15] = sprteb2.cfr_renamed_1286(sArray2, this.cfr_renamed_86[n8 + n10]);
                        sArray2 = sprteb3.cfr_renamed_1280(sArray3[n15][n12][n], this.cfr_renamed_3[n]);
                        sArray2 = sprteb3.cfr_renamed_1280(this.cfr_renamed_119[n12 + n7], sArray2);
                        sprtbb sprtbb5 = this;
                        sprtbb5.cfr_renamed_86[n8 + n10] = sprteb2.cfr_renamed_1286(sArray2, this.cfr_renamed_86[n8 + n10]);
                        s = sprddb.cfr_renamed_1275(sArray3[n10][n12][n], this.cfr_renamed_119[n12 + n7]);
                        short s2 = sprddb.cfr_renamed_1274(this.cfr_renamed_79[n8 + n10], sprddb.cfr_renamed_1275(s, this.cfr_renamed_119[n]));
                        sprtbb5.cfr_renamed_79[n8 + n10] = s2;
                        n14 = ++n;
                    }
                    n13 = ++n12;
                }
                int n16 = n12 = 0;
                while (n16 < n7) {
                    int n17 = n = 0;
                    while (n17 < n7) {
                        sprteb sprteb4 = sprteb2;
                        sArray2 = sprteb4.cfr_renamed_1280(sArray4[n10][n12][n], this.cfr_renamed_3[n12]);
                        sArray[n8 + n10] = sprteb2.cfr_renamed_1287(sArray[n8 + n10], sprteb2.cfr_renamed_1283(sArray2, this.cfr_renamed_3[n]));
                        sArray2 = sprteb4.cfr_renamed_1280(this.cfr_renamed_119[n], sArray2);
                        int n18 = n10;
                        this.cfr_renamed_86[n8 + n18] = sprteb2.cfr_renamed_1286(sArray2, this.cfr_renamed_86[n8 + n10]);
                        sArray2 = sprteb4.cfr_renamed_1280(sArray4[n18][n12][n], this.cfr_renamed_3[n]);
                        sArray2 = sprteb4.cfr_renamed_1280(this.cfr_renamed_119[n12], sArray2);
                        sprtbb sprtbb6 = this;
                        sprtbb6.cfr_renamed_86[n8 + n10] = sprteb2.cfr_renamed_1286(sArray2, this.cfr_renamed_86[n8 + n10]);
                        s = sprddb.cfr_renamed_1275(sArray4[n10][n12][n], this.cfr_renamed_119[n12]);
                        short s3 = sprddb.cfr_renamed_1274(this.cfr_renamed_79[n8 + n10], sprddb.cfr_renamed_1275(s, this.cfr_renamed_119[n]));
                        sprtbb6.cfr_renamed_79[n8 + n10] = s3;
                        n17 = ++n;
                    }
                    n16 = ++n12;
                }
                int n19 = n12 = 0;
                while (n19 < n7 + n6) {
                    sArray2 = sprteb2.cfr_renamed_1280(sArray5[n10][n12], this.cfr_renamed_3[n12]);
                    sprtbb sprtbb7 = this;
                    sprtbb7.cfr_renamed_86[n8 + n10] = sprteb2.cfr_renamed_1286(sArray2, this.cfr_renamed_86[n8 + n10]);
                    short s4 = sprddb.cfr_renamed_1274(this.cfr_renamed_79[n8 + n10], sprddb.cfr_renamed_1275(sArray5[n10][n12], this.cfr_renamed_119[n12]));
                    sprtbb7.cfr_renamed_79[n8 + n10] = s4;
                    n19 = ++n12;
                }
                int n20 = n8 + n10;
                short s5 = sprddb.cfr_renamed_1274(this.cfr_renamed_79[n8 + n10], sArray6[n10]);
                this.cfr_renamed_79[n20] = s5;
                n11 = ++n10;
            }
            n8 += n6;
            n9 = ++n2;
        }
        int n21 = n3;
        short[][][] sArray7 = new short[n4][n21][n21];
        short[][] sArray8 = new short[n4][n3];
        short[] sArray9 = new short[n4];
        int n22 = n = 0;
        while (n22 < n4) {
            int n23;
            int n24 = n23 = 0;
            while (n24 < this.cfr_renamed_1.length) {
                int n25 = n;
                sArray7[n25] = sprteb2.cfr_renamed_1287(sArray7[n], sprteb2.cfr_renamed_1277(this.cfr_renamed_1[n][n23], sArray[n23]));
                sArray8[n25] = sprteb2.cfr_renamed_1286(sArray8[n], sprteb2.cfr_renamed_1280(this.cfr_renamed_1[n][n23], this.cfr_renamed_86[n23]));
                short s6 = sprddb.cfr_renamed_1274(sArray9[n], sprddb.cfr_renamed_1275(this.cfr_renamed_1[n][n23], this.cfr_renamed_79[n23]));
                sArray9[n25] = s6;
                n24 = ++n23;
            }
            int n26 = n;
            short s7 = sprddb.cfr_renamed_1274(sArray9[n], this.cfr_renamed_102[n26]);
            sArray9[n26] = s7;
            n22 = ++n;
        }
        sArray = sArray7;
        this.cfr_renamed_86 = sArray8;
        this.cfr_renamed_79 = sArray9;
        this.cfr_renamed_1302(sArray7);
    }

    public void cfr_renamed_1304(sprccb arg0) {
        this.cfr_renamed_91 = (spruxa)arg0;
        sprtbb sprtbb2 = this;
        sprtbb2.cfr_renamed_152 = new SecureRandom();
        sprtbb2.cfr_renamed_107 = this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1139();
        this.cfr_renamed_0 = this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1140();
        this.cfr_renamed_112 = true;
    }
}

