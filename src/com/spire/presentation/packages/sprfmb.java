/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzxk;
import java.math.BigInteger;

public class sprfmb {
    private static final long[] cfr_renamed_112;
    private long[] cfr_renamed_119;
    private static final int[] cfr_renamed_91;
    private static final String cfr_renamed_0 = "0000000000000000000000000000000000000000000000000000000000000000";
    private static final int[] cfr_renamed_1;
    private static final int[] cfr_renamed_2;
    public static final byte[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    private static /* synthetic */ long cfr_renamed_1878(long arg0) {
        return sprfmb.cfr_renamed_1879((int)arg0 & 0x1FFF) | sprfmb.cfr_renamed_1879((int)(arg0 >>> 13) & 0x1FFF) << 1 | sprfmb.cfr_renamed_1879((int)(arg0 >>> 26) & 0x1FFF) << 2 | sprfmb.cfr_renamed_1879((int)(arg0 >>> 39) & 0x1FFF) << 3 | sprfmb.cfr_renamed_1879((int)(arg0 >>> 52) & 0x1FFF) << 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_1880(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        switch (arg5) {
            case 3: {
                sprfmb.cfr_renamed_1881(arg0, arg1, arg2, arg3, arg4);
                return;
            }
            case 5: {
                sprfmb.cfr_renamed_1882(arg0, arg1, arg2, arg3, arg4);
                return;
            }
            case 7: {
                sprfmb.cfr_renamed_1883(arg0, arg1, arg2, arg3, arg4);
                return;
            }
        }
        sprfmb.cfr_renamed_1884(arg0, arg1, arg2, arg3, arg4, cfr_renamed_3[arg5] - 1);
    }

    private static /* synthetic */ long cfr_renamed_1885(long arg0, int arg1) {
        int n = arg1;
        while (n > 1) {
            arg0 = sprfmb.cfr_renamed_1886((int)arg0 & 0xFFFF) | sprfmb.cfr_renamed_1886((int)(arg0 >>> 16) & 0xFFFF) << 1 | sprfmb.cfr_renamed_1886((int)(arg0 >>> 32) & 0xFFFF) << 2 | sprfmb.cfr_renamed_1886((int)(arg0 >>> 48) & 0xFFFF) << 3;
            n = arg1 -= 2;
        }
        if (arg1 > 0) {
            arg0 = sprfmb.cfr_renamed_1887((int)arg0) | sprfmb.cfr_renamed_1887((int)(arg0 >>> 32)) << 1;
        }
        return arg0;
    }

    private static /* synthetic */ void cfr_renamed_1888(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg6) {
            int n3 = arg1 + n;
            long l = arg0[n3] ^ (arg2[arg3 + n] ^ arg4[arg5 + n]);
            arg0[n3] = l;
            n2 = ++n;
        }
    }

    public sprfmb cfr_renamed_1889(sprfmb arg0, int arg1, int[] arg2) {
        int n;
        int n2;
        int n3 = this.cfr_renamed_749();
        if (n3 == 0) {
            return this;
        }
        int n4 = arg0.cfr_renamed_749();
        if (n4 == 0) {
            return arg0;
        }
        sprfmb sprfmb2 = this;
        sprfmb sprfmb3 = arg0;
        if (n3 > n4) {
            sprfmb2 = arg0;
            sprfmb3 = this;
            int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        int n6 = n3 + 63 >>> 6;
        int n7 = n4 + 63 >>> 6;
        int n8 = n3 + n4 + 62 >>> 6;
        if (n6 == 1) {
            long l = sprfmb2.cfr_renamed_119[0];
            if (l == 1L) {
                return sprfmb3;
            }
            long[] lArray = new long[n8];
            sprfmb.cfr_renamed_1890(l, sprfmb3.cfr_renamed_119, n7, lArray, 0);
            return new sprfmb(lArray, 0, n8);
        }
        int n9 = n4 + 7 + 63 >>> 6;
        int[] nArray = new int[16];
        long[] lArray = new long[n9 << 4];
        nArray[1] = n2 = n9;
        System.arraycopy(sprfmb3.cfr_renamed_119, 0, lArray, n2, n7);
        int n10 = n = 2;
        while (n10 < 16) {
            nArray[n] = n2 += n9;
            long[] lArray2 = lArray;
            if ((n & 1) == 0) {
                sprfmb.cfr_renamed_1891(lArray2, n2 >>> 1, lArray, n2, n9, 1);
            } else {
                sprfmb.cfr_renamed_1892(lArray2, n9, lArray, n2 - n9, lArray, n2, n9);
            }
            n10 = ++n;
        }
        long[] lArray3 = new long[lArray.length];
        sprfmb.cfr_renamed_1891(lArray, 0, lArray3, 0, lArray.length, 4);
        long[] lArray4 = sprfmb2.cfr_renamed_119;
        long[] lArray5 = new long[n8 << 3];
        int n11 = 15;
        int n12 = 0;
        int n13 = n12;
        while (n13 < n6) {
            long l = lArray4[n12];
            int n14 = n12;
            long l2 = l;
            while (true) {
                int n15 = (int)l2 & n11;
                int n16 = (int)(l >>>= 4) & n11;
                sprfmb.cfr_renamed_1888(lArray5, n14, lArray, nArray[n15], lArray3, nArray[n16], n9);
                if ((l >>>= 4) == 0L) break;
                n14 += n8;
                l2 = l;
            }
            n13 = ++n12;
        }
        int n17 = n12 = lArray5.length;
        while ((n12 = n17 - n8) != 0) {
            int n18 = n12;
            n17 = n18;
            sprfmb.cfr_renamed_1893(lArray5, n18 - n8, lArray5, n12, n8, 8);
        }
        return new sprfmb(lArray5, 0, n8);
    }

    private static /* synthetic */ long cfr_renamed_1886(int arg0) {
        int n = cfr_renamed_2[arg0 & 0xFF];
        return ((long)cfr_renamed_2[arg0 >>> 8] & 0xFFFFFFFFL) << 32 | (long)n & 0xFFFFFFFFL;
    }

    public boolean equals(Object arg0) {
        int n;
        if (!(arg0 instanceof sprfmb)) {
            return false;
        }
        sprfmb sprfmb2 = (sprfmb)arg0;
        int n2 = this.cfr_renamed_1894();
        if (sprfmb2.cfr_renamed_1894() != n2) {
            return false;
        }
        int n3 = n = 0;
        while (n3 < n2) {
            if (this.cfr_renamed_119[n] != sprfmb2.cfr_renamed_119[n]) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    private static /* synthetic */ long cfr_renamed_1895(int arg0) {
        int n = cfr_renamed_1[arg0 & 0x7F];
        int n2 = cfr_renamed_1[arg0 >>> 7 & 0x7F];
        return ((long)cfr_renamed_1[arg0 >>> 14] & 0xFFFFFFFFL) << 42 | ((long)n2 & 0xFFFFFFFFL) << 21 | (long)n & 0xFFFFFFFFL;
    }

    private /* synthetic */ void cfr_renamed_1896(sprfmb arg0, int arg1, int arg2) {
        int n = arg1 + 63 >>> 6;
        int n2 = arg2 >>> 6;
        int n3 = arg2 & 0x3F;
        if (n3 == 0) {
            sprfmb.cfr_renamed_1897(this.cfr_renamed_119, n2, arg0.cfr_renamed_119, 0, n);
            return;
        }
        long l = sprfmb.cfr_renamed_1893(this.cfr_renamed_119, n2, arg0.cfr_renamed_119, 0, n, n3);
        if (l != 0L) {
            int n4 = n + n2;
            this.cfr_renamed_119[n4] = this.cfr_renamed_119[n4] ^ l;
        }
    }

    private static /* synthetic */ long cfr_renamed_1898(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        int n = 64 - arg5;
        long l = 0L;
        int n2 = arg4;
        while (--n2 >= 0) {
            long l2 = arg2[arg3 + n2];
            int n3 = arg1 + n2;
            arg0[n3] = arg0[n3] ^ (l2 >>> arg5 | l);
            l = l2 << n;
        }
        return l;
    }

    private static /* synthetic */ long cfr_renamed_1899(long arg0) {
        return arg0 & Long.MIN_VALUE | cfr_renamed_112[(int)arg0 & 0x1FF] | cfr_renamed_112[(int)(arg0 >>> 9) & 0x1FF] << 1 | cfr_renamed_112[(int)(arg0 >>> 18) & 0x1FF] << 2 | cfr_renamed_112[(int)(arg0 >>> 27) & 0x1FF] << 3 | cfr_renamed_112[(int)(arg0 >>> 36) & 0x1FF] << 4 | cfr_renamed_112[(int)(arg0 >>> 45) & 0x1FF] << 5 | cfr_renamed_112[(int)(arg0 >>> 54) & 0x1FF] << 6;
    }

    private static /* synthetic */ void cfr_renamed_1900(long[] arg0, int arg1, int arg2, long arg3) {
        int n = arg1 + (arg2 >>> 6);
        int n2 = arg2 & 0x3F;
        if (n2 == 0) {
            int n3 = n;
            arg0[n3] = arg0[n3] ^ arg3;
            return;
        }
        int n4 = n++;
        arg0[n4] = arg0[n4] ^ arg3 << n2;
        if ((arg3 >>>= 64 - n2) != 0L) {
            int n5 = n;
            arg0[n5] = arg0[n5] ^ arg3;
        }
    }

    public boolean cfr_renamed_287() {
        int n;
        long[] lArray = this.cfr_renamed_119;
        if (this.cfr_renamed_119[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < lArray.length) {
            if (lArray[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private static /* synthetic */ void cfr_renamed_1901(long[] arg0, int arg1, int arg2, long arg3, int arg4, int[] arg5) {
        int n = arg2 - arg4;
        int n2 = arg5.length;
        while (--n2 >= 0) {
            sprfmb.cfr_renamed_1900(arg0, arg1, n + arg5[n2], arg3);
        }
        sprfmb.cfr_renamed_1900(arg0, arg1, n, arg3);
    }

    private /* synthetic */ long[] cfr_renamed_1902(int arg0) {
        long[] lArray = new long[arg0];
        System.arraycopy(this.cfr_renamed_119, 0, lArray, 0, Math.min(this.cfr_renamed_119.length, arg0));
        return lArray;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_1903(long[] lArray, int n, int n2, int n3, int[] nArray) {
        void arg3;
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        sprfmb.cfr_renamed_1904(arg0, (int)arg1, (int)v0);
        void var5_5 = v0 - arg3;
        int n4 = nArray.length;
        while (--n4 >= 0) {
            void arg4;
            sprfmb.cfr_renamed_1904(arg0, (int)arg1, (int)(arg4[n4] + var5_5));
        }
        sprfmb.cfr_renamed_1904(arg0, (int)arg1, (int)var5_5);
    }

    private static /* synthetic */ void cfr_renamed_1905(long[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        int n = arg3 >>> 6;
        while (--arg2 > n) {
            long l = arg0[arg1 + arg2];
            if (l == 0L) continue;
            arg0[arg1 + arg2] = 0L;
            sprfmb.cfr_renamed_1901(arg0, arg1, arg2 << 6, l, arg4, arg5);
        }
        int n2 = arg3 & 0x3F;
        long l = arg0[arg1 + n] >>> n2;
        if (l != 0L) {
            long[] lArray = arg0;
            int n3 = arg1 + n;
            lArray[n3] = lArray[n3] ^ l << n2;
            sprfmb.cfr_renamed_1901(arg0, arg1, arg3, l, arg4, arg5);
        }
    }

    public String toString() {
        int n = this.cfr_renamed_1894();
        if (n == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.cfr_renamed_119[--n]));
        while (--n >= 0) {
            String string = Long.toBinaryString(this.cfr_renamed_119[n]);
            int n2 = string.length();
            if (n2 < 64) {
                stringBuffer.append(cfr_renamed_0.substring(n2));
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public void cfr_renamed_1906(int arg0, int[] arg1) {
        long[] lArray = this.cfr_renamed_119;
        int n = sprfmb.cfr_renamed_1907(lArray, 0, lArray.length, arg0, arg1);
        if (n < lArray.length) {
            this.cfr_renamed_119 = new long[n];
            System.arraycopy(lArray, 0, this.cfr_renamed_119, 0, n);
        }
    }

    public sprfmb cfr_renamed_1908() {
        if (this.cfr_renamed_119.length == 0) {
            long[] lArray = new long[1];
            lArray[0] = 1L;
            return new sprfmb(lArray);
        }
        int n = Math.max(1, this.cfr_renamed_1894());
        long[] lArray = this.cfr_renamed_1902(n);
        long[] lArray2 = lArray;
        lArray[0] = lArray[0] ^ 1L;
        return new sprfmb(lArray2);
    }

    public sprfmb(int n) {
        this.cfr_renamed_119 = new long[n];
    }

    private static /* synthetic */ void cfr_renamed_1892(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg6) {
            int n3 = arg5 + n;
            long l = arg0[arg1 + n] ^ arg2[arg3 + n];
            arg4[n3] = l;
            n2 = ++n;
        }
    }

    public int cfr_renamed_1894() {
        sprfmb sprfmb2 = this;
        return sprfmb2.cfr_renamed_1909(sprfmb2.cfr_renamed_119.length);
    }

    public sprfmb cfr_renamed_1910(int arg0, int[] arg1) {
        int n;
        int n2 = this.cfr_renamed_1894();
        if (n2 == 0) {
            return this;
        }
        int n3 = n2 << 1;
        long[] lArray = new long[n3];
        int n4 = n = 0;
        while (n4 < n3) {
            long l = this.cfr_renamed_119[n >>> 1];
            lArray[n++] = sprfmb.cfr_renamed_1887((int)l);
            lArray[n++] = sprfmb.cfr_renamed_1887((int)(l >>> 32));
            n4 = n;
        }
        return new sprfmb(lArray, 0, lArray.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprfmb(long[] lArray, int n, int n2) {
        void arg1;
        void arg0;
        void arg2;
        if (n == 0 && arg2 == ((void)arg0).length) {
            this.cfr_renamed_119 = arg0;
            return;
        }
        this.cfr_renamed_119 = new long[arg2];
        System.arraycopy(arg0, (int)arg1, this.cfr_renamed_119, 0, (int)arg2);
    }

    private static /* synthetic */ long cfr_renamed_1887(int arg0) {
        int n = cfr_renamed_4[arg0 & 0xFF] | cfr_renamed_4[arg0 >>> 8 & 0xFF] << 16;
        return ((long)(cfr_renamed_4[arg0 >>> 16 & 0xFF] | cfr_renamed_4[arg0 >>> 24] << 16) & 0xFFFFFFFFL) << 32 | (long)n & 0xFFFFFFFFL;
    }

    private static /* synthetic */ void cfr_renamed_1911(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        arg1 += arg5 >>> 6;
        if ((arg5 &= 0x3F) == 0) {
            sprfmb.cfr_renamed_1897(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        long[] lArray = arg0;
        long l = sprfmb.cfr_renamed_1898(arg0, arg1 + 1, arg2, arg3, arg4, 64 - arg5);
        int n = arg1;
        lArray[n] = lArray[n] ^ l;
    }

    private static /* synthetic */ void cfr_renamed_1881(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            long l = sprfmb.cfr_renamed_1912(arg0[arg1 + n]);
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    public void cfr_renamed_1913(sprfmb arg0, int arg1) {
        int n = arg0.cfr_renamed_1894();
        if (n == 0) {
            return;
        }
        int n2 = n + arg1;
        if (n2 > this.cfr_renamed_119.length) {
            this.cfr_renamed_119 = this.cfr_renamed_1902(n2);
        }
        sprfmb.cfr_renamed_1897(this.cfr_renamed_119, arg1, arg0.cfr_renamed_119, 0, n);
    }

    private static /* synthetic */ int cfr_renamed_1907(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int n;
        int n2 = arg3 + 63 >>> 6;
        if (arg2 < n2) {
            return arg2;
        }
        int n3 = Math.min(arg2 << 6, (arg3 << 1) - 1);
        int n4 = n = (arg2 << 6) - n3;
        while (n4 >= 64) {
            n4 = n -= 64;
            --arg2;
        }
        int n5 = arg4.length;
        int n6 = arg4[n5 - 1];
        int n7 = n5 > 1 ? arg4[n5 - 2] : 0;
        int n8 = Math.max(arg3, n6 + 64);
        int n9 = n + Math.min(n3 - n8, arg3 - n7) >> 6;
        if (n9 > 1) {
            int n10 = arg2 - n9;
            int n11 = arg2;
            int n12 = n11;
            sprfmb.cfr_renamed_1914(arg0, arg1, n11, n10, arg3, arg4);
            while (n12 > n10) {
                arg0[arg1 + --arg2] = 0L;
                n12 = arg2;
            }
            n3 = n10 << 6;
        }
        if (n3 > n8) {
            sprfmb.cfr_renamed_1905(arg0, arg1, arg2, n8, arg3, arg4);
            n3 = n8;
        }
        if (n3 > arg3) {
            sprfmb.cfr_renamed_1915(arg0, arg1, n3, arg3, arg4);
        }
        return n2;
    }

    private static /* synthetic */ void cfr_renamed_1882(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            long l = sprfmb.cfr_renamed_1878(arg0[arg1 + n]);
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    private static /* synthetic */ long cfr_renamed_1893(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = 64 - arg5;
        long l = 0L;
        int n3 = n = 0;
        while (n3 < arg4) {
            long l2 = arg2[arg3 + n];
            int n4 = arg1 + n;
            arg0[n4] = arg0[n4] ^ (l2 << arg5 | l);
            l = l2 >>> n2;
            n3 = ++n;
        }
        return l;
    }

    public sprfmb cfr_renamed_1916(sprfmb arg0, int arg1, int[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = this.cfr_renamed_749();
        if (n5 == 0) {
            return this;
        }
        int n6 = arg0.cfr_renamed_749();
        if (n6 == 0) {
            return arg0;
        }
        sprfmb sprfmb2 = this;
        sprfmb sprfmb3 = arg0;
        if (n5 > n6) {
            sprfmb2 = arg0;
            sprfmb3 = this;
            int n7 = n5;
            n5 = n6;
            n6 = n7;
        }
        int n8 = n5 + 63 >>> 6;
        int n9 = n6 + 63 >>> 6;
        int n10 = n5 + n6 + 62 >>> 6;
        if (n8 == 1) {
            long l = sprfmb2.cfr_renamed_119[0];
            if (l == 1L) {
                return sprfmb3;
            }
            long[] lArray = new long[n10];
            sprfmb.cfr_renamed_1890(l, sprfmb3.cfr_renamed_119, n9, lArray, 0);
            return sprfmb.cfr_renamed_1917(lArray, 0, n10, arg1, arg2);
        }
        int n11 = 4;
        int n12 = 16;
        int n13 = 64;
        int n14 = 8;
        int n15 = n13 < 64 ? n12 : n12 - 1;
        int n16 = n6 + n15 + 63 >>> 6;
        int n17 = n16 * n14;
        int n18 = n11 * n14;
        int[] nArray = new int[1 << n11];
        nArray[0] = n4 = n8;
        nArray[1] = n4 += n17;
        int n19 = n3 = 2;
        while (n19 < nArray.length) {
            nArray[n3++] = n4 += n10;
            n19 = n3;
        }
        n4 += n10;
        long[] lArray = new long[++n4];
        sprfmb.cfr_renamed_1880(sprfmb2.cfr_renamed_119, 0, lArray, 0, n8, n11);
        int n20 = n8;
        System.arraycopy(sprfmb3.cfr_renamed_119, 0, lArray, n20, n9);
        int n21 = n2 = 1;
        while (n21 < n14) {
            sprfmb.cfr_renamed_1891(lArray, n8, lArray, n20 += n16, n16, n2++);
            n21 = n2;
        }
        n20 = (1 << n11) - 1;
        n2 = 0;
        while (true) {
            n = 0;
            block3: do {
                long l = lArray[n] >>> n2;
                int n22 = 0;
                int n23 = n8;
                long l2 = l;
                while (true) {
                    int n24;
                    if ((n24 = (int)l2 & n20) != 0) {
                        sprfmb.cfr_renamed_1897(lArray, n + nArray[n24], lArray, n23, n16);
                    }
                    if (++n22 == n14) continue block3;
                    n23 += n16;
                    l2 = l >>> n11;
                }
            } while (++n < n8);
            if ((n2 += n18) >= n13) {
                if (n2 >= 64) break;
                n2 = 64 - n11;
                int n25 = n20;
                n20 = n25 & n25 << n13 - n2;
            }
            sprfmb.cfr_renamed_1918(lArray, n8, n17, n14);
        }
        n = nArray.length;
        while (--n > 1) {
            if (((long)n & 1L) == 0L) {
                sprfmb.cfr_renamed_1893(lArray, nArray[n >>> 1], lArray, nArray[n], n10, n12);
                continue;
            }
            sprfmb.cfr_renamed_1919(lArray, nArray[n], nArray[n - 1], nArray[1], n10);
        }
        return sprfmb.cfr_renamed_1917(lArray, nArray[1], n10, arg1, arg2);
    }

    public int cfr_renamed_1909(int arg0) {
        long[] lArray = this.cfr_renamed_119;
        if ((arg0 = Math.min(arg0, lArray.length)) < 1) {
            return 0;
        }
        if (lArray[0] != 0L) {
            long[] lArray2 = lArray;
            while (lArray2[--arg0] == 0L) {
                lArray2 = lArray;
            }
            return arg0 + 1;
        }
        do {
            if (lArray[--arg0] == 0L) continue;
            return arg0 + 1;
        } while (arg0 > 0);
        return 0;
    }

    private static /* synthetic */ long cfr_renamed_1918(long[] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = 64 - arg3;
        long l = 0L;
        int n3 = n = 0;
        while (n3 < arg2) {
            long l2 = arg0[arg1 + n];
            arg0[arg1 + n] = l2 << arg3 | l;
            l = l2 >>> n2;
            n3 = ++n;
        }
        return l;
    }

    private static /* synthetic */ void cfr_renamed_1919(long[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            long[] lArray = arg0;
            long[] lArray2 = arg0;
            long l = lArray[arg1 + n];
            int n3 = arg2 + n;
            lArray2[n3] = lArray2[n3] ^ l;
            int n4 = arg3 + n;
            lArray[n4] = lArray[n4] ^ l;
            n2 = ++n;
        }
    }

    public int hashCode() {
        int n;
        int n2 = this.cfr_renamed_1894();
        int n3 = 1;
        int n4 = n = 0;
        while (n4 < n2) {
            long l = this.cfr_renamed_119[n];
            n3 *= 31;
            n3 ^= (int)l;
            n3 *= 31;
            n3 ^= (int)(l >>> 32);
            n4 = ++n;
        }
        return n3;
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_119.length;
    }

    private static /* synthetic */ boolean cfr_renamed_1920(long[] arg0, int arg1, int arg2) {
        int n = arg2 >>> 6;
        int n2 = arg2 & 0x3F;
        long l = 1L << n2;
        return (arg0[arg1 + n] & l) != 0L;
    }

    static {
        int[] nArray = new int[256];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 4;
        nArray[3] = 5;
        nArray[4] = 16;
        nArray[5] = 17;
        nArray[6] = 20;
        nArray[7] = 21;
        nArray[8] = 64;
        nArray[9] = 65;
        nArray[10] = 68;
        nArray[11] = 69;
        nArray[12] = 80;
        nArray[13] = 81;
        nArray[14] = 84;
        nArray[15] = 85;
        nArray[16] = 256;
        nArray[17] = 257;
        nArray[18] = 260;
        nArray[19] = 261;
        nArray[20] = 272;
        nArray[21] = 273;
        nArray[22] = 276;
        nArray[23] = 277;
        nArray[24] = 320;
        nArray[25] = 321;
        nArray[26] = 324;
        nArray[27] = 325;
        nArray[28] = 336;
        nArray[29] = 337;
        nArray[30] = 340;
        nArray[31] = 341;
        nArray[32] = 1024;
        nArray[33] = 1025;
        nArray[34] = 1028;
        nArray[35] = 1029;
        nArray[36] = 1040;
        nArray[37] = 1041;
        nArray[38] = 1044;
        nArray[39] = 1045;
        nArray[40] = 1088;
        nArray[41] = 1089;
        nArray[42] = 1092;
        nArray[43] = 1093;
        nArray[44] = 1104;
        nArray[45] = 1105;
        nArray[46] = 1108;
        nArray[47] = 1109;
        nArray[48] = 1280;
        nArray[49] = 1281;
        nArray[50] = 1284;
        nArray[51] = 1285;
        nArray[52] = 1296;
        nArray[53] = 1297;
        nArray[54] = 1300;
        nArray[55] = 1301;
        nArray[56] = 1344;
        nArray[57] = 1345;
        nArray[58] = 1348;
        nArray[59] = 1349;
        nArray[60] = 1360;
        nArray[61] = 1361;
        nArray[62] = 1364;
        nArray[63] = 1365;
        nArray[64] = 4096;
        nArray[65] = 4097;
        nArray[66] = 4100;
        nArray[67] = 4101;
        nArray[68] = 4112;
        nArray[69] = 4113;
        nArray[70] = 4116;
        nArray[71] = 4117;
        nArray[72] = 4160;
        nArray[73] = 4161;
        nArray[74] = 4164;
        nArray[75] = 4165;
        nArray[76] = 4176;
        nArray[77] = 4177;
        nArray[78] = 4180;
        nArray[79] = 4181;
        nArray[80] = 4352;
        nArray[81] = 4353;
        nArray[82] = 4356;
        nArray[83] = 4357;
        nArray[84] = 4368;
        nArray[85] = 4369;
        nArray[86] = 4372;
        nArray[87] = 4373;
        nArray[88] = 4416;
        nArray[89] = 4417;
        nArray[90] = 4420;
        nArray[91] = 4421;
        nArray[92] = 4432;
        nArray[93] = 4433;
        nArray[94] = 4436;
        nArray[95] = 4437;
        nArray[96] = 5120;
        nArray[97] = 5121;
        nArray[98] = 5124;
        nArray[99] = 5125;
        nArray[100] = 5136;
        nArray[101] = 5137;
        nArray[102] = 5140;
        nArray[103] = 5141;
        nArray[104] = 5184;
        nArray[105] = 5185;
        nArray[106] = 5188;
        nArray[107] = 5189;
        nArray[108] = 5200;
        nArray[109] = 5201;
        nArray[110] = 5204;
        nArray[111] = 5205;
        nArray[112] = 5376;
        nArray[113] = 5377;
        nArray[114] = 5380;
        nArray[115] = 5381;
        nArray[116] = 5392;
        nArray[117] = 5393;
        nArray[118] = 5396;
        nArray[119] = 5397;
        nArray[120] = 5440;
        nArray[121] = 5441;
        nArray[122] = 5444;
        nArray[123] = 5445;
        nArray[124] = 5456;
        nArray[125] = 5457;
        nArray[126] = 5460;
        nArray[127] = 5461;
        nArray[128] = 16384;
        nArray[129] = 16385;
        nArray[130] = 16388;
        nArray[131] = 16389;
        nArray[132] = 16400;
        nArray[133] = 16401;
        nArray[134] = 16404;
        nArray[135] = 16405;
        nArray[136] = 16448;
        nArray[137] = 16449;
        nArray[138] = 16452;
        nArray[139] = 16453;
        nArray[140] = 16464;
        nArray[141] = 16465;
        nArray[142] = 16468;
        nArray[143] = 16469;
        nArray[144] = 16640;
        nArray[145] = 16641;
        nArray[146] = 16644;
        nArray[147] = 16645;
        nArray[148] = 16656;
        nArray[149] = 16657;
        nArray[150] = 16660;
        nArray[151] = 16661;
        nArray[152] = 16704;
        nArray[153] = 16705;
        nArray[154] = 16708;
        nArray[155] = 16709;
        nArray[156] = 16720;
        nArray[157] = 16721;
        nArray[158] = 16724;
        nArray[159] = 16725;
        nArray[160] = 17408;
        nArray[161] = 17409;
        nArray[162] = 17412;
        nArray[163] = 17413;
        nArray[164] = 17424;
        nArray[165] = 17425;
        nArray[166] = 17428;
        nArray[167] = 17429;
        nArray[168] = 17472;
        nArray[169] = 17473;
        nArray[170] = 17476;
        nArray[171] = 17477;
        nArray[172] = 17488;
        nArray[173] = 17489;
        nArray[174] = 17492;
        nArray[175] = 17493;
        nArray[176] = 17664;
        nArray[177] = 17665;
        nArray[178] = 17668;
        nArray[179] = 17669;
        nArray[180] = 17680;
        nArray[181] = 17681;
        nArray[182] = 17684;
        nArray[183] = 17685;
        nArray[184] = 17728;
        nArray[185] = 17729;
        nArray[186] = 17732;
        nArray[187] = 17733;
        nArray[188] = 17744;
        nArray[189] = 17745;
        nArray[190] = 17748;
        nArray[191] = 17749;
        nArray[192] = 20480;
        nArray[193] = 20481;
        nArray[194] = 20484;
        nArray[195] = 20485;
        nArray[196] = 20496;
        nArray[197] = 20497;
        nArray[198] = 20500;
        nArray[199] = 20501;
        nArray[200] = 20544;
        nArray[201] = 20545;
        nArray[202] = 20548;
        nArray[203] = 20549;
        nArray[204] = 20560;
        nArray[205] = 20561;
        nArray[206] = 20564;
        nArray[207] = 20565;
        nArray[208] = 20736;
        nArray[209] = 20737;
        nArray[210] = 20740;
        nArray[211] = 20741;
        nArray[212] = 20752;
        nArray[213] = 20753;
        nArray[214] = 20756;
        nArray[215] = 20757;
        nArray[216] = 20800;
        nArray[217] = 20801;
        nArray[218] = 20804;
        nArray[219] = 20805;
        nArray[220] = 20816;
        nArray[221] = 20817;
        nArray[222] = 20820;
        nArray[223] = 20821;
        nArray[224] = 21504;
        nArray[225] = 21505;
        nArray[226] = 21508;
        nArray[227] = 21509;
        nArray[228] = 21520;
        nArray[229] = 21521;
        nArray[230] = 21524;
        nArray[231] = 21525;
        nArray[232] = 21568;
        nArray[233] = 21569;
        nArray[234] = 21572;
        nArray[235] = 21573;
        nArray[236] = 21584;
        nArray[237] = 21585;
        nArray[238] = 21588;
        nArray[239] = 21589;
        nArray[240] = 21760;
        nArray[241] = 21761;
        nArray[242] = 21764;
        nArray[243] = 21765;
        nArray[244] = 21776;
        nArray[245] = 21777;
        nArray[246] = 21780;
        nArray[247] = 21781;
        nArray[248] = 21824;
        nArray[249] = 21825;
        nArray[250] = 21828;
        nArray[251] = 21829;
        nArray[252] = 21840;
        nArray[253] = 21841;
        nArray[254] = 21844;
        nArray[255] = 21845;
        cfr_renamed_4 = nArray;
        int[] nArray2 = new int[128];
        nArray2[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = 8;
        nArray2[3] = 9;
        nArray2[4] = 64;
        nArray2[5] = 65;
        nArray2[6] = 72;
        nArray2[7] = 73;
        nArray2[8] = 512;
        nArray2[9] = 513;
        nArray2[10] = 520;
        nArray2[11] = 521;
        nArray2[12] = 576;
        nArray2[13] = 577;
        nArray2[14] = 584;
        nArray2[15] = 585;
        nArray2[16] = 4096;
        nArray2[17] = 4097;
        nArray2[18] = 4104;
        nArray2[19] = 4105;
        nArray2[20] = 4160;
        nArray2[21] = 4161;
        nArray2[22] = 4168;
        nArray2[23] = 4169;
        nArray2[24] = 4608;
        nArray2[25] = 4609;
        nArray2[26] = 4616;
        nArray2[27] = 4617;
        nArray2[28] = 4672;
        nArray2[29] = 4673;
        nArray2[30] = 4680;
        nArray2[31] = 4681;
        nArray2[32] = 32768;
        nArray2[33] = 32769;
        nArray2[34] = 32776;
        nArray2[35] = 32777;
        nArray2[36] = 32832;
        nArray2[37] = 32833;
        nArray2[38] = 32840;
        nArray2[39] = 32841;
        nArray2[40] = 33280;
        nArray2[41] = 33281;
        nArray2[42] = 33288;
        nArray2[43] = 33289;
        nArray2[44] = 33344;
        nArray2[45] = 33345;
        nArray2[46] = 33352;
        nArray2[47] = 33353;
        nArray2[48] = 36864;
        nArray2[49] = 36865;
        nArray2[50] = 36872;
        nArray2[51] = 36873;
        nArray2[52] = 36928;
        nArray2[53] = 36929;
        nArray2[54] = 36936;
        nArray2[55] = 36937;
        nArray2[56] = 37376;
        nArray2[57] = 37377;
        nArray2[58] = 37384;
        nArray2[59] = 37385;
        nArray2[60] = 37440;
        nArray2[61] = 37441;
        nArray2[62] = 37448;
        nArray2[63] = 37449;
        nArray2[64] = 262144;
        nArray2[65] = 262145;
        nArray2[66] = 262152;
        nArray2[67] = 262153;
        nArray2[68] = 262208;
        nArray2[69] = 262209;
        nArray2[70] = 262216;
        nArray2[71] = 262217;
        nArray2[72] = 262656;
        nArray2[73] = 262657;
        nArray2[74] = 262664;
        nArray2[75] = 262665;
        nArray2[76] = 262720;
        nArray2[77] = 262721;
        nArray2[78] = 262728;
        nArray2[79] = 262729;
        nArray2[80] = 266240;
        nArray2[81] = 266241;
        nArray2[82] = 266248;
        nArray2[83] = 266249;
        nArray2[84] = 266304;
        nArray2[85] = 266305;
        nArray2[86] = 266312;
        nArray2[87] = 266313;
        nArray2[88] = 266752;
        nArray2[89] = 266753;
        nArray2[90] = 266760;
        nArray2[91] = 266761;
        nArray2[92] = 266816;
        nArray2[93] = 266817;
        nArray2[94] = 266824;
        nArray2[95] = 266825;
        nArray2[96] = 294912;
        nArray2[97] = 294913;
        nArray2[98] = 294920;
        nArray2[99] = 294921;
        nArray2[100] = 294976;
        nArray2[101] = 294977;
        nArray2[102] = 294984;
        nArray2[103] = 294985;
        nArray2[104] = 295424;
        nArray2[105] = 295425;
        nArray2[106] = 295432;
        nArray2[107] = 295433;
        nArray2[108] = 295488;
        nArray2[109] = 295489;
        nArray2[110] = 295496;
        nArray2[111] = 295497;
        nArray2[112] = 299008;
        nArray2[113] = 299009;
        nArray2[114] = 299016;
        nArray2[115] = 299017;
        nArray2[116] = 299072;
        nArray2[117] = 299073;
        nArray2[118] = 299080;
        nArray2[119] = 299081;
        nArray2[120] = 299520;
        nArray2[121] = 299521;
        nArray2[122] = 299528;
        nArray2[123] = 299529;
        nArray2[124] = 299584;
        nArray2[125] = 299585;
        nArray2[126] = 299592;
        nArray2[127] = 299593;
        cfr_renamed_1 = nArray2;
        int[] nArray3 = new int[256];
        nArray3[0] = 0;
        nArray3[1] = 1;
        nArray3[2] = 16;
        nArray3[3] = 17;
        nArray3[4] = 256;
        nArray3[5] = 257;
        nArray3[6] = 272;
        nArray3[7] = 273;
        nArray3[8] = 4096;
        nArray3[9] = 4097;
        nArray3[10] = 4112;
        nArray3[11] = 4113;
        nArray3[12] = 4352;
        nArray3[13] = 4353;
        nArray3[14] = 4368;
        nArray3[15] = 4369;
        nArray3[16] = 65536;
        nArray3[17] = 65537;
        nArray3[18] = 65552;
        nArray3[19] = 65553;
        nArray3[20] = 65792;
        nArray3[21] = 65793;
        nArray3[22] = 65808;
        nArray3[23] = 65809;
        nArray3[24] = 69632;
        nArray3[25] = 69633;
        nArray3[26] = 69648;
        nArray3[27] = 69649;
        nArray3[28] = 69888;
        nArray3[29] = 69889;
        nArray3[30] = 69904;
        nArray3[31] = 69905;
        nArray3[32] = 0x100000;
        nArray3[33] = 0x100001;
        nArray3[34] = 0x100010;
        nArray3[35] = 0x100011;
        nArray3[36] = 0x100100;
        nArray3[37] = 0x100101;
        nArray3[38] = 0x100110;
        nArray3[39] = 0x100111;
        nArray3[40] = 0x101000;
        nArray3[41] = 0x101001;
        nArray3[42] = 0x101010;
        nArray3[43] = 0x101011;
        nArray3[44] = 0x101100;
        nArray3[45] = 0x101101;
        nArray3[46] = 0x101110;
        nArray3[47] = 0x101111;
        nArray3[48] = 0x110000;
        nArray3[49] = 0x110001;
        nArray3[50] = 0x110010;
        nArray3[51] = 0x110011;
        nArray3[52] = 0x110100;
        nArray3[53] = 0x110101;
        nArray3[54] = 0x110110;
        nArray3[55] = 0x110111;
        nArray3[56] = 0x111000;
        nArray3[57] = 0x111001;
        nArray3[58] = 0x111010;
        nArray3[59] = 0x111011;
        nArray3[60] = 0x111100;
        nArray3[61] = 0x111101;
        nArray3[62] = 0x111110;
        nArray3[63] = 0x111111;
        nArray3[64] = 0x1000000;
        nArray3[65] = 0x1000001;
        nArray3[66] = 0x1000010;
        nArray3[67] = 0x1000011;
        nArray3[68] = 0x1000100;
        nArray3[69] = 0x1000101;
        nArray3[70] = 0x1000110;
        nArray3[71] = 0x1000111;
        nArray3[72] = 0x1001000;
        nArray3[73] = 0x1001001;
        nArray3[74] = 0x1001010;
        nArray3[75] = 0x1001011;
        nArray3[76] = 0x1001100;
        nArray3[77] = 0x1001101;
        nArray3[78] = 0x1001110;
        nArray3[79] = 0x1001111;
        nArray3[80] = 0x1010000;
        nArray3[81] = 0x1010001;
        nArray3[82] = 0x1010010;
        nArray3[83] = 0x1010011;
        nArray3[84] = 0x1010100;
        nArray3[85] = 0x1010101;
        nArray3[86] = 0x1010110;
        nArray3[87] = 0x1010111;
        nArray3[88] = 0x1011000;
        nArray3[89] = 0x1011001;
        nArray3[90] = 0x1011010;
        nArray3[91] = 0x1011011;
        nArray3[92] = 0x1011100;
        nArray3[93] = 0x1011101;
        nArray3[94] = 0x1011110;
        nArray3[95] = 0x1011111;
        nArray3[96] = 0x1100000;
        nArray3[97] = 0x1100001;
        nArray3[98] = 0x1100010;
        nArray3[99] = 0x1100011;
        nArray3[100] = 0x1100100;
        nArray3[101] = 0x1100101;
        nArray3[102] = 0x1100110;
        nArray3[103] = 0x1100111;
        nArray3[104] = 0x1101000;
        nArray3[105] = 0x1101001;
        nArray3[106] = 0x1101010;
        nArray3[107] = 0x1101011;
        nArray3[108] = 0x1101100;
        nArray3[109] = 0x1101101;
        nArray3[110] = 0x1101110;
        nArray3[111] = 0x1101111;
        nArray3[112] = 0x1110000;
        nArray3[113] = 0x1110001;
        nArray3[114] = 0x1110010;
        nArray3[115] = 0x1110011;
        nArray3[116] = 0x1110100;
        nArray3[117] = 0x1110101;
        nArray3[118] = 0x1110110;
        nArray3[119] = 0x1110111;
        nArray3[120] = 0x1111000;
        nArray3[121] = 0x1111001;
        nArray3[122] = 0x1111010;
        nArray3[123] = 0x1111011;
        nArray3[124] = 0x1111100;
        nArray3[125] = 0x1111101;
        nArray3[126] = 0x1111110;
        nArray3[127] = 0x1111111;
        nArray3[128] = 0x10000000;
        nArray3[129] = 0x10000001;
        nArray3[130] = 0x10000010;
        nArray3[131] = 0x10000011;
        nArray3[132] = 0x10000100;
        nArray3[133] = 0x10000101;
        nArray3[134] = 0x10000110;
        nArray3[135] = 0x10000111;
        nArray3[136] = 0x10001000;
        nArray3[137] = 0x10001001;
        nArray3[138] = 0x10001010;
        nArray3[139] = 0x10001011;
        nArray3[140] = 0x10001100;
        nArray3[141] = 0x10001101;
        nArray3[142] = 0x10001110;
        nArray3[143] = 0x10001111;
        nArray3[144] = 0x10010000;
        nArray3[145] = 0x10010001;
        nArray3[146] = 0x10010010;
        nArray3[147] = 0x10010011;
        nArray3[148] = 0x10010100;
        nArray3[149] = 0x10010101;
        nArray3[150] = 0x10010110;
        nArray3[151] = 0x10010111;
        nArray3[152] = 0x10011000;
        nArray3[153] = 0x10011001;
        nArray3[154] = 0x10011010;
        nArray3[155] = 0x10011011;
        nArray3[156] = 0x10011100;
        nArray3[157] = 0x10011101;
        nArray3[158] = 0x10011110;
        nArray3[159] = 0x10011111;
        nArray3[160] = 0x10100000;
        nArray3[161] = 0x10100001;
        nArray3[162] = 0x10100010;
        nArray3[163] = 0x10100011;
        nArray3[164] = 0x10100100;
        nArray3[165] = 0x10100101;
        nArray3[166] = 0x10100110;
        nArray3[167] = 0x10100111;
        nArray3[168] = 0x10101000;
        nArray3[169] = 0x10101001;
        nArray3[170] = 0x10101010;
        nArray3[171] = 0x10101011;
        nArray3[172] = 0x10101100;
        nArray3[173] = 0x10101101;
        nArray3[174] = 0x10101110;
        nArray3[175] = 0x10101111;
        nArray3[176] = 0x10110000;
        nArray3[177] = 0x10110001;
        nArray3[178] = 0x10110010;
        nArray3[179] = 0x10110011;
        nArray3[180] = 0x10110100;
        nArray3[181] = 0x10110101;
        nArray3[182] = 0x10110110;
        nArray3[183] = 0x10110111;
        nArray3[184] = 0x10111000;
        nArray3[185] = 0x10111001;
        nArray3[186] = 0x10111010;
        nArray3[187] = 0x10111011;
        nArray3[188] = 0x10111100;
        nArray3[189] = 0x10111101;
        nArray3[190] = 0x10111110;
        nArray3[191] = 0x10111111;
        nArray3[192] = 0x11000000;
        nArray3[193] = 0x11000001;
        nArray3[194] = 0x11000010;
        nArray3[195] = 0x11000011;
        nArray3[196] = 0x11000100;
        nArray3[197] = 0x11000101;
        nArray3[198] = 0x11000110;
        nArray3[199] = 0x11000111;
        nArray3[200] = 0x11001000;
        nArray3[201] = 0x11001001;
        nArray3[202] = 0x11001010;
        nArray3[203] = 0x11001011;
        nArray3[204] = 0x11001100;
        nArray3[205] = 0x11001101;
        nArray3[206] = 0x11001110;
        nArray3[207] = 0x11001111;
        nArray3[208] = 0x11010000;
        nArray3[209] = 0x11010001;
        nArray3[210] = 0x11010010;
        nArray3[211] = 0x11010011;
        nArray3[212] = 0x11010100;
        nArray3[213] = 0x11010101;
        nArray3[214] = 0x11010110;
        nArray3[215] = 0x11010111;
        nArray3[216] = 0x11011000;
        nArray3[217] = 0x11011001;
        nArray3[218] = 0x11011010;
        nArray3[219] = 0x11011011;
        nArray3[220] = 0x11011100;
        nArray3[221] = 0x11011101;
        nArray3[222] = 0x11011110;
        nArray3[223] = 0x11011111;
        nArray3[224] = 0x11100000;
        nArray3[225] = 0x11100001;
        nArray3[226] = 0x11100010;
        nArray3[227] = 0x11100011;
        nArray3[228] = 0x11100100;
        nArray3[229] = 0x11100101;
        nArray3[230] = 0x11100110;
        nArray3[231] = 0x11100111;
        nArray3[232] = 0x11101000;
        nArray3[233] = 0x11101001;
        nArray3[234] = 0x11101010;
        nArray3[235] = 0x11101011;
        nArray3[236] = 0x11101100;
        nArray3[237] = 0x11101101;
        nArray3[238] = 0x11101110;
        nArray3[239] = 0x11101111;
        nArray3[240] = 0x11110000;
        nArray3[241] = 0x11110001;
        nArray3[242] = 0x11110010;
        nArray3[243] = 0x11110011;
        nArray3[244] = 0x11110100;
        nArray3[245] = 0x11110101;
        nArray3[246] = 0x11110110;
        nArray3[247] = 0x11110111;
        nArray3[248] = 0x11111000;
        nArray3[249] = 0x11111001;
        nArray3[250] = 0x11111010;
        nArray3[251] = 0x11111011;
        nArray3[252] = 0x11111100;
        nArray3[253] = 0x11111101;
        nArray3[254] = 0x11111110;
        nArray3[255] = 0x11111111;
        cfr_renamed_2 = nArray3;
        int[] nArray4 = new int[128];
        nArray4[0] = 0;
        nArray4[1] = 1;
        nArray4[2] = 32;
        nArray4[3] = 33;
        nArray4[4] = 1024;
        nArray4[5] = 1025;
        nArray4[6] = 1056;
        nArray4[7] = 1057;
        nArray4[8] = 32768;
        nArray4[9] = 32769;
        nArray4[10] = 32800;
        nArray4[11] = 32801;
        nArray4[12] = 33792;
        nArray4[13] = 33793;
        nArray4[14] = 33824;
        nArray4[15] = 33825;
        nArray4[16] = 0x100000;
        nArray4[17] = 0x100001;
        nArray4[18] = 0x100020;
        nArray4[19] = 0x100021;
        nArray4[20] = 0x100400;
        nArray4[21] = 0x100401;
        nArray4[22] = 1049632;
        nArray4[23] = 1049633;
        nArray4[24] = 0x108000;
        nArray4[25] = 0x108001;
        nArray4[26] = 1081376;
        nArray4[27] = 1081377;
        nArray4[28] = 1082368;
        nArray4[29] = 1082369;
        nArray4[30] = 1082400;
        nArray4[31] = 1082401;
        nArray4[32] = 0x2000000;
        nArray4[33] = 0x2000001;
        nArray4[34] = 0x2000020;
        nArray4[35] = 0x2000021;
        nArray4[36] = 0x2000400;
        nArray4[37] = 33555457;
        nArray4[38] = 0x2000420;
        nArray4[39] = 33555489;
        nArray4[40] = 0x2008000;
        nArray4[41] = 33587201;
        nArray4[42] = 0x2008020;
        nArray4[43] = 33587233;
        nArray4[44] = 33588224;
        nArray4[45] = 33588225;
        nArray4[46] = 33588256;
        nArray4[47] = 33588257;
        nArray4[48] = 0x2100000;
        nArray4[49] = 0x2100001;
        nArray4[50] = 0x2100020;
        nArray4[51] = 0x2100021;
        nArray4[52] = 34604032;
        nArray4[53] = 34604033;
        nArray4[54] = 34604064;
        nArray4[55] = 34604065;
        nArray4[56] = 34635776;
        nArray4[57] = 34635777;
        nArray4[58] = 34635808;
        nArray4[59] = 34635809;
        nArray4[60] = 34636800;
        nArray4[61] = 34636801;
        nArray4[62] = 34636832;
        nArray4[63] = 34636833;
        nArray4[64] = 0x40000000;
        nArray4[65] = 0x40000001;
        nArray4[66] = 0x40000020;
        nArray4[67] = 1073741857;
        nArray4[68] = 0x40000400;
        nArray4[69] = 0x40000401;
        nArray4[70] = 0x40000420;
        nArray4[71] = 1073742881;
        nArray4[72] = 0x40008000;
        nArray4[73] = 1073774593;
        nArray4[74] = 1073774624;
        nArray4[75] = 1073774625;
        nArray4[76] = 0x40008400;
        nArray4[77] = 1073775617;
        nArray4[78] = 1073775648;
        nArray4[79] = 1073775649;
        nArray4[80] = 0x40100000;
        nArray4[81] = 0x40100001;
        nArray4[82] = 1074790432;
        nArray4[83] = 1074790433;
        nArray4[84] = 0x40100400;
        nArray4[85] = 0x40100401;
        nArray4[86] = 1074791456;
        nArray4[87] = 1074791457;
        nArray4[88] = 1074823168;
        nArray4[89] = 1074823169;
        nArray4[90] = 1074823200;
        nArray4[91] = 1074823201;
        nArray4[92] = 1074824192;
        nArray4[93] = 1074824193;
        nArray4[94] = 1074824224;
        nArray4[95] = 1074824225;
        nArray4[96] = 0x42000000;
        nArray4[97] = 1107296257;
        nArray4[98] = 0x42000020;
        nArray4[99] = 1107296289;
        nArray4[100] = 0x42000400;
        nArray4[101] = 1107297281;
        nArray4[102] = 0x42000420;
        nArray4[103] = 1107297313;
        nArray4[104] = 1107329024;
        nArray4[105] = 1107329025;
        nArray4[106] = 1107329056;
        nArray4[107] = 1107329057;
        nArray4[108] = 1107330048;
        nArray4[109] = 1107330049;
        nArray4[110] = 1107330080;
        nArray4[111] = 1107330081;
        nArray4[112] = 1108344832;
        nArray4[113] = 1108344833;
        nArray4[114] = 1108344864;
        nArray4[115] = 1108344865;
        nArray4[116] = 1108345856;
        nArray4[117] = 1108345857;
        nArray4[118] = 1108345888;
        nArray4[119] = 1108345889;
        nArray4[120] = 1108377600;
        nArray4[121] = 1108377601;
        nArray4[122] = 1108377632;
        nArray4[123] = 1108377633;
        nArray4[124] = 1108378624;
        nArray4[125] = 1108378625;
        nArray4[126] = 1108378656;
        nArray4[127] = 1108378657;
        cfr_renamed_91 = nArray4;
        long[] lArray = new long[512];
        lArray[0] = 0L;
        lArray[1] = 1L;
        lArray[2] = 128L;
        lArray[3] = 129L;
        lArray[4] = 16384L;
        lArray[5] = 16385L;
        lArray[6] = 16512L;
        lArray[7] = 16513L;
        lArray[8] = 0x200000L;
        lArray[9] = 0x200001L;
        lArray[10] = 0x200080L;
        lArray[11] = 2097281L;
        lArray[12] = 0x204000L;
        lArray[13] = 2113537L;
        lArray[14] = 2113664L;
        lArray[15] = 2113665L;
        lArray[16] = 0x10000000L;
        lArray[17] = 0x10000001L;
        lArray[18] = 0x10000080L;
        lArray[19] = 0x10000081L;
        lArray[20] = 0x10004000L;
        lArray[21] = 0x10004001L;
        lArray[22] = 268451968L;
        lArray[23] = 268451969L;
        lArray[24] = 0x10200000L;
        lArray[25] = 0x10200001L;
        lArray[26] = 270532736L;
        lArray[27] = 270532737L;
        lArray[28] = 270548992L;
        lArray[29] = 270548993L;
        lArray[30] = 270549120L;
        lArray[31] = 270549121L;
        lArray[32] = 0x800000000L;
        lArray[33] = 0x800000001L;
        lArray[34] = 0x800000080L;
        lArray[35] = 0x800000081L;
        lArray[36] = 0x800004000L;
        lArray[37] = 34359754753L;
        lArray[38] = 0x800004080L;
        lArray[39] = 34359754881L;
        lArray[40] = 0x800200000L;
        lArray[41] = 34361835521L;
        lArray[42] = 0x800200080L;
        lArray[43] = 34361835649L;
        lArray[44] = 34361851904L;
        lArray[45] = 34361851905L;
        lArray[46] = 34361852032L;
        lArray[47] = 34361852033L;
        lArray[48] = 0x810000000L;
        lArray[49] = 0x810000001L;
        lArray[50] = 0x810000080L;
        lArray[51] = 0x810000081L;
        lArray[52] = 34628190208L;
        lArray[53] = 34628190209L;
        lArray[54] = 34628190336L;
        lArray[55] = 34628190337L;
        lArray[56] = 34630270976L;
        lArray[57] = 34630270977L;
        lArray[58] = 34630271104L;
        lArray[59] = 34630271105L;
        lArray[60] = 34630287360L;
        lArray[61] = 34630287361L;
        lArray[62] = 34630287488L;
        lArray[63] = 34630287489L;
        lArray[64] = 0x40000000000L;
        lArray[65] = 0x40000000001L;
        lArray[66] = 0x40000000080L;
        lArray[67] = 4398046511233L;
        lArray[68] = 0x40000004000L;
        lArray[69] = 0x40000004001L;
        lArray[70] = 0x40000004080L;
        lArray[71] = 4398046527617L;
        lArray[72] = 0x40000200000L;
        lArray[73] = 4398048608257L;
        lArray[74] = 4398048608384L;
        lArray[75] = 4398048608385L;
        lArray[76] = 0x40000204000L;
        lArray[77] = 4398048624641L;
        lArray[78] = 4398048624768L;
        lArray[79] = 4398048624769L;
        lArray[80] = 0x40010000000L;
        lArray[81] = 0x40010000001L;
        lArray[82] = 4398314946688L;
        lArray[83] = 4398314946689L;
        lArray[84] = 0x40010004000L;
        lArray[85] = 0x40010004001L;
        lArray[86] = 4398314963072L;
        lArray[87] = 4398314963073L;
        lArray[88] = 4398317043712L;
        lArray[89] = 4398317043713L;
        lArray[90] = 4398317043840L;
        lArray[91] = 4398317043841L;
        lArray[92] = 4398317060096L;
        lArray[93] = 4398317060097L;
        lArray[94] = 4398317060224L;
        lArray[95] = 4398317060225L;
        lArray[96] = 0x40800000000L;
        lArray[97] = 4432406249473L;
        lArray[98] = 0x40800000080L;
        lArray[99] = 4432406249601L;
        lArray[100] = 0x40800004000L;
        lArray[101] = 4432406265857L;
        lArray[102] = 0x40800004080L;
        lArray[103] = 4432406265985L;
        lArray[104] = 4432408346624L;
        lArray[105] = 4432408346625L;
        lArray[106] = 4432408346752L;
        lArray[107] = 4432408346753L;
        lArray[108] = 4432408363008L;
        lArray[109] = 4432408363009L;
        lArray[110] = 4432408363136L;
        lArray[111] = 4432408363137L;
        lArray[112] = 4432674684928L;
        lArray[113] = 4432674684929L;
        lArray[114] = 4432674685056L;
        lArray[115] = 4432674685057L;
        lArray[116] = 4432674701312L;
        lArray[117] = 4432674701313L;
        lArray[118] = 4432674701440L;
        lArray[119] = 4432674701441L;
        lArray[120] = 4432676782080L;
        lArray[121] = 4432676782081L;
        lArray[122] = 4432676782208L;
        lArray[123] = 4432676782209L;
        lArray[124] = 4432676798464L;
        lArray[125] = 4432676798465L;
        lArray[126] = 4432676798592L;
        lArray[127] = 4432676798593L;
        lArray[128] = 0x2000000000000L;
        lArray[129] = 0x2000000000001L;
        lArray[130] = 0x2000000000080L;
        lArray[131] = 562949953421441L;
        lArray[132] = 0x2000000004000L;
        lArray[133] = 562949953437697L;
        lArray[134] = 562949953437824L;
        lArray[135] = 562949953437825L;
        lArray[136] = 0x2000000200000L;
        lArray[137] = 0x2000000200001L;
        lArray[138] = 0x2000000200080L;
        lArray[139] = 562949955518593L;
        lArray[140] = 0x2000000204000L;
        lArray[141] = 562949955534849L;
        lArray[142] = 562949955534976L;
        lArray[143] = 562949955534977L;
        lArray[144] = 0x2000010000000L;
        lArray[145] = 0x2000010000001L;
        lArray[146] = 562950221856896L;
        lArray[147] = 562950221856897L;
        lArray[148] = 562950221873152L;
        lArray[149] = 562950221873153L;
        lArray[150] = 562950221873280L;
        lArray[151] = 562950221873281L;
        lArray[152] = 0x2000010200000L;
        lArray[153] = 0x2000010200001L;
        lArray[154] = 562950223954048L;
        lArray[155] = 562950223954049L;
        lArray[156] = 562950223970304L;
        lArray[157] = 562950223970305L;
        lArray[158] = 562950223970432L;
        lArray[159] = 562950223970433L;
        lArray[160] = 0x2000800000000L;
        lArray[161] = 562984313159681L;
        lArray[162] = 0x2000800000080L;
        lArray[163] = 562984313159809L;
        lArray[164] = 562984313176064L;
        lArray[165] = 562984313176065L;
        lArray[166] = 562984313176192L;
        lArray[167] = 562984313176193L;
        lArray[168] = 0x2000800200000L;
        lArray[169] = 562984315256833L;
        lArray[170] = 0x2000800200080L;
        lArray[171] = 562984315256961L;
        lArray[172] = 562984315273216L;
        lArray[173] = 562984315273217L;
        lArray[174] = 562984315273344L;
        lArray[175] = 562984315273345L;
        lArray[176] = 562984581595136L;
        lArray[177] = 562984581595137L;
        lArray[178] = 562984581595264L;
        lArray[179] = 562984581595265L;
        lArray[180] = 562984581611520L;
        lArray[181] = 562984581611521L;
        lArray[182] = 562984581611648L;
        lArray[183] = 562984581611649L;
        lArray[184] = 562984583692288L;
        lArray[185] = 562984583692289L;
        lArray[186] = 562984583692416L;
        lArray[187] = 562984583692417L;
        lArray[188] = 562984583708672L;
        lArray[189] = 562984583708673L;
        lArray[190] = 562984583708800L;
        lArray[191] = 562984583708801L;
        lArray[192] = 0x2040000000000L;
        lArray[193] = 567347999932417L;
        lArray[194] = 567347999932544L;
        lArray[195] = 567347999932545L;
        lArray[196] = 0x2040000004000L;
        lArray[197] = 567347999948801L;
        lArray[198] = 567347999948928L;
        lArray[199] = 567347999948929L;
        lArray[200] = 0x2040000200000L;
        lArray[201] = 567348002029569L;
        lArray[202] = 567348002029696L;
        lArray[203] = 567348002029697L;
        lArray[204] = 0x2040000204000L;
        lArray[205] = 567348002045953L;
        lArray[206] = 567348002046080L;
        lArray[207] = 567348002046081L;
        lArray[208] = 567348268367872L;
        lArray[209] = 567348268367873L;
        lArray[210] = 567348268368000L;
        lArray[211] = 567348268368001L;
        lArray[212] = 567348268384256L;
        lArray[213] = 567348268384257L;
        lArray[214] = 567348268384384L;
        lArray[215] = 567348268384385L;
        lArray[216] = 567348270465024L;
        lArray[217] = 567348270465025L;
        lArray[218] = 567348270465152L;
        lArray[219] = 567348270465153L;
        lArray[220] = 567348270481408L;
        lArray[221] = 567348270481409L;
        lArray[222] = 567348270481536L;
        lArray[223] = 567348270481537L;
        lArray[224] = 567382359670784L;
        lArray[225] = 567382359670785L;
        lArray[226] = 567382359670912L;
        lArray[227] = 567382359670913L;
        lArray[228] = 567382359687168L;
        lArray[229] = 567382359687169L;
        lArray[230] = 567382359687296L;
        lArray[231] = 567382359687297L;
        lArray[232] = 567382361767936L;
        lArray[233] = 567382361767937L;
        lArray[234] = 567382361768064L;
        lArray[235] = 567382361768065L;
        lArray[236] = 567382361784320L;
        lArray[237] = 567382361784321L;
        lArray[238] = 567382361784448L;
        lArray[239] = 567382361784449L;
        lArray[240] = 567382628106240L;
        lArray[241] = 567382628106241L;
        lArray[242] = 567382628106368L;
        lArray[243] = 567382628106369L;
        lArray[244] = 567382628122624L;
        lArray[245] = 567382628122625L;
        lArray[246] = 567382628122752L;
        lArray[247] = 567382628122753L;
        lArray[248] = 567382630203392L;
        lArray[249] = 567382630203393L;
        lArray[250] = 567382630203520L;
        lArray[251] = 567382630203521L;
        lArray[252] = 567382630219776L;
        lArray[253] = 567382630219777L;
        lArray[254] = 567382630219904L;
        lArray[255] = 567382630219905L;
        lArray[256] = 0x100000000000000L;
        lArray[257] = 0x100000000000001L;
        lArray[258] = 0x100000000000080L;
        lArray[259] = 0x100000000000081L;
        lArray[260] = 0x100000000004000L;
        lArray[261] = 0x100000000004001L;
        lArray[262] = 72057594037944448L;
        lArray[263] = 72057594037944449L;
        lArray[264] = 0x100000000200000L;
        lArray[265] = 0x100000000200001L;
        lArray[266] = 72057594040025216L;
        lArray[267] = 72057594040025217L;
        lArray[268] = 72057594040041472L;
        lArray[269] = 72057594040041473L;
        lArray[270] = 72057594040041600L;
        lArray[271] = 72057594040041601L;
        lArray[272] = 0x100000010000000L;
        lArray[273] = 0x100000010000001L;
        lArray[274] = 0x100000010000080L;
        lArray[275] = 0x100000010000081L;
        lArray[276] = 0x100000010004000L;
        lArray[277] = 0x100000010004001L;
        lArray[278] = 72057594306379904L;
        lArray[279] = 72057594306379905L;
        lArray[280] = 0x100000010200000L;
        lArray[281] = 0x100000010200001L;
        lArray[282] = 72057594308460672L;
        lArray[283] = 72057594308460673L;
        lArray[284] = 72057594308476928L;
        lArray[285] = 72057594308476929L;
        lArray[286] = 72057594308477056L;
        lArray[287] = 72057594308477057L;
        lArray[288] = 0x100000800000000L;
        lArray[289] = 0x100000800000001L;
        lArray[290] = 0x100000800000080L;
        lArray[291] = 0x100000800000081L;
        lArray[292] = 72057628397682688L;
        lArray[293] = 72057628397682689L;
        lArray[294] = 72057628397682816L;
        lArray[295] = 72057628397682817L;
        lArray[296] = 72057628399763456L;
        lArray[297] = 72057628399763457L;
        lArray[298] = 72057628399763584L;
        lArray[299] = 72057628399763585L;
        lArray[300] = 72057628399779840L;
        lArray[301] = 72057628399779841L;
        lArray[302] = 72057628399779968L;
        lArray[303] = 72057628399779969L;
        lArray[304] = 0x100000810000000L;
        lArray[305] = 0x100000810000001L;
        lArray[306] = 0x100000810000080L;
        lArray[307] = 0x100000810000081L;
        lArray[308] = 72057628666118144L;
        lArray[309] = 72057628666118145L;
        lArray[310] = 72057628666118272L;
        lArray[311] = 72057628666118273L;
        lArray[312] = 72057628668198912L;
        lArray[313] = 72057628668198913L;
        lArray[314] = 72057628668199040L;
        lArray[315] = 72057628668199041L;
        lArray[316] = 72057628668215296L;
        lArray[317] = 72057628668215297L;
        lArray[318] = 72057628668215424L;
        lArray[319] = 72057628668215425L;
        lArray[320] = 0x100040000000000L;
        lArray[321] = 0x100040000000001L;
        lArray[322] = 72061992084439168L;
        lArray[323] = 72061992084439169L;
        lArray[324] = 0x100040000004000L;
        lArray[325] = 0x100040000004001L;
        lArray[326] = 72061992084455552L;
        lArray[327] = 72061992084455553L;
        lArray[328] = 72061992086536192L;
        lArray[329] = 72061992086536193L;
        lArray[330] = 72061992086536320L;
        lArray[331] = 72061992086536321L;
        lArray[332] = 72061992086552576L;
        lArray[333] = 72061992086552577L;
        lArray[334] = 72061992086552704L;
        lArray[335] = 72061992086552705L;
        lArray[336] = 0x100040010000000L;
        lArray[337] = 0x100040010000001L;
        lArray[338] = 72061992352874624L;
        lArray[339] = 72061992352874625L;
        lArray[340] = 0x100040010004000L;
        lArray[341] = 0x100040010004001L;
        lArray[342] = 72061992352891008L;
        lArray[343] = 72061992352891009L;
        lArray[344] = 72061992354971648L;
        lArray[345] = 72061992354971649L;
        lArray[346] = 72061992354971776L;
        lArray[347] = 72061992354971777L;
        lArray[348] = 72061992354988032L;
        lArray[349] = 72061992354988033L;
        lArray[350] = 72061992354988160L;
        lArray[351] = 72061992354988161L;
        lArray[352] = 72062026444177408L;
        lArray[353] = 72062026444177409L;
        lArray[354] = 72062026444177536L;
        lArray[355] = 72062026444177537L;
        lArray[356] = 72062026444193792L;
        lArray[357] = 72062026444193793L;
        lArray[358] = 72062026444193920L;
        lArray[359] = 72062026444193921L;
        lArray[360] = 72062026446274560L;
        lArray[361] = 72062026446274561L;
        lArray[362] = 72062026446274688L;
        lArray[363] = 72062026446274689L;
        lArray[364] = 72062026446290944L;
        lArray[365] = 72062026446290945L;
        lArray[366] = 72062026446291072L;
        lArray[367] = 72062026446291073L;
        lArray[368] = 72062026712612864L;
        lArray[369] = 72062026712612865L;
        lArray[370] = 72062026712612992L;
        lArray[371] = 72062026712612993L;
        lArray[372] = 72062026712629248L;
        lArray[373] = 72062026712629249L;
        lArray[374] = 72062026712629376L;
        lArray[375] = 72062026712629377L;
        lArray[376] = 72062026714710016L;
        lArray[377] = 72062026714710017L;
        lArray[378] = 72062026714710144L;
        lArray[379] = 72062026714710145L;
        lArray[380] = 72062026714726400L;
        lArray[381] = 72062026714726401L;
        lArray[382] = 72062026714726528L;
        lArray[383] = 72062026714726529L;
        lArray[384] = 0x102000000000000L;
        lArray[385] = 0x102000000000001L;
        lArray[386] = 72620543991349376L;
        lArray[387] = 72620543991349377L;
        lArray[388] = 72620543991365632L;
        lArray[389] = 72620543991365633L;
        lArray[390] = 72620543991365760L;
        lArray[391] = 72620543991365761L;
        lArray[392] = 0x102000000200000L;
        lArray[393] = 0x102000000200001L;
        lArray[394] = 72620543993446528L;
        lArray[395] = 72620543993446529L;
        lArray[396] = 72620543993462784L;
        lArray[397] = 72620543993462785L;
        lArray[398] = 72620543993462912L;
        lArray[399] = 72620543993462913L;
        lArray[400] = 0x102000010000000L;
        lArray[401] = 0x102000010000001L;
        lArray[402] = 72620544259784832L;
        lArray[403] = 72620544259784833L;
        lArray[404] = 72620544259801088L;
        lArray[405] = 72620544259801089L;
        lArray[406] = 72620544259801216L;
        lArray[407] = 72620544259801217L;
        lArray[408] = 0x102000010200000L;
        lArray[409] = 0x102000010200001L;
        lArray[410] = 72620544261881984L;
        lArray[411] = 72620544261881985L;
        lArray[412] = 72620544261898240L;
        lArray[413] = 72620544261898241L;
        lArray[414] = 72620544261898368L;
        lArray[415] = 72620544261898369L;
        lArray[416] = 72620578351087616L;
        lArray[417] = 72620578351087617L;
        lArray[418] = 72620578351087744L;
        lArray[419] = 72620578351087745L;
        lArray[420] = 72620578351104000L;
        lArray[421] = 72620578351104001L;
        lArray[422] = 72620578351104128L;
        lArray[423] = 72620578351104129L;
        lArray[424] = 72620578353184768L;
        lArray[425] = 72620578353184769L;
        lArray[426] = 72620578353184896L;
        lArray[427] = 72620578353184897L;
        lArray[428] = 72620578353201152L;
        lArray[429] = 72620578353201153L;
        lArray[430] = 72620578353201280L;
        lArray[431] = 72620578353201281L;
        lArray[432] = 72620578619523072L;
        lArray[433] = 72620578619523073L;
        lArray[434] = 72620578619523200L;
        lArray[435] = 72620578619523201L;
        lArray[436] = 72620578619539456L;
        lArray[437] = 72620578619539457L;
        lArray[438] = 72620578619539584L;
        lArray[439] = 72620578619539585L;
        lArray[440] = 72620578621620224L;
        lArray[441] = 72620578621620225L;
        lArray[442] = 72620578621620352L;
        lArray[443] = 72620578621620353L;
        lArray[444] = 72620578621636608L;
        lArray[445] = 72620578621636609L;
        lArray[446] = 72620578621636736L;
        lArray[447] = 72620578621636737L;
        lArray[448] = 72624942037860352L;
        lArray[449] = 72624942037860353L;
        lArray[450] = 72624942037860480L;
        lArray[451] = 72624942037860481L;
        lArray[452] = 72624942037876736L;
        lArray[453] = 72624942037876737L;
        lArray[454] = 72624942037876864L;
        lArray[455] = 72624942037876865L;
        lArray[456] = 72624942039957504L;
        lArray[457] = 72624942039957505L;
        lArray[458] = 72624942039957632L;
        lArray[459] = 72624942039957633L;
        lArray[460] = 72624942039973888L;
        lArray[461] = 72624942039973889L;
        lArray[462] = 72624942039974016L;
        lArray[463] = 72624942039974017L;
        lArray[464] = 72624942306295808L;
        lArray[465] = 72624942306295809L;
        lArray[466] = 72624942306295936L;
        lArray[467] = 72624942306295937L;
        lArray[468] = 72624942306312192L;
        lArray[469] = 72624942306312193L;
        lArray[470] = 72624942306312320L;
        lArray[471] = 72624942306312321L;
        lArray[472] = 72624942308392960L;
        lArray[473] = 72624942308392961L;
        lArray[474] = 72624942308393088L;
        lArray[475] = 72624942308393089L;
        lArray[476] = 72624942308409344L;
        lArray[477] = 72624942308409345L;
        lArray[478] = 72624942308409472L;
        lArray[479] = 72624942308409473L;
        lArray[480] = 72624976397598720L;
        lArray[481] = 72624976397598721L;
        lArray[482] = 72624976397598848L;
        lArray[483] = 72624976397598849L;
        lArray[484] = 72624976397615104L;
        lArray[485] = 72624976397615105L;
        lArray[486] = 72624976397615232L;
        lArray[487] = 72624976397615233L;
        lArray[488] = 72624976399695872L;
        lArray[489] = 72624976399695873L;
        lArray[490] = 72624976399696000L;
        lArray[491] = 72624976399696001L;
        lArray[492] = 72624976399712256L;
        lArray[493] = 72624976399712257L;
        lArray[494] = 72624976399712384L;
        lArray[495] = 72624976399712385L;
        lArray[496] = 72624976666034176L;
        lArray[497] = 72624976666034177L;
        lArray[498] = 72624976666034304L;
        lArray[499] = 72624976666034305L;
        lArray[500] = 72624976666050560L;
        lArray[501] = 72624976666050561L;
        lArray[502] = 72624976666050688L;
        lArray[503] = 72624976666050689L;
        lArray[504] = 72624976668131328L;
        lArray[505] = 72624976668131329L;
        lArray[506] = 72624976668131456L;
        lArray[507] = 72624976668131457L;
        lArray[508] = 72624976668147712L;
        lArray[509] = 72624976668147713L;
        lArray[510] = 72624976668147840L;
        lArray[511] = 72624976668147841L;
        cfr_renamed_112 = lArray;
        byte[] byArray = new byte[256];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 2;
        byArray[4] = 3;
        byArray[5] = 3;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 4;
        byArray[9] = 4;
        byArray[10] = 4;
        byArray[11] = 4;
        byArray[12] = 4;
        byArray[13] = 4;
        byArray[14] = 4;
        byArray[15] = 4;
        byArray[16] = 5;
        byArray[17] = 5;
        byArray[18] = 5;
        byArray[19] = 5;
        byArray[20] = 5;
        byArray[21] = 5;
        byArray[22] = 5;
        byArray[23] = 5;
        byArray[24] = 5;
        byArray[25] = 5;
        byArray[26] = 5;
        byArray[27] = 5;
        byArray[28] = 5;
        byArray[29] = 5;
        byArray[30] = 5;
        byArray[31] = 5;
        byArray[32] = 6;
        byArray[33] = 6;
        byArray[34] = 6;
        byArray[35] = 6;
        byArray[36] = 6;
        byArray[37] = 6;
        byArray[38] = 6;
        byArray[39] = 6;
        byArray[40] = 6;
        byArray[41] = 6;
        byArray[42] = 6;
        byArray[43] = 6;
        byArray[44] = 6;
        byArray[45] = 6;
        byArray[46] = 6;
        byArray[47] = 6;
        byArray[48] = 6;
        byArray[49] = 6;
        byArray[50] = 6;
        byArray[51] = 6;
        byArray[52] = 6;
        byArray[53] = 6;
        byArray[54] = 6;
        byArray[55] = 6;
        byArray[56] = 6;
        byArray[57] = 6;
        byArray[58] = 6;
        byArray[59] = 6;
        byArray[60] = 6;
        byArray[61] = 6;
        byArray[62] = 6;
        byArray[63] = 6;
        byArray[64] = 7;
        byArray[65] = 7;
        byArray[66] = 7;
        byArray[67] = 7;
        byArray[68] = 7;
        byArray[69] = 7;
        byArray[70] = 7;
        byArray[71] = 7;
        byArray[72] = 7;
        byArray[73] = 7;
        byArray[74] = 7;
        byArray[75] = 7;
        byArray[76] = 7;
        byArray[77] = 7;
        byArray[78] = 7;
        byArray[79] = 7;
        byArray[80] = 7;
        byArray[81] = 7;
        byArray[82] = 7;
        byArray[83] = 7;
        byArray[84] = 7;
        byArray[85] = 7;
        byArray[86] = 7;
        byArray[87] = 7;
        byArray[88] = 7;
        byArray[89] = 7;
        byArray[90] = 7;
        byArray[91] = 7;
        byArray[92] = 7;
        byArray[93] = 7;
        byArray[94] = 7;
        byArray[95] = 7;
        byArray[96] = 7;
        byArray[97] = 7;
        byArray[98] = 7;
        byArray[99] = 7;
        byArray[100] = 7;
        byArray[101] = 7;
        byArray[102] = 7;
        byArray[103] = 7;
        byArray[104] = 7;
        byArray[105] = 7;
        byArray[106] = 7;
        byArray[107] = 7;
        byArray[108] = 7;
        byArray[109] = 7;
        byArray[110] = 7;
        byArray[111] = 7;
        byArray[112] = 7;
        byArray[113] = 7;
        byArray[114] = 7;
        byArray[115] = 7;
        byArray[116] = 7;
        byArray[117] = 7;
        byArray[118] = 7;
        byArray[119] = 7;
        byArray[120] = 7;
        byArray[121] = 7;
        byArray[122] = 7;
        byArray[123] = 7;
        byArray[124] = 7;
        byArray[125] = 7;
        byArray[126] = 7;
        byArray[127] = 7;
        byArray[128] = 8;
        byArray[129] = 8;
        byArray[130] = 8;
        byArray[131] = 8;
        byArray[132] = 8;
        byArray[133] = 8;
        byArray[134] = 8;
        byArray[135] = 8;
        byArray[136] = 8;
        byArray[137] = 8;
        byArray[138] = 8;
        byArray[139] = 8;
        byArray[140] = 8;
        byArray[141] = 8;
        byArray[142] = 8;
        byArray[143] = 8;
        byArray[144] = 8;
        byArray[145] = 8;
        byArray[146] = 8;
        byArray[147] = 8;
        byArray[148] = 8;
        byArray[149] = 8;
        byArray[150] = 8;
        byArray[151] = 8;
        byArray[152] = 8;
        byArray[153] = 8;
        byArray[154] = 8;
        byArray[155] = 8;
        byArray[156] = 8;
        byArray[157] = 8;
        byArray[158] = 8;
        byArray[159] = 8;
        byArray[160] = 8;
        byArray[161] = 8;
        byArray[162] = 8;
        byArray[163] = 8;
        byArray[164] = 8;
        byArray[165] = 8;
        byArray[166] = 8;
        byArray[167] = 8;
        byArray[168] = 8;
        byArray[169] = 8;
        byArray[170] = 8;
        byArray[171] = 8;
        byArray[172] = 8;
        byArray[173] = 8;
        byArray[174] = 8;
        byArray[175] = 8;
        byArray[176] = 8;
        byArray[177] = 8;
        byArray[178] = 8;
        byArray[179] = 8;
        byArray[180] = 8;
        byArray[181] = 8;
        byArray[182] = 8;
        byArray[183] = 8;
        byArray[184] = 8;
        byArray[185] = 8;
        byArray[186] = 8;
        byArray[187] = 8;
        byArray[188] = 8;
        byArray[189] = 8;
        byArray[190] = 8;
        byArray[191] = 8;
        byArray[192] = 8;
        byArray[193] = 8;
        byArray[194] = 8;
        byArray[195] = 8;
        byArray[196] = 8;
        byArray[197] = 8;
        byArray[198] = 8;
        byArray[199] = 8;
        byArray[200] = 8;
        byArray[201] = 8;
        byArray[202] = 8;
        byArray[203] = 8;
        byArray[204] = 8;
        byArray[205] = 8;
        byArray[206] = 8;
        byArray[207] = 8;
        byArray[208] = 8;
        byArray[209] = 8;
        byArray[210] = 8;
        byArray[211] = 8;
        byArray[212] = 8;
        byArray[213] = 8;
        byArray[214] = 8;
        byArray[215] = 8;
        byArray[216] = 8;
        byArray[217] = 8;
        byArray[218] = 8;
        byArray[219] = 8;
        byArray[220] = 8;
        byArray[221] = 8;
        byArray[222] = 8;
        byArray[223] = 8;
        byArray[224] = 8;
        byArray[225] = 8;
        byArray[226] = 8;
        byArray[227] = 8;
        byArray[228] = 8;
        byArray[229] = 8;
        byArray[230] = 8;
        byArray[231] = 8;
        byArray[232] = 8;
        byArray[233] = 8;
        byArray[234] = 8;
        byArray[235] = 8;
        byArray[236] = 8;
        byArray[237] = 8;
        byArray[238] = 8;
        byArray[239] = 8;
        byArray[240] = 8;
        byArray[241] = 8;
        byArray[242] = 8;
        byArray[243] = 8;
        byArray[244] = 8;
        byArray[245] = 8;
        byArray[246] = 8;
        byArray[247] = 8;
        byArray[248] = 8;
        byArray[249] = 8;
        byArray[250] = 8;
        byArray[251] = 8;
        byArray[252] = 8;
        byArray[253] = 8;
        byArray[254] = 8;
        byArray[255] = 8;
        cfr_renamed_3 = byArray;
    }

    private static /* synthetic */ void cfr_renamed_1904(long[] arg0, int arg1, int arg2) {
        int n = arg2 >>> 6;
        int n2 = arg2 & 0x3F;
        long l = 1L << n2;
        int n3 = arg1 + n;
        arg0[n3] = arg0[n3] ^ l;
    }

    private static /* synthetic */ void cfr_renamed_1915(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        while (--arg2 >= arg3) {
            if (!sprfmb.cfr_renamed_1920(arg0, arg1, arg2)) continue;
            sprfmb.cfr_renamed_1903(arg0, arg1, arg2, arg3, arg4);
        }
    }

    private static /* synthetic */ int cfr_renamed_1921(long arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = (int)(arg0 >>> 32);
        if (n5 == 0) {
            n5 = (int)arg0;
            n4 = 0;
            n3 = n5;
        } else {
            n4 = 32;
            n3 = n5;
        }
        int n6 = n3 >>> 16;
        if (n6 == 0) {
            n6 = n5 >>> 8;
            n2 = n6 == 0 ? cfr_renamed_3[n5] : 8 + cfr_renamed_3[n6];
            n = n4;
        } else {
            int n7 = n6 >>> 8;
            n2 = n7 == 0 ? 16 + cfr_renamed_3[n6] : 24 + cfr_renamed_3[n7];
            n = n4;
        }
        return n + n2;
    }

    private static /* synthetic */ sprfmb cfr_renamed_1917(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int n = sprfmb.cfr_renamed_1907(arg0, arg1, arg2, arg3, arg4);
        return new sprfmb(arg0, arg1, n);
    }

    public BigInteger cfr_renamed_1779() {
        int n;
        int n2;
        int n3 = this.cfr_renamed_1894();
        if (n3 == 0) {
            return sprpb.cfr_renamed_1;
        }
        long l = this.cfr_renamed_119[n3 - 1];
        byte[] byArray = new byte[8];
        int n4 = 0;
        boolean bl = false;
        int n5 = n2 = 7;
        while (n5 >= 0) {
            byte by = (byte)(l >>> 8 * n2);
            if (bl || by != 0) {
                bl = true;
                byArray[n4++] = by;
            }
            n5 = --n2;
        }
        n2 = 8 * (n3 - 1) + n4;
        byte[] byArray2 = new byte[n2];
        int n6 = n = 0;
        while (n6 < n4) {
            int n7 = n++;
            byArray2[n7] = byArray[n7];
            n6 = n;
        }
        int n8 = n = n3 - 2;
        while (n8 >= 0) {
            int n9;
            long l2 = this.cfr_renamed_119[n];
            int n10 = n9 = 7;
            while (n10 >= 0) {
                int n11 = n4++;
                byte by = (byte)(l2 >>> 8 * n9);
                byArray2[n11] = by;
                n10 = --n9;
            }
            n8 = --n;
        }
        return new BigInteger(1, byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprfmb(BigInteger bigInteger) {
        int n;
        int n2;
        void arg0;
        if (bigInteger == null || arg0.signum() < 0) {
            throw new IllegalArgumentException(sprzxk.cfr_renamed_9("B[]TG\\O\u0015m\u0007F\u0015M\\NYO\u0015]TG@N"));
        }
        if (arg0.signum() == 0) {
            long[] lArray = new long[1];
            lArray[0] = 0L;
            this.cfr_renamed_119 = lArray;
            return;
        }
        byte[] byArray = arg0.toByteArray();
        int n3 = byArray.length;
        int n4 = 0;
        if (byArray[0] == 0) {
            n4 = 1;
            --n3;
        }
        int n5 = n2 = (n3 + 7) / 8;
        this.cfr_renamed_119 = new long[n5];
        int n6 = n5 - 1;
        int n7 = n3 % 8 + n4;
        long l = 0L;
        int n8 = n4;
        if (n4 < n7) {
            int n9 = n8;
            while (n9 < n7) {
                l <<= 8;
                n = byArray[n8] & 0xFF;
                l |= (long)n;
                n9 = ++n8;
            }
            this.cfr_renamed_119[n6--] = l;
        }
        int n10 = n6;
        while (n10 >= 0) {
            l = 0L;
            int n11 = n = 0;
            while (n11 < 8) {
                l <<= 8;
                int n12 = byArray[n8] & 0xFF;
                ++n8;
                int n13 = n12;
                l |= (long)n13;
                n11 = ++n;
            }
            this.cfr_renamed_119[n6--] = l;
            n10 = n6;
        }
    }

    public sprfmb cfr_renamed_1922(int arg0, int[] arg1) {
        int n;
        int n2 = this.cfr_renamed_1894();
        if (n2 == 0) {
            return this;
        }
        int n3 = n2 << 1;
        long[] lArray = new long[n3];
        int n4 = n = 0;
        while (n4 < n3) {
            long l = this.cfr_renamed_119[n >>> 1];
            lArray[n++] = sprfmb.cfr_renamed_1887((int)l);
            lArray[n++] = sprfmb.cfr_renamed_1887((int)(l >>> 32));
            n4 = n;
        }
        return new sprfmb(lArray, 0, sprfmb.cfr_renamed_1907(lArray, 0, lArray.length, arg0, arg1));
    }

    public sprfmb(long[] lArray) {
        this.cfr_renamed_119 = lArray;
    }

    private static /* synthetic */ long cfr_renamed_1912(long arg0) {
        return arg0 & Long.MIN_VALUE | sprfmb.cfr_renamed_1895((int)arg0 & 0x1FFFFF) | sprfmb.cfr_renamed_1895((int)(arg0 >>> 21) & 0x1FFFFF) << 1 | sprfmb.cfr_renamed_1895((int)(arg0 >>> 42) & 0x1FFFFF) << 2;
    }

    public sprfmb cfr_renamed_1923(sprfmb arg0, int arg1, int[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = this.cfr_renamed_749();
        if (n7 == 0) {
            return this;
        }
        int n8 = arg0.cfr_renamed_749();
        if (n8 == 0) {
            return arg0;
        }
        sprfmb sprfmb2 = this;
        sprfmb sprfmb3 = arg0;
        if (n7 > n8) {
            sprfmb2 = arg0;
            sprfmb3 = this;
            int n9 = n7;
            n7 = n8;
            n8 = n9;
        }
        int n10 = n7 + 63 >>> 6;
        int n11 = n8 + 63 >>> 6;
        int n12 = n7 + n8 + 62 >>> 6;
        if (n10 == 1) {
            long l = sprfmb2.cfr_renamed_119[0];
            if (l == 1L) {
                return sprfmb3;
            }
            long[] lArray = new long[n12];
            sprfmb.cfr_renamed_1890(l, sprfmb3.cfr_renamed_119, n11, lArray, 0);
            return sprfmb.cfr_renamed_1917(lArray, 0, n12, arg1, arg2);
        }
        int n13 = n8 + 7 + 63 >>> 6;
        int[] nArray = new int[16];
        long[] lArray = new long[n13 << 4];
        nArray[1] = n6 = n13;
        System.arraycopy(sprfmb3.cfr_renamed_119, 0, lArray, n6, n11);
        int n14 = n5 = 2;
        while (n14 < 16) {
            nArray[n5] = n6 += n13;
            long[] lArray2 = lArray;
            if ((n5 & 1) == 0) {
                sprfmb.cfr_renamed_1891(lArray2, n6 >>> 1, lArray, n6, n13, 1);
            } else {
                sprfmb.cfr_renamed_1892(lArray2, n13, lArray, n6 - n13, lArray, n6, n13);
            }
            n14 = ++n5;
        }
        long[] lArray3 = new long[lArray.length];
        sprfmb.cfr_renamed_1891(lArray, 0, lArray3, 0, lArray.length, 4);
        long[] lArray4 = sprfmb2.cfr_renamed_119;
        long[] lArray5 = new long[n12];
        int n15 = 15;
        int n16 = 56;
        int n17 = n16;
        while (n17 >= 0) {
            int n18 = n4 = 1;
            while (n18 < n10) {
                n3 = (int)(lArray4[n4] >>> n16);
                n2 = n3 & n15;
                n = n3 >>> 4 & n15;
                int n19 = n4 - 1;
                sprfmb.cfr_renamed_1888(lArray5, n19, lArray, nArray[n2], lArray3, nArray[n], n13);
                n18 = n4 += 2;
            }
            sprfmb.cfr_renamed_1918(lArray5, 0, n12, 8);
            n17 = n16 -= 8;
        }
        int n20 = n16 = 56;
        while (n20 >= 0) {
            int n21 = n4 = 0;
            while (n21 < n10) {
                n3 = (int)(lArray4[n4] >>> n16);
                n2 = n3 & n15;
                n = n3 >>> 4 & n15;
                int n22 = n4;
                sprfmb.cfr_renamed_1888(lArray5, n22, lArray, nArray[n2], lArray3, nArray[n], n13);
                n21 = n4 += 2;
            }
            if (n16 > 0) {
                sprfmb.cfr_renamed_1918(lArray5, 0, n12, 8);
            }
            n20 = n16 -= 8;
        }
        return sprfmb.cfr_renamed_1917(lArray5, 0, n12, arg1, arg2);
    }

    public sprfmb cfr_renamed_1924(int arg0, int[] arg1) {
        long[] lArray = sprzra.cfr_renamed_520(this.cfr_renamed_119);
        int n = sprfmb.cfr_renamed_1907(lArray, 0, lArray.length, arg0, arg1);
        return new sprfmb(lArray, 0, n);
    }

    private static /* synthetic */ void cfr_renamed_1884(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            long l = sprfmb.cfr_renamed_1885(arg0[arg1 + n], arg5);
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    public Object clone() {
        return new sprfmb(sprzra.cfr_renamed_520(this.cfr_renamed_119));
    }

    public int cfr_renamed_749() {
        long l;
        int n = this.cfr_renamed_119.length;
        do {
            if (n != 0) continue;
            return 0;
        } while ((l = this.cfr_renamed_119[--n]) == 0L);
        return (n << 6) + sprfmb.cfr_renamed_1921(l);
    }

    private static /* synthetic */ void cfr_renamed_1925(long[] arg0, int arg1, int arg2, int[] arg3) {
        int n = arg1 << 1;
        while (--arg1 >= 0) {
            long[] lArray = arg0;
            long l = lArray[arg1];
            int n2 = --n;
            arg0[n2] = sprfmb.cfr_renamed_1887((int)(l >>> 32));
            lArray[--n] = sprfmb.cfr_renamed_1887((int)l);
        }
    }

    private static /* synthetic */ long cfr_renamed_1879(int arg0) {
        int n = cfr_renamed_91[arg0 & 0x7F];
        return ((long)cfr_renamed_91[arg0 >>> 7] & 0xFFFFFFFFL) << 35 | (long)n & 0xFFFFFFFFL;
    }

    private static /* synthetic */ long cfr_renamed_1891(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = 64 - arg5;
        long l = 0L;
        int n3 = n = 0;
        while (n3 < arg4) {
            long l2 = arg0[arg1 + n];
            arg2[arg3 + n] = l2 << arg5 | l;
            l = l2 >>> n2;
            n3 = ++n;
        }
        return l;
    }

    private static /* synthetic */ void cfr_renamed_1890(long arg0, long[] arg1, int arg2, long[] arg3, int arg4) {
        if ((arg0 & 1L) != 0L) {
            sprfmb.cfr_renamed_1897(arg3, arg4, arg1, 0, arg2);
        }
        int n = 1;
        long l = arg0;
        while ((arg0 = l >>> 1) != 0L) {
            long l2;
            if ((arg0 & 1L) != 0L && (l2 = sprfmb.cfr_renamed_1893(arg3, arg4, arg1, 0, arg2, n)) != 0L) {
                int n2 = arg4 + arg2;
                arg3[n2] = arg3[n2] ^ l2;
            }
            ++n;
            l = arg0;
        }
    }

    public sprfmb cfr_renamed_1926(sprfmb arg0, int arg1, int[] arg2) {
        int n;
        int n2;
        int n3 = this.cfr_renamed_749();
        if (n3 == 0) {
            return this;
        }
        int n4 = arg0.cfr_renamed_749();
        if (n4 == 0) {
            return arg0;
        }
        sprfmb sprfmb2 = this;
        sprfmb sprfmb3 = arg0;
        if (n3 > n4) {
            sprfmb2 = arg0;
            sprfmb3 = this;
            int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        int n6 = n3 + 63 >>> 6;
        int n7 = n4 + 63 >>> 6;
        int n8 = n3 + n4 + 62 >>> 6;
        if (n6 == 1) {
            long l = sprfmb2.cfr_renamed_119[0];
            if (l == 1L) {
                return sprfmb3;
            }
            long[] lArray = new long[n8];
            sprfmb.cfr_renamed_1890(l, sprfmb3.cfr_renamed_119, n7, lArray, 0);
            return sprfmb.cfr_renamed_1917(lArray, 0, n8, arg1, arg2);
        }
        int n9 = n4 + 7 + 63 >>> 6;
        int[] nArray = new int[16];
        long[] lArray = new long[n9 << 4];
        nArray[1] = n2 = n9;
        System.arraycopy(sprfmb3.cfr_renamed_119, 0, lArray, n2, n7);
        int n10 = n = 2;
        while (n10 < 16) {
            nArray[n] = n2 += n9;
            long[] lArray2 = lArray;
            if ((n & 1) == 0) {
                sprfmb.cfr_renamed_1891(lArray2, n2 >>> 1, lArray, n2, n9, 1);
            } else {
                sprfmb.cfr_renamed_1892(lArray2, n9, lArray, n2 - n9, lArray, n2, n9);
            }
            n10 = ++n;
        }
        long[] lArray3 = new long[lArray.length];
        sprfmb.cfr_renamed_1891(lArray, 0, lArray3, 0, lArray.length, 4);
        long[] lArray4 = sprfmb2.cfr_renamed_119;
        long[] lArray5 = new long[n8 << 3];
        int n11 = 15;
        int n12 = 0;
        int n13 = n12;
        while (n13 < n6) {
            long l = lArray4[n12];
            int n14 = n12;
            long l2 = l;
            while (true) {
                int n15 = (int)l2 & n11;
                int n16 = (int)(l >>>= 4) & n11;
                sprfmb.cfr_renamed_1888(lArray5, n14, lArray, nArray[n15], lArray3, nArray[n16], n9);
                if ((l >>>= 4) == 0L) break;
                n14 += n8;
                l2 = l;
            }
            n13 = ++n12;
        }
        int n17 = n12 = lArray5.length;
        while ((n12 = n17 - n8) != 0) {
            int n18 = n12;
            n17 = n18;
            sprfmb.cfr_renamed_1893(lArray5, n18 - n8, lArray5, n12, n8, 8);
        }
        return sprfmb.cfr_renamed_1917(lArray5, 0, n8, arg1, arg2);
    }

    private static /* synthetic */ void cfr_renamed_1883(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            long l = sprfmb.cfr_renamed_1899(arg0[arg1 + n]);
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    private static /* synthetic */ void cfr_renamed_1914(long[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        int n = (arg3 << 6) - arg4;
        int n2 = arg5.length;
        while (--n2 >= 0) {
            sprfmb.cfr_renamed_1911(arg0, arg1, arg0, arg1 + arg3, arg2 - arg3, n + arg5[n2]);
        }
        int n3 = arg1;
        sprfmb.cfr_renamed_1911(arg0, n3, arg0, n3 + arg3, arg2 - arg3, n);
    }

    public sprfmb cfr_renamed_1927(int arg0, int[] arg1) {
        int n;
        int n2 = this.cfr_renamed_749();
        if (n2 == 0) {
            throw new IllegalStateException();
        }
        if (n2 == 1) {
            return this;
        }
        sprfmb sprfmb2 = (sprfmb)this.clone();
        int n3 = arg0 + 63 >>> 6;
        sprfmb sprfmb3 = new sprfmb(n3);
        int n4 = arg0;
        sprfmb.cfr_renamed_1903(sprfmb3.cfr_renamed_119, 0, n4, n4, arg1);
        sprfmb sprfmb4 = new sprfmb(n3);
        sprfmb4.cfr_renamed_119[0] = 1L;
        sprfmb sprfmb5 = new sprfmb(n3);
        int[] nArray = new int[2];
        nArray[0] = n2;
        nArray[1] = arg0 + 1;
        int[] nArray2 = nArray;
        sprfmb[] sprfmbArray = new sprfmb[2];
        sprfmbArray[0] = sprfmb2;
        sprfmbArray[1] = sprfmb3;
        sprfmb[] sprfmbArray2 = sprfmbArray;
        int[] nArray3 = new int[2];
        nArray3[0] = 1;
        nArray3[1] = 0;
        int[] nArray4 = nArray3;
        sprfmb[] sprfmbArray3 = new sprfmb[2];
        sprfmbArray3[0] = sprfmb4;
        sprfmbArray3[1] = sprfmb5;
        sprfmb[] sprfmbArray4 = sprfmbArray3;
        int n5 = 1;
        int n6 = nArray2[n5];
        int n7 = nArray4[n5];
        int n8 = n = n6 - nArray2[1 - n5];
        while (true) {
            int n9;
            int n10;
            if (n8 < 0) {
                n = -n;
                int n11 = n5;
                nArray2[n11] = n6;
                nArray4[n11] = n7;
                n5 = 1 - n5;
                n6 = nArray2[n5];
                n7 = nArray4[n5];
            }
            int n12 = n5;
            sprfmbArray2[n12].cfr_renamed_1896(sprfmbArray2[1 - n5], nArray2[1 - n5], n);
            int n13 = sprfmbArray2[n12].cfr_renamed_1928(n6);
            if (n13 == 0) {
                return sprfmbArray4[1 - n5];
            }
            int n14 = n10 = nArray4[1 - n5];
            sprfmbArray4[n5].cfr_renamed_1896(sprfmbArray4[1 - n5], n14, n);
            n10 = n14 + n;
            if (n10 > n7) {
                n7 = n10;
                n9 = n;
            } else {
                if (n10 == n7) {
                    n7 = sprfmbArray4[n5].cfr_renamed_1928(n7);
                }
                n9 = n;
            }
            n = n9 + (n13 - n6);
            n6 = n13;
            n8 = n;
        }
    }

    public boolean cfr_renamed_805() {
        int n;
        long[] lArray = this.cfr_renamed_119;
        int n2 = n = 0;
        while (n2 < lArray.length) {
            if (lArray[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private static /* synthetic */ void cfr_renamed_1897(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg1 + n;
            long l = arg0[n3] ^ arg2[arg3 + n];
            arg0[n3] = l;
            n2 = ++n;
        }
    }

    public sprfmb cfr_renamed_1929(int arg0, int arg1, int[] arg2) {
        int n = this.cfr_renamed_1894();
        if (n == 0) {
            return this;
        }
        long[] lArray = new long[arg1 + 63 >>> 6 << 1];
        System.arraycopy(this.cfr_renamed_119, 0, lArray, 0, n);
        while (--arg0 >= 0) {
            sprfmb.cfr_renamed_1925(lArray, n, arg1, arg2);
            n = sprfmb.cfr_renamed_1907(lArray, 0, lArray.length, arg1, arg2);
        }
        return new sprfmb(lArray, 0, n);
    }

    public boolean cfr_renamed_1930() {
        return this.cfr_renamed_119.length > 0 && (this.cfr_renamed_119[0] & 1L) != 0L;
    }

    private /* synthetic */ int cfr_renamed_1928(int arg0) {
        long l;
        int n = arg0 + 62 >>> 6;
        do {
            if (n != 0) continue;
            return 0;
        } while ((l = this.cfr_renamed_119[--n]) == 0L);
        return (n << 6) + sprfmb.cfr_renamed_1921(l);
    }
}

