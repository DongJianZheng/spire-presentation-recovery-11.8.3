/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprltc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprocd;
import com.spire.presentation.packages.sprrnd;
import com.spire.presentation.packages.sprsun;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruym;
import com.spire.presentation.packages.sprzed;
import com.spire.presentation.packages.sprzgd;

public class sprxkd
implements sprff {
    private boolean cfr_renamed_272;
    private static final int cfr_renamed_145 = 72;
    private static final int cfr_renamed_114 = 72;
    private static int[] cfr_renamed_96;
    private static int[] cfr_renamed_105;
    private long[] cfr_renamed_137;
    public static final int cfr_renamed_79 = 1024;
    private static final int cfr_renamed_107 = 2;
    private static final long cfr_renamed_132 = 2004413935125273122L;
    private sprrnd cfr_renamed_102;
    public static final int cfr_renamed_93 = 256;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private static int[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 80;
    private long[] cfr_renamed_91;
    private long[] cfr_renamed_0;
    public static final int cfr_renamed_1 = 512;
    private static int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 16;
    private static final int cfr_renamed_4 = 80;

    public static /* synthetic */ int[] cfr_renamed_3555() {
        return cfr_renamed_105;
    }

    public int cfr_renamed_3556(long[] arg0, long[] arg1) throws sprjkd, IllegalStateException {
        sprxkd sprxkd2;
        sprxkd sprxkd3 = this;
        if (sprxkd3.cfr_renamed_0[sprxkd3.cfr_renamed_86] == 0L) {
            throw new IllegalStateException(sprsun.cfr_renamed_9(".0\b=\u001f>\u0013+\u0012x\u001f6\u001d1\u0014=Z6\u0015,Z1\u00141\u000e1\u001b4\u0013+\u001f<"));
        }
        if (arg0.length != this.cfr_renamed_86) {
            throw new sprjkd(spruym.cfr_renamed_9("f\u0018_\u0003[VM\u0003I\u0010J\u0004\u000f\u0002@\u0019\u000f\u0005G\u0019]\u0002"));
        }
        if (arg1.length != this.cfr_renamed_86) {
            throw new sprjkd(sprsun.cfr_renamed_9("\u0017\u000f,\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
        }
        if (this.cfr_renamed_272) {
            sprxkd sprxkd4 = this;
            sprxkd2 = sprxkd4;
            sprxkd4.cfr_renamed_102.cfr_renamed_3557(arg0, arg1);
        } else {
            sprxkd sprxkd5 = this;
            sprxkd2 = sprxkd5;
            sprxkd5.cfr_renamed_102.cfr_renamed_3558(arg0, arg1);
        }
        return sprxkd2.cfr_renamed_86;
    }

    private /* synthetic */ void cfr_renamed_3559(long[] arg0) {
        int n;
        if (arg0.length != this.cfr_renamed_86) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruym.cfr_renamed_9("{\u001e]\u0013J\u0010F\u0005GVD\u0013VVB\u0003\\\u0002\u000f\u0014JV\\\u0017B\u0013\u000f\u0005F\fJVN\u0005\u000f\u0014C\u0019L\u001d\u000f^")).append(this.cfr_renamed_86).append(sprsun.cfr_renamed_9("x\r7\b<\tq")).toString());
        }
        long l = 2004413935125273122L;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_86) {
            int n3 = n;
            this.cfr_renamed_0[n3] = arg0[n3];
            l ^= this.cfr_renamed_0[n++];
            n2 = n;
        }
        sprxkd sprxkd2 = this;
        sprxkd2.cfr_renamed_0[sprxkd2.cfr_renamed_86] = l;
        sprxkd sprxkd3 = this;
        System.arraycopy(sprxkd2.cfr_renamed_0, 0, sprxkd3.cfr_renamed_0, sprxkd3.cfr_renamed_86 + 1, this.cfr_renamed_86);
    }

    private /* synthetic */ void cfr_renamed_3560(long[] arg0) {
        if (arg0.length != 2) {
            throw new IllegalArgumentException(spruym.cfr_renamed_9("{\u0001J\u0017DVB\u0003\\\u0002\u000f\u0014JV\u001dVX\u0019]\u0012\\X"));
        }
        sprxkd sprxkd2 = this;
        sprxkd2.cfr_renamed_91[0] = arg0[0];
        sprxkd2.cfr_renamed_91[1] = arg0[1];
        sprxkd2.cfr_renamed_91[2] = this.cfr_renamed_91[0] ^ this.cfr_renamed_91[1];
        sprxkd2.cfr_renamed_91[3] = this.cfr_renamed_91[0];
        sprxkd2.cfr_renamed_91[4] = this.cfr_renamed_91[1];
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_152;
    }

    public static void cfr_renamed_3561(long arg0, byte[] arg1, int arg2) {
        if (arg2 + 8 > arg1.length) {
            throw new IllegalArgumentException();
        }
        int n = arg2;
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[n++] = (byte)arg0;
        byArray2[n++] = (byte)(arg0 >> 8);
        byArray[n++] = (byte)(arg0 >> 16);
        byArray2[n++] = (byte)(arg0 >> 24);
        byArray[n++] = (byte)(arg0 >> 32);
        byArray2[n++] = (byte)(arg0 >> 40);
        byArray[n++] = (byte)(arg0 >> 48);
        byArray2[n++] = (byte)(arg0 >> 56);
    }

    public static long cfr_renamed_3562(byte[] arg0, int arg1) {
        if (arg1 + 8 > arg0.length) {
            throw new IllegalArgumentException();
        }
        long l = 0L;
        int n = arg1;
        long l2 = arg0[n];
        l = l2 & 0xFFL;
        long l3 = arg0[++n];
        l |= (l3 & 0xFFL) << 8;
        long l4 = arg0[++n];
        l |= (l4 & 0xFFL) << 16;
        long l5 = arg0[++n];
        l |= (l5 & 0xFFL) << 24;
        long l6 = arg0[++n];
        l |= (l6 & 0xFFL) << 32;
        long l7 = arg0[++n];
        l |= (l7 & 0xFFL) << 40;
        long l8 = arg0[++n];
        l |= (l8 & 0xFFL) << 48;
        long l9 = arg0[++n];
        ++n;
        return l |= (l9 & 0xFFL) << 56;
    }

    static {
        int n;
        cfr_renamed_96 = new int[80];
        cfr_renamed_105 = new int[cfr_renamed_96.length];
        cfr_renamed_112 = new int[cfr_renamed_96.length];
        cfr_renamed_2 = new int[cfr_renamed_96.length];
        int n2 = n = 0;
        while (n2 < cfr_renamed_96.length) {
            int n3 = n;
            sprxkd.cfr_renamed_105[n3] = n3 % 17;
            int n4 = n;
            sprxkd.cfr_renamed_96[n4] = n4 % 9;
            int n5 = n;
            sprxkd.cfr_renamed_112[n5] = n5 % 5;
            int n6 = n++;
            sprxkd.cfr_renamed_2[n6] = n6 % 3;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        byte[] byArray;
        byte[] byArray2;
        Object object;
        if (arg1 instanceof sprltc) {
            object = (sprltc)arg1;
            byArray2 = ((sprltc)object).cfr_renamed_1521().cfr_renamed_1521();
            byArray = ((sprltc)object).cfr_renamed_3339();
        } else if (arg1 instanceof sprnld) {
            byArray2 = ((sprnld)arg1).cfr_renamed_1521();
            byArray = null;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsun.cfr_renamed_9("\u0011\u0014.\u001b4\u0013<Z(\u001b*\u001b5\u001f,\u001f*Z(\u001b+\t=\u001ex\u000e7Z\f\u0012*\u001f=\u001c1\t0Z1\u00141\u000exWx")).append(arg1.getClass().getName()).toString());
        }
        object = null;
        long[] lArray = null;
        if (byArray2 != null) {
            int n;
            if (byArray2.length != this.cfr_renamed_152) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruym.cfr_renamed_9("{\u001e]\u0013J\u0010F\u0005GVD\u0013VVB\u0003\\\u0002\u000f\u0014JV\\\u0017B\u0013\u000f\u0005F\fJVN\u0005\u000f\u0014C\u0019L\u001d\u000f^")).append(this.cfr_renamed_152).append(sprsun.cfr_renamed_9("x\u0018!\u000e=\tq")).toString());
            }
            object = new long[this.cfr_renamed_86];
            int n2 = n = 0;
            while (n2 < ((Object)object).length) {
                int n3 = n++;
                object[n3] = sprxkd.cfr_renamed_3562(byArray2, n3 * 8);
                n2 = n;
            }
        }
        if (byArray != null) {
            if (byArray.length != 16) {
                throw new IllegalArgumentException(spruym.cfr_renamed_9("{\u001e]\u0013J\u0010F\u0005GV[\u0001J\u0017DVB\u0003\\\u0002\u000f\u0014JV\u001e@\u000f\u0014V\u0002J\u0005"));
            }
            long[] lArray2 = new long[2];
            lArray2[0] = sprxkd.cfr_renamed_3562(byArray, 0);
            lArray2[1] = sprxkd.cfr_renamed_3562(byArray, 8);
            lArray = lArray2;
        }
        this.cfr_renamed_3563(arg0, (long[])object, lArray);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        int n;
        if (arg3 + this.cfr_renamed_152 > arg2.length) {
            throw new sprjkd(sprsun.cfr_renamed_9("\u0017\u000f,\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
        }
        if (arg1 + this.cfr_renamed_152 > arg0.length) {
            throw new sprjkd(spruym.cfr_renamed_9("f\u0018_\u0003[VM\u0003I\u0010J\u0004\u000f\u0002@\u0019\u000f\u0005G\u0019]\u0002"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152) {
            int n3 = n >> 3;
            long l = sprxkd.cfr_renamed_3562(arg0, arg1 + n);
            this.cfr_renamed_137[n3] = l;
            n2 = n += 8;
        }
        sprxkd sprxkd2 = this;
        sprxkd2.cfr_renamed_3556(sprxkd2.cfr_renamed_137, sprxkd2.cfr_renamed_137);
        n = 0;
        int n4 = n;
        while (n4 < this.cfr_renamed_152) {
            long l = this.cfr_renamed_137[n >> 3];
            int n5 = n;
            sprxkd.cfr_renamed_3561(l, arg2, arg3 + n5);
            n4 = n += 8;
        }
        return this.cfr_renamed_152;
    }

    public static long cfr_renamed_3564(long arg0, int arg1, long arg2) {
        long l = arg0 ^ arg2;
        return l >>> arg1 | l << -arg1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprxkd(int n) {
        void arg0;
        sprxkd sprxkd2 = this;
        this.cfr_renamed_91 = new long[5];
        sprxkd2.cfr_renamed_152 = arg0 / 8;
        sprxkd2.cfr_renamed_86 = this.cfr_renamed_152 / 8;
        this.cfr_renamed_137 = new long[this.cfr_renamed_86];
        this.cfr_renamed_0 = new long[2 * this.cfr_renamed_86 + 1];
        switch (n) {
            case 256: {
                sprxkd sprxkd3 = this;
                this.cfr_renamed_102 = new sprzed(sprxkd3.cfr_renamed_0, sprxkd3.cfr_renamed_91);
                return;
            }
            case 512: {
                sprxkd sprxkd4 = this;
                this.cfr_renamed_102 = new sprocd(sprxkd4.cfr_renamed_0, sprxkd4.cfr_renamed_91);
                return;
            }
            case 1024: {
                sprxkd sprxkd5 = this;
                this.cfr_renamed_102 = new sprzgd(sprxkd5.cfr_renamed_0, sprxkd5.cfr_renamed_91);
                return;
            }
        }
        throw new IllegalArgumentException(sprsun.cfr_renamed_9("36\f9\u00161\u001ex\u00184\u0015;\u0011+\u0013\"\u001fxWx.0\b=\u001f>\u0013+\u0012x\u0013+Z<\u001f>\u00136\u001f<Z/\u0013,\u0012x\u00184\u0015;\u0011x\t1\u0000=Z7\u001cxHmLtZmKjVx\u0015*ZiJjNx\u00181\u000e+"));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3563(boolean bl, long[] lArray, long[] lArray2) {
        void arg2;
        void arg0;
        this.cfr_renamed_272 = arg0;
        if (lArray != null) {
            void arg1;
            this.cfr_renamed_3559((long[])arg1);
        }
        if (arg2 != null) {
            this.cfr_renamed_3560((long[])arg2);
        }
    }

    public static /* synthetic */ int[] cfr_renamed_2444() {
        return cfr_renamed_96;
    }

    public static /* synthetic */ int[] cfr_renamed_3565() {
        return cfr_renamed_2;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, spruym.cfr_renamed_9("{\u001e]\u0013J\u0010F\u0005G[")).append(this.cfr_renamed_152 * 8).toString();
    }

    @Override
    public void cfr_renamed_41() {
    }

    public static long cfr_renamed_3566(long arg0, int arg1, long arg2) {
        return (arg0 << arg1 | arg0 >>> -arg1) ^ arg2;
    }

    public static /* synthetic */ int[] cfr_renamed_2413() {
        return cfr_renamed_112;
    }
}

