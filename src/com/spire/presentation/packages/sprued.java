/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprjl;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public class sprued
extends sprehd
implements sprjl {
    private static final int cfr_renamed_102 = 28;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    public static final int[] cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int[] cfr_renamed_4;

    @Override
    public sprrj cfr_renamed_461() {
        return new sprued(this);
    }

    private /* synthetic */ int cfr_renamed_3827(int arg0) {
        return (arg0 >>> 2 | arg0 << 30) ^ (arg0 >>> 13 | arg0 << 19) ^ (arg0 >>> 22 | arg0 << 10);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprued sprued2 = this;
        sprued sprued3 = this;
        sprued sprued4 = this;
        sprued sprued5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_112 = -1056596264;
        sprued5.cfr_renamed_93 = 914150663;
        sprued5.cfr_renamed_119 = 812702999;
        sprued4.cfr_renamed_2 = -150054599;
        sprued4.cfr_renamed_1 = -4191439;
        sprued3.cfr_renamed_91 = 1750603025;
        sprued3.cfr_renamed_86 = 1694076839;
        sprued2.cfr_renamed_152 = -1090891868;
        sprued2.cfr_renamed_3 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        sprued sprued2 = this;
        this.cfr_renamed_4[sprued2.cfr_renamed_3] = n4;
        if (++sprued2.cfr_renamed_3 == 16) {
            this.cfr_renamed_3473();
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-224";
    }

    private /* synthetic */ int cfr_renamed_3826(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    private /* synthetic */ int cfr_renamed_3822(int arg0) {
        return (arg0 >>> 17 | arg0 << 15) ^ (arg0 >>> 19 | arg0 << 13) ^ arg0 >>> 10;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_3 > 14) {
            this.cfr_renamed_3473();
        }
        sprued sprued2 = this;
        sprued2.cfr_renamed_4[14] = (int)(arg0 >>> 32);
        sprued2.cfr_renamed_4[15] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    private /* synthetic */ int cfr_renamed_3823(int arg0) {
        return (arg0 >>> 6 | arg0 << 26) ^ (arg0 >>> 11 | arg0 << 21) ^ (arg0 >>> 25 | arg0 << 7);
    }

    private /* synthetic */ int cfr_renamed_3824(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprued sprued2 = (sprued)arg0;
        this.cfr_renamed_3828(sprued2);
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
        cfr_renamed_0 = nArray;
    }

    @Override
    public int cfr_renamed_1218() {
        return 28;
    }

    private /* synthetic */ void cfr_renamed_3828(sprued arg0) {
        sprued sprued2 = arg0;
        sprued sprued3 = this;
        sprued sprued4 = arg0;
        sprued sprued5 = this;
        sprued sprued6 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
        this.cfr_renamed_93 = sprued6.cfr_renamed_93;
        sprued5.cfr_renamed_119 = sprued6.cfr_renamed_119;
        sprued5.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_1 = sprued4.cfr_renamed_1;
        sprued3.cfr_renamed_91 = sprued4.cfr_renamed_91;
        sprued3.cfr_renamed_86 = arg0.cfr_renamed_86;
        this.cfr_renamed_152 = sprued2.cfr_renamed_152;
        System.arraycopy(sprued2.cfr_renamed_4, 0, this.cfr_renamed_4, 0, arg0.cfr_renamed_4.length);
        this.cfr_renamed_3 = arg0.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprued(sprued sprued2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_4 = new int[64];
        this.cfr_renamed_3828(sprued2);
    }

    private /* synthetic */ int cfr_renamed_3825(int arg0) {
        return (arg0 >>> 7 | arg0 << 25) ^ (arg0 >>> 18 | arg0 << 14) ^ arg0 >>> 3;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3 = n2 = 16;
        while (n3 <= 63) {
            sprued sprued2 = this;
            int n4 = n2;
            sprued sprued3 = this;
            int n5 = sprued2.cfr_renamed_3822(sprued2.cfr_renamed_4[n4 - 2]) + this.cfr_renamed_4[n2 - 7] + sprued3.cfr_renamed_3825(sprued3.cfr_renamed_4[n2 - 15]) + this.cfr_renamed_4[n2 - 16];
            this.cfr_renamed_4[n4] = n5;
            n3 = ++n2;
        }
        sprued sprued4 = this;
        n2 = sprued4.cfr_renamed_112;
        int n6 = sprued4.cfr_renamed_93;
        int n7 = sprued4.cfr_renamed_119;
        int n8 = sprued4.cfr_renamed_2;
        int n9 = sprued4.cfr_renamed_1;
        int n10 = sprued4.cfr_renamed_91;
        int n11 = sprued4.cfr_renamed_86;
        int n12 = sprued4.cfr_renamed_152;
        int n13 = 0;
        int n14 = n = 0;
        while (n14 < 8) {
            n8 += (n12 += this.cfr_renamed_3823(n9) + this.cfr_renamed_3824(n9, n10, n11) + cfr_renamed_0[n13] + this.cfr_renamed_4[n13]);
            n12 += this.cfr_renamed_3827(n2) + this.cfr_renamed_3826(n2, n6, n7);
            n7 += (n11 += this.cfr_renamed_3823(n8) + this.cfr_renamed_3824(n8, n9, n10) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n11 += this.cfr_renamed_3827(n12) + this.cfr_renamed_3826(n12, n2, n6);
            n6 += (n10 += this.cfr_renamed_3823(n7) + this.cfr_renamed_3824(n7, n8, n9) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n10 += this.cfr_renamed_3827(n11) + this.cfr_renamed_3826(n11, n12, n2);
            n2 += (n9 += this.cfr_renamed_3823(n6) + this.cfr_renamed_3824(n6, n7, n8) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n9 += this.cfr_renamed_3827(n10) + this.cfr_renamed_3826(n10, n11, n12);
            n12 += (n8 += this.cfr_renamed_3823(n2) + this.cfr_renamed_3824(n2, n6, n7) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n8 += this.cfr_renamed_3827(n9) + this.cfr_renamed_3826(n9, n10, n11);
            n11 += (n7 += this.cfr_renamed_3823(n12) + this.cfr_renamed_3824(n12, n2, n6) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n7 += this.cfr_renamed_3827(n8) + this.cfr_renamed_3826(n8, n9, n10);
            n10 += (n6 += this.cfr_renamed_3823(n11) + this.cfr_renamed_3824(n11, n12, n2) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            n6 += this.cfr_renamed_3827(n7) + this.cfr_renamed_3826(n7, n8, n9);
            n9 += (n2 += this.cfr_renamed_3823(n10) + this.cfr_renamed_3824(n10, n11, n12) + cfr_renamed_0[++n13] + this.cfr_renamed_4[n13]);
            ++n13;
            n2 += this.cfr_renamed_3827(n6) + this.cfr_renamed_3826(n6, n7, n8);
            n14 = ++n;
        }
        sprued sprued5 = this;
        sprued5.cfr_renamed_112 += n2;
        sprued5.cfr_renamed_93 += n6;
        sprued5.cfr_renamed_119 += n7;
        sprued5.cfr_renamed_2 += n8;
        sprued5.cfr_renamed_1 += n9;
        sprued5.cfr_renamed_91 += n10;
        sprued5.cfr_renamed_86 += n11;
        sprued5.cfr_renamed_152 += n12;
        this.cfr_renamed_3 = 0;
        int n15 = n = 0;
        while (n15 < 16) {
            this.cfr_renamed_4[n++] = 0;
            n15 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprued(byte[] byArray) {
        int n;
        void arg0;
        sprued sprued2 = this;
        void v1 = arg0;
        sprued sprued3 = this;
        void v3 = arg0;
        sprued sprued4 = this;
        void v5 = arg0;
        super((byte[])arg0);
        this.cfr_renamed_4 = new int[64];
        this.cfr_renamed_112 = sprtsa.cfr_renamed_446((byte[])v5, 16);
        sprued4.cfr_renamed_93 = sprtsa.cfr_renamed_446((byte[])v5, 20);
        sprued4.cfr_renamed_119 = sprtsa.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_2 = sprtsa.cfr_renamed_446((byte[])v3, 28);
        sprued3.cfr_renamed_1 = sprtsa.cfr_renamed_446((byte[])v3, 32);
        sprued3.cfr_renamed_91 = sprtsa.cfr_renamed_446((byte[])arg0, 36);
        this.cfr_renamed_86 = sprtsa.cfr_renamed_446((byte[])v1, 40);
        sprued2.cfr_renamed_152 = sprtsa.cfr_renamed_446((byte[])v1, 44);
        sprued2.cfr_renamed_3 = sprtsa.cfr_renamed_446(byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprtsa.cfr_renamed_446((byte[])arg0, 52 + n3 * 4);
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
        sprued sprued2 = this;
        sprued2.cfr_renamed_3120();
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_112, (byte[])arg0, (int)arg1);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 4));
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 12));
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 16));
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 20));
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_86, (byte[])arg0, (int)(arg1 + 24));
        sprued2.cfr_renamed_41();
        return 28;
    }

    public sprued() {
        sprued sprued2 = this;
        sprued2.cfr_renamed_4 = new int[64];
        sprued2.cfr_renamed_41();
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[52 + this.cfr_renamed_3 * 4];
        sprued sprued2 = this;
        super.cfr_renamed_3793(byArray);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_112, byArray, 16);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_93, byArray, 20);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_119, byArray, 24);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_2, byArray, 28);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_1, byArray, 32);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_91, byArray, 36);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_86, byArray, 40);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_152, byArray, 44);
        sprtsa.cfr_renamed_442(sprued2.cfr_renamed_3, byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3) {
            sprtsa.cfr_renamed_442(this.cfr_renamed_4[n], byArray, 52 + n++ * 4);
            n2 = n;
        }
        return byArray;
    }
}

