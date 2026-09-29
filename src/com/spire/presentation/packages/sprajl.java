/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdwy;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtil;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzbs;

public class sprajl
implements sprud {
    private int cfr_renamed_102;
    private sprtil cfr_renamed_93;
    private static final int cfr_renamed_86 = 32;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private final spriil cfr_renamed_119;
    private static final long cfr_renamed_91 = 0x100000000L;
    private byte[] cfr_renamed_0;
    public static final int cfr_renamed_1 = 65535;
    private byte[] cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    public sprajl(int arg0, byte[] arg1) {
        this(arg0, arg1, null, null, spriil.cfr_renamed_0);
    }

    private /* synthetic */ int cfr_renamed_10553() {
        if (this.cfr_renamed_112 == 65535) {
            return 32;
        }
        sprajl sprajl2 = this;
        return Math.min(32, sprajl2.cfr_renamed_112 - sprajl2.cfr_renamed_152);
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_93.cfr_renamed_3248();
    }

    private /* synthetic */ long cfr_renamed_10554() {
        return (long)this.cfr_renamed_112 * 0x100000000L;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_93.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg1 > arg0.length - arg2) {
            throw new sprwjl(sprdwy.cfr_renamed_9("\r,\u0016)\u0017-B;\u0017?\u0004<\u0010y\u00166\ry\u00111\r+\u0016"));
        }
        if (this.cfr_renamed_0 == null) {
            sprajl sprajl2 = this;
            sprajl2.cfr_renamed_0 = new byte[sprajl2.cfr_renamed_93.cfr_renamed_1218()];
            sprajl2.cfr_renamed_93.cfr_renamed_1219(this.cfr_renamed_0, 0);
        }
        if (this.cfr_renamed_112 != 65535) {
            if (this.cfr_renamed_152 + arg2 > this.cfr_renamed_112) {
                throw new IllegalArgumentException(sprzbs.cfr_renamed_9(">1\u00054\u00040Q(\u0014*\u00160\u0019d\u00187Q%\u0013+\u0007!Q0\u0019!Q \u0018#\u00147\u0005d\u001d!\u001f#\u0005,"));
            }
        } else if (this.cfr_renamed_3 << 5 >= this.cfr_renamed_10555()) {
            throw new IllegalArgumentException(sprdwy.cfr_renamed_9("/8\u001a0\u000f,\u000fy\u000e<\f>\u00161B0\u0011yP\u0007QkB;\u000e6\u00012\u0011y\r?BjPy\u0000 \u0016<\u0011"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            if (this.cfr_renamed_102 >= 32) {
                sprtil sprtil2 = new sprtil(this.cfr_renamed_10553(), 32, this.cfr_renamed_4);
                sprtil2.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
                sprajl sprajl3 = this;
                sproze.cfr_renamed_492(sprajl3.cfr_renamed_2, (byte)0);
                sprtil2.cfr_renamed_1219(sprajl3.cfr_renamed_2, 0);
                sprajl sprajl4 = this;
                sprajl4.cfr_renamed_102 = 0;
                ++sprajl4.cfr_renamed_4;
                ++sprajl4.cfr_renamed_3;
            }
            sprajl sprajl5 = this;
            arg0[arg1 + n] = sprajl5.cfr_renamed_2[sprajl5.cfr_renamed_102];
            sprajl sprajl6 = this;
            ++sprajl6.cfr_renamed_102;
            ++sprajl6.cfr_renamed_152;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public void cfr_renamed_41() {
        sprajl sprajl2 = this;
        sprajl sprajl3 = this;
        this.cfr_renamed_93.cfr_renamed_41();
        sprajl3.cfr_renamed_0 = null;
        sprajl3.cfr_renamed_102 = 32;
        sprajl2.cfr_renamed_152 = 0;
        sprajl2.cfr_renamed_3 = 0L;
        this.cfr_renamed_4 = this.cfr_renamed_10554();
    }

    public sprajl() {
        this(65535, spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        sprajl sprajl2 = this;
        int n = sprajl2.cfr_renamed_6410(arg0, arg1, arg2);
        sprajl2.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_93.cfr_renamed_1221(arg0);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprajl(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, spriil spriil2) {
        void arg3;
        void arg2;
        void arg1;
        void arg4;
        void arg0;
        sprajl sprajl2 = this;
        sprajl sprajl3 = this;
        this.cfr_renamed_0 = null;
        sprajl3.cfr_renamed_2 = new byte[32];
        sprajl3.cfr_renamed_102 = 32;
        sprajl2.cfr_renamed_152 = 0;
        sprajl2.cfr_renamed_3 = 0L;
        if (n < 1 || arg0 > 65535) {
            throw new IllegalArgumentException(sprzbs.cfr_renamed_9("\u0006=\u0005:\u0001C<\u0002d\u0015-\u0016!\u00020Q(\u0014*\u00160\u0019d\u001c1\u00020Q&\u0014d\u0013!\u00053\u0014!\u001fd@d\u0010*\u0015dC\u001a@r\\u"));
        }
        this.cfr_renamed_112 = arg0;
        this.cfr_renamed_4 = this.cfr_renamed_10554();
        this.cfr_renamed_119 = arg4;
        sprajl sprajl4 = this;
        this.cfr_renamed_93 = new sprtil(32, (byte[])arg1, (byte[])arg2, (byte[])arg3, this.cfr_renamed_4, (spriil)arg4);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprdwy.cfr_renamed_9("\u001b.\u0018)\u001cP!\u0011");
    }

    /*
     * WARNING - void declaration
     */
    public sprajl(sprajl sprajl2) {
        void arg0;
        sprajl sprajl3 = this;
        void v1 = arg0;
        sprajl sprajl4 = this;
        void v3 = arg0;
        sprajl sprajl5 = this;
        sprajl sprajl6 = this;
        sprajl sprajl7 = this;
        this.cfr_renamed_0 = null;
        sprajl7.cfr_renamed_2 = new byte[32];
        sprajl7.cfr_renamed_102 = 32;
        sprajl6.cfr_renamed_152 = 0;
        sprajl6.cfr_renamed_3 = 0L;
        sprajl5.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprajl sprajl8 = this;
        sprajl5.cfr_renamed_93 = new sprtil(arg0.cfr_renamed_93);
        sprajl5.cfr_renamed_0 = sproze.cfr_renamed_158(arg0.cfr_renamed_0);
        this.cfr_renamed_2 = sproze.cfr_renamed_158(v3.cfr_renamed_2);
        sprajl4.cfr_renamed_102 = v3.cfr_renamed_102;
        sprajl4.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprajl3.cfr_renamed_4 = v1.cfr_renamed_4;
        sprajl3.cfr_renamed_119 = sprajl2.cfr_renamed_119;
    }

    public sprajl(int arg0, spriil arg1) {
        this(arg0, null, null, null, arg1);
    }

    public sprajl(int arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    public long cfr_renamed_10555() {
        return 0x2000000000L;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        sprajl sprajl2 = this;
        return sprajl2.cfr_renamed_1199(byArray, (int)arg1, sprajl2.cfr_renamed_112);
    }
}

