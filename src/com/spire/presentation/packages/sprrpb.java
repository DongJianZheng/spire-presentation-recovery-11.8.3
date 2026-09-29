/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtsa;
import java.math.BigInteger;

public abstract class sprrpb {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1671(int n, long l, int[] nArray, int n2) {
        int arg0;
        void arg1;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + 0] & 0xFFFFFFFFL) - (l & 0xFFFFFFFFL);
        nArray[n2 + 0] = (int)l2;
        l2 >>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l2 += ((long)v0[arg3 + true] & 0xFFFFFFFFL) - (arg1 >>> 32));
        if ((l2 >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, (int[])arg2, (int)arg3, 2);
    }

    public static void cfr_renamed_1673(int arg0, int[] arg1, int[] arg2) {
        System.arraycopy(arg1, 0, arg2, 0, arg0);
    }

    public static int cfr_renamed_1674(int arg0, int arg1, int[] arg2) {
        long l;
        long l2 = l = ((long)arg1 & 0xFFFFFFFFL) + ((long)arg2[0] & 0xFFFFFFFFL);
        arg2[0] = (int)l2;
        l = l2 >>> 32;
        if (l == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, arg2, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1676(int n, int n2, int[] nArray, int n3) {
        int arg0;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + 0] & 0xFFFFFFFFL) + ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + 0] = (int)l;
        l >>>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l += ((long)v0[arg3 + true] & 0xFFFFFFFFL) + 1L);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, (int[])arg2, (int)(arg3 + 2));
    }

    public static int cfr_renamed_1677(int arg0, int[] arg1, int arg2, int arg3) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[arg2 + n];
            arg1[arg2 + n] = n2 >>> 1 | arg3 << 31;
            arg3 = n2;
        }
        return arg3 << 31;
    }

    public static int cfr_renamed_1678(int arg0, int[] arg1, int arg2, int[] arg3) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[n];
            arg3[n] = n2 >>> 1 | arg2 << 31;
            arg2 = n2;
        }
        return arg2 << 31;
    }

    public static void cfr_renamed_1679(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n;
        int n2 = arg0 << 1;
        int n3 = 0;
        int n4 = arg0;
        int n5 = n2;
        do {
            long l = (long)arg1[arg2 + --n4] & 0xFFFFFFFFL;
            long l2 = l * l;
            int n6 = arg4 + --n5;
            arg3[n6] = n3 << 31 | (int)(l2 >>> 33);
            arg3[arg4 + --n5] = (int)(l2 >>> 1);
            n3 = (int)l2;
        } while (n4 > 0);
        int n7 = n = 1;
        while (n7 < arg0) {
            n3 = sprrpb.cfr_renamed_1680(arg1, arg2, n, arg3, arg4);
            sprrpb.cfr_renamed_1681(n2, n3, arg3, arg4, n++ << 1);
            n7 = n;
        }
        sprrpb.cfr_renamed_1682(n2, arg3, arg4, arg1[arg2] << 31);
    }

    public static boolean cfr_renamed_1683(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = n = arg0 - 1;
        while (n2 >= 0) {
            int n3 = arg1[n] ^ Integer.MIN_VALUE;
            int n4 = arg2[n] ^ Integer.MIN_VALUE;
            if (n3 < n4) {
                return false;
            }
            if (n3 > n4) {
                return true;
            }
            n2 = --n;
        }
        return true;
    }

    public static int cfr_renamed_1684(int arg0, int arg1, int[] arg2, int arg3) {
        long l;
        long l2 = l = ((long)arg1 & 0xFFFFFFFFL) + ((long)arg2[arg3] & 0xFFFFFFFFL);
        arg2[arg3] = (int)l2;
        l = l2 >>> 32;
        if (l == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, arg2, arg3, 1);
    }

    public static int cfr_renamed_1685(int arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = n++;
            arg1[n3] = arg1[n3] + 1;
            if (arg1[n3] != 0) {
                return 0;
            }
            n2 = n;
        }
        return 1;
    }

    public static int cfr_renamed_1672(int arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3;
        while (n2 < arg0) {
            int n3 = arg2 + n;
            arg1[n3] = arg1[n3] - 1;
            if (arg1[n3] != -1) {
                return 0;
            }
            n2 = ++n;
        }
        return -1;
    }

    public static int cfr_renamed_1686(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[n];
            arg4[n] = n2 >>> arg2 | arg3 << -arg2;
            arg3 = n2;
        }
        return arg3 << -arg2;
    }

    public static int cfr_renamed_1662(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 1;
        }
        int n = arg1 >> 5;
        if (n < 0 || n >= arg0.length) {
            return 0;
        }
        int n2 = arg1 & 0x1F;
        return arg0[n] >>> n2 & 1;
    }

    public static int cfr_renamed_1687(int arg0, int[] arg1, int[] arg2) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg2[n] & 0xFFFFFFFFL) - ((long)arg1[n] & 0xFFFFFFFFL);
            arg2[n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1688(int arg0, int[] arg1, int[] arg2) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[n] & 0xFFFFFFFFL) + ((long)arg2[n] & 0xFFFFFFFFL);
            arg2[n] = (int)l2;
            l = l2 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1682(int arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[arg2 + n];
            int n4 = arg2 + n;
            arg1[n4] = n3 << 1 | arg3 >>> 31;
            arg3 = n3;
            n2 = ++n;
        }
        return arg3 >>> 31;
    }

    public static int cfr_renamed_1689(int arg0, int[] arg1, int arg2, int arg3) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[n];
            arg1[n] = n2 >>> arg2 | arg3 << -arg2;
            arg3 = n2;
        }
        return arg3 << -arg2;
    }

    public static int cfr_renamed_1690(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = (long)sprrpb.cfr_renamed_1691(arg0, arg1[arg2 + n], arg3, arg4, arg5, arg6) & 0xFFFFFFFFL;
            long l3 = l2 += l + ((long)arg5[arg6 + arg0] & 0xFFFFFFFFL);
            arg5[arg6 + arg0] = (int)l3;
            ++arg6;
            l = l3 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1634(int arg0, int arg1, int[] arg2, int arg3) {
        long l;
        long l2 = l = ((long)arg1 & 0xFFFFFFFFL) + ((long)arg2[arg3] & 0xFFFFFFFFL);
        arg2[arg3] = (int)l2;
        l = l2 >>> 32;
        if (l == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, arg2, arg3 + 1);
    }

    public static int cfr_renamed_1692(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[arg2 + n];
            int n4 = arg6 + n;
            arg5[n4] = n3 << arg3 | arg4 >>> -arg3;
            arg4 = n3;
            n2 = ++n;
        }
        return arg4 >>> -arg3;
    }

    public static int cfr_renamed_1693(int arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = n++;
            arg1[n3] = arg1[n3] - 1;
            if (arg1[n3] != -1) {
                return 0;
            }
            n2 = n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1694(int n, int[] nArray, int n2, int[] nArray2, int n3, int[] nArray3, int n4) {
        int n5;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        int arg0;
        arg5[arg6 + arg0] = sprrpb.cfr_renamed_1695(arg0, (int)arg1[arg2], (int[])arg3, (int)arg4, (int[])arg5, (int)arg6);
        int n6 = n5 = 1;
        while (n6 < arg0) {
            void v1 = arg6 + n5 + arg0;
            int n7 = sprrpb.cfr_renamed_1691(arg0, (int)arg1[arg2 + n5], (int[])arg3, (int)arg4, (int[])arg5, (int)(arg6 + n5));
            arg5[v1] = n7;
            n6 = ++n5;
        }
    }

    public static int cfr_renamed_1696(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[n] & 0xFFFFFFFFL) + ((long)arg2[n] & 0xFFFFFFFFL);
            arg3[n] = (int)l2;
            l = l2 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1697(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
        long l = 0L;
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        long l3 = (long)arg3 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l4 = l += l2 * ((long)arg2[n] & 0xFFFFFFFFL) + l3 * ((long)arg4[n] & 0xFFFFFFFFL) + ((long)arg5[arg6 + n] & 0xFFFFFFFFL);
            arg5[arg6 + n] = (int)l4;
            l = l4 >>> 32;
        } while (++n < arg0);
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1698(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        int n2;
        void arg3;
        void arg2;
        void arg1;
        int arg0;
        int n3 = arg0;
        arg3[n3] = sprrpb.cfr_renamed_1699(n3, (int)arg1[0], (int[])arg2, (int[])arg3);
        int n4 = n2 = 1;
        while (n4 < arg0) {
            int n5 = n2 + arg0;
            int n6 = sprrpb.cfr_renamed_1691(arg0, (int)arg1[n2], (int[])arg2, 0, (int[])arg3, n2);
            arg3[n5] = n6;
            n4 = ++n2;
        }
    }

    public static int cfr_renamed_1700(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[arg2 + n];
            arg4[arg5 + n] = n2 >>> 1 | arg3 << 31;
            arg3 = n2;
        }
        return arg3 << 31;
    }

    public static int cfr_renamed_1680(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        long l = 0L;
        long l2 = (long)arg0[arg1 + arg2] & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg0[arg1 + n] & 0xFFFFFFFFL) + ((long)arg3[arg2 + arg4] & 0xFFFFFFFFL);
            arg3[arg2 + arg4] = (int)l3;
            ++arg4;
            l = l3 >>> 32;
        } while (++n < arg2);
        return (int)l;
    }

    public static int cfr_renamed_1695(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg2[arg3 + n] & 0xFFFFFFFFL);
            arg4[arg5 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < arg0);
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1701(int n, long l, int[] nArray, int n2) {
        int arg0;
        void arg1;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + 0] & 0xFFFFFFFFL) + (l & 0xFFFFFFFFL);
        nArray[n2 + 0] = (int)l2;
        l2 >>>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l2 += ((long)v0[arg3 + true] & 0xFFFFFFFFL) + (arg1 >>> 32));
        if ((l2 >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, (int[])arg2, (int)(arg3 + 2));
    }

    public static int cfr_renamed_1681(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long l;
        long l2 = l = ((long)arg1 & 0xFFFFFFFFL) + ((long)arg2[arg3 + arg4] & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int)l2;
        l = l2 >>> 32;
        if (l == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, arg2, arg3, arg4 + 1);
    }

    public static int cfr_renamed_1702(int arg0, int[] arg1, int arg2, int[] arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[n];
            arg3[n++] = n3 << 1 | arg2 >>> 31;
            arg2 = n3;
            n2 = n;
        }
        return arg2 >>> 31;
    }

    public static int cfr_renamed_1703(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[arg2 + n];
            arg1[arg2 + n] = n2 >>> arg3 | arg4 << -arg3;
            arg4 = n2;
        }
        return arg4 << -arg3;
    }

    public static BigInteger cfr_renamed_1704(int arg0, int[] arg1) {
        int n;
        byte[] byArray = new byte[arg0 << 2];
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[n];
            if (n3 != 0) {
                sprtsa.cfr_renamed_442(n3, byArray, arg0 - 1 - n << 2);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }

    public static int cfr_renamed_1705(int arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[n];
            arg1[n++] = n3 << arg2 | arg3 >>> -arg2;
            arg3 = n3;
            n2 = n;
        }
        return arg3 >>> -arg2;
    }

    public static int cfr_renamed_1706(int arg0, int[] arg1, int[] arg2) {
        int n = 0;
        while (n < arg0) {
            int n2 = arg1[n] - 1;
            arg2[n++] = n2;
            if (n2 == -1) continue;
            int n3 = n;
            while (n3 < arg0) {
                int n4 = n++;
                arg2[n4] = arg1[n4];
                n3 = n;
            }
            return 0;
        }
        return -1;
    }

    public static int cfr_renamed_1707(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[n] & 0xFFFFFFFFL) - ((long)arg2[n] & 0xFFFFFFFFL);
            arg3[n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1708(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg3[n] & 0xFFFFFFFFL) - ((long)arg1[n] & 0xFFFFFFFFL) - ((long)arg2[n] & 0xFFFFFFFFL);
            arg3[n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1635(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg3[arg4 + n] & 0xFFFFFFFFL) - ((long)arg1[arg2 + n] & 0xFFFFFFFFL);
            arg3[arg4 + n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1709(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[arg2 + n] & 0xFFFFFFFFL) - ((long)arg3[arg4 + n] & 0xFFFFFFFFL);
            arg5[arg6 + n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static boolean cfr_renamed_1710(int arg0, int[] arg1) {
        int n;
        if (arg1[0] != 1) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < arg0) {
            if (arg1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_1675(int arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = arg2;
        while (n2 < arg0) {
            int n3 = n++;
            arg1[n3] = arg1[n3] + 1;
            if (arg1[n3] != 0) {
                return 0;
            }
            n2 = n;
        }
        return 1;
    }

    public static int cfr_renamed_1711(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[arg2 + n] & 0xFFFFFFFFL) + ((long)arg3[arg4 + n] & 0xFFFFFFFFL) + ((long)arg5[arg6 + n] & 0xFFFFFFFFL);
            arg5[arg6 + n] = (int)l2;
            l = l2 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1712(int n, int n2, int[] nArray) {
        int arg0;
        void arg2;
        long l = ((long)nArray[0] & 0xFFFFFFFFL) + ((long)n2 & 0xFFFFFFFFL);
        nArray[0] = (int)l;
        l >>>= 32;
        void v0 = arg2;
        v0[1] = (int)(l += ((long)v0[1] & 0xFFFFFFFFL) + 1L);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, (int[])arg2, 2);
    }

    public static int cfr_renamed_1713(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[arg2 + n];
            int n4 = arg5 + n;
            arg4[n4] = n3 << 1 | arg3 >>> 31;
            arg3 = n3;
            n2 = ++n;
        }
        return arg3 >>> 31;
    }

    public static int cfr_renamed_1714(int arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = arg2;
        while (n2 < arg0) {
            int n3 = n++;
            arg1[n3] = arg1[n3] - 1;
            if (arg1[n3] != -1) {
                return 0;
            }
            n2 = n;
        }
        return -1;
    }

    public static int cfr_renamed_1645(int arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3;
        while (n2 < arg0) {
            int n3 = arg2 + n;
            arg1[n3] = arg1[n3] + 1;
            if (arg1[n3] != 0) {
                return 0;
            }
            n2 = ++n;
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1715(int n, int n2, int[] nArray, int n3, int n4) {
        int arg0;
        void arg4;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + n4] & 0xFFFFFFFFL) + ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + n4] = (int)l;
        l >>>= 32;
        void v0 = arg2;
        v0[arg3 + arg4 + true] = (int)(l += ((long)v0[arg3 + arg4 + true] & 0xFFFFFFFFL) + 1L);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, (int[])arg2, (int)arg3, (int)(arg4 + 2));
    }

    public static int[] cfr_renamed_1716(int arg0) {
        return new int[arg0];
    }

    public static int cfr_renamed_1717(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[arg2 + n];
            arg5[arg6 + n] = n2 >>> arg3 | arg4 << -arg3;
            arg4 = n2;
        }
        return arg4 << -arg3;
    }

    public static void cfr_renamed_1718(int arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            arg1[n++] = 0;
            n2 = n;
        }
    }

    public static int cfr_renamed_1719(int arg0, int[] arg1, int[] arg2) {
        int n = 0;
        while (n < arg0) {
            int n2 = arg1[n] + 1;
            arg2[n++] = n2;
            if (n2 == 0) continue;
            int n3 = n;
            while (n3 < arg0) {
                int n4 = n++;
                arg2[n4] = arg1[n4];
                n3 = n;
            }
            return 0;
        }
        return 1;
    }

    public static int cfr_renamed_1691(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg2[arg3 + n] & 0xFFFFFFFFL) + ((long)arg4[arg5 + n] & 0xFFFFFFFFL);
            arg4[arg5 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < arg0);
        return (int)l;
    }

    public static int[] cfr_renamed_1720(int arg0, BigInteger arg1) {
        if (arg1.signum() < 0 || arg1.bitLength() > arg0) {
            throw new IllegalArgumentException();
        }
        int[] nArray = sprrpb.cfr_renamed_1716(arg0 + 31 >> 5);
        int n = 0;
        BigInteger bigInteger = arg1;
        while (bigInteger.signum() != 0) {
            BigInteger bigInteger2 = arg1;
            nArray[++n] = bigInteger2.intValue();
            bigInteger = bigInteger2.shiftRight(32);
        }
        return nArray;
    }

    public static int cfr_renamed_1721(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long l = ((long)arg2[arg3 + arg4] & 0xFFFFFFFFL) - ((long)arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int)l;
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, arg2, arg3, arg4 + 1);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1722(int n, long l, int[] nArray, int n2) {
        int arg0;
        void arg1;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + 0] & 0xFFFFFFFFL) - (l & 0xFFFFFFFFL);
        nArray[n2 + 0] = (int)l2;
        l2 >>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l2 += ((long)v0[arg3 + true] & 0xFFFFFFFFL) - (arg1 >>> 32));
        if ((l2 >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, (int[])arg2, (int)(arg3 + 2));
    }

    public static int cfr_renamed_1723(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg5[arg6 + n] & 0xFFFFFFFFL) - ((long)arg1[arg2 + n] & 0xFFFFFFFFL) - ((long)arg3[arg4 + n] & 0xFFFFFFFFL);
            arg5[arg6 + n] = (int)l2;
            l = l2 >> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1724(int[] arg0, int arg1, int[] arg2) {
        long l = 0L;
        long l2 = (long)arg0[arg1] & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg0[n] & 0xFFFFFFFFL) + ((long)arg2[arg1 + n] & 0xFFFFFFFFL);
            arg2[arg1 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < arg1);
        return (int)l;
    }

    public static int cfr_renamed_1725(int arg0, int[] arg1, int arg2) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[n];
            arg1[n] = n2 >>> 1 | arg2 << 31;
            arg2 = n2;
        }
        return arg2 << 31;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1726(int n, long l, int[] nArray, int n2, int n3) {
        int arg0;
        void arg1;
        void arg4;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + n3] & 0xFFFFFFFFL) + (l & 0xFFFFFFFFL);
        nArray[n2 + n3] = (int)l2;
        l2 >>>= 32;
        void v0 = arg2;
        v0[arg3 + arg4 + true] = (int)(l2 += ((long)v0[arg3 + arg4 + true] & 0xFFFFFFFFL) + (arg1 >>> 32));
        if ((l2 >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, (int[])arg2, (int)arg3, (int)(arg4 + 2));
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1727(int n, long l, int[] nArray) {
        int arg0;
        void arg1;
        void arg2;
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + (l & 0xFFFFFFFFL);
        nArray[0] = (int)l2;
        l2 >>>= 32;
        void v0 = arg2;
        v0[1] = (int)(l2 += ((long)v0[1] & 0xFFFFFFFFL) + (arg1 >>> 32));
        if ((l2 >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, (int[])arg2, 2);
    }

    public static void cfr_renamed_1728(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = arg0 << 1;
        int n3 = 0;
        int n4 = arg0;
        int n5 = n2;
        do {
            long l = (long)arg1[--n4] & 0xFFFFFFFFL;
            long l2 = l * l;
            int n6 = --n5;
            arg2[n6] = n3 << 31 | (int)(l2 >>> 33);
            arg2[--n5] = (int)(l2 >>> 1);
            n3 = (int)l2;
        } while (n4 > 0);
        int n7 = n = 1;
        while (n7 < arg0) {
            n3 = sprrpb.cfr_renamed_1724(arg1, n, arg2);
            sprrpb.cfr_renamed_1634(n2, n3, arg2, n++ << 1);
            n7 = n;
        }
        sprrpb.cfr_renamed_1729(n2, arg2, arg1[0] << 31);
    }

    public static int cfr_renamed_1729(int arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[n];
            arg1[n++] = n3 << 1 | arg2 >>> 31;
            arg2 = n3;
            n2 = n;
        }
        return arg2 >>> 31;
    }

    public static int cfr_renamed_1730(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[arg2 + n];
            int n4 = arg2 + n;
            arg1[n4] = n3 << arg3 | arg4 >>> -arg3;
            arg4 = n3;
            n2 = ++n;
        }
        return arg4 >>> -arg3;
    }

    public static int cfr_renamed_1731(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = arg1[n];
            arg4[n++] = n3 << arg2 | arg3 >>> -arg2;
            arg3 = n3;
            n2 = n;
        }
        return arg3 >>> -arg2;
    }

    public static int cfr_renamed_1699(int arg0, int arg1, int[] arg2, int[] arg3) {
        long l = 0L;
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg2[n] & 0xFFFFFFFFL);
            arg3[n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < arg0);
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1732(int n, int n2, int[] nArray, int n3) {
        int arg0;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + 0] & 0xFFFFFFFFL) - ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + 0] = (int)l;
        l >>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l += ((long)v0[arg3 + true] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, (int[])arg2, (int)(arg3 + 2));
    }

    public static int[] cfr_renamed_1733(int arg0, int[] arg1) {
        int[] nArray = new int[arg0];
        System.arraycopy(arg1, 0, nArray, 0, arg0);
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1734(int n, long l, int[] nArray) {
        int arg0;
        void arg1;
        void arg2;
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) - (l & 0xFFFFFFFFL);
        nArray[0] = (int)l2;
        l2 >>= 32;
        void v0 = arg2;
        v0[1] = (int)(l2 += ((long)v0[1] & 0xFFFFFFFFL) - (arg1 >>> 32));
        if ((l2 >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, (int[])arg2, 2);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1735(int n, long l, int[] nArray, int n2, int n3) {
        int arg0;
        void arg1;
        void arg4;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + n3] & 0xFFFFFFFFL) - (l & 0xFFFFFFFFL);
        nArray[n2 + n3] = (int)l2;
        l2 >>= 32;
        void v0 = arg2;
        v0[arg3 + arg4 + true] = (int)(l2 += ((long)v0[arg3 + arg4 + true] & 0xFFFFFFFFL) - (arg1 >>> 32));
        if ((l2 >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, (int[])arg2, (int)arg3, (int)(arg4 + 2));
    }

    public static int cfr_renamed_1736(int arg0, int[] arg1, int arg2) {
        int n = arg0;
        while (--n >= 0) {
            int n2 = arg1[n];
            arg1[n] = arg2;
            arg2 = n2;
        }
        return arg2;
    }

    public static boolean cfr_renamed_1737(int arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0) {
            if (arg1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_1738(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[n] & 0xFFFFFFFFL) + ((long)arg2[n] & 0xFFFFFFFFL) + ((long)arg3[n] & 0xFFFFFFFFL);
            arg3[n] = (int)l2;
            l = l2 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1739(int n, long l, int[] nArray, int n2) {
        int arg0;
        void arg1;
        void arg3;
        void arg2;
        long l2 = ((long)nArray[n2 + 0] & 0xFFFFFFFFL) + (l & 0xFFFFFFFFL);
        nArray[n2 + 0] = (int)l2;
        l2 >>>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l2 += ((long)v0[arg3 + true] & 0xFFFFFFFFL) + (arg1 >>> 32));
        if ((l2 >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, (int[])arg2, (int)arg3, 2);
    }

    public static int cfr_renamed_1740(int arg0, int arg1, int[] arg2) {
        long l = ((long)arg2[0] & 0xFFFFFFFFL) - ((long)arg1 & 0xFFFFFFFFL);
        arg2[0] = (int)l;
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, arg2, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1741(int n, int n2, int[] nArray, int n3) {
        int arg0;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + 0] & 0xFFFFFFFFL) + ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + 0] = (int)l;
        l >>>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l += ((long)v0[arg3 + true] & 0xFFFFFFFFL) + 1L);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(arg0, (int[])arg2, (int)arg3, 2);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1742(int n, int n2, int[] nArray) {
        int arg0;
        void arg2;
        long l = ((long)nArray[0] & 0xFFFFFFFFL) - ((long)n2 & 0xFFFFFFFFL);
        nArray[0] = (int)l;
        l >>= 32;
        void v0 = arg2;
        v0[1] = (int)(l += ((long)v0[1] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, (int[])arg2, 2);
    }

    public static boolean cfr_renamed_1743(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = n = arg0 - 1;
        while (n2 >= 0) {
            if (arg1[n] != arg2[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1744(int n, int n2, int[] nArray, int n3, int n4) {
        int arg0;
        void arg4;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + n4] & 0xFFFFFFFFL) - ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + n4] = (int)l;
        l >>= 32;
        void v0 = arg2;
        v0[arg3 + arg4 + true] = (int)(l += ((long)v0[arg3 + arg4 + true] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, (int[])arg2, (int)arg3, (int)(arg4 + 2));
    }

    public static int cfr_renamed_1745(int arg0, int arg1, long arg2, int[] arg3, int arg4) {
        long l = 0L;
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        long l3 = l += l2 * (arg2 & 0xFFFFFFFFL) + ((long)arg3[arg4 + 0] & 0xFFFFFFFFL);
        arg3[arg4 + 0] = (int)l3;
        l = l3 >>> 32;
        arg3[arg4 + 1] = (int)(l += l2 * (arg2 >>> 32) + ((long)arg3[arg4 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg3[arg4 + 2] = (int)(l += (long)arg3[arg4 + 2] & 0xFFFFFFFFL);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1675(arg0, arg3, arg4 + 3);
    }

    public static int cfr_renamed_1746(int arg0, int arg1, int[] arg2, int arg3) {
        long l = ((long)arg2[arg3 + 0] & 0xFFFFFFFFL) - ((long)arg1 & 0xFFFFFFFFL);
        arg2[arg3 + 0] = (int)l;
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, arg2, arg3, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_1747(int n, int n2, int[] nArray, int n3) {
        int arg0;
        void arg3;
        void arg2;
        long l = ((long)nArray[n3 + 0] & 0xFFFFFFFFL) - ((long)n2 & 0xFFFFFFFFL);
        nArray[n3 + 0] = (int)l;
        l >>= 32;
        void v0 = arg2;
        v0[arg3 + true] = (int)(l += ((long)v0[arg3 + true] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1672(arg0, (int[])arg2, (int)arg3, 2);
    }

    public static int cfr_renamed_1748(int arg0, int arg1, int[] arg2, int arg3) {
        long l = ((long)arg2[arg3] & 0xFFFFFFFFL) - ((long)arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int)l;
        if ((l >>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1714(arg0, arg2, arg3 + 1);
    }

    public static int cfr_renamed_1749(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = (long)sprrpb.cfr_renamed_1691(arg0, arg1[n], arg2, 0, arg3, n) & 0xFFFFFFFFL;
            long l3 = l2 += l + ((long)arg3[n + arg0] & 0xFFFFFFFFL);
            arg3[n + arg0] = (int)l3;
            l = l3 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }

    public static int cfr_renamed_1638(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0) {
            long l2 = l += ((long)arg1[arg2 + n] & 0xFFFFFFFFL) + ((long)arg3[arg4 + n] & 0xFFFFFFFFL);
            arg3[arg4 + n] = (int)l2;
            l = l2 >>> 32;
            n2 = ++n;
        }
        return (int)l;
    }
}

