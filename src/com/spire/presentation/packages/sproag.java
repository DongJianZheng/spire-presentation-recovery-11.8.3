/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhwia;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprppx;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprudg;
import java.util.logging.Logger;

public class sproag {
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    public byte[][] cfr_renamed_119;
    private sprqag cfr_renamed_91;
    private static final Logger cfr_renamed_0 = Logger.getLogger(sproag.class.getName());
    private boolean[] cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 32;

    public int cfr_renamed_6214(int[] arg0, int arg1) {
        int[] nArray = new int[]{0};
        this.cfr_renamed_6215(arg0, arg1, nArray);
        return nArray[0] * this.cfr_renamed_91.cfr_renamed_1;
    }

    private /* synthetic */ int[] cfr_renamed_6215(int[] arg0, int arg1, int[] arg2) {
        int n;
        int n2;
        int n3;
        int n4 = this.cfr_renamed_112 - 1;
        int[][] nArray = new int[n4][arg1];
        int n5 = n3 = 0;
        while (n5 < arg1) {
            n2 = 0;
            sproag sproag2 = this;
            sproag sproag3 = sproag2;
            n = arg0[n3] + (sproag2.cfr_renamed_2 - this.cfr_renamed_152);
            int[] nArray2 = nArray[n2];
            ++n2;
            nArray2[n3] = n;
            while ((n = sproag3.cfr_renamed_6216(n)) != 0) {
                sproag3 = this;
                int[] nArray3 = nArray[n2];
                ++n2;
                nArray3[n3] = n;
            }
            n5 = ++n3;
        }
        int[] nArray4 = new int[this.cfr_renamed_152];
        n2 = 0;
        int n6 = n = 0;
        while (n6 < n4) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < arg1) {
                if (this.cfr_renamed_6217(nArray[n][n7])) {
                    sproag sproag4 = this;
                    int n9 = sproag4.cfr_renamed_6218(nArray[n][n7]);
                    if (!sproag4.cfr_renamed_6219(nArray[n], arg1, n9)) {
                        sproag sproag5 = this;
                        while (!sproag5.cfr_renamed_6220(n9) && !this.cfr_renamed_6221(n9)) {
                            n9 = 2 * n9 + 1;
                            sproag5 = this;
                        }
                        if (!this.cfr_renamed_6219(nArray4, n2, n9)) {
                            nArray4[n2++] = n9;
                        }
                    }
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
        arg2[0] = n2;
        return nArray4;
    }

    public int cfr_renamed_6222() {
        sproag sproag2 = this;
        return sproag2.cfr_renamed_2 - sproag2.cfr_renamed_152;
    }

    public sproag(sprqag arg0, int arg1, int arg2) {
        int n;
        sproag sproag2 = this;
        int n2 = arg1;
        sproag sproag3 = this;
        sproag3.cfr_renamed_91 = arg0;
        sproag3.cfr_renamed_112 = sprudg.cfr_renamed_6199(n2) + 1;
        this.cfr_renamed_2 = (1 << this.cfr_renamed_112) - 1 - ((1 << this.cfr_renamed_112 - 1) - arg1);
        this.cfr_renamed_152 = n2;
        sproag2.cfr_renamed_86 = arg2;
        sproag2.cfr_renamed_119 = new byte[this.cfr_renamed_2][arg2];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            this.cfr_renamed_119[n++] = new byte[arg2];
            n3 = n;
        }
        sproag sproag4 = this;
        sproag4.cfr_renamed_3 = new boolean[sproag4.cfr_renamed_2];
        sproag4.cfr_renamed_1 = new boolean[sproag4.cfr_renamed_2];
        sproag sproag5 = this;
        sproze.cfr_renamed_5262(sproag4.cfr_renamed_1, sproag5.cfr_renamed_2 - sproag5.cfr_renamed_152, this.cfr_renamed_2, true);
        int n4 = n = sproag4.cfr_renamed_2 - this.cfr_renamed_152;
        while (n4 > 0) {
            if (this.cfr_renamed_6223(2 * n + 1) || this.cfr_renamed_6223(2 * n + 2)) {
                this.cfr_renamed_1[n] = true;
            }
            n4 = --n;
        }
        this.cfr_renamed_1[0] = true;
    }

    private /* synthetic */ void cfr_renamed_6224(byte[] arg0, int arg1) {
        int n;
        byte[] byArray = new byte[64];
        sproag sproag2 = this;
        int n2 = sproag2.cfr_renamed_6216(sproag2.cfr_renamed_2 - 1);
        int n3 = n = 0;
        while (n3 <= n2) {
            if (this.cfr_renamed_3[n]) {
                sproag sproag3 = this;
                sproag3.cfr_renamed_6225(byArray, sproag3.cfr_renamed_119[n], arg0, (byte)1, arg1, n);
                if (!this.cfr_renamed_3[2 * n + 1]) {
                    sproag sproag4 = this;
                    System.arraycopy(byArray, 0, sproag4.cfr_renamed_119[2 * n + 1], 0, this.cfr_renamed_91.cfr_renamed_1);
                    sproag4.cfr_renamed_3[2 * n + 1] = true;
                }
                if (this.cfr_renamed_6223(2 * n + 2) && !this.cfr_renamed_3[2 * n + 2]) {
                    sproag sproag5 = this;
                    System.arraycopy(byArray, this.cfr_renamed_91.cfr_renamed_1, sproag5.cfr_renamed_119[2 * n + 2], 0, this.cfr_renamed_91.cfr_renamed_1);
                    sproag5.cfr_renamed_3[2 * n + 2] = true;
                }
            }
            n3 = ++n;
        }
    }

    public byte[] cfr_renamed_6226(int[] arg0, int arg1, int[] arg2) {
        int n;
        byte[] byArray;
        int[] nArray = new int[1];
        int[] nArray2 = this.cfr_renamed_6227(arg0, arg1, nArray);
        arg2[0] = nArray[0] * this.cfr_renamed_86;
        byte[] byArray2 = byArray = new byte[arg2[0]];
        int n2 = n = 0;
        while (n2 < nArray[0]) {
            byte[] byArray3 = this.cfr_renamed_119[nArray2[n]];
            int n3 = n * this.cfr_renamed_86;
            System.arraycopy(byArray3, 0, byArray, n3, this.cfr_renamed_86);
            n2 = ++n;
        }
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6228(byte[] byArray, byte[] byArray2, int n) {
        void arg2;
        void arg0;
        sproag sproag2 = this;
        this.cfr_renamed_119[0] = arg0;
        sproag2.cfr_renamed_3[0] = true;
        sproag2.cfr_renamed_6224(byArray2, (int)arg2);
    }

    private /* synthetic */ boolean cfr_renamed_6229(int arg0) {
        return arg0 % 2 == 1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_6227(int[] nArray, int n, int[] nArray2) {
        int n2;
        int n3;
        void arg0;
        void arg1;
        int n4;
        sproag sproag2 = this;
        int n5 = this.cfr_renamed_2 - sproag2.cfr_renamed_152;
        boolean[] blArray = new boolean[sproag2.cfr_renamed_2];
        int n6 = n4 = 0;
        while (n6 < arg1) {
            int n7 = n5 + arg0[n4];
            blArray[n7] = true;
            n6 = ++n4;
        }
        sproag sproag3 = this;
        int n8 = n3 = (n4 = sproag3.cfr_renamed_6216(sproag3.cfr_renamed_2 - 1));
        while (n8 > 0) {
            if (this.cfr_renamed_6223(n3)) {
                if (this.cfr_renamed_6223(2 * n3 + 2)) {
                    if (blArray[2 * n3 + 1] && blArray[2 * n3 + 2]) {
                        blArray[n3] = true;
                    }
                } else if (blArray[2 * n3 + 1]) {
                    blArray[n3] = true;
                }
            }
            n8 = --n3;
        }
        int[] nArray3 = new int[this.cfr_renamed_152];
        int n9 = 0;
        int n10 = n2 = 0;
        while (n10 < arg1) {
            int n11 = arg0[n2] + n5;
            do {
                if (blArray[this.cfr_renamed_6216(n11)]) continue;
                if (this.cfr_renamed_6219(nArray3, n9, n11)) break;
                nArray3[n9++] = n11;
                break;
            } while ((n11 = this.cfr_renamed_6216(n11)) != 0);
            n10 = ++n2;
        }
        arg2[0] = n9;
        return nArray3;
    }

    public boolean cfr_renamed_6230(sproag arg0, int arg1) {
        return 2 * arg1 + 1 < this.cfr_renamed_2;
    }

    public int cfr_renamed_6231(byte[][] arg0, byte[] arg1) {
        int n;
        sproag sproag2 = this;
        int n2 = sproag2.cfr_renamed_2 - sproag2.cfr_renamed_152;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_152) {
            if (arg0[n] != null) {
                if (this.cfr_renamed_3[n2 + n]) {
                    return -1;
                }
                if (arg0[n] != null) {
                    sproag sproag3 = this;
                    System.arraycopy(arg0[n], 0, sproag3.cfr_renamed_119[n2 + n], 0, this.cfr_renamed_86);
                    sproag3.cfr_renamed_3[n2 + n] = true;
                }
            }
            n3 = ++n;
        }
        int n4 = n = this.cfr_renamed_2;
        while (n4 > 0) {
            this.cfr_renamed_6232(n--, arg1);
            n4 = n;
        }
        if (!this.cfr_renamed_3[0]) {
            return -1;
        }
        return 0;
    }

    public int cfr_renamed_6233(int[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = arg3;
        int[] nArray = new int[]{0};
        int[] nArray2 = this.cfr_renamed_6227(arg0, arg1, nArray);
        int n3 = n = 0;
        while (n3 < nArray[0]) {
            if ((n2 -= this.cfr_renamed_86) < 0) {
                return -1;
            }
            System.arraycopy(arg2, n * this.cfr_renamed_86, this.cfr_renamed_119[nArray2[n]], 0, this.cfr_renamed_86);
            int n4 = nArray2[n];
            this.cfr_renamed_3[n4] = true;
            n3 = ++n;
        }
        if (n2 != 0) {
            return -1;
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_6232(int arg0, byte[] arg1) {
        if (!this.cfr_renamed_6223(arg0)) {
            return;
        }
        sproag sproag2 = this;
        int n = sproag2.cfr_renamed_6216(arg0);
        if (sproag2.cfr_renamed_3[n]) {
            return;
        }
        if (!this.cfr_renamed_3[2 * n + 1]) {
            return;
        }
        if (this.cfr_renamed_6223(2 * n + 2) && !this.cfr_renamed_3[2 * n + 2]) {
            return;
        }
        sproag sproag3 = this;
        sproag3.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1221((byte)3);
        sproag3.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(this.cfr_renamed_119[2 * n + 1], 0, this.cfr_renamed_91.cfr_renamed_724);
        if (this.cfr_renamed_6220(n)) {
            this.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(this.cfr_renamed_119[2 * n + 2], 0, this.cfr_renamed_91.cfr_renamed_724);
        }
        sproag sproag4 = this;
        sproag4.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(arg1, 0, 32);
        sproag4.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_436(n), 0, 2);
        sproag4.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1199(this.cfr_renamed_119[n], 0, this.cfr_renamed_91.cfr_renamed_724);
        this.cfr_renamed_3[n] = true;
    }

    private /* synthetic */ boolean cfr_renamed_6221(int arg0) {
        return 2 * arg0 + 1 >= this.cfr_renamed_2;
    }

    public int cfr_renamed_6234(int[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int[] nArray = new int[]{0};
        int n2 = arg3;
        int[] nArray2 = this.cfr_renamed_6215(arg0, arg1, nArray);
        int n3 = n = 0;
        while (n3 < nArray[0]) {
            if ((n2 -= this.cfr_renamed_91.cfr_renamed_1) < 0) {
                cfr_renamed_0.fine(sprppx.cfr_renamed_9(":H\u0000S\u0015@\u001aE\u001aC\u001dRSU\u001a\\\u0016BSD\u0006@\u0015C\u0001\u0006\u0003T\u001cP\u001aB\u0016BSR\u001c\u0006\u0001C\u0005C\u0012J C\u0016B\u0000"));
                return 0;
            }
            byte[] byArray = this.cfr_renamed_119[nArray2[n]];
            int n4 = n * this.cfr_renamed_91.cfr_renamed_1;
            System.arraycopy(byArray, 0, arg2, n4, this.cfr_renamed_91.cfr_renamed_1);
            n3 = ++n;
        }
        return arg2.length - n2;
    }

    private /* synthetic */ boolean cfr_renamed_6223(int arg0) {
        if (arg0 >= this.cfr_renamed_2) {
            return false;
        }
        return this.cfr_renamed_1[arg0];
    }

    private /* synthetic */ int cfr_renamed_6216(int arg0) {
        if (this.cfr_renamed_6229(arg0)) {
            return (arg0 - 1) / 2;
        }
        return (arg0 - 2) / 2;
    }

    public void cfr_renamed_6235(byte[][] arg0, byte[] arg1) {
        int n;
        sproag sproag2 = this;
        int n2 = sproag2.cfr_renamed_2 - sproag2.cfr_renamed_152;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_152) {
            if (arg0[n] != null) {
                sproag sproag3 = this;
                System.arraycopy(arg0[n], 0, sproag3.cfr_renamed_119[n2 + n], 0, this.cfr_renamed_86);
                sproag3.cfr_renamed_3[n2 + n] = true;
            }
            n3 = ++n;
        }
        int n4 = n = this.cfr_renamed_2;
        while (n4 > 0) {
            this.cfr_renamed_6232(n--, arg1);
            n4 = n;
        }
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

    private /* synthetic */ boolean cfr_renamed_6220(int arg0) {
        return 2 * arg0 + 2 < this.cfr_renamed_2 && this.cfr_renamed_6223(arg0);
    }

    public int cfr_renamed_6236(int[] arg0, int arg1) {
        int[] nArray = new int[1];
        this.cfr_renamed_6227(arg0, arg1, nArray);
        return nArray[0] * this.cfr_renamed_91.cfr_renamed_724;
    }

    /*
     * WARNING - void declaration
     */
    public byte[] cfr_renamed_6237(int n) {
        void arg0;
        sproag sproag2 = this;
        int n2 = this.cfr_renamed_2 - sproag2.cfr_renamed_152;
        return sproag2.cfr_renamed_119[n2 + arg0];
    }

    private /* synthetic */ boolean cfr_renamed_6217(int arg0) {
        if (!this.cfr_renamed_6223(arg0)) {
            return false;
        }
        return !this.cfr_renamed_6229(arg0) || this.cfr_renamed_6223(arg0 + 1);
    }

    public byte[][] cfr_renamed_6238() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ void cfr_renamed_6225(byte[] arg0, byte[] arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        sproag sproag2 = this;
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1221(arg3);
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(arg1, 0, this.cfr_renamed_91.cfr_renamed_1);
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(arg2, 0, 32);
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_5167((short)(arg4 & 0xFFFF)), 0, 2);
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1197(sprpxe.cfr_renamed_5167((short)(arg5 & 0xFFFF)), 0, 2);
        sproag2.cfr_renamed_91.cfr_renamed_107.cfr_renamed_1199(arg0, 0, 2 * this.cfr_renamed_91.cfr_renamed_1);
    }

    private /* synthetic */ int cfr_renamed_6218(int arg0) {
        if (this.cfr_renamed_6229(arg0)) {
            if (arg0 + 1 < this.cfr_renamed_2) {
                return arg0 + 1;
            }
            cfr_renamed_0.fine(sprhwia.cfr_renamed_9("dkw]jlogmi9.qkr{f}w.eaq.magk#yjzk.maw.pgabj`d"));
            return 0;
        }
        return arg0 - 1;
    }

    public int cfr_renamed_6239(int[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n;
        int n2 = 0;
        int n3 = arg3;
        int[] nArray = new int[]{0};
        int[] nArray2 = this.cfr_renamed_6215(arg0, arg1, nArray);
        int n4 = n = 0;
        while (n4 < nArray[0]) {
            if ((n3 -= this.cfr_renamed_91.cfr_renamed_1) < 0) {
                return -1;
            }
            System.arraycopy(arg2, n * this.cfr_renamed_91.cfr_renamed_1, this.cfr_renamed_119[nArray2[n]], 0, this.cfr_renamed_91.cfr_renamed_1);
            int n5 = nArray2[n];
            this.cfr_renamed_3[n5] = true;
            n4 = ++n;
        }
        this.cfr_renamed_6224(arg4, arg5);
        return n2;
    }
}

