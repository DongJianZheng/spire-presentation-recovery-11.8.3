/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbim;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprsqk;
import com.spire.presentation.packages.sprtuk;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprwal;
import com.spire.presentation.packages.spryvi;
import com.spire.presentation.packages.sprzil;

public class sprtyk {
    private int cfr_renamed_137;
    private sprsqk[] cfr_renamed_79;
    private static final int cfr_renamed_107 = 4;
    private static final int cfr_renamed_132 = 64;
    private static final int cfr_renamed_102 = 1024;
    private static final byte[] cfr_renamed_93 = new byte[4];
    private static final int cfr_renamed_86 = 4;
    private sprqvk cfr_renamed_152;
    private static final int cfr_renamed_112 = 128;
    private static final int cfr_renamed_119 = 1;
    private static final int cfr_renamed_91 = 1;
    private static final int cfr_renamed_0 = 128;
    private static final int cfr_renamed_1 = 72;
    private static final int cfr_renamed_2 = 0x1000000;
    private static final long cfr_renamed_3 = 0xFFFFFFFFL;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10194(sprtuk sprtuk2, sprsqk sprsqk2, sprsqk sprsqk3) {
        void arg2;
        void arg0;
        void arg1;
        long[] lArray = sprsqk.cfr_renamed_10195((sprsqk)arg1);
        lArray[6] = lArray[6] + 1L;
        void v1 = arg0;
        sprtuk.cfr_renamed_10196((sprtuk)v1, (sprsqk)arg1, (sprsqk)arg2);
        sprtuk.cfr_renamed_10196((sprtuk)v1, sprsqk3, (sprsqk)arg2);
    }

    private /* synthetic */ int cfr_renamed_10197(sprwal arg0, int arg1, long arg2, boolean arg3) {
        long l;
        int n;
        int n2;
        if (arg0.cfr_renamed_3 == 0) {
            n2 = 0;
            if (arg3) {
                n = arg0.cfr_renamed_2 * this.cfr_renamed_137 + arg1 - 1;
                l = arg2;
            } else {
                n = arg0.cfr_renamed_2 * this.cfr_renamed_137 + (arg1 == 0 ? -1 : 0);
                l = arg2;
            }
        } else {
            n2 = (arg0.cfr_renamed_2 + 1) * this.cfr_renamed_137 % this.cfr_renamed_4;
            sprtyk sprtyk2 = this;
            if (arg3) {
                n = sprtyk2.cfr_renamed_4 - this.cfr_renamed_137 + arg1 - 1;
                l = arg2;
            } else {
                n = sprtyk2.cfr_renamed_4 - this.cfr_renamed_137 + (arg1 == 0 ? -1 : 0);
                l = arg2;
            }
        }
        long l2 = l & 0xFFFFFFFFL;
        l2 = l2 * l2 >>> 32;
        l2 = (long)(n - 1) - ((long)n * l2 >>> 32);
        return (int)((long)n2 + l2) % this.cfr_renamed_4;
    }

    private /* synthetic */ boolean cfr_renamed_10198(sprwal arg0) {
        return this.cfr_renamed_152.cfr_renamed_324() == 1 || this.cfr_renamed_152.cfr_renamed_324() == 2 && arg0.cfr_renamed_3 == 0 && arg0.cfr_renamed_2 < 2;
    }

    public int cfr_renamed_7899(char[] arg0, byte[] arg1) {
        sprtyk sprtyk2 = this;
        return sprtyk2.cfr_renamed_10199(sprtyk2.cfr_renamed_152.cfr_renamed_10002().cfr_renamed_9492(arg0), arg1);
    }

    private /* synthetic */ void cfr_renamed_10200(sprqvk arg0) {
        int n = arg0.cfr_renamed_10000();
        if (n < 8 * arg0.cfr_renamed_10001()) {
            n = 8 * arg0.cfr_renamed_10001();
        }
        sprtyk sprtyk2 = this;
        sprtyk2.cfr_renamed_137 = n / (arg0.cfr_renamed_10001() * 4);
        sprtyk2.cfr_renamed_4 = sprtyk2.cfr_renamed_137 * 4;
        n = sprtyk2.cfr_renamed_137 * (arg0.cfr_renamed_10001() * 4);
        sprtyk2.cfr_renamed_10201(n);
    }

    private /* synthetic */ long cfr_renamed_10202(int arg0) {
        return (long)arg0 & 0xFFFFFFFFL;
    }

    private /* synthetic */ void cfr_renamed_10203(sprtuk arg0, sprwal arg1) {
        int n;
        sprsqk sprsqk2 = null;
        sprsqk sprsqk3 = null;
        sprwal sprwal2 = arg1;
        boolean bl = this.cfr_renamed_10198(sprwal2);
        int n2 = sprtyk.cfr_renamed_10204(arg1);
        sprtyk sprtyk2 = this;
        int n3 = sprwal2.cfr_renamed_4 * this.cfr_renamed_4 + arg1.cfr_renamed_2 * sprtyk2.cfr_renamed_137 + n2;
        int n4 = sprtyk2.cfr_renamed_10205(n3);
        if (bl) {
            sprtuk sprtuk2 = arg0;
            sprsqk2 = sprtuk2.cfr_renamed_4.cfr_renamed_722();
            sprsqk3 = sprtuk2.cfr_renamed_1.cfr_renamed_722();
            this.cfr_renamed_10206(arg0, arg1, sprsqk3, sprsqk2);
        }
        boolean bl2 = this.cfr_renamed_10207(arg1);
        int n5 = n = n2;
        while (n5 < this.cfr_renamed_137) {
            int n6;
            long l;
            sprtyk sprtyk3 = this;
            int n7 = sprtyk3.cfr_renamed_10208(arg1, l = this.cfr_renamed_10209(arg0, n, sprsqk2, sprsqk3, n4, bl));
            int n8 = sprtyk3.cfr_renamed_10197(arg1, n, l, n7 == arg1.cfr_renamed_4);
            sprtyk sprtyk4 = this;
            sprsqk sprsqk4 = sprtyk4.cfr_renamed_79[n4];
            sprtyk sprtyk5 = this;
            sprsqk sprsqk5 = sprtyk4.cfr_renamed_79[sprtyk5.cfr_renamed_4 * n7 + n8];
            sprsqk sprsqk6 = sprtyk5.cfr_renamed_79[n3];
            if (bl2) {
                n6 = n3;
                sprtuk.cfr_renamed_10210(arg0, sprsqk4, sprsqk5, sprsqk6);
            } else {
                sprtuk.cfr_renamed_10211(arg0, sprsqk4, sprsqk5, sprsqk6);
                n6 = n3;
            }
            n4 = n6;
            n5 = ++n;
            ++n3;
        }
    }

    public int cfr_renamed_10212(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 4) {
            throw new IllegalStateException(sprbim.cfr_renamed_9("\u000b\u0004\u0010\u0001\u0011\u0005D\u001d\u0001\u001f\u0003\u0005\fQ\b\u0014\u0017\u0002D\u0005\f\u0010\nQP"));
        }
        byte[] byArray = new byte[1024];
        sprtyk sprtyk2 = this;
        this.cfr_renamed_10213(byArray, arg0, arg3);
        sprtyk2.cfr_renamed_10214();
        sprtyk2.cfr_renamed_10215(byArray, arg1, arg2, arg3);
        sprtyk2.cfr_renamed_41();
        return arg3;
    }

    private /* synthetic */ int cfr_renamed_10208(sprwal arg0, long arg1) {
        int n = (int)((arg1 >>> 32) % (long)this.cfr_renamed_152.cfr_renamed_10001());
        if (arg0.cfr_renamed_3 == 0 && arg0.cfr_renamed_2 == 0) {
            n = arg0.cfr_renamed_4;
        }
        return n;
    }

    public static /* synthetic */ void cfr_renamed_10216(sprsqk arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        sprtyk.cfr_renamed_10217(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }

    private /* synthetic */ void cfr_renamed_10213(byte[] arg0, byte[] arg1, int arg2) {
        sprzil sprzil2 = new sprzil(512);
        int[] nArray = new int[6];
        nArray[0] = this.cfr_renamed_152.cfr_renamed_10001();
        nArray[1] = arg2;
        nArray[2] = this.cfr_renamed_152.cfr_renamed_10000();
        nArray[3] = this.cfr_renamed_152.cfr_renamed_1490();
        nArray[4] = this.cfr_renamed_152.cfr_renamed_3();
        nArray[5] = this.cfr_renamed_152.cfr_renamed_324();
        int[] nArray2 = nArray;
        sprpxe.cfr_renamed_449(nArray2, arg0, 0);
        sprzil2.cfr_renamed_1197(arg0, 0, nArray2.length * 4);
        sprzil sprzil3 = sprzil2;
        sprtyk.cfr_renamed_10218(arg0, sprzil2, arg1);
        sprtyk.cfr_renamed_10218(arg0, sprzil3, this.cfr_renamed_152.cfr_renamed_1477());
        sprtyk.cfr_renamed_10218(arg0, sprzil3, this.cfr_renamed_152.cfr_renamed_3880());
        sprtyk.cfr_renamed_10218(arg0, sprzil2, this.cfr_renamed_152.cfr_renamed_10003());
        byte[] byArray = new byte[72];
        sprzil2.cfr_renamed_1219(byArray, 0);
        this.cfr_renamed_10219(arg0, byArray);
    }

    private /* synthetic */ int cfr_renamed_10205(int arg0) {
        if (arg0 % this.cfr_renamed_4 == 0) {
            return arg0 + this.cfr_renamed_4 - 1;
        }
        return arg0 - 1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_10220(long[] lArray, int n, int n2, int n3, int n4) {
        void arg3;
        void arg4;
        void arg2;
        void arg1;
        long[] arg0;
        sprtyk.cfr_renamed_10221(arg0, (int)arg1, (int)arg2, (int)arg4, 32);
        sprtyk.cfr_renamed_10221(arg0, (int)arg3, (int)arg4, (int)arg2, 24);
        sprtyk.cfr_renamed_10221(arg0, (int)arg1, (int)arg2, (int)arg4, 16);
        sprtyk.cfr_renamed_10221(arg0, n3, (int)arg4, (int)arg2, 63);
    }

    public void cfr_renamed_7898(sprqvk arg0) {
        this.cfr_renamed_152 = arg0;
        if (this.cfr_renamed_152.cfr_renamed_10001() < 1) {
            throw new IllegalStateException(spryvi.cfr_renamed_9("H<J8W}I(W)\u0004?A}C/A<P8V}P5E3\u0004l"));
        }
        if (arg0.cfr_renamed_10001() > 0x1000000) {
            throw new IllegalStateException(sprbim.cfr_renamed_9("\u001d\u0005\u001f\u0001\u0002D\u001c\u0011\u0002\u0010Q\u0006\u0014D\u001d\u0001\u0002\u0017Q\u0010\u0019\u0005\u001fD@RFSFV@R"));
        }
        if (arg0.cfr_renamed_10000() < 2 * arg0.cfr_renamed_10001()) {
            throw new IllegalStateException(new StringBuilder().insert(0, spryvi.cfr_renamed_9("0A0K/]}M.\u00041A.W}P5E3\u001e}")).append(2 * arg0.cfr_renamed_10001()).append(sprbim.cfr_renamed_9("Q\u0001\t\u0014\u0014\u0007\u0005\u0001\u0015D")).append(2 * arg0.cfr_renamed_10001()).toString());
        }
        if (arg0.cfr_renamed_1490() < 1) {
            throw new IllegalStateException(spryvi.cfr_renamed_9("M)A/E)M2J.\u00044W}H8W.\u0004)L<Jg\u0004l"));
        }
        this.cfr_renamed_10200(arg0);
    }

    private /* synthetic */ void cfr_renamed_10222(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        byte[] byArray = new byte[4];
        sprpxe.cfr_renamed_437(arg3, byArray, 0);
        int n = 64;
        if (arg3 <= n) {
            sprzil sprzil2 = new sprzil(arg3 * 8);
            sprzil2.cfr_renamed_1197(byArray, 0, byArray.length);
            sprzil2.cfr_renamed_1197(arg0, 0, arg0.length);
            sprzil2.cfr_renamed_1219(arg1, arg2);
            return;
        }
        sprzil sprzil3 = new sprzil(n * 8);
        byte[] byArray2 = new byte[n];
        sprzil3.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzil3.cfr_renamed_1197(arg0, 0, arg0.length);
        sprzil3.cfr_renamed_1219(byArray2, 0);
        int n2 = n / 2;
        int n3 = arg2;
        System.arraycopy(byArray2, 0, arg1, n3, n2);
        n3 += n2;
        int n4 = (arg3 + 31) / 32 - 2;
        int n5 = 2;
        int n6 = n5;
        while (n6 <= n4) {
            sprzil3.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprzil3.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, arg1, n3, n2);
            n3 += n2;
            n6 = ++n5;
        }
        n5 = arg3 - 32 * n4;
        sprzil3 = new sprzil(n5 * 8);
        sprzil3.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprzil3.cfr_renamed_1219(arg1, n3);
    }

    private /* synthetic */ void cfr_renamed_10215(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        sprtyk sprtyk2 = this;
        sprsqk sprsqk2 = sprtyk2.cfr_renamed_79[sprtyk2.cfr_renamed_4 - 1];
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_152.cfr_renamed_10001()) {
            int n3 = n * this.cfr_renamed_4 + (this.cfr_renamed_4 - 1);
            sprsqk.cfr_renamed_10223(sprsqk2, this.cfr_renamed_79[n3]);
            n2 = ++n;
        }
        sprsqk2.cfr_renamed_10224(arg0);
        this.cfr_renamed_10222(arg0, arg1, arg2, arg3);
    }

    private static /* synthetic */ void cfr_renamed_10217(sprsqk arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        long[] lArray = sprsqk.cfr_renamed_10195(arg0);
        sprtyk.cfr_renamed_10220(lArray, arg1, arg5, arg9, arg13);
        sprtyk.cfr_renamed_10220(lArray, arg2, arg6, arg10, arg14);
        sprtyk.cfr_renamed_10220(lArray, arg3, arg7, arg11, arg15);
        sprtyk.cfr_renamed_10220(lArray, arg4, arg8, arg12, arg16);
        sprtyk.cfr_renamed_10220(lArray, arg1, arg6, arg11, arg16);
        sprtyk.cfr_renamed_10220(lArray, arg2, arg7, arg12, arg13);
        sprtyk.cfr_renamed_10220(lArray, arg3, arg8, arg9, arg14);
        sprtyk.cfr_renamed_10220(lArray, arg4, arg5, arg10, arg15);
    }

    private /* synthetic */ void cfr_renamed_41() {
        if (null != this.cfr_renamed_79) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_79.length) {
                sprsqk sprsqk2 = this.cfr_renamed_79[n];
                if (null != sprsqk2) {
                    sprsqk2.cfr_renamed_722();
                }
                n2 = ++n;
            }
        }
    }

    private /* synthetic */ void cfr_renamed_10214() {
        int n;
        sprtuk sprtuk2 = new sprtuk(null);
        sprwal sprwal2 = new sprwal();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152.cfr_renamed_1490()) {
            int n3;
            sprwal2.cfr_renamed_3 = n;
            int n4 = n3 = 0;
            while (n4 < 4) {
                int n5;
                sprwal2.cfr_renamed_2 = n3;
                int n6 = n5 = 0;
                while (n6 < this.cfr_renamed_152.cfr_renamed_10001()) {
                    sprwal2.cfr_renamed_4 = n5++;
                    this.cfr_renamed_10203(sprtuk2, sprwal2);
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    private static /* synthetic */ void cfr_renamed_10218(byte[] arg0, sprgf arg1, byte[] arg2) {
        if (null == arg2) {
            arg1.cfr_renamed_1197(cfr_renamed_93, 0, 4);
            return;
        }
        sprpxe.cfr_renamed_437(arg2.length, arg0, 0);
        sprgf sprgf2 = arg1;
        sprgf2.cfr_renamed_1197(arg0, 0, 4);
        sprgf2.cfr_renamed_1197(arg2, 0, arg2.length);
    }

    public int cfr_renamed_10199(byte[] arg0, byte[] arg1) {
        return this.cfr_renamed_10212(arg0, arg1, 0, arg1.length);
    }

    private /* synthetic */ boolean cfr_renamed_10207(sprwal arg0) {
        return arg0.cfr_renamed_3 != 0 && this.cfr_renamed_152.cfr_renamed_3() != 16;
    }

    public int cfr_renamed_10225(char[] arg0, byte[] arg1, int arg2, int arg3) {
        sprtyk sprtyk2 = this;
        return sprtyk2.cfr_renamed_10212(sprtyk2.cfr_renamed_152.cfr_renamed_10002().cfr_renamed_9492(arg0), arg1, arg2, arg3);
    }

    private static /* synthetic */ int cfr_renamed_10204(sprwal arg0) {
        if (arg0.cfr_renamed_3 == 0 && arg0.cfr_renamed_2 == 0) {
            return 2;
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_10206(sprtuk arg0, sprwal arg1, sprsqk arg2, sprsqk arg3) {
        sprsqk sprsqk2 = arg2;
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk2)[0] = this.cfr_renamed_10202(arg1.cfr_renamed_3);
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk2)[1] = this.cfr_renamed_10202(arg1.cfr_renamed_4);
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk2)[2] = this.cfr_renamed_10202(arg1.cfr_renamed_2);
        sprtyk sprtyk2 = this;
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk2)[3] = sprtyk2.cfr_renamed_10202(sprtyk2.cfr_renamed_79.length);
        sprsqk sprsqk3 = arg2;
        sprtyk sprtyk3 = this;
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk3)[4] = sprtyk3.cfr_renamed_10202(sprtyk3.cfr_renamed_152.cfr_renamed_1490());
        sprtyk sprtyk4 = this;
        sprsqk.cfr_renamed_10195((sprsqk)sprsqk3)[5] = sprtyk4.cfr_renamed_10202(sprtyk4.cfr_renamed_152.cfr_renamed_324());
        if (arg1.cfr_renamed_3 == 0 && arg1.cfr_renamed_2 == 0) {
            this.cfr_renamed_10194(arg0, arg2, arg3);
        }
    }

    private /* synthetic */ void cfr_renamed_10219(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[72];
        System.arraycopy(arg1, 0, byArray, 0, 64);
        byArray[64] = 1;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152.cfr_renamed_10001()) {
            sprpxe.cfr_renamed_437(n, arg1, 68);
            sprpxe.cfr_renamed_437(n, byArray, 68);
            sprtyk sprtyk2 = this;
            this.cfr_renamed_10222(arg1, arg0, 0, 1024);
            sprtyk2.cfr_renamed_79[n * this.cfr_renamed_4 + 0].cfr_renamed_6993(arg0);
            sprtyk2.cfr_renamed_10222(byArray, arg0, 0, 1024);
            int n3 = n * this.cfr_renamed_4 + 1;
            sprtyk2.cfr_renamed_79[n3].cfr_renamed_6993(arg0);
            n2 = ++n;
        }
    }

    private /* synthetic */ long cfr_renamed_10209(sprtuk arg0, int arg1, sprsqk arg2, sprsqk arg3, int arg4, boolean arg5) {
        if (arg5) {
            int n = arg1 % 128;
            if (n == 0) {
                this.cfr_renamed_10194(arg0, arg3, arg2);
            }
            return sprsqk.cfr_renamed_10195(arg2)[n];
        }
        return sprsqk.cfr_renamed_10195(this.cfr_renamed_79[arg4])[0];
    }

    private /* synthetic */ void cfr_renamed_10201(int arg0) {
        int n;
        this.cfr_renamed_79 = new sprsqk[arg0];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_79.length) {
            this.cfr_renamed_79[n++] = new sprsqk(null);
            n2 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_10221(long[] arg0, int arg1, int arg2, int arg3, int arg4) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1];
        long l2 = lArray2[arg2];
        long l3 = lArray[arg3];
        long l4 = l;
        long l5 = l2;
        l = l4 + (l5 + 2L * (l4 & 0xFFFFFFFFL) * (l5 & 0xFFFFFFFFL));
        l3 = sprtwe.cfr_renamed_5186(l3 ^ l, arg4);
        lArray2[arg1] = l;
        lArray[arg3] = l3;
    }
}

