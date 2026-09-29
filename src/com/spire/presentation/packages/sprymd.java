/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprzra;

public class sprymd
implements sprko {
    private int cfr_renamed_107;
    public long[] cfr_renamed_132;
    private int cfr_renamed_102;
    private static int[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    public long[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private static long[] cfr_renamed_2;
    public long[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3798(int arg0, int arg1) {
        if (arg0 + arg1 != 1600) {
            throw new IllegalStateException(spregm.cfr_renamed_9("%3#7wyw16\"61>&.rvowcabg"));
        }
        if (arg0 <= 0 || arg0 >= 1600 || arg0 % 64 != 0) {
            throw new IllegalStateException(sprhsh.cfr_renamed_9("(=72-:%s3256a% ?46"));
        }
        sprymd sprymd2 = this;
        sprymd sprymd3 = this;
        sprymd sprymd4 = this;
        sprymd sprymd5 = this;
        sprymd5.cfr_renamed_152 = arg0;
        sprymd5.cfr_renamed_112 = 0;
        sprzra.cfr_renamed_492(sprymd4.cfr_renamed_0, (byte)0);
        sprzra.cfr_renamed_492(sprymd4.cfr_renamed_4, (byte)0);
        sprymd4.cfr_renamed_102 = 0;
        sprymd3.cfr_renamed_91 = 0;
        sprymd3.cfr_renamed_107 = 0;
        sprymd2.cfr_renamed_112 = arg1 / 2;
        sprymd2.cfr_renamed_86 = new byte[arg0 / 8];
        this.cfr_renamed_1 = new byte[1];
    }

    private /* synthetic */ void cfr_renamed_3799(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 5) {
                int n5;
                int n6 = n5 = n + 5 * n3;
                arg0[n6] = cfr_renamed_93[n6] != 0 ? arg0[n5] << cfr_renamed_93[n5] ^ arg0[n5] >>> 64 - cfr_renamed_93[n5] : arg0[n5];
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprymd sprymd2 = this;
        sprymd sprymd3 = this;
        sprymd3.cfr_renamed_3800(arg0, arg1, sprymd3.cfr_renamed_112);
        sprymd2.cfr_renamed_41();
        return sprymd2.cfr_renamed_1218();
    }

    private /* synthetic */ void cfr_renamed_3801(long[] arg0) {
        int n;
        System.arraycopy(arg0, 0, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 5) {
                int n5 = n3 + 5 * ((2 * n + 3 * n3) % 5);
                long l = this.cfr_renamed_119[n + 5 * n3];
                arg0[n5] = l;
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3802(long[] arg0, int arg1) {
        arg0[0] = arg0[0] ^ cfr_renamed_2[arg1];
    }

    public sprymd(int n) {
        sprymd sprymd2 = this;
        sprymd sprymd3 = this;
        sprymd3.cfr_renamed_0 = new byte[200];
        sprymd3.cfr_renamed_4 = new byte[192];
        sprymd2.cfr_renamed_3 = new long[5];
        sprymd2.cfr_renamed_119 = new long[25];
        this.cfr_renamed_132 = new long[5];
        this.cfr_renamed_3446(n);
    }

    @Override
    public void cfr_renamed_41() {
        sprymd sprymd2 = this;
        sprymd2.cfr_renamed_3446(sprymd2.cfr_renamed_112);
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_152 / 8;
    }

    private /* synthetic */ void cfr_renamed_3803(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 5) {
                int n5 = n3;
                long l = arg0[n5 + 5 * n] ^ (arg0[(n3 + 1) % 5 + 5 * n] ^ 0xFFFFFFFFFFFFFFFFL) & arg0[(n3 + 2) % 5 + 5 * n];
                this.cfr_renamed_132[n5] = l;
                n4 = ++n3;
            }
            int n6 = n3 = 0;
            while (n6 < 5) {
                int n7 = n3 + 5 * n;
                long l = this.cfr_renamed_132[n3];
                arg0[n7] = l;
                n6 = ++n3;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3804(byte[] arg0, int arg1, long arg2) {
        if (arg2 % 8L == 0L) {
            this.cfr_renamed_3805(arg0, arg1, arg2);
            return;
        }
        long l = arg2;
        this.cfr_renamed_3805(arg0, arg1, l - l % 8L);
        byte[] byArray = new byte[]{(byte)(arg0[arg1 + (int)(arg2 / 8L)] >> (int)(8L - arg2 % 8L))};
        this.cfr_renamed_3805(byArray, arg1, arg2 % 8L);
    }

    private /* synthetic */ void cfr_renamed_3806(int arg0, int arg1) {
        int n;
        int n2 = n = arg0;
        while (n2 != arg0 + arg1) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_3807(long[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 25) {
            int n3;
            int n4 = n;
            arg0[n4] = 0L;
            int n5 = n4 * 8;
            int n6 = n3 = 0;
            while (n6 < 8) {
                int n7 = n;
                long l = arg0[n7] | ((long)arg1[n5 + n3] & 0xFFL) << 8 * n3;
                arg0[n7] = l;
                n6 = ++n3;
            }
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprymd sprymd2 = this;
        sprymd2.cfr_renamed_1[0] = arg0;
        sprymd2.cfr_renamed_3804(sprymd2.cfr_renamed_1, 0, 8L);
    }

    private /* synthetic */ void cfr_renamed_3808(byte[] arg0, byte[] arg1, int arg2) {
        this.cfr_renamed_3809(arg0, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_3810(byte[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 25) {
            int n3;
            int n4 = n * 8;
            int n5 = n3 = 0;
            while (n5 < 8) {
                int n6 = n4 + n3;
                byte by = (byte)(arg1[n] >>> 8 * n3 & 0xFFL);
                arg0[n6] = by;
                n5 = ++n3;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3811(byte[] arg0) {
        long[] lArray = new long[arg0.length / 8];
        sprymd sprymd2 = this;
        this.cfr_renamed_3807(lArray, arg0);
        sprymd2.cfr_renamed_3812(lArray);
        sprymd2.cfr_renamed_3810(arg0, lArray);
    }

    private /* synthetic */ void cfr_renamed_3809(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_3811(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_3446(int arg0) {
        switch (arg0) {
            case 0: 
            case 288: {
                this.cfr_renamed_3798(1024, 576);
                return;
            }
            case 224: {
                this.cfr_renamed_3798(1152, 448);
                return;
            }
            case 256: {
                this.cfr_renamed_3798(1088, 512);
                return;
            }
            case 384: {
                this.cfr_renamed_3798(832, 768);
                return;
            }
            case 512: {
                this.cfr_renamed_3798(576, 1024);
                return;
            }
        }
        throw new IllegalArgumentException(spregm.cfr_renamed_9("5;#\u001e2<0&?r:'$&w02r8<2r84w`ef{rega~waof{r8 wgf`y"));
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_3800(byte[] arg0, int arg1, long arg2) {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_3813();
        }
        if (arg2 % 8L != 0L) {
            throw new IllegalStateException(sprhsh.cfr_renamed_9(".&5#4'\r6/45;a=.'a2a>4?5:1?$s.5ak"));
        }
        v0 = var5_4 = 0L;
        while (v0 < arg2) {
            if (this.cfr_renamed_107 != 0) ** GOTO lbl21
            v1 = this;
            v1.cfr_renamed_3811(v1.cfr_renamed_0);
            if (v1.cfr_renamed_152 == 1024) {
                v2 = this;
                v3 = v2;
                v4 = this;
                v2.cfr_renamed_3814(v4.cfr_renamed_0, v4.cfr_renamed_4);
                v2.cfr_renamed_107 = 1024;
            } else {
                v5 = this;
                v6 = this;
                v5.cfr_renamed_3815(v5.cfr_renamed_0, v6.cfr_renamed_4, this.cfr_renamed_152 / 64);
                v5.cfr_renamed_107 = v6.cfr_renamed_152;
lbl21:
                // 2 sources

                v3 = this;
            }
            var7_5 = v3.cfr_renamed_107;
            if ((long)var7_5 > arg2 - var5_4) {
                var7_5 = (int)(arg2 - var5_4);
            }
            v7 = this;
            System.arraycopy(v7.cfr_renamed_4, (v7.cfr_renamed_152 - this.cfr_renamed_107) / 8, arg0, arg1 + (int)(var5_4 / 8L), var7_5 / 8);
            v7.cfr_renamed_107 -= var7_5;
            v0 = var5_4 + (long)var7_5;
        }
    }

    private /* synthetic */ void cfr_renamed_3812(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 24) {
            sprymd sprymd2 = this;
            sprymd sprymd3 = this;
            sprymd3.cfr_renamed_3816(arg0);
            sprymd3.cfr_renamed_3799(arg0);
            this.cfr_renamed_3801(arg0);
            sprymd2.cfr_renamed_3803(arg0);
            sprymd2.cfr_renamed_3802(arg0, ++n);
            n2 = n;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_3817(byte[] arg0) {
        boolean bl;
        boolean bl2 = bl = (arg0[0] & 1) != 0;
        if ((arg0[0] & 0x80) != 0) {
            arg0[0] = (byte)(arg0[0] << 1 ^ 0x71);
            return bl;
        }
        arg0[0] = (byte)(arg0[0] << 1);
        return bl;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, spregm.cfr_renamed_9("\u0004\u001a\u0016az")).append(this.cfr_renamed_112).toString();
    }

    private /* synthetic */ void cfr_renamed_3813() {
        sprymd sprymd2;
        sprymd sprymd3;
        if (this.cfr_renamed_102 + 1 == this.cfr_renamed_152) {
            sprymd sprymd4 = this;
            sprymd3 = sprymd4;
            sprymd sprymd5 = this;
            byte[] byArray = sprymd5.cfr_renamed_4;
            int n = sprymd5.cfr_renamed_102 / 8;
            byArray[n] = (byte)(byArray[n] | 1 << this.cfr_renamed_102 % 8);
            sprymd4.cfr_renamed_3818();
            sprymd4.cfr_renamed_3806(0, this.cfr_renamed_152 / 8);
        } else {
            sprymd sprymd6 = this;
            sprymd3 = sprymd6;
            sprymd sprymd7 = this;
            sprymd6.cfr_renamed_3806((sprymd6.cfr_renamed_102 + 7) / 8, sprymd7.cfr_renamed_152 / 8 - (this.cfr_renamed_102 + 7) / 8);
            int n = this.cfr_renamed_102 / 8;
            sprymd7.cfr_renamed_4[n] = (byte)(sprymd7.cfr_renamed_4[n] | 1 << this.cfr_renamed_102 % 8);
        }
        int n = (this.cfr_renamed_152 - 1) / 8;
        sprymd3.cfr_renamed_4[n] = (byte)(sprymd3.cfr_renamed_4[n] | 1 << (this.cfr_renamed_152 - 1) % 8);
        sprymd sprymd8 = this;
        sprymd8.cfr_renamed_3818();
        if (sprymd8.cfr_renamed_152 == 1024) {
            sprymd sprymd9 = this;
            sprymd2 = sprymd9;
            sprymd sprymd10 = this;
            sprymd9.cfr_renamed_3814(sprymd10.cfr_renamed_0, sprymd10.cfr_renamed_4);
            sprymd9.cfr_renamed_107 = 1024;
        } else {
            sprymd sprymd11 = this;
            sprymd2 = sprymd11;
            sprymd sprymd12 = this;
            sprymd11.cfr_renamed_3815(sprymd11.cfr_renamed_0, sprymd12.cfr_renamed_4, this.cfr_renamed_152 / 64);
            sprymd11.cfr_renamed_107 = sprymd12.cfr_renamed_152;
        }
        sprymd2.cfr_renamed_91 = true;
    }

    /*
     * WARNING - void declaration
     */
    public sprymd(sprymd sprymd2) {
        void arg0;
        sprymd sprymd3 = this;
        sprymd sprymd4 = this;
        this.cfr_renamed_0 = new byte[200];
        sprymd4.cfr_renamed_4 = new byte[192];
        sprymd4.cfr_renamed_3 = new long[5];
        sprymd3.cfr_renamed_119 = new long[25];
        sprymd3.cfr_renamed_132 = new long[5];
        System.arraycopy(sprymd2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, arg0.cfr_renamed_0.length);
        System.arraycopy(arg0.cfr_renamed_4, 0, this.cfr_renamed_4, 0, arg0.cfr_renamed_4.length);
        sprymd sprymd5 = this;
        void v3 = arg0;
        sprymd sprymd6 = this;
        void v5 = arg0;
        this.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_102 = v5.cfr_renamed_102;
        sprymd6.cfr_renamed_112 = v5.cfr_renamed_112;
        sprymd6.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_107 = v3.cfr_renamed_107;
        sprymd5.cfr_renamed_86 = sprzra.cfr_renamed_158(v3.cfr_renamed_86);
        sprymd5.cfr_renamed_1 = sprzra.cfr_renamed_158(arg0.cfr_renamed_1);
    }

    private static /* synthetic */ int[] cfr_renamed_3819() {
        int n;
        int[] nArray = new int[25];
        nArray[0] = 0;
        int n2 = 1;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 24) {
            nArray[n2 % 5 + 5 * (n3 % 5)] = (n + 1) * (n + 2) / 2 % 64;
            int n5 = (0 * n2 + 1 * n3) % 5;
            int n6 = (2 * n2 + 3 * n3) % 5;
            n2 = n5;
            n3 = n6;
            n4 = ++n;
        }
        return nArray;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3804(arg0, arg1, (long)arg2 * 8L);
    }

    private /* synthetic */ void cfr_renamed_3814(byte[] arg0, byte[] arg1) {
        System.arraycopy(arg0, 0, arg1, 0, 128);
    }

    private /* synthetic */ void cfr_renamed_3816(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            this.cfr_renamed_3[n] = 0L;
            int n4 = n3 = 0;
            while (n4 < 5) {
                int n5 = n;
                long l = this.cfr_renamed_3[n5] ^ arg0[n + 5 * n3];
                this.cfr_renamed_3[n5] = l;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        int n6 = n = 0;
        while (n6 < 5) {
            int n7;
            long l = this.cfr_renamed_3[(n + 1) % 5] << 1 ^ this.cfr_renamed_3[(n + 1) % 5] >>> 63 ^ this.cfr_renamed_3[(n + 4) % 5];
            int n8 = n7 = 0;
            while (n8 < 5) {
                int n9 = n + 5 * n7;
                arg0[n9] = arg0[n9] ^ l;
                n8 = ++n7;
            }
            n6 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3815(byte[] arg0, byte[] arg1, int arg2) {
        System.arraycopy(arg0, 0, arg1, 0, arg2 * 8);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_112 / 8;
    }

    private /* synthetic */ void cfr_renamed_3805(byte[] arg0, int arg1, long arg2) {
        if (this.cfr_renamed_102 % 8 != 0) {
            throw new IllegalStateException(sprhsh.cfr_renamed_9(" '56,#5s5<a2# .!#s6:5;a<%7a?$=&')s0&$&$}"));
        }
        if (this.cfr_renamed_91) {
            throw new IllegalStateException(spregm.cfr_renamed_9("3#&2?'&w&8r60$=%0w%?;;7w!&'27-;95y"));
        }
        long l = 0L;
        block0: while (true) {
            long l2 = l;
            while (l2 < arg2) {
                if (this.cfr_renamed_102 == 0 && arg2 >= (long)this.cfr_renamed_152 && l <= arg2 - (long)this.cfr_renamed_152) {
                    long l3;
                    long l4 = (arg2 - l) / (long)this.cfr_renamed_152;
                    long l5 = l3 = 0L;
                    while (l5 < l4) {
                        System.arraycopy(arg0, (int)((long)arg1 + l / 8L + l3 * (long)this.cfr_renamed_86.length), this.cfr_renamed_86, 0, this.cfr_renamed_86.length);
                        sprymd sprymd2 = this;
                        sprymd sprymd3 = this;
                        sprymd3.cfr_renamed_3808(sprymd2.cfr_renamed_0, sprymd2.cfr_renamed_86, sprymd3.cfr_renamed_86.length);
                        l5 = l3 + 1L;
                    }
                    l2 = l + l4 * (long)this.cfr_renamed_152;
                    continue;
                }
                int n = (int)(arg2 - l);
                if (n + this.cfr_renamed_102 > this.cfr_renamed_152) {
                    sprymd sprymd4 = this;
                    n = sprymd4.cfr_renamed_152 - sprymd4.cfr_renamed_102;
                }
                int n2 = n % 8;
                sprymd sprymd5 = this;
                System.arraycopy(arg0, arg1 + (int)(l / 8L), sprymd5.cfr_renamed_4, this.cfr_renamed_102 / 8, (n -= n2) / 8);
                sprymd5.cfr_renamed_102 += n;
                l += (long)n;
                if (sprymd5.cfr_renamed_102 == this.cfr_renamed_152) {
                    this.cfr_renamed_3818();
                }
                if (n2 <= 0) continue block0;
                int n3 = (1 << n2) - 1;
                sprymd sprymd6 = this;
                this.cfr_renamed_4[sprymd6.cfr_renamed_102 / 8] = (byte)(arg0[arg1 + (int)(l / 8L)] & n3);
                sprymd6.cfr_renamed_102 += n2;
                l += (long)n2;
                continue block0;
            }
            break;
        }
    }

    public sprymd() {
        sprymd sprymd2 = this;
        sprymd sprymd3 = this;
        sprymd3.cfr_renamed_0 = new byte[200];
        sprymd3.cfr_renamed_4 = new byte[192];
        sprymd2.cfr_renamed_3 = new long[5];
        sprymd2.cfr_renamed_119 = new long[25];
        this.cfr_renamed_132 = new long[5];
        this.cfr_renamed_3446(0);
    }

    private static /* synthetic */ long[] cfr_renamed_3820() {
        int n;
        long[] lArray = new long[24];
        byte[] byArray = new byte[1];
        byte[] byArray2 = byArray;
        byArray[0] = 1;
        int n2 = n = 0;
        while (n2 < 24) {
            int n3;
            lArray[n] = 0L;
            int n4 = n3 = 0;
            while (n4 < 7) {
                int n5 = (1 << n3) - 1;
                if (sprymd.cfr_renamed_3817(byArray2)) {
                    int n6 = n;
                    lArray[n6] = lArray[n6] ^ 1L << n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return lArray;
    }

    static {
        cfr_renamed_2 = sprymd.cfr_renamed_3820();
        cfr_renamed_93 = sprymd.cfr_renamed_3819();
    }

    private /* synthetic */ void cfr_renamed_3818() {
        sprymd sprymd2 = this;
        sprymd sprymd3 = this;
        sprymd2.cfr_renamed_3808(sprymd2.cfr_renamed_0, sprymd3.cfr_renamed_4, sprymd3.cfr_renamed_152 / 8);
        sprymd2.cfr_renamed_102 = 0;
    }
}

