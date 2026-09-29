/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.util.HashMap;
import java.util.Map;

public class sprung {
    private final int cfr_renamed_0;
    private static final int cfr_renamed_1 = 64;
    private final Map<Integer, Integer> cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    public void cfr_renamed_6593(long[] arg0, long[] arg1) {
        sprung sprung2 = this;
        int n = sprung2.cfr_renamed_3 & 0x3F;
        int n2 = 64 - n;
        long l = -1L >>> n2;
        sprvih.cfr_renamed_7195(sprung2.cfr_renamed_0, arg0, this.cfr_renamed_0, n2, arg0[this.cfr_renamed_0 - 1], arg1, 0);
        sprung sprung3 = this;
        sprung3.cfr_renamed_7196(arg0, arg1);
        int n3 = sprung3.cfr_renamed_0 - 1;
        arg1[n3] = arg1[n3] & l;
    }

    public long[] cfr_renamed_1633() {
        return new long[this.cfr_renamed_4];
    }

    private static /* synthetic */ int cfr_renamed_7197(int arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3 = 1;
        int n4 = n2 = arg2;
        while (n4 >= 32) {
            n = arg1 * n3;
            long l = ((long)n & 0xFFFFFFFFL) * (long)arg0;
            n3 = (int)(l + (long)n3 >>> 32);
            n4 = n2 -= 32;
        }
        if (n2 > 0) {
            n = -1 >>> -n2;
            int n5 = arg1 * n3 & n;
            n3 = (int)(((long)n5 & 0xFFFFFFFFL) * (long)arg0 + (long)n3 >>> n2);
        }
        return n3;
    }

    private /* synthetic */ void cfr_renamed_7198(long[] arg0, long[] arg1) {
        sprxlh.cfr_renamed_7199(arg0, 0, this.cfr_renamed_0, arg1, 0);
    }

    public void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        sprung sprung2 = this;
        long[] lArray = sprung2.cfr_renamed_1633();
        sprung2.cfr_renamed_7201(arg0, arg1, lArray);
        sprung2.cfr_renamed_6593(lArray, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprung(int n) {
        void arg0;
        sprung sprung2 = this;
        sprung2.cfr_renamed_2 = new HashMap<Integer, Integer>();
        if ((n & 0xFFFF0001) != 1) {
            throw new IllegalArgumentException();
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_0 = arg0 + 63 >>> 6;
        this.cfr_renamed_4 = this.cfr_renamed_0 * 2;
        sprung.cfr_renamed_7202(this.cfr_renamed_2, (int)arg0);
    }

    private static /* synthetic */ void cfr_renamed_7202(Map<Integer, Integer> arg0, int arg1) {
        int n;
        int n2 = arg1 - 2;
        int n3 = 32 - spruaf.cfr_renamed_5201(n2);
        int n4 = sprqlh.cfr_renamed_1753(-arg1);
        int n5 = n = 1;
        while (n5 < n3) {
            int n6;
            int n7 = 1 << n - 1;
            if (n7 >= 64 && !arg0.containsKey(spruaf.cfr_renamed_279(n7))) {
                arg0.put(spruaf.cfr_renamed_279(n7), spruaf.cfr_renamed_279(sprung.cfr_renamed_7197(arg1, n4, n7)));
            }
            if ((n2 & 1 << n) != 0 && (n6 = n2 & (1 << n) - 1) >= 64 && !arg0.containsKey(spruaf.cfr_renamed_279(n6))) {
                arg0.put(spruaf.cfr_renamed_279(n6), spruaf.cfr_renamed_279(sprung.cfr_renamed_7197(arg1, n4, n6)));
            }
            n5 = ++n;
        }
    }

    public void cfr_renamed_7203(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3 = n++;
            arg1[n3] = arg0[n3];
            n2 = n;
        }
    }

    public byte[] cfr_renamed_7204(long[] arg0) {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_3];
        byArray[0] = (byte)(arg0[0] & 1L);
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_3) {
            int n3 = this.cfr_renamed_3 - n;
            byte by = (byte)(arg0[n >>> 6] >>> (n & 0x3F) & 1L);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_7205(long[] lArray, long l, long l2, long[] lArray2, int n) {
        void arg4;
        void arg3;
        int n2;
        void arg1;
        long[] arg0;
        int n3;
        void arg2;
        arg0[1] = arg2;
        int n4 = n3 = 2;
        while (n4 < 16) {
            int n5 = n3;
            arg0[n5] = arg0[n3 >>> 1] << 1;
            long l3 = arg0[n3] ^ arg2;
            arg0[n5 + 1] = l3;
            n4 = n3 += 2;
        }
        n3 = (int)arg1;
        long l4 = 0L;
        long l5 = arg0[n3 & 0xF] ^ arg0[n3 >>> 4 & 0xF] << 4;
        int n6 = 56;
        do {
            n3 = (int)(arg1 >>> n6);
            long l6 = arg0[n3 & 0xF] ^ arg0[n3 >>> 4 & 0xF] << 4;
            l5 ^= l6 << n6;
            int n7 = -n6;
            l4 ^= l6 >>> n7;
        } while ((n6 -= 8) > 0);
        int n8 = n2 = 0;
        while (n8 < 7) {
            arg1 = (arg1 & 0xFEFEFEFEFEFEFEFEL) >>> 1;
            void v5 = arg2 << n2 >> 63;
            l4 ^= arg1 & v5;
            n8 = ++n2;
        }
        void v6 = arg3;
        void v7 = arg4;
        v6[v7] = v6[v7] ^ l5;
        void v8 = v7 + true;
        v6[v8] = v6[v8] ^ l4;
    }

    public void cfr_renamed_7206(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3 = n;
            long l = arg0[n3] ^ arg1[n];
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    private static /* synthetic */ int cfr_renamed_7207(int arg0, int arg1, int arg2) {
        int n = arg1 + arg2 - arg0;
        return n + (n >> 31 & arg0);
    }

    public void cfr_renamed_7208(long[] arg0, long[] arg1) {
        int n;
        sprung sprung2 = this;
        long[] lArray = sprung2.cfr_renamed_1631();
        long[] lArray2 = sprung2.cfr_renamed_1631();
        long[] lArray3 = sprung2.cfr_renamed_1631();
        sprung2.cfr_renamed_7203(arg0, lArray);
        sprung2.cfr_renamed_7203(arg0, lArray3);
        int n2 = sprung2.cfr_renamed_3 - 2;
        int n3 = 32 - spruaf.cfr_renamed_5201(n2);
        int n4 = n = 1;
        while (n4 < n3) {
            sprung sprung3 = this;
            sprung3.cfr_renamed_7209(lArray, 1 << n - 1, lArray2);
            sprung3.cfr_renamed_7200(lArray, lArray2, lArray);
            if ((n2 & 1 << n) != 0) {
                int n5 = n2 & (1 << n) - 1;
                sprung sprung4 = this;
                sprung4.cfr_renamed_7209(lArray, n5, lArray2);
                sprung4.cfr_renamed_7200(lArray3, lArray2, lArray3);
            }
            n4 = ++n;
        }
        this.cfr_renamed_7210(lArray3, arg1);
    }

    public int cfr_renamed_7211() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_7196(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3 = n;
            long l = arg1[n3] ^ arg0[n];
            arg1[n3] = l;
            n2 = ++n;
        }
    }

    public long[] cfr_renamed_1631() {
        return new long[this.cfr_renamed_0];
    }

    public void cfr_renamed_7212(byte[] arg0, long[] arg1) {
        int n = this.cfr_renamed_3 & 0x3F;
        sprpxe.cfr_renamed_5173(arg0, 0, arg1, 0, this.cfr_renamed_0 - 1);
        byte[] byArray = new byte[8];
        System.arraycopy(arg0, this.cfr_renamed_0 - 1 << 3, byArray, 0, n + 7 >>> 3);
        arg1[this.cfr_renamed_0 - 1] = sprpxe.cfr_renamed_443(byArray, 0);
    }

    public void cfr_renamed_7213(long[] arg0, byte[] arg1) {
        int n = this.cfr_renamed_3 & 0x3F;
        sprpxe.cfr_renamed_5181(arg0, 0, this.cfr_renamed_0 - 1, arg1, 0);
        byte[] byArray = new byte[8];
        sprpxe.cfr_renamed_444(arg0[this.cfr_renamed_0 - 1], byArray, 0);
        System.arraycopy(byArray, 0, arg1, this.cfr_renamed_0 - 1 << 3, n + 7 >>> 3);
    }

    public void cfr_renamed_7210(long[] arg0, long[] arg1) {
        sprung sprung2 = this;
        long[] lArray = sprung2.cfr_renamed_1633();
        sprung2.cfr_renamed_7198(arg0, lArray);
        sprung2.cfr_renamed_6593(lArray, arg1);
    }

    public int cfr_renamed_2773() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        if (arg1 >= 64) {
            this.cfr_renamed_7214(arg0, arg1, arg2);
            return;
        }
        sprung sprung2 = this;
        long[] lArray = sprung2.cfr_renamed_1633();
        sprung2.cfr_renamed_7198(arg0, lArray);
        sprung2.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprung sprung3 = this;
            sprung3.cfr_renamed_7198(arg2, lArray);
            sprung3.cfr_renamed_6593(lArray, arg2);
        }
    }

    private /* synthetic */ void cfr_renamed_7214(long[] arg0, int arg1, long[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        sprung sprung2 = this;
        int n5 = sprung2.cfr_renamed_3;
        int n6 = n4 = sprung2.cfr_renamed_2.get(spruaf.cfr_renamed_279(arg1)).intValue();
        int n7 = n3 = sprung.cfr_renamed_7207(n5, n6, n6);
        int n8 = n2 = sprung.cfr_renamed_7207(n5, n7, n7);
        int n9 = sprung.cfr_renamed_7207(n5, n8, n8);
        int n10 = n5 - n9;
        int n11 = sprung.cfr_renamed_7207(n5, n10, n4);
        int n12 = sprung.cfr_renamed_7207(n5, n10, n3);
        int n13 = sprung.cfr_renamed_7207(n5, n11, n3);
        int n14 = sprung.cfr_renamed_7207(n5, n10, n2);
        int n15 = sprung.cfr_renamed_7207(n5, n11, n2);
        int n16 = sprung.cfr_renamed_7207(n5, n12, n2);
        int n17 = sprung.cfr_renamed_7207(n5, n13, n2);
        int n18 = n = 0;
        while (n18 < this.cfr_renamed_0) {
            int n19;
            long l = 0L;
            int n20 = n19 = 0;
            while (n20 < 64) {
                n10 = sprung.cfr_renamed_7207(n5, n10, n9);
                n11 = sprung.cfr_renamed_7207(n5, n11, n9);
                n12 = sprung.cfr_renamed_7207(n5, n12, n9);
                n13 = sprung.cfr_renamed_7207(n5, n13, n9);
                n14 = sprung.cfr_renamed_7207(n5, n14, n9);
                n15 = sprung.cfr_renamed_7207(n5, n15, n9);
                n16 = sprung.cfr_renamed_7207(n5, n16, n9);
                n17 = sprung.cfr_renamed_7207(n5, n17, n9);
                l |= (arg0[n10 >>> 6] >>> n10 & 1L) << n19 + 0;
                l |= (arg0[n11 >>> 6] >>> n11 & 1L) << n19 + 1;
                l |= (arg0[n12 >>> 6] >>> n12 & 1L) << n19 + 2;
                l |= (arg0[n13 >>> 6] >>> n13 & 1L) << n19 + 3;
                l |= (arg0[n14 >>> 6] >>> n14 & 1L) << n19 + 4;
                l |= (arg0[n15 >>> 6] >>> n15 & 1L) << n19 + 5;
                l |= (arg0[n16 >>> 6] >>> n16 & 1L) << n19 + 6;
                int n21 = n19 + 7;
                l |= (arg0[n17 >>> 6] >>> n17 & 1L) << n21;
                n20 = n19 += 8;
            }
            arg2[n++] = l;
            n18 = n;
        }
        int n22 = this.cfr_renamed_0 - 1;
        arg2[n22] = arg2[n22] & -1L >>> -n5;
    }

    public void cfr_renamed_7201(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        long[] lArray = new long[16];
        int n5 = n4 = 0;
        while (n5 < this.cfr_renamed_0) {
            sprung.cfr_renamed_7205(lArray, arg0[n4], arg1[n4], arg2, n4++ << 1);
            n5 = n4;
        }
        long l = arg2[0];
        long l2 = arg2[1];
        int n6 = n3 = 1;
        while (n6 < this.cfr_renamed_0) {
            arg2[n3] = (l ^= arg2[n3 << 1]) ^ l2;
            int n7 = (n3 << 1) + 1;
            l2 ^= arg2[n7];
            n6 = ++n3;
        }
        long l3 = l ^ l2;
        int n8 = n2 = 0;
        while (n8 < this.cfr_renamed_0) {
            arg2[this.cfr_renamed_0 + ++n2] = arg2[n2] ^ l3;
            n8 = n2;
        }
        n2 = this.cfr_renamed_0 - 1;
        int n9 = n = 1;
        while (n9 < n2 * 2) {
            int n10;
            int n11 = n - n10;
            for (n10 = Math.min(n2, n); n11 < n10; --n10) {
                int n12;
                long l4 = arg0[n12] ^ arg0[n10];
                long l5 = arg1[n12] ^ arg1[n10];
                sprung.cfr_renamed_7205(lArray, l4, l5, arg2, n);
                n11 = ++n12;
            }
            n9 = ++n;
        }
    }
}

