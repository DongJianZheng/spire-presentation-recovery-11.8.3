/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprmuaa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqdaa;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class spryhl
implements sprpl {
    private static long[] cfr_renamed_112;
    public final spriil cfr_renamed_119;
    public byte[] cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public long[] cfr_renamed_3;
    public boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6559(int arg0) {
        int n;
        if (arg0 <= 0 || arg0 >= 1600 || arg0 % 64 != 0) {
            throw new IllegalStateException(sprmuaa.cfr_renamed_9("W\u0016H\u0019R\u0011ZXL\u0019J\u001d\u001e\u000e_\u0014K\u001d"));
        }
        this.cfr_renamed_0 = arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0L;
            n2 = n;
        }
        spryhl spryhl2 = this;
        sproze.cfr_renamed_492(this.cfr_renamed_91, (byte)0);
        spryhl2.cfr_renamed_2 = 0;
        spryhl2.cfr_renamed_4 = false;
        this.cfr_renamed_1 = (1600 - arg0) / 2;
    }

    public void cfr_renamed_10486(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 7) {
            throw new IllegalArgumentException(sprqdaa.cfr_renamed_9("\u0014WZA@\u0012\u0013XFFG\u0015QP\u0013\\]\u0015G]V\u0015AT]RV\u0015\u0002\u0015GZ\u0013\u0002"));
        }
        if (this.cfr_renamed_2 % 8 != 0) {
            throw new IllegalStateException(sprmuaa.cfr_renamed_9("\u0019J\f[\u0015N\f\u001e\fQX_\u001aM\u0017L\u001a\u001e\u000fW\fVXQ\u001cZXR\u001dP\u001fJ\u0010\u001e\tK\u001dK\u001d"));
        }
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqdaa.cfr_renamed_9("TGAVXCA\u0013A\\\u0015RW@ZAW\u0013B[\\_P\u0013FB@VPI\\]R"));
        }
        int n = (1 << arg1) - 1;
        spryhl spryhl2 = this;
        this.cfr_renamed_91[spryhl2.cfr_renamed_2 >>> 3] = (byte)(arg0 & n);
        spryhl2.cfr_renamed_2 += arg1;
    }

    @Override
    public void cfr_renamed_41() {
        spryhl spryhl2 = this;
        spryhl2.cfr_renamed_3446(spryhl2.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_10504() {
        int n;
        long[] lArray = this.cfr_renamed_3;
        long l = this.cfr_renamed_3[0];
        long l2 = this.cfr_renamed_3[1];
        long l3 = this.cfr_renamed_3[2];
        long l4 = this.cfr_renamed_3[3];
        long l5 = this.cfr_renamed_3[4];
        long l6 = this.cfr_renamed_3[5];
        long l7 = this.cfr_renamed_3[6];
        long l8 = this.cfr_renamed_3[7];
        long l9 = this.cfr_renamed_3[8];
        long l10 = this.cfr_renamed_3[9];
        long l11 = this.cfr_renamed_3[10];
        long l12 = this.cfr_renamed_3[11];
        long l13 = this.cfr_renamed_3[12];
        long l14 = this.cfr_renamed_3[13];
        long l15 = this.cfr_renamed_3[14];
        long l16 = this.cfr_renamed_3[15];
        long l17 = this.cfr_renamed_3[16];
        long l18 = this.cfr_renamed_3[17];
        long l19 = this.cfr_renamed_3[18];
        long l20 = this.cfr_renamed_3[19];
        long l21 = this.cfr_renamed_3[20];
        long l22 = this.cfr_renamed_3[21];
        long l23 = this.cfr_renamed_3[22];
        long l24 = this.cfr_renamed_3[23];
        long l25 = this.cfr_renamed_3[24];
        int n2 = n = 0;
        while (n2 < 24) {
            long l26 = l ^ l6 ^ l11 ^ l16 ^ l21;
            long l27 = l2 ^ l7 ^ l12 ^ l17 ^ l22;
            long l28 = l3 ^ l8 ^ l13 ^ l18 ^ l23;
            long l29 = l4 ^ l9 ^ l14 ^ l19 ^ l24;
            long l30 = l5 ^ l10 ^ l15 ^ l20 ^ l25;
            long l31 = (l27 << 1 | l27 >>> -1) ^ l30;
            long l32 = (l28 << 1 | l28 >>> -1) ^ l26;
            long l33 = (l29 << 1 | l29 >>> -1) ^ l27;
            long l34 = (l30 << 1 | l30 >>> -1) ^ l28;
            long l35 = (l26 << 1 | l26 >>> -1) ^ l29;
            l ^= l31;
            l6 ^= l31;
            l11 ^= l31;
            l16 ^= l31;
            l21 ^= l31;
            l2 ^= l32;
            l7 ^= l32;
            l12 ^= l32;
            l17 ^= l32;
            l22 ^= l32;
            l3 ^= l33;
            l8 ^= l33;
            l13 ^= l33;
            l18 ^= l33;
            l23 ^= l33;
            l4 ^= l34;
            l9 ^= l34;
            l14 ^= l34;
            l19 ^= l34;
            l24 ^= l34;
            l5 ^= l35;
            l10 ^= l35;
            l15 ^= l35;
            l20 ^= l35;
            l25 ^= l35;
            l27 = l2 << 1 | l2 >>> 63;
            l2 = l7 << 44 | l7 >>> 20;
            l7 = l10 << 20 | l10 >>> 44;
            l10 = l23 << 61 | l23 >>> 3;
            l23 = l15 << 39 | l15 >>> 25;
            l15 = l21 << 18 | l21 >>> 46;
            l21 = l3 << 62 | l3 >>> 2;
            l3 = l13 << 43 | l13 >>> 21;
            l13 = l14 << 25 | l14 >>> 39;
            l14 = l20 << 8 | l20 >>> 56;
            l20 = l24 << 56 | l24 >>> 8;
            l24 = l16 << 41 | l16 >>> 23;
            l16 = l5 << 27 | l5 >>> 37;
            l5 = l25 << 14 | l25 >>> 50;
            l25 = l22 << 2 | l22 >>> 62;
            l22 = l9 << 55 | l9 >>> 9;
            l9 = l17 << 45 | l17 >>> 19;
            l17 = l6 << 36 | l6 >>> 28;
            l6 = l4 << 28 | l4 >>> 36;
            l4 = l19 << 21 | l19 >>> 43;
            l19 = l18 << 15 | l18 >>> 49;
            l18 = l12 << 10 | l12 >>> 54;
            l12 = l8 << 6 | l8 >>> 58;
            l8 = l11 << 3 | l11 >>> 61;
            l11 = l27;
            l26 = l ^ (l2 ^ 0xFFFFFFFFFFFFFFFFL) & l3;
            l27 = l2 ^ (l3 ^ 0xFFFFFFFFFFFFFFFFL) & l4;
            l3 ^= (l4 ^ 0xFFFFFFFFFFFFFFFFL) & l5;
            l4 ^= (l5 ^ 0xFFFFFFFFFFFFFFFFL) & l;
            l5 ^= (l ^ 0xFFFFFFFFFFFFFFFFL) & l2;
            l = l26;
            l2 = l27;
            l26 = l6 ^ (l7 ^ 0xFFFFFFFFFFFFFFFFL) & l8;
            l27 = l7 ^ (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l9;
            l8 ^= (l9 ^ 0xFFFFFFFFFFFFFFFFL) & l10;
            l9 ^= (l10 ^ 0xFFFFFFFFFFFFFFFFL) & l6;
            l10 ^= (l6 ^ 0xFFFFFFFFFFFFFFFFL) & l7;
            l6 = l26;
            l7 = l27;
            l26 = l11 ^ (l12 ^ 0xFFFFFFFFFFFFFFFFL) & l13;
            l27 = l12 ^ (l13 ^ 0xFFFFFFFFFFFFFFFFL) & l14;
            l13 ^= (l14 ^ 0xFFFFFFFFFFFFFFFFL) & l15;
            l14 ^= (l15 ^ 0xFFFFFFFFFFFFFFFFL) & l11;
            l15 ^= (l11 ^ 0xFFFFFFFFFFFFFFFFL) & l12;
            l11 = l26;
            l12 = l27;
            l26 = l16 ^ (l17 ^ 0xFFFFFFFFFFFFFFFFL) & l18;
            l27 = l17 ^ (l18 ^ 0xFFFFFFFFFFFFFFFFL) & l19;
            l18 ^= (l19 ^ 0xFFFFFFFFFFFFFFFFL) & l20;
            l19 ^= (l20 ^ 0xFFFFFFFFFFFFFFFFL) & l16;
            l20 ^= (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l17;
            l16 = l26;
            l17 = l27;
            l26 = l21 ^ (l22 ^ 0xFFFFFFFFFFFFFFFFL) & l23;
            l27 = l22 ^ (l23 ^ 0xFFFFFFFFFFFFFFFFL) & l24;
            l23 ^= (l24 ^ 0xFFFFFFFFFFFFFFFFL) & l25;
            l24 ^= (l25 ^ 0xFFFFFFFFFFFFFFFFL) & l21;
            l25 ^= (l21 ^ 0xFFFFFFFFFFFFFFFFL) & l22;
            l21 = l26;
            l22 = l27;
            l ^= cfr_renamed_112[n++];
            n2 = n;
        }
        lArray[0] = l;
        lArray[1] = l2;
        lArray[2] = l3;
        lArray[3] = l4;
        lArray[4] = l5;
        lArray[5] = l6;
        lArray[6] = l7;
        lArray[7] = l8;
        lArray[8] = l9;
        lArray[9] = l10;
        lArray[10] = l11;
        lArray[11] = l12;
        lArray[12] = l13;
        lArray[13] = l14;
        lArray[14] = l15;
        lArray[15] = l16;
        lArray[16] = l17;
        lArray[17] = l18;
        lArray[18] = l19;
        lArray[19] = l20;
        lArray[20] = l21;
        lArray[21] = l22;
        lArray[22] = l23;
        lArray[23] = l24;
        lArray[24] = l25;
    }

    private /* synthetic */ void cfr_renamed_3813() {
        spryhl spryhl2;
        spryhl spryhl3 = this;
        byte[] byArray = this.cfr_renamed_91;
        int n = spryhl3.cfr_renamed_2 >>> 3;
        byArray[n] = (byte)(byArray[n] | (byte)(1 << (this.cfr_renamed_2 & 7)));
        if (++spryhl3.cfr_renamed_2 == this.cfr_renamed_0) {
            spryhl spryhl4 = this;
            spryhl2 = spryhl4;
            spryhl4.cfr_renamed_10505(spryhl4.cfr_renamed_91, 0);
        } else {
            int n2;
            spryhl spryhl5 = this;
            int n3 = spryhl5.cfr_renamed_2 >>> 6;
            int n4 = spryhl5.cfr_renamed_2 & 0x3F;
            int n5 = 0;
            int n6 = n2 = 0;
            while (n6 < n3) {
                int n7 = n2++;
                long l = this.cfr_renamed_3[n7] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_91, n5);
                n5 += 8;
                this.cfr_renamed_3[n7] = l;
                n6 = n2;
            }
            if (n4 > 0) {
                long l = (1L << n4) - 1L;
                int n8 = n3;
                this.cfr_renamed_3[n8] = this.cfr_renamed_3[n8] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_91, n5) & l;
            }
            spryhl2 = this;
        }
        int n9 = this.cfr_renamed_0 - 1 >>> 6;
        spryhl2.cfr_renamed_3[n9] = spryhl2.cfr_renamed_3[n9] ^ Long.MIN_VALUE;
        spryhl spryhl6 = this;
        spryhl6.cfr_renamed_2 = 0;
        spryhl6.cfr_renamed_4 = true;
    }

    static {
        long[] lArray = new long[24];
        lArray[0] = 1L;
        lArray[1] = 32898L;
        lArray[2] = -9223372036854742902L;
        lArray[3] = -9223372034707259392L;
        lArray[4] = 32907L;
        lArray[5] = 0x80000001L;
        lArray[6] = -9223372034707259263L;
        lArray[7] = -9223372036854743031L;
        lArray[8] = 138L;
        lArray[9] = 136L;
        lArray[10] = 0x80008009L;
        lArray[11] = 0x8000000AL;
        lArray[12] = 0x8000808BL;
        lArray[13] = -9223372036854775669L;
        lArray[14] = -9223372036854742903L;
        lArray[15] = -9223372036854743037L;
        lArray[16] = -9223372036854743038L;
        lArray[17] = -9223372036854775680L;
        lArray[18] = 32778L;
        lArray[19] = -9223372034707292150L;
        lArray[20] = -9223372034707259263L;
        lArray[21] = -9223372036854742912L;
        lArray[22] = 0x80000001L;
        lArray[23] = -9223372034707259384L;
        cfr_renamed_112 = lArray;
    }

    private /* synthetic */ void cfr_renamed_10505(byte[] arg0, int arg1) {
        int n;
        int n2 = this.cfr_renamed_0 >>> 6;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            long l = this.cfr_renamed_3[n4] ^ sprpxe.cfr_renamed_443(arg0, arg1);
            arg1 += 8;
            this.cfr_renamed_3[n4] = l;
            n3 = n;
        }
        this.cfr_renamed_10504();
    }

    public void cfr_renamed_10485(byte arg0) {
        if (this.cfr_renamed_2 % 8 != 0) {
            throw new IllegalStateException(sprmuaa.cfr_renamed_9("\u0019J\f[\u0015N\f\u001e\fQX_\u001aM\u0017L\u001a\u001e\u000fW\fVXQ\u001cZXR\u001dP\u001fJ\u0010\u001e\tK\u001dK\u001d"));
        }
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqdaa.cfr_renamed_9("TGAVXCA\u0013A\\\u0015RW@ZAW\u0013B[\\_P\u0013FB@VPI\\]R"));
        }
        spryhl spryhl2 = this;
        spryhl2.cfr_renamed_91[spryhl2.cfr_renamed_2 >>> 3] = arg0;
        if ((spryhl2.cfr_renamed_2 += 8) == this.cfr_renamed_0) {
            spryhl spryhl3 = this;
            spryhl3.cfr_renamed_10505(spryhl3.cfr_renamed_91, 0);
            spryhl3.cfr_renamed_2 = 0;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        spryhl spryhl2 = this;
        spryhl spryhl3 = this;
        spryhl3.cfr_renamed_3800(arg0, arg1, spryhl3.cfr_renamed_1);
        spryhl2.cfr_renamed_41();
        return spryhl2.cfr_renamed_1218();
    }

    public sprxq cfr_renamed_10476() {
        spryhl spryhl2 = this;
        return sprhel.cfr_renamed_10472(spryhl2, this.cfr_renamed_1218() * 8, spryhl2.cfr_renamed_119);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_10485(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spryhl(int n, spriil spriil2) {
        void arg1;
        spryhl spryhl2 = this;
        spryhl spryhl3 = this;
        spryhl3.cfr_renamed_3 = new long[25];
        spryhl3.cfr_renamed_91 = new byte[192];
        spryhl2.cfr_renamed_119 = arg1;
        spryhl2.cfr_renamed_3446(n);
        sprybl.cfr_renamed_9170(spryhl2.cfr_renamed_10476());
    }

    private /* synthetic */ void cfr_renamed_10506() {
        spryhl spryhl2 = this;
        spryhl2.cfr_renamed_10504();
        spryhl spryhl3 = this;
        sprpxe.cfr_renamed_5181(spryhl2.cfr_renamed_3, 0, spryhl3.cfr_renamed_0 >>> 6, this.cfr_renamed_91, 0);
        spryhl2.cfr_renamed_2 = spryhl3.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_0 / 8;
    }

    public spryhl(spryhl arg0) {
        spryhl spryhl2 = arg0;
        spryhl spryhl3 = this;
        spryhl3.cfr_renamed_3 = new long[25];
        spryhl3.cfr_renamed_91 = new byte[192];
        this.cfr_renamed_119 = spryhl2.cfr_renamed_119;
        System.arraycopy(spryhl2.cfr_renamed_3, 0, this.cfr_renamed_3, 0, arg0.cfr_renamed_3.length);
        System.arraycopy(arg0.cfr_renamed_91, 0, this.cfr_renamed_91, 0, arg0.cfr_renamed_91.length);
        spryhl spryhl4 = arg0;
        this.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_2 = spryhl4.cfr_renamed_2;
        this.cfr_renamed_1 = spryhl4.cfr_renamed_1;
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprybl.cfr_renamed_9170(this.cfr_renamed_10476());
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprmuaa.cfr_renamed_9("3[\u001b]\u0019UU")).append(this.cfr_renamed_1).toString();
    }

    public int cfr_renamed_10487(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg3 > 0) {
            this.cfr_renamed_10486(arg2, arg3);
        }
        spryhl spryhl2 = this;
        spryhl spryhl3 = this;
        spryhl3.cfr_renamed_3800(arg0, arg1, spryhl3.cfr_renamed_1);
        spryhl2.cfr_renamed_41();
        return spryhl2.cfr_renamed_1218();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_3446(int arg0) {
        switch (arg0) {
            case 128: 
            case 224: 
            case 256: 
            case 288: 
            case 384: 
            case 512: {
                this.cfr_renamed_6559(1600 - (arg0 << 1));
                return;
            }
        }
        throw new IllegalArgumentException(sprqdaa.cfr_renamed_9("WZA\u007fP]RG]\u0013XFFG\u0015QP\u0013Z]P\u0013ZU\u0015\u0002\u0007\u000b\u0019\u0013\u0007\u0001\u0001\u001f\u0015\u0001\u0000\u0005\u0019\u0013\u0007\u000b\r\u001f\u0015\u0000\r\u0007\u0019\u0013ZA\u0015\u0006\u0004\u0001\u001b"));
    }

    public spryhl(spriil arg0) {
        this(288, arg0);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_1 / 8;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_10507(arg0, arg1, arg2);
    }

    public spryhl() {
        this(288, spriil.cfr_renamed_0);
    }

    public void cfr_renamed_10507(byte[] arg0, int arg1, int arg2) {
        int n;
        if (this.cfr_renamed_2 % 8 != 0) {
            throw new IllegalStateException(sprmuaa.cfr_renamed_9("\u0019J\f[\u0015N\f\u001e\fQX_\u001aM\u0017L\u001a\u001e\u000fW\fVXQ\u001cZXR\u001dP\u001fJ\u0010\u001e\tK\u001dK\u001d"));
        }
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqdaa.cfr_renamed_9("TGAVXCA\u0013A\\\u0015RW@ZAW\u0013B[\\_P\u0013FB@VPI\\]R"));
        }
        spryhl spryhl2 = this;
        int n2 = spryhl2.cfr_renamed_0 >>> 3;
        int n3 = spryhl2.cfr_renamed_2 >>> 3;
        int n4 = n2 - n3;
        if (arg2 < n4) {
            spryhl spryhl3 = this;
            System.arraycopy(arg0, arg1, spryhl3.cfr_renamed_91, n3, arg2);
            spryhl3.cfr_renamed_2 += arg2 << 3;
            return;
        }
        int n5 = 0;
        if (n3 > 0) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_91, n3, n4);
            n5 += n4;
            this.cfr_renamed_10505(this.cfr_renamed_91, 0);
        }
        int n6 = arg2;
        while ((n = n6 - n5) >= n2) {
            this.cfr_renamed_10505(arg0, arg1 + n5);
            n5 += n2;
            n6 = arg2;
        }
        System.arraycopy(arg0, arg1 + n5, this.cfr_renamed_91, 0, n);
        this.cfr_renamed_2 = n << 3;
    }

    public spryhl(int arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    public void cfr_renamed_3800(byte[] arg0, int arg1, long arg2) {
        long l;
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_3813();
        }
        if (arg2 % 8L != 0L) {
            throw new IllegalStateException(sprmuaa.cfr_renamed_9("Q\rJ\bK\fr\u001dP\u001fJ\u0010\u001e\u0016Q\f\u001e\u0019\u001e\u0015K\u0014J\u0011N\u0014[XQ\u001e\u001e@"));
        }
        long l2 = l = 0L;
        while (l2 < arg2) {
            if (this.cfr_renamed_2 == 0) {
                this.cfr_renamed_10506();
            }
            spryhl spryhl2 = this;
            int n = (int)Math.min((long)spryhl2.cfr_renamed_2, arg2 - l);
            spryhl spryhl3 = this;
            System.arraycopy(spryhl2.cfr_renamed_91, (spryhl3.cfr_renamed_0 - spryhl3.cfr_renamed_2) / 8, arg0, arg1 + (int)(l / 8L), n / 8);
            spryhl2.cfr_renamed_2 -= n;
            l2 = l + (long)n;
        }
    }
}

