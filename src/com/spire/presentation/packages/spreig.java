/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkjg;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprung;
import com.spire.presentation.packages.sprzfl;
import java.security.SecureRandom;

public class spreig {
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private final sprung cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_7222(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3, SecureRandom arg4) {
        spreig spreig2 = this;
        byte[] byArray = new byte[spreig2.cfr_renamed_112];
        arg4.nextBytes(byArray);
        byte[] byArray2 = spreig2.cfr_renamed_7225(byArray);
        byte[] byArray3 = new byte[spreig2.cfr_renamed_3];
        byte[] byArray4 = new byte[spreig2.cfr_renamed_3];
        spreig2.cfr_renamed_7226(byArray2, byArray3, byArray4);
        long[] lArray = spreig2.cfr_renamed_91.cfr_renamed_1631();
        long[] lArray2 = spreig2.cfr_renamed_91.cfr_renamed_1631();
        spreig2.cfr_renamed_91.cfr_renamed_7212(byArray3, lArray);
        spreig2.cfr_renamed_91.cfr_renamed_7212(byArray4, lArray2);
        long[] lArray3 = spreig2.cfr_renamed_91.cfr_renamed_1631();
        spreig2.cfr_renamed_91.cfr_renamed_7212(arg3, lArray3);
        spreig2.cfr_renamed_91.cfr_renamed_7200(lArray3, lArray2, lArray3);
        spreig2.cfr_renamed_91.cfr_renamed_7206(lArray3, lArray, lArray3);
        spreig2.cfr_renamed_91.cfr_renamed_7213(lArray3, arg0);
        spreig2.cfr_renamed_7227(byArray3, byArray4, arg1);
        sprkjg.cfr_renamed_7192(byArray, arg1, this.cfr_renamed_112);
        spreig2.cfr_renamed_7228(byArray, arg0, arg1, arg2);
    }

    private /* synthetic */ int[] cfr_renamed_7229(int[] arg0) {
        int[] nArray = new int[this.cfr_renamed_0];
        if (arg0[0] == 0) {
            int n;
            nArray[0] = 0;
            int n2 = n = 1;
            while (n2 < this.cfr_renamed_0) {
                int n3 = n;
                int n4 = this.cfr_renamed_4 - arg0[this.cfr_renamed_0 - n];
                nArray[n3] = n4;
                n2 = ++n;
            }
        } else {
            int n;
            int n5 = n = 0;
            while (n5 < this.cfr_renamed_0) {
                int n6 = n;
                int n7 = this.cfr_renamed_4 - arg0[this.cfr_renamed_0 - 1 - n];
                nArray[n6] = n7;
                n5 = ++n;
            }
        }
        return nArray;
    }

    private /* synthetic */ void cfr_renamed_7230(int[] arg0, byte[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < 8 && n * 8 + n4 != this.cfr_renamed_4) {
                int n6 = arg1[n] >> n4 & 1;
                int n7 = n2;
                arg0[n7] = n * 8 + n4 & -n6 | arg0[n2] & ~(-n6);
                n2 = (n7 + n6) % this.cfr_renamed_0;
                n5 = ++n4;
            }
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_7228(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        byte[] byArray = new byte[48];
        sprzfl sprzfl2 = new sprzfl(384);
        sprzfl2.cfr_renamed_1197(arg0, 0, arg0.length);
        sprzfl2.cfr_renamed_1197(arg1, 0, arg1.length);
        sprzfl2.cfr_renamed_1197(arg2, 0, arg2.length);
        sprzfl2.cfr_renamed_1219(byArray, 0);
        System.arraycopy(byArray, 0, arg3, 0, this.cfr_renamed_112);
    }

    public void cfr_renamed_7221(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3, SecureRandom arg4) {
        byte[] byArray = new byte[64];
        arg4.nextBytes(byArray);
        sprnil sprnil2 = new sprnil(256);
        spreig spreig2 = this;
        sprnil2.cfr_renamed_1197(byArray, 0, this.cfr_renamed_112);
        sprkjg.cfr_renamed_7189(arg0, this.cfr_renamed_4, this.cfr_renamed_0, sprnil2);
        sprkjg.cfr_renamed_7189(arg1, spreig2.cfr_renamed_4, this.cfr_renamed_0, sprnil2);
        spreig spreig3 = this;
        long[] lArray = spreig3.cfr_renamed_91.cfr_renamed_1631();
        long[] lArray2 = spreig3.cfr_renamed_91.cfr_renamed_1631();
        spreig3.cfr_renamed_91.cfr_renamed_7212(arg0, lArray);
        spreig3.cfr_renamed_91.cfr_renamed_7212(arg1, lArray2);
        long[] lArray3 = spreig3.cfr_renamed_91.cfr_renamed_1631();
        spreig3.cfr_renamed_91.cfr_renamed_7208(lArray, lArray3);
        spreig2.cfr_renamed_91.cfr_renamed_7200(lArray3, lArray2, lArray3);
        spreig2.cfr_renamed_91.cfr_renamed_7213(lArray3, arg3);
        System.arraycopy(byArray, this.cfr_renamed_112, arg2, 0, arg2.length);
    }

    private static /* synthetic */ int cfr_renamed_7231(int arg0, double arg1, double arg2, int arg3) {
        return Math.max(arg3, (int)Math.floor(arg1 * (double)arg0 + arg2));
    }

    private /* synthetic */ void cfr_renamed_7232(byte[] arg0, byte[] arg1, byte[] arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7) {
        boolean bl;
        int n;
        int[] nArray = new int[2 * this.cfr_renamed_4];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            if (arg2[n] == 1) {
                bl = this.cfr_renamed_7233(arg6, arg0, n) >= arg3;
                int n3 = n;
                this.cfr_renamed_7234(arg1, n3, bl);
                nArray[n3] = bl ? 1 : 0;
            }
            n2 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4) {
            if (arg2[this.cfr_renamed_4 + n] == 1) {
                bl = this.cfr_renamed_7233(arg7, arg0, n) >= arg3;
                spreig spreig2 = this;
                spreig2.cfr_renamed_7234(arg1, spreig2.cfr_renamed_4 + n, bl);
                nArray[spreig2.cfr_renamed_4 + n] = bl ? 1 : 0;
            }
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 2 * this.cfr_renamed_4) {
            this.cfr_renamed_7235(arg0, n, arg4, arg5, nArray[n] == 1);
            n5 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_7227(byte[] arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = new byte[48];
        sprzfl sprzfl2 = new sprzfl(384);
        sprzfl2.cfr_renamed_1197(arg0, 0, arg0.length);
        sprzfl2.cfr_renamed_1197(arg1, 0, arg1.length);
        sprzfl2.cfr_renamed_1219(byArray, 0);
        System.arraycopy(byArray, 0, arg2, 0, this.cfr_renamed_112);
    }

    public void cfr_renamed_7224(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5) {
        spreig spreig2 = this;
        int[] nArray = new int[spreig2.cfr_renamed_0];
        int[] nArray2 = new int[spreig2.cfr_renamed_0];
        spreig2.cfr_renamed_7230(nArray, arg1);
        spreig2.cfr_renamed_7230(nArray2, arg2);
        byte[] byArray = spreig2.cfr_renamed_7236(spreig2.cfr_renamed_7237(arg4, arg1), nArray, nArray2);
        byte[] byArray2 = new byte[2 * this.cfr_renamed_3];
        sprkjg.cfr_renamed_7194(byArray2, byArray, 0, 2 * this.cfr_renamed_4);
        byte[] byArray3 = new byte[spreig2.cfr_renamed_3];
        byte[] byArray4 = new byte[spreig2.cfr_renamed_3];
        spreig2.cfr_renamed_7226(byArray2, byArray3, byArray4);
        byte[] byArray5 = new byte[spreig2.cfr_renamed_112];
        spreig2.cfr_renamed_7227(byArray3, byArray4, byArray5);
        sprkjg.cfr_renamed_7192(arg5, byArray5, this.cfr_renamed_112);
        byte[] byArray6 = spreig2.cfr_renamed_7225(byArray5);
        if (sproze.cfr_renamed_5135(byArray2, 0, this.cfr_renamed_119, byArray6, 0, this.cfr_renamed_119)) {
            this.cfr_renamed_7228(byArray5, arg4, arg5, arg0);
            return;
        }
        this.cfr_renamed_7228(arg3, arg4, arg5, arg0);
    }

    private /* synthetic */ byte[] cfr_renamed_7237(byte[] arg0, byte[] arg1) {
        spreig spreig2 = this;
        long[] lArray = spreig2.cfr_renamed_91.cfr_renamed_1631();
        long[] lArray2 = spreig2.cfr_renamed_91.cfr_renamed_1631();
        spreig2.cfr_renamed_91.cfr_renamed_7212(arg0, lArray);
        spreig2.cfr_renamed_91.cfr_renamed_7212(arg1, lArray2);
        spreig2.cfr_renamed_91.cfr_renamed_7200(lArray, lArray2, lArray);
        return spreig2.cfr_renamed_91.cfr_renamed_7204(lArray);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_7234(byte[] arg0, int arg1, boolean arg2) {
        var4_4 = arg1;
        if (arg1 == 0 || arg1 == this.cfr_renamed_4) ** GOTO lbl8
        if (arg1 > this.cfr_renamed_4) {
            var4_4 = 2 * this.cfr_renamed_4 - arg1 + this.cfr_renamed_4;
            v0 = arg0;
        } else {
            var4_4 = this.cfr_renamed_4 - arg1;
lbl8:
            // 2 sources

            v0 = arg0;
        }
        v1 = var4_4;
        v0[v1] = (byte)(v0[v1] ^ (arg2 != false ? 1 : 0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7226(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        int n;
        void arg1;
        void arg0;
        int n2 = this.cfr_renamed_4 & 7;
        void v0 = arg0;
        System.arraycopy(v0, 0, arg1, 0, this.cfr_renamed_3 - 1);
        void var5_5 = v0[this.cfr_renamed_3 - 1];
        byte by = (byte)(-1 << n2);
        byArray2[this.cfr_renamed_3 - 1] = (byte)(var5_5 & ~by);
        byte by2 = (byte)(var5_5 & by);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            void var9_9 = arg0[this.cfr_renamed_3 + n];
            arg2[n++] = (byte)(var9_9 << 8 - n2 | (by2 & 0xFF) >>> n2);
            by2 = var9_9;
            n3 = n;
        }
    }

    public int cfr_renamed_6092() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7238(byte[] byArray, byte[] byArray2, int n, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        void arg6;
        int n2;
        void arg1;
        void arg2;
        void arg9;
        void arg0;
        void arg5;
        this.cfr_renamed_7105((int[])arg5, (byte[])arg0, (byte[])arg9);
        int n3 = byArray5[0] & 0xFF;
        int n4 = (n3 - arg2 >> 31) + 1;
        int n5 = (n3 - (arg2 - this.cfr_renamed_1) >> 31) + 1;
        byArray2[0] = (byte)(byArray2[0] ^ (byte)n4);
        byArray3[0] = (byte)n4;
        byArray4[0] = (byte)n5;
        int n6 = n3 = 1;
        while (n6 < this.cfr_renamed_4) {
            void v1 = arg1;
            n4 = arg9[n3] & 0xFF;
            n5 = (n4 - arg2 >> 31) + 1;
            n2 = (n4 - (arg2 - this.cfr_renamed_1) >> 31) + 1;
            int n7 = this.cfr_renamed_4 - n3;
            v1[n7] = (byte)(v1[n7] ^ (byte)n5);
            arg7[n3] = (byte)n5;
            arg8[n3++] = (byte)n2;
            n6 = n3;
        }
        this.cfr_renamed_7105((int[])arg6, (byte[])arg0, (byte[])arg9);
        void v3 = arg1;
        n3 = arg9[0] & 0xFF;
        n4 = (n3 - arg2 >> 31) + 1;
        n5 = (n3 - (arg2 - this.cfr_renamed_1) >> 31) + 1;
        int n8 = this.cfr_renamed_4;
        v3[n8] = (byte)(v3[n8] ^ (byte)n4);
        arg7[this.cfr_renamed_4] = (byte)n4;
        arg8[this.cfr_renamed_4] = (byte)n5;
        int n9 = n3 = 1;
        while (n9 < this.cfr_renamed_4) {
            void v6 = arg1;
            n4 = arg9[n3] & 0xFF;
            n5 = (n4 - arg2 >> 31) + 1;
            n2 = (n4 - (arg2 - this.cfr_renamed_1) >> 31) + 1;
            spreig spreig2 = this;
            int n10 = spreig2.cfr_renamed_4 + spreig2.cfr_renamed_4 - n3;
            v6[n10] = (byte)(v6[n10] ^ (byte)n5);
            arg7[this.cfr_renamed_4 + n3] = (byte)n5;
            int n11 = this.cfr_renamed_4 + n3;
            arg8[n11] = (byte)n2;
            n9 = ++n3;
        }
        int n12 = n3 = 0;
        while (n12 < 2 * this.cfr_renamed_4) {
            void arg7;
            void arg4;
            void arg3;
            this.cfr_renamed_7235((byte[])arg0, n3, (int[])arg3, (int[])arg4, arg7[n3] != false);
            n12 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spreig(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg3;
        void arg5;
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        spreig spreig2 = this;
        spreig spreig3 = this;
        spreig spreig4 = this;
        this.cfr_renamed_4 = arg0;
        spreig4.cfr_renamed_86 = arg1;
        spreig4.cfr_renamed_152 = arg2;
        spreig3.cfr_renamed_2 = arg4;
        spreig3.cfr_renamed_1 = arg5;
        this.cfr_renamed_0 = this.cfr_renamed_86 / 2;
        this.cfr_renamed_112 = arg3 / 8;
        spreig2.cfr_renamed_3 = arg0 + 7 >>> 3;
        spreig2.cfr_renamed_119 = 2 * arg0 + 7 >>> 3;
        spreig spreig5 = this;
        spreig2.cfr_renamed_91 = new sprung((int)arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_7239(int arg0, int arg1) {
        switch (arg1) {
            case 12323: {
                return spreig.cfr_renamed_7231(arg0, 0.0069722, 13.53, 36);
            }
            case 24659: {
                return spreig.cfr_renamed_7231(arg0, 0.005265, 15.2588, 52);
            }
            case 40973: {
                return spreig.cfr_renamed_7231(arg0, 0.00402312, 17.8785, 69);
            }
        }
        throw new IllegalArgumentException();
    }

    private /* synthetic */ void cfr_renamed_7240(byte[] arg0, byte[] arg1, int arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, byte[] arg7) {
        int n;
        int[] nArray = new int[2 * this.cfr_renamed_4];
        int[] nArray2 = nArray;
        this.cfr_renamed_7105(arg5, arg0, arg7);
        int n2 = arg7[0] & 0xFF;
        int n3 = (n2 - arg2 >> 31) + 1;
        arg1[0] = (byte)(arg1[0] ^ (byte)n3);
        nArray[0] = n3;
        int n4 = n2 = 1;
        while (n4 < this.cfr_renamed_4) {
            n3 = arg7[n2] & 0xFF;
            n = (n3 - arg2 >> 31) + 1;
            int n5 = this.cfr_renamed_4 - n2;
            arg1[n5] = (byte)(arg1[n5] ^ (byte)n);
            nArray2[n2++] = n;
            n4 = n2;
        }
        this.cfr_renamed_7105(arg6, arg0, arg7);
        n2 = arg7[0] & 0xFF;
        n3 = (n2 - arg2 >> 31) + 1;
        int n6 = this.cfr_renamed_4;
        arg1[n6] = (byte)(arg1[n6] ^ (byte)n3);
        nArray2[this.cfr_renamed_4] = n3;
        int n7 = n2 = 1;
        while (n7 < this.cfr_renamed_4) {
            n3 = arg7[n2] & 0xFF;
            n = (n3 - arg2 >> 31) + 1;
            spreig spreig2 = this;
            int n8 = spreig2.cfr_renamed_4 + spreig2.cfr_renamed_4 - n2;
            arg1[n8] = (byte)(arg1[n8] ^ (byte)n);
            int n9 = this.cfr_renamed_4 + n2;
            nArray2[n9] = n;
            n7 = ++n2;
        }
        int n10 = n2 = 0;
        while (n10 < 2 * this.cfr_renamed_4) {
            this.cfr_renamed_7235(arg0, n2, arg3, arg4, nArray2[n2] == 1);
            n10 = ++n2;
        }
    }

    private /* synthetic */ void cfr_renamed_7235(byte[] arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        byte by;
        byte by2 = by = arg4 ? (byte)1 : 0;
        if (arg1 < this.cfr_renamed_4) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_0) {
                if (arg2[n] <= arg1) {
                    int n3 = arg1 - arg2[n];
                    arg0[n3] = (byte)(arg0[n3] ^ by);
                } else {
                    int n4 = this.cfr_renamed_4 + arg1 - arg2[n];
                    arg0[n4] = (byte)(arg0[n4] ^ by);
                }
                n2 = ++n;
            }
        } else {
            int n;
            int n5 = n = 0;
            while (n5 < this.cfr_renamed_0) {
                if (arg3[n] <= arg1 - this.cfr_renamed_4) {
                    int n6 = arg1 - this.cfr_renamed_4 - arg3[n];
                    arg0[n6] = (byte)(arg0[n6] ^ by);
                } else {
                    int n7 = this.cfr_renamed_4 - arg3[n] + (arg1 - this.cfr_renamed_4);
                    arg0[n7] = (byte)(arg0[n7] ^ by);
                }
                n5 = ++n;
            }
        }
    }

    private /* synthetic */ int cfr_renamed_7233(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = this.cfr_renamed_0 - 4;
        int n5 = n3;
        while (n5 <= n4) {
            n = arg0[n3 + 0] + arg2 - this.cfr_renamed_4;
            int n6 = arg0[n3 + 1] + arg2 - this.cfr_renamed_4;
            int n7 = arg0[n3 + 2] + arg2 - this.cfr_renamed_4;
            int n8 = arg0[n3 + 3] + arg2 - this.cfr_renamed_4;
            int n9 = n;
            n = n9 + (n9 >> 31 & this.cfr_renamed_4);
            int n10 = n6;
            n6 = n10 + (n10 >> 31 & this.cfr_renamed_4);
            int n11 = n7;
            n7 = n11 + (n11 >> 31 & this.cfr_renamed_4);
            int n12 = n8;
            n8 = n12 + (n12 >> 31 & this.cfr_renamed_4);
            n2 += arg1[n] & 0xFF;
            n2 += arg1[n6] & 0xFF;
            n2 += arg1[n7] & 0xFF;
            n2 += arg1[n8] & 0xFF;
            n5 = n3 += 4;
        }
        int n13 = n3;
        while (n13 < this.cfr_renamed_0) {
            n = arg0[n3] + arg2 - this.cfr_renamed_4;
            n += n >> 31 & this.cfr_renamed_4;
            n2 += arg1[n] & 0xFF;
            n13 = ++n3;
        }
        return n2;
    }

    private /* synthetic */ byte[] cfr_renamed_7225(byte[] arg0) {
        byte[] byArray = new byte[2 * this.cfr_renamed_3];
        sprnil sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1197(arg0, 0, arg0.length);
        sprkjg.cfr_renamed_7189(byArray, 2 * this.cfr_renamed_4, this.cfr_renamed_152, sprnil2);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7105(int[] nArray, byte[] byArray, byte[] byArray2) {
        void arg2;
        void arg1;
        void arg0;
        int n = arg0[0];
        int n2 = this.cfr_renamed_4 - n;
        void v0 = arg1;
        System.arraycopy(v0, n, arg2, 0, n2);
        System.arraycopy(v0, 0, arg2, n2, n);
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_0) {
            n2 = arg0[n];
            int n4 = this.cfr_renamed_4 - n2;
            int n5 = 0;
            int n6 = n4 - 4;
            int n7 = n5;
            while (n7 <= n6) {
                void v3 = arg2;
                int n8 = n5;
                void v5 = arg2;
                void v6 = arg2;
                int n9 = n5 + 0;
                v6[n9] = (byte)(v6[n9] + (arg1[n2 + n5 + 0] & 0xFF));
                int n10 = n8 + 1;
                v5[n10] = (byte)(v5[n10] + (arg1[n2 + n5 + 1] & 0xFF));
                int n11 = n8 + 2;
                v3[n11] = (byte)(v3[n11] + (arg1[n2 + n5 + 2] & 0xFF));
                int n12 = n5 + 3;
                byte by = (byte)(v3[n12] + (arg1[n2 + n5 + 3] & 0xFF));
                v3[n12] = by;
                n7 = n5 += 4;
            }
            int n13 = n5;
            while (n13 < n4) {
                void v13 = arg2;
                int n14 = n5;
                byte by = (byte)(v13[n14] + (arg1[n2 + n5] & 0xFF));
                v13[n14] = by;
                n13 = ++n5;
            }
            n6 = n4;
            int n15 = this.cfr_renamed_4 - 4;
            int n16 = n6;
            while (n16 <= n15) {
                void v17 = arg2;
                int n17 = n6;
                void v19 = arg2;
                void v20 = arg2;
                int n18 = n6 + 0;
                v20[n18] = (byte)(v20[n18] + (arg1[n6 + 0 - n4] & 0xFF));
                int n19 = n17 + 1;
                v19[n19] = (byte)(v19[n19] + (arg1[n6 + 1 - n4] & 0xFF));
                int n20 = n17 + 2;
                v17[n20] = (byte)(v17[n20] + (arg1[n6 + 2 - n4] & 0xFF));
                int n21 = n6 + 3;
                byte by = (byte)(v17[n21] + (arg1[n6 + 3 - n4] & 0xFF));
                v17[n21] = by;
                n16 = n6 += 4;
            }
            int n22 = n6;
            while (n22 < this.cfr_renamed_4) {
                void v27 = arg2;
                int n23 = n6;
                byte by = (byte)(v27[n23] + (arg1[n6 - n4] & 0xFF));
                v27[n23] = by;
                n22 = ++n6;
            }
            n3 = ++n;
        }
    }

    private /* synthetic */ byte[] cfr_renamed_7236(byte[] arg0, int[] arg1, int[] arg2) {
        int n;
        byte[] byArray = new byte[2 * this.cfr_renamed_4];
        spreig spreig2 = this;
        int[] nArray = spreig2.cfr_renamed_7229(arg1);
        int[] nArray2 = spreig2.cfr_renamed_7229(arg2);
        spreig spreig3 = this;
        byte[] byArray2 = new byte[2 * spreig3.cfr_renamed_4];
        byte[] byArray3 = new byte[spreig3.cfr_renamed_4];
        byte[] byArray4 = new byte[2 * this.cfr_renamed_4];
        int n2 = spreig2.cfr_renamed_7239(sprkjg.cfr_renamed_7193(arg0), this.cfr_renamed_4);
        spreig2.cfr_renamed_7238(arg0, byArray, n2, arg1, arg2, nArray, nArray2, byArray2, byArray4, byArray3);
        spreig2.cfr_renamed_7232(arg0, byArray, byArray2, (this.cfr_renamed_0 + 1) / 2 + 1, arg1, arg2, nArray, nArray2);
        spreig2.cfr_renamed_7232(arg0, byArray, byArray4, (this.cfr_renamed_0 + 1) / 2 + 1, arg1, arg2, nArray, nArray2);
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_2) {
            sproze.cfr_renamed_492(byArray2, (byte)0);
            spreig spreig4 = this;
            n2 = spreig4.cfr_renamed_7239(sprkjg.cfr_renamed_7193(arg0), this.cfr_renamed_4);
            spreig4.cfr_renamed_7240(arg0, byArray, n2, arg1, arg2, nArray, nArray2, byArray3);
            n3 = ++n;
        }
        if (sprkjg.cfr_renamed_7193(arg0) == 0) {
            return byArray;
        }
        return null;
    }
}

