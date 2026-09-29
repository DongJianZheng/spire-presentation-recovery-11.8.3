/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprppx;
import com.spire.presentation.packages.sprwid;
import com.spire.presentation.packages.sprxdd;

public class sprckd
extends sprxdd {
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprckd(sprff sprff2) {
        void arg0;
        if (sprff2 instanceof sprwid || arg0 instanceof sprcgd) {
            throw new IllegalArgumentException(sprppx.cfr_renamed_9("e'u1J\u001cE\u0018e\u001aV\u001bC\u0001\u0006\u0010G\u001d\u0006\u001cH\u001f_SG\u0010E\u0016V\u0007\u00066e1\nSI\u0001\u00060d0\u0006\u0010O\u0003N\u0016T\u0000"));
        }
        sprckd sprckd2 = this;
        this.cfr_renamed_2 = arg0;
        sprckd2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sprckd2.cfr_renamed_4 = (int)new byte[this.cfr_renamed_4 * 2];
        this.cfr_renamed_3 = 0;
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

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        sprckd sprckd2 = this;
        if (sprckd2.cfr_renamed_3 == ((int)sprckd2.cfr_renamed_4).length) {
            sprckd sprckd3 = this;
            sprckd sprckd4 = this;
            n = sprckd3.cfr_renamed_2.cfr_renamed_3064((byte[])sprckd4.cfr_renamed_4, 0, arg1, arg2);
            sprckd sprckd5 = this;
            System.arraycopy(sprckd3.cfr_renamed_4, sprckd5.cfr_renamed_4, sprckd5.cfr_renamed_4, 0, this.cfr_renamed_4);
            sprckd3.cfr_renamed_3 = sprckd4.cfr_renamed_4;
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException, sprpjd {
        sprckd sprckd2;
        if (this.cfr_renamed_3 + arg1 > arg0.length) {
            throw new sprjkd(sprjzo.cfr_renamed_9("V\u001eM\u001bL\u001f\u0019\tL\r_\u000eKKM\u0004\u0019\u0018T\nU\u0007\u0019\u0002WK]\u0004\u007f\u0002W\nU"));
        }
        sprckd sprckd3 = this;
        int n = sprckd3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = sprckd3.cfr_renamed_3 - n;
        byte[] byArray = new byte[n];
        if (sprckd3.cfr_renamed_91) {
            byte[] byArray2;
            int n3;
            sprckd sprckd4 = this;
            this.cfr_renamed_2.cfr_renamed_3064((byte[])sprckd4.cfr_renamed_4, 0, byArray, 0);
            if (sprckd4.cfr_renamed_3 < n) {
                throw new sprjkd(sprppx.cfr_renamed_9("H\u0016C\u0017\u0006\u0012RSJ\u0016G\u0000RSI\u001dCSD\u001fI\u0010MSI\u0015\u0006\u001aH\u0003S\u0007\u0006\u0015I\u0001\u00060r "));
            }
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
            sprckd sprckd5 = this;
            if (this.cfr_renamed_2 instanceof sprgnd) {
                sprff sprff2 = ((sprgnd)sprckd5.cfr_renamed_2).cfr_renamed_2349();
                byArray2 = byArray;
                sprff2.cfr_renamed_3064((byte[])this.cfr_renamed_4, n, arg0, arg1);
            } else {
                sprckd5.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, n, arg0, arg1);
                byArray2 = byArray;
            }
            System.arraycopy(byArray2, 0, arg0, arg1 + n, n2);
            sprckd2 = this;
        } else {
            int n9;
            int n10;
            byte[] byArray3 = new byte[n];
            sprckd sprckd6 = this;
            if (this.cfr_renamed_2 instanceof sprgnd) {
                sprff sprff3 = ((sprgnd)sprckd6.cfr_renamed_2).cfr_renamed_2349();
                n10 = n;
                sprff3.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, byArray, 0);
            } else {
                sprckd6.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, byArray, 0);
                n10 = n;
            }
            int n11 = n9 = n10;
            while (n11 != this.cfr_renamed_3) {
                int n12 = n9 - n;
                byte by = (byte)(byArray[n9 - n] ^ this.cfr_renamed_4[n9]);
                byArray3[n12] = by;
                n11 = ++n9;
            }
            sprckd sprckd7 = this;
            sprckd2 = sprckd7;
            System.arraycopy(sprckd7.cfr_renamed_4, n, byArray, 0, n2);
            sprckd7.cfr_renamed_2.cfr_renamed_3064(byArray, 0, arg0, arg1);
            System.arraycopy(byArray3, 0, arg0, arg1 + n, n2);
        }
        int n13 = sprckd2.cfr_renamed_3;
        this.cfr_renamed_41();
        return n13;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprjzo.cfr_renamed_9("z\nWLMKQ\nO\u000e\u0019\n\u0019\u0005\\\fX\u001fP\u001d\\KP\u0005I\u001eMKU\u000eW\fM\u0003\u0018"));
        }
        sprckd sprckd2 = this;
        int n = sprckd2.cfr_renamed_1195();
        int n2 = sprckd2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprjkd(sprppx.cfr_renamed_9("\u001cS\u0007V\u0006RSD\u0006@\u0015C\u0001\u0006\u0007I\u001c\u0006\u0000N\u001cT\u0007"));
        }
        int n3 = 0;
        int n4 = ((int)this.cfr_renamed_4).length - this.cfr_renamed_3;
        if (arg2 > n4) {
            sprckd sprckd3 = this;
            System.arraycopy(arg0, arg1, sprckd3.cfr_renamed_4, sprckd3.cfr_renamed_3, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, arg3, arg4);
            int n5 = n;
            System.arraycopy(this.cfr_renamed_4, n5, this.cfr_renamed_4, 0, n);
            this.cfr_renamed_3 = n5;
            arg1 += n4;
            int n6 = arg2 -= n4;
            while (n6 > n) {
                sprckd sprckd4 = this;
                System.arraycopy(arg0, arg1, sprckd4.cfr_renamed_4, sprckd4.cfr_renamed_3, n);
                sprckd sprckd5 = this;
                n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])sprckd5.cfr_renamed_4, 0, arg3, arg4 + n3);
                int n7 = n;
                System.arraycopy(sprckd5.cfr_renamed_4, n7, this.cfr_renamed_4, 0, n7);
                arg1 += n;
                n6 = arg2 -= n;
            }
        }
        sprckd sprckd6 = this;
        System.arraycopy(arg0, arg1, sprckd6.cfr_renamed_4, sprckd6.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
        return n3;
    }
}

