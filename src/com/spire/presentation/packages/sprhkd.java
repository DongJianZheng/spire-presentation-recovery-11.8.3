/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.TextHighLightingOptions;
import com.spire.presentation.packages.sprcgd;
import com.spire.presentation.packages.sprcmd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjpl;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprwid;
import com.spire.presentation.packages.sprxdd;

public class sprhkd
extends sprxdd {
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprjpl.cfr_renamed_9("\u0010l=*'-;l%hslsc6j2y:{6-:c#x'-?h=j'er"));
        }
        sprhkd sprhkd2 = this;
        int n = sprhkd2.cfr_renamed_1195();
        int n2 = sprhkd2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprjkd(TextHighLightingOptions.cfr_renamed_9("\b\u0012\u0013\u0017\u0012\u0013G\u0005\u0012\u0001\u0001\u0002\u0015G\u0013\b\bG\u0014\u000f\b\u0015\u0013"));
        }
        int n3 = 0;
        int n4 = ((int)this.cfr_renamed_4).length - this.cfr_renamed_3;
        if (arg2 > n4) {
            sprhkd sprhkd3 = this;
            System.arraycopy(arg0, arg1, sprhkd3.cfr_renamed_4, sprhkd3.cfr_renamed_3, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, arg3, arg4);
            int n5 = n;
            System.arraycopy(this.cfr_renamed_4, n5, this.cfr_renamed_4, 0, n);
            this.cfr_renamed_3 = n5;
            arg1 += n4;
            int n6 = arg2 -= n4;
            while (n6 > n) {
                sprhkd sprhkd4 = this;
                System.arraycopy(arg0, arg1, sprhkd4.cfr_renamed_4, sprhkd4.cfr_renamed_3, n);
                sprhkd sprhkd5 = this;
                n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])sprhkd5.cfr_renamed_4, 0, arg3, arg4 + n3);
                int n7 = n;
                System.arraycopy(sprhkd5.cfr_renamed_4, n7, this.cfr_renamed_4, 0, n7);
                arg1 += n;
                n6 = arg2 -= n;
            }
        }
        sprhkd sprhkd6 = this;
        System.arraycopy(arg0, arg1, sprhkd6.cfr_renamed_4, sprhkd6.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
        return n3;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        sprhkd sprhkd2 = this;
        if (sprhkd2.cfr_renamed_3 == ((int)sprhkd2.cfr_renamed_4).length) {
            sprhkd sprhkd3 = this;
            sprhkd sprhkd4 = this;
            n = sprhkd3.cfr_renamed_2.cfr_renamed_3064((byte[])sprhkd4.cfr_renamed_4, 0, arg1, arg2);
            sprhkd sprhkd5 = this;
            System.arraycopy(sprhkd3.cfr_renamed_4, sprhkd5.cfr_renamed_4, sprhkd5.cfr_renamed_4, 0, this.cfr_renamed_4);
            sprhkd3.cfr_renamed_3 = sprhkd4.cfr_renamed_4;
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = n % ((int)this.cfr_renamed_4).length;
        if (n2 == 0) {
            return n - ((int)this.cfr_renamed_4).length;
        }
        return n - n2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhkd(sprff sprff2) {
        void arg0;
        if (sprff2 instanceof sprwid || arg0 instanceof sprcgd || arg0 instanceof sprcmd) {
            throw new IllegalArgumentException(sprjpl.cfr_renamed_9("N\u0007^\u0011a<n8N:};h!-0l=-<c?tsl0n6}'-\u0016N\u0011!sb!-\u0010O\u0010-0d#e6\u007f "));
        }
        sprhkd sprhkd2 = this;
        this.cfr_renamed_2 = arg0;
        sprhkd2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sprhkd2.cfr_renamed_4 = (int)new byte[this.cfr_renamed_4 * 2];
        this.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException, sprpjd {
        sprhkd sprhkd2;
        if (this.cfr_renamed_3 + arg1 > arg0.length) {
            throw new sprjkd(TextHighLightingOptions.cfr_renamed_9("\b\u0012\u0013\u0017\u0012\u0013G\u0005\u0012\u0001\u0001\u0002\u0015G\u0013\bG\u0014\n\u0006\u000b\u000bG\u000e\tG\u0003\b!\u000e\t\u0006\u000b"));
        }
        sprhkd sprhkd3 = this;
        int n = sprhkd3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = sprhkd3.cfr_renamed_3 - n;
        byte[] byArray = new byte[n];
        if (sprhkd3.cfr_renamed_91) {
            if (this.cfr_renamed_3 < n) {
                throw new sprjkd(sprjpl.cfr_renamed_9("c6h7-2ysa6l ysb=hso?b0fsb5-:c#x'-5b!-\u0010Y\u0000"));
            }
            sprhkd sprhkd4 = this;
            sprhkd4.cfr_renamed_2.cfr_renamed_3064((byte[])sprhkd4.cfr_renamed_4, 0, byArray, 0);
            if (sprhkd4.cfr_renamed_3 > n) {
                byte[] byArray2;
                int n3;
                int n4 = n3 = this.cfr_renamed_3;
                while (n4 != ((int)this.cfr_renamed_4).length) {
                    int n5 = n3++;
                    this.cfr_renamed_4[n5] = byArray[n5 - n];
                    n4 = n3;
                }
                int n6 = n3 = n;
                while (n6 != this.cfr_renamed_3) {
                    int n7 = this.cfr_renamed_4;
                    int n8 = n3;
                    byte by = (byte)(n7[n8] ^ byArray[n3 - n]);
                    n7[n8] = by;
                    n6 = ++n3;
                }
                sprhkd sprhkd5 = this;
                if (this.cfr_renamed_2 instanceof sprgnd) {
                    sprff sprff2 = ((sprgnd)sprhkd5.cfr_renamed_2).cfr_renamed_2349();
                    byArray2 = byArray;
                    sprff2.cfr_renamed_3064((byte[])this.cfr_renamed_4, n, arg0, arg1);
                } else {
                    sprhkd5.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, n, arg0, arg1);
                    byArray2 = byArray;
                }
                System.arraycopy(byArray2, 0, arg0, arg1 + n, n2);
                sprhkd2 = this;
            } else {
                System.arraycopy(byArray, 0, arg0, arg1, n);
                sprhkd2 = this;
            }
        } else {
            if (this.cfr_renamed_3 < n) {
                throw new sprjkd(TextHighLightingOptions.cfr_renamed_9("\t\u0002\u0002\u0003G\u0006\u0013G\u000b\u0002\u0006\u0014\u0013G\b\t\u0002G\u0005\u000b\b\u0004\fG\b\u0001G\u000e\t\u0017\u0012\u0013G\u0001\b\u0015G$34"));
            }
            byte[] byArray3 = new byte[n];
            if (this.cfr_renamed_3 > n) {
                int n9;
                int n10;
                sprhkd sprhkd6 = this;
                if (this.cfr_renamed_2 instanceof sprgnd) {
                    sprff sprff3 = ((sprgnd)sprhkd6.cfr_renamed_2).cfr_renamed_2349();
                    n10 = n;
                    sprff3.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, byArray, 0);
                } else {
                    sprhkd6.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, byArray, 0);
                    n10 = n;
                }
                int n11 = n9 = n10;
                while (n11 != this.cfr_renamed_3) {
                    int n12 = n9 - n;
                    byte by = (byte)(byArray[n9 - n] ^ this.cfr_renamed_4[n9]);
                    byArray3[n12] = by;
                    n11 = ++n9;
                }
                sprhkd sprhkd7 = this;
                sprhkd2 = sprhkd7;
                System.arraycopy(sprhkd7.cfr_renamed_4, n, byArray, 0, n2);
                sprhkd7.cfr_renamed_2.cfr_renamed_3064(byArray, 0, arg0, arg1);
                System.arraycopy(byArray3, 0, arg0, arg1 + n, n2);
            } else {
                sprhkd sprhkd8 = this;
                sprhkd2 = sprhkd8;
                sprhkd8.cfr_renamed_2.cfr_renamed_3064((byte[])sprhkd8.cfr_renamed_4, 0, byArray, 0);
                System.arraycopy(byArray, 0, arg0, arg1, n);
            }
        }
        int n13 = sprhkd2.cfr_renamed_3;
        this.cfr_renamed_41();
        return n13;
    }
}

