/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlog;
import com.spire.presentation.packages.sprxlh;

public final class sprohg
extends sprlog {
    @Override
    public short cfr_renamed_7135(short arg0, short arg1) {
        sprohg sprohg2 = this;
        short s = arg0;
        short s2 = sprohg2.cfr_renamed_7136(s, s);
        short s3 = sprohg2.cfr_renamed_7137(s2, s2);
        short s4 = sprohg2.cfr_renamed_7138(s3);
        s4 = sprohg2.cfr_renamed_7137(s4, s3);
        s4 = sprohg2.cfr_renamed_7138(s4);
        s4 = sprohg2.cfr_renamed_7137(s4, s3);
        return sprohg2.cfr_renamed_7136(s4, arg1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_7139(int n, int[] nArray, short[] sArray, short[] sArray2, short[] sArray3, int[] nArray2) {
        void arg5;
        short s;
        void var8_8;
        void arg0;
        int n2;
        void arg4;
        void arg3;
        arg5[0] = this.cfr_renamed_7140((short)arg3[0], (short)arg4[0]);
        int n3 = n2 = 1;
        while (n3 < arg0) {
            int n4;
            int n5 = n2;
            arg5[n5 + n5 - 1] = false;
            var8_8 = arg3[n5];
            s = arg4[n2];
            int n6 = n4 = 0;
            while (n6 < n2) {
                void v3 = arg5;
                int n7 = n2 + n4;
                int n8 = v3[n7] ^ this.cfr_renamed_7141((short)var8_8, (short)arg4[n4], (short)arg3[n4], s);
                v3[n7] = n8;
                n6 = ++n4;
            }
            int n9 = n2++;
            arg5[n9 + n9] = this.cfr_renamed_7140((short)var8_8, s);
            n3 = n2;
        }
        int n10 = n2 = (arg0 - true) * 2;
        while (n10 >= arg0) {
            void arg1;
            var8_8 = arg5[n2];
            short s2 = s = 0;
            while (s2 < ((void)arg1).length) {
                void v9 = arg5;
                int n11 = n2 - arg0 + arg1[s];
                v9[n11] = v9[n11] ^ var8_8;
                s2 = ++s;
            }
            n10 = --n2;
        }
        int n12 = n2 = 0;
        while (n12 < arg0) {
            int n13 = n2++;
            arg2[n13] = this.cfr_renamed_7142((int)arg5[n13]);
            n12 = n2;
        }
    }

    @Override
    public short cfr_renamed_7142(int arg0) {
        int n = arg0 & 0x1FFF;
        int n2 = arg0 >>> 13;
        int n3 = n2 << 4 ^ n2 << 3 ^ n2 << 1;
        int n4 = n3 >>> 13;
        int n5 = n3 & 0x1FFF;
        int n6 = n4 << 4 ^ n4 << 3 ^ n4 << 1;
        return (short)(n ^ n2 ^ n4 ^ n5 ^ n6);
    }

    @Override
    public int cfr_renamed_7143(short arg0) {
        return sprxlh.cfr_renamed_7144(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_7145(int n, int[] nArray, short[] sArray, short[] sArray2, int[] nArray2) {
        void arg4;
        void arg0;
        int n2;
        void arg3;
        arg4[0] = this.cfr_renamed_7143((short)arg3[0]);
        int n3 = n2 = 1;
        while (n3 < arg0) {
            void v1 = arg4;
            int n4 = n2;
            v1[n4 + n4 - 1] = false;
            int n5 = n2 + n2;
            int n6 = this.cfr_renamed_7143((short)arg3[n2]);
            v1[n5] = n6;
            n3 = ++n2;
        }
        int n7 = n2 = (arg0 - true) * 2;
        while (n7 >= arg0) {
            void arg1;
            int n8;
            void var7_7 = arg4[n2];
            int n9 = n8 = 0;
            while (n9 < ((void)arg1).length) {
                void v7 = arg4;
                int n10 = n2 - arg0 + arg1[n8];
                v7[n10] = v7[n10] ^ var7_7;
                n9 = ++n8;
            }
            n7 = --n2;
        }
        int n11 = n2 = 0;
        while (n11 < arg0) {
            int n12 = n2++;
            arg2[n12] = this.cfr_renamed_7142((int)arg4[n12]);
            n11 = n2;
        }
    }

    @Override
    public short cfr_renamed_7146(short arg0) {
        int n = sprxlh.cfr_renamed_7144(arg0);
        return this.cfr_renamed_7142(n);
    }

    private /* synthetic */ short cfr_renamed_7137(short arg0, short arg1) {
        long l = arg0;
        long l2 = arg1;
        long l3 = (l2 << 18) * (l & 0x40L);
        long l4 = l;
        l = l4 ^ l4 << 21;
        l3 ^= (l2 << 0) * (l & 0x10000001L);
        l3 ^= (l2 << 3) * (l & 0x20000002L);
        l3 ^= (l2 << 6) * (l & 0x40000004L);
        l3 ^= (l2 << 9) * (l & 0x80000008L);
        l3 ^= (l2 << 12) * (l & 0x100000010L);
        long l5 = (l3 ^= (l2 << 15) * (l & 0x200000020L)) & 0x1FFFF80000000000L;
        l3 ^= l5 >>> 18 ^ l5 >>> 20 ^ l5 >>> 24 ^ l5 >>> 26;
        l5 = l3 & 0x7FFFC000000L;
        return this.cfr_renamed_7142((int)(l3 ^= l5 >>> 18 ^ l5 >>> 20 ^ l5 >>> 24 ^ l5 >>> 26) & 0x3FFFFFF);
    }

    @Override
    public short cfr_renamed_7147(short arg0, short arg1) {
        int n;
        short s = arg0;
        short s2 = arg1;
        int n2 = s * (s2 & 1);
        int n3 = n = 1;
        while (n3 < 13) {
            int n4 = s2 & 1 << n;
            n2 ^= s * n4;
            n3 = ++n;
        }
        return this.cfr_renamed_7142(n2);
    }

    @Override
    public short cfr_renamed_7148(short arg0) {
        return this.cfr_renamed_7135(arg0, (short)1);
    }

    @Override
    public int cfr_renamed_7140(short arg0, short arg1) {
        int n;
        short s = arg0;
        short s2 = arg1;
        int n2 = s * (s2 & 1);
        int n3 = n = 1;
        while (n3 < 13) {
            int n4 = s2 & 1 << n;
            n2 ^= s * n4;
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ short cfr_renamed_7136(short arg0, short arg1) {
        long l = arg0;
        long l2 = arg1;
        long l3 = (l2 << 6) * (l & 0x40L);
        long l4 = l;
        l = l4 ^ l4 << 7;
        l3 ^= (l2 << 0) * (l & 0x4001L);
        l3 ^= (l2 << 1) * (l & 0x8002L);
        l3 ^= (l2 << 2) * (l & 0x10004L);
        l3 ^= (l2 << 3) * (l & 0x20008L);
        l3 ^= (l2 << 4) * (l & 0x40010L);
        long l5 = (l3 ^= (l2 << 5) * (l & 0x80020L)) & 0x1FFC000000L;
        return this.cfr_renamed_7142((int)(l3 ^= l5 >>> 18 ^ l5 >>> 20 ^ l5 >>> 24 ^ l5 >>> 26) & 0x3FFFFFF);
    }

    private /* synthetic */ short cfr_renamed_7138(short arg0) {
        int n = sprxlh.cfr_renamed_7144(arg0);
        sprohg sprohg2 = this;
        arg0 = sprohg2.cfr_renamed_7142(n);
        return sprohg2.cfr_renamed_7142(sprxlh.cfr_renamed_7144(arg0));
    }

    private /* synthetic */ int cfr_renamed_7141(short arg0, short arg1, short arg2, short arg3) {
        int n;
        short s = arg0;
        short s2 = arg1;
        short s3 = arg2;
        short s4 = arg3;
        int n2 = s * (s2 & 1);
        int n3 = s3 * (s4 & 1);
        int n4 = n = 1;
        while (n4 < 13) {
            n2 ^= s * (s2 & 1 << n);
            int n5 = s4 & 1 << n;
            n3 ^= s3 * n5;
            n4 = ++n;
        }
        return n2 ^ n3;
    }
}

