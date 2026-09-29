/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgze;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.sprixe;
import com.spire.presentation.packages.sprkff;
import com.spire.presentation.packages.sprnye;
import com.spire.presentation.packages.sprogf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrhf;
import com.spire.presentation.packages.sprxef;
import com.spire.presentation.packages.spryf;
import com.spire.presentation.packages.spryno;
import java.util.Vector;

public class sprbcf
extends sprxef {
    private byte[][] cfr_renamed_287;
    private int[] cfr_renamed_724;
    private sprkff[][] cfr_renamed_953;
    private Vector[][] cfr_renamed_133;
    private sprgze[] cfr_renamed_185;
    private int[] spr\ufe34;
    private byte[][] cfr_renamed_82;
    private byte[][][] cfr_renamed_126;
    private Vector[] cfr_renamed_88;
    private byte[][] cfr_renamed_31;
    private sprrhf[] cfr_renamed_272;
    private int cfr_renamed_145;
    private sprrhf[] cfr_renamed_114;
    private byte[][] cfr_renamed_96;
    private sprnye cfr_renamed_105;
    private int[] cfr_renamed_137;
    private sprrhf[] cfr_renamed_79;
    private boolean cfr_renamed_107;
    private spraze cfr_renamed_132;
    private int cfr_renamed_102;
    private sprogf[] cfr_renamed_93;
    private int[] cfr_renamed_86;
    private byte[][][] cfr_renamed_152;
    private int[] cfr_renamed_112;
    private int[] cfr_renamed_119;
    private Vector[][] cfr_renamed_91;
    private Vector[] cfr_renamed_0;
    private sprkff[][] cfr_renamed_1;
    private byte[][][] cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private spryf cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_1426(int arg0) {
        if (arg0 == 0) {
            return -1;
        }
        int n = 0;
        int n2 = 1;
        int n3 = arg0;
        while (n3 % n2 == 0) {
            ++n;
            n2 *= 2;
            n3 = arg0;
        }
        return n - 1;
    }

    public sprbcf(byte[][] arg0, byte[][] arg1, byte[][][] arg2, byte[][][] arg3, sprkff[][] arg4, sprkff[][] arg5, Vector[] arg6, Vector[] arg7, Vector[][] arg8, Vector[][] arg9, byte[][] arg10, byte[][] arg11, sprnye arg12, spryf arg13) {
        this(null, arg0, arg1, arg2, arg3, null, arg4, arg5, arg6, arg7, arg8, arg9, null, null, null, null, arg10, null, arg11, null, arg12, arg13);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbcf(sprbcf sprbcf2) {
        void arg0;
        sprbcf sprbcf3 = this;
        void v1 = arg0;
        sprbcf sprbcf4 = this;
        void v3 = arg0;
        sprbcf sprbcf5 = this;
        void v5 = arg0;
        sprbcf sprbcf6 = this;
        void v7 = arg0;
        sprbcf sprbcf7 = this;
        void v9 = arg0;
        sprbcf sprbcf8 = this;
        void v11 = arg0;
        sprbcf sprbcf9 = this;
        void v13 = arg0;
        sprbcf sprbcf10 = this;
        void v15 = arg0;
        sprbcf sprbcf11 = this;
        void v17 = arg0;
        sprbcf sprbcf12 = this;
        void v19 = arg0;
        super(true, arg0.cfr_renamed_284());
        this.cfr_renamed_107 = false;
        this.cfr_renamed_112 = sproze.cfr_renamed_535(v19.cfr_renamed_112);
        sprbcf12.cfr_renamed_31 = sproze.cfr_renamed_522(v19.cfr_renamed_31);
        sprbcf12.cfr_renamed_96 = sproze.cfr_renamed_522(arg0.cfr_renamed_96);
        this.cfr_renamed_2 = sproze.cfr_renamed_521(v17.cfr_renamed_2);
        sprbcf11.cfr_renamed_152 = sproze.cfr_renamed_521(v17.cfr_renamed_152);
        sprbcf11.cfr_renamed_953 = arg0.cfr_renamed_953;
        this.cfr_renamed_1 = v15.cfr_renamed_1;
        sprbcf10.cfr_renamed_88 = v15.cfr_renamed_88;
        sprbcf10.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_133 = v13.cfr_renamed_133;
        sprbcf9.cfr_renamed_91 = v13.cfr_renamed_91;
        sprbcf9.cfr_renamed_126 = sproze.cfr_renamed_521(arg0.cfr_renamed_126);
        this.cfr_renamed_79 = v11.cfr_renamed_79;
        sprbcf8.cfr_renamed_114 = v11.cfr_renamed_114;
        sprbcf8.cfr_renamed_272 = arg0.cfr_renamed_272;
        this.cfr_renamed_137 = v9.cfr_renamed_137;
        sprbcf7.cfr_renamed_105 = v9.cfr_renamed_105;
        sprbcf7.cfr_renamed_287 = sproze.cfr_renamed_522(arg0.cfr_renamed_287);
        this.cfr_renamed_185 = v7.cfr_renamed_185;
        sprbcf6.cfr_renamed_82 = v7.cfr_renamed_82;
        sprbcf6.cfr_renamed_93 = arg0.cfr_renamed_93;
        this.cfr_renamed_4 = v5.cfr_renamed_4;
        sprbcf5.cfr_renamed_86 = v5.cfr_renamed_86;
        sprbcf5.cfr_renamed_119 = arg0.cfr_renamed_119;
        this.spr\ufe34 = v3.spr\ufe34;
        sprbcf4.cfr_renamed_102 = v3.cfr_renamed_102;
        sprbcf4.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_145 = v1.cfr_renamed_145;
        sprbcf3.cfr_renamed_132 = v1.cfr_renamed_132;
        sprbcf3.cfr_renamed_724 = sprbcf2.cfr_renamed_724;
    }

    public void cfr_renamed_1405() {
        this.cfr_renamed_107 = true;
    }

    /*
     * WARNING - void declaration
     */
    public sprbcf(int[] nArray, byte[][] byArray, byte[][] byArray2, byte[][][] byArray3, byte[][][] byArray4, byte[][][] byArray5, sprkff[][] sprkffArray, sprkff[][] sprkffArray2, Vector[] vectorArray, Vector[] vectorArray2, Vector[][] vectorArray3, Vector[][] vectorArray4, sprrhf[] sprrhfArray, sprrhf[] sprrhfArray2, sprrhf[] sprrhfArray3, int[] nArray2, byte[][] byArray6, sprgze[] sprgzeArray, byte[][] byArray7, sprogf[] sprogfArray, sprnye sprnye2, spryf spryf2) {
        void arg19;
        void arg15;
        void arg14;
        void v20;
        void arg13;
        void arg16;
        void arg1;
        int n;
        void arg21;
        block32: {
            block31: {
                block29: {
                    void arg12;
                    block30: {
                        void arg18;
                        void arg17;
                        void arg11;
                        void arg10;
                        void arg7;
                        void arg6;
                        void arg9;
                        void arg8;
                        void arg5;
                        void arg4;
                        void arg3;
                        void arg2;
                        void arg20;
                        sprbcf sprbcf2 = this;
                        void v1 = arg20;
                        sprbcf sprbcf3 = this;
                        super(true, (sprnye)arg20);
                        sprbcf3.cfr_renamed_107 = false;
                        sprbcf3.cfr_renamed_3 = arg21.cfr_renamed_1397();
                        this.cfr_renamed_145 = this.cfr_renamed_3.cfr_renamed_1218();
                        this.cfr_renamed_105 = arg20;
                        this.cfr_renamed_119 = v1.cfr_renamed_1250();
                        this.spr\ufe34 = v1.cfr_renamed_1150();
                        sprbcf2.cfr_renamed_86 = arg20.cfr_renamed_1249();
                        sprbcf2.cfr_renamed_102 = this.cfr_renamed_105.cfr_renamed_1140();
                        if (nArray == null) {
                            this.cfr_renamed_112 = new int[this.cfr_renamed_102];
                            int n2 = n = 0;
                            while (n2 < this.cfr_renamed_102) {
                                this.cfr_renamed_112[n++] = 0;
                                n2 = n;
                            }
                        } else {
                            void arg0;
                            this.cfr_renamed_112 = arg0;
                        }
                        sprbcf sprbcf4 = this;
                        this.cfr_renamed_31 = arg1;
                        sprbcf4.cfr_renamed_96 = arg2;
                        sprbcf4.cfr_renamed_2 = sproze.cfr_renamed_521((byte[][][])arg3);
                        this.cfr_renamed_152 = arg4;
                        if (arg5 == null) {
                            this.cfr_renamed_126 = new byte[this.cfr_renamed_102][][];
                            int n3 = n = 0;
                            while (n3 < this.cfr_renamed_102) {
                                sprbcf sprbcf5 = this;
                                int n4 = n++;
                                sprbcf5.cfr_renamed_126[n4] = new byte[(int)Math.floor(sprbcf5.cfr_renamed_86[n4] / 2)][this.cfr_renamed_145];
                                n3 = n;
                            }
                        } else {
                            this.cfr_renamed_126 = arg5;
                        }
                        if (arg8 == null) {
                            this.cfr_renamed_88 = new Vector[this.cfr_renamed_102];
                            int n5 = n = 0;
                            while (n5 < this.cfr_renamed_102) {
                                this.cfr_renamed_88[n++] = new Vector();
                                n5 = n;
                            }
                        } else {
                            this.cfr_renamed_88 = arg8;
                        }
                        if (arg9 == null) {
                            this.cfr_renamed_0 = new Vector[this.cfr_renamed_102 - 1];
                            int n6 = n = 0;
                            while (n6 < this.cfr_renamed_102 - 1) {
                                this.cfr_renamed_0[n++] = new Vector();
                                n6 = n;
                            }
                        } else {
                            this.cfr_renamed_0 = arg9;
                        }
                        sprbcf sprbcf6 = this;
                        sprbcf sprbcf7 = this;
                        this.cfr_renamed_953 = arg6;
                        sprbcf7.cfr_renamed_1 = arg7;
                        sprbcf7.cfr_renamed_133 = arg10;
                        sprbcf6.cfr_renamed_91 = arg11;
                        sprbcf6.cfr_renamed_287 = arg16;
                        this.cfr_renamed_4 = arg21;
                        if (arg17 == null) {
                            this.cfr_renamed_185 = new sprgze[this.cfr_renamed_102 - 1];
                            int n7 = n = 0;
                            while (n7 < this.cfr_renamed_102 - 1) {
                                int n8 = n;
                                sprgze sprgze2 = new sprgze(this.cfr_renamed_86[n + 1], this.spr\ufe34[n + 1], this.cfr_renamed_4);
                                this.cfr_renamed_185[n8] = sprgze2;
                                n7 = ++n;
                            }
                        } else {
                            this.cfr_renamed_185 = arg17;
                        }
                        this.cfr_renamed_82 = arg18;
                        this.cfr_renamed_724 = new int[this.cfr_renamed_102];
                        int n9 = n = 0;
                        while (n9 < this.cfr_renamed_102) {
                            int n10 = n++;
                            this.cfr_renamed_724[n10] = 1 << this.cfr_renamed_86[n10];
                            n9 = n;
                        }
                        this.cfr_renamed_132 = new spraze(this.cfr_renamed_3);
                        if (this.cfr_renamed_102 <= 1) break block29;
                        if (arg12 != null) break block30;
                        this.cfr_renamed_79 = new sprrhf[this.cfr_renamed_102 - 2];
                        int n11 = n = 0;
                        while (n11 < this.cfr_renamed_102 - 2) {
                            int n12 = n;
                            sprrhf sprrhf2 = new sprrhf(arg21.cfr_renamed_1397(), this.cfr_renamed_119[n + 1], this.cfr_renamed_724[n + 2], this.cfr_renamed_96[n]);
                            this.cfr_renamed_79[n12] = sprrhf2;
                            n11 = ++n;
                        }
                        break block31;
                    }
                    this.cfr_renamed_79 = arg12;
                    v20 = arg13;
                    break block32;
                }
                this.cfr_renamed_79 = new sprrhf[0];
            }
            v20 = arg13;
        }
        if (v20 == null) {
            this.cfr_renamed_114 = new sprrhf[this.cfr_renamed_102 - 1];
            int n13 = n = 0;
            while (n13 < this.cfr_renamed_102 - 1) {
                int n14 = n;
                sprrhf sprrhf3 = new sprrhf(arg21.cfr_renamed_1397(), this.cfr_renamed_119[n], this.cfr_renamed_724[n + 1], this.cfr_renamed_31[n]);
                this.cfr_renamed_114[n14] = sprrhf3;
                n13 = ++n;
            }
        } else {
            this.cfr_renamed_114 = arg13;
        }
        if (arg14 == null) {
            this.cfr_renamed_272 = new sprrhf[this.cfr_renamed_102 - 1];
            int n15 = n = 0;
            while (n15 < this.cfr_renamed_102 - 1) {
                int n16 = n;
                sprrhf sprrhf4 = new sprrhf(arg21.cfr_renamed_1397(), this.cfr_renamed_119[n], this.cfr_renamed_724[n + 1]);
                this.cfr_renamed_272[n16] = sprrhf4;
                n15 = ++n;
            }
        } else {
            this.cfr_renamed_272 = arg14;
        }
        if (arg15 == null) {
            this.cfr_renamed_137 = new int[this.cfr_renamed_102 - 1];
            int n17 = n = 0;
            while (n17 < this.cfr_renamed_102 - 1) {
                this.cfr_renamed_137[n++] = -1;
                n17 = n;
            }
        } else {
            this.cfr_renamed_137 = arg15;
        }
        sprbcf sprbcf8 = this;
        byte[] byArray8 = new byte[sprbcf8.cfr_renamed_145];
        byte[] byArray9 = new byte[sprbcf8.cfr_renamed_145];
        if (arg19 == null) {
            int n18;
            this.cfr_renamed_93 = new sprogf[this.cfr_renamed_102 - 1];
            int n19 = n18 = 0;
            while (n19 < this.cfr_renamed_102 - 1) {
                System.arraycopy(arg1[n18], 0, byArray8, 0, this.cfr_renamed_145);
                this.cfr_renamed_132.cfr_renamed_1370(byArray8);
                sprbcf sprbcf9 = this;
                byArray9 = sprbcf9.cfr_renamed_132.cfr_renamed_1370(byArray8);
                sprbcf9.cfr_renamed_93[n18] = new sprogf(arg21.cfr_renamed_1397(), this.cfr_renamed_119[n18], this.cfr_renamed_86[n18 + 1]);
                sprbcf9.cfr_renamed_93[n18].cfr_renamed_1410(byArray9, (byte[])arg16[n18++]);
                n19 = n18;
            }
        } else {
            this.cfr_renamed_93 = arg19;
        }
    }

    public byte[] cfr_renamed_1404(int arg0) {
        return this.cfr_renamed_82[arg0];
    }

    public int cfr_renamed_1400(int arg0) {
        return this.cfr_renamed_112[arg0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1424(int arg0) {
        if (arg0 > 0) {
            int[] nArray = this.cfr_renamed_112;
            int n = arg0 - 1;
            nArray[n] = nArray[n] + 1;
            int n2 = 1;
            int n3 = arg0;
            do {
                if (this.cfr_renamed_112[--n3] >= this.cfr_renamed_724[n3]) continue;
                n2 = 0;
            } while (n2 != 0 && n3 > 0);
            if (n2 == 0) {
                int n4;
                sprbcf sprbcf2 = this;
                int n5 = arg0;
                sprbcf2.cfr_renamed_132.cfr_renamed_1370(sprbcf2.cfr_renamed_31[n5]);
                this.cfr_renamed_93[arg0 - 1].cfr_renamed_1407();
                if (n5 > 1) {
                    this.cfr_renamed_79[arg0 - 1 - 1] = this.cfr_renamed_79[arg0 - 1 - 1].cfr_renamed_1427();
                }
                sprbcf sprbcf3 = this;
                sprbcf3.cfr_renamed_114[arg0 - 1] = this.cfr_renamed_114[arg0 - 1].cfr_renamed_1427();
                if (sprbcf3.cfr_renamed_137[arg0 - 1] >= 0) {
                    sprbcf sprbcf4 = this;
                    this.cfr_renamed_272[arg0 - 1] = sprbcf4.cfr_renamed_272[arg0 - 1].cfr_renamed_1427();
                    byte[] byArray = sprbcf4.cfr_renamed_272[arg0 - 1].cfr_renamed_1421();
                    try {
                        sprbcf sprbcf5 = this;
                        sprbcf5.cfr_renamed_953[arg0 - 1][this.cfr_renamed_137[arg0 - 1]].cfr_renamed_5637(this.cfr_renamed_132, byArray);
                        if (sprbcf5.cfr_renamed_953[arg0 - 1][this.cfr_renamed_137[arg0 - 1]].cfr_renamed_1394()) {
                            // empty if block
                        }
                    }
                    catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                sprbcf sprbcf6 = this;
                sprbcf6.cfr_renamed_1420(arg0);
                sprbcf6.cfr_renamed_82[arg0 - 1] = this.cfr_renamed_93[arg0 - 1].cfr_renamed_1409();
                int n6 = n4 = 0;
                while (n6 < this.cfr_renamed_86[arg0] - this.spr\ufe34[arg0]) {
                    sprbcf sprbcf7 = this;
                    this.cfr_renamed_953[arg0][n4] = sprbcf7.cfr_renamed_1[arg0 - 1][n4];
                    int n7 = n4++;
                    sprbcf7.cfr_renamed_1[arg0 - 1][n7] = this.cfr_renamed_185[arg0 - 1].cfr_renamed_1412()[n7];
                    n6 = n4;
                }
                int n8 = n4 = 0;
                while (n8 < this.cfr_renamed_86[arg0]) {
                    sprbcf sprbcf8 = this;
                    System.arraycopy(this.cfr_renamed_152[arg0 - 1][n4], 0, sprbcf8.cfr_renamed_2[arg0][n4], 0, this.cfr_renamed_145);
                    System.arraycopy(sprbcf8.cfr_renamed_185[arg0 - 1].cfr_renamed_1415()[n4], 0, this.cfr_renamed_152[arg0 - 1][++n4], 0, this.cfr_renamed_145);
                    n8 = n4;
                }
                int n9 = n4 = 0;
                while (n9 < this.spr\ufe34[arg0] - 1) {
                    sprbcf sprbcf9 = this;
                    this.cfr_renamed_133[arg0][n4] = sprbcf9.cfr_renamed_91[arg0 - 1][n4];
                    int n10 = n4++;
                    sprbcf9.cfr_renamed_91[arg0 - 1][n10] = this.cfr_renamed_185[arg0 - 1].cfr_renamed_1416()[n10];
                    n9 = n4;
                }
                sprbcf sprbcf10 = this;
                int n11 = arg0;
                sprbcf10.cfr_renamed_88[n11] = sprbcf10.cfr_renamed_0[n11 - 1];
                sprbcf sprbcf11 = this;
                sprbcf10.cfr_renamed_0[arg0 - 1] = sprbcf11.cfr_renamed_185[arg0 - 1].cfr_renamed_1418();
                sprbcf11.cfr_renamed_287[arg0 - 1] = this.cfr_renamed_185[arg0 - 1].cfr_renamed_1411();
                byte[] byArray = new byte[sprbcf10.cfr_renamed_145];
                byte[] byArray2 = new byte[sprbcf10.cfr_renamed_145];
                System.arraycopy(sprbcf10.cfr_renamed_31[arg0 - 1], 0, byArray2, 0, this.cfr_renamed_145);
                byArray = sprbcf10.cfr_renamed_132.cfr_renamed_1370(byArray2);
                byArray = sprbcf10.cfr_renamed_132.cfr_renamed_1370(byArray2);
                byArray = sprbcf10.cfr_renamed_132.cfr_renamed_1370(byArray2);
                sprbcf10.cfr_renamed_93[arg0 - 1].cfr_renamed_1410(byArray, this.cfr_renamed_287[arg0 - 1]);
                sprbcf10.cfr_renamed_1423(arg0 - 1);
            }
        }
    }

    private /* synthetic */ void cfr_renamed_1420(int arg0) {
        sprbcf sprbcf2 = this;
        byte[] byArray = new byte[sprbcf2.cfr_renamed_145];
        byArray = sprbcf2.cfr_renamed_132.cfr_renamed_1370(this.cfr_renamed_96[arg0 - 1]);
        if (arg0 == this.cfr_renamed_102 - 1) {
            sprixe sprixe2 = new sprixe(byArray, this.cfr_renamed_4.cfr_renamed_1397(), this.cfr_renamed_119[arg0]);
            this.cfr_renamed_185[arg0 - 1].cfr_renamed_1413(this.cfr_renamed_96[arg0 - 1], sprixe2.cfr_renamed_1157());
            return;
        }
        sprbcf sprbcf3 = this;
        sprbcf3.cfr_renamed_185[arg0 - 1].cfr_renamed_1413(this.cfr_renamed_96[arg0 - 1], this.cfr_renamed_79[arg0 - 1].cfr_renamed_1421());
        sprbcf3.cfr_renamed_79[arg0 - 1].cfr_renamed_1422(this.cfr_renamed_96[arg0 - 1]);
    }

    public byte[][][] cfr_renamed_1403() {
        return sproze.cfr_renamed_521(this.cfr_renamed_2);
    }

    private /* synthetic */ int cfr_renamed_1419(int arg0) {
        int n;
        int n2 = -1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_86[arg0] - this.spr\ufe34[arg0]) {
            if (this.cfr_renamed_953[arg0][n].cfr_renamed_1383() && !this.cfr_renamed_953[arg0][n].cfr_renamed_1394()) {
                if (n2 == -1) {
                    n2 = n;
                } else if (this.cfr_renamed_953[arg0][n].cfr_renamed_1392() < this.cfr_renamed_953[arg0][n2].cfr_renamed_1392()) {
                    n2 = n;
                }
            }
            n3 = ++n;
        }
        return n2;
    }

    public int[] cfr_renamed_320() {
        return this.cfr_renamed_112;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1425(int arg0) {
        block7: {
            sprbcf sprbcf2;
            block10: {
                block9: {
                    block8: {
                        byte[] byArray;
                        int n = arg0;
                        this.cfr_renamed_1428(n);
                        if (n <= 0) break block7;
                        if (arg0 > 1) {
                            this.cfr_renamed_79[arg0 - 1 - 1] = this.cfr_renamed_79[arg0 - 1 - 1].cfr_renamed_1427();
                        }
                        sprbcf sprbcf3 = this;
                        sprbcf3.cfr_renamed_114[arg0 - 1] = this.cfr_renamed_114[arg0 - 1].cfr_renamed_1427();
                        int n2 = (int)Math.floor((double)(sprbcf3.cfr_renamed_1401(arg0) * 2) / (double)(this.cfr_renamed_86[arg0 - 1] - this.spr\ufe34[arg0 - 1]));
                        if (this.cfr_renamed_112[arg0] % n2 != 1) break block8;
                        if (this.cfr_renamed_112[arg0] > 1 && this.cfr_renamed_137[arg0 - 1] >= 0) {
                            byArray = this.cfr_renamed_272[arg0 - 1].cfr_renamed_1421();
                            try {
                                sprbcf sprbcf4 = this;
                                sprbcf4.cfr_renamed_953[arg0 - 1][this.cfr_renamed_137[arg0 - 1]].cfr_renamed_5637(this.cfr_renamed_132, byArray);
                                if (sprbcf4.cfr_renamed_953[arg0 - 1][this.cfr_renamed_137[arg0 - 1]].cfr_renamed_1394()) {
                                    // empty if block
                                }
                            }
                            catch (Exception exception) {
                                System.out.println(exception);
                            }
                        }
                        sprbcf sprbcf5 = this;
                        sprbcf5.cfr_renamed_137[arg0 - 1] = this.cfr_renamed_1419(arg0 - 1);
                        if (sprbcf5.cfr_renamed_137[arg0 - 1] < 0) break block9;
                        sprbcf sprbcf6 = this;
                        sprbcf2 = sprbcf6;
                        sprbcf sprbcf7 = this;
                        byArray = sprbcf6.cfr_renamed_953[arg0 - 1][sprbcf7.cfr_renamed_137[arg0 - 1]].cfr_renamed_1395();
                        sprbcf6.cfr_renamed_272[arg0 - 1] = new sprrhf(this.cfr_renamed_4.cfr_renamed_1397(), this.cfr_renamed_119[arg0 - 1], n2, byArray);
                        sprbcf7.cfr_renamed_272[arg0 - 1] = this.cfr_renamed_272[arg0 - 1].cfr_renamed_1427();
                        break block10;
                    }
                    if (this.cfr_renamed_137[arg0 - 1] >= 0) {
                        this.cfr_renamed_272[arg0 - 1] = this.cfr_renamed_272[arg0 - 1].cfr_renamed_1427();
                    }
                }
                sprbcf2 = this;
            }
            sprbcf2.cfr_renamed_93[arg0 - 1].cfr_renamed_1407();
            if (this.cfr_renamed_112[arg0] == 1) {
                this.cfr_renamed_185[arg0 - 1].cfr_renamed_1417(new Vector());
            }
            this.cfr_renamed_1420(arg0);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void cfr_renamed_1428(int arg0) {
        block17: {
            block16: {
                v0 = this;
                var2_2 = v0.cfr_renamed_112[arg0];
                var3_3 = v0.cfr_renamed_86[arg0];
                var4_4 = v0.spr\ufe34[arg0];
                v1 = var5_5 = 0;
                while (v1 < var3_3 - var4_4) {
                    v2 = this.cfr_renamed_953[arg0][var5_5];
                    v2.cfr_renamed_5636(this.cfr_renamed_132);
                    v1 = ++var5_5;
                }
                v3 = this;
                var5_5 = v3.cfr_renamed_1426(var2_2);
                var6_6 = new byte[v3.cfr_renamed_145];
                var6_6 = v3.cfr_renamed_132.cfr_renamed_1370(this.cfr_renamed_31[arg0]);
                var7_7 = var2_2 >>> var5_5 + 1 & 1;
                var8_8 = new byte[v3.cfr_renamed_145];
                if (var5_5 < var3_3 - 1 && var7_7 == 0) {
                    System.arraycopy(this.cfr_renamed_2[arg0][var5_5], 0, var8_8, 0, this.cfr_renamed_145);
                }
                var9_9 = new byte[this.cfr_renamed_145];
                if (var5_5 != 0) break block16;
                if (arg0 == this.cfr_renamed_102 - 1) {
                    v4 = new sprixe(var6_6, this.cfr_renamed_4.cfr_renamed_1397(), this.cfr_renamed_119[arg0]);
                    var10_10 /* !! */  = (byte[])v4;
                    var9_9 = v4.cfr_renamed_1157();
                    v5 = var9_9;
                } else {
                    v6 = this;
                    var10_10 /* !! */  = new byte[v6.cfr_renamed_145];
                    System.arraycopy(v6.cfr_renamed_31[arg0], 0, var10_10 /* !! */ , 0, this.cfr_renamed_145);
                    v6.cfr_renamed_132.cfr_renamed_1370(var10_10 /* !! */ );
                    v7 = this;
                    var9_9 = v7.cfr_renamed_114[arg0].cfr_renamed_1421();
                    v7.cfr_renamed_114[arg0].cfr_renamed_1422(var10_10 /* !! */ );
                    v5 = var9_9;
                }
                System.arraycopy(v5, 0, this.cfr_renamed_2[arg0][0], 0, this.cfr_renamed_145);
                v8 = var5_5;
                break block17;
            }
            v9 = this;
            var10_10 /* !! */  = new byte[v9.cfr_renamed_145 << 1];
            System.arraycopy(v9.cfr_renamed_2[arg0][var5_5 - 1], 0, var10_10 /* !! */ , 0, this.cfr_renamed_145);
            v10 = this;
            System.arraycopy(v9.cfr_renamed_126[arg0][(int)Math.floor((var5_5 - 1) / 2)], 0, var10_10 /* !! */ , v10.cfr_renamed_145, v10.cfr_renamed_145);
            v9.cfr_renamed_3.cfr_renamed_1197(var10_10 /* !! */ , 0, var10_10 /* !! */ .length);
            v11 = this;
            this.cfr_renamed_2[arg0][var5_5] = new byte[v11.cfr_renamed_3.cfr_renamed_1218()];
            v11.cfr_renamed_3.cfr_renamed_1219(this.cfr_renamed_2[arg0][var5_5], 0);
            var11_12 = 0;
            v12 = var11_12;
            while (v12 < var5_5) {
                if (var11_12 >= var3_3 - var4_4) ** GOTO lbl74
                if (this.cfr_renamed_953[arg0][var11_12].cfr_renamed_1394()) {
                    v13 = this;
                    v14 = var11_12;
                    v15 = v14;
                    System.arraycopy(v13.cfr_renamed_953[arg0][v14].cfr_renamed_1388(), 0, this.cfr_renamed_2[arg0][var11_12], 0, this.cfr_renamed_145);
                    v13.cfr_renamed_953[arg0][var11_12].cfr_renamed_1384();
                } else {
                    System.err.println(new StringBuilder().insert(0, spridc.cfr_renamed_9("\u001dX,O!K:Bi\u0002")).append(arg0).append(",").append(var11_12).append(spryno.cfr_renamed_9("o3(|23 z(z5{#wfd.v(3(v#w#wfz(3\u0007f2{\u0016r2{\u0005|+c3g'g/|(")).toString());
lbl74:
                    // 2 sources

                    v15 = var11_12;
                }
                if (v15 < var3_3 - 1 && var11_12 >= var3_3 - var4_4 && this.cfr_renamed_133[arg0][var11_12 - (var3_3 - var4_4)].size() > 0) {
                    v16 = this;
                    System.arraycopy(this.cfr_renamed_133[arg0][var11_12 - (var3_3 - var4_4)].lastElement(), 0, v16.cfr_renamed_2[arg0][var11_12], 0, this.cfr_renamed_145);
                    v16.cfr_renamed_133[arg0][var11_12 - (var3_3 - var4_4)].removeElementAt(this.cfr_renamed_133[arg0][var11_12 - (var3_3 - var4_4)].size() - 1);
                }
                if (var11_12 < var3_3 - var4_4 && (var12_13 = var2_2 + 3 * (1 << var11_12)) < this.cfr_renamed_724[arg0]) {
                    this.cfr_renamed_953[arg0][var11_12].cfr_renamed_1391();
                }
                v12 = ++var11_12;
            }
            v8 = var5_5;
        }
        if (v8 < var3_3 - 1 && var7_7 == 0) {
            System.arraycopy(var8_8, 0, this.cfr_renamed_126[arg0][(int)Math.floor(var5_5 / 2)], 0, this.cfr_renamed_145);
        }
        if (arg0 == this.cfr_renamed_102 - 1) {
            v17 = var10_11 = 1;
            while (v17 <= (var3_3 - var4_4) / 2) {
                var11_12 = this.cfr_renamed_1419(arg0);
                if (var11_12 >= 0) {
                    try {
                        v18 = this;
                        var12_14 = new byte[v18.cfr_renamed_145];
                        System.arraycopy(v18.cfr_renamed_953[arg0][var11_12].cfr_renamed_1395(), 0, var12_14, 0, this.cfr_renamed_145);
                        var13_16 = v18.cfr_renamed_132.cfr_renamed_1370(var12_14);
                        var15_17 = new sprixe(var13_16, this.cfr_renamed_4.cfr_renamed_1397(), this.cfr_renamed_119[arg0]).cfr_renamed_1157();
                        v18.cfr_renamed_953[arg0][var11_12].cfr_renamed_5637(this.cfr_renamed_132, var15_17);
                    }
                    catch (Exception var12_15) {
                        System.out.println(var12_15);
                    }
                }
                v17 = ++var10_11;
            }
        } else {
            v19 = arg0;
            this.cfr_renamed_137[v19] = this.cfr_renamed_1419(v19);
        }
    }

    public boolean cfr_renamed_1399() {
        return this.cfr_renamed_107;
    }

    public spryf cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    public byte[][] cfr_renamed_1402() {
        return sproze.cfr_renamed_522(this.cfr_renamed_31);
    }

    public int cfr_renamed_1401(int arg0) {
        return this.cfr_renamed_724[arg0];
    }

    private /* synthetic */ void cfr_renamed_1423(int arg0) {
        if (arg0 == this.cfr_renamed_102 - 1) {
            int n = arg0;
            this.cfr_renamed_112[n] = this.cfr_renamed_112[n] + 1;
        }
        if (this.cfr_renamed_112[arg0] == this.cfr_renamed_724[arg0]) {
            if (this.cfr_renamed_102 != 1) {
                sprbcf sprbcf2 = this;
                sprbcf2.cfr_renamed_1424(arg0);
                sprbcf2.cfr_renamed_112[arg0] = 0;
                return;
            }
        } else {
            this.cfr_renamed_1425(arg0);
        }
    }

    public sprbcf cfr_renamed_1429() {
        sprbcf sprbcf2 = new sprbcf(this);
        sprbcf2.cfr_renamed_1423(this.cfr_renamed_105.cfr_renamed_1140() - 1);
        return sprbcf2;
    }
}

