/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfg;
import com.spire.presentation.packages.sprhog;
import com.spire.presentation.packages.sprlog;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprohg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprphg;
import com.spire.presentation.packages.sprrmg;
import com.spire.presentation.packages.sprxgg;
import java.security.SecureRandom;

public class sprblg {
    private final int cfr_renamed_105;
    private sprphg cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private boolean cfr_renamed_93;
    private boolean cfr_renamed_86;
    private int cfr_renamed_152;
    private sprlog cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int[] cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private static /* synthetic */ void cfr_renamed_7157(int[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3 = arg2 - arg1;
        if (n3 < 2) {
            return;
        }
        int n4 = n2 = 1;
        while (n4 < n3 - n2) {
            int n5 = n2;
            n4 = n5 + n5;
        }
        int n6 = n = n2;
        while (n6 > 0) {
            int n7;
            int n8;
            int n9;
            int n10 = n9 = 0;
            while (n10 < n3 - n) {
                if ((n9 & n) == 0) {
                    int[] nArray = arg0;
                    int[] nArray2 = arg0;
                    n8 = nArray[arg1 + n9 + n] ^ arg0[arg1 + n9];
                    int n11 = n7 = arg0[arg1 + n9 + n] - arg0[arg1 + n9];
                    n7 = n11 ^ n8 & (n11 ^ arg0[arg1 + n9 + n]);
                    n7 >>= 31;
                    int n12 = arg1 + n9;
                    nArray2[n12] = nArray2[n12] ^ (n7 &= n8);
                    int n13 = arg1 + n9 + n;
                    nArray[n13] = nArray[n13] ^ n7;
                }
                n10 = ++n9;
            }
            n9 = 0;
            int n14 = n2;
            while (n14 > n) {
                int n15;
                int n16 = n9;
                while (n16 < n3 - n15) {
                    if ((n9 & n) == 0) {
                        n8 = arg0[arg1 + n9 + n];
                        int n17 = n15;
                        while (n17 > n) {
                            int n18;
                            int n19;
                            int[] nArray = arg0;
                            n7 = nArray[arg1 + n9 + n19] ^ n8;
                            int n20 = n18 = arg0[arg1 + n9 + n19] - n8;
                            n18 = n20 ^ n7 & (n20 ^ arg0[arg1 + n9 + n19]);
                            n18 >>= 31;
                            n8 ^= (n18 &= n7);
                            int n21 = arg1 + n9 + n19;
                            nArray[n21] = nArray[n21] ^ n18;
                            n17 = n19 >>> 1;
                        }
                        arg0[arg1 + n9 + n] = n8;
                    }
                    n16 = ++n9;
                }
                n14 = n15 >>> 1;
            }
            n6 = n >>> 1;
        }
    }

    private /* synthetic */ void cfr_renamed_7158(short[] arg0, short[] arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102) {
            int n3 = n;
            short s = this.cfr_renamed_7159(arg1, arg2[n]);
            arg0[n3] = s;
            n2 = ++n;
        }
    }

    public int cfr_renamed_7160(byte[] arg0) {
        byte by = (byte)((arg0[this.cfr_renamed_132 - 1] & 0xFF) >>> this.cfr_renamed_91 % 8);
        by = (byte)(by - 1);
        byte by2 = by = (byte)((by & 0xFF) >>> 7);
        return by2 - 1;
    }

    private /* synthetic */ void cfr_renamed_7161(short[] arg0, short[] arg1) {
        int n;
        short s = 0;
        int n2 = 0;
        sprblg sprblg2 = this;
        short[] sArray = new short[sprblg2.cfr_renamed_1 + 1];
        short[] sArray2 = new short[sprblg2.cfr_renamed_1 + 1];
        short[] sArray3 = new short[sprblg2.cfr_renamed_1 + 1];
        short s2 = 1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1 + 1) {
            int n4 = n++;
            sArray3[n4] = 0;
            sArray2[n4] = 0;
            n3 = n;
        }
        sArray2[0] = 1;
        sArray3[1] = 1;
        short s3 = s = 0;
        while (s3 < 2 * this.cfr_renamed_1) {
            short s4;
            int n5;
            n = 0;
            int n6 = n5 = 0;
            while (n6 <= sprblg.cfr_renamed_7162(s, this.cfr_renamed_1)) {
                short s5 = sArray2[n5];
                short s6 = arg1[s - n5];
                n ^= this.cfr_renamed_112.cfr_renamed_7140(s5, s6);
                n6 = ++n5;
            }
            short s7 = s4 = this.cfr_renamed_112.cfr_renamed_7142(n);
            s7 = (short)(s7 - 1);
            s7 = (short)(s7 >> 15);
            s7 = (short)(s7 & 1);
            s7 = (short)(s7 - 1);
            short s8 = s;
            s8 = (short)(s8 - 2 * n2);
            s8 = (short)(s8 >> 15);
            s8 = (short)(s8 & 1);
            s8 = (short)(s8 - 1);
            s8 = (short)(s8 & s7);
            int n7 = n5 = 0;
            while (n7 <= this.cfr_renamed_1) {
                int n8 = n5++;
                sArray[n8] = sArray2[n8];
                n7 = n5;
            }
            short s9 = this.cfr_renamed_112.cfr_renamed_7135(s2, s4);
            int n9 = n5 = 0;
            while (n9 <= this.cfr_renamed_1) {
                int n10 = n5;
                short s10 = (short)(sArray2[n10] ^ this.cfr_renamed_112.cfr_renamed_7147(s9, sArray3[n5]) & s7);
                sArray2[n10] = s10;
                n9 = ++n5;
            }
            n2 = (short)(n2 & ~s8 | s + 1 - n2 & s8);
            int n11 = n5 = this.cfr_renamed_1 - 1;
            while (n11 >= 0) {
                sArray3[--n5 + 1] = (short)(sArray3[n5] & ~s8 | sArray[n5] & s8);
                n11 = n5;
            }
            sArray3[0] = 0;
            s2 = (short)(s2 & ~s8 | s4 & s8);
            s3 = (short)(s + 1);
        }
        int n12 = n = 0;
        while (n12 <= this.cfr_renamed_1) {
            int n13 = n++;
            arg0[n13] = sArray2[this.cfr_renamed_1 - n13];
            n12 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_7163(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        int n2;
        int n3;
        sprblg sprblg2 = this;
        short[] sArray = new short[sprblg2.cfr_renamed_1 + 1];
        short[] sArray2 = new short[sprblg2.cfr_renamed_102];
        short[] sArray3 = new short[sprblg2.cfr_renamed_1 * 2];
        short[] sArray4 = new short[sprblg2.cfr_renamed_1 * 2];
        short[] sArray5 = new short[sprblg2.cfr_renamed_1 + 1];
        short[] sArray6 = new short[sprblg2.cfr_renamed_102];
        byte[] byArray = new byte[sprblg2.cfr_renamed_102 / 8];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_132) {
            int n5 = n3++;
            byArray[n5] = arg2[n5];
            n4 = n3;
        }
        int n6 = n3 = this.cfr_renamed_132;
        while (n6 < this.cfr_renamed_102 / 8) {
            byArray[n3++] = 0;
            n6 = n3;
        }
        int n7 = n3 = 0;
        while (n7 < this.cfr_renamed_1) {
            int n8 = n3++;
            sArray[n8] = sprbfg.cfr_renamed_7130(arg1, 40 + n8 * 2, this.cfr_renamed_152);
            n7 = n3;
        }
        sArray[this.cfr_renamed_1] = 1;
        sprblg sprblg3 = this;
        this.cfr_renamed_137.cfr_renamed_7164(sArray2, arg1);
        this.cfr_renamed_7165(sArray3, sArray, sArray2, byArray);
        sprblg3.cfr_renamed_7161(sArray5, sArray3);
        sprblg3.cfr_renamed_7158(sArray6, sArray5, sArray2);
        int n9 = n3 = 0;
        while (n9 < this.cfr_renamed_102 / 8) {
            arg0[n3++] = 0;
            n9 = n3;
        }
        n3 = 0;
        int n10 = n2 = 0;
        while (n10 < this.cfr_renamed_102) {
            short s = (short)(this.cfr_renamed_112.cfr_renamed_7149(sArray6[n2]) & 1);
            int n11 = n2 / 8;
            arg0[n11] = (byte)(arg0[n11] | s << n2 % 8);
            n3 += s;
            n10 = ++n2;
        }
        this.cfr_renamed_7165(sArray4, sArray, sArray2, arg0);
        n2 = n3;
        n2 ^= this.cfr_renamed_1;
        int n12 = n = 0;
        while (n12 < this.cfr_renamed_1 * 2) {
            short s = sArray3[n];
            short s2 = sArray4[n];
            n2 |= s ^ s2;
            n12 = ++n;
        }
        --n2;
        n2 >>= 15;
        if (((n2 &= 1) ^ 1) != 0) {
            // empty if block
        }
        return n2 ^ 1;
    }

    public void cfr_renamed_6789(byte[] arg0, byte[] arg1, SecureRandom arg2) {
        short[] sArray;
        sprnil sprnil2;
        byte[] byArray = new byte[1];
        byte[] byArray2 = new byte[32];
        byArray[0] = 64;
        arg2.nextBytes(byArray2);
        byte[] byArray3 = new byte[this.cfr_renamed_102 / 8 + (1 << this.cfr_renamed_79) * 4 + this.cfr_renamed_1 * 2 + 32];
        int n = 0;
        byte[] byArray4 = byArray2;
        long[] lArray = new long[1];
        lArray[0] = 0L;
        long[] lArray2 = lArray;
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        while (true) {
            int n2;
            int n3;
            int n4;
            int n5;
            sprnil3.cfr_renamed_1197(byArray, 0, byArray.length);
            sprnil2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprnil2.cfr_renamed_1199(byArray3, 0, byArray3.length);
            int n6 = n5 = byArray3.length - 32;
            byArray2 = sproze.cfr_renamed_533(byArray3, n6, n6 + 32);
            System.arraycopy(byArray4, 0, arg1, 0, 32);
            byArray4 = sproze.cfr_renamed_533(byArray2, 0, 32);
            short[] sArray2 = new short[this.cfr_renamed_1];
            n5 = n4 = byArray3.length - 32 - 2 * this.cfr_renamed_1;
            int n7 = n3 = 0;
            while (n7 < this.cfr_renamed_1) {
                int n8 = n3++;
                sArray2[n8] = sprbfg.cfr_renamed_7130(byArray3, n4 + n8 * 2, this.cfr_renamed_152);
                n7 = n3;
            }
            if (this.cfr_renamed_7166(sArray2) == -1) {
                sprnil3 = sprnil2;
                continue;
            }
            n = 40;
            int n9 = n3 = 0;
            while (n9 < this.cfr_renamed_1) {
                sprbfg.cfr_renamed_7132(arg1, n + n3 * 2, sArray2[n3++]);
                n9 = n3;
            }
            int[] nArray = new int[1 << this.cfr_renamed_79];
            n5 -= (1 << this.cfr_renamed_79) * 4;
            int n10 = n2 = 0;
            while (n10 < 1 << this.cfr_renamed_79) {
                int n11 = n2++;
                nArray[n11] = sprbfg.cfr_renamed_7131(byArray3, n5 + n11 * 4);
                n10 = n2;
            }
            sArray = new short[1 << this.cfr_renamed_79];
            if (this.cfr_renamed_7167(arg0, arg1, nArray, sArray, lArray2) != -1) break;
            sprnil3 = sprnil2;
        }
        byte[] byArray5 = new byte[this.cfr_renamed_107];
        sprblg.cfr_renamed_7168(byArray5, sArray, this.cfr_renamed_79, 1 << this.cfr_renamed_79);
        System.arraycopy(byArray5, 0, arg1, this.cfr_renamed_3 + 40, byArray5.length);
        System.arraycopy(byArray3, n5 -= this.cfr_renamed_102 / 8, arg1, arg1.length - this.cfr_renamed_102 / 8, this.cfr_renamed_102 / 8);
        byte[] byArray6 = arg1;
        if (!this.cfr_renamed_86) {
            sprbfg.cfr_renamed_7129(byArray6, 32, 0xFFFFFFFFL);
            return;
        }
        sprbfg.cfr_renamed_7129(byArray6, 32, lArray2[0]);
    }

    /*
     * WARNING - void declaration
     */
    public sprblg(int n, int n2, int n3, int[] nArray, boolean bl, int n4) {
        sprblg sprblg2;
        void arg5;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        void arg4;
        sprblg sprblg3 = this;
        sprblg sprblg4 = this;
        sprblg sprblg5 = this;
        sprblg sprblg6 = this;
        sprblg6.cfr_renamed_86 = arg4;
        sprblg6.cfr_renamed_102 = arg1;
        sprblg5.cfr_renamed_1 = arg2;
        sprblg5.cfr_renamed_79 = arg0;
        sprblg4.cfr_renamed_0 = arg3;
        sprblg4.cfr_renamed_105 = arg5;
        this.cfr_renamed_3 = this.cfr_renamed_1 * 2;
        this.cfr_renamed_107 = (1 << this.cfr_renamed_79 - 4) * (2 * this.cfr_renamed_79 - 1);
        this.cfr_renamed_91 = sprblg3.cfr_renamed_1 * this.cfr_renamed_79;
        sprblg3.cfr_renamed_4 = sprblg3.cfr_renamed_102 - this.cfr_renamed_91;
        sprblg3.cfr_renamed_119 = (sprblg3.cfr_renamed_4 + 7) / 8;
        this.cfr_renamed_132 = (sprblg3.cfr_renamed_91 + 7) / 8;
        this.cfr_renamed_152 = (1 << this.cfr_renamed_79) - 1;
        if (this.cfr_renamed_79 == 12) {
            sprblg2 = this;
            sprblg sprblg7 = this;
            this.cfr_renamed_112 = new sprrmg();
            sprblg sprblg8 = this;
            sprblg7.cfr_renamed_137 = new sprhog(sprblg8.cfr_renamed_102, sprblg8.cfr_renamed_1, this.cfr_renamed_79);
        } else {
            sprblg2 = this;
            this.cfr_renamed_112 = new sprohg();
            sprblg sprblg9 = this;
            this.cfr_renamed_137 = new sprxgg(this.cfr_renamed_102, sprblg9.cfr_renamed_1, sprblg9.cfr_renamed_79);
        }
        sprblg2.cfr_renamed_93 = this.cfr_renamed_1 % 8 != 0;
        this.cfr_renamed_2 = 1 << this.cfr_renamed_79 > this.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7165(short[] sArray, short[] sArray2, short[] sArray3, byte[] byArray) {
        short s;
        short s2;
        void arg1;
        void arg2;
        void arg3;
        int n = arg3[0] & 1;
        short s3 = arg2[0];
        short s4 = this.cfr_renamed_7159((short[])arg1, s3);
        short s5 = this.cfr_renamed_112.cfr_renamed_7148(this.cfr_renamed_112.cfr_renamed_7146(s4));
        sArray[0] = s2 = (short)(s5 & -n);
        short s6 = s = 1;
        while (s6 < 2 * this.cfr_renamed_1) {
            s2 = this.cfr_renamed_112.cfr_renamed_7147(s2, s3);
            arg0[s++] = s2;
            s6 = s;
        }
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_102) {
            int n3;
            void arg0;
            void v2 = arg0;
            s3 = (short)(arg3[n / 8] >> n % 8 & 1);
            s4 = arg2[n];
            sprblg sprblg2 = this;
            s5 = sprblg2.cfr_renamed_7159((short[])arg1, s4);
            sprblg sprblg3 = this;
            s2 = sprblg2.cfr_renamed_112.cfr_renamed_7148(sprblg3.cfr_renamed_112.cfr_renamed_7146(s5));
            s = sprblg3.cfr_renamed_112.cfr_renamed_7147(s2, s3);
            v2[0] = (short)(v2[0] ^ s);
            int n4 = n3 = 1;
            while (n4 < 2 * this.cfr_renamed_1) {
                void v6 = arg0;
                s = this.cfr_renamed_112.cfr_renamed_7147(s, s4);
                int n5 = n3++;
                v6[n5] = (short)(v6[n5] ^ s);
                n4 = n3;
            }
            n2 = ++n;
        }
    }

    public int cfr_renamed_6096() {
        return this.cfr_renamed_132;
    }

    public static short cfr_renamed_7169(int[] arg0, int arg1) {
        int n = arg1 / 2;
        if (arg1 % 2 == 0) {
            return (short)arg0[n];
        }
        return (short)((arg0[n] & 0xFFFF0000) >> 16);
    }

    private static /* synthetic */ void cfr_renamed_7170(short[] arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg3;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg4) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                short[] sArray = arg0;
                short[] sArray2 = arg0;
                int n7 = sArray[n + n5] ^ arg0[n + n5 + n2];
                int n8 = arg1[arg2 + (n3 >> 3)] >> (n3 & 7) & 1;
                n8 = -n8;
                int n9 = n + n5;
                sArray2[n9] = (short)(sArray2[n9] ^ (n7 &= n8));
                int n10 = n + n5 + n2;
                ++n3;
                sArray[n10] = (short)(sArray[n10] ^ n7);
                n6 = ++n5;
            }
            n4 = n + n2 * 2;
        }
    }

    private /* synthetic */ void cfr_renamed_7171(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        sprblg sprblg2 = this;
        short[] sArray = new short[sprblg2.cfr_renamed_102 / 8];
        int n2 = 0;
        int n3 = sprblg2.cfr_renamed_91 % 8;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_132) {
            arg0[n++] = 0;
            n4 = n;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < this.cfr_renamed_102 / 8) {
                sArray[n6++] = 0;
                n7 = n6;
            }
            int n8 = n6 = 0;
            while (n8 < this.cfr_renamed_119) {
                int n9 = this.cfr_renamed_102 / 8 - this.cfr_renamed_119 + n6;
                short s = arg1[n2 + n6];
                sArray[n9] = s;
                n8 = ++n6;
            }
            if (this.cfr_renamed_93) {
                int n10 = n6 = this.cfr_renamed_102 / 8 - 1;
                while (n10 >= this.cfr_renamed_102 / 8 - this.cfr_renamed_119) {
                    int n11 = n6;
                    short s = (short)(((sArray[n11] & 0xFF) << n3 | (sArray[n6 - 1] & 0xFF) >>> 8 - n3) & 0xFF);
                    sArray[n11] = s;
                    n10 = --n6;
                }
            }
            int n12 = n / 8;
            sArray[n12] = (short)(sArray[n12] | 1 << n % 8);
            int n13 = 0;
            int n14 = n6 = 0;
            while (n14 < this.cfr_renamed_102 / 8) {
                int n15 = sArray[n6] & arg2[n6];
                n13 = (byte)(n13 ^ n15);
                n14 = ++n6;
            }
            int n16 = n13;
            byte by = (byte)(n16 ^ n16 >>> 4);
            n13 = by;
            byte by2 = (byte)(by ^ by >>> 2);
            n13 = by2;
            byte by3 = (byte)(by2 ^ by2 >>> 1);
            n13 = by3;
            n13 = (byte)(by3 & 1);
            int n17 = n / 8;
            arg0[n17] = (byte)(arg0[n17] | n13 << n % 8);
            n2 += this.cfr_renamed_119;
            n5 = ++n;
        }
    }

    private static /* synthetic */ int cfr_renamed_7172(long arg0) {
        int n;
        int n2;
        long l = 0x101010101010101L;
        long l2 = 0L;
        long l3 = arg0 ^ 0xFFFFFFFFFFFFFFFFL;
        int n3 = n2 = 0;
        while (n3 < 8) {
            l2 += (l &= l3 >>> n2);
            n3 = ++n2;
        }
        long l4 = l2 & 0x808080808080808L;
        l4 |= l4 >>> 1;
        l4 |= l4 >>> 2;
        long l5 = l2;
        l5 += (l2 >>>= 8) & l4;
        int n4 = n = 2;
        while (n4 < 8) {
            long l6 = l4;
            l4 = l6 & l6 >>> 8;
            l5 += (l2 >>>= 8) & l4;
            n4 = ++n;
        }
        return (int)l5 & 0xFF;
    }

    private static /* synthetic */ long cfr_renamed_7173(short arg0, short arg1) {
        long l = arg0 ^ arg1;
        --l;
        l >>>= 63;
        l = -l;
        return l;
    }

    public int cfr_renamed_6094() {
        if (this.cfr_renamed_93) {
            sprblg sprblg2 = this;
            return sprblg2.cfr_renamed_91 * (sprblg2.cfr_renamed_102 / 8 - (this.cfr_renamed_91 - 1) / 8);
        }
        sprblg sprblg3 = this;
        return sprblg3.cfr_renamed_91 * sprblg3.cfr_renamed_4 / 8;
    }

    private static /* synthetic */ int cfr_renamed_7162(short arg0, int arg1) {
        if (arg0 < arg1) {
            return arg0;
        }
        return arg1;
    }

    private static /* synthetic */ byte cfr_renamed_7174(short arg0, short arg1) {
        int n = arg0 ^ arg1;
        --n;
        n >>>= 31;
        n = -n;
        return (byte)(n & 0xFF);
    }

    private /* synthetic */ int cfr_renamed_7166(short[] arg0) {
        int n;
        short s;
        short[][] sArray = new short[this.cfr_renamed_1 + 1][this.cfr_renamed_1];
        sArray[0][0] = 1;
        System.arraycopy(arg0, 0, sArray[1], 0, this.cfr_renamed_1);
        int[] nArray = new int[this.cfr_renamed_1 * 2 - 1];
        short s2 = s = 2;
        while (s2 < this.cfr_renamed_1) {
            sprblg sprblg2 = this;
            sprblg sprblg3 = this;
            sprblg2.cfr_renamed_112.cfr_renamed_7145(sprblg2.cfr_renamed_1, sprblg3.cfr_renamed_0, sArray[s], sArray[s >>> 1], nArray);
            sprblg sprblg4 = this;
            short[] sArray2 = sArray[s + 1];
            short[] sArray3 = sArray[s];
            sprblg3.cfr_renamed_112.cfr_renamed_7139(sprblg4.cfr_renamed_1, sprblg4.cfr_renamed_0, sArray2, sArray3, arg0, nArray);
            s2 = s += 2;
        }
        if (s == this.cfr_renamed_1) {
            sprblg sprblg5 = this;
            sprblg5.cfr_renamed_112.cfr_renamed_7145(sprblg5.cfr_renamed_1, this.cfr_renamed_0, sArray[s], sArray[s >>> 1], nArray);
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            int n3;
            int n4;
            short s3 = s = n + 1;
            while (s3 < this.cfr_renamed_1) {
                n4 = this.cfr_renamed_112.cfr_renamed_7149(sArray[n][n]);
                int n5 = n;
                while (n5 < this.cfr_renamed_1 + 1) {
                    short[] sArray4 = sArray[n3];
                    int n6 = n;
                    short s4 = (short)(sArray4[n6] ^ (short)(sArray[n3][s] & n4));
                    sArray4[n6] = s4;
                    n5 = ++n3;
                }
                s3 = ++s;
            }
            if (sArray[n][n] == 0) {
                return -1;
            }
            s = this.cfr_renamed_112.cfr_renamed_7148(sArray[n][n]);
            int n7 = n4 = n;
            while (n7 < this.cfr_renamed_1 + 1) {
                short[] sArray5 = sArray[n4];
                int n8 = n;
                short s5 = this.cfr_renamed_112.cfr_renamed_7147(sArray[n4][n8], s);
                sArray5[n8] = s5;
                n7 = ++n4;
            }
            int n9 = n4 = 0;
            while (n9 < this.cfr_renamed_1) {
                if (n4 != n) {
                    n3 = sArray[n][n4];
                    int n10 = n;
                    while (n10 <= this.cfr_renamed_1) {
                        int n11;
                        short[] sArray6 = sArray[n11];
                        int n12 = n4;
                        short s6 = (short)(sArray6[n12] ^ this.cfr_renamed_112.cfr_renamed_7147(sArray[n11][n], (short)n3));
                        sArray6[n12] = s6;
                        n10 = ++n11;
                    }
                }
                n9 = ++n4;
            }
            n2 = ++n;
        }
        System.arraycopy(sArray[this.cfr_renamed_1], 0, arg0, 0, this.cfr_renamed_1);
        return 0;
    }

    public int cfr_renamed_7153() {
        return this.cfr_renamed_105;
    }

    private static /* synthetic */ void cfr_renamed_7175(long[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3 = arg2 - arg1;
        if (n3 < 2) {
            return;
        }
        int n4 = n2 = 1;
        while (n4 < n3 - n2) {
            int n5 = n2;
            n4 = n5 + n5;
        }
        int n6 = n = n2;
        while (n6 > 0) {
            long l;
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3 - n) {
                if ((n7 & n) == 0) {
                    long[] lArray = arg0;
                    long[] lArray2 = arg0;
                    l = arg0[arg1 + n7 + n] - arg0[arg1 + n7];
                    l >>>= 63;
                    l = -l;
                    int n9 = arg1 + n7;
                    lArray2[n9] = lArray2[n9] ^ (l &= arg0[arg1 + n7] ^ arg0[arg1 + n7 + n]);
                    int n10 = arg1 + n7 + n;
                    lArray[n10] = lArray[n10] ^ l;
                }
                n8 = ++n7;
            }
            n7 = 0;
            int n11 = n2;
            while (n11 > n) {
                int n12;
                int n13 = n7;
                while (n13 < n3 - n12) {
                    if ((n7 & n) == 0) {
                        l = arg0[arg1 + n7 + n];
                        int n14 = n12;
                        while (n14 > n) {
                            int n15;
                            long[] lArray = arg0;
                            long l2 = arg0[arg1 + n7 + n15] - l;
                            l2 >>>= 63;
                            l2 = -l2;
                            l ^= (l2 &= l ^ arg0[arg1 + n7 + n15]);
                            int n16 = arg1 + n7 + n15;
                            lArray[n16] = lArray[n16] ^ l2;
                            n14 = n15 >>> 1;
                        }
                        arg0[arg1 + n7 + n] = l;
                    }
                    n13 = ++n7;
                }
                n11 = n12 >>> 1;
            }
            n6 = n >>> 1;
        }
    }

    public int cfr_renamed_6790(byte[] arg0, byte[] arg1, byte[] arg2, SecureRandom arg3) {
        sprnil sprnil2;
        sprblg sprblg2 = this;
        byte[] byArray = new byte[sprblg2.cfr_renamed_102 / 8];
        int n = 0;
        if (sprblg2.cfr_renamed_93) {
            n = this.cfr_renamed_7176(arg2);
        }
        this.cfr_renamed_7177(arg0, arg2, byArray, arg3);
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil3.cfr_renamed_1221((byte)1);
        sprnil3.cfr_renamed_1197(byArray, 0, byArray.length);
        sprnil2.cfr_renamed_1197(arg0, 0, arg0.length);
        sprnil2.cfr_renamed_1199(arg1, 0, arg1.length);
        if (this.cfr_renamed_93) {
            int n2;
            byte by = (byte)n;
            by = (byte)(by ^ 0xFF);
            int n3 = n2 = 0;
            while (n3 < this.cfr_renamed_132) {
                int n4 = n2++;
                arg0[n4] = (byte)(arg0[n4] & by);
                n3 = n2;
            }
            int n5 = n2 = 0;
            while (n5 < 32) {
                int n6 = n2++;
                arg1[n6] = (byte)(arg1[n6] & by);
                n5 = n2;
            }
            return n;
        }
        return 0;
    }

    public int cfr_renamed_7178() {
        return this.cfr_renamed_3;
    }

    public static void cfr_renamed_7179(byte[] arg0, long arg1, long arg2, short[] arg3, int arg4, long arg5, long arg6, int[] arg7) {
        long l;
        int n;
        int n2;
        long l2;
        long l3;
        int n3;
        int n4;
        int n5;
        long l4;
        if (arg5 == 1L) {
            int n6 = (int)(arg1 >> 3);
            arg0[n6] = (byte)(arg0[n6] ^ sprblg.cfr_renamed_7169(arg7, arg4) << (int)(arg1 & 7L));
            return;
        }
        if (arg3 != null) {
            long l5 = l4 = 0L;
            while (l5 < arg6) {
                long l6 = l4;
                arg7[(int)l6] = (arg3[(int)l4] ^ 1) << 16 | arg3[(int)(l4 ^ 1L)];
                l5 = l6 + 1L;
            }
        } else {
            long l7 = l4 = 0L;
            while (l7 < arg6) {
                long l8 = l4;
                arg7[(int)l8] = (sprblg.cfr_renamed_7169(arg7, (int)((long)arg4 + l4)) ^ 1) << 16 | sprblg.cfr_renamed_7169(arg7, (int)((long)arg4 + (l4 ^ 1L)));
                l7 = l8 + 1L;
            }
        }
        sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
        long l9 = l4 = 0L;
        while (l9 < arg6) {
            n5 = arg7[(int)l4];
            n4 = n5 & 0xFFFF;
            n3 = n4;
            if (l4 < (long)n3) {
                n3 = (int)l4;
            }
            arg7[(int)(arg6 + l4)] = n4 << 16 | n3;
            l9 = l4 + 1L;
        }
        long l10 = l4 = 0L;
        while (l10 < arg6) {
            long l11 = l4;
            arg7[(int)l11] = (int)((long)(arg7[(int)l4] << 16) | l4);
            l10 = l11 + 1L;
        }
        sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
        long l12 = l4 = 0L;
        while (l12 < arg6) {
            long l13 = l4;
            arg7[(int)l13] = (arg7[(int)l4] << 16) + (arg7[(int)(arg6 + l4)] >> 16);
            l12 = l13 + 1L;
        }
        sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
        if (arg5 <= 10L) {
            long l14 = l4 = 0L;
            while (l14 < arg6) {
                long l15 = l4;
                arg7[(int)(arg6 + l15)] = (arg7[(int)l4] & 0xFFFF) << 10 | arg7[(int)(arg6 + l4)] & 0x3FF;
                l14 = l15 + 1L;
            }
            long l16 = l3 = 1L;
            while (l16 < arg5 - 1L) {
                long l17 = l4 = 0L;
                while (l17 < arg6) {
                    long l18 = l4;
                    arg7[(int)l18] = (int)((long)((arg7[(int)(arg6 + l4)] & 0xFFFFFC00) << 6) | l4);
                    l17 = l18 + 1L;
                }
                sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
                long l19 = l4 = 0L;
                while (l19 < arg6) {
                    long l20 = l4;
                    arg7[(int)l20] = arg7[(int)l4] << 20 | arg7[(int)(arg6 + l4)];
                    l19 = l20 + 1L;
                }
                sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
                long l21 = l4 = 0L;
                while (l21 < arg6) {
                    n5 = arg7[(int)l4] & 0xFFFFF;
                    n4 = arg7[(int)l4] & 0xFFC00 | arg7[(int)(arg6 + l4)] & 0x3FF;
                    if (n5 < n4) {
                        n4 = n5;
                    }
                    arg7[(int)(arg6 + l4)] = n4;
                    l21 = l4 + 1L;
                }
                l16 = l3 + 1L;
            }
            long l22 = l4 = 0L;
            while (l22 < arg6) {
                int n7 = (int)(arg6 + l4);
                arg7[n7] = arg7[n7] & 0x3FF;
                l22 = l4 + 1L;
            }
        } else {
            long l23 = l4 = 0L;
            while (l23 < arg6) {
                long l24 = l4;
                arg7[(int)(arg6 + l24)] = arg7[(int)l4] << 16 | arg7[(int)(arg6 + l4)] & 0xFFFF;
                l23 = l24 + 1L;
            }
            long l25 = l3 = 1L;
            while (l25 < arg5 - 1L) {
                long l26 = l4 = 0L;
                while (l26 < arg6) {
                    long l27 = l4;
                    arg7[(int)l27] = (int)((long)(arg7[(int)(arg6 + l4)] & 0xFFFF0000) | l4);
                    l26 = l27 + 1L;
                }
                sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
                long l28 = l4 = 0L;
                while (l28 < arg6) {
                    long l29 = l4;
                    arg7[(int)l29] = arg7[(int)l4] << 16 | arg7[(int)(arg6 + l4)] & 0xFFFF;
                    l28 = l29 + 1L;
                }
                if (l3 < arg5 - 2L) {
                    long l30 = l4 = 0L;
                    while (l30 < arg6) {
                        long l31 = l4;
                        arg7[(int)(arg6 + l31)] = arg7[(int)l4] & 0xFFFF0000 | arg7[(int)(arg6 + l4)] >> 16;
                        l30 = l31 + 1L;
                    }
                    sprblg.cfr_renamed_7157(arg7, (int)arg6, (int)(arg6 * 2L));
                    long l32 = l4 = 0L;
                    while (l32 < arg6) {
                        long l33 = l4;
                        arg7[(int)(arg6 + l33)] = arg7[(int)(arg6 + l4)] << 16 | arg7[(int)l4] & 0xFFFF;
                        l32 = l33 + 1L;
                    }
                }
                sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
                long l34 = l4 = 0L;
                while (l34 < arg6) {
                    n5 = arg7[(int)(arg6 + l4)] & 0xFFFF0000 | arg7[(int)l4] & 0xFFFF;
                    if (n5 < arg7[(int)(arg6 + l4)]) {
                        arg7[(int)(arg6 + l4)] = n5;
                    }
                    l34 = l4 + 1L;
                }
                l25 = l3 + 1L;
            }
            long l35 = l4 = 0L;
            while (l35 < arg6) {
                int n8 = (int)(arg6 + l4);
                arg7[n8] = arg7[n8] & 0xFFFF;
                l35 = l4 + 1L;
            }
        }
        if (arg3 != null) {
            long l36 = l4 = 0L;
            while (l36 < arg6) {
                long l37 = l4;
                arg7[(int)l37] = (int)((long)(arg3[(int)l4] << 16) + l4);
                l36 = l37 + 1L;
            }
        } else {
            long l38 = l4 = 0L;
            while (l38 < arg6) {
                long l39 = l4;
                arg7[(int)l39] = (int)((long)(sprblg.cfr_renamed_7169(arg7, (int)((long)arg4 + l4)) << 16) + l4);
                l38 = l39 + 1L;
            }
        }
        sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
        long l40 = l2 = 0L;
        while (l40 < arg6 / 2L) {
            long l41 = 2L * l2;
            int[] nArray = arg7;
            byte[] byArray = arg0;
            n3 = nArray[(int)(arg6 + l41)] & 1;
            n2 = (int)(l41 + (long)n3);
            n = n2 ^ 1;
            int n9 = (int)(arg1 >> 3);
            byArray[n9] = (byte)(byArray[n9] ^ n3 << (int)(arg1 & 7L));
            arg1 += arg2;
            arg7[(int)(arg6 + l41)] = arg7[(int)l41] << 16 | n2;
            nArray[(int)(arg6 + l41 + 1L)] = arg7[(int)(l41 + 1L)] << 16 | n;
            l40 = l2 + 1L;
        }
        sprblg.cfr_renamed_7157(arg7, (int)arg6, (int)(arg6 * 2L));
        arg1 += (2L * arg5 - 3L) * arg2 * (arg6 / 2L);
        long l42 = l = 0L;
        while (l42 < arg6 / 2L) {
            long l43 = 2L * l;
            int[] nArray = arg7;
            byte[] byArray = arg0;
            n3 = nArray[(int)(arg6 + l43)] & 1;
            n2 = (int)(l43 + (long)n3);
            n = n2 ^ 1;
            int n10 = (int)(arg1 >> 3);
            byArray[n10] = (byte)(byArray[n10] ^ n3 << (int)(arg1 & 7L));
            arg1 += arg2;
            arg7[(int)l43] = n2 << 16 | arg7[(int)(arg6 + l43)] & 0xFFFF;
            nArray[(int)(l43 + 1L)] = n << 16 | arg7[(int)(arg6 + l43 + 1L)] & 0xFFFF;
            l42 = l + 1L;
        }
        sprblg.cfr_renamed_7157(arg7, 0, (int)arg6);
        arg1 -= (2L * arg5 - 2L) * arg2 * (arg6 / 2L);
        short[] sArray = new short[(int)arg6 * 4];
        long l44 = l3 = 0L;
        while (l44 < arg6 * 2L) {
            long l45 = l3;
            sArray[(int)(l3 * 2L + 0L)] = (short)arg7[(int)l3];
            sArray[(int)(l45 * 2L + 1L)] = (short)((arg7[(int)l3] & 0xFFFF0000) >> 16);
            l44 = l45 + 1L;
        }
        long l46 = l2 = 0L;
        while (l46 < arg6 / 2L) {
            long l47 = l2;
            sArray[(int)l2] = (short)((arg7[(int)(2L * l2)] & 0xFFFF) >>> 1);
            sArray[(int)(l47 + arg6 / 2L)] = (short)((arg7[(int)(2L * l2 + 1L)] & 0xFFFF) >>> 1);
            l46 = l47 + 1L;
        }
        long l48 = l3 = 0L;
        while (l48 < arg6 / 2L) {
            long l49 = arg6;
            arg7[(int)(l49 + l49 / 4L + l3)] = sArray[(int)(l3 * 2L + 1L)] << 16 | sArray[(int)(l3 * 2L)];
            l48 = l3 + 1L;
        }
        long l50 = arg1;
        long l51 = arg6;
        sprblg.cfr_renamed_7179(arg0, l50, arg2 * 2L, null, (int)(l51 + l51 / 4L) * 2, arg5 - 1L, arg6 / 2L, arg7);
        long l52 = arg6;
        sprblg.cfr_renamed_7179(arg0, l50 + arg2, arg2 * 2L, null, (int)((l52 + l52 / 4L) * 2L + arg6 / 2L), arg5 - 1L, arg6 / 2L, arg7);
    }

    private /* synthetic */ int cfr_renamed_7167(byte[] arg0, byte[] arg1, int[] arg2, short[] arg3, long[] arg4) {
        block28: {
            int n;
            int n2;
            int n3;
            int n4;
            short[] sArray = new short[this.cfr_renamed_1 + 1];
            sArray[this.cfr_renamed_1] = 1;
            int n5 = n4 = 0;
            while (n5 < this.cfr_renamed_1) {
                int n6 = n4++;
                sArray[n6] = sprbfg.cfr_renamed_7130(arg1, 40 + n6 * 2, this.cfr_renamed_152);
                n5 = n4;
            }
            long[] lArray = new long[1 << this.cfr_renamed_79];
            int n7 = n4 = 0;
            while (n7 < 1 << this.cfr_renamed_79) {
                long[] lArray2 = lArray;
                int n8 = n4;
                long[] lArray3 = lArray;
                int n9 = n4;
                long[] lArray4 = lArray;
                int n10 = n4;
                lArray[n10] = arg2[n10];
                lArray4[n9] = lArray4[n9] << 31;
                lArray2[n9] = lArray2[n9] | (long)n4;
                lArray3[n8] = lArray3[n8] & Long.MAX_VALUE;
                n7 = ++n4;
            }
            sprblg.cfr_renamed_7175(lArray, 0, lArray.length);
            int n11 = n4 = 1;
            while (n11 < 1 << this.cfr_renamed_79) {
                if (lArray[n4 - 1] >> 31 == lArray[n4] >> 31) {
                    return -1;
                }
                n11 = ++n4;
            }
            short[] sArray2 = new short[this.cfr_renamed_102];
            int n12 = n4 = 0;
            while (n12 < 1 << this.cfr_renamed_79) {
                int n13 = n4++;
                arg3[n13] = (short)(lArray[n13] & (long)this.cfr_renamed_152);
                n12 = n4;
            }
            int n14 = n4 = 0;
            while (n14 < this.cfr_renamed_102) {
                int n15 = n4++;
                sArray2[n15] = sprbfg.cfr_renamed_7133(arg3[n15], this.cfr_renamed_79);
                n14 = n4;
            }
            sprblg sprblg2 = this;
            short[] sArray3 = new short[sprblg2.cfr_renamed_102];
            sprblg2.cfr_renamed_7158(sArray3, sArray, sArray2);
            int n16 = n4 = 0;
            while (n16 < this.cfr_renamed_102) {
                sArray3[++n4] = this.cfr_renamed_112.cfr_renamed_7148(sArray3[n4]);
                n16 = n4;
            }
            sprblg sprblg3 = this;
            byte[][] byArray = new byte[sprblg3.cfr_renamed_91][sprblg3.cfr_renamed_102 / 8];
            int n17 = n4 = 0;
            while (n17 < this.cfr_renamed_91) {
                int n18 = n3 = 0;
                while (n18 < this.cfr_renamed_102 / 8) {
                    byArray[n4][n3++] = 0;
                    n18 = n3;
                }
                n17 = ++n4;
            }
            int n19 = n4 = 0;
            while (n19 < this.cfr_renamed_1) {
                int n20 = n3 = 0;
                while (n20 < this.cfr_renamed_102) {
                    int n21 = n2 = 0;
                    while (n21 < this.cfr_renamed_79) {
                        byte by = (byte)(sArray3[n3 + 7] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 6] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 5] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 4] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 3] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 2] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 1] >>> n2 & 1);
                        by = (byte)(by << 1);
                        by = (byte)(by | sArray3[n3 + 0] >>> n2 & 1);
                        byte[] byArray2 = byArray[n4 * this.cfr_renamed_79 + n2];
                        byArray2[n3 / 8] = by;
                        n21 = ++n2;
                    }
                    n20 = n3 += 8;
                }
                int n22 = n3 = 0;
                while (n22 < this.cfr_renamed_102) {
                    sArray3[++n3] = this.cfr_renamed_112.cfr_renamed_7147(sArray3[n3], sArray2[n3]);
                    n22 = n3;
                }
                n19 = ++n4;
            }
            int n23 = n = 0;
            while (n23 < this.cfr_renamed_91) {
                int n24;
                byte by;
                n4 = n >>> 3;
                n3 = n & 7;
                if (this.cfr_renamed_86 && n == this.cfr_renamed_91 - 32 && this.cfr_renamed_7180(byArray, arg3, arg4) != 0) {
                    return -1;
                }
                int n25 = n2 = n + 1;
                while (n25 < this.cfr_renamed_91) {
                    by = (byte)(byArray[n][n4] ^ byArray[n2][n4]);
                    by = (byte)(by >> n3);
                    by = (byte)(by & 1);
                    by = -by;
                    int n26 = n24 = 0;
                    while (n26 < this.cfr_renamed_102 / 8) {
                        byte[] byArray3 = byArray[n];
                        int n27 = n24;
                        byte by2 = (byte)(byArray3[n27] ^ byArray[n2][n24] & by);
                        byArray3[n27] = by2;
                        n26 = ++n24;
                    }
                    n25 = ++n2;
                }
                if ((byArray[n][n4] >> n3 & 1) == 0) {
                    return -1;
                }
                int n28 = n2 = 0;
                while (n28 < this.cfr_renamed_91) {
                    if (n2 != n) {
                        by = (byte)(byArray[n2][n4] >> n3);
                        by = (byte)(by & 1);
                        by = -by;
                        int n29 = n24 = 0;
                        while (n29 < this.cfr_renamed_102 / 8) {
                            byte[] byArray4 = byArray[n2];
                            int n30 = n24;
                            byte by3 = (byte)(byArray4[n30] ^ byArray[n][n24] & by);
                            byArray4[n30] = by3;
                            n29 = ++n24;
                        }
                    }
                    n28 = ++n2;
                }
                n23 = ++n;
            }
            if (arg0 == null) break block28;
            if (this.cfr_renamed_93) {
                int n31 = 0;
                int n32 = this.cfr_renamed_91 % 8;
                if (n32 == 0) {
                    System.arraycopy(byArray[n4], (this.cfr_renamed_91 - 1) / 8, arg0, n31, this.cfr_renamed_102 / 8);
                    n31 += this.cfr_renamed_102 / 8;
                } else {
                    int n33 = n4 = 0;
                    while (n33 < this.cfr_renamed_91) {
                        int n34 = (this.cfr_renamed_91 - 1) / 8;
                        while (n34 < this.cfr_renamed_102 / 8 - 1) {
                            int n35 = n31++;
                            byte by = (byte)((byArray[n4][n3] & 0xFF) >>> n32 | byArray[n4][n3 + 1] << 8 - n32);
                            arg0[n35] = by;
                            n34 = ++n3;
                        }
                        int n36 = n31++;
                        byte by = (byte)((byArray[n4][n3] & 0xFF) >>> n32);
                        arg0[n36] = by;
                        n33 = ++n4;
                    }
                }
            } else {
                sprblg sprblg4 = this;
                int n37 = (sprblg4.cfr_renamed_102 - sprblg4.cfr_renamed_91 + 7) / 8;
                int n38 = n4 = 0;
                while (n38 < this.cfr_renamed_91) {
                    System.arraycopy(byArray[n4], this.cfr_renamed_91 / 8, arg0, n37 * n4++, n37);
                    n38 = n4;
                }
            }
        }
        return 0;
    }

    private /* synthetic */ int cfr_renamed_7180(byte[][] arg0, short[] arg1, long[] arg2) {
        long l;
        int n;
        long l2;
        int n2;
        int n3;
        long[] lArray = new long[64];
        long[] lArray2 = new long[32];
        long l3 = 1L;
        byte[] byArray = new byte[9];
        sprblg sprblg2 = this;
        int n4 = sprblg2.cfr_renamed_91 - 32;
        int n5 = n4 / 8;
        int n6 = n4 % 8;
        if (sprblg2.cfr_renamed_93) {
            int n7 = n3 = 0;
            while (n7 < 32) {
                int n8 = n2 = 0;
                while (n8 < 9) {
                    int n9 = n2++;
                    byArray[n9] = arg0[n4 + n3][n5 + n9];
                    n8 = n2;
                }
                int n10 = n2 = 0;
                while (n10 < 8) {
                    int n11 = n2;
                    byte by = (byte)((byArray[n11] & 0xFF) >> n6 | byArray[n2 + 1] << 8 - n6);
                    byArray[n11] = by;
                    n10 = ++n2;
                }
                lArray[n3++] = sprbfg.cfr_renamed_7134(byArray, 0);
                n7 = n3;
            }
        } else {
            int n12 = n3 = 0;
            while (n12 < 32) {
                int n13 = n3++;
                lArray[n13] = sprbfg.cfr_renamed_7134(arg0[n4 + n13], n5);
                n12 = n3;
            }
        }
        arg2[0] = 0L;
        int n14 = n3 = 0;
        while (n14 < 32) {
            long l4;
            l2 = lArray[n3];
            int n15 = n2 = n3 + 1;
            while (n15 < 32) {
                l2 |= lArray[n2++];
                n15 = n2;
            }
            if (l2 == 0L) {
                return -1;
            }
            int n16 = sprblg.cfr_renamed_7172(l2);
            lArray2[n3] = n16;
            arg2[0] = arg2[0] | l3 << (int)lArray2[n3];
            int n17 = n2 = n3 + 1;
            while (n17 < 32) {
                long[] lArray3 = lArray;
                l4 = lArray[n3] >> n16 & 1L;
                int n18 = n3;
                long l5 = lArray3[n18] ^ lArray[n2] & --l4;
                lArray3[n18] = l5;
                n17 = ++n2;
            }
            int n19 = n2 = n3 + 1;
            while (n19 < 32) {
                long[] lArray4 = lArray;
                l4 = lArray[n2] >> n16 & 1L;
                l4 = -l4;
                int n20 = n2++;
                lArray4[n20] = lArray4[n20] ^ lArray[n3] & l4;
                n19 = n2;
            }
            n14 = ++n3;
        }
        int n21 = n2 = 0;
        while (n21 < 32) {
            int n22 = n2 + 1;
            while (n22 < 64) {
                short[] sArray = arg1;
                short[] sArray2 = arg1;
                l = arg1[n4 + n2] ^ arg1[n4 + n];
                int n23 = n4 + n2;
                sArray[n23] = (short)((long)sArray[n23] ^ (l &= sprblg.cfr_renamed_7173((short)n, (short)lArray2[n2])));
                int n24 = n4 + n;
                sArray2[n24] = (short)((long)sArray2[n24] ^ l);
                n22 = ++n;
            }
            n21 = ++n2;
        }
        int n25 = n3 = 0;
        while (n25 < this.cfr_renamed_91) {
            if (this.cfr_renamed_93) {
                int n26 = n = 0;
                while (n26 < 9) {
                    int n27 = n++;
                    byArray[n27] = arg0[n3][n5 + n27];
                    n26 = n;
                }
                int n28 = n = 0;
                while (n28 < 8) {
                    int n29 = n;
                    byte by = (byte)((byArray[n29] & 0xFF) >> n6 | byArray[n + 1] << 8 - n6);
                    byArray[n29] = by;
                    n28 = ++n;
                }
                l2 = sprbfg.cfr_renamed_7134(byArray, 0);
            } else {
                l2 = sprbfg.cfr_renamed_7134(arg0[n3], n5);
            }
            int n30 = n2 = 0;
            while (n30 < 32) {
                l = l2 >> n2;
                l ^= l2 >> (int)lArray2[n2];
                l2 ^= (l &= 1L) << (int)lArray2[n2];
                l2 ^= l << n2++;
                n30 = n2;
            }
            if (this.cfr_renamed_93) {
                sprbfg.cfr_renamed_7129(byArray, 0, l2);
                arg0[n3][n5 + 8] = (byte)((arg0[n3][n5 + 8] & 0xFF) >>> n6 << n6 | (byArray[7] & 0xFF) >>> 8 - n6);
                arg0[n3][n5 + 0] = (byte)((byArray[0] & 0xFF) << n6 | (arg0[n3][n5] & 0xFF) << 8 - n6 >>> 8 - n6);
                int n31 = n = 7;
                while (n31 >= 1) {
                    int n32 = n5 + n;
                    byte by = (byte)((byArray[n] & 0xFF) << n6 | (byArray[n - 1] & 0xFF) >>> 8 - n6);
                    arg0[n3][n32] = by;
                    n31 = --n;
                }
            } else {
                sprbfg.cfr_renamed_7129(arg0[n3], n5, l2);
            }
            n25 = ++n3;
        }
        return 0;
    }

    private /* synthetic */ short cfr_renamed_7159(short[] arg0, short arg1) {
        int n;
        sprblg sprblg2 = this;
        short s = arg0[sprblg2.cfr_renamed_1];
        int n2 = n = sprblg2.cfr_renamed_1 - 1;
        while (n2 >= 0) {
            short s2 = arg0[n];
            s = (short)(this.cfr_renamed_112.cfr_renamed_7147(s, arg1) ^ s2);
            n2 = --n;
        }
        return s;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7177(byte[] byArray, byte[] byArray2, byte[] byArray3, SecureRandom secureRandom) {
        void arg1;
        void arg3;
        void arg2;
        sprblg sprblg2 = this;
        sprblg2.cfr_renamed_7181((byte[])arg2, (SecureRandom)arg3);
        sprblg2.cfr_renamed_7171(byArray, (byte[])arg1, (byte[])arg2);
    }

    public byte[] cfr_renamed_7156(byte[] arg0) {
        int n;
        Object[] objectArray;
        Object[] objectArray2;
        sprnil sprnil2;
        byte[] byArray = new byte[this.cfr_renamed_6093()];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        byte[] byArray2 = new byte[this.cfr_renamed_102 / 8 + (1 << this.cfr_renamed_79) * 4 + this.cfr_renamed_3 + 32];
        int n2 = 0;
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1221((byte)64);
        sprnil3.cfr_renamed_1197(arg0, 0, 32);
        sprnil3.cfr_renamed_1199(byArray2, 0, byArray2.length);
        if (arg0.length <= 40) {
            sprblg sprblg2 = this;
            objectArray2 = new short[sprblg2.cfr_renamed_1];
            objectArray = new byte[sprblg2.cfr_renamed_3];
            n2 = byArray2.length - 32 - this.cfr_renamed_3;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_1) {
                int n4 = n++;
                objectArray2[n4] = sprbfg.cfr_renamed_7130(byArray2, n2 + n4 * 2, this.cfr_renamed_152);
                n3 = n;
            }
            this.cfr_renamed_7166((short[])objectArray2);
            n = 0;
            int n5 = n;
            while (n5 < this.cfr_renamed_1) {
                sprbfg.cfr_renamed_7132(objectArray, n * 2, objectArray2[n++]);
                n5 = n;
            }
            System.arraycopy(objectArray, 0, byArray, 40, this.cfr_renamed_3);
        }
        if (arg0.length <= 40 + this.cfr_renamed_3) {
            sprblg sprblg3;
            Object[] objectArray3;
            objectArray2 = new int[1 << this.cfr_renamed_79];
            objectArray = new short[1 << this.cfr_renamed_79];
            n2 = byArray2.length - 32 - this.cfr_renamed_3 - (1 << this.cfr_renamed_79) * 4;
            int n6 = n = 0;
            while (n6 < 1 << this.cfr_renamed_79) {
                int n7 = n++;
                objectArray2[n7] = sprbfg.cfr_renamed_7131(byArray2, n2 + n7 * 4);
                n6 = n;
            }
            if (this.cfr_renamed_86) {
                long[] lArray = new long[1];
                lArray[0] = 0L;
                objectArray3 = lArray;
                sprblg sprblg4 = this;
                sprblg3 = sprblg4;
                sprblg4.cfr_renamed_7167(null, byArray, (int[])objectArray2, (short[])objectArray, (long[])objectArray3);
            } else {
                int n8;
                objectArray3 = new long[1 << this.cfr_renamed_79];
                int n9 = n8 = 0;
                while (n9 < 1 << this.cfr_renamed_79) {
                    long[] lArray = objectArray3;
                    int n10 = n8;
                    long[] lArray2 = objectArray3;
                    int n11 = n8;
                    long[] lArray3 = objectArray3;
                    int n12 = n8;
                    objectArray3[n12] = objectArray2[n12];
                    lArray3[n11] = lArray3[n11] << 31;
                    lArray[n11] = lArray[n11] | (long)n8;
                    lArray2[n10] = lArray2[n10] & Long.MAX_VALUE;
                    n9 = ++n8;
                }
                sprblg.cfr_renamed_7175(objectArray3, 0, objectArray3.length);
                int n13 = n8 = 0;
                while (n13 < 1 << this.cfr_renamed_79) {
                    int n14 = n8++;
                    objectArray[n14] = (short)(objectArray3[n14] & (long)this.cfr_renamed_152);
                    n13 = n8;
                }
                sprblg3 = this;
            }
            objectArray3 = new byte[sprblg3.cfr_renamed_107];
            sprblg.cfr_renamed_7168((byte[])objectArray3, objectArray, this.cfr_renamed_79, 1 << this.cfr_renamed_79);
            System.arraycopy(objectArray3, 0, byArray, this.cfr_renamed_3 + 40, objectArray3.length);
        }
        System.arraycopy(byArray2, 0, byArray, this.cfr_renamed_6093() - this.cfr_renamed_102 / 8, this.cfr_renamed_102 / 8);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6791(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        void arg0;
        int n;
        void arg2;
        void arg1;
        byte[] byArray4 = new byte[this.cfr_renamed_102 / 8];
        sprblg sprblg2 = this;
        byte[] byArray5 = new byte[1 + this.cfr_renamed_102 / 8 + sprblg2.cfr_renamed_132];
        int n2 = 0;
        if (sprblg2.cfr_renamed_93) {
            n2 = this.cfr_renamed_7160((byte[])arg1);
        }
        short s = (byte)this.cfr_renamed_7163(byArray4, (byte[])arg2, (byte[])arg1);
        s = (short)(s - 1);
        s = (short)(s >> 8);
        s = (short)(s & 0xFF);
        byArray5[0] = (byte)(s & 1);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_102 / 8) {
            int n4 = 1 + n;
            byte by = (byte)(~s & arg2[n + 40 + this.cfr_renamed_3 + this.cfr_renamed_107] | s & byArray4[n]);
            byArray5[n4] = by;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_132) {
            int n6 = 1 + this.cfr_renamed_102 / 8 + n;
            void v6 = arg1[n];
            byArray5[n6] = v6;
            n5 = ++n;
        }
        sprnil sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1197(byArray5, 0, byArray5.length);
        void v7 = arg0;
        sprnil2.cfr_renamed_1199((byte[])v7, 0, ((void)v7).length);
        if (this.cfr_renamed_93) {
            byte by = (byte)n2;
            int n7 = n = 0;
            while (n7 < ((void)arg0).length) {
                void v9 = arg0;
                int n8 = n++;
                v9[n8] = (byte)(v9[n8] | by);
                n7 = n;
            }
            return n2;
        }
        return 0;
    }

    public int cfr_renamed_7176(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            byte by = arg0[n * this.cfr_renamed_119 + this.cfr_renamed_119 - 1];
            n2 = (byte)(n2 | by);
            n3 = ++n;
        }
        byte by = (byte)((n2 & 0xFF) >>> this.cfr_renamed_4 % 8);
        n2 = by;
        byte by2 = (byte)(by - 1);
        n2 = by2;
        byte by3 = (byte)((by2 & 0xFF) >>> 7);
        n2 = by3;
        byte by4 = by3;
        return by4 - 1;
    }

    private static /* synthetic */ void cfr_renamed_7168(byte[] arg0, short[] arg1, long arg2, long arg3) {
        int n;
        int[] nArray = new int[(int)(2L * arg3)];
        short[] sArray = new short[(int)arg3];
        do {
            int n2;
            int n3 = n2 = 0;
            while ((long)n3 < ((2L * arg2 - 1L) * arg3 / 2L + 7L) / 8L) {
                arg0[n2++] = 0;
                n3 = n2;
            }
            sprblg.cfr_renamed_7179(arg0, 0L, 1L, arg1, 0, arg2, arg3, nArray);
            int n4 = n2 = 0;
            while ((long)n4 < arg3) {
                int n5 = n2++;
                sArray[n5] = (short)n5;
                n4 = n2;
            }
            int n6 = 0;
            int n7 = n2 = 0;
            while ((long)n7 < arg2) {
                int n8 = n6;
                sprblg.cfr_renamed_7170(sArray, arg0, n8, n2, (int)arg3);
                n6 = (int)((long)n8 + (arg3 >> 4));
                n7 = ++n2;
            }
            int n9 = n2 = (int)(arg2 - 2L);
            while (n9 >= 0) {
                int n10 = n6;
                sprblg.cfr_renamed_7170(sArray, arg0, n10, n2, (int)arg3);
                n6 = (int)((long)n10 + (arg3 >> 4));
                n9 = --n2;
            }
            n = 0;
            int n11 = n2 = 0;
            while ((long)n11 < arg3) {
                int n12 = arg1[n2] ^ sArray[n2];
                n = (short)(n | n12);
                n11 = ++n2;
            }
        } while (n != 0);
    }

    public int cfr_renamed_7182() {
        return this.cfr_renamed_107;
    }

    public int cfr_renamed_6093() {
        sprblg sprblg2 = this;
        return sprblg2.cfr_renamed_107 + sprblg2.cfr_renamed_3 + this.cfr_renamed_102 / 8 + 40;
    }

    /*
     * WARNING - void declaration
     */
    public byte[] cfr_renamed_7150(byte[] byArray) {
        void arg0;
        sprnil sprnil2;
        byte[] byArray2 = new byte[this.cfr_renamed_6094()];
        short[] sArray = new short[1 << this.cfr_renamed_79];
        long[] lArray = new long[1];
        lArray[0] = 0L;
        long[] lArray2 = lArray;
        sprblg sprblg2 = this;
        int[] nArray = new int[1 << sprblg2.cfr_renamed_79];
        byte[] byArray3 = new byte[sprblg2.cfr_renamed_102 / 8 + (1 << this.cfr_renamed_79) * 4];
        int n = byArray3.length - 32 - this.cfr_renamed_3 - (1 << this.cfr_renamed_79) * 4;
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1221((byte)64);
        sprnil3.cfr_renamed_1197((byte[])arg0, 0, 32);
        sprnil3.cfr_renamed_1199(byArray3, 0, byArray3.length);
        int n2 = 0;
        int n3 = n2;
        while (n3 < 1 << this.cfr_renamed_79) {
            int n4 = n2++;
            nArray[n4] = sprbfg.cfr_renamed_7131(byArray3, n + n4 * 4);
            n3 = n2;
        }
        this.cfr_renamed_7167(byArray2, (byte[])arg0, nArray, sArray, lArray2);
        return byArray2;
    }

    private /* synthetic */ void cfr_renamed_7181(byte[] arg0, SecureRandom arg1) {
        int n;
        int n2;
        short s;
        sprblg sprblg2 = this;
        short[] sArray = new short[sprblg2.cfr_renamed_1 * 2];
        short[] sArray2 = new short[sprblg2.cfr_renamed_1];
        byte[] byArray = new byte[sprblg2.cfr_renamed_1];
        do {
            block13: {
                byte[] byArray2;
                sprblg sprblg3 = this;
                while (sprblg3.cfr_renamed_2) {
                    byArray2 = new byte[this.cfr_renamed_1 * 4];
                    arg1.nextBytes(byArray2);
                    short s2 = s = 0;
                    while (s2 < this.cfr_renamed_1 * 2) {
                        short s3 = s++;
                        sArray[s3] = sprbfg.cfr_renamed_7130(byArray2, s3 * 2, this.cfr_renamed_152);
                        s2 = s;
                    }
                    s = 0;
                    int n3 = n2 = 0;
                    while (n3 < this.cfr_renamed_1 * 2 && s < this.cfr_renamed_1) {
                        if (sArray[n2] < this.cfr_renamed_102) {
                            sArray2[s++] = sArray[n2];
                        }
                        n3 = ++n2;
                    }
                    if (s < this.cfr_renamed_1) {
                        sprblg3 = this;
                        continue;
                    }
                    break block13;
                }
                byArray2 = new byte[this.cfr_renamed_1 * 2];
                arg1.nextBytes(byArray2);
                short s4 = s = 0;
                while (s4 < this.cfr_renamed_1) {
                    short s5 = s++;
                    sArray2[s5] = sprbfg.cfr_renamed_7130(byArray2, s5 * 2, this.cfr_renamed_152);
                    s4 = s;
                }
            }
            s = 0;
            int n4 = n2 = 1;
            while (n4 < this.cfr_renamed_1 && s != 1) {
                int n5 = n = 0;
                while (n5 < n2) {
                    if (sArray2[n2] == sArray2[n]) {
                        s = 1;
                        break;
                    }
                    n5 = ++n;
                }
                n4 = ++n2;
            }
        } while (s != 0);
        short s6 = s = 0;
        while (s6 < this.cfr_renamed_1) {
            short s7 = s++;
            byArray[s7] = (byte)(1 << (sArray2[s7] & 7));
            s6 = s;
        }
        short s8 = s = 0;
        while (s8 < this.cfr_renamed_102 / 8) {
            arg0[s] = 0;
            int n6 = n2 = 0;
            while (n6 < this.cfr_renamed_1) {
                short s9 = sprblg.cfr_renamed_7174(s, (short)(sArray2[n2] >> 3));
                n = s9;
                n = (short)(s9 & 0xFF);
                short s10 = s;
                byte by = (byte)(arg0[s10] | byArray[n2] & n);
                arg0[s10] = by;
                n6 = ++n2;
            }
            s8 = s = (short)((short)(s + 1));
        }
    }
}

