/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprcaf;
import com.spire.presentation.packages.sprddf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sproff;
import com.spire.presentation.packages.sprqwe;
import com.spire.presentation.packages.sprrdf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwye;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprvxe
implements sprii {
    private int cfr_renamed_79;
    private SecureRandom cfr_renamed_107;
    private short[][] cfr_renamed_132;
    private sproff cfr_renamed_102;
    private short[] cfr_renamed_93;
    private short[][] cfr_renamed_86;
    private sprbye[] cfr_renamed_152;
    private short[][] cfr_renamed_112;
    private short[] cfr_renamed_119;
    private short[][] cfr_renamed_91;
    private int[] cfr_renamed_0;
    private short[][] cfr_renamed_1;
    private short[] cfr_renamed_2;
    private short[][] cfr_renamed_3;
    private boolean cfr_renamed_4 = false;

    public sprsil cfr_renamed_1297() {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_1303();
        }
        this.cfr_renamed_1298();
        sprvxe sprvxe2 = this;
        sprvxe sprvxe3 = this;
        sprvxe sprvxe4 = this;
        sprwye sprwye2 = new sprwye(sprvxe2.cfr_renamed_86, sprvxe2.cfr_renamed_93, sprvxe3.cfr_renamed_132, sprvxe3.cfr_renamed_2, sprvxe4.cfr_renamed_0, sprvxe4.cfr_renamed_152);
        sprvxe sprvxe5 = this;
        sprvxe sprvxe6 = this;
        sprddf sprddf2 = new sprddf(sprvxe5.cfr_renamed_0[sprvxe5.cfr_renamed_0.length - 1] - this.cfr_renamed_0[0], sprvxe6.cfr_renamed_112, sprvxe6.cfr_renamed_91, this.cfr_renamed_119);
        return new sprsil(sprddf2, sprwye2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ void cfr_renamed_1298() {
        sprvxe sprvxe2 = this;
        sprvxe2.cfr_renamed_1299();
        sprvxe2.cfr_renamed_1300();
        sprvxe2.cfr_renamed_1296();
        sprvxe2.cfr_renamed_1301();
    }

    public void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_102 = (sproff)arg0;
        sprvxe sprvxe2 = this;
        sprvxe2.cfr_renamed_107 = sprvxe2.cfr_renamed_102.cfr_renamed_1295();
        sprvxe2.cfr_renamed_0 = sprvxe2.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1139();
        this.cfr_renamed_79 = this.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1140();
        this.cfr_renamed_4 = true;
    }

    private /* synthetic */ void cfr_renamed_1301() {
        int n;
        int n2;
        int n3;
        sprrdf sprrdf2 = new sprrdf();
        sprvxe sprvxe2 = this;
        int n4 = sprvxe2.cfr_renamed_0[sprvxe2.cfr_renamed_0.length - 1] - this.cfr_renamed_0[0];
        sprvxe sprvxe3 = this;
        int n5 = n3 = sprvxe3.cfr_renamed_0[sprvxe3.cfr_renamed_0.length - 1];
        short[][][] sArray = new short[n4][n5][n5];
        this.cfr_renamed_91 = new short[n4][n3];
        this.cfr_renamed_119 = new short[n4];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        short[] sArray2 = new short[n3];
        short s = 0;
        int n9 = n2 = 0;
        while (n9 < this.cfr_renamed_152.length) {
            int n10;
            sprvxe sprvxe4 = this;
            short[][][] sArray3 = sprvxe4.cfr_renamed_152[n2].cfr_renamed_1305();
            short[][][] sArray4 = sprvxe4.cfr_renamed_152[n2].cfr_renamed_1306();
            short[][] sArray5 = sprvxe4.cfr_renamed_152[n2].cfr_renamed_1307();
            short[] sArray6 = sprvxe4.cfr_renamed_152[n2].cfr_renamed_1308();
            n6 = sArray3[0].length;
            n7 = sArray4[0].length;
            int n11 = n10 = 0;
            while (n11 < n6) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < n6) {
                    int n14 = n = 0;
                    while (n14 < n7) {
                        sprrdf sprrdf3 = sprrdf2;
                        sArray2 = sprrdf3.cfr_renamed_1280(sArray3[n10][n12][n], this.cfr_renamed_3[n12 + n7]);
                        sArray[n8 + n10] = sprrdf2.cfr_renamed_1287(sArray[n8 + n10], sprrdf2.cfr_renamed_1283(sArray2, this.cfr_renamed_3[n]));
                        sArray2 = sprrdf3.cfr_renamed_1280(this.cfr_renamed_2[n], sArray2);
                        int n15 = n10;
                        this.cfr_renamed_91[n8 + n15] = sprrdf2.cfr_renamed_1286(sArray2, this.cfr_renamed_91[n8 + n10]);
                        sArray2 = sprrdf3.cfr_renamed_1280(sArray3[n15][n12][n], this.cfr_renamed_3[n]);
                        sArray2 = sprrdf3.cfr_renamed_1280(this.cfr_renamed_2[n12 + n7], sArray2);
                        sprvxe sprvxe5 = this;
                        sprvxe5.cfr_renamed_91[n8 + n10] = sprrdf2.cfr_renamed_1286(sArray2, this.cfr_renamed_91[n8 + n10]);
                        s = sprqwe.cfr_renamed_1275(sArray3[n10][n12][n], this.cfr_renamed_2[n12 + n7]);
                        short s2 = sprqwe.cfr_renamed_1274(this.cfr_renamed_119[n8 + n10], sprqwe.cfr_renamed_1275(s, this.cfr_renamed_2[n]));
                        sprvxe5.cfr_renamed_119[n8 + n10] = s2;
                        n14 = ++n;
                    }
                    n13 = ++n12;
                }
                int n16 = n12 = 0;
                while (n16 < n7) {
                    int n17 = n = 0;
                    while (n17 < n7) {
                        sprrdf sprrdf4 = sprrdf2;
                        sArray2 = sprrdf4.cfr_renamed_1280(sArray4[n10][n12][n], this.cfr_renamed_3[n12]);
                        sArray[n8 + n10] = sprrdf2.cfr_renamed_1287(sArray[n8 + n10], sprrdf2.cfr_renamed_1283(sArray2, this.cfr_renamed_3[n]));
                        sArray2 = sprrdf4.cfr_renamed_1280(this.cfr_renamed_2[n], sArray2);
                        int n18 = n10;
                        this.cfr_renamed_91[n8 + n18] = sprrdf2.cfr_renamed_1286(sArray2, this.cfr_renamed_91[n8 + n10]);
                        sArray2 = sprrdf4.cfr_renamed_1280(sArray4[n18][n12][n], this.cfr_renamed_3[n]);
                        sArray2 = sprrdf4.cfr_renamed_1280(this.cfr_renamed_2[n12], sArray2);
                        sprvxe sprvxe6 = this;
                        sprvxe6.cfr_renamed_91[n8 + n10] = sprrdf2.cfr_renamed_1286(sArray2, this.cfr_renamed_91[n8 + n10]);
                        s = sprqwe.cfr_renamed_1275(sArray4[n10][n12][n], this.cfr_renamed_2[n12]);
                        short s3 = sprqwe.cfr_renamed_1274(this.cfr_renamed_119[n8 + n10], sprqwe.cfr_renamed_1275(s, this.cfr_renamed_2[n]));
                        sprvxe6.cfr_renamed_119[n8 + n10] = s3;
                        n17 = ++n;
                    }
                    n16 = ++n12;
                }
                int n19 = n12 = 0;
                while (n19 < n7 + n6) {
                    sArray2 = sprrdf2.cfr_renamed_1280(sArray5[n10][n12], this.cfr_renamed_3[n12]);
                    sprvxe sprvxe7 = this;
                    sprvxe7.cfr_renamed_91[n8 + n10] = sprrdf2.cfr_renamed_1286(sArray2, this.cfr_renamed_91[n8 + n10]);
                    short s4 = sprqwe.cfr_renamed_1274(this.cfr_renamed_119[n8 + n10], sprqwe.cfr_renamed_1275(sArray5[n10][n12], this.cfr_renamed_2[n12]));
                    sprvxe7.cfr_renamed_119[n8 + n10] = s4;
                    n19 = ++n12;
                }
                int n20 = n8 + n10;
                short s5 = sprqwe.cfr_renamed_1274(this.cfr_renamed_119[n8 + n10], sArray6[n10]);
                this.cfr_renamed_119[n20] = s5;
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
                sArray7[n25] = sprrdf2.cfr_renamed_1287(sArray7[n], sprrdf2.cfr_renamed_1277(this.cfr_renamed_1[n][n23], sArray[n23]));
                sArray8[n25] = sprrdf2.cfr_renamed_1286(sArray8[n], sprrdf2.cfr_renamed_1280(this.cfr_renamed_1[n][n23], this.cfr_renamed_91[n23]));
                short s6 = sprqwe.cfr_renamed_1274(sArray9[n], sprqwe.cfr_renamed_1275(this.cfr_renamed_1[n][n23], this.cfr_renamed_119[n23]));
                sArray9[n25] = s6;
                n24 = ++n23;
            }
            int n26 = n;
            short s7 = sprqwe.cfr_renamed_1274(sArray9[n], this.cfr_renamed_93[n26]);
            sArray9[n26] = s7;
            n22 = ++n;
        }
        sArray = sArray7;
        this.cfr_renamed_91 = sArray8;
        this.cfr_renamed_119 = sArray9;
        this.cfr_renamed_1302(sArray7);
    }

    private /* synthetic */ void cfr_renamed_1303() {
        sproff sproff2 = new sproff(sprybl.cfr_renamed_2794(), new sprcaf());
        this.cfr_renamed_5537(sproff2);
    }

    private /* synthetic */ void cfr_renamed_1299() {
        int n;
        int n2;
        sprvxe sprvxe2 = this;
        int n3 = n2 = sprvxe2.cfr_renamed_0[sprvxe2.cfr_renamed_0.length - 1] - this.cfr_renamed_0[0];
        this.cfr_renamed_1 = new short[n3][n3];
        this.cfr_renamed_86 = null;
        sprrdf sprrdf2 = new sprrdf();
        sprvxe sprvxe3 = this;
        while (sprvxe3.cfr_renamed_86 == null) {
            int n4 = n = 0;
            while (n4 < n2) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < n2) {
                    this.cfr_renamed_1[n][n5++] = (short)(this.cfr_renamed_107.nextInt() & 0xFF);
                    n6 = n5;
                }
                n4 = ++n;
            }
            sprvxe3 = this;
            this.cfr_renamed_86 = sprrdf2.cfr_renamed_1288(this.cfr_renamed_1);
        }
        this.cfr_renamed_93 = new short[n2];
        int n7 = n = 0;
        while (n7 < n2) {
            this.cfr_renamed_93[n++] = (short)(this.cfr_renamed_107.nextInt() & 0xFF);
            n7 = n;
        }
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_1296() {
        int n;
        this.cfr_renamed_152 = new sprbye[this.cfr_renamed_79];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_79) {
            int n3 = n;
            sprbye sprbye2 = new sprbye(this.cfr_renamed_0[n], this.cfr_renamed_0[n + 1], this.cfr_renamed_107);
            this.cfr_renamed_152[n3] = sprbye2;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_1302(short[][][] arg0) {
        int n;
        int n2 = arg0.length;
        int n3 = arg0[0].length;
        int n4 = n3 * (n3 + 1) / 2;
        this.cfr_renamed_112 = new short[n2][n4];
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
                    this.cfr_renamed_112[n][n5] = n10 == n7 ? arg0[n][n7][n10] : sprqwe.cfr_renamed_1274(arg0[n][n7][n10], arg0[n][n10][n7]);
                    ++n5;
                    n9 = ++n10;
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_1300() {
        int n;
        int n2;
        sprvxe sprvxe2 = this;
        int n3 = n2 = sprvxe2.cfr_renamed_0[sprvxe2.cfr_renamed_0.length - 1];
        this.cfr_renamed_3 = new short[n3][n3];
        this.cfr_renamed_132 = null;
        sprrdf sprrdf2 = new sprrdf();
        sprvxe sprvxe3 = this;
        while (sprvxe3.cfr_renamed_132 == null) {
            int n4 = n = 0;
            while (n4 < n2) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < n2) {
                    this.cfr_renamed_3[n][n5++] = (short)(this.cfr_renamed_107.nextInt() & 0xFF);
                    n6 = n5;
                }
                n4 = ++n;
            }
            sprvxe3 = this;
            this.cfr_renamed_132 = sprrdf2.cfr_renamed_1288(this.cfr_renamed_3);
        }
        this.cfr_renamed_2 = new short[n2];
        int n7 = n = 0;
        while (n7 < n2) {
            this.cfr_renamed_2[n++] = (short)(this.cfr_renamed_107.nextInt() & 0xFF);
            n7 = n;
        }
    }
}

