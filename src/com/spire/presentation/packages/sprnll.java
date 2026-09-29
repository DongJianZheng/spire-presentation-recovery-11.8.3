/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spresy;
import com.spire.presentation.packages.sprgjl;
import com.spire.presentation.packages.sprhrc;
import com.spire.presentation.packages.sprnjl;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwjl;
import java.io.ByteArrayOutputStream;

public class sprnll
implements sprud {
    private long cfr_renamed_86;
    private final int cfr_renamed_152 = 32;
    public sprnjl cfr_renamed_112;
    private long cfr_renamed_119;
    private final ByteArrayOutputStream cfr_renamed_91;
    private long cfr_renamed_0;
    private final int cfr_renamed_1;
    private long cfr_renamed_2;
    private final String cfr_renamed_3;
    private long cfr_renamed_4;

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    private /* synthetic */ void cfr_renamed_10436(long arg0) {
        sprnll sprnll2 = this;
        long l = sprnll2.cfr_renamed_4 ^ this.cfr_renamed_119 ^ this.cfr_renamed_2 ^ this.cfr_renamed_86 ^ arg0 ^ this.cfr_renamed_119 & (this.cfr_renamed_4 ^ this.cfr_renamed_2 ^ this.cfr_renamed_0 ^ arg0);
        sprnll sprnll3 = this;
        long l2 = sprnll2.cfr_renamed_4 ^ sprnll3.cfr_renamed_2 ^ this.cfr_renamed_86 ^ this.cfr_renamed_0 ^ arg0 ^ (this.cfr_renamed_119 ^ this.cfr_renamed_2 ^ arg0) & (this.cfr_renamed_119 ^ this.cfr_renamed_86);
        long l3 = sprnll3.cfr_renamed_119 ^ this.cfr_renamed_2 ^ this.cfr_renamed_0 ^ arg0 ^ this.cfr_renamed_86 & this.cfr_renamed_0;
        long l4 = sprnll2.cfr_renamed_4 ^ this.cfr_renamed_119 ^ this.cfr_renamed_2 ^ arg0 ^ (this.cfr_renamed_4 ^ 0xFFFFFFFFFFFFFFFFL) & (this.cfr_renamed_86 ^ this.cfr_renamed_0);
        long l5 = sprnll2.cfr_renamed_119 ^ this.cfr_renamed_86 ^ this.cfr_renamed_0 ^ (this.cfr_renamed_4 ^ this.cfr_renamed_0) & this.cfr_renamed_119;
        long l6 = l;
        sprnll2.cfr_renamed_4 = l6 ^ this.cfr_renamed_10563(l6, 19) ^ this.cfr_renamed_10563(l, 28);
        long l7 = l2;
        sprnll2.cfr_renamed_119 = l7 ^ this.cfr_renamed_10563(l7, 39) ^ this.cfr_renamed_10563(l2, 61);
        long l8 = l3;
        sprnll2.cfr_renamed_2 = l8 ^ this.cfr_renamed_10563(l8, 1) ^ this.cfr_renamed_10563(l3, 6) ^ 0xFFFFFFFFFFFFFFFFL;
        long l9 = l4;
        sprnll2.cfr_renamed_86 = l9 ^ this.cfr_renamed_10563(l9, 10) ^ this.cfr_renamed_10563(l4, 17);
        long l10 = l5;
        sprnll2.cfr_renamed_0 = l10 ^ this.cfr_renamed_10563(l10, 7) ^ this.cfr_renamed_10563(l5, 41);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (32 + arg1 > arg0.length) {
            throw new sprwjl(sprhrc.cfr_renamed_9("c x%y!,7y3j0~ue&,!c:,&d:~!"));
        }
        sprnll sprnll2 = this;
        byte[] byArray = sprnll2.cfr_renamed_91.toByteArray();
        int n = sprnll2.cfr_renamed_91.size();
        int n2 = 0;
        int n3 = 8;
        int n4 = n;
        while (n4 >= n3) {
            sprnll sprnll3 = this;
            sprnll3.cfr_renamed_4 ^= this.cfr_renamed_10564(byArray, n2, 8);
            sprnll3.cfr_renamed_10435(sprnll3.cfr_renamed_1);
            n2 += n3;
            n4 = n - n3;
        }
        sprnll sprnll4 = this;
        sprnll4.cfr_renamed_4 ^= this.cfr_renamed_10564(byArray, n2, n);
        sprnll4.cfr_renamed_4 ^= this.cfr_renamed_10437(n);
        this.cfr_renamed_10435(12);
        int n5 = n = 32;
        while (n5 > n3) {
            sprnll sprnll5 = this;
            sprnll sprnll6 = this;
            sprnll6.cfr_renamed_10565(arg0, arg1, sprnll6.cfr_renamed_4, 8);
            sprnll5.cfr_renamed_10435(sprnll5.cfr_renamed_1);
            arg1 += n3;
            n5 = n - n3;
        }
        sprnll sprnll7 = this;
        sprnll7.cfr_renamed_10565(arg0, arg1, sprnll7.cfr_renamed_4, n);
        this.cfr_renamed_41();
        return 32;
    }

    private /* synthetic */ void cfr_renamed_10565(byte[] arg0, int arg1, long arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg3) {
            int n3 = n + arg1;
            byte by = (byte)(arg2 >>> (7 - n << 3));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ long cfr_renamed_10437(int arg0) {
        return 128L << 56 - (arg0 << 3);
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        return this.cfr_renamed_6410(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(spresy.cfr_renamed_9("QOHTL\u0001ZT^G]S\u0018UWN\u0018RPNJU"));
        }
        this.cfr_renamed_91.write(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_91.write(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_91.reset();
        switch (sprgjl.cfr_renamed_4[this.cfr_renamed_112.ordinal()]) {
            case 1: {
                sprnll sprnll2 = this;
                sprnll sprnll3 = this;
                sprnll3.cfr_renamed_4 = -5368810569253202922L;
                sprnll3.cfr_renamed_119 = 3121280575360345120L;
                sprnll2.cfr_renamed_2 = 7395939140700676632L;
                sprnll2.cfr_renamed_86 = 6533890155656471820L;
                this.cfr_renamed_0 = 5710016986865767350L;
                return;
            }
            case 2: {
                sprnll sprnll4 = this;
                sprnll sprnll5 = this;
                sprnll5.cfr_renamed_4 = 4940560291654768690L;
                sprnll5.cfr_renamed_119 = -3635129828240960206L;
                sprnll4.cfr_renamed_2 = -597534922722107095L;
                sprnll4.cfr_renamed_86 = 2623493988082852443L;
                this.cfr_renamed_0 = -6283826724160825537L;
                return;
            }
        }
    }

    private /* synthetic */ void cfr_renamed_10435(int arg0) {
        if (arg0 == 12) {
            sprnll sprnll2 = this;
            sprnll sprnll3 = this;
            sprnll3.cfr_renamed_10436(240L);
            sprnll3.cfr_renamed_10436(225L);
            sprnll2.cfr_renamed_10436(210L);
            sprnll2.cfr_renamed_10436(195L);
        }
        if (arg0 >= 8) {
            sprnll sprnll4 = this;
            sprnll4.cfr_renamed_10436(180L);
            sprnll4.cfr_renamed_10436(165L);
        }
        sprnll sprnll5 = this;
        sprnll sprnll6 = this;
        this.cfr_renamed_10436(150L);
        sprnll6.cfr_renamed_10436(135L);
        sprnll6.cfr_renamed_10436(120L);
        sprnll5.cfr_renamed_10436(105L);
        sprnll5.cfr_renamed_10436(90L);
        this.cfr_renamed_10436(75L);
    }

    private /* synthetic */ long cfr_renamed_10564(byte[] arg0, int arg1, int arg2) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg2) {
            long l2 = (long)arg0[n + arg1] & 0xFFL;
            int n3 = 7 - n << 3;
            l |= l2 << n3;
            n2 = ++n;
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    public sprnll(sprnjl sprnjl2) {
        sprnll sprnll2;
        void arg0;
        sprnll sprnll3 = this;
        sprnll sprnll4 = this;
        sprnll4.cfr_renamed_91 = new ByteArrayOutputStream();
        sprnll3.cfr_renamed_152 = 32;
        sprnll3.cfr_renamed_112 = sprnjl2;
        switch (sprgjl.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                sprnll2 = this;
                while (false) {
                }
                sprnll sprnll5 = this;
                sprnll5.cfr_renamed_1 = 12;
                sprnll5.cfr_renamed_3 = "Ascon-Xof";
                break;
            }
            case 2: {
                sprnll2 = this;
                sprnll sprnll6 = this;
                sprnll6.cfr_renamed_1 = 8;
                sprnll6.cfr_renamed_3 = "Ascon-XofA";
                break;
            }
            default: {
                throw new IllegalArgumentException(sprhrc.cfr_renamed_9("\u001cb#m9e1,%m'm8i!i',&i!x<b2\u007fuj:~uM&o:buD4\u007f="));
            }
        }
        sprnll2.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_3248() {
        return 8;
    }

    private /* synthetic */ long cfr_renamed_10563(long arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << 64 - arg1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        sprnll sprnll2 = this;
        return sprnll2.cfr_renamed_6410(byArray, (int)arg1, sprnll2.cfr_renamed_1218());
    }
}

