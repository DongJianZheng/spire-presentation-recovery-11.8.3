/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;

public class sprszf {
    public static final int cfr_renamed_2 = 255;
    public static final byte[] cfr_renamed_3;
    public static final byte[][] cfr_renamed_4;

    private static /* synthetic */ short cfr_renamed_6176(short arg0) {
        int n = arg0 << 1;
        return (short)((n ^= (arg0 >>> 1) * 7) & 0xFF);
    }

    static {
        long l;
        int n;
        cfr_renamed_4 = new byte[256][256];
        cfr_renamed_3 = new byte[256];
        long l2 = 0x101010101010101L;
        int n2 = n = 1;
        while (n2 <= 255) {
            int n3;
            l = 506097522914230528L;
            int n4 = n3 = 0;
            while (n4 < 256) {
                sprpxe.cfr_renamed_444(sprszf.cfr_renamed_6177(l2, l), cfr_renamed_4[n], n3);
                l += 0x808080808080808L;
                n4 = n3 += 8;
            }
            l2 += 0x101010101010101L;
            n2 = ++n;
        }
        l2 = 506097522914230528L;
        int n5 = n = 0;
        while (n5 < 256) {
            l = sprszf.cfr_renamed_6178(l2);
            sprpxe.cfr_renamed_444(l, cfr_renamed_3, n);
            l2 += 0x808080808080808L;
            n5 = n += 8;
        }
    }

    private static /* synthetic */ long cfr_renamed_6179(long arg0) {
        long l = sprszf.cfr_renamed_6180(arg0);
        long l2 = sprszf.cfr_renamed_6181(l & 0xCCCCCCCCCCCCCCCCL);
        return l ^ l2 >>> 2;
    }

    private static /* synthetic */ long cfr_renamed_6177(long arg0, long arg1) {
        long l = sprszf.cfr_renamed_6182(arg0, arg1);
        long l2 = l & 0xF0F0F0F0F0F0F0FL;
        long l3 = l & 0xF0F0F0F0F0F0F0F0L;
        long l4 = (arg0 << 4 ^ arg0) & 0xF0F0F0F0F0F0F0F0L ^ l3 >>> 4;
        long l5 = (arg1 << 4 ^ arg1) & 0xF0F0F0F0F0F0F0F0L ^ 0x808080808080808L;
        return sprszf.cfr_renamed_6182(l4, l5) ^ l2 << 4 ^ l2;
    }

    private static /* synthetic */ long cfr_renamed_6178(long arg0) {
        long l = sprszf.cfr_renamed_6183(arg0);
        long l2 = sprszf.cfr_renamed_6183(l);
        long l3 = sprszf.cfr_renamed_6183(l2);
        long l4 = sprszf.cfr_renamed_6177(sprszf.cfr_renamed_6177(l2, l), l3);
        long l5 = sprszf.cfr_renamed_6183(l4);
        l5 = sprszf.cfr_renamed_6183(l5);
        l5 = sprszf.cfr_renamed_6183(l5);
        long l6 = sprszf.cfr_renamed_6183(sprszf.cfr_renamed_6177(l5, l4));
        return sprszf.cfr_renamed_6177(l, l6);
    }

    private static /* synthetic */ short cfr_renamed_6184(short arg0, short arg1) {
        int n = arg0 * (arg1 & 1);
        return (short)((n ^= sprszf.cfr_renamed_6176(arg0) * (arg1 >>> 1)) & 0xFF);
    }

    private static /* synthetic */ short cfr_renamed_6185(short arg0) {
        short s = (short)(arg0 & 0xF & 0xFF);
        short s2 = (short)(arg0 >>> 4 & 0xFF);
        s2 = sprszf.cfr_renamed_6186(s2);
        short s3 = sprszf.cfr_renamed_6187(s2);
        return (short)((s2 << 4 ^ s3 ^ sprszf.cfr_renamed_6186(s)) & 0xFF);
    }

    public static long cfr_renamed_6188(long arg0) {
        return sprszf.cfr_renamed_6178(arg0);
    }

    private static /* synthetic */ short cfr_renamed_6187(short arg0) {
        short s = (short)(arg0 & 3 & 0xFF);
        short s2 = (short)(arg0 >>> 2 & 0xFF);
        int n = sprszf.cfr_renamed_6176((short)(s ^ s2)) << 2;
        return (short)((n |= sprszf.cfr_renamed_6189(s2)) & 0xFF);
    }

    private static /* synthetic */ long cfr_renamed_6181(long arg0) {
        long l = arg0 & 0x5555555555555555L;
        long l2 = arg0 & 0xAAAAAAAAAAAAAAAAL;
        return l2 ^ l << 1 ^ l2 >>> 1;
    }

    public static long cfr_renamed_6190(long arg0, long arg1) {
        return sprszf.cfr_renamed_6177(arg0, arg1);
    }

    private static /* synthetic */ long cfr_renamed_6191(long arg0, long arg1) {
        long l = (arg0 << 1 & arg1 ^ arg1 << 1 & arg0) & 0xAAAAAAAAAAAAAAAAL;
        long l2 = arg0 & arg1;
        return l2 ^ l ^ (l2 & 0xAAAAAAAAAAAAAAAAL) >>> 1;
    }

    private static /* synthetic */ long cfr_renamed_6183(long arg0) {
        long l = sprszf.cfr_renamed_6179(arg0);
        long l2 = sprszf.cfr_renamed_6192(l & 0xF0F0F0F0F0F0F0F0L);
        return l ^ l2 >>> 4;
    }

    private static /* synthetic */ short cfr_renamed_6193(short arg0, short arg1) {
        short s = (short)(arg0 & 0xF & 0xFF);
        short s2 = (short)(arg0 >>> 4 & 0xFF);
        short s3 = (short)(arg1 & 0xF & 0xFF);
        short s4 = (short)(arg1 >>> 4 & 0xFF);
        short s5 = sprszf.cfr_renamed_6194(s, s3);
        short s6 = sprszf.cfr_renamed_6194(s2, s4);
        short s7 = (short)(sprszf.cfr_renamed_6194((short)(s ^ s2), (short)(s3 ^ s4)) ^ s5);
        short s8 = sprszf.cfr_renamed_6187(s6);
        return (short)((s7 << 4 ^ s5 ^ s8) & 0xFF);
    }

    private static /* synthetic */ short cfr_renamed_6194(short arg0, short arg1) {
        short s = (short)(arg0 & 3 & 0xFF);
        short s2 = (short)(arg0 >>> 2 & 0xFF);
        short s3 = (short)(arg1 & 3 & 0xFF);
        short s4 = (short)(arg1 >>> 2 & 0xFF);
        short s5 = sprszf.cfr_renamed_6184(s, s3);
        short s6 = sprszf.cfr_renamed_6184(s2, s4);
        short s7 = (short)(sprszf.cfr_renamed_6184((short)(s ^ s2), (short)(s3 ^ s4)) ^ s5);
        short s8 = sprszf.cfr_renamed_6176(s6);
        return (short)((s7 << 2 ^ s5 ^ s8) & 0xFF);
    }

    public static short cfr_renamed_1274(short arg0, short arg1) {
        return (short)(arg0 ^ arg1);
    }

    private static /* synthetic */ short cfr_renamed_6186(short arg0) {
        short s = (short)(arg0 & 3 & 0xFF);
        short s2 = (short)(arg0 >>> 2 & 0xFF);
        s2 = sprszf.cfr_renamed_6195(s2);
        short s3 = sprszf.cfr_renamed_6176(s2);
        return (short)((s2 << 2 ^ s3 ^ sprszf.cfr_renamed_6195(s)) & 0xFF);
    }

    public static short cfr_renamed_1273(short arg0) {
        return (short)(cfr_renamed_3[arg0] & 0xFF);
    }

    private static /* synthetic */ short cfr_renamed_6195(short arg0) {
        short s = arg0;
        return (short)((s ^ s >>> 1) & 0xFF);
    }

    private static /* synthetic */ long cfr_renamed_6192(long arg0) {
        long l = arg0 & 0x3333333333333333L;
        long l2 = arg0 & 0xCCCCCCCCCCCCCCCCL;
        return sprszf.cfr_renamed_6181(l << 2 ^ l2 ^ l2 >>> 2) ^ l2 >>> 2;
    }

    private static /* synthetic */ long cfr_renamed_6182(long arg0, long arg1) {
        long l = sprszf.cfr_renamed_6191(arg0, arg1);
        long l2 = l & 0x3333333333333333L;
        long l3 = l & 0xCCCCCCCCCCCCCCCCL;
        long l4 = (arg0 << 2 ^ arg0) & 0xCCCCCCCCCCCCCCCCL ^ l3 >>> 2;
        long l5 = (arg1 << 2 ^ arg1) & 0xCCCCCCCCCCCCCCCCL ^ 0x2222222222222222L;
        return sprszf.cfr_renamed_6191(l4, l5) ^ l2 << 2 ^ l2;
    }

    private static /* synthetic */ short cfr_renamed_6196(short arg0) {
        short s = sprszf.cfr_renamed_6185(arg0);
        short s2 = sprszf.cfr_renamed_6185(s);
        short s3 = sprszf.cfr_renamed_6185(s2);
        short s4 = sprszf.cfr_renamed_6193(sprszf.cfr_renamed_6193(s2, s), s3);
        short s5 = sprszf.cfr_renamed_6185(s4);
        s5 = sprszf.cfr_renamed_6185(s5);
        s5 = sprszf.cfr_renamed_6185(s5);
        short s6 = sprszf.cfr_renamed_6185(sprszf.cfr_renamed_6193(s5, s4));
        return sprszf.cfr_renamed_6193(s, s6);
    }

    public static long cfr_renamed_6197(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    public static short cfr_renamed_1275(short arg0, short arg1) {
        return (short)(cfr_renamed_4[arg0][arg1] & 0xFF);
    }

    private static /* synthetic */ long cfr_renamed_6180(long arg0) {
        long l = arg0 & 0xAAAAAAAAAAAAAAAAL;
        return arg0 ^ l >>> 1;
    }

    private static /* synthetic */ short cfr_renamed_6189(short arg0) {
        int n = arg0 - 2 >>> 1;
        return (short)((n & arg0 * 3 | ~n & arg0 - 1) & 0xFF);
    }
}

