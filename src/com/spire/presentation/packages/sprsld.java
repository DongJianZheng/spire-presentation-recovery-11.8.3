/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmd;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprmky;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqfd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvsz;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.sprzra;

public class sprsld
implements sprpj {
    private byte[] cfr_renamed_79;
    private static final byte cfr_renamed_107 = 1;
    private byte[] cfr_renamed_132;
    private static final byte cfr_renamed_102 = 2;
    private int cfr_renamed_93;
    private boolean cfr_renamed_86;
    private int cfr_renamed_152;
    private static final byte cfr_renamed_112 = 0;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprcmd cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private spruc cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_3453(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1) {
            byte by = this.cfr_renamed_91[n];
            byte by2 = arg0[arg1 + n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        return n2 == 0;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_93;
        if (this.cfr_renamed_86) {
            return n + this.cfr_renamed_1;
        }
        if (n < this.cfr_renamed_1) {
            return 0;
        }
        return n - this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_3416() {
        if (this.cfr_renamed_2) {
            return;
        }
        this.cfr_renamed_2 = true;
        this.cfr_renamed_4.cfr_renamed_1219(this.cfr_renamed_119, 0);
        byte[] byArray = new byte[this.cfr_renamed_152];
        byte[] byArray2 = byArray;
        sprsld sprsld2 = this;
        byArray[sprsld2.cfr_renamed_152 - 1] = 2;
        sprsld2.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, this.cfr_renamed_152);
    }

    public sprsld(sprff arg0) {
        sprsld sprsld2 = this;
        this.cfr_renamed_152 = arg0.cfr_renamed_1195();
        sprsld2.cfr_renamed_4 = new sprqfd(arg0);
        sprsld2.cfr_renamed_91 = new byte[this.cfr_renamed_152];
        sprsld2.cfr_renamed_119 = new byte[sprsld2.cfr_renamed_4.cfr_renamed_2404()];
        sprsld2.cfr_renamed_132 = new byte[sprsld2.cfr_renamed_4.cfr_renamed_2404()];
        sprsld2.cfr_renamed_0 = new sprcmd(arg0);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        sprsld sprsld2 = this;
        byte[] byArray = new byte[sprsld2.cfr_renamed_1];
        System.arraycopy(sprsld2.cfr_renamed_91, 0, byArray, 0, this.cfr_renamed_1);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        sprsld sprsld2;
        sprt sprt3;
        byte[] byArray;
        Object object;
        void arg1;
        void arg0;
        this.cfr_renamed_86 = arg0;
        if (sprt2 instanceof sprxfd) {
            object = (sprxfd)arg1;
            byArray = ((sprxfd)object).cfr_renamed_596();
            sprt sprt4 = object;
            this.cfr_renamed_79 = ((sprxfd)object).cfr_renamed_3388();
            this.cfr_renamed_1 = ((sprxfd)sprt4).cfr_renamed_2404() / 8;
            sprt3 = ((sprxfd)sprt4).cfr_renamed_1521();
            sprsld2 = this;
        } else if (arg1 instanceof sprnjd) {
            object = (sprnjd)arg1;
            byArray = ((sprnjd)object).cfr_renamed_1205();
            this.cfr_renamed_79 = null;
            this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_2404() / 2;
            sprt3 = ((sprnjd)object).cfr_renamed_284();
            sprsld2 = this;
        } else {
            throw new IllegalArgumentException(sprvsz.cfr_renamed_9("Ca\\nFfN/ZnXnGj^jX|\n\u007fK|YjN/^`\nJkW"));
        }
        sprsld sprsld3 = this;
        sprsld2.cfr_renamed_3 = new byte[arg0 != false ? sprsld3.cfr_renamed_152 : sprsld3.cfr_renamed_152 + this.cfr_renamed_1];
        sprsld sprsld4 = this;
        object = new byte[sprsld4.cfr_renamed_152];
        sprsld4.cfr_renamed_4.cfr_renamed_1524(sprt3);
        sprsld sprsld5 = this;
        object[sprsld5.cfr_renamed_152 - 1] = false;
        sprsld5.cfr_renamed_4.cfr_renamed_1197((byte[])object, 0, this.cfr_renamed_152);
        sprsld4.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        sprsld sprsld6 = this;
        sprsld6.cfr_renamed_4.cfr_renamed_1219(sprsld6.cfr_renamed_132, 0);
        sprsld sprsld7 = this;
        sprsld7.cfr_renamed_0.cfr_renamed_1217(true, new sprnjd(null, this.cfr_renamed_132));
        sprsld7.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprjkd {
        void arg2;
        void arg1;
        sprsld sprsld2 = this;
        sprsld2.cfr_renamed_3416();
        return sprsld2.cfr_renamed_3454(by, (byte[])arg1, (int)arg2);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprmky.cfr_renamed_9("z9\u007fX_\u0019O\u0019\u001b\u001bZ\u0016U\u0017OXY\u001d\u001b\u0019_\u001c^\u001c\u001b\u0019]\f^\n\u001b\u001dU\u001bI\u0001K\fR\u0017UW_\u001dX\nB\bO\u0011T\u0016\u001b\bI\u0017X\u001dH\u000bR\u0016\\XS\u0019HXY\u001d\\\rUV"));
        }
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprvsz.cfr_renamed_9("kNn/Nn^n\nlKaD`^/Hj\nnNkOk\nnL{O}\njDlXvZ{C`D NjI}C\u007f^fEa\n\u007fX`IjY|CaM/BnY/HjMzD!"));
        }
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ void cfr_renamed_3455() {
        sprsld sprsld2 = this;
        byte[] byArray = new byte[sprsld2.cfr_renamed_152];
        sprsld2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_91.length) {
            sprsld sprsld3 = this;
            int n3 = n;
            byte by = (byte)(sprsld3.cfr_renamed_132[n] ^ this.cfr_renamed_119[n3] ^ byArray[n]);
            sprsld3.cfr_renamed_91[n3] = by;
            n2 = ++n;
        }
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_0.cfr_renamed_1195();
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_2349().cfr_renamed_1315()).append(sprmky.cfr_renamed_9("\u0014=z ")).toString();
    }

    private /* synthetic */ int cfr_renamed_3454(byte arg0, byte[] arg1, int arg2) {
        this.cfr_renamed_3[this.cfr_renamed_93++] = arg0;
        sprsld sprsld2 = this;
        if (sprsld2.cfr_renamed_93 == sprsld2.cfr_renamed_3.length) {
            int n;
            sprsld sprsld3;
            if (arg1.length < arg2 + this.cfr_renamed_152) {
                throw new spreid(sprvsz.cfr_renamed_9("ez^\u007f_{\nm_iLjX/C|\n{E`\n|B`X{"));
            }
            if (this.cfr_renamed_86) {
                sprsld sprsld4 = this;
                sprsld sprsld5 = this;
                sprsld3 = sprsld5;
                n = sprsld4.cfr_renamed_0.cfr_renamed_3064(sprsld5.cfr_renamed_3, 0, arg1, arg2);
                sprsld4.cfr_renamed_4.cfr_renamed_1197(arg1, arg2, this.cfr_renamed_152);
            } else {
                sprsld sprsld6 = this;
                sprsld3 = sprsld6;
                sprsld sprsld7 = this;
                sprsld6.cfr_renamed_4.cfr_renamed_1197(sprsld7.cfr_renamed_3, 0, this.cfr_renamed_152);
                n = sprsld7.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_3, 0, arg1, arg2);
            }
            sprsld3.cfr_renamed_93 = 0;
            if (!this.cfr_renamed_86) {
                sprsld sprsld8 = this;
                System.arraycopy(sprsld8.cfr_renamed_3, this.cfr_renamed_152, this.cfr_renamed_3, 0, this.cfr_renamed_1);
                this.cfr_renamed_93 = sprsld8.cfr_renamed_1;
            }
            return n;
        }
        return 0;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_93;
        if (!this.cfr_renamed_86) {
            if (n < this.cfr_renamed_1) {
                return 0;
            }
            n -= this.cfr_renamed_1;
        }
        int n2 = n;
        return n2 - n2 % this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_505(byte[] byArray, int n, int n2, byte[] byArray2, int n3) throws sprjkd {
        int n4;
        void arg2;
        void arg1;
        this.cfr_renamed_3416();
        if (byArray.length < arg1 + arg2) {
            throw new sprjkd(sprmky.cfr_renamed_9("r\u0016K\rOXY\r]\u001e^\n\u001b\fT\u0017\u001b\u000bS\u0017I\f"));
        }
        int n5 = 0;
        int n6 = n4 = 0;
        while (n6 != arg2) {
            void arg4;
            void arg3;
            void arg0;
            void v1 = arg0[arg1 + n4];
            n5 += this.cfr_renamed_3454((byte)v1, (byte[])arg3, (int)(arg4 + n5));
            n6 = ++n4;
        }
        return n5;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprpjd {
        sprsld sprsld2 = this;
        sprsld2.cfr_renamed_3416();
        int n = sprsld2.cfr_renamed_93;
        byte[] byArray = new byte[sprsld2.cfr_renamed_3.length];
        this.cfr_renamed_93 = 0;
        if (this.cfr_renamed_86) {
            if (arg0.length < arg1 + n + this.cfr_renamed_1) {
                throw new spreid(sprvsz.cfr_renamed_9("@_{Zz^/HzLiO}\n{E`\n|B`X{"));
            }
            sprsld sprsld3 = this;
            sprsld3.cfr_renamed_0.cfr_renamed_3064(sprsld3.cfr_renamed_3, 0, byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1, n);
            sprsld sprsld4 = this;
            sprsld4.cfr_renamed_4.cfr_renamed_1197(byArray, 0, n);
            sprsld4.cfr_renamed_3455();
            System.arraycopy(this.cfr_renamed_91, 0, arg0, arg1 + n, this.cfr_renamed_1);
            sprsld4.cfr_renamed_3402(false);
            return n + this.cfr_renamed_1;
        }
        if (arg0.length < arg1 + n - this.cfr_renamed_1) {
            throw new spreid(sprmky.cfr_renamed_9("7N\fK\rOXY\r]\u001e^\n\u001b\fT\u0017\u001b\u000bS\u0017I\f"));
        }
        if (n < this.cfr_renamed_1) {
            throw new sprpjd(sprvsz.cfr_renamed_9("Nn^n\n{E`\n|B`X{"));
        }
        if (n > this.cfr_renamed_1) {
            sprsld sprsld5 = this;
            this.cfr_renamed_4.cfr_renamed_1197(sprsld5.cfr_renamed_3, 0, n - this.cfr_renamed_1);
            sprsld5.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_3, 0, byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1, n - this.cfr_renamed_1);
        }
        sprsld sprsld6 = this;
        sprsld6.cfr_renamed_3455();
        if (!sprsld6.cfr_renamed_3453(sprsld6.cfr_renamed_3, n - this.cfr_renamed_1)) {
            throw new sprpjd(sprmky.cfr_renamed_9("\u0015Z\u001b\u001b\u001bS\u001dX\u0013\u001b\u0011UX~9cX]\u0019R\u0014^\u001c"));
        }
        this.cfr_renamed_3402(false);
        return n - this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_3402(boolean bl) {
        sprsld sprsld2 = this;
        this.cfr_renamed_0.cfr_renamed_41();
        sprsld2.cfr_renamed_4.cfr_renamed_41();
        sprsld2.cfr_renamed_93 = 0;
        sprzra.cfr_renamed_492(sprsld2.cfr_renamed_3, (byte)0);
        if (bl) {
            sprzra.cfr_renamed_492(this.cfr_renamed_91, (byte)0);
        }
        sprsld sprsld3 = this;
        byte[] byArray = new byte[sprsld3.cfr_renamed_152];
        byte[] byArray2 = byArray;
        byArray[this.cfr_renamed_152 - 1] = 1;
        sprsld3.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, this.cfr_renamed_152);
        this.cfr_renamed_2 = false;
        if (sprsld3.cfr_renamed_79 != null) {
            sprsld sprsld4 = this;
            sprsld4.cfr_renamed_2417(this.cfr_renamed_79, 0, sprsld4.cfr_renamed_79.length);
        }
    }

    @Override
    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_0.cfr_renamed_2349();
    }
}

