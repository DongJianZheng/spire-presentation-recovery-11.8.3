/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwxm;
import com.spire.presentation.packages.sprzfn;

public final class sprjgn {
    @sprtea
    public int cfr_renamed_82;
    @sprtea
    public int cfr_renamed_126;
    @sprtea
    public byte cfr_renamed_88;
    private static final int cfr_renamed_31 = 3;
    @sprtea
    public int cfr_renamed_272;
    @sprtea
    public int cfr_renamed_145;
    @sprtea
    public int[] cfr_renamed_114;
    @sprtea
    public int cfr_renamed_96;
    @sprtea
    public int cfr_renamed_105;
    private static final int cfr_renamed_137 = 5;
    @sprtea
    public int cfr_renamed_79 = 0;
    @sprtea
    public int[] cfr_renamed_107;
    private static final int cfr_renamed_132 = 8;
    private static final int cfr_renamed_102 = 0;
    private static int[] cfr_renamed_93;
    private static final int cfr_renamed_86 = 1;
    private static final int cfr_renamed_152 = 7;
    private static final int cfr_renamed_112 = 4;
    @sprtea
    public int[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 6;
    private static final int cfr_renamed_0 = 2;
    private static final int cfr_renamed_1 = 9;
    @sprtea
    public byte cfr_renamed_2;
    @sprtea
    public int cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @sprtea
    public sprjgn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public int cfr_renamed_12036(sprzfn arg0, int arg1) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        sprzfn sprzfn2 = arg0;
        spracn spracn2 = sprzfn2.cfr_renamed_88;
        n3 = spracn2.cfr_renamed_91;
        int n4 = spracn2.cfr_renamed_0;
        n = sprzfn2.cfr_renamed_4;
        n2 = sprzfn2.cfr_renamed_133;
        int n5 = sprzfn2.cfr_renamed_114;
        int n6 = n5 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
        sprjgn sprjgn2 = this;
        block12: while (true) {
            switch (sprjgn2.cfr_renamed_4) {
                case 0: {
                    if (n6 >= 258 && n4 >= 10) {
                        sprzfn sprzfn3 = arg0;
                        sprzfn sprzfn4 = arg0;
                        sprzfn4.cfr_renamed_4 = n;
                        sprzfn4.cfr_renamed_133 = n2;
                        spracn spracn3 = spracn2;
                        spracn3.cfr_renamed_0 = n4;
                        spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                        spracn3.cfr_renamed_91 = n3;
                        arg0.cfr_renamed_114 = n5;
                        sprjgn sprjgn3 = this;
                        sprjgn sprjgn4 = this;
                        arg1 = sprjgn3.cfr_renamed_12037(this.cfr_renamed_2 & 0xFF, this.cfr_renamed_88 & 0xFF, sprjgn3.cfr_renamed_107, sprjgn4.cfr_renamed_3, sprjgn4.cfr_renamed_119, this.cfr_renamed_272, arg0, spracn2);
                        n3 = spracn2.cfr_renamed_91;
                        n4 = spracn2.cfr_renamed_0;
                        n = sprzfn3.cfr_renamed_4;
                        n2 = sprzfn3.cfr_renamed_133;
                        n5 = sprzfn3.cfr_renamed_114;
                        int n7 = n6 = n5 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                        if (arg1 != 0) {
                            this.cfr_renamed_4 = arg1 == 1 ? 7 : 9;
                            sprjgn2 = this;
                            continue block12;
                        }
                    }
                    sprjgn sprjgn5 = this;
                    sprjgn5.cfr_renamed_96 = sprjgn5.cfr_renamed_2 & 0xFF;
                    sprjgn5.cfr_renamed_114 = sprjgn5.cfr_renamed_107;
                    sprjgn5.cfr_renamed_79 = sprjgn5.cfr_renamed_3;
                    this.cfr_renamed_4 = 1;
                }
                case 1: {
                    int n8 = this.cfr_renamed_96;
                    int n9 = n2;
                    while (n9 < n8) {
                        if (n4 == 0) {
                            sprzfn sprzfn5 = arg0;
                            sprzfn5.cfr_renamed_4 = n;
                            sprzfn5.cfr_renamed_133 = n2;
                            spracn spracn4 = spracn2;
                            spracn4.cfr_renamed_0 = n4;
                            spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                            spracn4.cfr_renamed_91 = n3;
                            arg0.cfr_renamed_114 = n5;
                            return arg0.cfr_renamed_12038(arg1);
                        }
                        arg1 = 0;
                        --n4;
                        int n10 = spracn2.cfr_renamed_86[n3] & 0xFF;
                        ++n3;
                        int n11 = n2;
                        n |= (n10 & 0xFF) << n11;
                        n9 = n2 += 8;
                    }
                    sprjgn sprjgn6 = this;
                    int n12 = (sprjgn6.cfr_renamed_79 + (n & cfr_renamed_93[n8])) * 3;
                    n = sprwxm.cfr_renamed_11993(n, this.cfr_renamed_114[n12 + 1]);
                    n2 -= this.cfr_renamed_114[n12 + 1];
                    int n13 = sprjgn6.cfr_renamed_114[n12];
                    if (n13 == 0) {
                        sprjgn2 = this;
                        this.cfr_renamed_82 = this.cfr_renamed_114[n12 + 2];
                        this.cfr_renamed_4 = 6;
                        continue block12;
                    }
                    if ((n13 & 0x10) != 0) {
                        sprjgn2 = this;
                        this.cfr_renamed_126 = n13 & 0xF;
                        this.cfr_renamed_105 = this.cfr_renamed_114[n12 + 2];
                        this.cfr_renamed_4 = 2;
                        continue block12;
                    }
                    if ((n13 & 0x40) == 0) {
                        sprjgn2 = this;
                        this.cfr_renamed_96 = n13;
                        this.cfr_renamed_79 = n12 / 3 + this.cfr_renamed_114[n12 + 2];
                        continue block12;
                    }
                    if ((n13 & 0x20) == 0) {
                        this.cfr_renamed_4 = 9;
                        spracn spracn5 = spracn2;
                        spracn5.cfr_renamed_3 = "invalid literal/length code";
                        arg1 = -3;
                        arg0.cfr_renamed_4 = n;
                        arg0.cfr_renamed_133 = n2;
                        spracn5.cfr_renamed_0 = n4;
                        spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                        spracn2.cfr_renamed_91 = n3;
                        arg0.cfr_renamed_114 = n5;
                        return arg0.cfr_renamed_12038(arg1);
                    }
                    sprjgn2 = this;
                    this.cfr_renamed_4 = 7;
                    continue block12;
                }
                case 2: {
                    int n8 = this.cfr_renamed_126;
                    int n14 = n2;
                    while (n14 < n8) {
                        if (n4 == 0) {
                            sprzfn sprzfn6 = arg0;
                            sprzfn6.cfr_renamed_4 = n;
                            sprzfn6.cfr_renamed_133 = n2;
                            spracn spracn6 = spracn2;
                            spracn6.cfr_renamed_0 = n4;
                            spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                            spracn6.cfr_renamed_91 = n3;
                            arg0.cfr_renamed_114 = n5;
                            return arg0.cfr_renamed_12038(arg1);
                        }
                        arg1 = 0;
                        --n4;
                        int n15 = spracn2.cfr_renamed_86[n3] & 0xFF;
                        ++n3;
                        int n16 = n2;
                        n |= (n15 & 0xFF) << n16;
                        n14 = n2 += 8;
                    }
                    sprjgn sprjgn7 = this;
                    this.cfr_renamed_105 += n & cfr_renamed_93[n8];
                    n >>= n8;
                    n2 -= n8;
                    this.cfr_renamed_96 = sprjgn7.cfr_renamed_88 & 0xFF;
                    sprjgn7.cfr_renamed_114 = sprjgn7.cfr_renamed_119;
                    sprjgn7.cfr_renamed_79 = sprjgn7.cfr_renamed_272;
                    sprjgn7.cfr_renamed_4 = 3;
                }
                case 3: {
                    int n8 = this.cfr_renamed_96;
                    int n17 = n2;
                    while (n17 < n8) {
                        if (n4 == 0) {
                            sprzfn sprzfn7 = arg0;
                            sprzfn7.cfr_renamed_4 = n;
                            sprzfn7.cfr_renamed_133 = n2;
                            spracn spracn7 = spracn2;
                            spracn7.cfr_renamed_0 = n4;
                            spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                            spracn7.cfr_renamed_91 = n3;
                            arg0.cfr_renamed_114 = n5;
                            return arg0.cfr_renamed_12038(arg1);
                        }
                        arg1 = 0;
                        --n4;
                        int n18 = spracn2.cfr_renamed_86[n3] & 0xFF;
                        ++n3;
                        int n19 = n2;
                        n |= (n18 & 0xFF) << n19;
                        n17 = n2 += 8;
                    }
                    sprjgn sprjgn8 = this;
                    int n12 = (sprjgn8.cfr_renamed_79 + (n & cfr_renamed_93[n8])) * 3;
                    n >>= this.cfr_renamed_114[n12 + 1];
                    n2 -= this.cfr_renamed_114[n12 + 1];
                    int n13 = sprjgn8.cfr_renamed_114[n12];
                    if ((n13 & 0x10) != 0) {
                        sprjgn2 = this;
                        this.cfr_renamed_126 = n13 & 0xF;
                        this.cfr_renamed_145 = this.cfr_renamed_114[n12 + 2];
                        this.cfr_renamed_4 = 4;
                        continue block12;
                    }
                    if ((n13 & 0x40) != 0) {
                        this.cfr_renamed_4 = 9;
                        spracn spracn8 = spracn2;
                        spracn8.cfr_renamed_3 = "invalid distance code";
                        arg1 = -3;
                        arg0.cfr_renamed_4 = n;
                        arg0.cfr_renamed_133 = n2;
                        spracn8.cfr_renamed_0 = n4;
                        spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                        spracn2.cfr_renamed_91 = n3;
                        arg0.cfr_renamed_114 = n5;
                        return arg0.cfr_renamed_12038(arg1);
                    }
                    sprjgn2 = this;
                    this.cfr_renamed_96 = n13;
                    this.cfr_renamed_79 = n12 / 3 + this.cfr_renamed_114[n12 + 2];
                    continue block12;
                }
                case 4: {
                    int n8 = this.cfr_renamed_126;
                    int n20 = n2;
                    while (n20 < n8) {
                        if (n4 == 0) {
                            sprzfn sprzfn8 = arg0;
                            sprzfn8.cfr_renamed_4 = n;
                            sprzfn8.cfr_renamed_133 = n2;
                            spracn spracn9 = spracn2;
                            spracn9.cfr_renamed_0 = n4;
                            spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                            spracn9.cfr_renamed_91 = n3;
                            arg0.cfr_renamed_114 = n5;
                            return arg0.cfr_renamed_12038(arg1);
                        }
                        arg1 = 0;
                        --n4;
                        int n21 = spracn2.cfr_renamed_86[n3] & 0xFF;
                        ++n3;
                        int n22 = n2;
                        n |= (n21 & 0xFF) << n22;
                        n20 = n2 += 8;
                    }
                    int n23 = n;
                    this.cfr_renamed_145 += n23 & cfr_renamed_93[n8];
                    n = n23 >> n8;
                    n2 -= n8;
                    this.cfr_renamed_4 = 5;
                }
                case 5: {
                    int n24;
                    int n25 = n5 - this.cfr_renamed_145;
                    while (n25 < 0) {
                        n25 = n24 + arg0.cfr_renamed_3;
                    }
                    sprjgn sprjgn9 = this;
                    while (sprjgn9.cfr_renamed_105 != 0) {
                        if (n6 == 0) {
                            if (n5 == arg0.cfr_renamed_3 && arg0.cfr_renamed_119 != 0) {
                                n5 = 0;
                                int n26 = n6 = 0 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                            }
                            if (n6 == 0) {
                                sprzfn sprzfn9 = arg0;
                                sprzfn9.cfr_renamed_114 = n5;
                                arg1 = sprzfn9.cfr_renamed_12038(arg1);
                                n5 = sprzfn9.cfr_renamed_114;
                                int n27 = n6 = n5 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                                if (n5 == arg0.cfr_renamed_3 && arg0.cfr_renamed_119 != 0) {
                                    n5 = 0;
                                    int n28 = n6 = 0 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                                }
                                if (n6 == 0) {
                                    sprzfn sprzfn10 = arg0;
                                    sprzfn10.cfr_renamed_4 = n;
                                    sprzfn10.cfr_renamed_133 = n2;
                                    spracn spracn10 = spracn2;
                                    spracn10.cfr_renamed_0 = n4;
                                    spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                                    spracn10.cfr_renamed_91 = n3;
                                    arg0.cfr_renamed_114 = n5;
                                    return arg0.cfr_renamed_12038(arg1);
                                }
                            }
                        }
                        int n29 = n5++;
                        byte by = arg0.cfr_renamed_96[n24];
                        --n6;
                        arg0.cfr_renamed_96[n29] = by;
                        if (++n24 == arg0.cfr_renamed_3) {
                            n24 = 0;
                        }
                        sprjgn sprjgn10 = this;
                        sprjgn9 = sprjgn10;
                        --sprjgn10.cfr_renamed_105;
                    }
                    sprjgn2 = this;
                    this.cfr_renamed_4 = 0;
                    continue block12;
                }
                case 6: {
                    if (n6 == 0) {
                        if (n5 == arg0.cfr_renamed_3 && arg0.cfr_renamed_119 != 0) {
                            n5 = 0;
                            int n30 = n6 = 0 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                        }
                        if (n6 == 0) {
                            sprzfn sprzfn11 = arg0;
                            sprzfn11.cfr_renamed_114 = n5;
                            arg1 = sprzfn11.cfr_renamed_12038(arg1);
                            n5 = sprzfn11.cfr_renamed_114;
                            int n31 = n6 = n5 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                            if (n5 == arg0.cfr_renamed_3 && arg0.cfr_renamed_119 != 0) {
                                n5 = 0;
                                int n32 = n6 = 0 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                            }
                            if (n6 == 0) {
                                sprzfn sprzfn12 = arg0;
                                sprzfn12.cfr_renamed_4 = n;
                                sprzfn12.cfr_renamed_133 = n2;
                                spracn spracn11 = spracn2;
                                spracn11.cfr_renamed_0 = n4;
                                spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                                spracn11.cfr_renamed_91 = n3;
                                arg0.cfr_renamed_114 = n5;
                                return arg0.cfr_renamed_12038(arg1);
                            }
                        }
                    }
                    arg1 = 0;
                    sprjgn sprjgn11 = this;
                    sprjgn2 = sprjgn11;
                    --n6;
                    arg0.cfr_renamed_96[++n5] = (byte)sprjgn11.cfr_renamed_82;
                    this.cfr_renamed_4 = 0;
                    continue block12;
                }
                case 7: {
                    if (n2 > 7) {
                        ++n4;
                        --n3;
                        n2 -= 8;
                    }
                    arg0.cfr_renamed_114 = n5;
                    arg1 = arg0.cfr_renamed_12038(arg1);
                    n5 = arg0.cfr_renamed_114;
                    n6 = n5 < arg0.cfr_renamed_119 ? arg0.cfr_renamed_119 - n5 - 1 : arg0.cfr_renamed_3 - n5;
                    sprzfn sprzfn13 = arg0;
                    if (sprzfn13.cfr_renamed_119 != sprzfn13.cfr_renamed_114) {
                        sprzfn sprzfn14 = arg0;
                        sprzfn14.cfr_renamed_4 = n;
                        sprzfn14.cfr_renamed_133 = n2;
                        spracn spracn12 = spracn2;
                        spracn12.cfr_renamed_0 = n4;
                        spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                        spracn12.cfr_renamed_91 = n3;
                        arg0.cfr_renamed_114 = n5;
                        return arg0.cfr_renamed_12038(arg1);
                    }
                    this.cfr_renamed_4 = 8;
                }
                case 8: {
                    arg1 = 1;
                    sprzfn sprzfn15 = arg0;
                    sprzfn15.cfr_renamed_4 = n;
                    sprzfn15.cfr_renamed_133 = n2;
                    spracn spracn13 = spracn2;
                    spracn13.cfr_renamed_0 = n4;
                    spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                    spracn13.cfr_renamed_91 = n3;
                    arg0.cfr_renamed_114 = n5;
                    return arg0.cfr_renamed_12038(1);
                }
                case 9: {
                    arg1 = -3;
                    sprzfn sprzfn16 = arg0;
                    sprzfn16.cfr_renamed_4 = n;
                    sprzfn16.cfr_renamed_133 = n2;
                    spracn spracn14 = spracn2;
                    spracn14.cfr_renamed_0 = n4;
                    spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
                    spracn14.cfr_renamed_91 = n3;
                    arg0.cfr_renamed_114 = n5;
                    return arg0.cfr_renamed_12038(-3);
                }
            }
            break;
        }
        arg1 = -2;
        sprzfn sprzfn17 = arg0;
        sprzfn17.cfr_renamed_4 = n;
        sprzfn17.cfr_renamed_133 = n2;
        spracn spracn15 = spracn2;
        spracn15.cfr_renamed_0 = n4;
        spracn2.cfr_renamed_152 += (long)(n3 - spracn2.cfr_renamed_91);
        spracn15.cfr_renamed_91 = n3;
        arg0.cfr_renamed_114 = n5;
        return arg0.cfr_renamed_12038(-2);
    }

    @sprtea
    public int cfr_renamed_12037(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, sprzfn arg6, spracn arg7) {
        int n;
        int n2;
        spracn spracn2 = arg7;
        int n3 = spracn2.cfr_renamed_91;
        int n4 = spracn2.cfr_renamed_0;
        sprzfn sprzfn2 = arg6;
        int n5 = sprzfn2.cfr_renamed_4;
        int n6 = sprzfn2.cfr_renamed_133;
        int n7 = sprzfn2.cfr_renamed_114;
        int n8 = n7 < arg6.cfr_renamed_119 ? arg6.cfr_renamed_119 - n7 - 1 : arg6.cfr_renamed_3 - n7;
        int n9 = cfr_renamed_93[arg0];
        int n10 = cfr_renamed_93[arg1];
        block0: do {
            int n11;
            block21: {
                int n12 = n6;
                while (n12 < 20) {
                    --n4;
                    int n13 = arg7.cfr_renamed_86[n3] & 0xFF;
                    ++n3;
                    int n14 = n6;
                    n5 |= (n13 & 0xFF) << n14;
                    n12 = n6 += 8;
                }
                int[] nArray = arg2;
                int n15 = arg3;
                int n16 = n5 & n9;
                int n17 = (n15 + n16) * 3;
                n11 = nArray[n17];
                if (n11 == 0) {
                    n5 >>= nArray[n17 + 1];
                    n6 -= nArray[n17 + 1];
                    arg6.cfr_renamed_96[n7++] = (byte)nArray[n17 + 2];
                    n2 = --n8;
                    continue;
                }
                do {
                    n5 >>= nArray[n17 + 1];
                    n6 -= nArray[n17 + 1];
                    if ((n11 & 0x10) != 0) {
                        n = nArray[n17 + 2] + (n5 & cfr_renamed_93[n11 &= 0xF]);
                        n5 >>= n11;
                        int n18 = n6 = n6 - n11;
                        while (n18 < 15) {
                            --n4;
                            int n19 = arg7.cfr_renamed_86[n3] & 0xFF;
                            ++n3;
                            int n20 = n6;
                            n5 |= (n19 & 0xFF) << n20;
                            n18 = n6 += 8;
                        }
                        n16 = n5 & n10;
                        nArray = arg4;
                        n15 = arg5;
                        n17 = (n15 + n16) * 3;
                        n11 = nArray[n17];
                        int n21 = n5;
                        while (true) {
                            n5 = n21 >> nArray[n17 + 1];
                            n6 -= nArray[n17 + 1];
                            if ((n11 & 0x10) != 0) {
                                int n22;
                                int n23;
                                n11 &= 0xF;
                                int n24 = n6;
                                while (n24 < n11) {
                                    --n4;
                                    int n25 = arg7.cfr_renamed_86[n3] & 0xFF;
                                    ++n3;
                                    int n26 = n6;
                                    n5 |= (n25 & 0xFF) << n26;
                                    n24 = n6 += 8;
                                }
                                int n27 = nArray[n17 + 2] + (n5 & cfr_renamed_93[n11]);
                                n5 >>= n11;
                                n6 -= n11;
                                n8 -= n;
                                if (n7 >= n27) {
                                    n23 = n7 - n27;
                                    if (n7 - n23 > 0 && 2 > n7 - n23) {
                                        sprzfn sprzfn3 = arg6;
                                        byte by = sprzfn3.cfr_renamed_96[n23];
                                        arg6.cfr_renamed_96[++n7] = by;
                                        int n28 = n7++;
                                        byte by2 = arg6.cfr_renamed_96[++n23];
                                        ++n23;
                                        n -= 2;
                                        sprzfn3.cfr_renamed_96[n28] = by2;
                                        n22 = n7;
                                    } else {
                                        int n29 = n7;
                                        n -= 2;
                                        System.arraycopy(arg6.cfr_renamed_96, n23, arg6.cfr_renamed_96, n29, 2);
                                        n23 += 2;
                                        n22 = n7 += 2;
                                    }
                                } else {
                                    n23 = n7 - n27;
                                    while ((n23 += arg6.cfr_renamed_3) < 0) {
                                    }
                                    n11 = arg6.cfr_renamed_3 - n23;
                                    if (n > n11) {
                                        n -= n11;
                                        if (n7 - n23 > 0 && n11 > n7 - n23) {
                                            do {
                                                int n30 = n7++;
                                                byte by = arg6.cfr_renamed_96[n23];
                                                ++n23;
                                                arg6.cfr_renamed_96[n30] = by;
                                            } while (--n11 != 0);
                                        } else {
                                            System.arraycopy(arg6.cfr_renamed_96, n23, arg6.cfr_renamed_96, n7, n11);
                                            n7 += n11;
                                            n23 += n11;
                                            n11 = 0;
                                        }
                                        n23 = 0;
                                    }
                                    n22 = n7;
                                }
                                if (n22 - n23 > 0 && n > n7 - n23) {
                                    do {
                                        int n31 = n7++;
                                        byte by = arg6.cfr_renamed_96[n23];
                                        ++n23;
                                        arg6.cfr_renamed_96[n31] = by;
                                    } while (--n != 0);
                                    n2 = n8;
                                    continue block0;
                                }
                                System.arraycopy(arg6.cfr_renamed_96, n23, arg6.cfr_renamed_96, n7, n);
                                n7 += n;
                                n23 += n;
                                n = 0;
                                n2 = n8;
                                continue block0;
                            }
                            if ((n11 & 0x40) != 0) break;
                            n16 += nArray[n17 + 2];
                            n17 = (n15 + (n16 += n5 & cfr_renamed_93[n11])) * 3;
                            n11 = nArray[n17];
                            n21 = n5;
                        }
                        arg7.cfr_renamed_3 = "invalid distance code";
                        n = arg7.cfr_renamed_0 - n4;
                        n = n6 >> 3 < n ? n6 >> 3 : n;
                        n4 += n;
                        n3 -= n;
                        sprzfn sprzfn4 = arg6;
                        sprzfn4.cfr_renamed_4 = n5;
                        sprzfn4.cfr_renamed_133 = n6 -= n << 3;
                        spracn spracn3 = arg7;
                        spracn3.cfr_renamed_0 = n4;
                        arg7.cfr_renamed_152 += (long)(n3 - arg7.cfr_renamed_91);
                        spracn3.cfr_renamed_91 = n3;
                        arg6.cfr_renamed_114 = n7;
                        return -3;
                    }
                    if ((n11 & 0x40) != 0) break block21;
                    n16 += nArray[n17 + 2];
                } while ((n11 = nArray[n17 = (n15 + (n16 += n5 & cfr_renamed_93[n11])) * 3]) != 0);
                n5 >>= nArray[n17 + 1];
                n6 -= nArray[n17 + 1];
                arg6.cfr_renamed_96[n7++] = (byte)nArray[n17 + 2];
                n2 = --n8;
                continue;
            }
            if ((n11 & 0x20) != 0) {
                n = arg7.cfr_renamed_0 - n4;
                n = n6 >> 3 < n ? n6 >> 3 : n;
                n4 += n;
                n3 -= n;
                sprzfn sprzfn5 = arg6;
                sprzfn5.cfr_renamed_4 = n5;
                sprzfn5.cfr_renamed_133 = n6 -= n << 3;
                spracn spracn4 = arg7;
                spracn4.cfr_renamed_0 = n4;
                arg7.cfr_renamed_152 += (long)(n3 - arg7.cfr_renamed_91);
                spracn4.cfr_renamed_91 = n3;
                arg6.cfr_renamed_114 = n7;
                return 1;
            }
            arg7.cfr_renamed_3 = "invalid literal/length code";
            n = arg7.cfr_renamed_0 - n4;
            n = n6 >> 3 < n ? n6 >> 3 : n;
            n4 += n;
            n3 -= n;
            sprzfn sprzfn6 = arg6;
            sprzfn6.cfr_renamed_4 = n5;
            sprzfn6.cfr_renamed_133 = n6 -= n << 3;
            spracn spracn5 = arg7;
            spracn5.cfr_renamed_0 = n4;
            arg7.cfr_renamed_152 += (long)(n3 - arg7.cfr_renamed_91);
            spracn5.cfr_renamed_91 = n3;
            arg6.cfr_renamed_114 = n7;
            return -3;
        } while (n2 >= 258 && n4 >= 10);
        n = arg7.cfr_renamed_0 - n4;
        n = n6 >> 3 < n ? n6 >> 3 : n;
        n4 += n;
        n3 -= n;
        sprzfn sprzfn7 = arg6;
        sprzfn7.cfr_renamed_4 = n5;
        sprzfn7.cfr_renamed_133 = n6 -= n << 3;
        spracn spracn6 = arg7;
        spracn6.cfr_renamed_0 = n4;
        arg7.cfr_renamed_152 += (long)(n3 - arg7.cfr_renamed_91);
        spracn6.cfr_renamed_91 = n3;
        arg6.cfr_renamed_114 = n7;
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
        cfr_renamed_93 = nArray;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12039(int n, int n2, int[] nArray, int n3, int[] nArray2, int n4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjgn sprjgn2 = this;
        sprjgn sprjgn3 = this;
        sprjgn sprjgn4 = this;
        sprjgn sprjgn5 = this;
        sprjgn5.cfr_renamed_4 = 0;
        sprjgn5.cfr_renamed_2 = (byte)arg0;
        sprjgn4.cfr_renamed_88 = (byte)arg1;
        sprjgn4.cfr_renamed_107 = arg2;
        sprjgn3.cfr_renamed_3 = arg3;
        sprjgn3.cfr_renamed_119 = arg4;
        sprjgn2.cfr_renamed_272 = arg5;
        sprjgn2.cfr_renamed_114 = null;
    }
}

