/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlhz;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruqb;

public class spreyk
implements spraq {
    private byte[] cfr_renamed_93;
    private byte cfr_renamed_86;
    private byte cfr_renamed_152;
    private byte cfr_renamed_112;
    private byte cfr_renamed_119;
    private byte cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte cfr_renamed_3;
    private byte cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        int n;
        spreyk spreyk2 = this;
        spreyk2.cfr_renamed_4 = 0;
        spreyk2.cfr_renamed_2 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_2[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            void arg0;
            spreyk spreyk3 = this;
            void v5 = arg0;
            this.cfr_renamed_4 = spreyk3.cfr_renamed_2[spreyk3.cfr_renamed_4 + this.cfr_renamed_2[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            spreyk spreyk4 = this;
            by = spreyk4.cfr_renamed_2[n & 0xFF];
            spreyk spreyk5 = this;
            spreyk4.cfr_renamed_2[n & 0xFF] = spreyk5.cfr_renamed_2[this.cfr_renamed_4 & 0xFF];
            spreyk5.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            spreyk spreyk6 = this;
            void v10 = arg1;
            this.cfr_renamed_4 = spreyk6.cfr_renamed_2[spreyk6.cfr_renamed_4 + this.cfr_renamed_2[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            spreyk spreyk7 = this;
            by = spreyk7.cfr_renamed_2[n & 0xFF];
            spreyk spreyk8 = this;
            spreyk7.cfr_renamed_2[n & 0xFF] = spreyk8.cfr_renamed_2[this.cfr_renamed_4 & 0xFF];
            spreyk8.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = by;
            n5 = ++n;
        }
        this.cfr_renamed_3 = 0;
    }

    public spreyk() {
        spreyk spreyk2 = this;
        this.cfr_renamed_3 = 0;
        spreyk2.cfr_renamed_2 = null;
        spreyk2.cfr_renamed_4 = 0;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("k\u0016m\u0018\u0010\u0016|\u0018\u001d\u0012S2I{M:O:P>I>O(\u001d6H(I{T5^7H?X{\\5\u001d\u0012k"));
        }
        sprkpk sprkpk2 = (sprkpk)arg0;
        sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(spruqb.cfr_renamed_9("\u001fC\u0019MdC\bMiG'g=.9o;o$k=k;}ic<}=. `*b<j,.(.\"k0"));
        }
        this.cfr_renamed_1 = sprkpk2.cfr_renamed_1205();
        if (this.cfr_renamed_1 == null || this.cfr_renamed_1.length < 1 || this.cfr_renamed_1.length > 768) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("\rp\u000b~vp\u001a~{O>L.T)X(\u001dj\u001d/R{\nm\u0005{_\"I>N{R=\u001d\u0012k"));
        }
        this.cfr_renamed_93 = sprtpk2.cfr_renamed_1521();
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(spruqb.cfr_renamed_9("g'~<zil<h/k;.=a&.:f&|="));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg1 + n;
            this.cfr_renamed_1221(arg0[n3]);
            n2 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprlhz.cfr_renamed_9("\rp\u000b~vp\u001a~");
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        spreyk spreyk2 = this;
        spreyk spreyk3 = this;
        spreyk spreyk4 = this;
        spreyk3.cfr_renamed_4 = spreyk3.cfr_renamed_2[spreyk4.cfr_renamed_4 + spreyk4.cfr_renamed_2[this.cfr_renamed_3 & 0xFF] & 0xFF];
        spreyk spreyk5 = this;
        spreyk spreyk6 = this;
        byte by = (byte)(arg0 ^ spreyk5.cfr_renamed_2[spreyk5.cfr_renamed_2[spreyk6.cfr_renamed_2[spreyk6.cfr_renamed_4 & 0xFF] & 0xFF] + 1 & 0xFF]);
        spreyk spreyk7 = this;
        spreyk2.cfr_renamed_119 = spreyk3.cfr_renamed_2[spreyk7.cfr_renamed_119 + this.cfr_renamed_152 & 0xFF];
        spreyk spreyk8 = this;
        spreyk2.cfr_renamed_152 = spreyk7.cfr_renamed_2[spreyk8.cfr_renamed_152 + spreyk8.cfr_renamed_112 & 0xFF];
        spreyk spreyk9 = this;
        spreyk2.cfr_renamed_112 = spreyk2.cfr_renamed_2[spreyk9.cfr_renamed_112 + spreyk9.cfr_renamed_86 & 0xFF];
        spreyk spreyk10 = this;
        spreyk2.cfr_renamed_86 = spreyk2.cfr_renamed_2[spreyk10.cfr_renamed_86 + spreyk10.cfr_renamed_4 + by & 0xFF];
        spreyk spreyk11 = this;
        spreyk2.cfr_renamed_0[this.cfr_renamed_91 & 0x1F] = (byte)(spreyk11.cfr_renamed_0[spreyk11.cfr_renamed_91 & 0x1F] ^ this.cfr_renamed_86);
        spreyk spreyk12 = this;
        spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 1 & 0x1F] = (byte)(spreyk12.cfr_renamed_0[spreyk12.cfr_renamed_91 + 1 & 0x1F] ^ this.cfr_renamed_112);
        spreyk spreyk13 = this;
        spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 2 & 0x1F] = (byte)(spreyk13.cfr_renamed_0[spreyk13.cfr_renamed_91 + 2 & 0x1F] ^ this.cfr_renamed_152);
        spreyk spreyk14 = this;
        spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 3 & 0x1F] = (byte)(spreyk14.cfr_renamed_0[spreyk14.cfr_renamed_91 + 3 & 0x1F] ^ this.cfr_renamed_119);
        spreyk2.cfr_renamed_91 = (byte)(spreyk2.cfr_renamed_91 + 4 & 0x1F);
        byte by2 = spreyk2.cfr_renamed_2[this.cfr_renamed_3 & 0xFF];
        spreyk spreyk15 = this;
        spreyk2.cfr_renamed_2[this.cfr_renamed_3 & 0xFF] = spreyk15.cfr_renamed_2[spreyk15.cfr_renamed_4 & 0xFF];
        spreyk2.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = by2;
        spreyk2.cfr_renamed_3 = (byte)(spreyk2.cfr_renamed_3 + 1 & 0xFF);
    }

    @Override
    public int cfr_renamed_2404() {
        return 20;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        int n;
        int n2;
        int n3 = n2 = 1;
        while (n3 < 25) {
            spreyk spreyk2 = this;
            spreyk spreyk3 = this;
            spreyk spreyk4 = this;
            spreyk2.cfr_renamed_4 = spreyk2.cfr_renamed_2[spreyk3.cfr_renamed_4 + spreyk4.cfr_renamed_2[spreyk4.cfr_renamed_3 & 0xFF] & 0xFF];
            spreyk spreyk5 = this;
            spreyk2.cfr_renamed_119 = spreyk3.cfr_renamed_2[spreyk5.cfr_renamed_119 + spreyk5.cfr_renamed_152 + n2 & 0xFF];
            spreyk spreyk6 = this;
            spreyk2.cfr_renamed_152 = spreyk2.cfr_renamed_2[spreyk6.cfr_renamed_152 + spreyk6.cfr_renamed_112 + n2 & 0xFF];
            spreyk spreyk7 = this;
            spreyk2.cfr_renamed_112 = spreyk2.cfr_renamed_2[spreyk7.cfr_renamed_112 + spreyk7.cfr_renamed_86 + n2 & 0xFF];
            spreyk spreyk8 = this;
            spreyk2.cfr_renamed_86 = spreyk2.cfr_renamed_2[spreyk8.cfr_renamed_86 + spreyk8.cfr_renamed_4 + n2 & 0xFF];
            spreyk spreyk9 = this;
            spreyk2.cfr_renamed_0[this.cfr_renamed_91 & 0x1F] = (byte)(spreyk9.cfr_renamed_0[spreyk9.cfr_renamed_91 & 0x1F] ^ this.cfr_renamed_86);
            spreyk spreyk10 = this;
            spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 1 & 0x1F] = (byte)(spreyk10.cfr_renamed_0[spreyk10.cfr_renamed_91 + 1 & 0x1F] ^ this.cfr_renamed_112);
            spreyk spreyk11 = this;
            spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 2 & 0x1F] = (byte)(spreyk11.cfr_renamed_0[spreyk11.cfr_renamed_91 + 2 & 0x1F] ^ this.cfr_renamed_152);
            spreyk spreyk12 = this;
            spreyk2.cfr_renamed_0[this.cfr_renamed_91 + 3 & 0x1F] = (byte)(spreyk12.cfr_renamed_0[spreyk12.cfr_renamed_91 + 3 & 0x1F] ^ this.cfr_renamed_119);
            spreyk2.cfr_renamed_91 = (byte)(spreyk2.cfr_renamed_91 + 4 & 0x1F);
            n = spreyk2.cfr_renamed_2[this.cfr_renamed_3 & 0xFF];
            spreyk spreyk13 = this;
            spreyk2.cfr_renamed_2[this.cfr_renamed_3 & 0xFF] = spreyk13.cfr_renamed_2[spreyk13.cfr_renamed_4 & 0xFF];
            spreyk2.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = n;
            spreyk2.cfr_renamed_3 = (byte)(spreyk2.cfr_renamed_3 + 1 & 0xFF);
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 < 768) {
            spreyk spreyk14 = this;
            spreyk spreyk15 = this;
            spreyk14.cfr_renamed_4 = spreyk14.cfr_renamed_2[spreyk15.cfr_renamed_4 + this.cfr_renamed_2[n2 & 0xFF] + this.cfr_renamed_0[n2 & 0x1F] & 0xFF];
            n = spreyk15.cfr_renamed_2[n2 & 0xFF];
            spreyk spreyk16 = this;
            spreyk14.cfr_renamed_2[n2 & 0xFF] = spreyk16.cfr_renamed_2[spreyk16.cfr_renamed_4 & 0xFF];
            spreyk14.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = n;
            n4 = ++n2;
        }
        byte[] byArray = new byte[20];
        int n5 = n = 0;
        while (n5 < 20) {
            spreyk spreyk17 = this;
            spreyk spreyk18 = this;
            spreyk17.cfr_renamed_4 = spreyk18.cfr_renamed_2[spreyk18.cfr_renamed_4 + this.cfr_renamed_2[n & 0xFF] & 0xFF];
            spreyk spreyk19 = this;
            spreyk spreyk20 = this;
            byArray[n] = spreyk19.cfr_renamed_2[spreyk19.cfr_renamed_2[spreyk20.cfr_renamed_2[spreyk20.cfr_renamed_4 & 0xFF] & 0xFF] + 1 & 0xFF];
            byte by = spreyk17.cfr_renamed_2[n & 0xFF];
            spreyk spreyk21 = this;
            spreyk17.cfr_renamed_2[n & 0xFF] = spreyk21.cfr_renamed_2[this.cfr_renamed_4 & 0xFF];
            spreyk21.cfr_renamed_2[this.cfr_renamed_4 & 0xFF] = by;
            n5 = ++n;
        }
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        this.cfr_renamed_41();
        return byArray.length;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        spreyk spreyk2 = this;
        spreyk spreyk3 = this;
        this.cfr_renamed_3464(spreyk3.cfr_renamed_93, spreyk3.cfr_renamed_1);
        spreyk2.cfr_renamed_3 = 0;
        this.cfr_renamed_119 = 0;
        spreyk2.cfr_renamed_152 = 0;
        spreyk2.cfr_renamed_112 = 0;
        spreyk2.cfr_renamed_86 = 0;
        spreyk2.cfr_renamed_91 = 0;
        this.cfr_renamed_0 = new byte[32];
        int n2 = n = 0;
        while (n2 < 32) {
            this.cfr_renamed_0[n++] = 0;
            n2 = n;
        }
    }
}

