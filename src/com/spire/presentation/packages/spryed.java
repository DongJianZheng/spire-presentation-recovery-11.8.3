/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceea;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqcs;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.sprzra;
import java.util.Vector;

public class spryed
implements sprpj {
    private byte[] cfr_renamed_88;
    private byte[] cfr_renamed_31;
    private sprff cfr_renamed_272;
    private int cfr_renamed_145;
    private Vector cfr_renamed_114;
    private byte[] cfr_renamed_96;
    private long cfr_renamed_105;
    private byte[] cfr_renamed_137;
    private long cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private int cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 16;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprff cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3212(byte by) {
        void arg0;
        spryed spryed2 = this;
        this.cfr_renamed_107[spryed2.cfr_renamed_145] = arg0;
        if (++spryed2.cfr_renamed_145 == this.cfr_renamed_107.length) {
            this.cfr_renamed_3398();
        }
    }

    public void cfr_renamed_3398() {
        spryed spryed2 = this;
        spryed2.cfr_renamed_3399(spryed2.cfr_renamed_3400(spryed.cfr_renamed_3401(++spryed2.cfr_renamed_79)));
        this.cfr_renamed_145 = 0;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_272.cfr_renamed_1315()).append(sprceea.cfr_renamed_9("8\u0005T\b")).toString();
    }

    public static int cfr_renamed_3403(byte[] arg0, byte[] arg1) {
        int n = 16;
        int n2 = 0;
        while (--n >= 0) {
            int n3 = arg0[n] & 0xFF;
            arg1[n] = (byte)(n3 << 1 | n2);
            n2 = n3 >>> 7 & 1;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        spryed spryed2;
        spryed spryed3;
        sprnld sprnld2;
        spryed spryed4;
        int n;
        byte[] byArray;
        sprt sprt3;
        void arg1;
        void arg0;
        boolean bl2 = this.cfr_renamed_3;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_0 = null;
        if (sprt2 instanceof sprxfd) {
            sprt3 = (sprxfd)arg1;
            byArray = ((sprxfd)sprt3).cfr_renamed_596();
            sprt sprt4 = sprt3;
            this.cfr_renamed_152 = ((sprxfd)sprt4).cfr_renamed_3388();
            n = ((sprxfd)sprt4).cfr_renamed_2404();
            if (n < 64 || n > 128 || n % 8 != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqcs.cfr_renamed_9("\u0002D=K'C/\n=K'_.\n-E9\n\u0006k\b\n8C1Oq\n")).append(n).toString());
            }
            spryed4 = this;
            this.cfr_renamed_86 = n / 8;
            sprnld2 = ((sprxfd)sprt3).cfr_renamed_1521();
        } else if (arg1 instanceof sprnjd) {
            sprt3 = (sprnjd)arg1;
            byArray = ((sprnjd)sprt3).cfr_renamed_1205();
            spryed spryed5 = this;
            spryed5.cfr_renamed_152 = null;
            spryed5.cfr_renamed_86 = 16;
            sprnld2 = (sprnld)((sprnjd)sprt3).cfr_renamed_284();
            spryed4 = this;
        } else {
            throw new IllegalArgumentException(sprceea.cfr_renamed_9("~$a+{#sjg+e+z/c/e97:v9d/sjc%7\u0005T\b"));
        }
        spryed4.cfr_renamed_107 = new byte[16];
        this.cfr_renamed_102 = new byte[arg0 != false ? 16 : 16 + this.cfr_renamed_86];
        if (byArray == null) {
            byArray = new byte[]{};
        }
        if (byArray.length > 15) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("\u0002|kG>Y?\n)OkD$\n&E9Ok^#K%\nz\u001fkH2^.Y"));
        }
        if (sprnld2 != null) {
            spryed spryed6 = this;
            spryed3 = spryed6;
            this.cfr_renamed_4.cfr_renamed_1217(true, sprnld2);
            spryed6.cfr_renamed_272.cfr_renamed_1217((boolean)arg0, sprnld2);
            spryed6.cfr_renamed_96 = null;
        } else {
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sprceea.cfr_renamed_9(")v$y%cjt\"v$p/7/y)e3g>~$pjd>v>rj`#c\"x?cjg8x<~.~$pj|/nd"));
            }
            spryed3 = this;
        }
        spryed3.cfr_renamed_2 = new byte[16];
        spryed spryed7 = this;
        spryed7.cfr_renamed_4.cfr_renamed_3064(spryed7.cfr_renamed_2, 0, this.cfr_renamed_2, 0);
        spryed spryed8 = this;
        this.cfr_renamed_31 = spryed.cfr_renamed_3404(this.cfr_renamed_2);
        spryed spryed9 = this;
        spryed8.cfr_renamed_114 = new Vector();
        spryed8.cfr_renamed_114.addElement(spryed.cfr_renamed_3404(this.cfr_renamed_31));
        int n2 = spryed8.cfr_renamed_3405(byArray);
        n = n2 % 8;
        int n3 = n2 / 8;
        if (n == 0) {
            spryed spryed10 = this;
            spryed2 = spryed10;
            System.arraycopy(this.cfr_renamed_91, n3, spryed10.cfr_renamed_88, 0, 16);
        } else {
            int n4;
            int n5 = n4 = 0;
            while (n5 < 16) {
                spryed spryed11 = this;
                byte by = spryed11.cfr_renamed_91[n3];
                int n6 = by & 0xFF;
                int n7 = spryed11.cfr_renamed_91[++n3] & 0xFF;
                spryed11.cfr_renamed_88[n4++] = (byte)(n6 << n | n7 >>> 8 - n);
                n5 = n4;
            }
            spryed2 = this;
        }
        spryed2.cfr_renamed_145 = 0;
        spryed spryed12 = this;
        spryed spryed13 = this;
        spryed spryed14 = this;
        this.cfr_renamed_132 = 0;
        spryed14.cfr_renamed_79 = 0L;
        spryed14.cfr_renamed_105 = 0L;
        spryed13.cfr_renamed_137 = new byte[16];
        spryed13.cfr_renamed_93 = new byte[16];
        System.arraycopy(spryed12.cfr_renamed_88, 0, this.cfr_renamed_112, 0, 16);
        spryed12.cfr_renamed_1 = new byte[16];
        if (spryed12.cfr_renamed_152 != null) {
            spryed spryed15 = this;
            spryed15.cfr_renamed_2417(this.cfr_renamed_152, 0, spryed15.cfr_renamed_152.length);
        }
    }

    public static byte[] cfr_renamed_3404(byte[] arg0) {
        byte[] byArray = new byte[16];
        int n = spryed.cfr_renamed_3403(arg0, byArray);
        byArray[15] = (byte)(byArray[15] ^ 135 >>> (1 - n << 3));
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_0);
    }

    public void cfr_renamed_3399(byte[] byArray) {
        spryed spryed2 = this;
        spryed.cfr_renamed_1122(spryed2.cfr_renamed_137, byArray);
        spryed spryed3 = this;
        spryed.cfr_renamed_1122(spryed2.cfr_renamed_107, spryed3.cfr_renamed_137);
        spryed3.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_107, 0, this.cfr_renamed_107, 0);
        spryed spryed4 = this;
        spryed.cfr_renamed_1122(spryed4.cfr_renamed_93, spryed4.cfr_renamed_107);
    }

    /*
     * WARNING - void declaration
     */
    public spryed(sprff sprff2, sprff sprff3) {
        void arg1;
        void arg0;
        spryed spryed2 = this;
        spryed spryed3 = this;
        spryed3.cfr_renamed_96 = null;
        spryed3.cfr_renamed_91 = new byte[24];
        spryed2.cfr_renamed_88 = new byte[16];
        spryed2.cfr_renamed_112 = new byte[16];
        if (sprff2 == null) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("\r#K8B\bC;B.Xl\n(K%D$^kH.\n%_'F"));
        }
        if (arg0.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprceea.cfr_renamed_9("m\u007f+d\"T#g\"r80jz?d>7\"v<rjvju&x)|jd#m/7%qj&|"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("\r&K\"D\bC;B.Xl\n(K%D$^kH.\n%_'F"));
        }
        if (arg1.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprceea.cfr_renamed_9("mz+~$T#g\"r80jz?d>7\"v<rjvju&x)|jd#m/7%qj&|"));
        }
        if (!arg0.cfr_renamed_1315().equals(arg1.cfr_renamed_1315())) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("lB*Y#i\"Z#O9\rkK%Nk\r&K\"D\bC;B.Xl\n&_8^kH.\n?B.\n8K&OkK'M$X\"^#G"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_272 = arg1;
    }

    @Override
    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_272;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            spryed spryed2 = this;
            this.cfr_renamed_107[spryed2.cfr_renamed_145] = arg0[arg1 + n];
            if (++spryed2.cfr_renamed_145 == this.cfr_renamed_107.length) {
                this.cfr_renamed_3398();
            }
            n2 = ++n;
        }
    }

    public void cfr_renamed_3406(byte[] arg0, int arg1) {
        if (arg0.length < arg1 + 16) {
            throw new spreid(sprceea.cfr_renamed_9("\u0005b>g?cju?q,r87>x%79\u007f%e>"));
        }
        if (this.cfr_renamed_3) {
            spryed.cfr_renamed_1122(this.cfr_renamed_1, this.cfr_renamed_102);
            this.cfr_renamed_132 = 0;
        }
        spryed spryed2 = this;
        spryed.cfr_renamed_1122(this.cfr_renamed_112, spryed2.cfr_renamed_3400(spryed.cfr_renamed_3401(++spryed2.cfr_renamed_105)));
        spryed spryed3 = this;
        spryed spryed4 = this;
        spryed.cfr_renamed_1122(spryed3.cfr_renamed_102, spryed4.cfr_renamed_112);
        spryed3.cfr_renamed_272.cfr_renamed_3064(this.cfr_renamed_102, 0, this.cfr_renamed_102, 0);
        spryed spryed5 = this;
        spryed.cfr_renamed_1122(this.cfr_renamed_102, spryed5.cfr_renamed_112);
        System.arraycopy(spryed5.cfr_renamed_102, 0, arg0, arg1, 16);
        if (!spryed4.cfr_renamed_3) {
            spryed spryed6 = this;
            spryed spryed7 = this;
            spryed.cfr_renamed_1122(spryed6.cfr_renamed_1, spryed7.cfr_renamed_102);
            System.arraycopy(spryed6.cfr_renamed_102, 16, this.cfr_renamed_102, 0, this.cfr_renamed_86);
            spryed6.cfr_renamed_132 = spryed7.cfr_renamed_86;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprpjd {
        spryed spryed2;
        byte[] byArray = null;
        if (!this.cfr_renamed_3) {
            spryed spryed3 = this;
            if (spryed3.cfr_renamed_132 < spryed3.cfr_renamed_86) {
                throw new sprpjd(sprqcs.cfr_renamed_9("/K?Kk^$EkY#E9^"));
            }
            spryed spryed4 = this;
            spryed spryed5 = this;
            spryed4.cfr_renamed_132 -= spryed5.cfr_renamed_86;
            byArray = new byte[spryed5.cfr_renamed_86];
            System.arraycopy(spryed4.cfr_renamed_102, this.cfr_renamed_132, byArray, 0, this.cfr_renamed_86);
        }
        if (this.cfr_renamed_145 > 0) {
            spryed spryed6 = this;
            spryed spryed7 = this;
            spryed.cfr_renamed_3407(spryed6.cfr_renamed_107, spryed7.cfr_renamed_145);
            spryed7.cfr_renamed_3399(spryed6.cfr_renamed_2);
        }
        if (this.cfr_renamed_132 > 0) {
            if (this.cfr_renamed_3) {
                spryed spryed8 = this;
                spryed.cfr_renamed_3407(this.cfr_renamed_102, spryed8.cfr_renamed_132);
                spryed.cfr_renamed_1122(spryed8.cfr_renamed_1, this.cfr_renamed_102);
            }
            spryed spryed9 = this;
            spryed.cfr_renamed_1122(spryed9.cfr_renamed_112, spryed9.cfr_renamed_2);
            byte[] byArray2 = new byte[16];
            this.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_112, 0, byArray2, 0);
            spryed.cfr_renamed_1122(this.cfr_renamed_102, byArray2);
            if (arg0.length < arg1 + this.cfr_renamed_132) {
                throw new spreid(sprceea.cfr_renamed_9("\u0005b>g?cju?q,r87>x%79\u007f%e>"));
            }
            spryed spryed10 = this;
            System.arraycopy(spryed10.cfr_renamed_102, 0, arg0, arg1, this.cfr_renamed_132);
            if (!spryed10.cfr_renamed_3) {
                spryed spryed11 = this;
                spryed.cfr_renamed_3407(this.cfr_renamed_102, spryed11.cfr_renamed_132);
                spryed.cfr_renamed_1122(spryed11.cfr_renamed_1, this.cfr_renamed_102);
            }
        }
        spryed spryed12 = this;
        spryed spryed13 = this;
        spryed.cfr_renamed_1122(spryed12.cfr_renamed_1, spryed13.cfr_renamed_112);
        spryed.cfr_renamed_1122(spryed12.cfr_renamed_1, this.cfr_renamed_31);
        spryed13.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
        spryed spryed14 = this;
        spryed.cfr_renamed_1122(spryed14.cfr_renamed_1, this.cfr_renamed_93);
        this.cfr_renamed_0 = new byte[spryed14.cfr_renamed_86];
        System.arraycopy(spryed14.cfr_renamed_1, 0, this.cfr_renamed_0, 0, this.cfr_renamed_86);
        int n = spryed14.cfr_renamed_132;
        if (spryed12.cfr_renamed_3) {
            if (arg0.length < arg1 + n + this.cfr_renamed_86) {
                throw new spreid(sprqcs.cfr_renamed_9("e>^;_?\n)_-L.Xk^$EkY#E9^"));
            }
            spryed2 = this;
            System.arraycopy(this.cfr_renamed_0, 0, arg0, arg1 + n, this.cfr_renamed_86);
            n += this.cfr_renamed_86;
        } else {
            if (!sprzra.cfr_renamed_559(this.cfr_renamed_0, byArray)) {
                throw new sprpjd(sprceea.cfr_renamed_9("'v)7)\u007f/t!7#yjX\tUjq+~&r."));
            }
            spryed2 = this;
        }
        spryed2.cfr_renamed_3402(false);
        return n;
    }

    public int cfr_renamed_3405(byte[] arg0) {
        byte[] byArray = new byte[16];
        System.arraycopy(arg0, 0, byArray, byArray.length - arg0.length, arg0.length);
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(this.cfr_renamed_86 << 4);
        int n = 15 - arg0.length;
        byArray2[n] = (byte)(byArray2[n] | 1);
        byte[] byArray3 = byArray;
        int n2 = byArray[15] & 0x3F;
        byArray3[15] = (byte)(byArray3[15] & 0xC0);
        if (this.cfr_renamed_96 == null || !sprzra.cfr_renamed_92(byArray, this.cfr_renamed_96)) {
            byte[] byArray4 = new byte[16];
            this.cfr_renamed_96 = byArray;
            this.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_96, 0, byArray4, 0);
            System.arraycopy(byArray4, 0, this.cfr_renamed_91, 0, 16);
            int n3 = 0;
            int n4 = n3;
            while (n4 < 8) {
                int n5 = 16 + n3;
                byte by = (byte)(byArray4[n3] ^ byArray4[n3 + 1]);
                this.cfr_renamed_91[n5] = by;
                n4 = ++n3;
            }
        }
        return n2;
    }

    public static void cfr_renamed_3407(byte[] arg0, int arg1) {
        arg0[arg1] = -128;
        while (++arg1 < 16) {
            arg0[arg1] = 0;
        }
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_132;
        if (this.cfr_renamed_3) {
            return n + this.cfr_renamed_86;
        }
        if (n < this.cfr_renamed_86) {
            return 0;
        }
        return n - this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprjkd {
        void arg0;
        spryed spryed2 = this;
        this.cfr_renamed_102[spryed2.cfr_renamed_132] = arg0;
        if (++spryed2.cfr_renamed_132 == this.cfr_renamed_102.length) {
            void arg2;
            void arg1;
            this.cfr_renamed_3406((byte[])arg1, (int)arg2);
            return 16;
        }
        return 0;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_132;
        if (!this.cfr_renamed_3) {
            if (n < this.cfr_renamed_86) {
                return 0;
            }
            n -= this.cfr_renamed_86;
        }
        int n2 = n;
        return n2 - n2 % 16;
    }

    public void cfr_renamed_3402(boolean bl) {
        spryed spryed2 = this;
        spryed spryed3 = this;
        spryed spryed4 = this;
        spryed spryed5 = this;
        spryed5.cfr_renamed_4.cfr_renamed_41();
        spryed5.cfr_renamed_272.cfr_renamed_41();
        spryed5.cfr_renamed_3408(spryed5.cfr_renamed_107);
        spryed5.cfr_renamed_3408(spryed5.cfr_renamed_102);
        spryed4.cfr_renamed_145 = 0;
        spryed4.cfr_renamed_132 = 0;
        spryed3.cfr_renamed_79 = 0L;
        spryed3.cfr_renamed_105 = 0L;
        spryed2.cfr_renamed_3408(spryed2.cfr_renamed_137);
        spryed2.cfr_renamed_3408(spryed2.cfr_renamed_93);
        System.arraycopy(spryed2.cfr_renamed_88, 0, this.cfr_renamed_112, 0, 16);
        spryed2.cfr_renamed_3408(spryed2.cfr_renamed_1);
        if (bl) {
            this.cfr_renamed_0 = null;
        }
        if (this.cfr_renamed_152 != null) {
            spryed spryed6 = this;
            spryed6.cfr_renamed_2417(this.cfr_renamed_152, 0, spryed6.cfr_renamed_152.length);
        }
    }

    public byte[] cfr_renamed_3400(int arg0) {
        int n = arg0;
        while (n >= this.cfr_renamed_114.size()) {
            spryed spryed2 = this;
            spryed2.cfr_renamed_114.addElement(spryed.cfr_renamed_3404((byte[])spryed2.cfr_renamed_114.lastElement()));
            n = arg0;
        }
        return (byte[])this.cfr_renamed_114.elementAt(arg0);
    }

    public static int cfr_renamed_3401(long arg0) {
        if (arg0 == 0L) {
            return 64;
        }
        int n = 0;
        long l = arg0;
        while ((l & 1L) == 0L) {
            ++n;
            l = arg0 >>> 1;
        }
        return n;
    }

    public static void cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 15;
        while (n2 >= 0) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = --n;
        }
    }

    public void cfr_renamed_3408(byte[] arg0) {
        if (arg0 != null) {
            sprzra.cfr_renamed_492(arg0, (byte)0);
        }
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (arg0.length < arg1 + arg2) {
            throw new sprjkd(sprqcs.cfr_renamed_9("\u0002D;_?\n)_-L.Xk^$EkY#E9^"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spryed spryed2 = this;
            this.cfr_renamed_102[spryed2.cfr_renamed_132] = arg0[arg1 + n];
            if (++spryed2.cfr_renamed_132 == this.cfr_renamed_102.length) {
                int n4 = n2;
                n2 += 16;
                this.cfr_renamed_3406(arg3, arg4 + n4);
            }
            n3 = ++n;
        }
        return n2;
    }
}

