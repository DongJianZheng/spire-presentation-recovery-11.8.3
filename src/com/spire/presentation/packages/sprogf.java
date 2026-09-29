/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;

public class sprogf {
    private int cfr_renamed_145;
    private sprgf cfr_renamed_114;
    private int cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private int cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private spraze cfr_renamed_132;
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private long cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private long cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1408() {
        if (8 % this.cfr_renamed_0 == 0) {
            sprogf sprogf2;
            if (this.cfr_renamed_93 == 0) {
                sprogf sprogf3 = this;
                this.cfr_renamed_105 = this.cfr_renamed_132.cfr_renamed_1370(sprogf3.cfr_renamed_3);
                if (sprogf3.cfr_renamed_86 < this.cfr_renamed_152) {
                    sprogf sprogf4 = this;
                    sprogf2 = sprogf4;
                    sprogf sprogf5 = this;
                    sprogf4.cfr_renamed_93 = sprogf4.cfr_renamed_119[sprogf5.cfr_renamed_86] & this.cfr_renamed_102;
                    sprogf sprogf6 = this;
                    sprogf5.cfr_renamed_119[sprogf6.cfr_renamed_86] = (byte)(sprogf6.cfr_renamed_119[this.cfr_renamed_86] >>> this.cfr_renamed_0);
                } else {
                    sprogf sprogf7 = this;
                    sprogf2 = sprogf7;
                    sprogf sprogf8 = this;
                    sprogf7.cfr_renamed_93 = sprogf7.cfr_renamed_137 & sprogf8.cfr_renamed_102;
                    sprogf8.cfr_renamed_137 >>>= this.cfr_renamed_0;
                }
            } else {
                if (this.cfr_renamed_93 > 0) {
                    sprogf sprogf9 = this;
                    sprogf9.cfr_renamed_114.cfr_renamed_1197(sprogf9.cfr_renamed_105, 0, this.cfr_renamed_105.length);
                    sprogf sprogf10 = this;
                    sprogf10.cfr_renamed_105 = new byte[sprogf10.cfr_renamed_114.cfr_renamed_1218()];
                    sprogf10.cfr_renamed_114.cfr_renamed_1219(this.cfr_renamed_105, 0);
                    --this.cfr_renamed_93;
                }
                sprogf2 = this;
            }
            if (sprogf2.cfr_renamed_93 == 0) {
                sprogf sprogf11 = this;
                sprogf sprogf12 = this;
                sprogf sprogf13 = this;
                System.arraycopy(sprogf11.cfr_renamed_105, 0, sprogf12.cfr_renamed_1, sprogf13.cfr_renamed_145 * sprogf13.cfr_renamed_152, this.cfr_renamed_152);
                ++sprogf12.cfr_renamed_145;
                if (sprogf11.cfr_renamed_145 % (8 / this.cfr_renamed_0) == 0) {
                    ++this.cfr_renamed_86;
                    return;
                }
            }
        } else if (this.cfr_renamed_0 < 8) {
            sprogf sprogf14;
            if (this.cfr_renamed_93 == 0) {
                if (this.cfr_renamed_145 % 8 == 0) {
                    sprogf sprogf15 = this;
                    if (sprogf15.cfr_renamed_86 < sprogf15.cfr_renamed_152) {
                        this.cfr_renamed_2 = 0L;
                        sprogf sprogf16 = this;
                        if (this.cfr_renamed_145 < sprogf16.cfr_renamed_152 / sprogf16.cfr_renamed_0 << 3) {
                            int n;
                            int n2 = n = 0;
                            while (n2 < this.cfr_renamed_0) {
                                sprogf sprogf17 = this;
                                sprogf sprogf18 = this;
                                sprogf17.cfr_renamed_2 ^= (long)((sprogf18.cfr_renamed_119[sprogf18.cfr_renamed_86] & 0xFF) << (n << 3));
                                ++sprogf17.cfr_renamed_86;
                                n2 = ++n;
                            }
                        } else {
                            int n;
                            int n3 = n = 0;
                            while (true) {
                                sprogf sprogf19 = this;
                                if (n3 >= sprogf19.cfr_renamed_152 % sprogf19.cfr_renamed_0) break;
                                sprogf sprogf20 = this;
                                sprogf sprogf21 = this;
                                sprogf20.cfr_renamed_2 ^= (long)((sprogf21.cfr_renamed_119[sprogf21.cfr_renamed_86] & 0xFF) << (n << 3));
                                ++sprogf20.cfr_renamed_86;
                                n3 = ++n;
                            }
                        }
                    }
                }
                sprogf sprogf22 = this;
                if (sprogf22.cfr_renamed_145 == sprogf22.cfr_renamed_107) {
                    this.cfr_renamed_2 = this.cfr_renamed_137;
                }
                sprogf sprogf23 = this;
                sprogf14 = sprogf23;
                this.cfr_renamed_93 = (int)(sprogf23.cfr_renamed_2 & (long)this.cfr_renamed_102);
                sprogf23.cfr_renamed_105 = sprogf23.cfr_renamed_132.cfr_renamed_1370(this.cfr_renamed_3);
            } else {
                if (this.cfr_renamed_93 > 0) {
                    sprogf sprogf24 = this;
                    sprogf24.cfr_renamed_114.cfr_renamed_1197(sprogf24.cfr_renamed_105, 0, this.cfr_renamed_105.length);
                    sprogf sprogf25 = this;
                    sprogf25.cfr_renamed_105 = new byte[sprogf25.cfr_renamed_114.cfr_renamed_1218()];
                    sprogf25.cfr_renamed_114.cfr_renamed_1219(this.cfr_renamed_105, 0);
                    --this.cfr_renamed_93;
                }
                sprogf14 = this;
            }
            if (sprogf14.cfr_renamed_93 == 0) {
                sprogf sprogf26 = this;
                sprogf sprogf27 = this;
                sprogf sprogf28 = this;
                System.arraycopy(sprogf26.cfr_renamed_105, 0, sprogf27.cfr_renamed_1, sprogf28.cfr_renamed_145 * sprogf28.cfr_renamed_152, this.cfr_renamed_152);
                sprogf27.cfr_renamed_2 >>>= this.cfr_renamed_0;
                ++sprogf26.cfr_renamed_145;
                return;
            }
        } else if (this.cfr_renamed_0 < 57) {
            sprogf sprogf29;
            if (this.cfr_renamed_4 == 0L) {
                sprogf sprogf30;
                this.cfr_renamed_2 = 0L;
                this.cfr_renamed_86 = 0;
                int n = this.cfr_renamed_96 % 8;
                int n4 = this.cfr_renamed_96 >>> 3;
                if (n4 < this.cfr_renamed_152) {
                    int n5;
                    int n6;
                    int n7;
                    sprogf sprogf31 = this;
                    if (sprogf31.cfr_renamed_96 <= (sprogf31.cfr_renamed_152 << 3) - this.cfr_renamed_0) {
                        sprogf sprogf32 = this;
                        this.cfr_renamed_96 += sprogf32.cfr_renamed_0;
                        n7 = sprogf32.cfr_renamed_96 + 7 >>> 3;
                        n6 = n4;
                    } else {
                        sprogf sprogf33 = this;
                        n7 = sprogf33.cfr_renamed_152;
                        sprogf33.cfr_renamed_96 += this.cfr_renamed_0;
                        n6 = n4;
                    }
                    int n8 = n5 = n6;
                    while (n8 < n7) {
                        sprogf sprogf34 = this;
                        sprogf34.cfr_renamed_2 ^= (long)((this.cfr_renamed_119[n5] & 0xFF) << (this.cfr_renamed_86 << 3));
                        ++sprogf34.cfr_renamed_86;
                        n8 = ++n5;
                    }
                    sprogf sprogf35 = this;
                    sprogf30 = sprogf35;
                    sprogf35.cfr_renamed_2 >>>= n;
                    this.cfr_renamed_4 = sprogf35.cfr_renamed_2 & (long)this.cfr_renamed_102;
                } else {
                    sprogf sprogf36 = this;
                    sprogf30 = sprogf36;
                    sprogf sprogf37 = this;
                    sprogf36.cfr_renamed_4 = sprogf36.cfr_renamed_137 & sprogf37.cfr_renamed_102;
                    sprogf37.cfr_renamed_137 >>>= this.cfr_renamed_0;
                }
                sprogf sprogf38 = this;
                sprogf30.cfr_renamed_105 = sprogf38.cfr_renamed_132.cfr_renamed_1370(sprogf38.cfr_renamed_3);
                sprogf29 = this;
            } else {
                if (this.cfr_renamed_4 > 0L) {
                    sprogf sprogf39 = this;
                    sprogf39.cfr_renamed_114.cfr_renamed_1197(sprogf39.cfr_renamed_105, 0, this.cfr_renamed_105.length);
                    sprogf sprogf40 = this;
                    sprogf40.cfr_renamed_105 = new byte[sprogf40.cfr_renamed_114.cfr_renamed_1218()];
                    sprogf40.cfr_renamed_114.cfr_renamed_1219(this.cfr_renamed_105, 0);
                    --this.cfr_renamed_4;
                }
                sprogf29 = this;
            }
            if (sprogf29.cfr_renamed_4 == 0L) {
                sprogf sprogf41 = this;
                sprogf sprogf42 = this;
                System.arraycopy(this.cfr_renamed_105, 0, sprogf41.cfr_renamed_1, sprogf42.cfr_renamed_145 * sprogf42.cfr_renamed_152, this.cfr_renamed_152);
                ++sprogf41.cfr_renamed_145;
            }
        }
    }

    public int cfr_renamed_1366(int arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 2;
        while (n3 < arg0) {
            ++n2;
            n3 = n <<= 1;
        }
        return n2;
    }

    public byte[] cfr_renamed_1406() {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[16];
        byArray[0] = (byte)(this.cfr_renamed_4 & 0xFFL);
        byArray[1] = (byte)(this.cfr_renamed_4 >> 8 & 0xFFL);
        byArray[2] = (byte)(this.cfr_renamed_4 >> 16 & 0xFFL);
        byArray[3] = (byte)(this.cfr_renamed_4 >> 24 & 0xFFL);
        byArray[4] = (byte)(this.cfr_renamed_4 >> 32 & 0xFFL);
        byArray[5] = (byte)(this.cfr_renamed_4 >> 40 & 0xFFL);
        byArray[6] = (byte)(this.cfr_renamed_4 >> 48 & 0xFFL);
        byArray[7] = (byte)(this.cfr_renamed_4 >> 56 & 0xFFL);
        byArray[8] = (byte)(this.cfr_renamed_2 & 0xFFL);
        byArray[9] = (byte)(this.cfr_renamed_2 >> 8 & 0xFFL);
        byArray[10] = (byte)(this.cfr_renamed_2 >> 16 & 0xFFL);
        byArray[11] = (byte)(this.cfr_renamed_2 >> 24 & 0xFFL);
        byArray[12] = (byte)(this.cfr_renamed_2 >> 32 & 0xFFL);
        byArray[13] = (byte)(this.cfr_renamed_2 >> 40 & 0xFFL);
        byArray2[14] = (byte)(this.cfr_renamed_2 >> 48 & 0xFFL);
        byArray[15] = (byte)(this.cfr_renamed_2 >> 56 & 0xFFL);
        return byArray2;
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, "").append(this.cfr_renamed_2).append("  ").toString();
        int[] nArray = new int[9];
        nArray = this.cfr_renamed_1381();
        byte[][] byArray = new byte[5][this.cfr_renamed_152];
        byArray = this.cfr_renamed_1382();
        int n2 = n = 0;
        while (n2 < 9) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(nArray[n]);
            string = stringBuilder.append(" ").toString();
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < 5) {
            String string2 = new String(sprfqe.cfr_renamed_485(byArray[n]));
            string = new StringBuilder().insert(0, string).append(string2).append(" ").toString();
            n3 = ++n;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprogf(sprgf sprgf2, byte[][] byArray, int[] nArray) {
        void arg0;
        void arg2;
        void arg1;
        sprogf sprogf2 = this;
        void v1 = arg1;
        sprogf sprogf3 = this;
        void v3 = arg1;
        sprogf sprogf4 = this;
        sprogf sprogf5 = this;
        void v6 = arg2;
        sprogf sprogf6 = this;
        void v8 = arg2;
        sprogf sprogf7 = this;
        void v10 = arg2;
        this.cfr_renamed_114 = arg0;
        sprogf sprogf8 = this;
        this.cfr_renamed_132 = new spraze(this.cfr_renamed_114);
        this.cfr_renamed_145 = v10[0];
        sprogf7.cfr_renamed_93 = v10[1];
        sprogf7.cfr_renamed_86 = arg2[2];
        this.cfr_renamed_96 = v8[3];
        sprogf6.cfr_renamed_79 = v8[4];
        sprogf6.cfr_renamed_112 = arg2[5];
        this.cfr_renamed_91 = v6[6];
        sprogf5.cfr_renamed_0 = v6[7];
        sprogf5.cfr_renamed_137 = arg2[8];
        sprogf4.cfr_renamed_152 = sprogf4.cfr_renamed_114.cfr_renamed_1218();
        sprogf4.cfr_renamed_102 = (1 << this.cfr_renamed_0) - 1;
        this.cfr_renamed_107 = (int)Math.ceil((double)(sprogf4.cfr_renamed_152 << 3) / (double)this.cfr_renamed_0);
        this.cfr_renamed_105 = v3[0];
        sprogf3.cfr_renamed_3 = v3[1];
        sprogf3.cfr_renamed_119 = arg1[2];
        this.cfr_renamed_1 = v1[3];
        sprogf2.cfr_renamed_4 = (long)(v1[4][0] & 0xFF) | (long)(arg1[4][1] & 0xFF) << 8 | (long)(arg1[4][2] & 0xFF) << 16 | (long)(arg1[4][3] & 0xFF) << 24 | (long)(arg1[4][4] & 0xFF) << 32 | (long)(arg1[4][5] & 0xFF) << 40 | (long)(arg1[4][6] & 0xFF) << 48 | (long)(arg1[4][7] & 0xFF) << 56;
        sprogf2.cfr_renamed_2 = (long)(byArray[4][8] & 0xFF) | (long)(arg1[4][9] & 0xFF) << 8 | (long)(arg1[4][10] & 0xFF) << 16 | (long)(arg1[4][11] & 0xFF) << 24 | (long)(arg1[4][12] & 0xFF) << 32 | (long)(arg1[4][13] & 0xFF) << 40 | (long)(arg1[4][14] & 0xFF) << 48 | (long)(arg1[4][15] & 0xFF) << 56;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void cfr_renamed_1410(byte[] arg0, byte[] arg1) {
        sprogf sprogf2 = this;
        sprogf2.cfr_renamed_119 = new byte[sprogf2.cfr_renamed_152];
        sprogf2.cfr_renamed_114.cfr_renamed_1197(arg1, 0, arg1.length);
        sprogf sprogf3 = this;
        sprogf3.cfr_renamed_119 = new byte[sprogf3.cfr_renamed_114.cfr_renamed_1218()];
        sprogf3.cfr_renamed_114.cfr_renamed_1219(this.cfr_renamed_119, 0);
        sprogf sprogf4 = this;
        byte[] byArray = new byte[sprogf4.cfr_renamed_152];
        System.arraycopy(sprogf4.cfr_renamed_119, 0, byArray, 0, this.cfr_renamed_152);
        int n = 0;
        int n2 = 0;
        int n3 = sprogf4.cfr_renamed_1366((sprogf4.cfr_renamed_107 << this.cfr_renamed_0) + 1);
        if (8 % this.cfr_renamed_0 == 0) {
            int n4;
            int n5 = 8 / this.cfr_renamed_0;
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_152) {
                int n7;
                int n8 = n7 = 0;
                while (n8 < n5) {
                    n2 += byArray[n4] & this.cfr_renamed_102;
                    byArray[n4] = (byte)(byArray[n4] >>> this.cfr_renamed_0);
                    n8 = ++n7;
                }
                n6 = ++n4;
            }
            sprogf sprogf5 = this;
            this.cfr_renamed_137 = (sprogf5.cfr_renamed_107 << this.cfr_renamed_0) - n2;
            n = sprogf5.cfr_renamed_137;
            int n9 = n4 = 0;
            while (n9 < n3) {
                n2 += n & this.cfr_renamed_102;
                n >>>= this.cfr_renamed_0;
                n9 = n4 + this.cfr_renamed_0;
            }
        } else if (this.cfr_renamed_0 < 8) {
            long l;
            int n10;
            int n11 = 0;
            sprogf sprogf6 = this;
            int n12 = sprogf6.cfr_renamed_152 / sprogf6.cfr_renamed_0;
            int n13 = n10 = 0;
            while (n13 < n12) {
                int n14;
                l = 0L;
                int n15 = n14 = 0;
                while (n15 < this.cfr_renamed_0) {
                    int n16 = (byArray[n11] & 0xFF) << (n14 << 3);
                    ++n11;
                    l ^= (long)n16;
                    n15 = ++n14;
                }
                int n17 = n14 = 0;
                while (n17 < 8) {
                    n2 += (int)(l & (long)this.cfr_renamed_102);
                    l >>>= this.cfr_renamed_0;
                    n17 = ++n14;
                }
                n13 = ++n10;
            }
            sprogf sprogf7 = this;
            n12 = sprogf7.cfr_renamed_152 % sprogf7.cfr_renamed_0;
            l = 0L;
            int n18 = n10 = 0;
            while (n18 < n12) {
                int n19 = (byArray[n11] & 0xFF) << (n10 << 3);
                ++n11;
                l ^= (long)n19;
                n18 = ++n10;
            }
            n12 <<= 3;
            int n20 = n10 = 0;
            while (n20 < n12) {
                n2 += (int)(l & (long)this.cfr_renamed_102);
                l >>>= this.cfr_renamed_0;
                n20 = n10 + this.cfr_renamed_0;
            }
            sprogf sprogf8 = this;
            this.cfr_renamed_137 = (sprogf8.cfr_renamed_107 << this.cfr_renamed_0) - n2;
            n = sprogf8.cfr_renamed_137;
            int n21 = n10 = 0;
            while (n21 < n3) {
                n2 += n & this.cfr_renamed_102;
                n >>>= this.cfr_renamed_0;
                n21 = n10 + this.cfr_renamed_0;
            }
        } else if (this.cfr_renamed_0 < 57) {
            int n22;
            int n23;
            long l;
            int n24;
            int n25;
            int n26;
            int n27 = n26 = 0;
            while (n27 <= (this.cfr_renamed_152 << 3) - this.cfr_renamed_0) {
                n25 = n26 >>> 3;
                n24 = n26 % 8;
                int n28 = (n26 += this.cfr_renamed_0) + 7 >>> 3;
                l = 0L;
                n23 = 0;
                int n29 = n25;
                while (n29 < n28) {
                    int n30 = (byArray[n22] & 0xFF) << (n23 << 3);
                    ++n23;
                    l ^= (long)n30;
                    n29 = ++n22;
                }
                n2 = (int)((long)n2 + ((l >>>= n24) & (long)this.cfr_renamed_102));
                n27 = n26;
            }
            n25 = n26 >>> 3;
            if (n25 < this.cfr_renamed_152) {
                n24 = n26 % 8;
                l = 0L;
                n23 = 0;
                int n31 = n22 = n25;
                while (n31 < this.cfr_renamed_152) {
                    int n32 = (byArray[n22] & 0xFF) << (n23 << 3);
                    ++n23;
                    l ^= (long)n32;
                    n31 = ++n22;
                }
                n2 = (int)((long)n2 + ((l >>>= n24) & (long)this.cfr_renamed_102));
            }
            sprogf sprogf9 = this;
            this.cfr_renamed_137 = (sprogf9.cfr_renamed_107 << this.cfr_renamed_0) - n2;
            n = sprogf9.cfr_renamed_137;
            int n33 = n22 = 0;
            while (n33 < n3) {
                n2 += n & this.cfr_renamed_102;
                n >>>= this.cfr_renamed_0;
                n33 = n22 + this.cfr_renamed_0;
            }
        }
        sprogf sprogf10 = this;
        sprogf sprogf11 = this;
        sprogf11.cfr_renamed_112 = sprogf11.cfr_renamed_107 + (int)Math.ceil((double)n3 / (double)this.cfr_renamed_0);
        sprogf11.cfr_renamed_79 = (int)Math.ceil((double)(sprogf11.cfr_renamed_112 + n2) / (double)(1 << this.cfr_renamed_91));
        this.cfr_renamed_1 = new byte[this.cfr_renamed_112 * this.cfr_renamed_152];
        this.cfr_renamed_145 = 0;
        sprogf10.cfr_renamed_93 = 0;
        sprogf10.cfr_renamed_86 = 0;
        this.cfr_renamed_4 = 0L;
        this.cfr_renamed_96 = 0;
        this.cfr_renamed_105 = new byte[this.cfr_renamed_152];
        this.cfr_renamed_3 = new byte[this.cfr_renamed_152];
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, this.cfr_renamed_152);
    }

    public byte[][] cfr_renamed_1382() {
        byte[][] byArray;
        byte[][] byArray2 = byArray = new byte[5][this.cfr_renamed_152];
        byArray[0] = this.cfr_renamed_105;
        byArray[1] = this.cfr_renamed_3;
        byArray[2] = this.cfr_renamed_119;
        byArray2[3] = this.cfr_renamed_1;
        byArray[4] = this.cfr_renamed_1406();
        return byArray2;
    }

    public sprogf(sprgf arg0, int arg1, int arg2) {
        sprogf sprogf2 = this;
        this.cfr_renamed_114 = arg0;
        sprogf sprogf3 = this;
        this.cfr_renamed_132 = new spraze(this.cfr_renamed_114);
        this.cfr_renamed_152 = this.cfr_renamed_114.cfr_renamed_1218();
        this.cfr_renamed_0 = arg1;
        this.cfr_renamed_91 = arg2;
        sprogf2.cfr_renamed_102 = (1 << arg1) - 1;
        sprogf2.cfr_renamed_107 = (int)Math.ceil((double)(this.cfr_renamed_152 << 3) / (double)arg1);
    }

    public byte[] cfr_renamed_1409() {
        return this.cfr_renamed_1;
    }

    public int[] cfr_renamed_1381() {
        int[] nArray;
        int[] nArray2 = nArray = new int[9];
        nArray[0] = this.cfr_renamed_145;
        nArray[1] = this.cfr_renamed_93;
        nArray[2] = this.cfr_renamed_86;
        nArray[3] = this.cfr_renamed_96;
        nArray[4] = this.cfr_renamed_79;
        nArray[5] = this.cfr_renamed_112;
        nArray[6] = this.cfr_renamed_91;
        nArray2[7] = this.cfr_renamed_0;
        nArray[8] = this.cfr_renamed_137;
        return nArray2;
    }

    public boolean cfr_renamed_1407() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_79) {
            sprogf sprogf2 = this;
            if (sprogf2.cfr_renamed_145 < sprogf2.cfr_renamed_112) {
                this.cfr_renamed_1408();
            }
            sprogf sprogf3 = this;
            if (sprogf3.cfr_renamed_145 == sprogf3.cfr_renamed_112) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }
}

