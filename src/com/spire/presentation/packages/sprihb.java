/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhb;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.spridb;
import com.spire.presentation.packages.sprjcb;
import com.spire.presentation.packages.sprkeb;
import com.spire.presentation.packages.sprl;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmbb;
import com.spire.presentation.packages.sprtdb;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.sprukaa;
import com.spire.presentation.packages.sprzra;
import java.util.Vector;

public class sprihb
extends sprkeb {
    private Vector[] cfr_renamed_287;
    private spridb[] cfr_renamed_724;
    private byte[][][] cfr_renamed_953;
    private sprjcb[] cfr_renamed_133;
    private sprhxa[][] cfr_renamed_185;
    private int spr\ufe34;
    private Vector[][] cfr_renamed_82;
    private sprjcb[] cfr_renamed_126;
    private sprbhb cfr_renamed_88;
    private int cfr_renamed_31;
    private byte[][] cfr_renamed_272;
    private sprl cfr_renamed_145;
    private Vector[] cfr_renamed_114;
    private sprhxa[][] cfr_renamed_96;
    private int[] cfr_renamed_105;
    private byte[][] cfr_renamed_137;
    private byte[][] cfr_renamed_79;
    private byte[][] cfr_renamed_107;
    private int[] cfr_renamed_132;
    private sprlc cfr_renamed_102;
    private boolean cfr_renamed_93;
    private byte[][][] cfr_renamed_86;
    private sprtdb[] cfr_renamed_152;
    private int[] cfr_renamed_112;
    private sprjcb[] cfr_renamed_119;
    private int[] cfr_renamed_91;
    private Vector[][] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private spruab cfr_renamed_2;
    private int[] cfr_renamed_3;
    private byte[][][] cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_1419(int arg0) {
        int n;
        int n2 = -1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_105[arg0] - this.cfr_renamed_1[arg0]) {
            if (this.cfr_renamed_185[arg0][n].cfr_renamed_1383() && !this.cfr_renamed_185[arg0][n].cfr_renamed_1394()) {
                if (n2 == -1) {
                    n2 = n;
                } else if (this.cfr_renamed_185[arg0][n].cfr_renamed_1392() < this.cfr_renamed_185[arg0][n2].cfr_renamed_1392()) {
                    n2 = n;
                }
            }
            n3 = ++n;
        }
        return n2;
    }

    public int[] cfr_renamed_320() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ void cfr_renamed_1420(int arg0) {
        sprihb sprihb2 = this;
        byte[] byArray = new byte[sprihb2.spr\ufe34];
        byArray = sprihb2.cfr_renamed_2.cfr_renamed_1370(this.cfr_renamed_79[arg0 - 1]);
        if (arg0 == this.cfr_renamed_31 - 1) {
            sprmbb sprmbb2 = new sprmbb(byArray, this.cfr_renamed_145.cfr_renamed_1397(), this.cfr_renamed_112[arg0]);
            this.cfr_renamed_152[arg0 - 1].cfr_renamed_1413(this.cfr_renamed_79[arg0 - 1], sprmbb2.cfr_renamed_1157());
            return;
        }
        sprihb sprihb3 = this;
        sprihb3.cfr_renamed_152[arg0 - 1].cfr_renamed_1413(this.cfr_renamed_79[arg0 - 1], this.cfr_renamed_126[arg0 - 1].cfr_renamed_1421());
        sprihb3.cfr_renamed_126[arg0 - 1].cfr_renamed_1422(this.cfr_renamed_79[arg0 - 1]);
    }

    private /* synthetic */ void cfr_renamed_1423(int arg0) {
        if (arg0 == this.cfr_renamed_31 - 1) {
            int n = arg0;
            this.cfr_renamed_91[n] = this.cfr_renamed_91[n] + 1;
        }
        if (this.cfr_renamed_91[arg0] == this.cfr_renamed_3[arg0]) {
            if (this.cfr_renamed_31 != 1) {
                sprihb sprihb2 = this;
                sprihb2.cfr_renamed_1424(arg0);
                sprihb2.cfr_renamed_91[arg0] = 0;
                return;
            }
        } else {
            this.cfr_renamed_1425(arg0);
        }
    }

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

    public sprihb(byte[][] arg0, byte[][] arg1, byte[][][] arg2, byte[][][] arg3, sprhxa[][] arg4, sprhxa[][] arg5, Vector[] arg6, Vector[] arg7, Vector[][] arg8, Vector[][] arg9, byte[][] arg10, byte[][] arg11, sprbhb arg12, sprl arg13) {
        this(null, arg0, arg1, arg2, arg3, null, arg4, arg5, arg6, arg7, arg8, arg9, null, null, null, null, arg10, null, arg11, null, arg12, arg13);
    }

    public boolean cfr_renamed_1399() {
        return this.cfr_renamed_93;
    }

    public sprl cfr_renamed_313() {
        return this.cfr_renamed_145;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprihb(sprihb sprihb2) {
        void arg0;
        sprihb sprihb3 = this;
        void v1 = arg0;
        sprihb sprihb4 = this;
        void v3 = arg0;
        sprihb sprihb5 = this;
        void v5 = arg0;
        sprihb sprihb6 = this;
        void v7 = arg0;
        sprihb sprihb7 = this;
        void v9 = arg0;
        sprihb sprihb8 = this;
        void v11 = arg0;
        sprihb sprihb9 = this;
        void v13 = arg0;
        sprihb sprihb10 = this;
        void v15 = arg0;
        sprihb sprihb11 = this;
        void v17 = arg0;
        sprihb sprihb12 = this;
        void v19 = arg0;
        super(true, arg0.cfr_renamed_284());
        this.cfr_renamed_93 = false;
        this.cfr_renamed_91 = sprzra.cfr_renamed_535(v19.cfr_renamed_91);
        sprihb12.cfr_renamed_137 = sprzra.cfr_renamed_522(v19.cfr_renamed_137);
        sprihb12.cfr_renamed_79 = sprzra.cfr_renamed_522(arg0.cfr_renamed_79);
        this.cfr_renamed_86 = sprzra.cfr_renamed_521(v17.cfr_renamed_86);
        sprihb11.cfr_renamed_953 = sprzra.cfr_renamed_521(v17.cfr_renamed_953);
        sprihb11.cfr_renamed_185 = arg0.cfr_renamed_185;
        this.cfr_renamed_96 = v15.cfr_renamed_96;
        sprihb10.cfr_renamed_114 = v15.cfr_renamed_114;
        sprihb10.cfr_renamed_287 = arg0.cfr_renamed_287;
        this.cfr_renamed_82 = v13.cfr_renamed_82;
        sprihb9.cfr_renamed_0 = v13.cfr_renamed_0;
        sprihb9.cfr_renamed_4 = sprzra.cfr_renamed_521(arg0.cfr_renamed_4);
        this.cfr_renamed_126 = v11.cfr_renamed_126;
        sprihb8.cfr_renamed_119 = v11.cfr_renamed_119;
        sprihb8.cfr_renamed_133 = arg0.cfr_renamed_133;
        this.cfr_renamed_132 = v9.cfr_renamed_132;
        sprihb7.cfr_renamed_88 = v9.cfr_renamed_88;
        sprihb7.cfr_renamed_107 = sprzra.cfr_renamed_522(arg0.cfr_renamed_107);
        this.cfr_renamed_152 = v7.cfr_renamed_152;
        sprihb6.cfr_renamed_272 = v7.cfr_renamed_272;
        sprihb6.cfr_renamed_724 = arg0.cfr_renamed_724;
        this.cfr_renamed_145 = v5.cfr_renamed_145;
        sprihb5.cfr_renamed_105 = v5.cfr_renamed_105;
        sprihb5.cfr_renamed_112 = arg0.cfr_renamed_112;
        this.cfr_renamed_1 = v3.cfr_renamed_1;
        sprihb4.cfr_renamed_31 = v3.cfr_renamed_31;
        sprihb4.cfr_renamed_102 = arg0.cfr_renamed_102;
        this.spr\ufe34 = v1.spr\ufe34;
        sprihb3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprihb3.cfr_renamed_3 = sprihb2.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1424(int arg0) {
        if (arg0 > 0) {
            int[] nArray = this.cfr_renamed_91;
            int n = arg0 - 1;
            nArray[n] = nArray[n] + 1;
            int n2 = 1;
            int n3 = arg0;
            do {
                if (this.cfr_renamed_91[--n3] >= this.cfr_renamed_3[n3]) continue;
                n2 = 0;
            } while (n2 != 0 && n3 > 0);
            if (n2 == 0) {
                int n4;
                sprihb sprihb2 = this;
                int n5 = arg0;
                sprihb2.cfr_renamed_2.cfr_renamed_1370(sprihb2.cfr_renamed_137[n5]);
                this.cfr_renamed_724[arg0 - 1].cfr_renamed_1407();
                if (n5 > 1) {
                    this.cfr_renamed_126[arg0 - 1 - 1] = this.cfr_renamed_126[arg0 - 1 - 1].cfr_renamed_1427();
                }
                sprihb sprihb3 = this;
                sprihb3.cfr_renamed_119[arg0 - 1] = this.cfr_renamed_119[arg0 - 1].cfr_renamed_1427();
                if (sprihb3.cfr_renamed_132[arg0 - 1] >= 0) {
                    sprihb sprihb4 = this;
                    this.cfr_renamed_133[arg0 - 1] = sprihb4.cfr_renamed_133[arg0 - 1].cfr_renamed_1427();
                    byte[] byArray = sprihb4.cfr_renamed_133[arg0 - 1].cfr_renamed_1421();
                    try {
                        sprihb sprihb5 = this;
                        sprihb5.cfr_renamed_185[arg0 - 1][this.cfr_renamed_132[arg0 - 1]].cfr_renamed_1386(this.cfr_renamed_2, byArray);
                        if (sprihb5.cfr_renamed_185[arg0 - 1][this.cfr_renamed_132[arg0 - 1]].cfr_renamed_1394()) {
                            // empty if block
                        }
                    }
                    catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                sprihb sprihb6 = this;
                sprihb6.cfr_renamed_1420(arg0);
                sprihb6.cfr_renamed_272[arg0 - 1] = this.cfr_renamed_724[arg0 - 1].cfr_renamed_1409();
                int n6 = n4 = 0;
                while (n6 < this.cfr_renamed_105[arg0] - this.cfr_renamed_1[arg0]) {
                    sprihb sprihb7 = this;
                    this.cfr_renamed_185[arg0][n4] = sprihb7.cfr_renamed_96[arg0 - 1][n4];
                    int n7 = n4++;
                    sprihb7.cfr_renamed_96[arg0 - 1][n7] = this.cfr_renamed_152[arg0 - 1].cfr_renamed_1412()[n7];
                    n6 = n4;
                }
                int n8 = n4 = 0;
                while (n8 < this.cfr_renamed_105[arg0]) {
                    sprihb sprihb8 = this;
                    System.arraycopy(this.cfr_renamed_953[arg0 - 1][n4], 0, sprihb8.cfr_renamed_86[arg0][n4], 0, this.spr\ufe34);
                    System.arraycopy(sprihb8.cfr_renamed_152[arg0 - 1].cfr_renamed_1415()[n4], 0, this.cfr_renamed_953[arg0 - 1][++n4], 0, this.spr\ufe34);
                    n8 = n4;
                }
                int n9 = n4 = 0;
                while (n9 < this.cfr_renamed_1[arg0] - 1) {
                    sprihb sprihb9 = this;
                    this.cfr_renamed_82[arg0][n4] = sprihb9.cfr_renamed_0[arg0 - 1][n4];
                    int n10 = n4++;
                    sprihb9.cfr_renamed_0[arg0 - 1][n10] = this.cfr_renamed_152[arg0 - 1].cfr_renamed_1416()[n10];
                    n9 = n4;
                }
                sprihb sprihb10 = this;
                int n11 = arg0;
                sprihb10.cfr_renamed_114[n11] = sprihb10.cfr_renamed_287[n11 - 1];
                sprihb sprihb11 = this;
                sprihb10.cfr_renamed_287[arg0 - 1] = sprihb11.cfr_renamed_152[arg0 - 1].cfr_renamed_1418();
                sprihb11.cfr_renamed_107[arg0 - 1] = this.cfr_renamed_152[arg0 - 1].cfr_renamed_1411();
                byte[] byArray = new byte[sprihb10.spr\ufe34];
                byte[] byArray2 = new byte[sprihb10.spr\ufe34];
                System.arraycopy(sprihb10.cfr_renamed_137[arg0 - 1], 0, byArray2, 0, this.spr\ufe34);
                byArray = sprihb10.cfr_renamed_2.cfr_renamed_1370(byArray2);
                byArray = sprihb10.cfr_renamed_2.cfr_renamed_1370(byArray2);
                byArray = sprihb10.cfr_renamed_2.cfr_renamed_1370(byArray2);
                sprihb10.cfr_renamed_724[arg0 - 1].cfr_renamed_1410(byArray, this.cfr_renamed_107[arg0 - 1]);
                sprihb10.cfr_renamed_1423(arg0 - 1);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprihb(int[] nArray, byte[][] byArray, byte[][] byArray2, byte[][][] byArray3, byte[][][] byArray4, byte[][][] byArray5, sprhxa[][] sprhxaArray, sprhxa[][] sprhxaArray2, Vector[] vectorArray, Vector[] vectorArray2, Vector[][] vectorArray3, Vector[][] vectorArray4, sprjcb[] sprjcbArray, sprjcb[] sprjcbArray2, sprjcb[] sprjcbArray3, int[] nArray2, byte[][] byArray6, sprtdb[] sprtdbArray, byte[][] byArray7, spridb[] spridbArray, sprbhb sprbhb2, sprl sprl2) {
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
                        sprihb sprihb2 = this;
                        void v1 = arg20;
                        sprihb sprihb3 = this;
                        super(true, (sprbhb)arg20);
                        sprihb3.cfr_renamed_93 = false;
                        sprihb3.cfr_renamed_102 = arg21.cfr_renamed_1397();
                        this.spr\ufe34 = this.cfr_renamed_102.cfr_renamed_1218();
                        this.cfr_renamed_88 = arg20;
                        this.cfr_renamed_112 = v1.cfr_renamed_1250();
                        this.cfr_renamed_1 = v1.cfr_renamed_1150();
                        sprihb2.cfr_renamed_105 = arg20.cfr_renamed_1249();
                        sprihb2.cfr_renamed_31 = this.cfr_renamed_88.cfr_renamed_1140();
                        if (nArray == null) {
                            this.cfr_renamed_91 = new int[this.cfr_renamed_31];
                            int n2 = n = 0;
                            while (n2 < this.cfr_renamed_31) {
                                this.cfr_renamed_91[n++] = 0;
                                n2 = n;
                            }
                        } else {
                            void arg0;
                            this.cfr_renamed_91 = arg0;
                        }
                        sprihb sprihb4 = this;
                        this.cfr_renamed_137 = arg1;
                        sprihb4.cfr_renamed_79 = arg2;
                        sprihb4.cfr_renamed_86 = arg3;
                        this.cfr_renamed_953 = arg4;
                        if (arg5 == null) {
                            this.cfr_renamed_4 = new byte[this.cfr_renamed_31][][];
                            int n3 = n = 0;
                            while (n3 < this.cfr_renamed_31) {
                                sprihb sprihb5 = this;
                                int n4 = n++;
                                sprihb5.cfr_renamed_4[n4] = new byte[(int)Math.floor(sprihb5.cfr_renamed_105[n4] / 2)][this.spr\ufe34];
                                n3 = n;
                            }
                        } else {
                            this.cfr_renamed_4 = arg5;
                        }
                        if (arg8 == null) {
                            this.cfr_renamed_114 = new Vector[this.cfr_renamed_31];
                            int n5 = n = 0;
                            while (n5 < this.cfr_renamed_31) {
                                this.cfr_renamed_114[n++] = new Vector();
                                n5 = n;
                            }
                        } else {
                            this.cfr_renamed_114 = arg8;
                        }
                        if (arg9 == null) {
                            this.cfr_renamed_287 = new Vector[this.cfr_renamed_31 - 1];
                            int n6 = n = 0;
                            while (n6 < this.cfr_renamed_31 - 1) {
                                this.cfr_renamed_287[n++] = new Vector();
                                n6 = n;
                            }
                        } else {
                            this.cfr_renamed_287 = arg9;
                        }
                        sprihb sprihb6 = this;
                        sprihb sprihb7 = this;
                        this.cfr_renamed_185 = arg6;
                        sprihb7.cfr_renamed_96 = arg7;
                        sprihb7.cfr_renamed_82 = arg10;
                        sprihb6.cfr_renamed_0 = arg11;
                        sprihb6.cfr_renamed_107 = arg16;
                        this.cfr_renamed_145 = arg21;
                        if (arg17 == null) {
                            this.cfr_renamed_152 = new sprtdb[this.cfr_renamed_31 - 1];
                            int n7 = n = 0;
                            while (n7 < this.cfr_renamed_31 - 1) {
                                int n8 = n;
                                sprtdb sprtdb2 = new sprtdb(this.cfr_renamed_105[n + 1], this.cfr_renamed_1[n + 1], this.cfr_renamed_145);
                                this.cfr_renamed_152[n8] = sprtdb2;
                                n7 = ++n;
                            }
                        } else {
                            this.cfr_renamed_152 = arg17;
                        }
                        this.cfr_renamed_272 = arg18;
                        this.cfr_renamed_3 = new int[this.cfr_renamed_31];
                        int n9 = n = 0;
                        while (n9 < this.cfr_renamed_31) {
                            int n10 = n++;
                            this.cfr_renamed_3[n10] = 1 << this.cfr_renamed_105[n10];
                            n9 = n;
                        }
                        this.cfr_renamed_2 = new spruab(this.cfr_renamed_102);
                        if (this.cfr_renamed_31 <= 1) break block29;
                        if (arg12 != null) break block30;
                        this.cfr_renamed_126 = new sprjcb[this.cfr_renamed_31 - 2];
                        int n11 = n = 0;
                        while (n11 < this.cfr_renamed_31 - 2) {
                            int n12 = n;
                            sprjcb sprjcb2 = new sprjcb(arg21.cfr_renamed_1397(), this.cfr_renamed_112[n + 1], this.cfr_renamed_3[n + 2], this.cfr_renamed_79[n]);
                            this.cfr_renamed_126[n12] = sprjcb2;
                            n11 = ++n;
                        }
                        break block31;
                    }
                    this.cfr_renamed_126 = arg12;
                    v20 = arg13;
                    break block32;
                }
                this.cfr_renamed_126 = new sprjcb[0];
            }
            v20 = arg13;
        }
        if (v20 == null) {
            this.cfr_renamed_119 = new sprjcb[this.cfr_renamed_31 - 1];
            int n13 = n = 0;
            while (n13 < this.cfr_renamed_31 - 1) {
                int n14 = n;
                sprjcb sprjcb3 = new sprjcb(arg21.cfr_renamed_1397(), this.cfr_renamed_112[n], this.cfr_renamed_3[n + 1], this.cfr_renamed_137[n]);
                this.cfr_renamed_119[n14] = sprjcb3;
                n13 = ++n;
            }
        } else {
            this.cfr_renamed_119 = arg13;
        }
        if (arg14 == null) {
            this.cfr_renamed_133 = new sprjcb[this.cfr_renamed_31 - 1];
            int n15 = n = 0;
            while (n15 < this.cfr_renamed_31 - 1) {
                int n16 = n;
                sprjcb sprjcb4 = new sprjcb(arg21.cfr_renamed_1397(), this.cfr_renamed_112[n], this.cfr_renamed_3[n + 1]);
                this.cfr_renamed_133[n16] = sprjcb4;
                n15 = ++n;
            }
        } else {
            this.cfr_renamed_133 = arg14;
        }
        if (arg15 == null) {
            this.cfr_renamed_132 = new int[this.cfr_renamed_31 - 1];
            int n17 = n = 0;
            while (n17 < this.cfr_renamed_31 - 1) {
                this.cfr_renamed_132[n++] = -1;
                n17 = n;
            }
        } else {
            this.cfr_renamed_132 = arg15;
        }
        sprihb sprihb8 = this;
        byte[] byArray8 = new byte[sprihb8.spr\ufe34];
        byte[] byArray9 = new byte[sprihb8.spr\ufe34];
        if (arg19 == null) {
            int n18;
            this.cfr_renamed_724 = new spridb[this.cfr_renamed_31 - 1];
            int n19 = n18 = 0;
            while (n19 < this.cfr_renamed_31 - 1) {
                System.arraycopy(arg1[n18], 0, byArray8, 0, this.spr\ufe34);
                this.cfr_renamed_2.cfr_renamed_1370(byArray8);
                sprihb sprihb9 = this;
                byArray9 = sprihb9.cfr_renamed_2.cfr_renamed_1370(byArray8);
                sprihb9.cfr_renamed_724[n18] = new spridb(arg21.cfr_renamed_1397(), this.cfr_renamed_112[n18], this.cfr_renamed_105[n18 + 1]);
                sprihb9.cfr_renamed_724[n18].cfr_renamed_1410(byArray9, (byte[])arg16[n18++]);
                n19 = n18;
            }
        } else {
            this.cfr_renamed_724 = arg19;
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
                var2_2 = v0.cfr_renamed_91[arg0];
                var3_3 = v0.cfr_renamed_105[arg0];
                var4_4 = v0.cfr_renamed_1[arg0];
                v1 = var5_5 = 0;
                while (v1 < var3_3 - var4_4) {
                    v2 = this.cfr_renamed_185[arg0][var5_5];
                    v2.cfr_renamed_1385(this.cfr_renamed_2);
                    v1 = ++var5_5;
                }
                v3 = this;
                var5_5 = v3.cfr_renamed_1426(var2_2);
                var6_6 = new byte[v3.spr\ufe34];
                var6_6 = v3.cfr_renamed_2.cfr_renamed_1370(this.cfr_renamed_137[arg0]);
                var7_7 = var2_2 >>> var5_5 + 1 & 1;
                var8_8 = new byte[v3.spr\ufe34];
                if (var5_5 < var3_3 - 1 && var7_7 == 0) {
                    System.arraycopy(this.cfr_renamed_86[arg0][var5_5], 0, var8_8, 0, this.spr\ufe34);
                }
                var9_9 = new byte[this.spr\ufe34];
                if (var5_5 != 0) break block16;
                if (arg0 == this.cfr_renamed_31 - 1) {
                    v4 = new sprmbb(var6_6, this.cfr_renamed_145.cfr_renamed_1397(), this.cfr_renamed_112[arg0]);
                    var10_10 /* !! */  = (byte[])v4;
                    var9_9 = v4.cfr_renamed_1157();
                    v5 = var9_9;
                } else {
                    v6 = this;
                    var10_10 /* !! */  = new byte[v6.spr\ufe34];
                    System.arraycopy(v6.cfr_renamed_137[arg0], 0, var10_10 /* !! */ , 0, this.spr\ufe34);
                    v6.cfr_renamed_2.cfr_renamed_1370(var10_10 /* !! */ );
                    v7 = this;
                    var9_9 = v7.cfr_renamed_119[arg0].cfr_renamed_1421();
                    v7.cfr_renamed_119[arg0].cfr_renamed_1422(var10_10 /* !! */ );
                    v5 = var9_9;
                }
                System.arraycopy(v5, 0, this.cfr_renamed_86[arg0][0], 0, this.spr\ufe34);
                v8 = var5_5;
                break block17;
            }
            v9 = this;
            var10_10 /* !! */  = new byte[v9.spr\ufe34 << 1];
            System.arraycopy(v9.cfr_renamed_86[arg0][var5_5 - 1], 0, var10_10 /* !! */ , 0, this.spr\ufe34);
            v10 = this;
            System.arraycopy(v9.cfr_renamed_4[arg0][(int)Math.floor((var5_5 - 1) / 2)], 0, var10_10 /* !! */ , v10.spr\ufe34, v10.spr\ufe34);
            v9.cfr_renamed_102.cfr_renamed_1197(var10_10 /* !! */ , 0, var10_10 /* !! */ .length);
            v11 = this;
            this.cfr_renamed_86[arg0][var5_5] = new byte[v11.cfr_renamed_102.cfr_renamed_1218()];
            v11.cfr_renamed_102.cfr_renamed_1219(this.cfr_renamed_86[arg0][var5_5], 0);
            var11_12 = 0;
            v12 = var11_12;
            while (v12 < var5_5) {
                if (var11_12 >= var3_3 - var4_4) ** GOTO lbl74
                if (this.cfr_renamed_185[arg0][var11_12].cfr_renamed_1394()) {
                    v13 = this;
                    v14 = var11_12;
                    v15 = v14;
                    System.arraycopy(v13.cfr_renamed_185[arg0][v14].cfr_renamed_1388(), 0, this.cfr_renamed_86[arg0][var11_12], 0, this.spr\ufe34);
                    v13.cfr_renamed_185[arg0][var11_12].cfr_renamed_1384();
                } else {
                    System.err.println(new StringBuilder().insert(0, sprukaa.cfr_renamed_9("\u001ca-v r;{h;")).append(arg0).append(",").append(var11_12).append(sprdgb.cfr_renamed_9("%\u001cbSx\u001cjUbU\u007fTiX,KdYb\u001cbYiXiX,Ub\u001cMIxT\\]xTOSaLyHmHeSb")).toString());
lbl74:
                    // 2 sources

                    v15 = var11_12;
                }
                if (v15 < var3_3 - 1 && var11_12 >= var3_3 - var4_4 && this.cfr_renamed_82[arg0][var11_12 - (var3_3 - var4_4)].size() > 0) {
                    v16 = this;
                    System.arraycopy(this.cfr_renamed_82[arg0][var11_12 - (var3_3 - var4_4)].lastElement(), 0, v16.cfr_renamed_86[arg0][var11_12], 0, this.spr\ufe34);
                    v16.cfr_renamed_82[arg0][var11_12 - (var3_3 - var4_4)].removeElementAt(this.cfr_renamed_82[arg0][var11_12 - (var3_3 - var4_4)].size() - 1);
                }
                if (var11_12 < var3_3 - var4_4 && (var12_13 = var2_2 + 3 * (1 << var11_12)) < this.cfr_renamed_3[arg0]) {
                    this.cfr_renamed_185[arg0][var11_12].cfr_renamed_1391();
                }
                v12 = ++var11_12;
            }
            v8 = var5_5;
        }
        if (v8 < var3_3 - 1 && var7_7 == 0) {
            System.arraycopy(var8_8, 0, this.cfr_renamed_4[arg0][(int)Math.floor(var5_5 / 2)], 0, this.spr\ufe34);
        }
        if (arg0 == this.cfr_renamed_31 - 1) {
            v17 = var10_11 = 1;
            while (v17 <= (var3_3 - var4_4) / 2) {
                var11_12 = this.cfr_renamed_1419(arg0);
                if (var11_12 >= 0) {
                    try {
                        v18 = this;
                        var12_14 = new byte[v18.spr\ufe34];
                        System.arraycopy(v18.cfr_renamed_185[arg0][var11_12].cfr_renamed_1395(), 0, var12_14, 0, this.spr\ufe34);
                        var13_16 = v18.cfr_renamed_2.cfr_renamed_1370(var12_14);
                        var15_17 = new sprmbb(var13_16, this.cfr_renamed_145.cfr_renamed_1397(), this.cfr_renamed_112[arg0]).cfr_renamed_1157();
                        v18.cfr_renamed_185[arg0][var11_12].cfr_renamed_1386(this.cfr_renamed_2, var15_17);
                    }
                    catch (Exception var12_15) {
                        System.out.println(var12_15);
                    }
                }
                v17 = ++var10_11;
            }
        } else {
            v19 = arg0;
            this.cfr_renamed_132[v19] = this.cfr_renamed_1419(v19);
        }
    }

    public void cfr_renamed_1405() {
        this.cfr_renamed_93 = true;
    }

    public sprihb cfr_renamed_1429() {
        sprihb sprihb2 = new sprihb(this);
        sprihb2.cfr_renamed_1423(this.cfr_renamed_88.cfr_renamed_1140() - 1);
        return sprihb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1425(int arg0) {
        block7: {
            sprihb sprihb2;
            block10: {
                block9: {
                    block8: {
                        byte[] byArray;
                        int n = arg0;
                        this.cfr_renamed_1428(n);
                        if (n <= 0) break block7;
                        if (arg0 > 1) {
                            this.cfr_renamed_126[arg0 - 1 - 1] = this.cfr_renamed_126[arg0 - 1 - 1].cfr_renamed_1427();
                        }
                        sprihb sprihb3 = this;
                        sprihb3.cfr_renamed_119[arg0 - 1] = this.cfr_renamed_119[arg0 - 1].cfr_renamed_1427();
                        int n2 = (int)Math.floor((double)(sprihb3.cfr_renamed_1401(arg0) * 2) / (double)(this.cfr_renamed_105[arg0 - 1] - this.cfr_renamed_1[arg0 - 1]));
                        if (this.cfr_renamed_91[arg0] % n2 != 1) break block8;
                        if (this.cfr_renamed_91[arg0] > 1 && this.cfr_renamed_132[arg0 - 1] >= 0) {
                            byArray = this.cfr_renamed_133[arg0 - 1].cfr_renamed_1421();
                            try {
                                sprihb sprihb4 = this;
                                sprihb4.cfr_renamed_185[arg0 - 1][this.cfr_renamed_132[arg0 - 1]].cfr_renamed_1386(this.cfr_renamed_2, byArray);
                                if (sprihb4.cfr_renamed_185[arg0 - 1][this.cfr_renamed_132[arg0 - 1]].cfr_renamed_1394()) {
                                    // empty if block
                                }
                            }
                            catch (Exception exception) {
                                System.out.println(exception);
                            }
                        }
                        sprihb sprihb5 = this;
                        sprihb5.cfr_renamed_132[arg0 - 1] = this.cfr_renamed_1419(arg0 - 1);
                        if (sprihb5.cfr_renamed_132[arg0 - 1] < 0) break block9;
                        sprihb sprihb6 = this;
                        sprihb2 = sprihb6;
                        sprihb sprihb7 = this;
                        byArray = sprihb6.cfr_renamed_185[arg0 - 1][sprihb7.cfr_renamed_132[arg0 - 1]].cfr_renamed_1395();
                        sprihb6.cfr_renamed_133[arg0 - 1] = new sprjcb(this.cfr_renamed_145.cfr_renamed_1397(), this.cfr_renamed_112[arg0 - 1], n2, byArray);
                        sprihb7.cfr_renamed_133[arg0 - 1] = this.cfr_renamed_133[arg0 - 1].cfr_renamed_1427();
                        break block10;
                    }
                    if (this.cfr_renamed_132[arg0 - 1] >= 0) {
                        this.cfr_renamed_133[arg0 - 1] = this.cfr_renamed_133[arg0 - 1].cfr_renamed_1427();
                    }
                }
                sprihb2 = this;
            }
            sprihb2.cfr_renamed_724[arg0 - 1].cfr_renamed_1407();
            if (this.cfr_renamed_91[arg0] == 1) {
                this.cfr_renamed_152[arg0 - 1].cfr_renamed_1417(new Vector());
            }
            this.cfr_renamed_1420(arg0);
        }
    }

    public int cfr_renamed_1401(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    public int cfr_renamed_1400(int arg0) {
        return this.cfr_renamed_91[arg0];
    }

    public byte[][][] cfr_renamed_1403() {
        return sprzra.cfr_renamed_521(this.cfr_renamed_86);
    }

    public byte[][] cfr_renamed_1402() {
        return sprzra.cfr_renamed_522(this.cfr_renamed_137);
    }

    public byte[] cfr_renamed_1404(int arg0) {
        return this.cfr_renamed_272[arg0];
    }
}

