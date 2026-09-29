/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprau;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfs;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprhrk;
import com.spire.presentation.packages.sprhw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprrzk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprutk;
import com.spire.presentation.packages.sprwjl;

public class sprgqk
implements sprhw {
    private long cfr_renamed_82;
    private int cfr_renamed_126;
    private byte[] cfr_renamed_88;
    private byte[] cfr_renamed_31;
    private long cfr_renamed_272;
    private sprfs cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private long cfr_renamed_96;
    private boolean cfr_renamed_105;
    private sprau cfr_renamed_137;
    private byte[] cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private sprmr cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private int cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 16;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static sprhw cfr_renamed_10060(sprmr arg0, sprau arg1) {
        return new sprgqk(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2.length - arg3 < 16) {
            throw new sprwjl(sprfvo.cfr_renamed_9("b\tY\fX\b\r\u001eX\u001aK\u0019_\\Y\u0013B\\^\u0014B\u000eY"));
        }
        if (this.cfr_renamed_272 == 0L) {
            this.cfr_renamed_3416();
        }
        byte[] byArray = new byte[16];
        sprgqk sprgqk2 = this;
        sprgqk sprgqk3 = this;
        sprgqk3.cfr_renamed_10061(byArray);
        sprrzk.cfr_renamed_10062(byArray, arg0, arg1);
        sprgqk2.cfr_renamed_3413(sprgqk3.cfr_renamed_2, byArray);
        System.arraycopy(byArray, 0, arg2, arg3, 16);
        sprgqk2.cfr_renamed_272 += 16L;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3402(boolean bl) {
        void arg0;
        sprgqk sprgqk2 = this;
        sprgqk sprgqk3 = this;
        sprgqk sprgqk4 = this;
        this.cfr_renamed_132.cfr_renamed_41();
        this.cfr_renamed_2 = new byte[16];
        sprgqk4.cfr_renamed_88 = new byte[16];
        sprgqk4.cfr_renamed_79 = new byte[16];
        sprgqk3.cfr_renamed_86 = new byte[16];
        sprgqk3.cfr_renamed_91 = 0;
        sprgqk2.cfr_renamed_82 = 0L;
        sprgqk2.cfr_renamed_96 = 0L;
        this.cfr_renamed_0 = sproze.cfr_renamed_158(this.cfr_renamed_3);
        this.cfr_renamed_93 = -2;
        this.cfr_renamed_126 = 0;
        this.cfr_renamed_272 = 0L;
        if (this.cfr_renamed_107 != null) {
            sproze.cfr_renamed_492(this.cfr_renamed_107, (byte)0);
        }
        if (arg0 != false) {
            this.cfr_renamed_112 = null;
        }
        if (this.cfr_renamed_105) {
            this.cfr_renamed_4 = false;
            return;
        }
        if (this.cfr_renamed_152 != null) {
            sprgqk sprgqk5 = this;
            sprgqk5.cfr_renamed_2417(this.cfr_renamed_152, 0, sprgqk5.cfr_renamed_152.length);
        }
    }

    private /* synthetic */ void cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2.length - arg3 < 16) {
            throw new sprwjl(sprqry.cfr_renamed_9("]PfUgQ2GgCt@`\u0005fJ}\u0005aM}Wf"));
        }
        if (this.cfr_renamed_272 == 0L) {
            this.cfr_renamed_3416();
        }
        byte[] byArray = new byte[16];
        sprgqk sprgqk2 = this;
        sprgqk sprgqk3 = this;
        sprgqk3.cfr_renamed_10061(byArray);
        sprgqk2.cfr_renamed_10063(sprgqk3.cfr_renamed_2, arg0, arg1);
        sprrzk.cfr_renamed_10064(byArray, 0, arg0, arg1, arg2, arg3);
        sprgqk2.cfr_renamed_272 += 16L;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3212(byte by) {
        void arg0;
        sprgqk sprgqk2 = this;
        sprgqk2.cfr_renamed_10065();
        sprgqk sprgqk3 = this;
        sprgqk2.cfr_renamed_86[sprgqk3.cfr_renamed_91] = arg0;
        if (++sprgqk3.cfr_renamed_91 == 16) {
            sprgqk sprgqk4 = this;
            sprgqk sprgqk5 = this;
            sprgqk4.cfr_renamed_3413(sprgqk5.cfr_renamed_88, sprgqk5.cfr_renamed_86);
            sprgqk4.cfr_renamed_91 = 0;
            sprgqk4.cfr_renamed_82 += 16L;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3413(byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprrzk.cfr_renamed_1122((byte[])arg0, (byte[])arg1);
        this.cfr_renamed_137.cfr_renamed_3237((byte[])arg0);
    }

    private /* synthetic */ void cfr_renamed_10061(byte[] arg0) {
        if (this.cfr_renamed_93 == 0) {
            throw new IllegalStateException(sprfvo.cfr_renamed_9("=Y\bH\u0011]\b\r\bB\\]\u000eB\u001fH\u000f^\\Y\u0013B\\@\u001dC\u0005\r\u001eA\u0013N\u0017^"));
        }
        sprgqk sprgqk2 = this;
        --this.cfr_renamed_93;
        int n = 1;
        sprgqk sprgqk3 = this;
        n = 1 + (sprgqk3.cfr_renamed_0[15] & 0xFF);
        sprgqk3.cfr_renamed_0[15] = (byte)n;
        n >>>= 8;
        sprgqk sprgqk4 = this;
        sprgqk2.cfr_renamed_0[14] = (byte)(n += sprgqk4.cfr_renamed_0[14] & 0xFF);
        n >>>= 8;
        sprgqk4.cfr_renamed_0[13] = (byte)(n += this.cfr_renamed_0[13] & 0xFF);
        n >>>= 8;
        sprgqk2.cfr_renamed_0[12] = (byte)(n += this.cfr_renamed_0[12] & 0xFF);
        sprgqk2.cfr_renamed_132.cfr_renamed_3064(this.cfr_renamed_0, 0, arg0, 0);
    }

    private /* synthetic */ void cfr_renamed_10065() {
        if (!this.cfr_renamed_4) {
            if (this.cfr_renamed_105) {
                throw new IllegalStateException(sprqry.cfr_renamed_9("bQh2F{Uz@`\u0005qD|K}Q2Gw\u0005`@gVwA2C}W2@|F`\\bQ{J|"));
            }
            throw new IllegalStateException(sprfvo.cfr_renamed_9(";n1\r\u001fD\fE\u0019_\\C\u0019H\u0018^\\Y\u0013\r\u001eH\\D\u0012D\bD\u001dA\u0015^\u0019I"));
        }
    }

    @Override
    public byte[] cfr_renamed_1472() {
        if (this.cfr_renamed_112 == null) {
            return new byte[this.cfr_renamed_1];
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_112);
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_132;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprgqk sprgqk2;
        sprgqk sprgqk3 = this;
        sprgqk3.cfr_renamed_10065();
        if (sprgqk3.cfr_renamed_272 == 0L) {
            this.cfr_renamed_3416();
        }
        sprgqk sprgqk4 = this;
        int n = sprgqk4.cfr_renamed_126;
        if (sprgqk4.cfr_renamed_105) {
            if (arg0.length - arg1 < n + this.cfr_renamed_1) {
                throw new sprwjl(sprqry.cfr_renamed_9("]PfUgQ2GgCt@`\u0005fJ}\u0005aM}Wf"));
            }
        } else {
            if (n < this.cfr_renamed_1) {
                throw new sprull(sprfvo.cfr_renamed_9("\u0018L\bL\\Y\u0013B\\^\u0014B\u000eY"));
            }
            if (arg0.length - arg1 < (n -= this.cfr_renamed_1)) {
                throw new sprwjl(sprqry.cfr_renamed_9("]PfUgQ2GgCt@`\u0005fJ}\u0005aM}Wf"));
            }
        }
        if (n > 0) {
            sprgqk sprgqk5 = this;
            sprgqk5.cfr_renamed_10066(sprgqk5.cfr_renamed_107, 0, n, arg0, arg1);
        }
        sprgqk sprgqk6 = this;
        sprgqk6.cfr_renamed_82 += (long)this.cfr_renamed_91;
        if (sprgqk6.cfr_renamed_82 > this.cfr_renamed_96) {
            if (this.cfr_renamed_91 > 0) {
                sprgqk sprgqk7 = this;
                sprgqk7.cfr_renamed_3418(this.cfr_renamed_88, sprgqk7.cfr_renamed_86, 0, this.cfr_renamed_91);
            }
            if (this.cfr_renamed_96 > 0L) {
                sprgqk sprgqk8 = this;
                sprrzk.cfr_renamed_1122(sprgqk8.cfr_renamed_88, sprgqk8.cfr_renamed_79);
            }
            sprgqk sprgqk9 = this;
            long l = sprgqk9.cfr_renamed_272 * 8L + 127L >>> 7;
            byte[] byArray = new byte[16];
            if (sprgqk9.cfr_renamed_145 == null) {
                this.cfr_renamed_145 = new sprutk();
                this.cfr_renamed_145.cfr_renamed_148(this.cfr_renamed_114);
            }
            sprgqk sprgqk10 = this;
            sprgqk10.cfr_renamed_145.cfr_renamed_3419(l, byArray);
            sprrzk.cfr_renamed_3420(sprgqk10.cfr_renamed_88, byArray);
            sprrzk.cfr_renamed_1122(sprgqk10.cfr_renamed_2, this.cfr_renamed_88);
        }
        byte[] byArray = new byte[16];
        sprgqk sprgqk11 = this;
        sprgqk sprgqk12 = this;
        sprpxe.cfr_renamed_450(sprgqk12.cfr_renamed_82 * 8L, byArray, 0);
        sprpxe.cfr_renamed_450(sprgqk12.cfr_renamed_272 * 8L, byArray, 8);
        sprgqk11.cfr_renamed_3413(sprgqk12.cfr_renamed_2, byArray);
        byte[] byArray2 = new byte[16];
        sprgqk11.cfr_renamed_132.cfr_renamed_3064(this.cfr_renamed_3, 0, byArray2, 0);
        sprrzk.cfr_renamed_1122(byArray2, this.cfr_renamed_2);
        int n2 = n;
        this.cfr_renamed_112 = new byte[this.cfr_renamed_1];
        System.arraycopy(byArray2, 0, this.cfr_renamed_112, 0, this.cfr_renamed_1);
        if (sprgqk11.cfr_renamed_105) {
            System.arraycopy(this.cfr_renamed_112, 0, arg0, arg1 + this.cfr_renamed_126, this.cfr_renamed_1);
            sprgqk sprgqk13 = this;
            sprgqk2 = sprgqk13;
            n2 += sprgqk13.cfr_renamed_1;
        } else {
            sprgqk sprgqk14 = this;
            byte[] byArray3 = new byte[sprgqk14.cfr_renamed_1];
            System.arraycopy(sprgqk14.cfr_renamed_107, n, byArray3, 0, this.cfr_renamed_1);
            if (!sproze.cfr_renamed_559(sprgqk14.cfr_renamed_112, byArray3)) {
                throw new sprull(sprfvo.cfr_renamed_9("@\u001dN\\N\u0014H\u001fF\\D\u0012\r;n1\r\u001aL\u0015A\u0019I"));
            }
            sprgqk2 = this;
        }
        sprgqk2.cfr_renamed_3402(false);
        return n2;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_126;
        if (this.cfr_renamed_105) {
            return n + this.cfr_renamed_1;
        }
        if (n < this.cfr_renamed_1) {
            return 0;
        }
        return n - this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl {
        void arg0;
        sprgqk sprgqk2 = this;
        sprgqk2.cfr_renamed_10065();
        sprgqk sprgqk3 = this;
        sprgqk2.cfr_renamed_107[sprgqk3.cfr_renamed_126] = arg0;
        if (++sprgqk3.cfr_renamed_126 == this.cfr_renamed_107.length) {
            void arg2;
            void arg1;
            if (this.cfr_renamed_105) {
                sprgqk sprgqk4 = this;
                sprgqk4.cfr_renamed_3393(sprgqk4.cfr_renamed_107, 0, (byte[])arg1, (int)arg2);
                sprgqk4.cfr_renamed_126 = 0;
            } else {
                sprgqk sprgqk5 = this;
                sprgqk5.cfr_renamed_3396(sprgqk5.cfr_renamed_107, 0, (byte[])arg1, (int)arg2);
                System.arraycopy(sprgqk5.cfr_renamed_107, 16, this.cfr_renamed_107, 0, this.cfr_renamed_1);
                sprgqk5.cfr_renamed_126 = sprgqk5.cfr_renamed_1;
            }
            return 16;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_505(byte[] byArray, int n, int n2, byte[] byArray2, int n3) throws sprddl {
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        this.cfr_renamed_10065();
        if (byArray.length - arg1 < arg2) {
            throw new sprddl(sprqry.cfr_renamed_9("l|UgQ2GgCt@`\u0005fJ}\u0005aM}Wf"));
        }
        int n4 = 0;
        if (this.cfr_renamed_105) {
            int n5;
            if (this.cfr_renamed_126 > 0) {
                n5 = 16 - this.cfr_renamed_126;
                if (arg2 < n5) {
                    sprgqk sprgqk2 = this;
                    System.arraycopy(arg0, (int)arg1, sprgqk2.cfr_renamed_107, this.cfr_renamed_126, (int)arg2);
                    sprgqk2.cfr_renamed_126 += arg2;
                    return 0;
                }
                sprgqk sprgqk3 = this;
                System.arraycopy(arg0, (int)arg1, sprgqk3.cfr_renamed_107, sprgqk3.cfr_renamed_126, n5);
                sprgqk sprgqk4 = this;
                sprgqk4.cfr_renamed_3393(sprgqk4.cfr_renamed_107, 0, (byte[])arg3, (int)arg4);
                arg1 += n5;
                arg2 -= n5;
                n4 = 16;
            }
            n5 = arg1 + arg2 - 16;
            void v3 = arg1;
            while (v3 <= n5) {
                void v4 = arg1;
                this.cfr_renamed_3393((byte[])arg0, (int)v4, (byte[])arg3, (int)(arg4 + n4));
                n4 += 16;
                v3 = arg1 += 16;
            }
            this.cfr_renamed_126 = 16 + n5 - arg1;
            System.arraycopy(arg0, (int)arg1, this.cfr_renamed_107, 0, this.cfr_renamed_126);
            return n4;
        }
        int n6 = this.cfr_renamed_107.length - this.cfr_renamed_126;
        if (arg2 < n6) {
            sprgqk sprgqk5 = this;
            System.arraycopy(arg0, (int)arg1, sprgqk5.cfr_renamed_107, this.cfr_renamed_126, (int)arg2);
            sprgqk5.cfr_renamed_126 += arg2;
            return 0;
        }
        if (this.cfr_renamed_126 >= 16) {
            sprgqk sprgqk6 = this;
            sprgqk6.cfr_renamed_3396(sprgqk6.cfr_renamed_107, 0, (byte[])arg3, (int)arg4);
            System.arraycopy(sprgqk6.cfr_renamed_107, 16, this.cfr_renamed_107, 0, this.cfr_renamed_126 -= 16);
            n4 = 16;
            if (arg2 < (n6 += 16)) {
                sprgqk sprgqk7 = this;
                System.arraycopy(arg0, (int)arg1, sprgqk7.cfr_renamed_107, this.cfr_renamed_126, (int)arg2);
                sprgqk7.cfr_renamed_126 += arg2;
                return n4;
            }
        }
        void var8_9 = arg1 + arg2 - this.cfr_renamed_107.length;
        n6 = 16 - this.cfr_renamed_126;
        void v8 = arg1;
        sprgqk sprgqk8 = this;
        System.arraycopy(arg0, (int)v8, sprgqk8.cfr_renamed_107, this.cfr_renamed_126, n6);
        this.cfr_renamed_3396(sprgqk8.cfr_renamed_107, 0, (byte[])arg3, (int)(arg4 + n4));
        n4 += 16;
        void v10 = arg1 = v8 + n6;
        while (v10 <= var8_9) {
            void v11 = arg1;
            this.cfr_renamed_3396((byte[])arg0, (int)v11, (byte[])arg3, (int)(arg4 + n4));
            n4 += 16;
            v10 = arg1 += 16;
        }
        this.cfr_renamed_126 = this.cfr_renamed_107.length + var8_9 - arg1;
        System.arraycopy(arg0, (int)arg1, this.cfr_renamed_107, 0, this.cfr_renamed_126);
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgqk(sprmr sprmr2, sprau sprau2) {
        void arg0;
        sprhrk arg1;
        if (sprmr2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprfvo.cfr_renamed_9("\u001fD\fE\u0019_\\_\u0019\\\tD\u000eH\u0018\r\u000bD\bE\\L\\O\u0010B\u001fF\\^\u0015W\u0019\r\u0013K\\\u001cJ\u0003"));
        }
        if (arg1 == null) {
            arg1 = new sprhrk();
        }
        this.cfr_renamed_132 = arg0;
        this.cfr_renamed_137 = arg1;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        int n;
        sprgqk sprgqk2 = this;
        sprgqk2.cfr_renamed_10065();
        if (sprgqk2.cfr_renamed_91 > 0) {
            n = 16 - this.cfr_renamed_91;
            if (arg2 < n) {
                sprgqk sprgqk3 = this;
                System.arraycopy(arg0, arg1, sprgqk3.cfr_renamed_86, this.cfr_renamed_91, arg2);
                sprgqk3.cfr_renamed_91 += arg2;
                return;
            }
            sprgqk sprgqk4 = this;
            System.arraycopy(arg0, arg1, sprgqk4.cfr_renamed_86, sprgqk4.cfr_renamed_91, n);
            sprgqk sprgqk5 = this;
            sprgqk sprgqk6 = this;
            sprgqk5.cfr_renamed_3413(sprgqk5.cfr_renamed_88, sprgqk6.cfr_renamed_86);
            sprgqk6.cfr_renamed_82 += 16L;
            arg1 += n;
            arg2 -= n;
        }
        n = arg1 + arg2 - 16;
        int n2 = arg1;
        while (n2 <= n) {
            sprgqk sprgqk7 = this;
            sprgqk7.cfr_renamed_10063(sprgqk7.cfr_renamed_88, arg0, arg1);
            sprgqk7.cfr_renamed_82 += 16L;
            n2 = arg1 += 16;
        }
        this.cfr_renamed_91 = 16 + n - arg1;
        System.arraycopy(arg0, arg1, this.cfr_renamed_86, 0, this.cfr_renamed_91);
    }

    private /* synthetic */ void cfr_renamed_3412(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = Math.min(arg2 - n, 16);
            int n4 = n;
            this.cfr_renamed_3418(arg0, arg1, n4, n3);
            n2 = n += 16;
        }
    }

    private /* synthetic */ void cfr_renamed_3416() {
        if (this.cfr_renamed_82 > 0L) {
            sprgqk sprgqk2 = this;
            System.arraycopy(this.cfr_renamed_88, 0, sprgqk2.cfr_renamed_79, 0, 16);
            this.cfr_renamed_96 = sprgqk2.cfr_renamed_82;
        }
        if (this.cfr_renamed_91 > 0) {
            sprgqk sprgqk3 = this;
            sprgqk sprgqk4 = this;
            sprgqk3.cfr_renamed_3418(sprgqk3.cfr_renamed_79, sprgqk4.cfr_renamed_86, 0, this.cfr_renamed_91);
            sprgqk4.cfr_renamed_96 += (long)this.cfr_renamed_91;
        }
        if (this.cfr_renamed_96 > 0L) {
            System.arraycopy(this.cfr_renamed_79, 0, this.cfr_renamed_2, 0, 16);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3418(byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprrzk.cfr_renamed_3421((byte[])arg0, (byte[])arg1, (int)arg2, (int)arg3);
        this.cfr_renamed_137.cfr_renamed_3237((byte[])arg0);
    }

    private /* synthetic */ void cfr_renamed_10066(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] byArray;
        byte[] byArray2 = new byte[16];
        sprgqk sprgqk2 = this;
        sprgqk2.cfr_renamed_10061(byArray2);
        if (sprgqk2.cfr_renamed_105) {
            sprgqk sprgqk3 = this;
            byArray = arg0;
            sprrzk.cfr_renamed_10067(arg0, arg1, byArray2, 0, arg2);
            sprgqk3.cfr_renamed_3418(sprgqk3.cfr_renamed_2, arg0, arg1, arg2);
        } else {
            sprgqk sprgqk4 = this;
            sprgqk4.cfr_renamed_3418(sprgqk4.cfr_renamed_2, arg0, arg1, arg2);
            byArray = arg0;
            sprrzk.cfr_renamed_10067(arg0, arg1, byArray2, 0, arg2);
        }
        System.arraycopy(byArray, arg1, arg3, arg4, arg2);
        this.cfr_renamed_272 += (long)arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprgqk sprgqk2;
        sprgqk sprgqk3;
        void v2;
        sprtpk sprtpk2;
        sprbj sprbj3;
        void arg1;
        void arg0;
        sprgqk sprgqk4 = this;
        this.cfr_renamed_105 = arg0;
        sprgqk4.cfr_renamed_112 = null;
        sprgqk4.cfr_renamed_4 = true;
        byte[] byArray = null;
        if (arg1 instanceof sprtxk) {
            sprbj3 = (sprtxk)arg1;
            byArray = ((sprtxk)sprbj3).cfr_renamed_596();
            sprbj sprbj4 = sprbj3;
            this.cfr_renamed_152 = ((sprtxk)sprbj4).cfr_renamed_3388();
            int n = ((sprtxk)sprbj4).cfr_renamed_2404();
            if (n < 32 || n > 128 || n % 8 != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqry.cfr_renamed_9("l|SsI{A2SsIg@2C}W2hSf2V{_w\u001f2")).append(n).toString());
            }
            this.cfr_renamed_1 = n / 8;
            sprtpk2 = ((sprtxk)sprbj3).cfr_renamed_1521();
            v2 = arg0;
        } else if (arg1 instanceof sprkpk) {
            sprbj3 = (sprkpk)arg1;
            byArray = ((sprkpk)sprbj3).cfr_renamed_1205();
            sprgqk sprgqk5 = this;
            sprgqk5.cfr_renamed_152 = null;
            sprgqk5.cfr_renamed_1 = 16;
            sprtpk2 = (sprtpk)((sprkpk)sprbj3).cfr_renamed_284();
            v2 = arg0;
        } else {
            throw new IllegalArgumentException(sprfvo.cfr_renamed_9("\u0015C\nL\u0010D\u0018\r\fL\u000eL\u0011H\bH\u000e^\\]\u001d^\u000fH\u0018\r\bB\\j?`"));
        }
        int n = v2 != false ? 16 : 16 + this.cfr_renamed_1;
        this.cfr_renamed_107 = new byte[n];
        if (byArray == null || byArray.length < 1) {
            throw new IllegalArgumentException(sprqry.cfr_renamed_9("lD\u0005\u007fPaQ2Gw\u0005sQ2IwDaQ2\u00142GkQw"));
        }
        if (arg0 != false && this.cfr_renamed_31 != null && sproze.cfr_renamed_92(this.cfr_renamed_31, byArray)) {
            if (sprtpk2 == null) {
                throw new IllegalArgumentException(sprfvo.cfr_renamed_9("N\u001dC\u0012B\b\r\u000eH\t^\u0019\r\u0012B\u0012N\u0019\r\u001aB\u000e\r;n1\r\u0019C\u001f_\u0005]\bD\u0013C"));
            }
            if (this.cfr_renamed_102 != null && sproze.cfr_renamed_92(this.cfr_renamed_102, sprtpk2.cfr_renamed_1521())) {
                throw new IllegalArgumentException(sprqry.cfr_renamed_9("qD|K}Q2WwPa@2K}Kq@2C}W2bQh2@|F`\\bQ{J|"));
            }
        }
        this.cfr_renamed_31 = byArray;
        if (sprtpk2 != null) {
            this.cfr_renamed_102 = sprtpk2.cfr_renamed_1521();
        }
        sprgqk sprgqk6 = this;
        if (sprtpk2 != null) {
            sprgqk6.cfr_renamed_132.cfr_renamed_5535(true, sprtpk2);
            this.cfr_renamed_114 = new byte[16];
            this.cfr_renamed_132.cfr_renamed_3064(this.cfr_renamed_114, 0, this.cfr_renamed_114, 0);
            sprgqk3 = this;
            sprgqk sprgqk7 = this;
            sprgqk7.cfr_renamed_137.cfr_renamed_148(sprgqk7.cfr_renamed_114);
            this.cfr_renamed_145 = null;
        } else {
            if (sprgqk6.cfr_renamed_114 == null) {
                throw new IllegalArgumentException(sprfvo.cfr_renamed_9("f\u0019T\\@\t^\b\r\u001eH\\^\fH\u001fD\u001aD\u0019I\\D\u0012\r\u0015C\u0015Y\u0015L\u0010\r\u0015C\u0015Y"));
            }
            sprgqk3 = this;
        }
        sprgqk3.cfr_renamed_3 = new byte[16];
        if (this.cfr_renamed_31.length == 12) {
            System.arraycopy(this.cfr_renamed_31, 0, this.cfr_renamed_3, 0, this.cfr_renamed_31.length);
            sprgqk sprgqk8 = this;
            sprgqk2 = sprgqk8;
            sprgqk8.cfr_renamed_3[15] = 1;
        } else {
            sprgqk sprgqk9 = this;
            sprgqk9.cfr_renamed_3412(sprgqk9.cfr_renamed_3, sprgqk9.cfr_renamed_31, this.cfr_renamed_31.length);
            byte[] byArray2 = new byte[16];
            sprpxe.cfr_renamed_450((long)this.cfr_renamed_31.length * 8L, byArray2, 8);
            sprgqk sprgqk10 = this;
            sprgqk2 = sprgqk10;
            sprgqk10.cfr_renamed_3413(sprgqk10.cfr_renamed_3, byArray2);
        }
        sprgqk2.cfr_renamed_2 = new byte[16];
        sprgqk sprgqk11 = this;
        sprgqk sprgqk12 = this;
        sprgqk sprgqk13 = this;
        sprgqk13.cfr_renamed_88 = new byte[16];
        sprgqk13.cfr_renamed_79 = new byte[16];
        sprgqk12.cfr_renamed_86 = new byte[16];
        sprgqk12.cfr_renamed_91 = 0;
        sprgqk11.cfr_renamed_82 = 0L;
        sprgqk11.cfr_renamed_96 = 0L;
        this.cfr_renamed_0 = sproze.cfr_renamed_158(this.cfr_renamed_3);
        this.cfr_renamed_93 = -2;
        this.cfr_renamed_126 = 0;
        this.cfr_renamed_272 = 0L;
        if (this.cfr_renamed_152 != null) {
            sprgqk sprgqk14 = this;
            sprgqk14.cfr_renamed_2417(this.cfr_renamed_152, 0, sprgqk14.cfr_renamed_152.length);
        }
    }

    public static sprhw cfr_renamed_7530(sprmr arg0) {
        return new sprgqk(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10063(byte[] byArray, byte[] byArray2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprrzk.cfr_renamed_10062((byte[])arg0, (byte[])arg1, (int)arg2);
        this.cfr_renamed_137.cfr_renamed_3237((byte[])arg0);
    }

    public sprgqk(sprmr arg0) {
        this(arg0, null);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_132.cfr_renamed_1315()).append(sprqry.cfr_renamed_9("\nUf_")).toString();
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_126;
        if (!this.cfr_renamed_105) {
            if (n < this.cfr_renamed_1) {
                return 0;
            }
            n -= this.cfr_renamed_1;
        }
        int n2 = n;
        return n2 - n2 % 16;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }
}

