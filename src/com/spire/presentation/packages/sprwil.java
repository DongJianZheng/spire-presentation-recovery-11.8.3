/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvu;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprwil
extends sprikl
implements sprvu {
    private int cfr_renamed_102;
    private static final int cfr_renamed_93 = -899497514;
    private static final int cfr_renamed_86 = 1518500249;
    private static final int cfr_renamed_152 = 20;
    private int[] cfr_renamed_112;
    private static final int cfr_renamed_119 = -1894007588;
    private static final int cfr_renamed_91 = 1859775393;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        sprwil sprwil2 = this;
        sprwil sprwil3 = this;
        sprwil sprwil4 = this;
        super.cfr_renamed_41();
        sprwil4.cfr_renamed_3 = 1732584193;
        sprwil4.cfr_renamed_1 = -271733879;
        sprwil3.cfr_renamed_4 = -1732584194;
        sprwil3.cfr_renamed_2 = 271733878;
        sprwil2.cfr_renamed_0 = -1009589776;
        sprwil2.cfr_renamed_102 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprwil sprwil2 = this;
        return sprhel.cfr_renamed_10472(sprwil2, 128, (spriil)sprwil2.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprwil(sprwil sprwil2) {
        void arg0;
        sprwil sprwil3 = this;
        super((sprikl)arg0);
        sprwil3.cfr_renamed_112 = new int[80];
        sprybl.cfr_renamed_9170(sprwil3.cfr_renamed_10476());
        sprwil3.cfr_renamed_10058(sprwil2);
    }

    private /* synthetic */ int cfr_renamed_3830(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_102 > 14) {
            this.cfr_renamed_3473();
        }
        sprwil sprwil2 = this;
        sprwil2.cfr_renamed_112[14] = (int)(arg0 >>> 32);
        sprwil2.cfr_renamed_112[15] = (int)arg0;
    }

    @Override
    public int cfr_renamed_1218() {
        return 20;
    }

    private /* synthetic */ void cfr_renamed_10058(sprwil arg0) {
        sprwil sprwil2 = arg0;
        sprwil sprwil3 = this;
        sprwil sprwil4 = arg0;
        this.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_1 = sprwil4.cfr_renamed_1;
        sprwil3.cfr_renamed_4 = sprwil4.cfr_renamed_4;
        sprwil3.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_0 = sprwil2.cfr_renamed_0;
        System.arraycopy(sprwil2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, arg0.cfr_renamed_112.length);
        this.cfr_renamed_102 = arg0.cfr_renamed_102;
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[40 + this.cfr_renamed_102 * 4 + 1];
        sprwil sprwil2 = this;
        super.cfr_renamed_3793(byArray);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_3, byArray, 16);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_1, byArray, 20);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_4, byArray, 24);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_2, byArray, 28);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_0, byArray, 32);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_102, byArray, 36);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_102) {
            sprpxe.cfr_renamed_442(this.cfr_renamed_112[n], byArray, 40 + n++ * 4);
            n2 = n;
        }
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_0.ordinal();
        return byArray;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3;
        int n4 = n3 = 16;
        while (n4 < 80) {
            sprwil sprwil2 = this;
            n2 = this.cfr_renamed_112[n3 - 3] ^ this.cfr_renamed_112[n3 - 8] ^ this.cfr_renamed_112[n3 - 14] ^ sprwil2.cfr_renamed_112[n3 - 16];
            sprwil2.cfr_renamed_112[n3++] = n2 << 1 | n2 >>> 31;
            n4 = n3;
        }
        sprwil sprwil3 = this;
        n3 = sprwil3.cfr_renamed_3;
        n2 = sprwil3.cfr_renamed_1;
        int n5 = sprwil3.cfr_renamed_4;
        int n6 = sprwil3.cfr_renamed_2;
        int n7 = sprwil3.cfr_renamed_0;
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < 4) {
            int n10 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3830(n2, n5, n6) + this.cfr_renamed_112[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n11 = ((n7 += n10 + 1518500249) << 5 | n7 >>> 27) + this.cfr_renamed_3830(n3, n2, n5) + this.cfr_renamed_112[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n12 = ((n6 += n11 + 1518500249) << 5 | n6 >>> 27) + this.cfr_renamed_3830(n7, n3, n2) + this.cfr_renamed_112[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n13 = ((n5 += n12 + 1518500249) << 5 | n5 >>> 27) + this.cfr_renamed_3830(n6, n7, n3) + this.cfr_renamed_112[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n14 = ((n2 += n13 + 1518500249) << 5 | n2 >>> 27) + this.cfr_renamed_3830(n5, n6, n7) + this.cfr_renamed_112[++n8];
            ++n8;
            n3 += n14 + 1518500249;
            n5 = n5 << 30 | n5 >>> 2;
            n9 = ++n;
        }
        int n15 = n = 0;
        while (n15 < 4) {
            int n16 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3831(n2, n5, n6) + this.cfr_renamed_112[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n17 = ((n7 += n16 + 1859775393) << 5 | n7 >>> 27) + this.cfr_renamed_3831(n3, n2, n5) + this.cfr_renamed_112[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n18 = ((n6 += n17 + 1859775393) << 5 | n6 >>> 27) + this.cfr_renamed_3831(n7, n3, n2) + this.cfr_renamed_112[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n19 = ((n5 += n18 + 1859775393) << 5 | n5 >>> 27) + this.cfr_renamed_3831(n6, n7, n3) + this.cfr_renamed_112[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n20 = ((n2 += n19 + 1859775393) << 5 | n2 >>> 27) + this.cfr_renamed_3831(n5, n6, n7) + this.cfr_renamed_112[++n8];
            ++n8;
            n3 += n20 + 1859775393;
            n5 = n5 << 30 | n5 >>> 2;
            n15 = ++n;
        }
        int n21 = n = 0;
        while (n21 < 4) {
            int n22 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3832(n2, n5, n6) + this.cfr_renamed_112[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n23 = ((n7 += n22 + -1894007588) << 5 | n7 >>> 27) + this.cfr_renamed_3832(n3, n2, n5) + this.cfr_renamed_112[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n24 = ((n6 += n23 + -1894007588) << 5 | n6 >>> 27) + this.cfr_renamed_3832(n7, n3, n2) + this.cfr_renamed_112[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n25 = ((n5 += n24 + -1894007588) << 5 | n5 >>> 27) + this.cfr_renamed_3832(n6, n7, n3) + this.cfr_renamed_112[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n26 = ((n2 += n25 + -1894007588) << 5 | n2 >>> 27) + this.cfr_renamed_3832(n5, n6, n7) + this.cfr_renamed_112[++n8];
            ++n8;
            n3 += n26 + -1894007588;
            n5 = n5 << 30 | n5 >>> 2;
            n21 = ++n;
        }
        int n27 = n = 0;
        while (n27 <= 3) {
            int n28 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3831(n2, n5, n6) + this.cfr_renamed_112[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n29 = ((n7 += n28 + -899497514) << 5 | n7 >>> 27) + this.cfr_renamed_3831(n3, n2, n5) + this.cfr_renamed_112[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n30 = ((n6 += n29 + -899497514) << 5 | n6 >>> 27) + this.cfr_renamed_3831(n7, n3, n2) + this.cfr_renamed_112[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n31 = ((n5 += n30 + -899497514) << 5 | n5 >>> 27) + this.cfr_renamed_3831(n6, n7, n3) + this.cfr_renamed_112[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n32 = ((n2 += n31 + -899497514) << 5 | n2 >>> 27) + this.cfr_renamed_3831(n5, n6, n7) + this.cfr_renamed_112[++n8];
            ++n8;
            n3 += n32 + -899497514;
            n5 = n5 << 30 | n5 >>> 2;
            n27 = ++n;
        }
        sprwil sprwil4 = this;
        sprwil4.cfr_renamed_3 += n3;
        sprwil4.cfr_renamed_1 += n2;
        sprwil4.cfr_renamed_4 += n5;
        sprwil4.cfr_renamed_2 += n6;
        sprwil4.cfr_renamed_0 += n7;
        this.cfr_renamed_102 = 0;
        int n33 = n = 0;
        while (n33 < 16) {
            this.cfr_renamed_112[n++] = 0;
            n33 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwil(byte[] byArray) {
        int n;
        void arg0;
        sprwil sprwil2 = this;
        void v1 = arg0;
        sprwil sprwil3 = this;
        void v3 = arg0;
        sprwil sprwil4 = this;
        super((byte[])arg0);
        sprwil4.cfr_renamed_112 = new int[80];
        sprybl.cfr_renamed_9170(sprwil4.cfr_renamed_10476());
        this.cfr_renamed_3 = sprpxe.cfr_renamed_446((byte[])v3, 16);
        sprwil3.cfr_renamed_1 = sprpxe.cfr_renamed_446((byte[])v3, 20);
        sprwil3.cfr_renamed_4 = sprpxe.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_2 = sprpxe.cfr_renamed_446((byte[])v1, 28);
        sprwil2.cfr_renamed_0 = sprpxe.cfr_renamed_446((byte[])v1, 32);
        sprwil2.cfr_renamed_102 = sprpxe.cfr_renamed_446(byArray, 36);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_102) {
            int n3 = n++;
            this.cfr_renamed_112[n3] = sprpxe.cfr_renamed_446((byte[])arg0, 40 + n3 * 4);
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3831(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprwil(this);
    }

    public sprwil(spriil arg0) {
        sprwil sprwil2 = this;
        super(arg0);
        this.cfr_renamed_112 = new int[80];
        sprybl.cfr_renamed_9170(sprwil2.cfr_renamed_10476());
        this.cfr_renamed_41();
    }

    public sprwil() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprwil sprwil2 = (sprwil)arg0;
        sprwil sprwil3 = this;
        super.cfr_renamed_10478(sprwil2);
        sprwil3.cfr_renamed_10058(sprwil2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprwil sprwil2 = this;
        sprwil2.cfr_renamed_3120();
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_3, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 12));
        sprpxe.cfr_renamed_442(sprwil2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 16));
        sprwil2.cfr_renamed_41();
        return 20;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3766(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprwil sprwil2 = this;
        this.cfr_renamed_112[sprwil2.cfr_renamed_102] = sprpxe.cfr_renamed_446((byte[])arg0, (int)arg1);
        if (++sprwil2.cfr_renamed_102 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3832(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-1";
    }
}

