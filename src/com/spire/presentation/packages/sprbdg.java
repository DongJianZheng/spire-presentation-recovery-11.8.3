/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprixf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprud;
import java.security.SecureRandom;

public class sprbdg {
    private static final int cfr_renamed_724 = 2;
    private final int cfr_renamed_953;
    private final int cfr_renamed_133;
    private final int cfr_renamed_185;
    private final int spr\ufe34;
    private static final int cfr_renamed_82 = 16;
    private final int cfr_renamed_126;
    private final int cfr_renamed_88;
    private final sprixf cfr_renamed_31;
    private final int cfr_renamed_272;
    private final int cfr_renamed_145;
    private final int cfr_renamed_114;
    public static final int cfr_renamed_96 = 8;
    private final int cfr_renamed_105;
    private final int cfr_renamed_137;
    private final int cfr_renamed_79;
    private static final int cfr_renamed_107 = 8;
    private final short[] cfr_renamed_132;
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    private static final int cfr_renamed_86 = 128;
    private final int cfr_renamed_152;
    private final sprud cfr_renamed_112;
    private final int cfr_renamed_119;
    private static final int cfr_renamed_91 = 128;
    private final int cfr_renamed_0;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private static final int cfr_renamed_3 = 16;
    private static final int cfr_renamed_4 = 16;

    private /* synthetic */ short[] cfr_renamed_6793(short[] arg0, int arg1, int arg2) {
        int n;
        short[] sArray = new short[arg1 * arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1) {
                int n5 = n * arg1 + n3;
                short s = arg0[n3 * arg2 + n];
                sArray[n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ short[] cfr_renamed_6794(short[] arg0, short[] arg1, int arg2, int arg3) {
        int n;
        int n2 = this.cfr_renamed_79 - 1;
        short[] sArray = new short[arg2 * arg3];
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg3) {
                int n6 = n * arg3 + n4;
                short s = (short)(arg0[n * arg3 + n4] + arg1[n * arg3 + n4] & n2);
                sArray[n6] = s;
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return sArray;
    }

    public void cfr_renamed_6791(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        int n2 = 0;
        int n3 = 8 * this.cfr_renamed_88 * this.cfr_renamed_119 / 8;
        int n4 = n2;
        byte[] byArray = sproze.cfr_renamed_533(arg1, n4, n4 + n3);
        n2 += n3;
        n3 = 64 * this.cfr_renamed_119 / 8;
        int n5 = n2;
        byte[] byArray2 = sproze.cfr_renamed_533(arg1, n5, n5 + n3);
        n2 = 0;
        sprbdg sprbdg2 = this;
        n3 = sprbdg2.spr\ufe34;
        int n6 = n2;
        byte[] byArray3 = sproze.cfr_renamed_533(arg2, n6, n6 + n3);
        n2 += n3;
        n3 = 16;
        int n7 = n2;
        byte[] byArray4 = sproze.cfr_renamed_533(arg2, n7, n7 + n3);
        n2 += n3;
        n3 = sprbdg2.cfr_renamed_119 * this.cfr_renamed_88 * 8 / 8;
        int n8 = n2;
        byte[] byArray5 = sproze.cfr_renamed_533(arg2, n8, n8 + n3);
        n2 += n3;
        n3 = sprbdg2.cfr_renamed_88 * 8 * 16 / 8;
        int n9 = n2;
        byte[] byArray6 = sproze.cfr_renamed_533(arg2, n9, n9 + n3);
        short[] sArray = new short[8 * this.cfr_renamed_88];
        int n10 = n = 0;
        while (n10 < 8) {
            int n11;
            int n12 = n11 = 0;
            while (n12 < this.cfr_renamed_88) {
                int n13 = n * this.cfr_renamed_88 + n11;
                short s = sprpxe.cfr_renamed_5180(byArray6, n * this.cfr_renamed_88 * 2 + n11 * 2);
                sArray[n13] = s;
                n12 = ++n11;
            }
            n10 = ++n;
        }
        sprbdg sprbdg3 = this;
        sprbdg sprbdg4 = this;
        short[] sArray2 = sprbdg4.cfr_renamed_6793(sArray, 8, sprbdg4.cfr_renamed_88);
        n2 += n3;
        n3 = sprbdg3.cfr_renamed_133;
        int n14 = n2;
        byte[] byArray7 = sproze.cfr_renamed_533(arg2, n14, n14 + n3);
        sprbdg sprbdg5 = this;
        short[] sArray3 = sprbdg5.cfr_renamed_6795(byArray, 8, sprbdg5.cfr_renamed_88);
        short[] sArray4 = sprbdg3.cfr_renamed_6795(byArray2, 8, 8);
        short[] sArray5 = sprbdg3.cfr_renamed_6796(sArray3, 8, this.cfr_renamed_88, sArray2, this.cfr_renamed_88, 8);
        byte[] byArray8 = sprbdg3.cfr_renamed_6797(sprbdg3.cfr_renamed_6798(sArray4, sArray5, 8, 8));
        byte[] byArray9 = new byte[sprbdg3.cfr_renamed_2 + this.cfr_renamed_0];
        sprbdg3.cfr_renamed_112.cfr_renamed_1197(byArray7, 0, this.cfr_renamed_133);
        sprbdg3.cfr_renamed_112.cfr_renamed_1197(byArray8, 0, this.cfr_renamed_185);
        sprbdg sprbdg6 = this;
        sprbdg3.cfr_renamed_112.cfr_renamed_1199(byArray9, 0, sprbdg6.cfr_renamed_2 + sprbdg6.cfr_renamed_0);
        sprbdg sprbdg7 = this;
        byte[] byArray10 = sproze.cfr_renamed_533(byArray9, sprbdg7.cfr_renamed_2, sprbdg7.cfr_renamed_2 + this.cfr_renamed_0);
        byte[] byArray11 = new byte[(16 * this.cfr_renamed_88 + 64) * 2];
        sprbdg sprbdg8 = this;
        sprbdg8.cfr_renamed_112.cfr_renamed_1221((byte)-106);
        sprbdg8.cfr_renamed_112.cfr_renamed_1197(byArray9, 0, this.cfr_renamed_2);
        sprbdg3.cfr_renamed_112.cfr_renamed_1199(byArray11, 0, byArray11.length);
        short[] sArray6 = new short[16 * this.cfr_renamed_88 + 64];
        int n15 = 0;
        int n16 = n15;
        while (n16 < sArray6.length) {
            int n17 = n15++;
            sArray6[n17] = sprpxe.cfr_renamed_5180(byArray11, n17 * 2);
            n16 = n15;
        }
        sprbdg sprbdg9 = this;
        short[] sArray7 = sprbdg9.cfr_renamed_6799(sArray6, 0, 8, this.cfr_renamed_88);
        sprbdg sprbdg10 = this;
        short[] sArray8 = sprbdg10.cfr_renamed_6799(sArray6, 8 * sprbdg10.cfr_renamed_88, 8, this.cfr_renamed_88);
        short[] sArray9 = sprbdg9.cfr_renamed_31.cfr_renamed_6788(byArray4);
        sprbdg sprbdg11 = this;
        short[] sArray10 = sprbdg9.cfr_renamed_6794(sprbdg9.cfr_renamed_6796(sArray7, 8, this.cfr_renamed_88, sArray9, sprbdg11.cfr_renamed_88, sprbdg11.cfr_renamed_88), sArray8, 8, this.cfr_renamed_88);
        short[] sArray11 = sprbdg9.cfr_renamed_6799(sArray6, 16 * this.cfr_renamed_88, 8, 8);
        short[] sArray12 = sprbdg9.cfr_renamed_6795(byArray5, this.cfr_renamed_88, 8);
        short[] sArray13 = sprbdg9.cfr_renamed_6794(sprbdg9.cfr_renamed_6794(sprbdg9.cfr_renamed_6796(sArray7, 8, this.cfr_renamed_88, sArray12, this.cfr_renamed_88, 8), sArray11, 8, 8), this.cfr_renamed_485(byArray8), 8, 8);
        short s = sprbdg9.cfr_renamed_6800(sArray3, sArray4, sArray10, sArray13);
        byte[] byArray12 = sprbdg9.cfr_renamed_6801(byArray10, byArray3, s);
        sprbdg9.cfr_renamed_112.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_112.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_112.cfr_renamed_1197(byArray12, 0, byArray12.length);
        this.cfr_renamed_112.cfr_renamed_1199(arg0, 0, this.cfr_renamed_114);
    }

    private /* synthetic */ short[] cfr_renamed_6798(short[] arg0, short[] arg1, int arg2, int arg3) {
        int n;
        int n2 = this.cfr_renamed_79 - 1;
        short[] sArray = new short[arg2 * arg3];
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg3) {
                int n6 = n * arg3 + n4;
                short s = (short)(arg0[n * arg3 + n4] - arg1[n * arg3 + n4] & n2);
                sArray[n6] = s;
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ byte[] cfr_renamed_6801(byte[] arg0, byte[] arg1, short arg2) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(~arg2 & arg0[n3] & 0xFF | arg2 & arg1[n] & 0xFF);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ byte[] cfr_renamed_6802(short[] arg0) {
        int n = arg0.length;
        byte[] byArray = new byte[this.cfr_renamed_119 * n / 8];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (n2 < byArray.length && (n3 < n || n3 == n && n5 > 0)) {
            int n6 = 0;
            while (n6 < 8) {
                int n7 = Math.min(8 - n6, n5);
                short s = (short)((1 << n7) - 1);
                byte by = (byte)(n4 >> n5 - n7 & s);
                byArray[n2] = (byte)(byArray[n2] + (by << 8 - n6 - n7));
                n6 = (byte)(n6 + n7);
                byte by2 = (byte)(n5 - n7);
                n5 = by2;
                if (by2 != 0) continue;
                if (n3 >= n) break;
                n4 = arg0[n3];
                n5 = (byte)this.cfr_renamed_119;
                n3 = (short)(n3 + 1);
            }
            if (n6 != 8) continue;
            n2 = (short)(n2 + 1);
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbdg(int n, int n2, int n3, short[] sArray, sprud sprud2, sprixf sprixf2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbdg sprbdg2 = this;
        sprbdg sprbdg3 = this;
        sprbdg sprbdg4 = this;
        sprbdg sprbdg5 = this;
        this.cfr_renamed_88 = arg0;
        sprbdg5.cfr_renamed_119 = arg1;
        sprbdg5.cfr_renamed_79 = 1 << arg1;
        this.cfr_renamed_93 = arg2;
        sprbdg4.cfr_renamed_272 = arg2 * 8 * 8;
        sprbdg4.cfr_renamed_152 = this.cfr_renamed_272;
        sprbdg4.cfr_renamed_1 = sprbdg4.cfr_renamed_272;
        sprbdg4.cfr_renamed_102 = sprbdg4.cfr_renamed_272;
        sprbdg4.cfr_renamed_126 = sprbdg4.cfr_renamed_272;
        sprbdg4.cfr_renamed_953 = sprbdg4.cfr_renamed_272;
        sprbdg4.cfr_renamed_185 = sprbdg4.cfr_renamed_272 / 8;
        sprbdg4.cfr_renamed_2 = sprbdg4.cfr_renamed_152 / 8;
        sprbdg4.spr\ufe34 = sprbdg4.cfr_renamed_1 / 8;
        sprbdg4.cfr_renamed_0 = sprbdg4.cfr_renamed_102 / 8;
        sprbdg4.cfr_renamed_133 = sprbdg4.cfr_renamed_126 / 8;
        sprbdg4.cfr_renamed_114 = sprbdg4.cfr_renamed_953 / 8;
        sprbdg3.cfr_renamed_145 = arg1 * arg0 * 8 / 8 + arg1 * 8 * 8 / 8;
        sprbdg3.cfr_renamed_105 = 16 + arg1 * arg0 * 8 / 8;
        this.cfr_renamed_137 = this.spr\ufe34 + this.cfr_renamed_105 + (2 * arg0 * 8 + this.cfr_renamed_133);
        this.cfr_renamed_132 = arg3;
        sprbdg2.cfr_renamed_112 = arg4;
        sprbdg2.cfr_renamed_31 = sprixf2;
    }

    private /* synthetic */ short cfr_renamed_6800(short[] arg0, short[] arg1, short[] arg2, short[] arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            n2 = (short)(n2 | arg0[n] ^ arg2[n]);
            n3 = n = (int)((short)(n + 1));
        }
        int n4 = n = 0;
        while (n4 < arg1.length) {
            n2 = (short)(n2 | arg1[n] ^ arg3[n]);
            n4 = n = (int)((short)(n + 1));
        }
        if (n2 == 0) {
            return 0;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6789(byte[] byArray, byte[] byArray2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprbdg sprbdg2 = this;
        byte[] byArray3 = new byte[sprbdg2.spr\ufe34 + sprbdg2.cfr_renamed_2 + 16];
        secureRandom.nextBytes(byArray3);
        byte[] byArray4 = sproze.cfr_renamed_533(byArray3, 0, this.spr\ufe34);
        sprbdg sprbdg3 = this;
        sprbdg sprbdg4 = this;
        byte[] byArray5 = sproze.cfr_renamed_533(byArray3, sprbdg3.spr\ufe34, sprbdg4.spr\ufe34 + sprbdg4.cfr_renamed_2);
        sprbdg sprbdg5 = this;
        sprbdg sprbdg6 = this;
        byte[] byArray6 = sproze.cfr_renamed_533(byArray3, sprbdg5.spr\ufe34 + sprbdg5.cfr_renamed_2, sprbdg6.spr\ufe34 + sprbdg6.cfr_renamed_2 + 16);
        byte[] byArray7 = new byte[16];
        sprbdg3.cfr_renamed_112.cfr_renamed_1197(byArray6, 0, byArray6.length);
        this.cfr_renamed_112.cfr_renamed_1199(byArray7, 0, byArray7.length);
        short[] sArray = this.cfr_renamed_31.cfr_renamed_6788(byArray7);
        sprbdg sprbdg7 = this;
        byte[] byArray8 = new byte[2 * sprbdg7.cfr_renamed_88 * 8 * 2];
        sprbdg7.cfr_renamed_112.cfr_renamed_1221((byte)95);
        this.cfr_renamed_112.cfr_renamed_1197(byArray5, 0, byArray5.length);
        this.cfr_renamed_112.cfr_renamed_1199(byArray8, 0, byArray8.length);
        short[] sArray2 = new short[2 * this.cfr_renamed_88 * 8];
        int n = 0;
        int n2 = n;
        while (n2 < sArray2.length) {
            int n3 = n++;
            sArray2[n3] = sprpxe.cfr_renamed_5180(byArray8, n3 * 2);
            n2 = n;
        }
        sprbdg sprbdg8 = this;
        short[] sArray3 = sprbdg8.cfr_renamed_6799(sArray2, 0, 8, this.cfr_renamed_88);
        short[] sArray4 = sprbdg8.cfr_renamed_6793(sArray3, 8, this.cfr_renamed_88);
        sprbdg sprbdg9 = this;
        short[] sArray5 = sprbdg9.cfr_renamed_6799(sArray2, this.cfr_renamed_88 * 8, sprbdg9.cfr_renamed_88, 8);
        sprbdg sprbdg10 = this;
        byte[] byArray9 = sprbdg8.cfr_renamed_6802(sprbdg8.cfr_renamed_6794(sprbdg8.cfr_renamed_6796(sArray, sprbdg10.cfr_renamed_88, sprbdg10.cfr_renamed_88, sArray4, this.cfr_renamed_88, 8), sArray5, this.cfr_renamed_88, 8));
        System.arraycopy(sproze.cfr_renamed_543(byArray7, byArray9), 0, arg0, 0, this.cfr_renamed_105);
        byte[] byArray10 = new byte[sprbdg8.cfr_renamed_133];
        void v11 = arg0;
        sprbdg8.cfr_renamed_112.cfr_renamed_1197((byte[])v11, 0, ((void)v11).length);
        this.cfr_renamed_112.cfr_renamed_1199(byArray10, 0, byArray10.length);
        sprbdg sprbdg11 = this;
        System.arraycopy(sproze.cfr_renamed_543(byArray4, (byte[])arg0), 0, arg1, 0, sprbdg11.spr\ufe34 + sprbdg11.cfr_renamed_105);
        int n4 = 0;
        int n5 = n4;
        while (n5 < 8) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < this.cfr_renamed_88) {
                byte[] byArray11 = sprpxe.cfr_renamed_5167(sArray3[n4 * this.cfr_renamed_88 + n6]);
                sprbdg sprbdg12 = this;
                int n8 = n6 * 2;
                System.arraycopy(byArray11, 0, arg1, sprbdg12.spr\ufe34 + sprbdg12.cfr_renamed_105 + n4 * this.cfr_renamed_88 * 2 + n8, 2);
                n7 = ++n6;
            }
            n5 = ++n4;
        }
        sprbdg sprbdg13 = this;
        System.arraycopy(byArray10, 0, arg1, sprbdg13.cfr_renamed_137 - sprbdg13.cfr_renamed_133, this.cfr_renamed_133);
    }

    public int cfr_renamed_6092() {
        return this.cfr_renamed_114;
    }

    private /* synthetic */ short[] cfr_renamed_6795(byte[] arg0, int arg1, int arg2) {
        short[] sArray = new short[arg1 * arg2];
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n < sArray.length && (n2 < arg0.length || n2 == arg0.length && n4 > 0)) {
            int n5 = 0;
            while (n5 < this.cfr_renamed_119) {
                int n6 = Math.min(this.cfr_renamed_119 - n5, n4);
                short s = (short)((1 << n6) - 1 & 0xFFFF);
                byte by = (byte)((n3 & 0xFF) >>> (n4 & 0xFF) - n6 & (s & 0xFFFF) & 0xFF);
                sArray[n] = (short)((sArray[n] & 0xFFFF) + ((by & 0xFF) << this.cfr_renamed_119 - (n5 & 0xFF) - n6) & 0xFFFF);
                n5 = (byte)(n5 + n6);
                n4 = (byte)(n4 - n6);
                n3 = (byte)(n3 & ~(s << n4));
                if (n4 != 0) continue;
                if (n2 >= arg0.length) break;
                n3 = arg0[n2];
                n4 = 8;
                n2 = (short)(n2 + 1);
            }
            if (n5 != this.cfr_renamed_119) continue;
            n = (short)(n + 1);
        }
        return sArray;
    }

    private /* synthetic */ short[] cfr_renamed_6799(short[] arg0, int arg1, int arg2, int arg3) {
        int n;
        short[] sArray = new short[arg2 * arg3];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg3) {
                int n5 = n * arg3 + n3;
                short s = this.cfr_renamed_6803(arg0[n * arg3 + n3 + arg1]);
                sArray[n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ short[] cfr_renamed_485(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = 1;
        short[] sArray = new short[64];
        int n4 = n = 0;
        while (n4 < 8) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < 8) {
                int n7;
                int n8 = 0;
                int n9 = n7 = 0;
                while (n9 < this.cfr_renamed_93) {
                    int n10 = (arg0[n2] & n3) == n3 ? 1 : 0;
                    n8 += (1 << n7) * n10;
                    byte by = (byte)(n3 << 1);
                    n3 = by;
                    if (by == 0) {
                        ++n2;
                        n3 = 1;
                    }
                    n9 = ++n7;
                }
                int n11 = n * 8 + n5;
                sArray[n11] = (short)(n8 * (this.cfr_renamed_79 / (1 << this.cfr_renamed_93)));
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ short cfr_renamed_6803(short arg0) {
        int n;
        short s = (short)((arg0 & 0xFFFF) >>> 1);
        short s2 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_132.length) {
            if (s > this.cfr_renamed_132[n]) {
                s2 = (short)(s2 + 1);
            }
            n2 = ++n;
        }
        if ((arg0 & 0xFFFF) % 2 == 1) {
            s2 = (short)(s2 * -1 & 0xFFFF);
        }
        return s2;
    }

    private /* synthetic */ byte[] cfr_renamed_6797(short[] arg0) {
        int n;
        int n2 = 0;
        int n3 = 8;
        int n4 = 8;
        short s = (short)((1 << this.cfr_renamed_93) - 1);
        short s2 = (short)((1 << this.cfr_renamed_119) - 1);
        byte[] byArray = new byte[n3 * this.cfr_renamed_93];
        int n5 = n = 0;
        while (n5 < n4) {
            int n6;
            long l = 0L;
            int n7 = n6 = 0;
            while (n7 < n3) {
                sprbdg sprbdg2 = this;
                sprbdg sprbdg3 = this;
                short s3 = (short)((arg0[n2] & s2) + (1 << sprbdg2.cfr_renamed_119 - sprbdg2.cfr_renamed_93 - 1) >> sprbdg3.cfr_renamed_119 - sprbdg3.cfr_renamed_93);
                ++n2;
                l |= (long)(s3 & s) << this.cfr_renamed_93 * n6;
                n7 = ++n6;
            }
            int n8 = n6 = 0;
            while (n8 < this.cfr_renamed_93) {
                int n9 = n * this.cfr_renamed_93 + n6;
                byte by = (byte)(l >> 8 * n6 & 0xFFL);
                byArray[n9] = by;
                n8 = ++n6;
            }
            n5 = ++n;
        }
        return byArray;
    }

    public int cfr_renamed_6093() {
        return this.cfr_renamed_137;
    }

    public int cfr_renamed_6096() {
        return this.cfr_renamed_145;
    }

    public void cfr_renamed_6790(byte[] arg0, byte[] arg1, byte[] arg2, SecureRandom arg3) {
        int n;
        byte[] byArray = sproze.cfr_renamed_533(arg2, 0, 16);
        byte[] byArray2 = sproze.cfr_renamed_533(arg2, 16, this.cfr_renamed_105);
        sprbdg sprbdg2 = this;
        byte[] byArray3 = new byte[sprbdg2.cfr_renamed_185];
        arg3.nextBytes(byArray3);
        byte[] byArray4 = new byte[sprbdg2.cfr_renamed_133];
        sprbdg2.cfr_renamed_112.cfr_renamed_1197(arg2, 0, this.cfr_renamed_105);
        sprbdg2.cfr_renamed_112.cfr_renamed_1199(byArray4, 0, this.cfr_renamed_133);
        sprbdg sprbdg3 = this;
        sprbdg sprbdg4 = this;
        byte[] byArray5 = new byte[sprbdg3.cfr_renamed_152 + sprbdg4.cfr_renamed_102];
        sprbdg3.cfr_renamed_112.cfr_renamed_1197(byArray4, 0, this.cfr_renamed_133);
        sprbdg4.cfr_renamed_112.cfr_renamed_1197(byArray3, 0, this.cfr_renamed_185);
        sprbdg sprbdg5 = this;
        sprbdg3.cfr_renamed_112.cfr_renamed_1199(byArray5, 0, sprbdg5.cfr_renamed_2 + sprbdg5.cfr_renamed_0);
        byte[] byArray6 = sproze.cfr_renamed_533(byArray5, 0, this.cfr_renamed_2);
        sprbdg sprbdg6 = this;
        byte[] byArray7 = sproze.cfr_renamed_533(byArray5, sprbdg6.cfr_renamed_2, sprbdg6.cfr_renamed_2 + this.cfr_renamed_0);
        byte[] byArray8 = new byte[(16 * this.cfr_renamed_88 + 64) * 2];
        this.cfr_renamed_112.cfr_renamed_1221((byte)-106);
        sprbdg2.cfr_renamed_112.cfr_renamed_1197(byArray6, 0, byArray6.length);
        this.cfr_renamed_112.cfr_renamed_1199(byArray8, 0, byArray8.length);
        short[] sArray = new short[byArray8.length / 2];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n++;
            sArray[n3] = sprpxe.cfr_renamed_5180(byArray8, n3 * 2);
            n2 = n;
        }
        sprbdg sprbdg7 = this;
        short[] sArray2 = sprbdg7.cfr_renamed_6799(sArray, 0, 8, this.cfr_renamed_88);
        sprbdg sprbdg8 = this;
        short[] sArray3 = sprbdg8.cfr_renamed_6799(sArray, 8 * sprbdg8.cfr_renamed_88, 8, this.cfr_renamed_88);
        short[] sArray4 = sprbdg7.cfr_renamed_31.cfr_renamed_6788(byArray);
        sprbdg sprbdg9 = this;
        byte[] byArray9 = sprbdg7.cfr_renamed_6802(sprbdg7.cfr_renamed_6794(sprbdg7.cfr_renamed_6796(sArray2, 8, this.cfr_renamed_88, sArray4, sprbdg9.cfr_renamed_88, sprbdg9.cfr_renamed_88), sArray3, 8, this.cfr_renamed_88));
        short[] sArray5 = sprbdg7.cfr_renamed_6799(sArray, 16 * this.cfr_renamed_88, 8, 8);
        short[] sArray6 = sprbdg7.cfr_renamed_6795(byArray2, this.cfr_renamed_88, 8);
        short[] sArray7 = sprbdg7.cfr_renamed_6794(sprbdg7.cfr_renamed_6796(sArray2, 8, this.cfr_renamed_88, sArray6, this.cfr_renamed_88, 8), sArray5, 8, 8);
        short[] sArray8 = sprbdg7.cfr_renamed_485(byArray3);
        byte[] byArray10 = sprbdg7.cfr_renamed_6802(sprbdg7.cfr_renamed_6794(sArray7, sArray8, 8, 8));
        System.arraycopy(sproze.cfr_renamed_543(byArray9, byArray10), 0, arg0, 0, this.cfr_renamed_145);
        sprbdg7.cfr_renamed_112.cfr_renamed_1197(byArray9, 0, byArray9.length);
        this.cfr_renamed_112.cfr_renamed_1197(byArray10, 0, byArray10.length);
        sprbdg sprbdg10 = this;
        sprbdg10.cfr_renamed_112.cfr_renamed_1197(byArray7, 0, this.cfr_renamed_0);
        sprbdg10.cfr_renamed_112.cfr_renamed_1199(arg1, 0, this.spr\ufe34);
    }

    public int cfr_renamed_6094() {
        return this.cfr_renamed_105;
    }

    private /* synthetic */ short[] cfr_renamed_6796(short[] arg0, int arg1, int arg2, short[] arg3, int arg4, int arg5) {
        int n;
        int n2 = this.cfr_renamed_79 - 1;
        short[] sArray = new short[arg1 * arg5];
        int n3 = n = 0;
        while (n3 < arg1) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg5) {
                int n6;
                int n7 = 0;
                int n8 = n6 = 0;
                while (n8 < arg2) {
                    short s = arg0[n * arg2 + n6];
                    short s2 = arg3[n6 * arg5 + n4];
                    n7 += s * s2;
                    n8 = ++n6;
                }
                int n9 = n * arg5 + n4;
                sArray[n9] = (short)(n7 & n2);
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return sArray;
    }
}

