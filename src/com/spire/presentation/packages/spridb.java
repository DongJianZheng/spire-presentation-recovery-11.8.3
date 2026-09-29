/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.spruab;

public class spridb {
    private int cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private int cfr_renamed_96;
    private long cfr_renamed_105;
    private int cfr_renamed_137;
    private spruab cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private long cfr_renamed_1;
    private sprlc cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, "").append(this.cfr_renamed_1).append("  ").toString();
        int[] nArray = new int[9];
        nArray = this.cfr_renamed_1381();
        byte[][] byArray = new byte[5][this.cfr_renamed_137];
        byArray = this.cfr_renamed_1382();
        int n2 = n = 0;
        while (n2 < 9) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(nArray[n]);
            string = stringBuilder.append(" ").toString();
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < 5) {
            String string2 = new String(sprmma.cfr_renamed_485(byArray[n]));
            string = new StringBuilder().insert(0, string).append(string2).append(" ").toString();
            n3 = ++n;
        }
        return string;
    }

    public byte[][] cfr_renamed_1382() {
        byte[][] byArray;
        byte[][] byArray2 = byArray = new byte[5][this.cfr_renamed_137];
        byArray[0] = this.cfr_renamed_114;
        byArray[1] = this.cfr_renamed_107;
        byArray[2] = this.cfr_renamed_91;
        byArray2[3] = this.cfr_renamed_132;
        byArray[4] = this.cfr_renamed_1406();
        return byArray2;
    }

    public boolean cfr_renamed_1407() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_145) {
            spridb spridb2 = this;
            if (spridb2.cfr_renamed_102 < spridb2.cfr_renamed_119) {
                this.cfr_renamed_1408();
            }
            spridb spridb3 = this;
            if (spridb3.cfr_renamed_102 == spridb3.cfr_renamed_119) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public int[] cfr_renamed_1381() {
        int[] nArray;
        int[] nArray2 = nArray = new int[9];
        nArray[0] = this.cfr_renamed_102;
        nArray[1] = this.cfr_renamed_112;
        nArray[2] = this.cfr_renamed_93;
        nArray[3] = this.cfr_renamed_152;
        nArray[4] = this.cfr_renamed_145;
        nArray[5] = this.cfr_renamed_119;
        nArray[6] = this.cfr_renamed_0;
        nArray2[7] = this.cfr_renamed_4;
        nArray[8] = this.cfr_renamed_86;
        return nArray2;
    }

    private /* synthetic */ void cfr_renamed_1408() {
        if (8 % this.cfr_renamed_4 == 0) {
            spridb spridb2;
            if (this.cfr_renamed_112 == 0) {
                spridb spridb3 = this;
                this.cfr_renamed_114 = this.cfr_renamed_79.cfr_renamed_1370(spridb3.cfr_renamed_107);
                if (spridb3.cfr_renamed_93 < this.cfr_renamed_137) {
                    spridb spridb4 = this;
                    spridb2 = spridb4;
                    spridb spridb5 = this;
                    spridb4.cfr_renamed_112 = spridb4.cfr_renamed_91[spridb5.cfr_renamed_93] & this.cfr_renamed_3;
                    spridb spridb6 = this;
                    spridb5.cfr_renamed_91[spridb6.cfr_renamed_93] = (byte)(spridb6.cfr_renamed_91[this.cfr_renamed_93] >>> this.cfr_renamed_4);
                } else {
                    spridb spridb7 = this;
                    spridb2 = spridb7;
                    spridb spridb8 = this;
                    spridb7.cfr_renamed_112 = spridb7.cfr_renamed_86 & spridb8.cfr_renamed_3;
                    spridb8.cfr_renamed_86 >>>= this.cfr_renamed_4;
                }
            } else {
                if (this.cfr_renamed_112 > 0) {
                    spridb spridb9 = this;
                    spridb9.cfr_renamed_2.cfr_renamed_1197(spridb9.cfr_renamed_114, 0, this.cfr_renamed_114.length);
                    spridb spridb10 = this;
                    spridb10.cfr_renamed_114 = new byte[spridb10.cfr_renamed_2.cfr_renamed_1218()];
                    spridb10.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_114, 0);
                    --this.cfr_renamed_112;
                }
                spridb2 = this;
            }
            if (spridb2.cfr_renamed_112 == 0) {
                spridb spridb11 = this;
                spridb spridb12 = this;
                spridb spridb13 = this;
                System.arraycopy(spridb11.cfr_renamed_114, 0, spridb12.cfr_renamed_132, spridb13.cfr_renamed_102 * spridb13.cfr_renamed_137, this.cfr_renamed_137);
                ++spridb12.cfr_renamed_102;
                if (spridb11.cfr_renamed_102 % (8 / this.cfr_renamed_4) == 0) {
                    ++this.cfr_renamed_93;
                    return;
                }
            }
        } else if (this.cfr_renamed_4 < 8) {
            spridb spridb14;
            if (this.cfr_renamed_112 == 0) {
                if (this.cfr_renamed_102 % 8 == 0) {
                    spridb spridb15 = this;
                    if (spridb15.cfr_renamed_93 < spridb15.cfr_renamed_137) {
                        this.cfr_renamed_1 = 0L;
                        spridb spridb16 = this;
                        if (this.cfr_renamed_102 < spridb16.cfr_renamed_137 / spridb16.cfr_renamed_4 << 3) {
                            int n;
                            int n2 = n = 0;
                            while (n2 < this.cfr_renamed_4) {
                                spridb spridb17 = this;
                                spridb spridb18 = this;
                                spridb17.cfr_renamed_1 ^= (long)((spridb18.cfr_renamed_91[spridb18.cfr_renamed_93] & 0xFF) << (n << 3));
                                ++spridb17.cfr_renamed_93;
                                n2 = ++n;
                            }
                        } else {
                            int n;
                            int n3 = n = 0;
                            while (true) {
                                spridb spridb19 = this;
                                if (n3 >= spridb19.cfr_renamed_137 % spridb19.cfr_renamed_4) break;
                                spridb spridb20 = this;
                                spridb spridb21 = this;
                                spridb20.cfr_renamed_1 ^= (long)((spridb21.cfr_renamed_91[spridb21.cfr_renamed_93] & 0xFF) << (n << 3));
                                ++spridb20.cfr_renamed_93;
                                n3 = ++n;
                            }
                        }
                    }
                }
                spridb spridb22 = this;
                if (spridb22.cfr_renamed_102 == spridb22.cfr_renamed_96) {
                    this.cfr_renamed_1 = this.cfr_renamed_86;
                }
                spridb spridb23 = this;
                spridb14 = spridb23;
                this.cfr_renamed_112 = (int)(spridb23.cfr_renamed_1 & (long)this.cfr_renamed_3);
                spridb23.cfr_renamed_114 = spridb23.cfr_renamed_79.cfr_renamed_1370(this.cfr_renamed_107);
            } else {
                if (this.cfr_renamed_112 > 0) {
                    spridb spridb24 = this;
                    spridb24.cfr_renamed_2.cfr_renamed_1197(spridb24.cfr_renamed_114, 0, this.cfr_renamed_114.length);
                    spridb spridb25 = this;
                    spridb25.cfr_renamed_114 = new byte[spridb25.cfr_renamed_2.cfr_renamed_1218()];
                    spridb25.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_114, 0);
                    --this.cfr_renamed_112;
                }
                spridb14 = this;
            }
            if (spridb14.cfr_renamed_112 == 0) {
                spridb spridb26 = this;
                spridb spridb27 = this;
                spridb spridb28 = this;
                System.arraycopy(spridb26.cfr_renamed_114, 0, spridb27.cfr_renamed_132, spridb28.cfr_renamed_102 * spridb28.cfr_renamed_137, this.cfr_renamed_137);
                spridb27.cfr_renamed_1 >>>= this.cfr_renamed_4;
                ++spridb26.cfr_renamed_102;
                return;
            }
        } else if (this.cfr_renamed_4 < 57) {
            spridb spridb29;
            if (this.cfr_renamed_105 == 0L) {
                spridb spridb30;
                this.cfr_renamed_1 = 0L;
                this.cfr_renamed_93 = 0;
                int n = this.cfr_renamed_152 % 8;
                int n4 = this.cfr_renamed_152 >>> 3;
                if (n4 < this.cfr_renamed_137) {
                    int n5;
                    int n6;
                    int n7;
                    spridb spridb31 = this;
                    if (spridb31.cfr_renamed_152 <= (spridb31.cfr_renamed_137 << 3) - this.cfr_renamed_4) {
                        spridb spridb32 = this;
                        this.cfr_renamed_152 += spridb32.cfr_renamed_4;
                        n7 = spridb32.cfr_renamed_152 + 7 >>> 3;
                        n6 = n4;
                    } else {
                        spridb spridb33 = this;
                        n7 = spridb33.cfr_renamed_137;
                        spridb33.cfr_renamed_152 += this.cfr_renamed_4;
                        n6 = n4;
                    }
                    int n8 = n5 = n6;
                    while (n8 < n7) {
                        spridb spridb34 = this;
                        spridb34.cfr_renamed_1 ^= (long)((this.cfr_renamed_91[n5] & 0xFF) << (this.cfr_renamed_93 << 3));
                        ++spridb34.cfr_renamed_93;
                        n8 = ++n5;
                    }
                    spridb spridb35 = this;
                    spridb30 = spridb35;
                    spridb35.cfr_renamed_1 >>>= n;
                    this.cfr_renamed_105 = spridb35.cfr_renamed_1 & (long)this.cfr_renamed_3;
                } else {
                    spridb spridb36 = this;
                    spridb30 = spridb36;
                    spridb spridb37 = this;
                    spridb36.cfr_renamed_105 = spridb36.cfr_renamed_86 & spridb37.cfr_renamed_3;
                    spridb37.cfr_renamed_86 >>>= this.cfr_renamed_4;
                }
                spridb spridb38 = this;
                spridb30.cfr_renamed_114 = spridb38.cfr_renamed_79.cfr_renamed_1370(spridb38.cfr_renamed_107);
                spridb29 = this;
            } else {
                if (this.cfr_renamed_105 > 0L) {
                    spridb spridb39 = this;
                    spridb39.cfr_renamed_2.cfr_renamed_1197(spridb39.cfr_renamed_114, 0, this.cfr_renamed_114.length);
                    spridb spridb40 = this;
                    spridb40.cfr_renamed_114 = new byte[spridb40.cfr_renamed_2.cfr_renamed_1218()];
                    spridb40.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_114, 0);
                    --this.cfr_renamed_105;
                }
                spridb29 = this;
            }
            if (spridb29.cfr_renamed_105 == 0L) {
                spridb spridb41 = this;
                spridb spridb42 = this;
                System.arraycopy(this.cfr_renamed_114, 0, spridb41.cfr_renamed_132, spridb42.cfr_renamed_102 * spridb42.cfr_renamed_137, this.cfr_renamed_137);
                ++spridb41.cfr_renamed_102;
            }
        }
    }

    public byte[] cfr_renamed_1409() {
        return this.cfr_renamed_132;
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

    /*
     * WARNING - void declaration
     */
    public spridb(sprlc sprlc2, byte[][] byArray, int[] nArray) {
        void arg0;
        void arg2;
        void arg1;
        spridb spridb2 = this;
        void v1 = arg1;
        spridb spridb3 = this;
        void v3 = arg1;
        spridb spridb4 = this;
        spridb spridb5 = this;
        void v6 = arg2;
        spridb spridb6 = this;
        void v8 = arg2;
        spridb spridb7 = this;
        void v10 = arg2;
        this.cfr_renamed_2 = arg0;
        spridb spridb8 = this;
        this.cfr_renamed_79 = new spruab(this.cfr_renamed_2);
        this.cfr_renamed_102 = v10[0];
        spridb7.cfr_renamed_112 = v10[1];
        spridb7.cfr_renamed_93 = arg2[2];
        this.cfr_renamed_152 = v8[3];
        spridb6.cfr_renamed_145 = v8[4];
        spridb6.cfr_renamed_119 = arg2[5];
        this.cfr_renamed_0 = v6[6];
        spridb5.cfr_renamed_4 = v6[7];
        spridb5.cfr_renamed_86 = arg2[8];
        spridb4.cfr_renamed_137 = spridb4.cfr_renamed_2.cfr_renamed_1218();
        spridb4.cfr_renamed_3 = (1 << this.cfr_renamed_4) - 1;
        this.cfr_renamed_96 = (int)Math.ceil((double)(spridb4.cfr_renamed_137 << 3) / (double)this.cfr_renamed_4);
        this.cfr_renamed_114 = v3[0];
        spridb3.cfr_renamed_107 = v3[1];
        spridb3.cfr_renamed_91 = arg1[2];
        this.cfr_renamed_132 = v1[3];
        spridb2.cfr_renamed_105 = (long)(v1[4][0] & 0xFF) | (long)(arg1[4][1] & 0xFF) << 8 | (long)(arg1[4][2] & 0xFF) << 16 | (long)(arg1[4][3] & 0xFF) << 24 | (long)(arg1[4][4] & 0xFF) << 32 | (long)(arg1[4][5] & 0xFF) << 40 | (long)(arg1[4][6] & 0xFF) << 48 | (long)(arg1[4][7] & 0xFF) << 56;
        spridb2.cfr_renamed_1 = (long)(byArray[4][8] & 0xFF) | (long)(arg1[4][9] & 0xFF) << 8 | (long)(arg1[4][10] & 0xFF) << 16 | (long)(arg1[4][11] & 0xFF) << 24 | (long)(arg1[4][12] & 0xFF) << 32 | (long)(arg1[4][13] & 0xFF) << 40 | (long)(arg1[4][14] & 0xFF) << 48 | (long)(arg1[4][15] & 0xFF) << 56;
    }

    public void cfr_renamed_1410(byte[] arg0, byte[] arg1) {
        spridb spridb2 = this;
        spridb2.cfr_renamed_91 = new byte[spridb2.cfr_renamed_137];
        spridb2.cfr_renamed_2.cfr_renamed_1197(arg1, 0, arg1.length);
        spridb spridb3 = this;
        spridb3.cfr_renamed_91 = new byte[spridb3.cfr_renamed_2.cfr_renamed_1218()];
        spridb3.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_91, 0);
        spridb spridb4 = this;
        byte[] byArray = new byte[spridb4.cfr_renamed_137];
        System.arraycopy(spridb4.cfr_renamed_91, 0, byArray, 0, this.cfr_renamed_137);
        int n = 0;
        int n2 = 0;
        int n3 = spridb4.cfr_renamed_1366((spridb4.cfr_renamed_96 << this.cfr_renamed_4) + 1);
        if (8 % this.cfr_renamed_4 == 0) {
            int n4;
            int n5 = 8 / this.cfr_renamed_4;
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_137) {
                int n7;
                int n8 = n7 = 0;
                while (n8 < n5) {
                    n2 += byArray[n4] & this.cfr_renamed_3;
                    byArray[n4] = (byte)(byArray[n4] >>> this.cfr_renamed_4);
                    n8 = ++n7;
                }
                n6 = ++n4;
            }
            spridb spridb5 = this;
            this.cfr_renamed_86 = (spridb5.cfr_renamed_96 << this.cfr_renamed_4) - n2;
            n = spridb5.cfr_renamed_86;
            int n9 = n4 = 0;
            while (n9 < n3) {
                n2 += n & this.cfr_renamed_3;
                n >>>= this.cfr_renamed_4;
                n9 = n4 + this.cfr_renamed_4;
            }
        } else if (this.cfr_renamed_4 < 8) {
            long l;
            int n10;
            int n11 = 0;
            spridb spridb6 = this;
            int n12 = spridb6.cfr_renamed_137 / spridb6.cfr_renamed_4;
            int n13 = n10 = 0;
            while (n13 < n12) {
                int n14;
                l = 0L;
                int n15 = n14 = 0;
                while (n15 < this.cfr_renamed_4) {
                    int n16 = (byArray[n11] & 0xFF) << (n14 << 3);
                    ++n11;
                    l ^= (long)n16;
                    n15 = ++n14;
                }
                int n17 = n14 = 0;
                while (n17 < 8) {
                    n2 += (int)(l & (long)this.cfr_renamed_3);
                    l >>>= this.cfr_renamed_4;
                    n17 = ++n14;
                }
                n13 = ++n10;
            }
            spridb spridb7 = this;
            n12 = spridb7.cfr_renamed_137 % spridb7.cfr_renamed_4;
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
                n2 += (int)(l & (long)this.cfr_renamed_3);
                l >>>= this.cfr_renamed_4;
                n20 = n10 + this.cfr_renamed_4;
            }
            spridb spridb8 = this;
            this.cfr_renamed_86 = (spridb8.cfr_renamed_96 << this.cfr_renamed_4) - n2;
            n = spridb8.cfr_renamed_86;
            int n21 = n10 = 0;
            while (n21 < n3) {
                n2 += n & this.cfr_renamed_3;
                n >>>= this.cfr_renamed_4;
                n21 = n10 + this.cfr_renamed_4;
            }
        } else if (this.cfr_renamed_4 < 57) {
            int n22;
            int n23;
            long l;
            int n24;
            int n25;
            int n26;
            int n27 = n26 = 0;
            while (n27 <= (this.cfr_renamed_137 << 3) - this.cfr_renamed_4) {
                n25 = n26 >>> 3;
                n24 = n26 % 8;
                int n28 = (n26 += this.cfr_renamed_4) + 7 >>> 3;
                l = 0L;
                n23 = 0;
                int n29 = n25;
                while (n29 < n28) {
                    int n30 = (byArray[n22] & 0xFF) << (n23 << 3);
                    ++n23;
                    l ^= (long)n30;
                    n29 = ++n22;
                }
                n2 = (int)((long)n2 + ((l >>>= n24) & (long)this.cfr_renamed_3));
                n27 = n26;
            }
            n25 = n26 >>> 3;
            if (n25 < this.cfr_renamed_137) {
                n24 = n26 % 8;
                l = 0L;
                n23 = 0;
                int n31 = n22 = n25;
                while (n31 < this.cfr_renamed_137) {
                    int n32 = (byArray[n22] & 0xFF) << (n23 << 3);
                    ++n23;
                    l ^= (long)n32;
                    n31 = ++n22;
                }
                n2 = (int)((long)n2 + ((l >>>= n24) & (long)this.cfr_renamed_3));
            }
            spridb spridb9 = this;
            this.cfr_renamed_86 = (spridb9.cfr_renamed_96 << this.cfr_renamed_4) - n2;
            n = spridb9.cfr_renamed_86;
            int n33 = n22 = 0;
            while (n33 < n3) {
                n2 += n & this.cfr_renamed_3;
                n >>>= this.cfr_renamed_4;
                n33 = n22 + this.cfr_renamed_4;
            }
        }
        spridb spridb10 = this;
        spridb spridb11 = this;
        spridb11.cfr_renamed_119 = spridb11.cfr_renamed_96 + (int)Math.ceil((double)n3 / (double)this.cfr_renamed_4);
        spridb11.cfr_renamed_145 = (int)Math.ceil((double)(spridb11.cfr_renamed_119 + n2) / (double)(1 << this.cfr_renamed_0));
        this.cfr_renamed_132 = new byte[this.cfr_renamed_119 * this.cfr_renamed_137];
        this.cfr_renamed_102 = 0;
        spridb10.cfr_renamed_112 = 0;
        spridb10.cfr_renamed_93 = 0;
        this.cfr_renamed_105 = 0L;
        this.cfr_renamed_152 = 0;
        this.cfr_renamed_114 = new byte[this.cfr_renamed_137];
        this.cfr_renamed_107 = new byte[this.cfr_renamed_137];
        System.arraycopy(arg0, 0, this.cfr_renamed_107, 0, this.cfr_renamed_137);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 3 ^ (2 ^ 5);
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

    public byte[] cfr_renamed_1406() {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[16];
        byArray[0] = (byte)(this.cfr_renamed_105 & 0xFFL);
        byArray[1] = (byte)(this.cfr_renamed_105 >> 8 & 0xFFL);
        byArray[2] = (byte)(this.cfr_renamed_105 >> 16 & 0xFFL);
        byArray[3] = (byte)(this.cfr_renamed_105 >> 24 & 0xFFL);
        byArray[4] = (byte)(this.cfr_renamed_105 >> 32 & 0xFFL);
        byArray[5] = (byte)(this.cfr_renamed_105 >> 40 & 0xFFL);
        byArray[6] = (byte)(this.cfr_renamed_105 >> 48 & 0xFFL);
        byArray[7] = (byte)(this.cfr_renamed_105 >> 56 & 0xFFL);
        byArray[8] = (byte)(this.cfr_renamed_1 & 0xFFL);
        byArray[9] = (byte)(this.cfr_renamed_1 >> 8 & 0xFFL);
        byArray[10] = (byte)(this.cfr_renamed_1 >> 16 & 0xFFL);
        byArray[11] = (byte)(this.cfr_renamed_1 >> 24 & 0xFFL);
        byArray[12] = (byte)(this.cfr_renamed_1 >> 32 & 0xFFL);
        byArray[13] = (byte)(this.cfr_renamed_1 >> 40 & 0xFFL);
        byArray2[14] = (byte)(this.cfr_renamed_1 >> 48 & 0xFFL);
        byArray[15] = (byte)(this.cfr_renamed_1 >> 56 & 0xFFL);
        return byArray2;
    }

    public spridb(sprlc arg0, int arg1, int arg2) {
        spridb spridb2 = this;
        this.cfr_renamed_2 = arg0;
        spridb spridb3 = this;
        this.cfr_renamed_79 = new spruab(this.cfr_renamed_2);
        this.cfr_renamed_137 = this.cfr_renamed_2.cfr_renamed_1218();
        this.cfr_renamed_4 = arg1;
        this.cfr_renamed_0 = arg2;
        spridb2.cfr_renamed_3 = (1 << arg1) - 1;
        spridb2.cfr_renamed_96 = (int)Math.ceil((double)(this.cfr_renamed_137 << 3) / (double)arg1);
    }
}

