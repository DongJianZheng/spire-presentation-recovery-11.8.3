/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpbg;
import java.security.SecureRandom;

public class sprvvf
extends sprpbg {
    public int cfr_renamed_3;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6601(int n) {
        void arg0;
        sprvvf sprvvf2 = this;
        sprvvf2.cfr_renamed_3 = arg0 & 7;
        sprvvf2.cfr_renamed_4 = n >>> 3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvvf(sprpbg sprpbg2) {
        super((sprpbg)arg0);
        void arg0;
        this.cfr_renamed_3 = 0;
    }

    @Override
    public void cfr_renamed_6602(long arg0) {
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6602(arg0);
            return;
        }
        sprvvf sprvvf2 = this;
        int n = sprvvf2.cfr_renamed_3;
        int n2 = sprvvf2.cfr_renamed_4;
        n[n2] = n[n2] ^ arg0 << (this.cfr_renamed_3 << 3);
        int n3 = sprvvf2.cfr_renamed_3;
        int n4 = this.cfr_renamed_4 + 1;
        n3[n4] = n3[n4] ^ arg0 >>> (8 - this.cfr_renamed_3 << 3);
    }

    @Override
    public long cfr_renamed_1397() {
        if (this.cfr_renamed_3 == 0) {
            sprvvf sprvvf2 = this;
            return (long)sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4];
        }
        sprvvf sprvvf3 = this;
        sprvvf sprvvf4 = this;
        return (long)(sprvvf3.cfr_renamed_3[sprvvf3.cfr_renamed_4] >>> (this.cfr_renamed_3 << 3) | sprvvf4.cfr_renamed_3[sprvvf4.cfr_renamed_4 + 1] << (8 - this.cfr_renamed_3 << 3));
    }

    public void cfr_renamed_6603(int arg0, long arg1, long arg2) {
        int n = arg0 + this.cfr_renamed_3 + (this.cfr_renamed_4 << 3);
        int n2 = n >>> 3;
        sprvvf sprvvf2 = this;
        int n3 = sprvvf2.cfr_renamed_3;
        int n4 = n2;
        n3[n4] = n3[n4] & ((arg1 & 0xFFL) << ((n &= 7) << 3) | 255L << (n << 3) ^ 0xFFFFFFFFFFFFFFFFL);
        int n5 = sprvvf2.cfr_renamed_3;
        int n6 = n2;
        n5[n6] = n5[n6] ^ (arg2 & 0xFFL) << (n << 3);
    }

    public long cfr_renamed_6604(int arg0) {
        if ((arg0 += this.cfr_renamed_4) >= ((int)this.cfr_renamed_3).length) {
            return 0L;
        }
        if (this.cfr_renamed_3 == 0) {
            return (long)this.cfr_renamed_3[arg0];
        }
        if (arg0 == ((int)this.cfr_renamed_3).length - 1) {
            return (long)(this.cfr_renamed_3[arg0] >>> (this.cfr_renamed_3 << 3));
        }
        return (long)(this.cfr_renamed_3[arg0] >>> (this.cfr_renamed_3 << 3) | this.cfr_renamed_3[arg0 + 1] << (8 - this.cfr_renamed_3 << 3));
    }

    @Override
    public void cfr_renamed_6605() {
        sprvvf sprvvf2 = this;
        sprvvf2.cfr_renamed_4 = 0;
        sprvvf2.cfr_renamed_3 = 0;
    }

    public int cfr_renamed_6606(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprvvf sprvvf2 = this;
            arg0[arg1++] = (byte)(sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4] >>> (this.cfr_renamed_3++ << 3));
            if (this.cfr_renamed_3 == 8) {
                this.cfr_renamed_3 = 0;
                ++this.cfr_renamed_4;
            }
            n2 = ++n;
        }
        return arg1;
    }

    public void cfr_renamed_6607(int arg0, SecureRandom arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        arg1.nextBytes(byArray);
        this.cfr_renamed_6608(arg0, byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_6609(int arg0, int arg1) {
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6609(arg0, arg1);
            return;
        }
        sprvvf sprvvf2 = this;
        int n = this.cfr_renamed_3;
        int n2 = sprvvf2.cfr_renamed_4 + arg0;
        n[n2] = n[n2] & -1L >>> (8 - this.cfr_renamed_3 << 3);
        super.cfr_renamed_6609(arg0 + 1, arg1);
        int n3 = this.cfr_renamed_3;
        int n4 = this.cfr_renamed_4 + arg1 + 1;
        n3[n4] = n3[n4] & -1L << (this.cfr_renamed_3 << 3);
    }

    public void cfr_renamed_6610(int arg0) {
        sprvvf sprvvf2 = this;
        int n = sprvvf2.cfr_renamed_3;
        int n2 = sprvvf2.cfr_renamed_4;
        n[n2] = n[n2] ^ ((long)arg0 & 0xFFL) << (this.cfr_renamed_3 << 3);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6611(sprvvf sprvvf2) {
        void arg0;
        sprvvf sprvvf3 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprvvf3.cfr_renamed_4 = v1.cfr_renamed_4;
        sprvvf3.cfr_renamed_3 = sprvvf2.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_6612(sprpbg arg0, int arg1, long arg2) {
        int n;
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6612(arg0, arg1, arg2);
            return;
        }
        int n2 = this.cfr_renamed_4;
        int n3 = arg0.cfr_renamed_4;
        int n4 = this.cfr_renamed_3 << 3;
        int n5 = 8 - this.cfr_renamed_3 << 3;
        int n6 = n = 0;
        while (n6 < arg1) {
            long l = arg0.cfr_renamed_3[n3] & arg2;
            ++n3;
            long l2 = l;
            int n7 = this.cfr_renamed_3;
            int n8 = n2++;
            n7[n8] = n7[n8] ^ l2 << n4;
            int n9 = this.cfr_renamed_3;
            int n10 = n2;
            n9[n10] = n9[n10] ^ l2 >>> n5;
            n6 = ++n;
        }
    }

    public sprvvf(byte[] arg0) {
        super((arg0.length >> 3) + ((arg0.length & 7) != 0 ? 1 : 0));
        int n = 0;
        int n2 = n;
        for (int i = 0; n2 < arg0.length && i < ((int)this.cfr_renamed_3).length; ++i) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8 && n < arg0.length) {
                int n5 = this.cfr_renamed_3;
                int n6 = i;
                void v4 = n5[n6] | ((long)arg0[n] & 0xFFL) << (n3 << 3);
                n5[n6] = v4;
                ++n;
                n4 = ++n3;
            }
            n2 = n;
        }
        this.cfr_renamed_3 = 0;
    }

    public void cfr_renamed_6613(int arg0) {
        sprvvf sprvvf2 = this;
        sprvvf sprvvf3 = this;
        sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4] = ((long)arg0 & 0xFFL) << (this.cfr_renamed_3 << 3) | sprvvf3.cfr_renamed_3[sprvvf3.cfr_renamed_4] & -1L >>> (8 - this.cfr_renamed_3 << 3);
    }

    public long cfr_renamed_6614() {
        sprvvf sprvvf2 = this;
        if (sprvvf2.cfr_renamed_4 >= ((int)sprvvf2.cfr_renamed_3).length) {
            return 0L;
        }
        if (this.cfr_renamed_3 == 0) {
            sprvvf sprvvf3 = this;
            return (long)sprvvf3.cfr_renamed_3[sprvvf3.cfr_renamed_4];
        }
        sprvvf sprvvf4 = this;
        if (sprvvf4.cfr_renamed_4 == ((int)sprvvf4.cfr_renamed_3).length - 1) {
            sprvvf sprvvf5 = this;
            return (long)(sprvvf5.cfr_renamed_3[sprvvf5.cfr_renamed_4] >>> (this.cfr_renamed_3 << 3));
        }
        sprvvf sprvvf6 = this;
        sprvvf sprvvf7 = this;
        return (long)(sprvvf6.cfr_renamed_3[sprvvf6.cfr_renamed_4] >>> (this.cfr_renamed_3 << 3) | sprvvf7.cfr_renamed_3[sprvvf7.cfr_renamed_4 + 1] << (8 - this.cfr_renamed_3 << 3));
    }

    @Override
    public void cfr_renamed_6615(int arg0, byte[] arg1, int arg2, int arg3) {
        if (this.cfr_renamed_3 != 0) {
            sprvvf sprvvf2 = this;
            int n = sprvvf2.cfr_renamed_4 + arg0;
            int n2 = sprvvf2.cfr_renamed_3;
            int n3 = sprvvf2.cfr_renamed_3;
            int n4 = n;
            n3[n4] = n3[n4] & (-1L << (n2 << 3) ^ 0xFFFFFFFFFFFFFFFFL);
            int n5 = n2;
            for (int i = 0; n5 < 8 && i < arg3; ++i) {
                int n6 = this.cfr_renamed_3;
                int n7 = n;
                void v6 = n6[n7] | ((long)arg1[arg2] & 0xFFL) << (n2 << 3);
                ++arg2;
                n6[n7] = v6;
                n5 = ++n2;
            }
            ++arg0;
            arg3 -= 8 - this.cfr_renamed_3;
        }
        super.cfr_renamed_6615(arg0, arg1, arg2, arg3);
    }

    @Override
    public byte[] cfr_renamed_6616(int arg0) {
        int n;
        byte[] byArray = new byte[arg0];
        int n2 = n = this.cfr_renamed_3;
        while (n2 < byArray.length + this.cfr_renamed_3) {
            int n3 = n - this.cfr_renamed_3;
            sprvvf sprvvf2 = this;
            byte by = (byte)(sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4 + (n >>> 3)] >>> ((n & 7) << 3));
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprvvf(sprvvf sprvvf2) {
        super((sprpbg)arg0);
        void arg0;
        this.cfr_renamed_3 = sprvvf2.cfr_renamed_3;
    }

    public void cfr_renamed_6617() {
        sprvvf sprvvf2 = this;
        ++sprvvf2.cfr_renamed_3;
        sprvvf sprvvf3 = this;
        sprvvf2.cfr_renamed_4 += sprvvf3.cfr_renamed_3 >>> 3;
        sprvvf3.cfr_renamed_3 &= 7;
    }

    public void cfr_renamed_6618(int arg0, long arg1) {
        int n = arg0 + this.cfr_renamed_3 + (this.cfr_renamed_4 << 3);
        int n2 = n >>> 3;
        int n3 = this.cfr_renamed_3;
        int n4 = n2;
        n3[n4] = n3[n4] & ((arg1 & 0xFFL) << ((n &= 7) << 3) | 255L << (n << 3) ^ 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public void cfr_renamed_6619(int arg0, long arg1) {
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6620(arg0, arg1);
            return;
        }
        sprvvf sprvvf2 = this;
        int n = sprvvf2.cfr_renamed_3 << 3;
        sprvvf sprvvf3 = this;
        int n2 = 8 - sprvvf3.cfr_renamed_3 << 3;
        sprvvf sprvvf4 = this;
        sprvvf3.cfr_renamed_3[this.cfr_renamed_4 + arg0] = arg1 << n | sprvvf4.cfr_renamed_3[sprvvf4.cfr_renamed_4 + arg0] & -1L >>> n2;
        sprvvf sprvvf5 = this;
        sprvvf2.cfr_renamed_3[this.cfr_renamed_4 + arg0 + 1] = arg1 >>> n2 | sprvvf5.cfr_renamed_3[sprvvf5.cfr_renamed_4 + arg0 + 1] & -1L << n;
    }

    @Override
    public void cfr_renamed_6620(int arg0, long arg1) {
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6620(arg0, arg1);
            return;
        }
        sprvvf sprvvf2 = this;
        int n = sprvvf2.cfr_renamed_3;
        int n2 = sprvvf2.cfr_renamed_4 + arg0;
        n[n2] = n[n2] ^ arg1 << (this.cfr_renamed_3 << 3);
        int n3 = sprvvf2.cfr_renamed_3;
        int n4 = this.cfr_renamed_4 + arg0 + 1;
        n3[n4] = n3[n4] ^ arg1 >>> (8 - this.cfr_renamed_3 << 3);
    }

    public byte cfr_renamed_3662() {
        sprvvf sprvvf2 = this;
        return (byte)(sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4] >>> (this.cfr_renamed_3 << 3));
    }

    @Override
    public long cfr_renamed_576(int arg0) {
        if (this.cfr_renamed_3 == 0) {
            sprvvf sprvvf2 = this;
            return (long)sprvvf2.cfr_renamed_3[sprvvf2.cfr_renamed_4 + arg0];
        }
        sprvvf sprvvf3 = this;
        sprvvf sprvvf4 = this;
        return (long)(sprvvf3.cfr_renamed_3[sprvvf3.cfr_renamed_4 + arg0] >>> (this.cfr_renamed_3 << 3) | sprvvf4.cfr_renamed_3[sprvvf4.cfr_renamed_4 + arg0 + 1] << (8 - this.cfr_renamed_3 << 3));
    }

    public void cfr_renamed_6608(int arg0, byte[] arg1, int arg2, int arg3) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = this.cfr_renamed_4 + (n >>> 3);
        if ((n &= 7) != 0) {
            int n3;
            int n4 = this.cfr_renamed_3;
            int n5 = n2;
            n4[n5] = n4[n5] & (-1L << (n << 3) ^ 0xFFFFFFFFFFFFFFFFL);
            int n6 = n;
            for (n3 = 0; n6 < 8 && n3 < arg3; ++n3) {
                int n7 = this.cfr_renamed_3;
                int n8 = n2;
                void v5 = n7[n8] | ((long)arg1[arg2] & 0xFFL) << (n << 3);
                ++arg2;
                n7[n8] = v5;
                n6 = ++n;
            }
            ++n2;
            arg3 -= n3;
        }
        super.cfr_renamed_6615(n2 - this.cfr_renamed_4, arg1, arg2, arg3);
    }

    @Override
    public void cfr_renamed_6621(int arg0, long arg1) {
        if (this.cfr_renamed_3 == 0) {
            super.cfr_renamed_6621(arg0, arg1);
            return;
        }
        sprvvf sprvvf2 = this;
        int n = sprvvf2.cfr_renamed_3 << 3;
        sprvvf sprvvf3 = this;
        int n2 = 8 - sprvvf3.cfr_renamed_3 << 3;
        int n3 = sprvvf3.cfr_renamed_3;
        int n4 = this.cfr_renamed_4 + arg0;
        n3[n4] = n3[n4] & (arg1 << n | -1L >>> n2);
        int n5 = sprvvf2.cfr_renamed_3;
        int n6 = this.cfr_renamed_4 + arg0 + 1;
        n5[n6] = n5[n6] & (arg1 >>> n2 | -1L << n);
    }

    public void cfr_renamed_6622(int n) {
        sprvvf sprvvf2 = this;
        sprvvf2.cfr_renamed_3 += n;
        sprvvf sprvvf3 = this;
        sprvvf2.cfr_renamed_4 += sprvvf3.cfr_renamed_3 >>> 3;
        sprvvf3.cfr_renamed_3 &= 7;
    }

    public sprvvf(int arg0) {
        super((arg0 >>> 3) + ((arg0 & 7) != 0 ? 1 : 0));
        this.cfr_renamed_3 = 0;
    }

    public byte cfr_renamed_6623(int arg0) {
        sprvvf sprvvf2 = this;
        sprvvf sprvvf3 = this;
        int n = sprvvf2.cfr_renamed_4 + (arg0 + sprvvf3.cfr_renamed_3 >>> 3);
        int n2 = sprvvf3.cfr_renamed_3 + arg0 & 7;
        return (byte)(sprvvf2.cfr_renamed_3[n] >>> (n2 << 3));
    }
}

