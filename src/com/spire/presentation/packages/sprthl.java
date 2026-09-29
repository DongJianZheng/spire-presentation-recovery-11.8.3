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

public class sprthl
extends sprikl
implements sprvu {
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    public static final int[] cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private static final int cfr_renamed_119 = 28;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[52 + this.cfr_renamed_93 * 4 + 1];
        sprthl sprthl2 = this;
        super.cfr_renamed_3793(byArray);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_102, byArray, 16);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_0, byArray, 20);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_112, byArray, 24);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_91, byArray, 28);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_152, byArray, 32);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_2, byArray, 36);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_3, byArray, 40);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_1, byArray, 44);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_93, byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_93) {
            sprpxe.cfr_renamed_442(this.cfr_renamed_4[n], byArray, 52 + n++ * 4);
            n2 = n;
        }
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_0.ordinal();
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3766(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprthl sprthl2 = this;
        this.cfr_renamed_4[sprthl2.cfr_renamed_93] = sprpxe.cfr_renamed_446((byte[])arg0, (int)arg1);
        if (++sprthl2.cfr_renamed_93 == 16) {
            this.cfr_renamed_3473();
        }
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprthl(this);
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3 = n2 = 16;
        while (n3 <= 63) {
            sprthl sprthl2 = this;
            int n4 = n2;
            sprthl sprthl3 = this;
            int n5 = sprthl2.cfr_renamed_3822(sprthl2.cfr_renamed_4[n4 - 2]) + this.cfr_renamed_4[n2 - 7] + sprthl3.cfr_renamed_3825(sprthl3.cfr_renamed_4[n2 - 15]) + this.cfr_renamed_4[n2 - 16];
            this.cfr_renamed_4[n4] = n5;
            n3 = ++n2;
        }
        sprthl sprthl4 = this;
        n2 = sprthl4.cfr_renamed_102;
        int n6 = sprthl4.cfr_renamed_0;
        int n7 = sprthl4.cfr_renamed_112;
        int n8 = sprthl4.cfr_renamed_91;
        int n9 = sprthl4.cfr_renamed_152;
        int n10 = sprthl4.cfr_renamed_2;
        int n11 = sprthl4.cfr_renamed_3;
        int n12 = sprthl4.cfr_renamed_1;
        int n13 = 0;
        int n14 = n = 0;
        while (n14 < 8) {
            n8 += (n12 += this.cfr_renamed_3823(n9) + this.cfr_renamed_3824(n9, n10, n11) + cfr_renamed_86[n13] + this.cfr_renamed_4[n13]);
            n12 += this.cfr_renamed_3827(n2) + this.cfr_renamed_3826(n2, n6, n7);
            n7 += (n11 += this.cfr_renamed_3823(n8) + this.cfr_renamed_3824(n8, n9, n10) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n11 += this.cfr_renamed_3827(n12) + this.cfr_renamed_3826(n12, n2, n6);
            n6 += (n10 += this.cfr_renamed_3823(n7) + this.cfr_renamed_3824(n7, n8, n9) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n10 += this.cfr_renamed_3827(n11) + this.cfr_renamed_3826(n11, n12, n2);
            n2 += (n9 += this.cfr_renamed_3823(n6) + this.cfr_renamed_3824(n6, n7, n8) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n9 += this.cfr_renamed_3827(n10) + this.cfr_renamed_3826(n10, n11, n12);
            n12 += (n8 += this.cfr_renamed_3823(n2) + this.cfr_renamed_3824(n2, n6, n7) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n8 += this.cfr_renamed_3827(n9) + this.cfr_renamed_3826(n9, n10, n11);
            n11 += (n7 += this.cfr_renamed_3823(n12) + this.cfr_renamed_3824(n12, n2, n6) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n7 += this.cfr_renamed_3827(n8) + this.cfr_renamed_3826(n8, n9, n10);
            n10 += (n6 += this.cfr_renamed_3823(n11) + this.cfr_renamed_3824(n11, n12, n2) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            n6 += this.cfr_renamed_3827(n7) + this.cfr_renamed_3826(n7, n8, n9);
            n9 += (n2 += this.cfr_renamed_3823(n10) + this.cfr_renamed_3824(n10, n11, n12) + cfr_renamed_86[++n13] + this.cfr_renamed_4[n13]);
            ++n13;
            n2 += this.cfr_renamed_3827(n6) + this.cfr_renamed_3826(n6, n7, n8);
            n14 = ++n;
        }
        sprthl sprthl5 = this;
        sprthl5.cfr_renamed_102 += n2;
        sprthl5.cfr_renamed_0 += n6;
        sprthl5.cfr_renamed_112 += n7;
        sprthl5.cfr_renamed_91 += n8;
        sprthl5.cfr_renamed_152 += n9;
        sprthl5.cfr_renamed_2 += n10;
        sprthl5.cfr_renamed_3 += n11;
        sprthl5.cfr_renamed_1 += n12;
        this.cfr_renamed_93 = 0;
        int n15 = n = 0;
        while (n15 < 16) {
            this.cfr_renamed_4[n++] = 0;
            n15 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3825(int arg0) {
        return (arg0 >>> 7 | arg0 << 25) ^ (arg0 >>> 18 | arg0 << 14) ^ arg0 >>> 3;
    }

    private /* synthetic */ int cfr_renamed_3822(int arg0) {
        return (arg0 >>> 17 | arg0 << 15) ^ (arg0 >>> 19 | arg0 << 13) ^ arg0 >>> 10;
    }

    private /* synthetic */ int cfr_renamed_3827(int arg0) {
        return (arg0 >>> 2 | arg0 << 30) ^ (arg0 >>> 13 | arg0 << 19) ^ (arg0 >>> 22 | arg0 << 10);
    }

    public sprthl() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprthl(byte[] byArray) {
        int n;
        void arg0;
        sprthl sprthl2 = this;
        void v1 = arg0;
        sprthl sprthl3 = this;
        void v3 = arg0;
        sprthl sprthl4 = this;
        void v5 = arg0;
        sprthl sprthl5 = this;
        super((byte[])arg0);
        sprthl5.cfr_renamed_4 = new int[64];
        sprybl.cfr_renamed_9170(sprthl5.cfr_renamed_10476());
        this.cfr_renamed_102 = sprpxe.cfr_renamed_446((byte[])v5, 16);
        sprthl4.cfr_renamed_0 = sprpxe.cfr_renamed_446((byte[])v5, 20);
        sprthl4.cfr_renamed_112 = sprpxe.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_91 = sprpxe.cfr_renamed_446((byte[])v3, 28);
        sprthl3.cfr_renamed_152 = sprpxe.cfr_renamed_446((byte[])v3, 32);
        sprthl3.cfr_renamed_2 = sprpxe.cfr_renamed_446((byte[])arg0, 36);
        this.cfr_renamed_3 = sprpxe.cfr_renamed_446((byte[])v1, 40);
        sprthl2.cfr_renamed_1 = sprpxe.cfr_renamed_446((byte[])v1, 44);
        sprthl2.cfr_renamed_93 = sprpxe.cfr_renamed_446(byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_93) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprpxe.cfr_renamed_446((byte[])arg0, 52 + n3 * 4);
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_10493(sprthl arg0) {
        sprthl sprthl2 = arg0;
        sprthl sprthl3 = this;
        sprthl sprthl4 = arg0;
        sprthl sprthl5 = this;
        sprthl sprthl6 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_102 = arg0.cfr_renamed_102;
        this.cfr_renamed_0 = sprthl6.cfr_renamed_0;
        sprthl5.cfr_renamed_112 = sprthl6.cfr_renamed_112;
        sprthl5.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_152 = sprthl4.cfr_renamed_152;
        sprthl3.cfr_renamed_2 = sprthl4.cfr_renamed_2;
        sprthl3.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_1 = sprthl2.cfr_renamed_1;
        System.arraycopy(sprthl2.cfr_renamed_4, 0, this.cfr_renamed_4, 0, arg0.cfr_renamed_4.length);
        this.cfr_renamed_93 = arg0.cfr_renamed_93;
    }

    public sprthl(spriil arg0) {
        sprthl sprthl2 = this;
        super(arg0);
        this.cfr_renamed_4 = new int[64];
        sprybl.cfr_renamed_9170(sprthl2.cfr_renamed_10476());
        this.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1218() {
        return 28;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprthl sprthl2 = this;
        return sprhel.cfr_renamed_10472(sprthl2, 192, (spriil)sprthl2.cfr_renamed_0);
    }

    private /* synthetic */ int cfr_renamed_3824(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-224";
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_93 > 14) {
            this.cfr_renamed_3473();
        }
        sprthl sprthl2 = this;
        sprthl2.cfr_renamed_4[14] = (int)(arg0 >>> 32);
        sprthl2.cfr_renamed_4[15] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprthl sprthl2 = (sprthl)arg0;
        this.cfr_renamed_10493(sprthl2);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprthl sprthl2 = this;
        sprthl sprthl3 = this;
        sprthl sprthl4 = this;
        sprthl sprthl5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_102 = -1056596264;
        sprthl5.cfr_renamed_0 = 914150663;
        sprthl5.cfr_renamed_112 = 812702999;
        sprthl4.cfr_renamed_91 = -150054599;
        sprthl4.cfr_renamed_152 = -4191439;
        sprthl3.cfr_renamed_2 = 1750603025;
        sprthl3.cfr_renamed_3 = 1694076839;
        sprthl2.cfr_renamed_1 = -1090891868;
        sprthl2.cfr_renamed_93 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprthl sprthl2 = this;
        sprthl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_102, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 12));
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 16));
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 20));
        sprpxe.cfr_renamed_442(sprthl2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 24));
        sprthl2.cfr_renamed_41();
        return 28;
    }

    private /* synthetic */ int cfr_renamed_3823(int arg0) {
        return (arg0 >>> 6 | arg0 << 26) ^ (arg0 >>> 11 | arg0 << 21) ^ (arg0 >>> 25 | arg0 << 7);
    }

    private /* synthetic */ int cfr_renamed_3826(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprthl(sprthl sprthl2) {
        void arg0;
        sprthl sprthl3 = this;
        super((sprikl)arg0);
        sprthl3.cfr_renamed_4 = new int[64];
        sprybl.cfr_renamed_9170(sprthl3.cfr_renamed_10476());
        sprthl3.cfr_renamed_10493(sprthl2);
    }

    static {
        int[] nArray = new int[64];
        nArray[0] = 1116352408;
        nArray[1] = 1899447441;
        nArray[2] = -1245643825;
        nArray[3] = -373957723;
        nArray[4] = 961987163;
        nArray[5] = 1508970993;
        nArray[6] = -1841331548;
        nArray[7] = -1424204075;
        nArray[8] = -670586216;
        nArray[9] = 310598401;
        nArray[10] = 607225278;
        nArray[11] = 1426881987;
        nArray[12] = 1925078388;
        nArray[13] = -2132889090;
        nArray[14] = -1680079193;
        nArray[15] = -1046744716;
        nArray[16] = -459576895;
        nArray[17] = -272742522;
        nArray[18] = 264347078;
        nArray[19] = 604807628;
        nArray[20] = 770255983;
        nArray[21] = 1249150122;
        nArray[22] = 1555081692;
        nArray[23] = 1996064986;
        nArray[24] = -1740746414;
        nArray[25] = -1473132947;
        nArray[26] = -1341970488;
        nArray[27] = -1084653625;
        nArray[28] = -958395405;
        nArray[29] = -710438585;
        nArray[30] = 113926993;
        nArray[31] = 338241895;
        nArray[32] = 666307205;
        nArray[33] = 773529912;
        nArray[34] = 1294757372;
        nArray[35] = 1396182291;
        nArray[36] = 1695183700;
        nArray[37] = 1986661051;
        nArray[38] = -2117940946;
        nArray[39] = -1838011259;
        nArray[40] = -1564481375;
        nArray[41] = -1474664885;
        nArray[42] = -1035236496;
        nArray[43] = -949202525;
        nArray[44] = -778901479;
        nArray[45] = -694614492;
        nArray[46] = -200395387;
        nArray[47] = 275423344;
        nArray[48] = 430227734;
        nArray[49] = 506948616;
        nArray[50] = 659060556;
        nArray[51] = 883997877;
        nArray[52] = 958139571;
        nArray[53] = 1322822218;
        nArray[54] = 1537002063;
        nArray[55] = 1747873779;
        nArray[56] = 1955562222;
        nArray[57] = 2024104815;
        nArray[58] = -2067236844;
        nArray[59] = -1933114872;
        nArray[60] = -1866530822;
        nArray[61] = -1538233109;
        nArray[62] = -1090935817;
        nArray[63] = -965641998;
        cfr_renamed_86 = nArray;
    }
}

