/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracn;
import com.spire.presentation.packages.sprggn;
import com.spire.presentation.packages.sprjgn;
import com.spire.presentation.packages.sprlxm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwxm;

public final class sprzfn {
    @sprtea
    public int cfr_renamed_723;
    @sprtea
    public int[] cfr_renamed_1226;
    private static final int cfr_renamed_287 = 0;
    @sprtea
    public static int[] cfr_renamed_724;
    @sprtea
    public long cfr_renamed_953;
    @sprtea
    public int cfr_renamed_133;
    private static final int cfr_renamed_185 = 5;
    private static final int spr\ufe34 = 1;
    private static final int cfr_renamed_82 = 6;
    private static final int cfr_renamed_126 = 4;
    @sprtea
    public spracn cfr_renamed_88;
    private static final int cfr_renamed_31 = 8;
    @sprtea
    public sprlxm cfr_renamed_272;
    private static int[] cfr_renamed_145;
    @sprtea
    public int cfr_renamed_114;
    @sprtea
    public byte[] cfr_renamed_96;
    @sprtea
    public int[] cfr_renamed_105;
    @sprtea
    public int[] cfr_renamed_137;
    @sprtea
    public int[] cfr_renamed_79;
    private static final int cfr_renamed_107 = 7;
    @sprtea
    public int cfr_renamed_132;
    @sprtea
    public sprjgn cfr_renamed_102;
    @sprtea
    public Object cfr_renamed_93;
    private static final int cfr_renamed_86 = 2;
    private static final int cfr_renamed_152 = 3;
    private static final int cfr_renamed_112 = 9;
    @sprtea
    public int cfr_renamed_119;
    @sprtea
    public int cfr_renamed_91;
    @sprtea
    public int cfr_renamed_0;
    @sprtea
    public int cfr_renamed_1;
    private static final int cfr_renamed_2 = 1440;
    @sprtea
    public int cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @sprtea
    public int cfr_renamed_12038(int arg0) {
        int n;
        int n2;
        sprzfn sprzfn2 = this;
        int n3 = sprzfn2.cfr_renamed_88.cfr_renamed_79;
        int n4 = sprzfn2.cfr_renamed_119;
        if (n4 <= this.cfr_renamed_114) {
            n2 = this.cfr_renamed_114;
            n = n4;
        } else {
            n2 = this.cfr_renamed_3;
            n = n4;
        }
        int n5 = n2 - n;
        if (n5 > this.cfr_renamed_88.cfr_renamed_119) {
            n5 = this.cfr_renamed_88.cfr_renamed_119;
        }
        if (arg0 == -5) {
            arg0 = 0;
        }
        sprzfn sprzfn3 = this;
        sprzfn3.cfr_renamed_88.cfr_renamed_119 -= n5;
        sprzfn3.cfr_renamed_88.cfr_renamed_93 += (long)n5;
        if (sprzfn3.cfr_renamed_93 != null) {
            this.cfr_renamed_88.cfr_renamed_102 = this.cfr_renamed_953 = sprggn.cfr_renamed_11567(this.cfr_renamed_953, this.cfr_renamed_96, n4, n5);
        }
        System.arraycopy(this.cfr_renamed_96, n4, this.cfr_renamed_88.cfr_renamed_112, n3, n5);
        n3 += n5;
        if ((n4 += n5) == this.cfr_renamed_3) {
            n4 = 0;
            sprzfn sprzfn4 = this;
            if (sprzfn4.cfr_renamed_114 == sprzfn4.cfr_renamed_3) {
                this.cfr_renamed_114 = 0;
            }
            if ((n5 = this.cfr_renamed_114 - n4) > this.cfr_renamed_88.cfr_renamed_119) {
                n5 = this.cfr_renamed_88.cfr_renamed_119;
            }
            if (n5 != 0 && arg0 == -5) {
                arg0 = 0;
            }
            sprzfn sprzfn5 = this;
            sprzfn5.cfr_renamed_88.cfr_renamed_119 -= n5;
            sprzfn5.cfr_renamed_88.cfr_renamed_93 += (long)n5;
            if (sprzfn5.cfr_renamed_93 != null) {
                this.cfr_renamed_88.cfr_renamed_102 = this.cfr_renamed_953 = sprggn.cfr_renamed_11567(this.cfr_renamed_953, this.cfr_renamed_96, n4, n5);
            }
            System.arraycopy(this.cfr_renamed_96, n4, this.cfr_renamed_88.cfr_renamed_112, n3, n5);
            n3 += n5;
            n4 += n5;
        }
        this.cfr_renamed_88.cfr_renamed_79 = n3;
        this.cfr_renamed_119 = n4;
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzfn(spracn spracn2, Object object, int n) {
        void arg1;
        void arg0;
        void arg2;
        sprzfn sprzfn2 = this;
        void v1 = arg2;
        sprzfn sprzfn3 = this;
        sprzfn sprzfn4 = this;
        sprzfn4.cfr_renamed_105 = new int[1];
        sprzfn4.cfr_renamed_1226 = new int[1];
        sprzfn sprzfn5 = this;
        sprzfn4.cfr_renamed_102 = new sprjgn();
        sprzfn5.cfr_renamed_272 = new sprlxm();
        sprzfn3.cfr_renamed_88 = arg0;
        sprzfn3.cfr_renamed_137 = new int[4320];
        this.cfr_renamed_96 = new byte[v1];
        sprzfn2.cfr_renamed_3 = v1;
        sprzfn2.cfr_renamed_93 = arg1;
        this.cfr_renamed_132 = 0;
        this.cfr_renamed_12033(null);
    }

    @sprtea
    public int cfr_renamed_12029() {
        if (this.cfr_renamed_132 == 1) {
            return 1;
        }
        return 0;
    }

    static {
        int[] nArray = new int[17];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 3;
        nArray[3] = 7;
        nArray[4] = 15;
        nArray[5] = 31;
        nArray[6] = 63;
        nArray[7] = 127;
        nArray[8] = 255;
        nArray[9] = 511;
        nArray[10] = 1023;
        nArray[11] = 2047;
        nArray[12] = 4095;
        nArray[13] = 8191;
        nArray[14] = 16383;
        nArray[15] = Short.MAX_VALUE;
        nArray[16] = 65535;
        cfr_renamed_145 = nArray;
        int[] nArray2 = new int[19];
        nArray2[0] = 16;
        nArray2[1] = 17;
        nArray2[2] = 18;
        nArray2[3] = 0;
        nArray2[4] = 8;
        nArray2[5] = 7;
        nArray2[6] = 9;
        nArray2[7] = 6;
        nArray2[8] = 10;
        nArray2[9] = 5;
        nArray2[10] = 11;
        nArray2[11] = 4;
        nArray2[12] = 12;
        nArray2[13] = 3;
        nArray2[14] = 13;
        nArray2[15] = 2;
        nArray2[16] = 14;
        nArray2[17] = 1;
        nArray2[18] = 15;
        cfr_renamed_724 = nArray2;
    }

    @sprtea
    public void cfr_renamed_12032(byte[] arg0, int arg1, int arg2) {
        System.arraycopy(arg0, arg1, this.cfr_renamed_96, 0, arg2);
        this.cfr_renamed_119 = this.cfr_renamed_114 = arg2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @sprtea
    public int cfr_renamed_12034(int arg0) {
        v0 = this;
        var5_2 = v0.cfr_renamed_88.cfr_renamed_91;
        var6_3 = v0.cfr_renamed_88.cfr_renamed_0;
        var3_4 = v0.cfr_renamed_4;
        var4_5 = v0.cfr_renamed_133;
        var7_6 = v0.cfr_renamed_114;
        var8_7 = var7_6 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
        block18: while (true) {
            v1 = this;
            block19: while (true) {
                switch (v1.cfr_renamed_132) {
                    case 0: {
                        v2 = var4_5;
                        while (false) {
                        }
                        while (v2 < 3) {
                            if (var6_3 == 0) {
                                v3 = this;
                                v3.cfr_renamed_4 = var3_4;
                                v3.cfr_renamed_133 = var4_5;
                                v3.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                this.cfr_renamed_114 = var7_6;
                                return this.cfr_renamed_12038(arg0);
                            }
                            arg0 = 0;
                            --var6_3;
                            v4 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                            ++var5_2;
                            v5 = var4_5;
                            var3_4 |= (v4 & 255) << v5;
                            v2 = var4_5 += 8;
                        }
                        v6 = var2_8 = var3_4 & 7;
                        this.cfr_renamed_723 = v6 & 1;
                        switch (sprwxm.cfr_renamed_11993(v6, 1)) lbl-1000:
                        // 2 sources

                        {
                            case 0: {
                                if (false) ** GOTO lbl-1000
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, 3);
                                var2_8 = (var4_5 -= 3) & 7;
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, var2_8);
                                var4_5 -= var2_8;
                                this.cfr_renamed_132 = 1;
                                continue block18;
                            }
                            case 1: {
                                var9_9 = new int[1];
                                var10_13 = new int[1];
                                var11_16 /* !! */  = new int[1][];
                                var12_19 /* !! */  = new int[1][];
                                sprlxm.cfr_renamed_12025(var9_9, var10_13, var11_16 /* !! */ , var12_19 /* !! */ , this.cfr_renamed_88);
                                this.cfr_renamed_102.cfr_renamed_12039(var9_9[0], var10_13[0], var11_16 /* !! */ [0], 0, var12_19 /* !! */ [0], 0);
                                var4_5 -= 3;
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, 3);
                                this.cfr_renamed_132 = 6;
                                continue block18;
                            }
                            case 2: {
                                var4_5 -= 3;
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, 3);
                                this.cfr_renamed_132 = 3;
                                continue block18;
                            }
                            case 3: {
                                var4_5 -= 3;
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, 3);
                                v7 = this;
                                v8 = this;
                                this.cfr_renamed_132 = 9;
                                v8.cfr_renamed_88.cfr_renamed_3 = "invalid block type";
                                arg0 = -3;
                                v7.cfr_renamed_4 = var3_4;
                                v8.cfr_renamed_133 = var4_5;
                                v7.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                v7.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                v7.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                v7.cfr_renamed_114 = var7_6;
                                return v7.cfr_renamed_12038(arg0);
                            }
                        }
                        continue block18;
                    }
                    case 1: {
                        v9 = var4_5;
                        while (v9 < 32) {
                            if (var6_3 == 0) {
                                v10 = this;
                                v10.cfr_renamed_4 = var3_4;
                                v10.cfr_renamed_133 = var4_5;
                                v10.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                this.cfr_renamed_114 = var7_6;
                                return this.cfr_renamed_12038(arg0);
                            }
                            arg0 = 0;
                            --var6_3;
                            v11 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                            ++var5_2;
                            v12 = var4_5;
                            var3_4 |= (v11 & 255) << v12;
                            v9 = var4_5 += 8;
                        }
                        if ((sprwxm.cfr_renamed_11993(~var3_4, 16) & 65535) != (var3_4 & 65535)) {
                            v13 = this;
                            v14 = this;
                            this.cfr_renamed_132 = 9;
                            v14.cfr_renamed_88.cfr_renamed_3 = "invalid stored block lengths";
                            arg0 = -3;
                            v13.cfr_renamed_4 = var3_4;
                            v14.cfr_renamed_133 = var4_5;
                            v13.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            v13.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            v13.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            v13.cfr_renamed_114 = var7_6;
                            return v13.cfr_renamed_12038(arg0);
                        }
                        this.cfr_renamed_0 = var3_4 & 65535;
                        var4_5 = 0;
                        var3_4 = 0;
                        this.cfr_renamed_132 = this.cfr_renamed_0 != 0 ? 2 : (this.cfr_renamed_723 != 0 ? 7 : 0);
                        v1 = this;
                        continue block19;
                    }
                    case 2: {
                        if (var6_3 == 0) {
                            v15 = this;
                            v15.cfr_renamed_4 = var3_4;
                            this.cfr_renamed_133 = var4_5;
                            v15.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            this.cfr_renamed_114 = var7_6;
                            return this.cfr_renamed_12038(arg0);
                        }
                        if (var8_7 == 0) {
                            if (var7_6 == this.cfr_renamed_3 && this.cfr_renamed_119 != 0) {
                                var7_6 = 0;
                                v16 = var8_7 = 0 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
                            }
                            if (var8_7 == 0) {
                                v17 = this;
                                v17.cfr_renamed_114 = var7_6;
                                arg0 = v17.cfr_renamed_12038(arg0);
                                var7_6 = v17.cfr_renamed_114;
                                v18 = var8_7 = var7_6 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
                                if (var7_6 == this.cfr_renamed_3 && this.cfr_renamed_119 != 0) {
                                    var7_6 = 0;
                                    v19 = var8_7 = 0 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
                                }
                                if (var8_7 == 0) {
                                    v20 = this;
                                    v20.cfr_renamed_4 = var3_4;
                                    this.cfr_renamed_133 = var4_5;
                                    v20.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                    this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                    this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                    this.cfr_renamed_114 = var7_6;
                                    return this.cfr_renamed_12038(arg0);
                                }
                            }
                        }
                        arg0 = 0;
                        var2_8 = this.cfr_renamed_0;
                        if (var2_8 > var6_3) {
                            var2_8 = var6_3;
                        }
                        if (var2_8 > var8_7) {
                            var2_8 = var8_7;
                        }
                        v21 = this;
                        v22 = var5_2;
                        System.arraycopy(v21.cfr_renamed_88.cfr_renamed_86, v22, this.cfr_renamed_96, var7_6, var2_8);
                        var5_2 = v22 + var2_8;
                        var6_3 -= var2_8;
                        var7_6 += var2_8;
                        var8_7 -= var2_8;
                        if ((v21.cfr_renamed_0 -= var2_8) != 0) {
                            v1 = this;
                            continue block19;
                        }
                        this.cfr_renamed_132 = this.cfr_renamed_723 != 0 ? 7 : 0;
                        v1 = this;
                        continue block19;
                    }
                    case 3: {
                        v23 = var4_5;
                        while (v23 < 14) {
                            if (var6_3 == 0) {
                                v24 = this;
                                v24.cfr_renamed_4 = var3_4;
                                v24.cfr_renamed_133 = var4_5;
                                v24.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                this.cfr_renamed_114 = var7_6;
                                return this.cfr_renamed_12038(arg0);
                            }
                            arg0 = 0;
                            --var6_3;
                            v25 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                            ++var5_2;
                            v26 = var4_5;
                            var3_4 |= (v25 & 255) << v26;
                            v23 = var4_5 += 8;
                        }
                        this.cfr_renamed_1 = var2_8 = var3_4 & 16383;
                        if ((var2_8 & 31) > 29 || (var2_8 >> 5 & 31) > 29) {
                            v27 = this;
                            v28 = this;
                            this.cfr_renamed_132 = 9;
                            v28.cfr_renamed_88.cfr_renamed_3 = "too many length or distance symbols";
                            arg0 = -3;
                            v27.cfr_renamed_4 = var3_4;
                            v28.cfr_renamed_133 = var4_5;
                            v27.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            v27.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            v27.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            v27.cfr_renamed_114 = var7_6;
                            return v27.cfr_renamed_12038(arg0);
                        }
                        var2_8 = 258 + (var2_8 & 31) + (var2_8 >> 5 & 31);
                        if (this.cfr_renamed_79 == null || this.cfr_renamed_79.length < var2_8) {
                            this.cfr_renamed_79 = new int[var2_8];
                            v29 = var3_4;
                        } else {
                            v30 = var9_10 = 0;
                            while (v30 < var2_8) {
                                this.cfr_renamed_79[var9_10++] = 0;
                                v30 = var9_10;
                            }
                            v29 = var3_4;
                        }
                        var3_4 = sprwxm.cfr_renamed_11993(v29, 14);
                        v31 = this;
                        var4_5 -= 14;
                        v31.cfr_renamed_91 = 0;
                        v31.cfr_renamed_132 = 4;
                    }
                    case 4: {
                        v32 = this;
                        while (v32.cfr_renamed_91 < 4 + sprwxm.cfr_renamed_11993(this.cfr_renamed_1, 10)) {
                            v33 = var4_5;
                            while (v33 < 3) {
                                if (var6_3 == 0) {
                                    v34 = this;
                                    v34.cfr_renamed_4 = var3_4;
                                    v34.cfr_renamed_133 = var4_5;
                                    v34.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                    this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                    this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                    this.cfr_renamed_114 = var7_6;
                                    return this.cfr_renamed_12038(arg0);
                                }
                                arg0 = 0;
                                --var6_3;
                                v35 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                                ++var5_2;
                                v36 = var4_5;
                                var3_4 |= (v35 & 255) << v36;
                                v33 = var4_5 += 8;
                            }
                            this.cfr_renamed_79[sprzfn.cfr_renamed_724[this.cfr_renamed_91++]] = var3_4 & 7;
                            var4_5 -= 3;
                            var3_4 = sprwxm.cfr_renamed_11993(var3_4, 3);
                            v32 = this;
                        }
                        v37 = this;
                        while (v37.cfr_renamed_91 < 19) {
                            this.cfr_renamed_79[sprzfn.cfr_renamed_724[this.cfr_renamed_91++]] = 0;
                            v37 = this;
                        }
                        v38 = this;
                        v38.cfr_renamed_105[0] = 7;
                        v39 = this;
                        v40 = this;
                        var2_8 = v38.cfr_renamed_272.cfr_renamed_12027(v39.cfr_renamed_79, v39.cfr_renamed_105, v40.cfr_renamed_1226, v40.cfr_renamed_137, this.cfr_renamed_88);
                        if (var2_8 != 0) {
                            arg0 = var2_8;
                            if (arg0 == -3) {
                                v41 = this;
                                v41.cfr_renamed_79 = null;
                                v41.cfr_renamed_132 = 9;
                            }
                            v42 = this;
                            v42.cfr_renamed_4 = var3_4;
                            v42.cfr_renamed_133 = var4_5;
                            v42.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            this.cfr_renamed_114 = var7_6;
                            return this.cfr_renamed_12038(arg0);
                        }
                        this.cfr_renamed_91 = 0;
                        this.cfr_renamed_132 = 5;
                    }
                    case 5: {
                        while (true) {
                            v43 = this;
                            var2_8 = v43.cfr_renamed_1;
                            if (v43.cfr_renamed_91 >= 258 + (var2_8 & 31) + (var2_8 >> 5 & 31)) break;
                            var2_8 = this.cfr_renamed_105[0];
                            v44 = var4_5;
                            while (v44 < var2_8) {
                                if (var6_3 == 0) {
                                    v45 = this;
                                    v45.cfr_renamed_4 = var3_4;
                                    v45.cfr_renamed_133 = var4_5;
                                    v45.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                    this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                    this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                    this.cfr_renamed_114 = var7_6;
                                    return this.cfr_renamed_12038(arg0);
                                }
                                arg0 = 0;
                                --var6_3;
                                v46 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                                ++var5_2;
                                v47 = var4_5;
                                var3_4 |= (v46 & 255) << v47;
                                v44 = var4_5 += 8;
                            }
                            v48 = this;
                            var11_18 = v48.cfr_renamed_137[(this.cfr_renamed_1226[0] + (var3_4 & sprzfn.cfr_renamed_145[var2_8 = v48.cfr_renamed_137[(v48.cfr_renamed_1226[0] + (var3_4 & sprzfn.cfr_renamed_145[var2_8])) * 3 + 1]])) * 3 + 2];
                            if (var11_18 < 16) {
                                var3_4 = sprwxm.cfr_renamed_11993(var3_4, var2_8);
                                var4_5 -= var2_8;
                                this.cfr_renamed_79[this.cfr_renamed_91++] = var11_18;
                                continue;
                            }
                            var9_12 = var11_18 == 18 ? 7 : var11_18 - 14;
                            var10_15 = var11_18 == 18 ? 11 : 3;
                            v49 = var4_5;
                            while (v49 < var2_8 + var9_12) {
                                if (var6_3 == 0) {
                                    v50 = this;
                                    v50.cfr_renamed_4 = var3_4;
                                    v50.cfr_renamed_133 = var4_5;
                                    v50.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                    this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                    this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                    this.cfr_renamed_114 = var7_6;
                                    return this.cfr_renamed_12038(arg0);
                                }
                                arg0 = 0;
                                --var6_3;
                                v51 = this.cfr_renamed_88.cfr_renamed_86[var5_2] & 255;
                                ++var5_2;
                                v52 = var4_5;
                                var3_4 |= (v51 & 255) << v52;
                                v49 = var4_5 += 8;
                            }
                            var3_4 = sprwxm.cfr_renamed_11993(var3_4, var2_8);
                            var4_5 -= var2_8;
                            var10_15 += var3_4 & sprzfn.cfr_renamed_145[var9_12];
                            var3_4 = sprwxm.cfr_renamed_11993(var3_4, var9_12);
                            var4_5 -= var9_12;
                            v53 = this;
                            var9_12 = v53.cfr_renamed_91;
                            var2_8 = v53.cfr_renamed_1;
                            if (var9_12 + var10_15 > 258 + (var2_8 & 31) + (var2_8 >> 5 & 31) || var11_18 == 16 && var9_12 < 1) {
                                v54 = this;
                                v55 = this;
                                v56 = this;
                                v56.cfr_renamed_79 = null;
                                v56.cfr_renamed_132 = 9;
                                v55.cfr_renamed_88.cfr_renamed_3 = "invalid bit length repeat";
                                arg0 = -3;
                                v54.cfr_renamed_4 = var3_4;
                                v55.cfr_renamed_133 = var4_5;
                                v54.cfr_renamed_88.cfr_renamed_0 = var6_3;
                                v54.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                                v54.cfr_renamed_88.cfr_renamed_91 = var5_2;
                                v54.cfr_renamed_114 = var7_6;
                                return v54.cfr_renamed_12038(arg0);
                            }
                            var11_18 = var11_18 == 16 ? this.cfr_renamed_79[var9_12 - 1] : 0;
                            do {
                                this.cfr_renamed_79[var9_12++] = var11_18;
                            } while (--var10_15 != 0);
                            this.cfr_renamed_91 = var9_12;
                        }
                        this.cfr_renamed_1226[0] = -1;
                        v57 = new int[1];
                        v57[0] = 9;
                        var9_9 = v57;
                        v58 = new int[1];
                        v58[0] = 6;
                        var10_13 = v58;
                        var11_16 /* !! */  = (int[][])new int[1];
                        var12_19 /* !! */  = (int[][])new int[1];
                        v59 = this;
                        var2_8 = v59.cfr_renamed_1;
                        v60 = this;
                        var2_8 = v59.cfr_renamed_272.cfr_renamed_12026(257 + (var2_8 & 31), 1 + (var2_8 >> 5 & 31), this.cfr_renamed_79, var9_9, var10_13, (int[])var11_16 /* !! */ , (int[])var12_19 /* !! */ , v60.cfr_renamed_137, v60.cfr_renamed_88);
                        if (var2_8 != 0) {
                            if (var2_8 == -3) {
                                v61 = this;
                                v61.cfr_renamed_79 = null;
                                v61.cfr_renamed_132 = 9;
                            }
                            arg0 = var2_8;
                            v62 = this;
                            v62.cfr_renamed_4 = var3_4;
                            this.cfr_renamed_133 = var4_5;
                            v62.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            this.cfr_renamed_114 = var7_6;
                            return this.cfr_renamed_12038(arg0);
                        }
                        this.cfr_renamed_102.cfr_renamed_12039(var9_9[0], var10_13[0], this.cfr_renamed_137, (int)var11_16 /* !! */ [0], this.cfr_renamed_137, (int)var12_19 /* !! */ [0]);
                        this.cfr_renamed_132 = 6;
                    }
                    case 6: {
                        v63 = this;
                        v63.cfr_renamed_4 = var3_4;
                        v63.cfr_renamed_133 = var4_5;
                        v63.cfr_renamed_88.cfr_renamed_0 = var6_3;
                        this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                        this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                        this.cfr_renamed_114 = var7_6;
                        arg0 = this.cfr_renamed_102.cfr_renamed_12036(this, arg0);
                        if (arg0 != 1) {
                            return this.cfr_renamed_12038(arg0);
                        }
                        arg0 = 0;
                        v64 = this;
                        var5_2 = v64.cfr_renamed_88.cfr_renamed_91;
                        var6_3 = v64.cfr_renamed_88.cfr_renamed_0;
                        var3_4 = v64.cfr_renamed_4;
                        var4_5 = v64.cfr_renamed_133;
                        var7_6 = v64.cfr_renamed_114;
                        v65 = var8_7 = var7_6 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
                        if (this.cfr_renamed_723 == 0) {
                            v1 = this;
                            this.cfr_renamed_132 = 0;
                            continue block19;
                        }
                        this.cfr_renamed_132 = 7;
                    }
                    case 7: {
                        this.cfr_renamed_114 = var7_6;
                        arg0 = this.cfr_renamed_12038(arg0);
                        var7_6 = this.cfr_renamed_114;
                        var8_7 = var7_6 < this.cfr_renamed_119 ? this.cfr_renamed_119 - var7_6 - 1 : this.cfr_renamed_3 - var7_6;
                        v66 = this;
                        if (v66.cfr_renamed_119 != v66.cfr_renamed_114) {
                            v67 = this;
                            v67.cfr_renamed_4 = var3_4;
                            this.cfr_renamed_133 = var4_5;
                            v67.cfr_renamed_88.cfr_renamed_0 = var6_3;
                            this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                            this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                            this.cfr_renamed_114 = var7_6;
                            return this.cfr_renamed_12038(arg0);
                        }
                        this.cfr_renamed_132 = 8;
                    }
                    case 8: {
                        arg0 = 1;
                        v68 = this;
                        v68.cfr_renamed_4 = var3_4;
                        this.cfr_renamed_133 = var4_5;
                        v68.cfr_renamed_88.cfr_renamed_0 = var6_3;
                        this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                        this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                        this.cfr_renamed_114 = var7_6;
                        return this.cfr_renamed_12038(1);
                    }
                    case 9: {
                        arg0 = -3;
                        v69 = this;
                        v69.cfr_renamed_4 = var3_4;
                        this.cfr_renamed_133 = var4_5;
                        v69.cfr_renamed_88.cfr_renamed_0 = var6_3;
                        this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
                        this.cfr_renamed_88.cfr_renamed_91 = var5_2;
                        this.cfr_renamed_114 = var7_6;
                        return this.cfr_renamed_12038(-3);
                    }
                }
                break;
            }
            break;
        }
        arg0 = -2;
        v70 = this;
        v70.cfr_renamed_4 = var3_4;
        this.cfr_renamed_133 = var4_5;
        v70.cfr_renamed_88.cfr_renamed_0 = var6_3;
        this.cfr_renamed_88.cfr_renamed_152 += (long)(var5_2 - this.cfr_renamed_88.cfr_renamed_91);
        this.cfr_renamed_88.cfr_renamed_91 = var5_2;
        this.cfr_renamed_114 = var7_6;
        return this.cfr_renamed_12038(-2);
    }

    @sprtea
    public void cfr_renamed_12033(long[] arg0) {
        if (arg0 != null) {
            arg0[0] = this.cfr_renamed_953;
        }
        sprzfn sprzfn2 = this;
        sprzfn sprzfn3 = this;
        sprzfn3.cfr_renamed_132 = 0;
        sprzfn3.cfr_renamed_133 = 0;
        sprzfn2.cfr_renamed_4 = 0;
        sprzfn2.cfr_renamed_114 = 0;
        this.cfr_renamed_119 = 0;
        if (this.cfr_renamed_93 != null) {
            this.cfr_renamed_88.cfr_renamed_102 = this.cfr_renamed_953 = sprggn.cfr_renamed_11567(0L, null, 0, 0);
        }
    }

    @sprtea
    public void cfr_renamed_12030() {
        sprzfn sprzfn2 = this;
        this.cfr_renamed_12033(null);
        sprzfn2.cfr_renamed_96 = null;
        sprzfn2.cfr_renamed_137 = null;
    }
}

