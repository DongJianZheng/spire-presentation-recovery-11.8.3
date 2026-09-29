/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprfxf;
import com.spire.presentation.packages.sprgbg;
import com.spire.presentation.packages.sprndg;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproag;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqqr;
import com.spire.presentation.packages.sprreg;
import com.spire.presentation.packages.sprstf;
import com.spire.presentation.packages.sprsyf;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprudg;
import com.spire.presentation.packages.sprvdg;
import com.spire.presentation.packages.sprwyf;
import com.spire.presentation.packages.sprxdg;
import com.spire.presentation.packages.sprzjh;
import java.security.SecureRandom;
import java.util.logging.Logger;

public class sprqag {
    public final sprgbg cfr_renamed_951;
    public final int cfr_renamed_84;
    public static final int cfr_renamed_723 = 16;
    public final int cfr_renamed_1226;
    public final int cfr_renamed_287;
    public final int cfr_renamed_724;
    private static final int cfr_renamed_953 = 64;
    public final int cfr_renamed_133;
    public static final int cfr_renamed_185 = 32;
    public static final int spr\ufe34 = 256;
    private static final int cfr_renamed_82 = 32;
    private static final Logger cfr_renamed_126 = Logger.getLogger(sprqag.class.getName());
    public final int cfr_renamed_88;
    public final int cfr_renamed_31;
    public final int cfr_renamed_272;
    public final int cfr_renamed_145;
    public final int cfr_renamed_114;
    private final int cfr_renamed_96;
    private int cfr_renamed_105;
    private final int cfr_renamed_137;
    private static final int cfr_renamed_79 = 1;
    public final sprud cfr_renamed_107;
    private final int cfr_renamed_132;
    private static final int cfr_renamed_102 = 176;
    public final int cfr_renamed_93;
    public final int cfr_renamed_86;
    private static final int cfr_renamed_152 = 64;
    private static final int cfr_renamed_112 = 0;
    private final int cfr_renamed_119;
    public final int cfr_renamed_91;
    public static final int cfr_renamed_0 = 1144;
    public final int cfr_renamed_1;
    private static final int cfr_renamed_2 = 32;
    private static final int cfr_renamed_3 = 255;
    private final int cfr_renamed_4;

    public static int cfr_renamed_6256(int[] arg0, int arg1, int arg2) {
        int n;
        if (arg2 == 0) {
            int n2 = arg2;
            arg0[n2] = arg1;
            return n2 + 1;
        }
        int n3 = n = 0;
        while (n3 < arg2) {
            if (arg0[n] == arg1) {
                return arg2;
            }
            n3 = ++n;
        }
        arg0[arg2] = arg1;
        return arg2 + 1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6257(int[] nArray, int[] nArray2, int[] nArray3, sprndg sprndg2, sprvdg[] sprvdgArray) {
        void arg4;
        void arg1;
        void arg0;
        void arg2;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        byte by = sprudg.cfr_renamed_714(arg3.cfr_renamed_1[0], v1.cfr_renamed_4);
        byte by2 = sprudg.cfr_renamed_714(v1.cfr_renamed_1[1], arg3.cfr_renamed_4);
        byte by3 = sprudg.cfr_renamed_714(v0.cfr_renamed_1[2], arg3.cfr_renamed_4);
        void v2 = arg2;
        v2[0] = arg0[0] & arg1[1] ^ arg0[1] & arg1[0] ^ arg0[0] & arg1[0] ^ by ^ by2;
        v2[1] = arg0[1] & arg1[2] ^ arg0[2] & arg1[1] ^ arg0[1] & arg1[1] ^ by2 ^ by3;
        arg2[2] = arg0[2] & arg1[0] ^ arg0[0] & arg1[2] ^ arg0[2] & arg1[2] ^ by3 ^ by;
        void v3 = arg4;
        sprudg.cfr_renamed_6201(v3[0].cfr_renamed_3, arg3.cfr_renamed_4, (byte)arg2[0]);
        sprudg.cfr_renamed_6201(v3[1].cfr_renamed_3, arg3.cfr_renamed_4, (byte)arg2[1]);
        sprudg.cfr_renamed_6201(sprvdgArray[2].cfr_renamed_3, arg3.cfr_renamed_4, (byte)arg2[2]);
        ++v0.cfr_renamed_4;
    }

    /*
     * Unable to fully structure code
     */
    public boolean cfr_renamed_6258(sprstf var1_1, sprvdg var2_2, sprvdg var3_3, int var4_4, byte[] var5_5, int var6_6, byte[] var7_7, int[] var8_8, sprndg var9_9) {
        System.arraycopy(arg0.cfr_renamed_3, 0, arg2.cfr_renamed_3, 0, this.cfr_renamed_93);
        var9_9.cfr_renamed_4 = 0;
        var10_10 = 0;
        switch (arg3) lbl-1000:
        // 2 sources

        {
            case 0: {
                if (false) ** GOTO lbl-1000
                v0 = this;
                v1 = this.cfr_renamed_6259(arg0.cfr_renamed_0, 0, (byte[])arg4, (int)arg5, 0, (byte[])arg6, v0.cfr_renamed_84 + v0.cfr_renamed_93);
                var10_10 = (int)v1;
                v2 = arg6;
                sprpxe.cfr_renamed_454((byte[])v2, 0, arg1.cfr_renamed_4);
                System.arraycopy(v2, this.cfr_renamed_84, arg8.cfr_renamed_1[0], 0, this.cfr_renamed_93);
                if (!v1) ** GOTO lbl-1000
                v3 = this;
                if (this.cfr_renamed_6259(arg0.cfr_renamed_2, 0, (byte[])arg4, (int)arg5, 1, (byte[])arg6, v3.cfr_renamed_84 + v3.cfr_renamed_93)) {
                    v4 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    v4 = var10_10 = 0;
                }
                if (var10_10 == 0) {
                    v5 = var10_10;
                    break;
                }
                sprpxe.cfr_renamed_454((byte[])arg6, 0, arg2.cfr_renamed_4);
                System.arraycopy(arg6, this.cfr_renamed_84, arg8.cfr_renamed_1[1], 0, this.cfr_renamed_93);
                v5 = var10_10;
                break;
            }
            case 1: {
                v6 = this;
                v7 = this.cfr_renamed_6259(arg0.cfr_renamed_0, 0, (byte[])arg4, (int)arg5, 1, (byte[])arg6, v6.cfr_renamed_84 + v6.cfr_renamed_93);
                var10_10 = (int)v7;
                v8 = arg6;
                sprpxe.cfr_renamed_454((byte[])v8, 0, arg1.cfr_renamed_4);
                System.arraycopy(v8, this.cfr_renamed_84, arg8.cfr_renamed_1[0], 0, this.cfr_renamed_93);
                v9 = var10_10 = v7 != false && this.cfr_renamed_6259(arg0.cfr_renamed_2, 0, (byte[])arg4, (int)arg5, 2, arg8.cfr_renamed_1[1], this.cfr_renamed_93) != false ? 1 : 0;
                if (var10_10 == 0) {
                    v5 = var10_10;
                    break;
                }
                System.arraycopy(arg0.cfr_renamed_1, 0, arg2.cfr_renamed_4, 0, this.cfr_renamed_114);
                v5 = var10_10;
                break;
            }
            case 2: {
                v10 = this.cfr_renamed_6259(arg0.cfr_renamed_0, 0, (byte[])arg4, (int)arg5, 2, arg8.cfr_renamed_1[0], this.cfr_renamed_93);
                var10_10 = (int)v10;
                System.arraycopy(arg0.cfr_renamed_1, 0, arg1.cfr_renamed_4, 0, this.cfr_renamed_114);
                if (!v10) ** GOTO lbl-1000
                v11 = this;
                if (this.cfr_renamed_6259(arg0.cfr_renamed_2, 0, (byte[])arg4, (int)arg5, 0, (byte[])arg6, v11.cfr_renamed_84 + v11.cfr_renamed_93)) {
                    v12 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    v12 = var10_10 = 0;
                }
                if (var10_10 == 0) {
                    v5 = var10_10;
                    break;
                }
                sprpxe.cfr_renamed_454((byte[])arg6, 0, arg2.cfr_renamed_4);
                System.arraycopy(arg6, this.cfr_renamed_84, arg8.cfr_renamed_1[1], 0, this.cfr_renamed_93);
                v5 = var10_10;
                break;
            }
            default: {
                sprqag.cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\u001d!\".8&0o\u0017'5#8*:(1n"));
                v5 = var10_10;
            }
        }
        if (v5 == 0) {
            sprqag.cfr_renamed_126.fine(sprbgo.cfr_renamed_9("\u007f<P1\\9\u0019)V}^8W8K<M8\u0019/X3]2T}M<I8Jq\u0019.P:W<M(K8\u0019+\\/P;P>X)P2W}N4U1\u0019;X4U}\u0011?L)\u0019.P:W<M(K8\u00190X$\u0019<Z)L<U1@}[8\u0019+X1P9\u0010"));
            return false;
        }
        sprudg.cfr_renamed_6210(arg1.cfr_renamed_4, this.cfr_renamed_145);
        sprudg.cfr_renamed_6210(arg2.cfr_renamed_4, this.cfr_renamed_145);
        v13 = arg6;
        var11_11 = sprpxe.cfr_renamed_5165((byte[])v13, 0, ((void)v13).length / 4);
        this.cfr_renamed_6260((sprvdg)arg1, (sprvdg)arg2, (sprndg)arg8, var11_11, (int[])arg7, (int)arg3);
        return true;
    }

    public void cfr_renamed_6245(int[] arg0, int[] arg1, int[] arg2, int arg3) {
        this.cfr_renamed_6261(arg0, 0, arg1, 0, arg2, arg3);
    }

    private /* synthetic */ void cfr_renamed_6262(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = n + arg1;
            int n4 = arg0[n3] ^ arg2[n + arg3];
            arg0[n3] = n4;
            n2 = ++n;
        }
    }

    public void cfr_renamed_6261(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        int n;
        int[] nArray = new int[16];
        int[] nArray2 = nArray;
        sprqag sprqag2 = this;
        nArray[sprqag2.cfr_renamed_114 - 1] = 0;
        int n2 = sprqag2.cfr_renamed_145 / 32;
        int n3 = sprqag2.cfr_renamed_114 * 32 - this.cfr_renamed_145;
        int n4 = -1 >>> n3;
        n4 = sprzjh.cfr_renamed_6263(n4, 0x55555555, 1);
        n4 = sprzjh.cfr_renamed_6263(n4, 0x33333333, 2);
        n4 = sprzjh.cfr_renamed_6263(n4, 0xF0F0F0F, 4);
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_145) {
            int n6;
            int n7 = 0;
            int n8 = n6 = 0;
            while (n8 < n2) {
                int n9 = n * this.cfr_renamed_114 + n6;
                int n10 = arg2[arg3 + n6];
                n7 ^= n10 & arg4[arg5 + n9];
                n8 = ++n6;
            }
            if (n3 > 0) {
                n6 = n * this.cfr_renamed_114 + n2;
                n7 ^= arg2[arg3 + n2] & arg4[arg5 + n6] & n4;
            }
            sprudg.cfr_renamed_6205(nArray2, n++, sprudg.cfr_renamed_6206(n7));
            n5 = n;
        }
        System.arraycopy(nArray2, 0, arg0, arg1, this.cfr_renamed_114);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6264(sprndg sprndg2, sprvdg[] sprvdgArray, int[] nArray, int[] nArray2) {
        void arg1;
        int n;
        void arg2;
        void arg3;
        void v0 = arg3;
        sproze.cfr_renamed_5257((int[])v0, 0, ((void)v0).length, 0);
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_6262((int[])arg3, 3 * sprqag2.cfr_renamed_114, (int[])arg2, 0, this.cfr_renamed_114);
        sprsyf sprsyf2 = sprqag2.cfr_renamed_951.cfr_renamed_6247(this, 0);
        int n2 = n = 0;
        while (n2 < 3) {
            sprqag sprqag3 = this;
            sprqag3.cfr_renamed_6261((int[])arg3, n * sprqag3.cfr_renamed_114, arg1[++n].cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            n2 = n;
        }
        void v4 = arg3;
        this.cfr_renamed_6265((int[])v4, (int[])v4, 3);
        int n3 = n = 1;
        while (n3 <= this.cfr_renamed_1226) {
            void arg0;
            int n4;
            sprsyf2 = this.cfr_renamed_951.cfr_renamed_6247(this, n);
            int n5 = n4 = 0;
            while (n5 < 3) {
                sprqag sprqag4 = this;
                sprqag4.cfr_renamed_6261((int[])arg3, n4 * sprqag4.cfr_renamed_114, arg1[++n4].cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
                n5 = n4;
            }
            sprqag sprqag5 = this;
            sprqag5.cfr_renamed_6266((int[])arg3, (sprndg)arg0, (sprvdg[])arg1);
            sprsyf2 = sprqag5.cfr_renamed_951.cfr_renamed_6267(this, n - 1);
            sprqag sprqag6 = this;
            sprqag6.cfr_renamed_6268((int[])arg3, 3 * sprqag6.cfr_renamed_114, (int[])arg3, 3 * this.cfr_renamed_114, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246(), 3);
            sprsyf2 = sprqag5.cfr_renamed_951.cfr_renamed_6269(this, n - 1);
            sprqag5.cfr_renamed_6262((int[])arg3, 3 * this.cfr_renamed_114, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246(), this.cfr_renamed_114);
            void v10 = arg3;
            sprqag5.cfr_renamed_6265((int[])v10, (int[])v10, 3);
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < 3) {
            System.arraycopy(arg3, (3 + n) * this.cfr_renamed_114, arg1[++n].cfr_renamed_2, 0, this.cfr_renamed_114);
            n6 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6270(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, int n, int n2) {
        void arg0;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        this.cfr_renamed_107.cfr_renamed_1197((byte[])arg1, 0, this.cfr_renamed_1);
        if (byArray3 != null) {
            void arg2;
            this.cfr_renamed_107.cfr_renamed_1197((byte[])arg2, 0, this.cfr_renamed_93);
        }
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1197((byte[])arg3, 0, 32);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436((int)arg4), 0, 2);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436((int)arg5), 0, 2);
        sprqag2.cfr_renamed_107.cfr_renamed_1199((byte[])arg0, 0, this.cfr_renamed_724);
    }

    private /* synthetic */ void cfr_renamed_6271(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_133 * 3) {
            int n3 = sprudg.cfr_renamed_6203(arg0, n + 2);
            int n4 = sprudg.cfr_renamed_6203(arg0, n + 1);
            int n5 = sprudg.cfr_renamed_6203(arg0, n);
            sprudg.cfr_renamed_6212(arg0, n + 2, n3 ^ n4 & n5);
            sprudg.cfr_renamed_6212(arg0, n + 1, n3 ^ n4 ^ n3 & n5);
            int n6 = n;
            sprudg.cfr_renamed_6212(arg0, n6, n3 ^ n4 ^ n5 ^ n3 & n4);
            n2 = n += 3;
        }
    }

    public void cfr_renamed_6250(int[] arg0, int[] arg1, sprndg arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_133 * 3) {
            int n3 = sprudg.cfr_renamed_6203(arg0, n + 2);
            int n4 = sprudg.cfr_renamed_6203(arg0, n + 1);
            int n5 = sprudg.cfr_renamed_6203(arg0, n);
            int n6 = sprudg.cfr_renamed_6203(arg1, n + 2);
            int n7 = sprudg.cfr_renamed_6203(arg1, n + 1);
            int n8 = sprudg.cfr_renamed_6203(arg1, n) ^ n3 ^ n4 ^ n5;
            int n9 = n6 ^ n3;
            int n10 = n7 ^ n3 ^ n4;
            sprqag sprqag2 = this;
            int n11 = n4;
            this.cfr_renamed_6272(n3, n11, n8, arg2);
            sprqag2.cfr_renamed_6272(n11, n5, n9, arg2);
            sprqag2.cfr_renamed_6272(n5, n3, n10, arg2);
            n2 = n += 3;
        }
    }

    private /* synthetic */ void cfr_renamed_6273(int[] arg0, int[] arg1, sprndg arg2, sprwyf arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_133 * 3) {
            int n3 = sprudg.cfr_renamed_6203(arg0, n + 2);
            int n4 = arg1[n + 2];
            int n5 = sprudg.cfr_renamed_6203(arg0, n + 1);
            int n6 = arg1[n + 1];
            int n7 = sprudg.cfr_renamed_6203(arg0, n);
            int n8 = arg1[n];
            sprqag sprqag2 = this;
            int n9 = sprqag2.cfr_renamed_6274(n3, n5, n4, n6, arg2, arg3);
            int n10 = sprqag2.cfr_renamed_6274(n5, n7, n6, n8, arg2, arg3);
            int n11 = this.cfr_renamed_6274(n7, n3, n8, n4, arg2, arg3);
            int n12 = n3 ^ n10;
            int n13 = n3 ^ n5 ^ n11;
            int n14 = n3 ^ n5 ^ n7 ^ n9;
            sprudg.cfr_renamed_6212(arg0, n + 2, n12);
            sprudg.cfr_renamed_6212(arg0, n + 1, n13);
            int n15 = n;
            sprudg.cfr_renamed_6212(arg0, n15, n14);
            n2 = n += 3;
        }
    }

    private /* synthetic */ int cfr_renamed_6275(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        sprqag sprqag2 = this;
        int[] nArray = new int[sprqag2.cfr_renamed_114];
        int[] nArray2 = new int[sprqag2.cfr_renamed_114];
        sprqag2.cfr_renamed_6275(nArray, nArray2, arg0);
        if (sprqag.cfr_renamed_6276(sprqag2.cfr_renamed_96)) {
            sprfxf sprfxf2 = new sprfxf(this);
            int n = this.cfr_renamed_6277(sprfxf2, arg2, arg3, arg1.length + 4);
            if (n != 0) {
                cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\n&=;=t,;:8+:h o0*'*&&5#=51o'&3!5;!=1o|}}n"));
                return -1;
            }
            return this.cfr_renamed_6278(sprfxf2, nArray, nArray2, arg1);
        }
        sprreg sprreg2 = new sprreg(this);
        int n = this.cfr_renamed_6279(sprreg2, arg2, arg3, arg1.length + 4);
        if (n != 0) {
            cfr_renamed_126.fine(sprbgo.cfr_renamed_9("|/K2K}Z2L1]3\u001e)\u00199\\.\\/P<U4C8\u0019.P:W<M(K8\u0018"));
            return -1;
        }
        return this.cfr_renamed_6280(sprreg2, nArray, nArray2, arg1);
    }

    private /* synthetic */ void cfr_renamed_6281(int[] arg0, int[] arg1, sprvdg[][] arg2, byte[][][] arg3, byte[] arg4, byte[] arg5, byte[] arg6, byte[][][] arg7) {
        int n;
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1221((byte)1);
        byte[] byArray = new byte[sprqag2.cfr_renamed_114 * 4];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 3) {
                sprpxe.cfr_renamed_449(arg2[n][n3].cfr_renamed_2, byArray, 0);
                this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_84);
                n4 = ++n3;
            }
            n2 = ++n;
        }
        this.cfr_renamed_6282(arg0, arg1, arg3, arg4, arg5, arg6, arg7);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6283(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        sprudg.cfr_renamed_6201((byte[])v0, 2 * arg1, (byte)(arg2 & 1));
        sprudg.cfr_renamed_6201((byte[])v0, 2 * arg1 + 1, (byte)(arg2 >>> 1 & 1));
    }

    private /* synthetic */ void cfr_renamed_6284(int arg0, sprwyf arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_31) {
            int n3 = sprudg.cfr_renamed_6208(arg0, n);
            byte[] byArray = arg1.cfr_renamed_2[n];
            sprudg.cfr_renamed_6201(byArray, arg1.cfr_renamed_3, (byte)n3);
            n2 = ++n;
        }
        ++arg1.cfr_renamed_3;
    }

    public void cfr_renamed_6248(int[] arg0, int[] arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_114) {
            int n3 = n;
            int n4 = arg1[n] ^ arg2[n3 + arg3];
            arg0[n3] = n4;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_6285(byte[] arg0, byte[] arg1, byte[] arg2, SecureRandom arg3) {
        int[] nArray = new int[arg2.length / 4];
        int[] nArray2 = new int[arg0.length / 4];
        int[] nArray3 = new int[arg1.length / 4];
        byte[] byArray = arg0;
        arg3.nextBytes(arg2);
        sprpxe.cfr_renamed_454(arg2, 0, nArray);
        sprudg.cfr_renamed_6210(nArray, this.cfr_renamed_145);
        arg3.nextBytes(byArray);
        sprpxe.cfr_renamed_454(byArray, 0, nArray2);
        sprqag sprqag2 = this;
        sprudg.cfr_renamed_6210(nArray2, sprqag2.cfr_renamed_145);
        sprqag2.cfr_renamed_6286(nArray2, nArray3, nArray);
        sprpxe.cfr_renamed_449(nArray, arg2, 0);
        sprpxe.cfr_renamed_449(nArray2, arg0, 0);
        sprpxe.cfr_renamed_449(nArray3, arg1, 0);
    }

    private /* synthetic */ boolean cfr_renamed_6287(int[] arg0, int arg1) {
        if ((arg1 & 0x1F) == 0) {
            return true;
        }
        int n = sprudg.cfr_renamed_6211(arg1);
        return (arg0[arg1 >>> 5] & ~n) == 0;
    }

    private /* synthetic */ void cfr_renamed_6090(byte[] arg0, byte[] arg1, sprwyf arg2) {
        int n;
        this.cfr_renamed_107.cfr_renamed_1197(arg1, 0, this.cfr_renamed_84);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_31) {
            int n3 = sprudg.cfr_renamed_6204(arg2.cfr_renamed_3);
            byte[] byArray = arg2.cfr_renamed_2[n];
            this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, n3);
            n2 = ++n;
        }
        this.cfr_renamed_107.cfr_renamed_1199(arg0, 0, this.cfr_renamed_724);
    }

    public int cfr_renamed_6288(sprreg arg0, byte[] arg1, int arg2) {
        int n;
        sprreg sprreg2 = arg0;
        sprstf[] sprstfArray = sprreg2.cfr_renamed_2;
        byte[] byArray = sprreg2.cfr_renamed_3;
        int n2 = sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91) + 32 + this.cfr_renamed_91 * (2 * this.cfr_renamed_1 + this.cfr_renamed_84 + this.cfr_renamed_93 + this.cfr_renamed_724);
        if (this.cfr_renamed_119 == 1) {
            sprqag sprqag2 = this;
            n2 += sprqag2.cfr_renamed_272 * sprqag2.cfr_renamed_91;
        }
        if (this.cfr_renamed_132 < n2) {
            return -1;
        }
        int n3 = arg2;
        System.arraycopy(byArray, 0, arg1, n3, sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91));
        System.arraycopy(arg0.cfr_renamed_4, 0, arg1, n3 += sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91), 32);
        int n4 = n = 0;
        n3 += 32;
        while (n4 < this.cfr_renamed_91) {
            int n5 = this.cfr_renamed_6289(byArray, n);
            System.arraycopy(sprstfArray[n].cfr_renamed_91, 0, arg1, n3, this.cfr_renamed_724);
            sprqag sprqag3 = this;
            n3 += sprqag3.cfr_renamed_724;
            if (sprqag3.cfr_renamed_119 == 1) {
                int n6 = n5 == 0 ? this.cfr_renamed_86 : this.cfr_renamed_272;
                System.arraycopy(sprstfArray[n].cfr_renamed_4, 0, arg1, n3, n6);
                n3 += n6;
            }
            System.arraycopy(sprstfArray[n].cfr_renamed_3, 0, arg1, n3, this.cfr_renamed_93);
            System.arraycopy(sprstfArray[n].cfr_renamed_0, 0, arg1, n3 += this.cfr_renamed_93, this.cfr_renamed_1);
            System.arraycopy(sprstfArray[n].cfr_renamed_2, 0, arg1, n3 += this.cfr_renamed_1, this.cfr_renamed_1);
            n3 += this.cfr_renamed_1;
            if (n5 == 1 || n5 == 2) {
                sprpxe.cfr_renamed_5171(sprstfArray[n].cfr_renamed_1, 0, this.cfr_renamed_114, arg1, n3);
                n3 += this.cfr_renamed_84;
            }
            n4 = ++n;
        }
        return n3 - arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqag(int n, sprgbg sprgbg2) {
        sprqag sprqag2;
        sprqag sprqag3;
        sprqag sprqag4;
        void arg1;
        this.cfr_renamed_951 = arg1;
        this.cfr_renamed_96 = n;
        switch (this.cfr_renamed_96) {
            case 1: 
            case 2: {
                sprqag4 = this;
                while (false) {
                }
                sprqag sprqag5 = this;
                sprqag sprqag6 = this;
                sprqag sprqag7 = this;
                sprqag sprqag8 = this;
                sprqag8.cfr_renamed_88 = 64;
                sprqag8.cfr_renamed_145 = 128;
                sprqag7.cfr_renamed_91 = 219;
                sprqag7.cfr_renamed_31 = 3;
                sprqag6.cfr_renamed_133 = 10;
                sprqag6.cfr_renamed_1226 = 20;
                sprqag5.cfr_renamed_724 = 32;
                sprqag5.cfr_renamed_287 = 0;
                break;
            }
            case 3: 
            case 4: {
                sprqag4 = this;
                sprqag sprqag9 = this;
                sprqag sprqag10 = this;
                sprqag sprqag11 = this;
                sprqag sprqag12 = this;
                sprqag12.cfr_renamed_88 = 96;
                sprqag12.cfr_renamed_145 = 192;
                sprqag11.cfr_renamed_91 = 329;
                sprqag11.cfr_renamed_31 = 3;
                sprqag10.cfr_renamed_133 = 10;
                sprqag10.cfr_renamed_1226 = 30;
                sprqag9.cfr_renamed_724 = 48;
                sprqag9.cfr_renamed_287 = 0;
                break;
            }
            case 5: 
            case 6: {
                sprqag4 = this;
                sprqag sprqag13 = this;
                sprqag sprqag14 = this;
                sprqag sprqag15 = this;
                sprqag sprqag16 = this;
                sprqag16.cfr_renamed_88 = 128;
                sprqag16.cfr_renamed_145 = 256;
                sprqag15.cfr_renamed_91 = 438;
                sprqag15.cfr_renamed_31 = 3;
                sprqag14.cfr_renamed_133 = 10;
                sprqag14.cfr_renamed_1226 = 38;
                sprqag13.cfr_renamed_724 = 64;
                sprqag13.cfr_renamed_287 = 0;
                break;
            }
            case 7: {
                sprqag4 = this;
                sprqag sprqag17 = this;
                sprqag sprqag18 = this;
                sprqag sprqag19 = this;
                sprqag sprqag20 = this;
                sprqag20.cfr_renamed_88 = 64;
                sprqag20.cfr_renamed_145 = 129;
                sprqag19.cfr_renamed_91 = 250;
                sprqag19.cfr_renamed_287 = 36;
                sprqag18.cfr_renamed_31 = 16;
                sprqag18.cfr_renamed_133 = 43;
                sprqag17.cfr_renamed_1226 = 4;
                sprqag17.cfr_renamed_724 = 32;
                break;
            }
            case 8: {
                sprqag4 = this;
                sprqag sprqag21 = this;
                sprqag sprqag22 = this;
                sprqag sprqag23 = this;
                sprqag sprqag24 = this;
                sprqag24.cfr_renamed_88 = 96;
                sprqag24.cfr_renamed_145 = 192;
                sprqag23.cfr_renamed_91 = 419;
                sprqag23.cfr_renamed_287 = 52;
                sprqag22.cfr_renamed_31 = 16;
                sprqag22.cfr_renamed_133 = 64;
                sprqag21.cfr_renamed_1226 = 4;
                sprqag21.cfr_renamed_724 = 48;
                break;
            }
            case 9: {
                sprqag4 = this;
                sprqag sprqag25 = this;
                sprqag sprqag26 = this;
                sprqag sprqag27 = this;
                sprqag sprqag28 = this;
                sprqag28.cfr_renamed_88 = 128;
                sprqag28.cfr_renamed_145 = 255;
                sprqag27.cfr_renamed_91 = 601;
                sprqag27.cfr_renamed_287 = 68;
                sprqag26.cfr_renamed_31 = 16;
                sprqag26.cfr_renamed_133 = 85;
                sprqag25.cfr_renamed_1226 = 4;
                sprqag25.cfr_renamed_724 = 64;
                break;
            }
            case 10: {
                sprqag4 = this;
                sprqag sprqag29 = this;
                sprqag sprqag30 = this;
                sprqag sprqag31 = this;
                sprqag sprqag32 = this;
                sprqag32.cfr_renamed_88 = 64;
                sprqag32.cfr_renamed_145 = 129;
                sprqag31.cfr_renamed_91 = 219;
                sprqag31.cfr_renamed_31 = 3;
                sprqag30.cfr_renamed_133 = 43;
                sprqag30.cfr_renamed_1226 = 4;
                sprqag29.cfr_renamed_724 = 32;
                sprqag29.cfr_renamed_287 = 0;
                break;
            }
            case 11: {
                sprqag4 = this;
                sprqag sprqag33 = this;
                sprqag sprqag34 = this;
                sprqag sprqag35 = this;
                sprqag sprqag36 = this;
                sprqag36.cfr_renamed_88 = 96;
                sprqag36.cfr_renamed_145 = 192;
                sprqag35.cfr_renamed_91 = 329;
                sprqag35.cfr_renamed_31 = 3;
                sprqag34.cfr_renamed_133 = 64;
                sprqag34.cfr_renamed_1226 = 4;
                sprqag33.cfr_renamed_724 = 48;
                sprqag33.cfr_renamed_287 = 0;
                break;
            }
            case 12: {
                sprqag4 = this;
                sprqag sprqag37 = this;
                sprqag sprqag38 = this;
                sprqag sprqag39 = this;
                sprqag sprqag40 = this;
                sprqag40.cfr_renamed_88 = 128;
                sprqag40.cfr_renamed_145 = 255;
                sprqag39.cfr_renamed_91 = 438;
                sprqag39.cfr_renamed_31 = 3;
                sprqag38.cfr_renamed_133 = 85;
                sprqag38.cfr_renamed_1226 = 4;
                sprqag37.cfr_renamed_724 = 64;
                sprqag37.cfr_renamed_287 = 0;
                break;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqqr.cfr_renamed_9("!!?!;8:o$.&.9* *&o'* o")).append(this.cfr_renamed_96).toString());
            }
        }
        switch (sprqag4.cfr_renamed_96) {
            case 1: {
                sprqag sprqag41 = this;
                while (false) {
                }
                sprqag sprqag42 = this;
                this.cfr_renamed_4 = 49;
                sprqag42.cfr_renamed_137 = 33;
                sprqag42.cfr_renamed_132 = 34036;
                break;
            }
            case 2: {
                sprqag sprqag41 = this;
                sprqag sprqag43 = this;
                this.cfr_renamed_4 = 49;
                sprqag43.cfr_renamed_137 = 33;
                sprqag43.cfr_renamed_132 = 53965;
                break;
            }
            case 3: {
                sprqag sprqag41 = this;
                sprqag sprqag44 = this;
                this.cfr_renamed_4 = 73;
                sprqag44.cfr_renamed_137 = 49;
                sprqag44.cfr_renamed_132 = 76784;
                break;
            }
            case 4: {
                sprqag sprqag41 = this;
                sprqag sprqag45 = this;
                this.cfr_renamed_4 = 73;
                sprqag45.cfr_renamed_137 = 49;
                sprqag45.cfr_renamed_132 = 121857;
                break;
            }
            case 5: {
                sprqag sprqag41 = this;
                sprqag sprqag46 = this;
                this.cfr_renamed_4 = 97;
                sprqag46.cfr_renamed_137 = 65;
                sprqag46.cfr_renamed_132 = 132876;
                break;
            }
            case 6: {
                sprqag sprqag41 = this;
                sprqag sprqag47 = this;
                this.cfr_renamed_4 = 97;
                sprqag47.cfr_renamed_137 = 65;
                sprqag47.cfr_renamed_132 = 209526;
                break;
            }
            case 7: {
                sprqag sprqag41 = this;
                sprqag sprqag48 = this;
                this.cfr_renamed_4 = 52;
                sprqag48.cfr_renamed_137 = 35;
                sprqag48.cfr_renamed_132 = 14612;
                break;
            }
            case 8: {
                sprqag sprqag41 = this;
                sprqag sprqag49 = this;
                this.cfr_renamed_4 = 73;
                sprqag49.cfr_renamed_137 = 49;
                sprqag49.cfr_renamed_132 = 35028;
                break;
            }
            case 9: {
                sprqag sprqag41 = this;
                sprqag sprqag50 = this;
                this.cfr_renamed_4 = 97;
                sprqag50.cfr_renamed_137 = 65;
                sprqag50.cfr_renamed_132 = 61028;
                break;
            }
            case 10: {
                sprqag sprqag41 = this;
                sprqag sprqag51 = this;
                this.cfr_renamed_4 = 52;
                sprqag51.cfr_renamed_137 = 35;
                sprqag51.cfr_renamed_132 = 32061;
                break;
            }
            case 11: {
                sprqag sprqag41 = this;
                sprqag sprqag52 = this;
                this.cfr_renamed_4 = 73;
                sprqag52.cfr_renamed_137 = 49;
                sprqag52.cfr_renamed_132 = 71179;
                break;
            }
            case 12: {
                sprqag sprqag41 = this;
                sprqag sprqag53 = this;
                this.cfr_renamed_4 = 97;
                sprqag53.cfr_renamed_137 = 65;
                sprqag53.cfr_renamed_132 = 126286;
                break;
            }
            default: {
                sprqag sprqag41 = this;
                sprqag sprqag54 = this;
                this.cfr_renamed_4 = -1;
                sprqag54.cfr_renamed_137 = -1;
                sprqag54.cfr_renamed_132 = -1;
            }
        }
        sprqag41.cfr_renamed_93 = sprudg.cfr_renamed_6204(this.cfr_renamed_133 * 3 * this.cfr_renamed_1226);
        this.cfr_renamed_84 = sprudg.cfr_renamed_6204(this.cfr_renamed_145);
        this.cfr_renamed_1 = sprudg.cfr_renamed_6204(2 * this.cfr_renamed_88);
        this.cfr_renamed_114 = (this.cfr_renamed_145 + 32 - 1) / 32;
        switch (this.cfr_renamed_96) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                while (false) {
                }
                sprqag3 = this;
                this.cfr_renamed_119 = 0;
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                sprqag3 = this;
                this.cfr_renamed_119 = 1;
                break;
            }
            default: {
                sprqag3 = this;
                this.cfr_renamed_119 = 255;
            }
        }
        if (sprqag3.cfr_renamed_119 == 1) {
            sprqag sprqag55 = this;
            sprqag2 = sprqag55;
            sprqag sprqag56 = this;
            sprqag55.cfr_renamed_272 = sprqag55.cfr_renamed_1 + sprqag56.cfr_renamed_93;
            sprqag55.cfr_renamed_86 = sprqag56.cfr_renamed_272 + this.cfr_renamed_84;
        } else {
            sprqag2 = this;
            sprqag sprqag57 = this;
            sprqag57.cfr_renamed_272 = 0;
            sprqag57.cfr_renamed_86 = 0;
        }
        if (sprqag2.cfr_renamed_145 == 128 || this.cfr_renamed_145 == 129) {
            this.cfr_renamed_107 = new sprnil(128);
            return;
        }
        this.cfr_renamed_107 = new sprnil(256);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6290(int[] nArray, byte[] byArray) {
        void arg1;
        void arg0;
        sprpxe.cfr_renamed_449((int[])arg0, (byte[])arg1, 0);
        this.cfr_renamed_107.cfr_renamed_1197((byte[])arg1, 0, this.cfr_renamed_84);
    }

    public boolean cfr_renamed_6253(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n = sprpxe.cfr_renamed_439(arg1, 0);
        byte[] byArray = sproze.cfr_renamed_533(arg1, 4, 4 + arg0.length);
        if (this.cfr_renamed_6275(arg2, byArray, arg1, n) == -1) {
            return false;
        }
        System.arraycopy(arg1, 4, arg0, 0, arg0.length);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_6274(int n, int n2, int n3, int n4, sprndg sprndg2, sprwyf sprwyf2) {
        void arg5;
        void arg2;
        void arg1;
        void arg3;
        void arg0;
        void arg4;
        int n5 = arg4.cfr_renamed_6241();
        int n6 = sprqag.cfr_renamed_6291((int)arg0) & arg3 ^ sprqag.cfr_renamed_6291((int)arg1) & arg2 ^ n5;
        if (sprwyf2.cfr_renamed_4 >= 0) {
            void v0 = arg5;
            byte by = sprudg.cfr_renamed_714(v0.cfr_renamed_2[v0.cfr_renamed_4], arg5.cfr_renamed_3);
            n6 = sprudg.cfr_renamed_6213(n6, arg5.cfr_renamed_4, by);
        }
        this.cfr_renamed_6284(n6, (sprwyf)arg5);
        return sprudg.cfr_renamed_6207(n6) ^ arg0 & arg1;
    }

    public void cfr_renamed_6292(int[] arg0, sprndg arg1, sprvdg arg2, sprvdg arg3) {
        int n;
        int[] nArray = new int[2];
        int[] nArray2 = new int[2];
        int[] nArray3 = new int[2];
        int[] nArray4 = new int[2];
        int[] nArray5 = new int[2];
        int[] nArray6 = new int[2];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_133 * 3) {
            int n3;
            int n4;
            int n5 = n4 = 0;
            while (n5 < 2) {
                n3 = (2 + n4) * this.cfr_renamed_114 * 32;
                int n6 = n4;
                nArray[n4] = sprudg.cfr_renamed_6203(arg0, n3 + n + 2);
                nArray2[n6] = sprudg.cfr_renamed_6203(arg0, n3 + n + 1);
                nArray3[n6] = sprudg.cfr_renamed_6203(arg0, n3 + n);
                n5 = ++n4;
            }
            sprqag sprqag2 = this;
            sprqag2.cfr_renamed_6293(nArray, nArray2, nArray4, arg1, arg2, arg3);
            sprqag2.cfr_renamed_6293(nArray2, nArray3, nArray5, arg1, arg2, arg3);
            this.cfr_renamed_6293(nArray3, nArray, nArray6, arg1, arg2, arg3);
            int n7 = n4 = 0;
            while (n7 < 2) {
                int n8 = n3 = (2 + n4) * this.cfr_renamed_114 * 32;
                sprudg.cfr_renamed_6212(arg0, n8 + n + 2, nArray[n4] ^ nArray5[n4]);
                sprudg.cfr_renamed_6212(arg0, n8 + n + 1, nArray[n4] ^ nArray2[n4] ^ nArray6[n4]);
                sprudg.cfr_renamed_6212(arg0, n3 + n, nArray[n4] ^ nArray2[n4] ^ nArray3[n4] ^ nArray4[n4++]);
                n7 = n4;
            }
            n2 = n += 3;
        }
    }

    public int cfr_renamed_5542(int arg0) {
        return this.cfr_renamed_132 + arg0;
    }

    private /* synthetic */ void cfr_renamed_6275(int[] arg0, int[] arg1, byte[] arg2) {
        int n = 1;
        int n2 = 1 + this.cfr_renamed_84;
        int n3 = this.cfr_renamed_84 / 4;
        sprpxe.cfr_renamed_438(arg2, n, arg0, 0, n3);
        sprpxe.cfr_renamed_438(arg2, n2, arg1, 0, n3);
        if (n3 < this.cfr_renamed_114) {
            int n4 = n3 * 4;
            int n5 = this.cfr_renamed_84 - n4;
            arg0[n3] = sprpxe.cfr_renamed_5166(arg2, n + n4, n5);
            arg1[n3] = sprpxe.cfr_renamed_5166(arg2, n2 + n4, n5);
        }
    }

    private /* synthetic */ void cfr_renamed_6294(byte[] arg0, int[] arg1, int[] arg2, byte[][] arg3, byte[] arg4, byte[] arg5, int[] arg6, int[] arg7, byte[] arg8) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            byte[] byArray = arg3[n];
            this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_724);
            n2 = ++n;
        }
        byte[] byArray = new byte[32];
        sprqag sprqag2 = this;
        sprqag sprqag3 = this;
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg4, 0, this.cfr_renamed_724);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg5, 0, 32);
        sprqag2.cfr_renamed_6290(arg6, byArray);
        sprqag2.cfr_renamed_6290(arg7, byArray);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg8, 0, arg8.length);
        this.cfr_renamed_107.cfr_renamed_1199(arg0, 0, this.cfr_renamed_724);
        if (arg1 != null && arg2 != null) {
            this.cfr_renamed_6295(arg0, arg1, arg2);
        }
    }

    private /* synthetic */ void cfr_renamed_6296(byte[] arg0, sprndg arg1) {
        int n;
        byte[] byArray = arg1.cfr_renamed_1[this.cfr_renamed_31 - 1];
        int n2 = this.cfr_renamed_145;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_1226) {
            int n6;
            n4 += n2;
            int n7 = n6 = 0;
            while (n7 < n2) {
                sprudg.cfr_renamed_6201(arg0, n3++, sprudg.cfr_renamed_714(byArray, n4++));
                n7 = ++n6;
            }
            n5 = ++n;
        }
    }

    public void cfr_renamed_6255(byte[] arg0, byte[] arg1, SecureRandom arg2) {
        sprqag sprqag2 = this;
        byte[] byArray = new byte[sprqag2.cfr_renamed_114 * 4];
        byte[] byArray2 = new byte[sprqag2.cfr_renamed_114 * 4];
        byte[] byArray3 = new byte[sprqag2.cfr_renamed_114 * 4];
        sprqag2.cfr_renamed_6285(byArray, byArray2, byArray3, arg2);
        sprqag2.cfr_renamed_6297(byArray2, byArray, arg0);
        this.cfr_renamed_6298(byArray3, byArray2, byArray, arg1);
    }

    private /* synthetic */ void cfr_renamed_6299(int arg0, byte[] arg1, int arg2, sprvdg arg3, byte[] arg4) {
        sprqag sprqag2 = this;
        sprqag sprqag3 = this;
        int n = sprqag2.cfr_renamed_1 + sprqag3.cfr_renamed_93;
        sprqag2.cfr_renamed_107.cfr_renamed_1221((byte)5);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg1, arg2, this.cfr_renamed_1);
        sprqag2.cfr_renamed_107.cfr_renamed_1199(arg4, 0, this.cfr_renamed_724);
        this.cfr_renamed_107.cfr_renamed_1197(arg4, 0, this.cfr_renamed_724);
        if (arg0 == 2) {
            this.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_448(arg3.cfr_renamed_4), 0, this.cfr_renamed_84);
            n += this.cfr_renamed_84;
        }
        sprqag sprqag4 = this;
        sprqag4.cfr_renamed_107.cfr_renamed_1197(arg3.cfr_renamed_3, 0, this.cfr_renamed_93);
        sprqag4.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(n), 0, 2);
        sprqag4.cfr_renamed_107.cfr_renamed_1199(arg4, 0, n);
    }

    public static int cfr_renamed_6300(int arg0, byte[] arg1, int arg2, int[] arg3) {
        int n;
        if (arg0 > arg2 * 8) {
            return 0;
        }
        int n2 = arg2 * 8 / arg0;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            arg3[n] = 0;
            int n5 = n4 = 0;
            while (n5 < arg0) {
                int n6 = n;
                int n7 = arg3[n6] + (sprudg.cfr_renamed_714(arg1, n * arg0 + n4) << n4);
                arg3[n6] = n7;
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6260(sprvdg sprvdg2, sprvdg sprvdg3, sprndg sprndg2, int[] nArray, int[] nArray2, int n) {
        int n2;
        void arg1;
        void arg0;
        void arg5;
        void arg4;
        void arg3;
        void v0 = arg3;
        sproze.cfr_renamed_5257((int[])v0, 0, ((void)v0).length, 0);
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_6301((int[])arg3, (int[])arg4, 0, this.cfr_renamed_114, (int)arg5);
        sprqag sprqag3 = this;
        sprsyf sprsyf2 = sprqag2.cfr_renamed_951.cfr_renamed_6247(sprqag3, 0);
        sprqag3.cfr_renamed_6261((int[])arg3, 0, arg0.cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
        sprqag2.cfr_renamed_6261((int[])arg3, this.cfr_renamed_114, arg1.cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
        void v3 = arg3;
        sprqag2.cfr_renamed_6265((int[])v3, (int[])v3, 2);
        int n3 = n2 = 1;
        while (n3 <= this.cfr_renamed_1226) {
            void arg2;
            sprqag sprqag4 = this;
            sprqag sprqag5 = this;
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6247(sprqag5, n2);
            sprqag4.cfr_renamed_6261((int[])arg3, 0, arg0.cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprqag5.cfr_renamed_6261((int[])arg3, this.cfr_renamed_114, arg1.cfr_renamed_4, 0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprqag4.cfr_renamed_6292((int[])arg3, (sprndg)arg2, (sprvdg)arg0, (sprvdg)arg1);
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6267(this, n2 - 1);
            void v7 = arg3;
            sprqag4.cfr_renamed_6268((int[])v7, 2 * this.cfr_renamed_114, (int[])v7, 2 * this.cfr_renamed_114, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246(), 2);
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6269(this, n2 - 1);
            sprqag4.cfr_renamed_6301((int[])arg3, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246(), this.cfr_renamed_114, (int)arg5);
            void v8 = arg3;
            sprqag4.cfr_renamed_6265((int[])v8, (int[])v8, 2);
            n3 = ++n2;
        }
        System.arraycopy(arg3, 2 * this.cfr_renamed_114, arg0.cfr_renamed_2, 0, this.cfr_renamed_114);
        System.arraycopy(arg3, 3 * this.cfr_renamed_114, arg1.cfr_renamed_2, 0, this.cfr_renamed_114);
    }

    public static int cfr_renamed_6302(int[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1) {
            if (arg0[n] == arg2) {
                return n;
            }
            n2 = ++n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_6277(sprfxf sprfxf2, byte[] byArray, int n, int n2) {
        void arg2;
        int n3;
        int n4;
        void arg0;
        void arg3;
        void arg1;
        int n5 = this.cfr_renamed_724 + 32;
        if (byArray.length < n5) {
            return -1;
        }
        void v0 = arg1;
        void v1 = arg3;
        System.arraycopy(v0, (int)v1, arg0.cfr_renamed_3, 0, this.cfr_renamed_724);
        void v2 = v1 + this.cfr_renamed_724;
        arg3 = v2;
        arg3 += 32;
        System.arraycopy(v0, (int)v2, arg0.cfr_renamed_152, 0, 32);
        sprqag sprqag2 = this;
        void v4 = arg0;
        sprqag2.cfr_renamed_6295(v4.cfr_renamed_3, v4.cfr_renamed_4, arg0.cfr_renamed_91);
        sprqag sprqag3 = this;
        sproag sproag2 = new sproag(sprqag3, this.cfr_renamed_91, sprqag3.cfr_renamed_1);
        arg0.cfr_renamed_0 = sproag2.cfr_renamed_6214(arg0.cfr_renamed_4, this.cfr_renamed_287);
        n5 += arg0.cfr_renamed_0;
        sprqag sprqag4 = this;
        int n6 = sprqag2.cfr_renamed_91 - sprqag4.cfr_renamed_287;
        int[] nArray = sprqag4.cfr_renamed_6303(arg0.cfr_renamed_4);
        sprqag sprqag5 = this;
        sproag2 = new sproag(sprqag5, this.cfr_renamed_91, sprqag5.cfr_renamed_724);
        arg0.cfr_renamed_119 = sproag2.cfr_renamed_6236(nArray, n6);
        n5 += arg0.cfr_renamed_119;
        int[] nArray2 = new int[1];
        sprqag sprqag6 = this;
        sproag2 = new sproag(sprqag6, this.cfr_renamed_31, sprqag6.cfr_renamed_1);
        int n7 = sproag2.cfr_renamed_6214(nArray2, 1);
        int n8 = n4 = 0;
        while (n8 < this.cfr_renamed_91) {
            sprqag sprqag7 = this;
            if (sprqag7.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag7.cfr_renamed_287, n4)) {
                void v11 = arg0;
                n3 = v11.cfr_renamed_91[sprqag.cfr_renamed_6302(v11.cfr_renamed_4, this.cfr_renamed_287, n4)];
                if (n3 != this.cfr_renamed_31 - 1) {
                    n5 += this.cfr_renamed_93;
                }
                n5 += n7;
                n5 += this.cfr_renamed_84;
                n5 += this.cfr_renamed_93;
                n5 += this.cfr_renamed_724;
            }
            n8 = ++n4;
        }
        if (arg2 != n5) {
            cfr_renamed_126.fine(new StringBuilder().insert(0, sprbgo.cfr_renamed_9("J4^\u0011\\3\u0019`\u0019")).append((int)arg2).append(sprqqr.cfr_renamed_9("ct*,?1, *0o66 *'\u001d1>!&&*0oio")).append(n5).toString());
            return -1;
        }
        void v12 = arg3;
        arg0.cfr_renamed_2 = new byte[arg0.cfr_renamed_0];
        System.arraycopy(arg1, (int)v12, arg0.cfr_renamed_2, 0, arg0.cfr_renamed_0);
        void v13 = arg0;
        arg3 = v12 + v13.cfr_renamed_0;
        arg0.cfr_renamed_112 = new byte[v13.cfr_renamed_119];
        void v14 = arg3;
        System.arraycopy(arg1, (int)v14, arg0.cfr_renamed_112, 0, arg0.cfr_renamed_119);
        arg3 = v14 + arg0.cfr_renamed_119;
        int n9 = n4 = 0;
        while (n9 < this.cfr_renamed_91) {
            sprqag sprqag8 = this;
            if (sprqag8.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag8.cfr_renamed_287, n4)) {
                void v17 = arg3;
                arg0.cfr_renamed_1[n4] = new sprxdg(this);
                arg0.cfr_renamed_1[n4].cfr_renamed_0 = n7;
                arg0.cfr_renamed_1[n4].cfr_renamed_4 = new byte[arg0.cfr_renamed_1[n4].cfr_renamed_0];
                System.arraycopy(arg1, (int)v17, arg0.cfr_renamed_1[n4].cfr_renamed_4, 0, arg0.cfr_renamed_1[n4].cfr_renamed_0);
                void v18 = arg0;
                arg3 = v17 + v18.cfr_renamed_1[n4].cfr_renamed_0;
                n3 = v18.cfr_renamed_91[sprqag.cfr_renamed_6302(arg0.cfr_renamed_4, this.cfr_renamed_287, n4)];
                if (n3 != this.cfr_renamed_31 - 1) {
                    void v19 = arg3;
                    System.arraycopy(arg1, (int)v19, arg0.cfr_renamed_1[n4].cfr_renamed_1, 0, this.cfr_renamed_93);
                    arg3 = v19 + this.cfr_renamed_93;
                    sprqag sprqag9 = this;
                    if (!sprqag9.cfr_renamed_6304(arg0.cfr_renamed_1[n4].cfr_renamed_1, 3 * sprqag9.cfr_renamed_1226 * this.cfr_renamed_133)) {
                        cfr_renamed_126.fine(sprbgo.cfr_renamed_9("_<P1\\9\u0019*Q4U8\u00199\\.\\/P<U4C4W:\u0019<L%\u0019?P)J"));
                        return -1;
                    }
                }
                void v21 = arg3;
                System.arraycopy(arg1, (int)v21, arg0.cfr_renamed_1[n4].cfr_renamed_2, 0, this.cfr_renamed_84);
                sprqag sprqag10 = this;
                arg3 = v21 + sprqag10.cfr_renamed_84;
                int n10 = sprqag10.cfr_renamed_93;
                System.arraycopy(arg1, (int)arg3, arg0.cfr_renamed_1[n4].cfr_renamed_91, 0, n10);
                arg3 += n10;
                int n11 = 3 * this.cfr_renamed_1226 * this.cfr_renamed_133;
                if (!this.cfr_renamed_6304(arg0.cfr_renamed_1[n4].cfr_renamed_91, n11)) {
                    cfr_renamed_126.fine(sprqqr.cfr_renamed_9("2.=#1+t8<&8*t+1<1==.8&.&:(t\"'('o6& <"));
                    return -1;
                }
                System.arraycopy(arg1, (int)arg3, arg0.cfr_renamed_1[n4].cfr_renamed_3, 0, this.cfr_renamed_724);
                arg3 += this.cfr_renamed_724;
            }
            n9 = ++n4;
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_6305(byte[] arg0, int arg1, sprvdg arg2, byte[] arg3) {
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1221((byte)4);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, this.cfr_renamed_1);
        sprqag2.cfr_renamed_107.cfr_renamed_1199(arg3, 0, this.cfr_renamed_724);
        sprqag sprqag3 = this;
        sprqag3.cfr_renamed_107.cfr_renamed_1221((byte)0);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg3, 0, this.cfr_renamed_724);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_448(arg2.cfr_renamed_4), 0, this.cfr_renamed_84);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg2.cfr_renamed_3, 0, this.cfr_renamed_93);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_448(arg2.cfr_renamed_2), 0, this.cfr_renamed_84);
        sprqag3.cfr_renamed_107.cfr_renamed_1199(arg3, 0, this.cfr_renamed_724);
    }

    private /* synthetic */ void cfr_renamed_6265(int[] arg0, int[] arg1, int arg2) {
        int n = 0;
        int n2 = this.cfr_renamed_114 * arg2;
        int n3 = n;
        while (n3 < n2) {
            int n4 = arg2 * this.cfr_renamed_114 + n;
            int n5 = arg0[n4] ^ arg1[n];
            arg0[n4] = n5;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6306(sprstf arg0, int arg1, byte[] arg2, int arg3, sprvdg[] arg4, byte[][] arg5, byte[][] arg6) {
        int n;
        if (arg1 == 0) {
            n = arg1;
            System.arraycopy(arg2, arg3 + 0 * this.cfr_renamed_1, arg0.cfr_renamed_0, 0, this.cfr_renamed_1);
            System.arraycopy(arg2, arg3 + 1 * this.cfr_renamed_1, arg0.cfr_renamed_2, 0, this.cfr_renamed_1);
        } else if (arg1 == 1) {
            n = arg1;
            System.arraycopy(arg2, arg3 + 1 * this.cfr_renamed_1, arg0.cfr_renamed_0, 0, this.cfr_renamed_1);
            System.arraycopy(arg2, arg3 + 2 * this.cfr_renamed_1, arg0.cfr_renamed_2, 0, this.cfr_renamed_1);
        } else if (arg1 == 2) {
            n = arg1;
            System.arraycopy(arg2, arg3 + 2 * this.cfr_renamed_1, arg0.cfr_renamed_0, 0, this.cfr_renamed_1);
            System.arraycopy(arg2, arg3 + 0 * this.cfr_renamed_1, arg0.cfr_renamed_2, 0, this.cfr_renamed_1);
        } else {
            cfr_renamed_126.fine(sprbgo.cfr_renamed_9("p3O<U4]}Z5X1U8W:\\"));
            throw new IllegalArgumentException(sprqqr.cfr_renamed_9(",<.8#1!3*"));
        }
        if (n == 1 || arg1 == 2) {
            System.arraycopy(arg4[2].cfr_renamed_4, 0, arg0.cfr_renamed_1, 0, this.cfr_renamed_114);
        }
        System.arraycopy(arg4[(arg1 + 1) % 3].cfr_renamed_3, 0, arg0.cfr_renamed_3, 0, this.cfr_renamed_93);
        System.arraycopy(arg5[(arg1 + 2) % 3], 0, arg0.cfr_renamed_91, 0, this.cfr_renamed_724);
        if (this.cfr_renamed_119 == 1) {
            sprqag sprqag2 = this;
            int n2 = arg1 == 0 ? sprqag2.cfr_renamed_86 : sprqag2.cfr_renamed_272;
            System.arraycopy(arg6[(arg1 + 2) % 3], 0, arg0.cfr_renamed_4, 0, n2);
        }
    }

    private /* synthetic */ int cfr_renamed_6279(sprreg arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        sprreg sprreg2 = arg0;
        sprstf[] sprstfArray = sprreg2.cfr_renamed_2;
        byte[] byArray = sprreg2.cfr_renamed_3;
        int n2 = sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91);
        if (arg2 < n2) {
            return -1;
        }
        int n3 = this.cfr_renamed_6307(arg1, arg3);
        if (n3 < 0) {
            return -1;
        }
        int n4 = n3 * this.cfr_renamed_84;
        int n5 = n2 + 32 + this.cfr_renamed_91 * (2 * this.cfr_renamed_1 + this.cfr_renamed_93 + this.cfr_renamed_724) + n4;
        if (this.cfr_renamed_119 == 1) {
            sprqag sprqag2 = this;
            n5 += sprqag2.cfr_renamed_86 * (sprqag2.cfr_renamed_91 - n3);
            n5 += this.cfr_renamed_272 * n3;
        }
        if (arg2 != n5) {
            cfr_renamed_126.fine(new StringBuilder().insert(0, sprbgo.cfr_renamed_9(".P:{$M8J\u0011\\3\u0019`\u0019")).append(arg2).append(sprqqr.cfr_renamed_9("ct*,?1, *0o66 *'\u001d1>!&&*0oio")).append(n5).toString());
            return -1;
        }
        int n6 = arg3;
        System.arraycopy(arg1, n6, byArray, 0, n2);
        int n7 = n6 + n2;
        arg3 = n7;
        arg3 += 32;
        System.arraycopy(arg1, n7, arg0.cfr_renamed_4, 0, 32);
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_91) {
            int n9 = this.cfr_renamed_6289(byArray, n);
            System.arraycopy(arg1, arg3, sprstfArray[n].cfr_renamed_91, 0, this.cfr_renamed_724);
            sprqag sprqag3 = this;
            arg3 += sprqag3.cfr_renamed_724;
            if (sprqag3.cfr_renamed_119 == 1) {
                sprqag sprqag4 = this;
                int n10 = n9 == 0 ? sprqag4.cfr_renamed_86 : sprqag4.cfr_renamed_272;
                int n11 = arg3;
                System.arraycopy(arg1, n11, sprstfArray[n].cfr_renamed_4, 0, n10);
                arg3 = n11 + n10;
            }
            System.arraycopy(arg1, arg3, sprstfArray[n].cfr_renamed_3, 0, this.cfr_renamed_93);
            System.arraycopy(arg1, arg3 += this.cfr_renamed_93, sprstfArray[n].cfr_renamed_0, 0, this.cfr_renamed_1);
            System.arraycopy(arg1, arg3 += this.cfr_renamed_1, sprstfArray[n].cfr_renamed_2, 0, this.cfr_renamed_1);
            arg3 += this.cfr_renamed_1;
            if (n9 == 1 || n9 == 2) {
                sprpxe.cfr_renamed_438(arg1, arg3, sprstfArray[n].cfr_renamed_1, 0, this.cfr_renamed_84 / 4);
                if (this.cfr_renamed_145 == 129) {
                    sprstfArray[n].cfr_renamed_1[this.cfr_renamed_114 - 1] = arg1[arg3 + this.cfr_renamed_84 - 1] & 0xFF;
                }
                arg3 += this.cfr_renamed_84;
                sprqag sprqag5 = this;
                if (!sprqag5.cfr_renamed_6287(sprstfArray[n].cfr_renamed_1, sprqag5.cfr_renamed_145)) {
                    return -1;
                }
            }
            n8 = ++n;
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_6301(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = 0;
        if (arg4 == 0) {
            n2 = 2 * this.cfr_renamed_114;
        } else if (arg4 == 2) {
            n2 = 3 * this.cfr_renamed_114;
        } else {
            return;
        }
        int n3 = n = 0;
        while (n3 < arg3) {
            int n4 = n + n2;
            int n5 = arg0[n4] ^ arg1[n + arg2];
            arg0[n4] = n5;
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_6295(byte[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2;
        int n3;
        sprqag sprqag2 = this;
        int n4 = sprudg.cfr_renamed_6199(sprqag2.cfr_renamed_91);
        int n5 = sprudg.cfr_renamed_6199(sprqag2.cfr_renamed_31);
        int[] nArray = new int[sprqag2.cfr_renamed_724 * 8 / Math.min(n4, n5)];
        byte[] byArray = new byte[64];
        System.arraycopy(arg0, 0, byArray, 0, this.cfr_renamed_724);
        int n6 = n3 = 0;
        while (n6 < this.cfr_renamed_287) {
            sprqag sprqag3;
            block8: {
                n2 = sprqag.cfr_renamed_6300(n4, byArray, this.cfr_renamed_724, nArray);
                int n7 = n = 0;
                while (n7 < n2) {
                    if (nArray[n] < this.cfr_renamed_91) {
                        n3 = sprqag.cfr_renamed_6256(arg1, nArray[n], n3);
                    }
                    if (n3 == this.cfr_renamed_287) {
                        sprqag3 = this;
                        break block8;
                    }
                    n7 = ++n;
                }
                sprqag3 = this;
            }
            sprqag3.cfr_renamed_107.cfr_renamed_1221((byte)1);
            n6 = n3;
            sprqag sprqag4 = this;
            sprqag4.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_724);
            sprqag4.cfr_renamed_107.cfr_renamed_1199(byArray, 0, this.cfr_renamed_724);
        }
        int n8 = n2 = 0;
        while (n8 < this.cfr_renamed_287) {
            sprqag sprqag5;
            block9: {
                int n9;
                n = sprqag.cfr_renamed_6300(n5, byArray, this.cfr_renamed_724, nArray);
                int n10 = n9 = 0;
                while (n10 < n) {
                    if (nArray[n9] < this.cfr_renamed_31) {
                        arg2[n2++] = nArray[n9];
                    }
                    if (n2 == this.cfr_renamed_287) {
                        sprqag5 = this;
                        break block9;
                    }
                    n10 = ++n9;
                }
                sprqag5 = this;
            }
            sprqag5.cfr_renamed_107.cfr_renamed_1221((byte)1);
            n8 = n2;
            sprqag sprqag6 = this;
            sprqag6.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_724);
            sprqag6.cfr_renamed_107.cfr_renamed_1199(byArray, 0, this.cfr_renamed_724);
        }
    }

    private /* synthetic */ void cfr_renamed_6272(int arg0, int arg1, int arg2, sprndg arg3) {
        int n = this.cfr_renamed_31 - 1;
        int n2 = arg3.cfr_renamed_6241();
        sprndg sprndg2 = arg3;
        n2 = sprudg.cfr_renamed_6207(n2) ^ sprudg.cfr_renamed_714(arg3.cfr_renamed_1[n], sprndg2.cfr_renamed_4 - 1);
        int n3 = arg0 & arg1 ^ n2 ^ arg2;
        sprudg.cfr_renamed_6201(sprndg2.cfr_renamed_1[n], arg3.cfr_renamed_4 - 1, (byte)(n3 & 0xFF));
    }

    private /* synthetic */ void cfr_renamed_6286(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int[] nArray = new int[16];
        if (arg0 != arg1) {
            System.arraycopy(arg0, 0, arg1, 0, this.cfr_renamed_114);
        }
        sprqag sprqag2 = this;
        sprqag sprqag3 = this;
        sprsyf sprsyf2 = sprqag2.cfr_renamed_951.cfr_renamed_6247(sprqag3, 0);
        sprqag3.cfr_renamed_6245(nArray, arg2, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
        sprqag2.cfr_renamed_6248(arg1, arg1, nArray, 0);
        int n2 = n = 1;
        while (n2 <= this.cfr_renamed_1226) {
            sprqag sprqag4 = this;
            sprqag sprqag5 = this;
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6247(sprqag5, n);
            sprqag4.cfr_renamed_6245(nArray, arg2, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprqag5.cfr_renamed_6271(arg1);
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6267(this, n - 1);
            sprqag4.cfr_renamed_6245(arg1, arg1, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6269(this, n - 1);
            sprqag4.cfr_renamed_6248(arg1, arg1, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprqag4.cfr_renamed_6248(arg1, arg1, nArray, 0);
            n2 = ++n;
        }
    }

    private /* synthetic */ int cfr_renamed_6278(sprfxf arg0, int[] arg1, int[] arg2, byte[] arg3) {
        int n;
        int n2;
        int n3;
        int n4;
        sprqag sprqag2 = this;
        byte[][][] byArray = new byte[sprqag2.cfr_renamed_91][sprqag2.cfr_renamed_31][this.cfr_renamed_724];
        sprqag sprqag3 = this;
        byte[][] byArray2 = new byte[sprqag3.cfr_renamed_91][sprqag3.cfr_renamed_724];
        sprqag sprqag4 = this;
        byte[][] byArray3 = new byte[sprqag4.cfr_renamed_91][sprqag4.cfr_renamed_724];
        sprwyf[] sprwyfArray = new sprwyf[this.cfr_renamed_91];
        sprqag sprqag5 = this;
        sproag sproag2 = new sproag(sprqag5, this.cfr_renamed_91, sprqag5.cfr_renamed_724);
        byte[] byArray4 = new byte[64];
        sproag[] sproagArray = new sproag[this.cfr_renamed_91];
        sprndg[] sprndgArray = new sprndg[this.cfr_renamed_91];
        sprqag sprqag6 = this;
        sproag sproag3 = new sproag(sprqag6, this.cfr_renamed_91, sprqag6.cfr_renamed_1);
        sprfxf sprfxf2 = arg0;
        int n5 = sproag3.cfr_renamed_6239(arg0.cfr_renamed_4, this.cfr_renamed_287, sprfxf2.cfr_renamed_2, sprfxf2.cfr_renamed_0, arg0.cfr_renamed_152, 0);
        if (n5 != 0) {
            return -1;
        }
        int n6 = n4 = 0;
        while (n6 < this.cfr_renamed_91) {
            sprqag sprqag7 = this;
            if (!sprqag7.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag7.cfr_renamed_287, n4)) {
                sprqag sprqag8 = this;
                sproagArray[n4] = new sproag(sprqag8, this.cfr_renamed_31, sprqag8.cfr_renamed_1);
                sproagArray[n4].cfr_renamed_6228(sproag3.cfr_renamed_6237(n4), arg0.cfr_renamed_152, n4);
            } else {
                sprqag sprqag9 = this;
                sproagArray[n4] = new sproag(sprqag9, this.cfr_renamed_31, sprqag9.cfr_renamed_1);
                int n7 = sprqag.cfr_renamed_6302(arg0.cfr_renamed_4, this.cfr_renamed_287, n4);
                int[] nArray = new int[]{arg0.cfr_renamed_91[n7]};
                n5 = sproagArray[n4].cfr_renamed_6239(nArray, 1, arg0.cfr_renamed_1[n4].cfr_renamed_4, arg0.cfr_renamed_1[n4].cfr_renamed_0, arg0.cfr_renamed_152, n4);
                if (n5 != 0) {
                    cfr_renamed_126.fine(new StringBuilder().insert(0, sprbgo.cfr_renamed_9("\u001bX4U8]}M2\u0019/\\>V3J)K(Z)\u0019.\\8].\u0019;V/\u0019/V(W9\u0019")).append(n4).toString());
                    return -1;
                }
            }
            n6 = ++n4;
        }
        n4 = this.cfr_renamed_31 - 1;
        byte[] byArray5 = new byte[176];
        int n8 = n3 = 0;
        while (n8 < this.cfr_renamed_91) {
            sprndgArray[n3] = new sprndg(this);
            this.cfr_renamed_6308(sprndgArray[n3], sproagArray[n3].cfr_renamed_6238(), sproagArray[n3].cfr_renamed_6222(), arg0.cfr_renamed_152, n3);
            sprqag sprqag10 = this;
            if (!sprqag10.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag10.cfr_renamed_287, n3)) {
                sprndgArray[n3].cfr_renamed_6242(null);
                int n9 = n2 = 0;
                while (n9 < n4) {
                    this.cfr_renamed_6270(byArray[n3][n2], sproagArray[n3].cfr_renamed_6237(n2), null, arg0.cfr_renamed_152, n3, n2++);
                    n9 = n2;
                }
                this.cfr_renamed_6296(byArray5, sprndgArray[n3]);
                this.cfr_renamed_6270(byArray[n3][n4], sproagArray[n3].cfr_renamed_6237(n4), byArray5, arg0.cfr_renamed_152, n3, n4);
            } else {
                sprfxf sprfxf3 = arg0;
                n2 = sprfxf3.cfr_renamed_91[sprqag.cfr_renamed_6302(sprfxf3.cfr_renamed_4, this.cfr_renamed_287, n3)];
                int n10 = n = 0;
                while (n10 < n4) {
                    if (n != n2) {
                        this.cfr_renamed_6270(byArray[n3][n], sproagArray[n3].cfr_renamed_6237(n), null, arg0.cfr_renamed_152, n3, n);
                    }
                    n10 = ++n;
                }
                if (n4 != n2) {
                    this.cfr_renamed_6270(byArray[n3][n4], sproagArray[n3].cfr_renamed_6237(n4), arg0.cfr_renamed_1[n3].cfr_renamed_1, arg0.cfr_renamed_152, n3, n4);
                }
                System.arraycopy(arg0.cfr_renamed_1[n3].cfr_renamed_3, 0, byArray[n3][n2], 0, this.cfr_renamed_724);
            }
            n8 = ++n3;
        }
        int n11 = n3 = 0;
        while (n11 < this.cfr_renamed_91) {
            this.cfr_renamed_6309(byArray2[n3], byArray[n3++]);
            n11 = n3;
        }
        int[] nArray = new int[this.cfr_renamed_145];
        int n12 = n2 = 0;
        while (n12 < this.cfr_renamed_91) {
            sprwyfArray[n2] = new sprwyf(this);
            sprqag sprqag11 = this;
            if (sprqag11.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag11.cfr_renamed_287, n2)) {
                sprfxf sprfxf4 = arg0;
                n = sprfxf4.cfr_renamed_91[sprqag.cfr_renamed_6302(sprfxf4.cfr_renamed_4, this.cfr_renamed_287, n2)];
                if (n != n4) {
                    sprndgArray[n2].cfr_renamed_6240(arg0.cfr_renamed_1[n2].cfr_renamed_1);
                }
                System.arraycopy(arg0.cfr_renamed_1[n2].cfr_renamed_91, 0, sprwyfArray[n2].cfr_renamed_2[n], 0, this.cfr_renamed_93);
                sproze.cfr_renamed_492(sprndgArray[n2].cfr_renamed_1[n], (byte)0);
                sprwyfArray[n2].cfr_renamed_4 = n;
                byte[] byArray6 = new byte[this.cfr_renamed_114 * 4];
                System.arraycopy(arg0.cfr_renamed_1[n2].cfr_renamed_2, 0, byArray6, 0, arg0.cfr_renamed_1[n2].cfr_renamed_2.length);
                sprqag sprqag12 = this;
                int[] nArray2 = new int[sprqag12.cfr_renamed_114];
                sprpxe.cfr_renamed_438(byArray6, 0, nArray2, 0, this.cfr_renamed_114);
                if (sprqag12.cfr_renamed_6310(nArray2, sprndgArray[n2], nArray, sprwyfArray[n2], arg2, arg1) != 0) {
                    cfr_renamed_126.fine(new StringBuilder().insert(0, sprqqr.cfr_renamed_9("\u0019\u001f\u0017o'&9:8. &;!t)5&8*0o2 &o& !!0o")).append(n2).append(sprbgo.cfr_renamed_9("\u0015}J4^3X)L/\\}P3O<U4]")).toString());
                    return -1;
                }
                this.cfr_renamed_6090(byArray3[n2], arg0.cfr_renamed_1[n2].cfr_renamed_2, sprwyfArray[n2]);
            } else {
                byArray3[n2] = null;
            }
            n12 = ++n2;
        }
        sprqag sprqag13 = this;
        n2 = sprqag13.cfr_renamed_91 - sprqag13.cfr_renamed_287;
        int[] nArray3 = this.cfr_renamed_6303(arg0.cfr_renamed_4);
        sprfxf sprfxf5 = arg0;
        n5 = sproag2.cfr_renamed_6233(nArray3, n2, sprfxf5.cfr_renamed_112, sprfxf5.cfr_renamed_119);
        if (n5 != 0) {
            return -1;
        }
        n5 = sproag2.cfr_renamed_6231(byArray3, arg0.cfr_renamed_152);
        if (n5 != 0) {
            return -1;
        }
        this.cfr_renamed_6294(byArray4, null, null, byArray2, sproag2.cfr_renamed_119[0], arg0.cfr_renamed_152, arg1, arg2, arg3);
        if (!sprqag.cfr_renamed_6311(arg0.cfr_renamed_3, byArray4, this.cfr_renamed_724)) {
            cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\f<.8#1!3*t+;*'o:  o9. ,<ct<=(:. :&*t&:95#=+"));
            return -1;
        }
        return n5;
    }

    private /* synthetic */ boolean cfr_renamed_6312(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, sprfxf arg4) {
        int n;
        int n2;
        Object object;
        int n3;
        int n4;
        int n5;
        int n6;
        byte[] byArray = new byte[32 + this.cfr_renamed_1];
        this.cfr_renamed_6313(byArray, arg0, arg1, arg2, arg3);
        byte[] byArray2 = sproze.cfr_renamed_533(byArray, 32, byArray.length);
        arg4.cfr_renamed_152 = sproze.cfr_renamed_533(byArray, 0, 32);
        sprqag sprqag2 = this;
        sproag sproag2 = new sproag(sprqag2, this.cfr_renamed_91, sprqag2.cfr_renamed_1);
        sproag2.cfr_renamed_6228(byArray2, arg4.cfr_renamed_152, 0);
        byte[][] byArray3 = sproag2.cfr_renamed_6238();
        int n7 = sproag2.cfr_renamed_6222();
        sprndg[] sprndgArray = new sprndg[this.cfr_renamed_91];
        sproag[] sproagArray = new sproag[this.cfr_renamed_91];
        int n8 = n6 = 0;
        while (n8 < this.cfr_renamed_91) {
            sprndgArray[n6] = new sprndg(this);
            sprqag sprqag3 = this;
            sproagArray[n6] = new sproag(sprqag3, this.cfr_renamed_31, sprqag3.cfr_renamed_1);
            sproagArray[n6].cfr_renamed_6228(byArray3[n6 + n7], arg4.cfr_renamed_152, n6);
            this.cfr_renamed_6308(sprndgArray[n6], sproagArray[n6].cfr_renamed_6238(), sproagArray[n6].cfr_renamed_6222(), arg4.cfr_renamed_152, n6++);
            n8 = n6;
        }
        sprqag sprqag4 = this;
        byte[][] byArray4 = new byte[sprqag4.cfr_renamed_91][sprqag4.cfr_renamed_114 * 4];
        byte[] byArray5 = new byte[176];
        int n9 = n5 = 0;
        while (n9 < this.cfr_renamed_91) {
            sprndgArray[n5].cfr_renamed_6242(byArray4[n5++]);
            n9 = n5;
        }
        sprqag sprqag5 = this;
        byte[][][] byArray6 = new byte[sprqag5.cfr_renamed_91][sprqag5.cfr_renamed_31][this.cfr_renamed_724];
        int n10 = n4 = 0;
        while (n10 < this.cfr_renamed_91) {
            int n11;
            int n12 = n11 = 0;
            while (n12 < this.cfr_renamed_31 - 1) {
                this.cfr_renamed_6270(byArray6[n4][n11], sproagArray[n4].cfr_renamed_6237(n11), null, arg4.cfr_renamed_152, n4, n11++);
                n12 = n11;
            }
            sprqag sprqag6 = this;
            n11 = sprqag6.cfr_renamed_31 - 1;
            sprqag6.cfr_renamed_6296(byArray5, sprndgArray[n4]);
            this.cfr_renamed_6270(byArray6[n4][n11], sproagArray[n4].cfr_renamed_6237(n11), byArray5, arg4.cfr_renamed_152, n4++, n11);
            n10 = n4;
        }
        sprwyf[] sprwyfArray = new sprwyf[this.cfr_renamed_91];
        int[] nArray = new int[this.cfr_renamed_145];
        int n13 = n3 = 0;
        while (n13 < this.cfr_renamed_91) {
            int n14 = n3;
            sprwyfArray[n14] = new sprwyf(this);
            int[] nArray2 = sprpxe.cfr_renamed_5165(byArray4[n14], 0, this.cfr_renamed_114);
            object = nArray2;
            sprqag sprqag7 = this;
            sprqag7.cfr_renamed_6248((int[])object, (int[])object, arg0, 0);
            n2 = sprqag7.cfr_renamed_6310(nArray2, sprndgArray[n3], nArray, sprwyfArray[n3], arg2, arg1);
            if (n2 != 0) {
                cfr_renamed_126.fine(sprbgo.cfr_renamed_9("t\rz}J4T(U<M4V3\u0019;X4U8]q\u0019<[2K)P3^}J4^3X)L/\\"));
                return false;
            }
            sprpxe.cfr_renamed_449((int[])object, byArray4[n3++], 0);
            n13 = n3;
        }
        sprqag sprqag8 = this;
        byte[][] byArray7 = new byte[sprqag8.cfr_renamed_91][sprqag8.cfr_renamed_724];
        sprqag sprqag9 = this;
        object = new byte[sprqag9.cfr_renamed_91][sprqag9.cfr_renamed_724];
        int n15 = n2 = 0;
        while (n15 < this.cfr_renamed_91) {
            sprqag sprqag10 = this;
            sprqag10.cfr_renamed_6309(byArray7[n2], byArray6[n2]);
            sprqag10.cfr_renamed_6090(object[n2], byArray4[n2], sprwyfArray[n2++]);
            n15 = n2;
        }
        sprqag sprqag11 = this;
        sproag sproag3 = new sproag(sprqag11, this.cfr_renamed_91, sprqag11.cfr_renamed_724);
        sproag3.cfr_renamed_6235((byte[][])object, arg4.cfr_renamed_152);
        sprfxf sprfxf2 = arg4;
        sprqag sprqag12 = this;
        arg4.cfr_renamed_4 = new int[this.cfr_renamed_287];
        arg4.cfr_renamed_91 = new int[sprqag12.cfr_renamed_287];
        arg4.cfr_renamed_3 = new byte[sprqag12.cfr_renamed_724];
        sprqag sprqag13 = this;
        sprfxf sprfxf3 = arg4;
        sprqag13.cfr_renamed_6294(sprfxf3.cfr_renamed_3, sprfxf3.cfr_renamed_4, arg4.cfr_renamed_91, byArray7, sproag3.cfr_renamed_119[0], arg4.cfr_renamed_152, arg1, arg2, arg3);
        int n16 = sprqag13.cfr_renamed_91 - this.cfr_renamed_287;
        int[] nArray3 = this.cfr_renamed_6303(arg4.cfr_renamed_4);
        int[] nArray4 = new int[1];
        arg4.cfr_renamed_112 = sproag3.cfr_renamed_6226(nArray3, n16, nArray4);
        sprfxf2.cfr_renamed_119 = nArray4[0];
        sprqag sprqag14 = this;
        sprfxf2.cfr_renamed_2 = new byte[sprqag14.cfr_renamed_91 * sprqag14.cfr_renamed_1];
        sprqag sprqag15 = this;
        arg4.cfr_renamed_0 = sproag2.cfr_renamed_6234(arg4.cfr_renamed_4, this.cfr_renamed_287, arg4.cfr_renamed_2, sprqag15.cfr_renamed_91 * sprqag15.cfr_renamed_1);
        sprfxf2.cfr_renamed_1 = new sprxdg[this.cfr_renamed_91];
        int n17 = n = 0;
        while (n17 < this.cfr_renamed_91) {
            sprqag sprqag16 = this;
            if (sprqag16.cfr_renamed_6219(arg4.cfr_renamed_4, sprqag16.cfr_renamed_287, n)) {
                sprfxf sprfxf4 = arg4;
                sprfxf4.cfr_renamed_1[n] = new sprxdg(this);
                int n18 = sprqag.cfr_renamed_6302(sprfxf4.cfr_renamed_4, this.cfr_renamed_287, n);
                int[] nArray5 = new int[1];
                int[] nArray6 = nArray5;
                nArray5[0] = arg4.cfr_renamed_91[n18];
                sprqag sprqag17 = this;
                arg4.cfr_renamed_1[n].cfr_renamed_4 = new byte[sprqag17.cfr_renamed_31 * sprqag17.cfr_renamed_1];
                sprqag sprqag18 = this;
                sprfxf4.cfr_renamed_1[n].cfr_renamed_0 = sproagArray[n].cfr_renamed_6234(nArray6, 1, arg4.cfr_renamed_1[n].cfr_renamed_4, sprqag18.cfr_renamed_31 * sprqag18.cfr_renamed_1);
                int n19 = this.cfr_renamed_31 - 1;
                if (sprfxf4.cfr_renamed_91[n18] != n19) {
                    this.cfr_renamed_6296(arg4.cfr_renamed_1[n].cfr_renamed_1, sprndgArray[n]);
                }
                System.arraycopy(byArray4[n], 0, arg4.cfr_renamed_1[n].cfr_renamed_2, 0, this.cfr_renamed_84);
                int n20 = n;
                System.arraycopy(sprwyfArray[n20].cfr_renamed_2[arg4.cfr_renamed_91[n18]], 0, arg4.cfr_renamed_1[n].cfr_renamed_91, 0, this.cfr_renamed_93);
                System.arraycopy(byArray6[n20][arg4.cfr_renamed_91[n18]], 0, arg4.cfr_renamed_1[n].cfr_renamed_3, 0, this.cfr_renamed_724);
            }
            n17 = ++n;
        }
        return true;
    }

    public int cfr_renamed_6289(byte[] arg0, int arg1) {
        return sprudg.cfr_renamed_6202(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_6282(int[] arg0, int[] arg1, byte[][][] arg2, byte[] arg3, byte[] arg4, byte[] arg5, byte[][][] arg6) {
        int n;
        int n2;
        int n3;
        byte[] byArray = new byte[this.cfr_renamed_724];
        arg3[sprudg.cfr_renamed_6204((int)(this.cfr_renamed_91 * 2)) - 1] = 0;
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_91) {
            int n5 = n2 = 0;
            while (n5 < 3) {
                byte[] byArray2 = arg2[n3][n2];
                this.cfr_renamed_107.cfr_renamed_1197(byArray2, 0, this.cfr_renamed_724);
                n5 = ++n2;
            }
            n4 = ++n3;
        }
        if (this.cfr_renamed_119 == 1) {
            int n6 = n3 = 0;
            while (n6 < this.cfr_renamed_91) {
                int n7 = n2 = 0;
                while (n7 < 3) {
                    n = n2 == 2 ? this.cfr_renamed_86 : this.cfr_renamed_272;
                    byte[] byArray3 = arg6[n3][n2];
                    this.cfr_renamed_107.cfr_renamed_1197(byArray3, 0, n);
                    n7 = ++n2;
                }
                n6 = ++n3;
            }
        }
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_448(arg0), 0, this.cfr_renamed_84);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_448(arg1), 0, this.cfr_renamed_84);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg4, 0, 32);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg5, 0, arg5.length);
        this.cfr_renamed_107.cfr_renamed_1199(byArray, 0, this.cfr_renamed_724);
        n3 = 0;
        n2 = 1;
        int n8 = n2;
        while (n8 != 0) {
            int n9;
            block13: {
                int n10 = n = 0;
                while (n10 < this.cfr_renamed_724) {
                    int n11;
                    block12: {
                        int n12;
                        byte by = byArray[n];
                        int n13 = n12 = 0;
                        while (n13 < 8) {
                            int n14 = by >>> 6 - n12 & 3;
                            if (n14 < 3) {
                                this.cfr_renamed_6283(arg3, n3++, n14);
                                if (n3 == this.cfr_renamed_91) {
                                    n11 = n2 = 0;
                                    break block12;
                                }
                            }
                            n13 = n12 += 2;
                        }
                        n11 = n2;
                    }
                    if (n11 == 0) {
                        n9 = n2;
                        break block13;
                    }
                    n10 = ++n;
                }
                n9 = n2;
            }
            if (n9 == 0) {
                return;
            }
            sprqag sprqag3 = this;
            sprqag3.cfr_renamed_107.cfr_renamed_1221((byte)1);
            sprqag3.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_724);
            sprqag3.cfr_renamed_107.cfr_renamed_1199(byArray, 0, this.cfr_renamed_724);
            n8 = n2;
        }
    }

    private /* synthetic */ void cfr_renamed_6314(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_114) {
            int n3 = n;
            int n4 = arg1[n] ^ arg2[n3] ^ arg3[n];
            arg0[n3] = n4;
            n2 = ++n;
        }
    }

    private /* synthetic */ boolean cfr_renamed_6315(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        sprqag sprqag2 = this;
        int[] nArray = new int[sprqag2.cfr_renamed_114];
        int[] nArray2 = new int[sprqag2.cfr_renamed_114];
        int[] nArray3 = new int[sprqag2.cfr_renamed_114];
        int n2 = 1;
        int n3 = 1 + this.cfr_renamed_84;
        int n4 = 1 + 2 * this.cfr_renamed_84;
        int n5 = sprqag2.cfr_renamed_84 / 4;
        sprpxe.cfr_renamed_438(arg0, n2, nArray, 0, n5);
        sprpxe.cfr_renamed_438(arg0, n3, nArray2, 0, n5);
        sprpxe.cfr_renamed_438(arg0, n4, nArray3, 0, n5);
        if (n5 < this.cfr_renamed_114) {
            int n6 = n5 * 4;
            n = this.cfr_renamed_84 - n6;
            nArray[n5] = sprpxe.cfr_renamed_5166(arg0, n2 + n6, n);
            nArray2[n5] = sprpxe.cfr_renamed_5166(arg0, n3 + n6, n);
            nArray3[n5] = sprpxe.cfr_renamed_5166(arg0, n4 + n6, n);
        }
        if (!sprqag.cfr_renamed_6276(this.cfr_renamed_96)) {
            sprreg sprreg2 = new sprreg(this);
            n = this.cfr_renamed_6316(nArray, nArray2, nArray3, arg1, sprreg2);
            if (n != 0) {
                cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\u0012.=#1+t;;o7=1. *t<=(:. :&*"));
                return false;
            }
            int n7 = this.cfr_renamed_6288(sprreg2, arg2, arg1.length + 4);
            if (n7 < 0) {
                cfr_renamed_126.fine(sprbgo.cfr_renamed_9("\u007f<P1\\9\u0019)V}J8K4X1P'\\}J4^3X)L/\\"));
                return false;
            }
            this.cfr_renamed_105 = n7;
            sprpxe.cfr_renamed_437(n7, arg2, 0);
            return true;
        }
        sprfxf sprfxf2 = new sprfxf(this);
        boolean bl = this.cfr_renamed_6312(nArray, nArray2, nArray3, arg1, sprfxf2);
        n = bl ? 1 : 0;
        if (!bl) {
            cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\u0012.=#1+t;;o7=1. *t<=(:. :&*"));
            return false;
        }
        int n8 = this.cfr_renamed_6317(sprfxf2, arg2, arg1.length + 4);
        if (n8 < 0) {
            cfr_renamed_126.fine(sprbgo.cfr_renamed_9("\u007f<P1\\9\u0019)V}J8K4X1P'\\}J4^3X)L/\\"));
            return false;
        }
        this.cfr_renamed_105 = n8;
        sprpxe.cfr_renamed_437(n8, arg2, 0);
        return true;
    }

    public static boolean cfr_renamed_6276(int arg0) {
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    private /* synthetic */ int cfr_renamed_6310(int[] arg0, sprndg arg1, int[] arg2, sprwyf arg3, int[] arg4, int[] arg5) {
        int n;
        int n2 = 0;
        int[] nArray = new int[16];
        int[] nArray2 = new int[16];
        sprqag sprqag2 = this;
        sprqag sprqag3 = this;
        sprsyf sprsyf2 = sprqag2.cfr_renamed_951.cfr_renamed_6247(sprqag3, 0);
        sprqag2.cfr_renamed_6245(nArray, arg0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
        sprqag3.cfr_renamed_6248(nArray2, nArray, arg4, 0);
        int n3 = n = 1;
        while (n3 <= this.cfr_renamed_1226) {
            sprqag sprqag4 = this;
            sprqag sprqag5 = this;
            sprqag5.cfr_renamed_6318(arg2, arg1);
            sprqag5.cfr_renamed_6273(nArray2, arg2, arg1, arg3);
            sprqag sprqag6 = this;
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6267(sprqag6, n - 1);
            sprqag6.cfr_renamed_6245(nArray2, nArray2, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6269(this, n - 1);
            sprqag4.cfr_renamed_6248(nArray2, nArray2, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprsyf2 = sprqag4.cfr_renamed_951.cfr_renamed_6247(this, n);
            sprqag4.cfr_renamed_6245(nArray, arg0, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprqag4.cfr_renamed_6248(nArray2, nArray, nArray2, 0);
            n3 = ++n;
        }
        if (!sprqag.cfr_renamed_6319(nArray2, arg5, this.cfr_renamed_114)) {
            n2 = -1;
        }
        return n2;
    }

    public static int cfr_renamed_6291(int arg0) {
        return ~(arg0 - 1);
    }

    private static /* synthetic */ boolean cfr_renamed_6319(int[] arg0, int[] arg1, int arg2) {
        int n;
        if (arg0.length < arg2 || arg1.length < arg2) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_6320(int[] nArray, int[] nArray2, int[] nArray3, byte[] byArray) {
        void arg2;
        void arg1;
        void arg3;
        void arg0;
        sprqag sprqag2 = this;
        sprqag sprqag3 = this;
        byte[] byArray2 = new byte[sprqag2.cfr_renamed_1 * (sprqag3.cfr_renamed_31 * this.cfr_renamed_91) + 32];
        byte[] byArray3 = new byte[32];
        sprqag2.cfr_renamed_6290((int[])arg0, byArray3);
        void v2 = arg3;
        sprqag3.cfr_renamed_107.cfr_renamed_1197((byte[])v2, 0, ((void)v2).length);
        sprqag sprqag4 = this;
        sprqag sprqag5 = this;
        sprqag5.cfr_renamed_6290((int[])arg1, byArray3);
        sprqag5.cfr_renamed_6290((int[])arg2, byArray3);
        sprqag4.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(this.cfr_renamed_145), 0, 2);
        sprqag sprqag6 = this;
        sprqag4.cfr_renamed_107.cfr_renamed_1199(byArray2, 0, sprqag6.cfr_renamed_1 * (sprqag6.cfr_renamed_31 * this.cfr_renamed_91) + 32);
        return byArray2;
    }

    private /* synthetic */ void cfr_renamed_6321(int[] arg0, int[] arg1, int[][][] arg2, byte[][][] arg3, byte[] arg4, byte[] arg5, byte[] arg6, byte[][][] arg7) {
        int n;
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1221((byte)1);
        byte[] byArray = new byte[sprqag2.cfr_renamed_114 * 4];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 3) {
                sprpxe.cfr_renamed_449(arg2[n][n3], byArray, 0);
                this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_84);
                n4 = ++n3;
            }
            n2 = ++n;
        }
        this.cfr_renamed_6282(arg0, arg1, arg3, arg4, arg5, arg6, arg7);
    }

    private /* synthetic */ void cfr_renamed_6308(sprndg arg0, byte[][] arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = 2 * this.cfr_renamed_93;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_31) {
            sprqag sprqag2 = this;
            sprqag2.cfr_renamed_107.cfr_renamed_1197(arg1[n + arg2], 0, this.cfr_renamed_1);
            sprqag2.cfr_renamed_107.cfr_renamed_1197(arg3, 0, 32);
            sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(arg4), 0, 2);
            sprqag2.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(n), 0, 2);
            byte[] byArray = arg0.cfr_renamed_1[n];
            sprqag2.cfr_renamed_107.cfr_renamed_1199(byArray, 0, n2);
            n3 = ++n;
        }
    }

    private /* synthetic */ boolean cfr_renamed_6304(byte[] arg0, int arg1) {
        int n;
        int n2 = sprudg.cfr_renamed_6204(arg1);
        int n3 = n = arg1;
        while (n3 < n2 * 8) {
            if (sprudg.cfr_renamed_714(arg0, n) != 0) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_6313(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[] arg4) {
        byte[] byArray = new byte[32];
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_6290(arg1, byArray);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg4, 0, arg4.length);
        sprqag sprqag3 = this;
        sprqag sprqag4 = this;
        sprqag4.cfr_renamed_6290(arg2, byArray);
        sprqag4.cfr_renamed_6290(arg3, byArray);
        sprpxe.cfr_renamed_5168((short)sprqag3.cfr_renamed_145, byArray, 0);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(byArray, 0, 2);
        sprqag3.cfr_renamed_107.cfr_renamed_1199(arg0, 0, arg0.length);
    }

    public int cfr_renamed_6254() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ int cfr_renamed_6280(sprreg arg0, int[] arg1, int[] arg2, byte[] arg3) {
        int n;
        sprqag sprqag2 = this;
        byte[][][] byArray = new byte[sprqag2.cfr_renamed_91][sprqag2.cfr_renamed_31][this.cfr_renamed_724];
        byte[][][] byArray2 = new byte[this.cfr_renamed_91][3][this.cfr_renamed_86];
        int[][][] nArray = new int[this.cfr_renamed_91][3][this.cfr_renamed_84];
        sprreg sprreg2 = arg0;
        sprstf[] sprstfArray = sprreg2.cfr_renamed_2;
        byte[] byArray3 = sprreg2.cfr_renamed_3;
        int n2 = 0;
        byte[] byArray4 = null;
        sprqag sprqag3 = this;
        byte[] byArray5 = new byte[Math.max(6 * this.cfr_renamed_84, sprqag3.cfr_renamed_84 + sprqag3.cfr_renamed_93)];
        sprndg sprndg2 = new sprndg(this);
        sprvdg[] sprvdgArray = new sprvdg[this.cfr_renamed_91];
        sprvdg[] sprvdgArray2 = new sprvdg[this.cfr_renamed_91];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            int n4 = n;
            int n5 = n;
            sprvdgArray[n4] = new sprvdg(this);
            sprvdgArray2[n4] = new sprvdg(this);
            if (!this.cfr_renamed_6258(sprstfArray[n], sprvdgArray[n], sprvdgArray2[n], this.cfr_renamed_6289(byArray3, n), arg0.cfr_renamed_4, n, byArray5, arg2, sprndg2)) {
                cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\u0006:95#=+t<=(:. :&*zo\u0010&0o:  o\"*&&26"));
                return -1;
            }
            sprqag sprqag4 = this;
            sprqag sprqag5 = this;
            int n6 = sprqag5.cfr_renamed_6289(byArray3, n);
            sprqag5.cfr_renamed_6305(sprstfArray[n].cfr_renamed_0, 0, sprvdgArray[n], byArray[n][n6]);
            sprqag4.cfr_renamed_6305(sprstfArray[n].cfr_renamed_2, 0, sprvdgArray2[n], byArray[n][(n6 + 1) % 3]);
            System.arraycopy(sprstfArray[n].cfr_renamed_91, 0, byArray[n][(n6 + 2) % 3], 0, this.cfr_renamed_724);
            if (sprqag4.cfr_renamed_119 == 1) {
                int n7 = n6;
                this.cfr_renamed_6299(n6, sprstfArray[n].cfr_renamed_0, 0, sprvdgArray[n], byArray2[n][n6]);
                this.cfr_renamed_6299((n7 + 1) % 3, sprstfArray[n].cfr_renamed_2, 0, sprvdgArray2[n], byArray2[n][(n6 + 1) % 3]);
                int n8 = n7 == 0 ? this.cfr_renamed_86 : this.cfr_renamed_272;
                System.arraycopy(sprstfArray[n].cfr_renamed_4, 0, byArray2[n][(n6 + 2) % 3], 0, n8);
            }
            sprqag sprqag6 = this;
            nArray[n][n6] = sprvdgArray[n].cfr_renamed_2;
            nArray[n][(n6 + 1) % 3] = sprvdgArray2[n].cfr_renamed_2;
            int[] nArray2 = new int[sprqag6.cfr_renamed_114];
            sprqag6.cfr_renamed_6314(nArray2, sprvdgArray[n].cfr_renamed_2, sprvdgArray2[n].cfr_renamed_2, arg1);
            int[][] nArray3 = nArray[n];
            nArray3[(n6 + 2) % 3] = nArray2;
            n3 = ++n;
        }
        byArray4 = new byte[sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91)];
        this.cfr_renamed_6321(arg1, arg2, nArray, byArray, byArray4, arg0.cfr_renamed_4, arg3, byArray2);
        if (!sprqag.cfr_renamed_6311(byArray3, byArray4, sprudg.cfr_renamed_6204(2 * this.cfr_renamed_91))) {
            cfr_renamed_126.fine(sprbgo.cfr_renamed_9("p3O<U4]}J4^3X)L/\\s\u0019\u0019P9\u00193V)\u0019+\\/P;@"));
            n2 = -1;
        }
        return n2;
    }

    private /* synthetic */ boolean cfr_renamed_6219(int[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1) {
            if (arg0[n] == arg2) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    private /* synthetic */ boolean cfr_renamed_6259(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        if (arg6 < this.cfr_renamed_724) {
            return false;
        }
        sprqag sprqag2 = this;
        sprqag2.cfr_renamed_107.cfr_renamed_1221((byte)2);
        sprqag2.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, this.cfr_renamed_1);
        sprqag2.cfr_renamed_107.cfr_renamed_1199(arg5, 0, this.cfr_renamed_724);
        sprqag sprqag3 = this;
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg5, 0, this.cfr_renamed_724);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(arg2, 0, 32);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(arg3), 0, 2);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(arg4), 0, 2);
        sprqag3.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(arg6), 0, 2);
        sprqag3.cfr_renamed_107.cfr_renamed_1199(arg5, 0, arg6);
        return true;
    }

    private /* synthetic */ void cfr_renamed_6318(int[] arg0, sprndg arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_145) {
            arg0[n++] = arg1.cfr_renamed_6241();
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_6268(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg6) {
            int n3 = arg1 + n * this.cfr_renamed_114;
            int n4 = arg3 + n * this.cfr_renamed_114;
            this.cfr_renamed_6261(arg0, n3, arg2, n4, arg4, arg5);
            n2 = ++n;
        }
    }

    private /* synthetic */ int[] cfr_renamed_6303(int[] arg0) {
        int n;
        sprqag sprqag2 = this;
        int[] nArray = new int[sprqag2.cfr_renamed_91 - sprqag2.cfr_renamed_287];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            sprqag sprqag3 = this;
            if (!sprqag3.cfr_renamed_6219(arg0, sprqag3.cfr_renamed_287, n)) {
                nArray[n2++] = n;
            }
            n3 = ++n;
        }
        return nArray;
    }

    private /* synthetic */ void cfr_renamed_6266(int[] arg0, sprndg arg1, sprvdg[] arg2) {
        int n;
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        int[] nArray5 = new int[3];
        int[] nArray6 = new int[3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_133 * 3) {
            int n3;
            int n4;
            int n5 = n4 = 0;
            while (n5 < 3) {
                n3 = (3 + n4) * this.cfr_renamed_114 * 32;
                int n6 = n4;
                nArray[n4] = sprudg.cfr_renamed_6203(arg0, n3 + n + 2);
                nArray2[n6] = sprudg.cfr_renamed_6203(arg0, n3 + n + 1);
                nArray3[n6] = sprudg.cfr_renamed_6203(arg0, n3 + n);
                n5 = ++n4;
            }
            sprqag sprqag2 = this;
            sprqag2.cfr_renamed_6257(nArray, nArray2, nArray4, arg1, arg2);
            sprqag2.cfr_renamed_6257(nArray2, nArray3, nArray5, arg1, arg2);
            this.cfr_renamed_6257(nArray3, nArray, nArray6, arg1, arg2);
            int n7 = n4 = 0;
            while (n7 < 3) {
                int n8 = n3 = (3 + n4) * this.cfr_renamed_114 * 32;
                sprudg.cfr_renamed_6212(arg0, n8 + n + 2, nArray[n4] ^ nArray5[n4]);
                sprudg.cfr_renamed_6212(arg0, n8 + n + 1, nArray[n4] ^ nArray2[n4] ^ nArray6[n4]);
                sprudg.cfr_renamed_6212(arg0, n3 + n, nArray[n4] ^ nArray2[n4] ^ nArray3[n4] ^ nArray4[n4++]);
                n7 = n4;
            }
            n2 = n += 3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6293(int[] nArray, int[] nArray2, int[] nArray3, sprndg sprndg2, sprvdg sprvdg2, sprvdg sprvdg3) {
        void arg5;
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        byte by = sprudg.cfr_renamed_714(v0.cfr_renamed_1[0], v1.cfr_renamed_4);
        byte by2 = sprudg.cfr_renamed_714(v1.cfr_renamed_1[1], arg3.cfr_renamed_4);
        void var9_9 = arg0[0];
        void var10_10 = arg0[1];
        void var11_11 = arg1[0];
        int n = nArray2[1];
        void v2 = arg2;
        v2[0] = var9_9 & n ^ var10_10 & var11_11 ^ var9_9 & var11_11 ^ by ^ by2;
        sprudg.cfr_renamed_6201(arg4.cfr_renamed_3, arg3.cfr_renamed_4, (byte)arg2[0]);
        v2[1] = sprudg.cfr_renamed_714(arg5.cfr_renamed_3, arg3.cfr_renamed_4);
        ++v0.cfr_renamed_4;
    }

    public int cfr_renamed_6252() {
        return this.cfr_renamed_105;
    }

    private /* synthetic */ int cfr_renamed_6316(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, sprreg arg4) {
        Object object;
        int n;
        sprvdg[][] sprvdgArray = new sprvdg[this.cfr_renamed_91][3];
        sprqag sprqag2 = this;
        byte[][][] byArray = new byte[sprqag2.cfr_renamed_91][sprqag2.cfr_renamed_31][this.cfr_renamed_724];
        byte[][][] byArray2 = new byte[this.cfr_renamed_91][3][this.cfr_renamed_86];
        sprqag sprqag3 = this;
        byte[] byArray3 = sprqag3.cfr_renamed_6320(arg0, arg1, arg2, arg3);
        int n2 = sprqag3.cfr_renamed_31 * this.cfr_renamed_1;
        System.arraycopy(byArray3, n2 * this.cfr_renamed_91, arg4.cfr_renamed_4, 0, 32);
        sprndg sprndg2 = new sprndg(this);
        sprqag sprqag4 = this;
        byte[] byArray4 = new byte[Math.max(9 * this.cfr_renamed_84, sprqag4.cfr_renamed_84 + sprqag4.cfr_renamed_93)];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            int[] nArray;
            boolean bl;
            int n4;
            int n5 = n;
            sprvdgArray[n5][0] = new sprvdg(this);
            sprvdgArray[n5][1] = new sprvdg(this);
            sprvdgArray[n][2] = new sprvdg(this);
            int n6 = n4 = 0;
            while (n6 < 2) {
                sprqag sprqag5 = this;
                bl = this.cfr_renamed_6259(byArray3, n2 * n + n4 * this.cfr_renamed_1, arg4.cfr_renamed_4, n, n4, byArray4, sprqag5.cfr_renamed_84 + sprqag5.cfr_renamed_93);
                if (!bl) {
                    cfr_renamed_126.fine(sprqqr.cfr_renamed_9(",&*5;1\u001d5!0 9\u001b5?1o2.=#1+"));
                    return -1;
                }
                nArray = sprvdgArray[n][n4].cfr_renamed_4;
                sprqag sprqag6 = this;
                sprpxe.cfr_renamed_454(byArray4, 0, nArray);
                sprudg.cfr_renamed_6210(nArray, sprqag6.cfr_renamed_145);
                byte[] byArray5 = sprndg2.cfr_renamed_1[n4];
                System.arraycopy(byArray4, sprqag6.cfr_renamed_84, byArray5, 0, this.cfr_renamed_93);
                n6 = ++n4;
            }
            bl = this.cfr_renamed_6259(byArray3, n2 * n + 2 * this.cfr_renamed_1, arg4.cfr_renamed_4, n, 2, sprndg2.cfr_renamed_1[2], this.cfr_renamed_93);
            if (!bl) {
                cfr_renamed_126.fine(sprbgo.cfr_renamed_9("Z/\\<M8k<W9V0m<I8\u0019;X4U8]"));
                return -1;
            }
            this.cfr_renamed_6314(sprvdgArray[n][2].cfr_renamed_4, arg0, sprvdgArray[n][0].cfr_renamed_4, sprvdgArray[n][1].cfr_renamed_4);
            sprndg2.cfr_renamed_4 = 0;
            object = sprpxe.cfr_renamed_5165(byArray4, 0, byArray4.length / 4);
            this.cfr_renamed_6264(sprndg2, sprvdgArray[n], arg2, (int[])object);
            sprpxe.cfr_renamed_449((int[])object, byArray4, 0);
            nArray = new int[16];
            this.cfr_renamed_6314(nArray, sprvdgArray[n][0].cfr_renamed_2, sprvdgArray[n][1].cfr_renamed_2, sprvdgArray[n][2].cfr_renamed_2);
            if (!sprqag.cfr_renamed_6319(nArray, arg1, this.cfr_renamed_114)) {
                cfr_renamed_126.fine(new StringBuilder().insert(0, sprqqr.cfr_renamed_9("\u001c=\"!#5;= :o2.=#1+oo;: ?!;t+;*'o:  o9. ,<o$:6#=,t$16tg& !!0oio")).append(n).append(")").toString());
                return -1;
            }
            sprqag sprqag7 = this;
            this.cfr_renamed_6305(byArray3, n2 * n + 0 * this.cfr_renamed_1, sprvdgArray[n][0], byArray[n][0]);
            sprqag7.cfr_renamed_6305(byArray3, n2 * n + 1 * this.cfr_renamed_1, sprvdgArray[n][1], byArray[n][1]);
            sprqag7.cfr_renamed_6305(byArray3, n2 * n + 2 * this.cfr_renamed_1, sprvdgArray[n][2], byArray[n][2]);
            if (this.cfr_renamed_119 == 1) {
                sprqag sprqag8 = this;
                this.cfr_renamed_6299(0, byArray3, n2 * n + 0 * this.cfr_renamed_1, sprvdgArray[n][0], byArray2[n][0]);
                sprqag8.cfr_renamed_6299(1, byArray3, n2 * n + 1 * this.cfr_renamed_1, sprvdgArray[n][1], byArray2[n][1]);
                sprqag8.cfr_renamed_6299(2, byArray3, n2 * n + 2 * this.cfr_renamed_1, sprvdgArray[n][2], byArray2[n][2]);
            }
            n3 = ++n;
        }
        sprreg sprreg2 = arg4;
        this.cfr_renamed_6281(arg1, arg2, sprvdgArray, byArray, sprreg2.cfr_renamed_3, sprreg2.cfr_renamed_4, arg3, byArray2);
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_91) {
            object = arg4.cfr_renamed_2[n];
            sprqag sprqag9 = this;
            sprqag9.cfr_renamed_6306((sprstf)object, sprqag9.cfr_renamed_6289(arg4.cfr_renamed_3, n), byArray3, n2 * n, sprvdgArray[n], byArray[n], this.cfr_renamed_119 != 1 ? (byte[][])null : byArray2[n]);
            n7 = ++n;
        }
        return 0;
    }

    private /* synthetic */ int cfr_renamed_6297(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n = 1 + 2 * this.cfr_renamed_84;
        if (arg2.length < n) {
            cfr_renamed_126.fine(sprbgo.cfr_renamed_9("\u001bX4U8]}N/P)P3^}I([1P>\u00196\\$\u0018"));
            return -1;
        }
        arg2[0] = (byte)this.cfr_renamed_96;
        System.arraycopy(arg0, 0, arg2, 1, this.cfr_renamed_84);
        System.arraycopy(arg1, 0, arg2, 1 + this.cfr_renamed_84, this.cfr_renamed_84);
        return n;
    }

    private /* synthetic */ int cfr_renamed_6298(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n = 1 + 3 * this.cfr_renamed_84;
        if (arg3.length < n) {
            cfr_renamed_126.fine(sprqqr.cfr_renamed_9("\t5&8*0o#==;=!3o$==95;1o?*-n"));
            return -1;
        }
        arg3[0] = (byte)this.cfr_renamed_96;
        System.arraycopy(arg0, 0, arg3, 1, this.cfr_renamed_84);
        System.arraycopy(arg1, 0, arg3, 1 + this.cfr_renamed_84, this.cfr_renamed_84);
        System.arraycopy(arg2, 0, arg3, 1 + 2 * this.cfr_renamed_84, this.cfr_renamed_84);
        return n;
    }

    private /* synthetic */ void cfr_renamed_6309(byte[] arg0, byte[][] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_31) {
            byte[] byArray = arg1[n];
            this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, this.cfr_renamed_724);
            n2 = ++n;
        }
        this.cfr_renamed_107.cfr_renamed_1199(arg0, 0, this.cfr_renamed_724);
    }

    private /* synthetic */ int cfr_renamed_6317(sprfxf arg0, byte[] arg1, int arg2) {
        int n;
        int n2;
        int n3 = this.cfr_renamed_724 + 32;
        n3 += arg0.cfr_renamed_0;
        n3 += arg0.cfr_renamed_119;
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_91) {
            sprqag sprqag2 = this;
            if (sprqag2.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag2.cfr_renamed_287, n2)) {
                sprfxf sprfxf2 = arg0;
                n = sprfxf2.cfr_renamed_91[sprqag.cfr_renamed_6302(sprfxf2.cfr_renamed_4, this.cfr_renamed_287, n2)];
                n3 += arg0.cfr_renamed_1[n2].cfr_renamed_0;
                if (n != this.cfr_renamed_31 - 1) {
                    n3 += this.cfr_renamed_93;
                }
                n3 += this.cfr_renamed_84;
                n3 += this.cfr_renamed_93;
                n3 += this.cfr_renamed_724;
            }
            n4 = ++n2;
        }
        if (arg1.length < n3) {
            return -1;
        }
        n2 = arg2;
        sprfxf sprfxf3 = arg0;
        System.arraycopy(sprfxf3.cfr_renamed_3, 0, arg1, n2, this.cfr_renamed_724);
        System.arraycopy(sprfxf3.cfr_renamed_152, 0, arg1, n2 += this.cfr_renamed_724, 32);
        System.arraycopy(sprfxf3.cfr_renamed_2, 0, arg1, n2 += 32, arg0.cfr_renamed_0);
        sprfxf sprfxf4 = arg0;
        System.arraycopy(sprfxf4.cfr_renamed_112, 0, arg1, n2 += sprfxf4.cfr_renamed_0, arg0.cfr_renamed_119);
        n2 += arg0.cfr_renamed_119;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91) {
            sprqag sprqag3 = this;
            if (sprqag3.cfr_renamed_6219(arg0.cfr_renamed_4, sprqag3.cfr_renamed_287, n)) {
                System.arraycopy(arg0.cfr_renamed_1[n].cfr_renamed_4, 0, arg1, n2, arg0.cfr_renamed_1[n].cfr_renamed_0);
                sprfxf sprfxf5 = arg0;
                n2 += sprfxf5.cfr_renamed_1[n].cfr_renamed_0;
                if (sprfxf5.cfr_renamed_91[sprqag.cfr_renamed_6302(arg0.cfr_renamed_4, this.cfr_renamed_287, n)] != this.cfr_renamed_31 - 1) {
                    System.arraycopy(arg0.cfr_renamed_1[n].cfr_renamed_1, 0, arg1, n2, this.cfr_renamed_93);
                    n2 += this.cfr_renamed_93;
                }
                sprfxf sprfxf6 = arg0;
                System.arraycopy(sprfxf6.cfr_renamed_1[n].cfr_renamed_2, 0, arg1, n2, this.cfr_renamed_84);
                System.arraycopy(sprfxf6.cfr_renamed_1[n].cfr_renamed_91, 0, arg1, n2 += this.cfr_renamed_84, this.cfr_renamed_93);
                System.arraycopy(arg0.cfr_renamed_1[n].cfr_renamed_3, 0, arg1, n2 += this.cfr_renamed_93, this.cfr_renamed_724);
                n2 += this.cfr_renamed_724;
            }
            n5 = ++n;
        }
        return n2 - arg2;
    }

    public int cfr_renamed_6094() {
        return this.cfr_renamed_137;
    }

    private static /* synthetic */ boolean cfr_renamed_6311(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        if (arg0.length < arg2 || arg1.length < arg2) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ int cfr_renamed_6307(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = n2 = 0;
        while (n5 + 16 <= this.cfr_renamed_91) {
            int n6 = n = sprpxe.cfr_renamed_439(arg0, arg1 + (n2 >>> 2));
            n4 |= n6 & n6 >>> 1;
            int n7 = n;
            n3 += spruaf.cfr_renamed_931((n7 ^ n7 >>> 1) & 0x55555555);
            n5 = n2 += 16;
        }
        n = (this.cfr_renamed_91 - n2) * 2;
        if (n > 0) {
            int n8 = (n + 7) / 8;
            int n9 = sprpxe.cfr_renamed_5166(arg0, arg1 + (n2 >>> 2), n8);
            int n10 = n9 &= sprudg.cfr_renamed_6211(n);
            n4 |= n10 & n10 >>> 1;
            int n11 = n9;
            n3 += spruaf.cfr_renamed_931((n11 ^ n11 >>> 1) & 0x55555555);
        }
        if ((n4 & 0x55555555) == 0) {
            return n3;
        }
        return -1;
    }

    public void cfr_renamed_6251(byte[] arg0, byte[] arg1, byte[] arg2) {
        if (!this.cfr_renamed_6315(arg2, arg1, arg0)) {
            return;
        }
        System.arraycopy(arg1, 0, arg0, 4, arg1.length);
    }
}

