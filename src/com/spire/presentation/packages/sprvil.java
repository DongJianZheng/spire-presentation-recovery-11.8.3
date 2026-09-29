/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgl;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprrel;
import com.spire.presentation.packages.spruip;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprwjl;
import java.io.ByteArrayOutputStream;

public class sprvil
implements sprpl {
    public sprcgl cfr_renamed_86;
    private final ByteArrayOutputStream cfr_renamed_152;
    private long cfr_renamed_112;
    private long cfr_renamed_119;
    private final int cfr_renamed_91 = 32;
    private long cfr_renamed_0;
    private long cfr_renamed_1;
    private final int cfr_renamed_2;
    private long cfr_renamed_3;
    private final String cfr_renamed_4;

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_152.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10435(int arg0) {
        if (arg0 == 12) {
            sprvil sprvil2 = this;
            sprvil sprvil3 = this;
            sprvil3.cfr_renamed_10436(240L);
            sprvil3.cfr_renamed_10436(225L);
            sprvil2.cfr_renamed_10436(210L);
            sprvil2.cfr_renamed_10436(195L);
        }
        if (arg0 >= 8) {
            sprvil sprvil4 = this;
            sprvil4.cfr_renamed_10436(180L);
            sprvil4.cfr_renamed_10436(165L);
        }
        sprvil sprvil5 = this;
        sprvil sprvil6 = this;
        this.cfr_renamed_10436(150L);
        sprvil6.cfr_renamed_10436(135L);
        sprvil6.cfr_renamed_10436(120L);
        sprvil5.cfr_renamed_10436(105L);
        sprvil5.cfr_renamed_10436(90L);
        this.cfr_renamed_10436(75L);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_152.reset();
        switch (sprrel.cfr_renamed_4[this.cfr_renamed_86.ordinal()]) {
            case 2: {
                sprvil sprvil2 = this;
                sprvil sprvil3 = this;
                sprvil3.cfr_renamed_0 = 92044056785660070L;
                sprvil3.cfr_renamed_1 = 8326807761760157607L;
                sprvil2.cfr_renamed_3 = 3371194088139667532L;
                sprvil2.cfr_renamed_112 = -2956994353054992515L;
                this.cfr_renamed_119 = -6828509670848688761L;
                return;
            }
            case 1: {
                sprvil sprvil4 = this;
                sprvil sprvil5 = this;
                sprvil5.cfr_renamed_0 = -1255492011513352131L;
                sprvil5.cfr_renamed_1 = -8380609354527731710L;
                sprvil4.cfr_renamed_3 = -5437372128236807582L;
                sprvil4.cfr_renamed_112 = 4834782570098516968L;
                this.cfr_renamed_119 = 3787428097924915520L;
                return;
            }
        }
    }

    private /* synthetic */ long cfr_renamed_10437(int arg0) {
        return 128L << 56 - (arg0 << 3);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(spruua.cfr_renamed_9(" }9f=3+f/u,aig&|i`!|;g"));
        }
        this.cfr_renamed_152.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_3248() {
        return 8;
    }

    /*
     * WARNING - void declaration
     */
    public sprvil(sprcgl sprcgl2) {
        sprvil sprvil2;
        void arg0;
        sprvil sprvil3 = this;
        sprvil sprvil4 = this;
        sprvil4.cfr_renamed_152 = new ByteArrayOutputStream();
        sprvil3.cfr_renamed_91 = 32;
        sprvil3.cfr_renamed_86 = sprcgl2;
        switch (sprrel.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                sprvil2 = this;
                while (false) {
                }
                sprvil sprvil5 = this;
                sprvil5.cfr_renamed_2 = 12;
                sprvil5.cfr_renamed_4 = "Ascon-Hash";
                break;
            }
            case 2: {
                sprvil2 = this;
                sprvil sprvil6 = this;
                sprvil6.cfr_renamed_2 = 8;
                sprvil6.cfr_renamed_4 = "Ascon-HashA";
                break;
            }
            default: {
                throw new IllegalArgumentException(spruip.cfr_renamed_9("LPs_iWa\u001eu_w_h[q[w\u001ev[qJlPbM%XjL%\u007fv]jP%vdMm"));
            }
        }
        sprvil2.cfr_renamed_41();
    }

    private /* synthetic */ long cfr_renamed_10563(long arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << 64 - arg1;
    }

    private /* synthetic */ void cfr_renamed_10436(long arg0) {
        sprvil sprvil2 = this;
        long l = sprvil2.cfr_renamed_0 ^ this.cfr_renamed_1 ^ this.cfr_renamed_3 ^ this.cfr_renamed_112 ^ arg0 ^ this.cfr_renamed_1 & (this.cfr_renamed_0 ^ this.cfr_renamed_3 ^ this.cfr_renamed_119 ^ arg0);
        sprvil sprvil3 = this;
        long l2 = sprvil2.cfr_renamed_0 ^ sprvil3.cfr_renamed_3 ^ this.cfr_renamed_112 ^ this.cfr_renamed_119 ^ arg0 ^ (this.cfr_renamed_1 ^ this.cfr_renamed_3 ^ arg0) & (this.cfr_renamed_1 ^ this.cfr_renamed_112);
        long l3 = sprvil3.cfr_renamed_1 ^ this.cfr_renamed_3 ^ this.cfr_renamed_119 ^ arg0 ^ this.cfr_renamed_112 & this.cfr_renamed_119;
        long l4 = sprvil2.cfr_renamed_0 ^ this.cfr_renamed_1 ^ this.cfr_renamed_3 ^ arg0 ^ (this.cfr_renamed_0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.cfr_renamed_112 ^ this.cfr_renamed_119);
        long l5 = sprvil2.cfr_renamed_1 ^ this.cfr_renamed_112 ^ this.cfr_renamed_119 ^ (this.cfr_renamed_0 ^ this.cfr_renamed_119) & this.cfr_renamed_1;
        long l6 = l;
        sprvil2.cfr_renamed_0 = l6 ^ this.cfr_renamed_10563(l6, 19) ^ this.cfr_renamed_10563(l, 28);
        long l7 = l2;
        sprvil2.cfr_renamed_1 = l7 ^ this.cfr_renamed_10563(l7, 39) ^ this.cfr_renamed_10563(l2, 61);
        long l8 = l3;
        sprvil2.cfr_renamed_3 = l8 ^ this.cfr_renamed_10563(l8, 1) ^ this.cfr_renamed_10563(l3, 6) ^ 0xFFFFFFFFFFFFFFFFL;
        long l9 = l4;
        sprvil2.cfr_renamed_112 = l9 ^ this.cfr_renamed_10563(l9, 10) ^ this.cfr_renamed_10563(l4, 17);
        long l10 = l5;
        sprvil2.cfr_renamed_119 = l10 ^ this.cfr_renamed_10563(l10, 7) ^ this.cfr_renamed_10563(l5, 41);
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

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (32 + arg1 > arg0.length) {
            throw new sprwjl(spruua.cfr_renamed_9("&f=c<giq<u/v;3 `ig&|i`!|;g"));
        }
        sprvil sprvil2 = this;
        byte[] byArray = sprvil2.cfr_renamed_152.toByteArray();
        int n = sprvil2.cfr_renamed_152.size();
        int n2 = 0;
        int n3 = 8;
        int n4 = n;
        while (n4 >= n3) {
            sprvil sprvil3 = this;
            sprvil3.cfr_renamed_0 ^= this.cfr_renamed_10564(byArray, n2, 8);
            sprvil3.cfr_renamed_10435(sprvil3.cfr_renamed_2);
            n2 += n3;
            n4 = n - n3;
        }
        sprvil sprvil4 = this;
        sprvil4.cfr_renamed_0 ^= this.cfr_renamed_10564(byArray, n2, n);
        sprvil4.cfr_renamed_0 ^= this.cfr_renamed_10437(n);
        this.cfr_renamed_10435(12);
        int n5 = n = 32;
        while (n5 > n3) {
            sprvil sprvil5 = this;
            sprvil sprvil6 = this;
            sprvil6.cfr_renamed_10565(arg0, arg1, sprvil6.cfr_renamed_0, 8);
            sprvil5.cfr_renamed_10435(sprvil5.cfr_renamed_2);
            arg1 += n3;
            n5 = n - n3;
        }
        sprvil sprvil7 = this;
        sprvil7.cfr_renamed_10565(arg0, arg1, sprvil7.cfr_renamed_0, n);
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

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }
}

