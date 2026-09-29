/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcma;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnwk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprswk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvly;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzu;

public class sproqk
implements sprzu {
    private spraq cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private sprswk cfr_renamed_102;
    private static final byte cfr_renamed_93 = 2;
    private static final byte cfr_renamed_86 = 0;
    private byte[] cfr_renamed_152;
    private boolean cfr_renamed_112;
    private boolean cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static final byte cfr_renamed_3 = 1;
    private byte[] cfr_renamed_4;

    public sproqk(sprmr arg0) {
        sproqk sproqk2 = this;
        this.cfr_renamed_1 = arg0.cfr_renamed_1195();
        sproqk2.cfr_renamed_79 = new sprnwk(arg0);
        sproqk2.cfr_renamed_132 = new byte[this.cfr_renamed_1];
        sproqk2.cfr_renamed_152 = new byte[sproqk2.cfr_renamed_79.cfr_renamed_2404()];
        sproqk2.cfr_renamed_4 = new byte[sproqk2.cfr_renamed_79.cfr_renamed_2404()];
        sproqk2.cfr_renamed_102 = new sprswk(arg0);
    }

    private /* synthetic */ void cfr_renamed_3416() {
        if (this.cfr_renamed_112) {
            return;
        }
        this.cfr_renamed_112 = true;
        this.cfr_renamed_79.cfr_renamed_1219(this.cfr_renamed_152, 0);
        byte[] byArray = new byte[this.cfr_renamed_1];
        byte[] byArray2 = byArray;
        sproqk sproqk2 = this;
        byArray[sproqk2.cfr_renamed_1 - 1] = 2;
        sproqk2.cfr_renamed_79.cfr_renamed_1197(byArray2, 0, this.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_3402(boolean bl) {
        sproqk sproqk2 = this;
        this.cfr_renamed_102.cfr_renamed_41();
        sproqk2.cfr_renamed_79.cfr_renamed_41();
        sproqk2.cfr_renamed_91 = 0;
        sproze.cfr_renamed_492(sproqk2.cfr_renamed_107, (byte)0);
        if (bl) {
            sproze.cfr_renamed_492(this.cfr_renamed_132, (byte)0);
        }
        sproqk sproqk3 = this;
        byte[] byArray = new byte[sproqk3.cfr_renamed_1];
        byte[] byArray2 = byArray;
        byArray[this.cfr_renamed_1 - 1] = 1;
        sproqk3.cfr_renamed_79.cfr_renamed_1197(byArray2, 0, this.cfr_renamed_1);
        this.cfr_renamed_112 = false;
        if (sproqk3.cfr_renamed_2 != null) {
            sproqk sproqk4 = this;
            sproqk4.cfr_renamed_2417(this.cfr_renamed_2, 0, sproqk4.cfr_renamed_2.length);
        }
    }

    @Override
    public byte[] cfr_renamed_1472() {
        sproqk sproqk2 = this;
        byte[] byArray = new byte[sproqk2.cfr_renamed_0];
        System.arraycopy(sproqk2.cfr_renamed_132, 0, byArray, 0, this.cfr_renamed_0);
        return byArray;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_102.cfr_renamed_2349();
    }

    private /* synthetic */ void cfr_renamed_3455() {
        sproqk sproqk2 = this;
        byte[] byArray = new byte[sproqk2.cfr_renamed_1];
        sproqk2.cfr_renamed_79.cfr_renamed_1219(byArray, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_132.length) {
            sproqk sproqk3 = this;
            int n3 = n;
            byte by = (byte)(sproqk3.cfr_renamed_4[n] ^ this.cfr_renamed_152[n3] ^ byArray[n]);
            sproqk3.cfr_renamed_132[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_102.cfr_renamed_2349().cfr_renamed_1315()).append(sprcma.cfr_renamed_9("U\u0002;\u001f")).toString();
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        if (this.cfr_renamed_112) {
            throw new IllegalStateException(sprvly.cfr_renamed_9("Z\u0003_b\u007f#o#;!z,u-oby';#\u007f&~&;#}6~0;'u!i;k6r-um\u007f'x0b2o+t,;2i-x'h1r,|bs#hby'|7ul"));
        }
        this.cfr_renamed_79.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl {
        void arg2;
        void arg1;
        sproqk sproqk2 = this;
        sproqk2.cfr_renamed_3416();
        return sproqk2.cfr_renamed_3454(by, (byte[])arg1, (int)arg2);
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_91;
        if (!this.cfr_renamed_119) {
            if (n < this.cfr_renamed_0) {
                return 0;
            }
            n -= this.cfr_renamed_0;
        }
        int n2 = n;
        return n2 - n2 % this.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_112) {
            throw new IllegalStateException(sprcma.cfr_renamed_9(";\u0006>g\u001e&\u000e&Z$\u001b)\u0014(\u000eg\u0018\"Z&\u001e#\u001f#Z&\u001c3\u001f5Z\"\u0014$\b>\n3\u0013(\u0014h\u001e\"\u00195\u00037\u000e.\u0015)Z7\b(\u0019\"\t4\u0013)\u001dg\u0012&\tg\u0018\"\u001d2\u0014i"));
        }
        this.cfr_renamed_79.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_91;
        if (this.cfr_renamed_119) {
            return n + this.cfr_renamed_0;
        }
        if (n < this.cfr_renamed_0) {
            return 0;
        }
        return n - this.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    private /* synthetic */ int cfr_renamed_3454(byte arg0, byte[] arg1, int arg2) {
        this.cfr_renamed_107[this.cfr_renamed_91++] = arg0;
        sproqk sproqk2 = this;
        if (sproqk2.cfr_renamed_91 == sproqk2.cfr_renamed_107.length) {
            int n;
            sproqk sproqk3;
            if (arg1.length < arg2 + this.cfr_renamed_1) {
                throw new sprwjl(sprvly.cfr_renamed_9("T7o2n6; n$}'ibr1;6t-;1s-i6"));
            }
            if (this.cfr_renamed_119) {
                sproqk sproqk4 = this;
                sproqk sproqk5 = this;
                sproqk3 = sproqk5;
                n = sproqk4.cfr_renamed_102.cfr_renamed_3064(sproqk5.cfr_renamed_107, 0, arg1, arg2);
                sproqk4.cfr_renamed_79.cfr_renamed_1197(arg1, arg2, this.cfr_renamed_1);
            } else {
                sproqk sproqk6 = this;
                sproqk3 = sproqk6;
                sproqk sproqk7 = this;
                sproqk6.cfr_renamed_79.cfr_renamed_1197(sproqk7.cfr_renamed_107, 0, this.cfr_renamed_1);
                n = sproqk7.cfr_renamed_102.cfr_renamed_3064(this.cfr_renamed_107, 0, arg1, arg2);
            }
            sproqk3.cfr_renamed_91 = 0;
            if (!this.cfr_renamed_119) {
                sproqk sproqk8 = this;
                System.arraycopy(sproqk8.cfr_renamed_107, this.cfr_renamed_1, this.cfr_renamed_107, 0, this.cfr_renamed_0);
                this.cfr_renamed_91 = sproqk8.cfr_renamed_0;
            }
            return n;
        }
        return 0;
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_102.cfr_renamed_1195();
    }

    private /* synthetic */ boolean cfr_renamed_3453(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_0) {
            byte by = this.cfr_renamed_132[n];
            byte by2 = arg0[arg1 + n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sproqk sproqk2;
        sprbj sprbj3;
        byte[] byArray;
        Object object;
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        if (sprbj2 instanceof sprtxk) {
            object = (sprtxk)arg1;
            byArray = ((sprtxk)object).cfr_renamed_596();
            sprbj sprbj4 = object;
            this.cfr_renamed_2 = ((sprtxk)object).cfr_renamed_3388();
            this.cfr_renamed_0 = ((sprtxk)sprbj4).cfr_renamed_2404() / 8;
            sprbj3 = ((sprtxk)sprbj4).cfr_renamed_1521();
            sproqk2 = this;
        } else if (arg1 instanceof sprkpk) {
            object = (sprkpk)arg1;
            byArray = ((sprkpk)object).cfr_renamed_1205();
            this.cfr_renamed_2 = null;
            this.cfr_renamed_0 = this.cfr_renamed_79.cfr_renamed_2404() / 2;
            sprbj3 = ((sprkpk)object).cfr_renamed_284();
            sproqk2 = this;
        } else {
            throw new IllegalArgumentException(sprcma.cfr_renamed_9("\u0013)\f&\u0016.\u001eg\n&\b&\u0017\"\u000e\"\b4Z7\u001b4\t\"\u001eg\u000e(Z\u0002;\u001f"));
        }
        sproqk sproqk3 = this;
        sproqk2.cfr_renamed_107 = new byte[arg0 != false ? sproqk3.cfr_renamed_1 : sproqk3.cfr_renamed_1 + this.cfr_renamed_0];
        sproqk sproqk4 = this;
        object = new byte[sproqk4.cfr_renamed_1];
        sproqk4.cfr_renamed_79.cfr_renamed_5692(sprbj3);
        sproqk sproqk5 = this;
        object[sproqk5.cfr_renamed_1 - 1] = false;
        sproqk5.cfr_renamed_79.cfr_renamed_1197((byte[])object, 0, this.cfr_renamed_1);
        sproqk4.cfr_renamed_79.cfr_renamed_1197(byArray, 0, byArray.length);
        sproqk sproqk6 = this;
        sproqk6.cfr_renamed_79.cfr_renamed_1219(sproqk6.cfr_renamed_4, 0);
        sproqk sproqk7 = this;
        sproqk7.cfr_renamed_102.cfr_renamed_5535(true, new sprkpk(sprbj3, this.cfr_renamed_4));
        sproqk7.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_505(byte[] byArray, int n, int n2, byte[] byArray2, int n3) throws sprddl {
        int n4;
        void arg2;
        void arg1;
        this.cfr_renamed_3416();
        if (byArray.length < arg1 + arg2) {
            throw new sprddl(sprvly.cfr_renamed_9("R,k7oby7}$~0;6t-;1s-i6"));
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
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sproqk sproqk2 = this;
        sproqk2.cfr_renamed_3416();
        int n = sproqk2.cfr_renamed_91;
        byte[] byArray = new byte[sproqk2.cfr_renamed_107.length];
        this.cfr_renamed_91 = 0;
        if (this.cfr_renamed_119) {
            if (arg0.length < arg1 + n + this.cfr_renamed_0) {
                throw new sprwjl(sprcma.cfr_renamed_9("\b\u000f3\n2\u000eg\u00182\u001c!\u001f5Z3\u0015(Z4\u0012(\b3"));
            }
            sproqk sproqk3 = this;
            sproqk3.cfr_renamed_102.cfr_renamed_3064(sproqk3.cfr_renamed_107, 0, byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1, n);
            sproqk sproqk4 = this;
            sproqk4.cfr_renamed_79.cfr_renamed_1197(byArray, 0, n);
            sproqk4.cfr_renamed_3455();
            System.arraycopy(this.cfr_renamed_132, 0, arg0, arg1 + n, this.cfr_renamed_0);
            sproqk4.cfr_renamed_3402(false);
            return n + this.cfr_renamed_0;
        }
        if (n < this.cfr_renamed_0) {
            throw new sprull(sprvly.cfr_renamed_9("\u007f#o#;6t-;1s-i6"));
        }
        if (arg0.length < arg1 + n - this.cfr_renamed_0) {
            throw new sprwjl(sprcma.cfr_renamed_9("\b\u000f3\n2\u000eg\u00182\u001c!\u001f5Z3\u0015(Z4\u0012(\b3"));
        }
        if (n > this.cfr_renamed_0) {
            sproqk sproqk5 = this;
            this.cfr_renamed_79.cfr_renamed_1197(sproqk5.cfr_renamed_107, 0, n - this.cfr_renamed_0);
            sproqk5.cfr_renamed_102.cfr_renamed_3064(this.cfr_renamed_107, 0, byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1, n - this.cfr_renamed_0);
        }
        sproqk sproqk6 = this;
        sproqk6.cfr_renamed_3455();
        if (!sproqk6.cfr_renamed_3453(sproqk6.cfr_renamed_107, n - this.cfr_renamed_0)) {
            throw new sprull(sprvly.cfr_renamed_9("/z!;!s'x);+ub^\u0003Cb}#r.~&"));
        }
        this.cfr_renamed_3402(false);
        return n - this.cfr_renamed_0;
    }
}

