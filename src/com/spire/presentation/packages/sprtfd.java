/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprjl;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public class sprtfd
extends sprehd
implements sprjl {
    private int[] cfr_renamed_102;
    private int cfr_renamed_93;
    public static final int[] cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private int cfr_renamed_4;

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

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        sprtfd sprtfd2 = this;
        this.cfr_renamed_102[sprtfd2.cfr_renamed_91] = n4;
        if (++sprtfd2.cfr_renamed_91 == 16) {
            this.cfr_renamed_3473();
        }
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprtfd sprtfd2 = (sprtfd)arg0;
        this.cfr_renamed_3821(sprtfd2);
    }

    private /* synthetic */ int cfr_renamed_3822(int arg0) {
        return (arg0 >>> 17 | arg0 << 15) ^ (arg0 >>> 19 | arg0 << 13) ^ arg0 >>> 10;
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[52 + this.cfr_renamed_91 * 4];
        sprtfd sprtfd2 = this;
        super.cfr_renamed_3793(byArray);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_93, byArray, 16);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_119, byArray, 20);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_0, byArray, 24);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_152, byArray, 28);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_2, byArray, 32);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_112, byArray, 36);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_4, byArray, 40);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_1, byArray, 44);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_91, byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_91) {
            sprtsa.cfr_renamed_442(this.cfr_renamed_102[n], byArray, 52 + n++ * 4);
            n2 = n;
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprtfd sprtfd2 = this;
        sprtfd sprtfd3 = this;
        sprtfd sprtfd4 = this;
        sprtfd sprtfd5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_93 = 1779033703;
        sprtfd5.cfr_renamed_119 = -1150833019;
        sprtfd5.cfr_renamed_0 = 1013904242;
        sprtfd4.cfr_renamed_152 = -1521486534;
        sprtfd4.cfr_renamed_2 = 1359893119;
        sprtfd3.cfr_renamed_112 = -1694144372;
        sprtfd3.cfr_renamed_4 = 528734635;
        sprtfd2.cfr_renamed_1 = 1541459225;
        sprtfd2.cfr_renamed_91 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_102.length) {
            this.cfr_renamed_102[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3823(int arg0) {
        return (arg0 >>> 6 | arg0 << 26) ^ (arg0 >>> 11 | arg0 << 21) ^ (arg0 >>> 25 | arg0 << 7);
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_91 > 14) {
            this.cfr_renamed_3473();
        }
        sprtfd sprtfd2 = this;
        sprtfd2.cfr_renamed_102[14] = (int)(arg0 >>> 32);
        sprtfd2.cfr_renamed_102[15] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    private /* synthetic */ int cfr_renamed_3824(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }

    private /* synthetic */ int cfr_renamed_3825(int arg0) {
        return (arg0 >>> 7 | arg0 << 25) ^ (arg0 >>> 18 | arg0 << 14) ^ arg0 >>> 3;
    }

    /*
     * WARNING - void declaration
     */
    public sprtfd(sprtfd sprtfd2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_102 = new int[64];
        this.cfr_renamed_3821(sprtfd2);
    }

    private /* synthetic */ void cfr_renamed_3821(sprtfd arg0) {
        sprtfd sprtfd2 = arg0;
        sprtfd sprtfd3 = this;
        sprtfd sprtfd4 = arg0;
        sprtfd sprtfd5 = this;
        sprtfd sprtfd6 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_93 = arg0.cfr_renamed_93;
        this.cfr_renamed_119 = sprtfd6.cfr_renamed_119;
        sprtfd5.cfr_renamed_0 = sprtfd6.cfr_renamed_0;
        sprtfd5.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_2 = sprtfd4.cfr_renamed_2;
        sprtfd3.cfr_renamed_112 = sprtfd4.cfr_renamed_112;
        sprtfd3.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_1 = sprtfd2.cfr_renamed_1;
        System.arraycopy(sprtfd2.cfr_renamed_102, 0, this.cfr_renamed_102, 0, arg0.cfr_renamed_102.length);
        this.cfr_renamed_91 = arg0.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprtfd(byte[] byArray) {
        int n;
        void arg0;
        sprtfd sprtfd2 = this;
        void v1 = arg0;
        sprtfd sprtfd3 = this;
        void v3 = arg0;
        sprtfd sprtfd4 = this;
        void v5 = arg0;
        super((byte[])arg0);
        this.cfr_renamed_102 = new int[64];
        this.cfr_renamed_93 = sprtsa.cfr_renamed_446((byte[])v5, 16);
        sprtfd4.cfr_renamed_119 = sprtsa.cfr_renamed_446((byte[])v5, 20);
        sprtfd4.cfr_renamed_0 = sprtsa.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_152 = sprtsa.cfr_renamed_446((byte[])v3, 28);
        sprtfd3.cfr_renamed_2 = sprtsa.cfr_renamed_446((byte[])v3, 32);
        sprtfd3.cfr_renamed_112 = sprtsa.cfr_renamed_446((byte[])arg0, 36);
        this.cfr_renamed_4 = sprtsa.cfr_renamed_446((byte[])v1, 40);
        sprtfd2.cfr_renamed_1 = sprtsa.cfr_renamed_446((byte[])v1, 44);
        sprtfd2.cfr_renamed_91 = sprtsa.cfr_renamed_446(byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_91) {
            int n3 = n++;
            this.cfr_renamed_102[n3] = sprtsa.cfr_renamed_446((byte[])arg0, 52 + n3 * 4);
            n2 = n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-256";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprtfd sprtfd2 = this;
        sprtfd2.cfr_renamed_3120();
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_93, (byte[])arg0, (int)arg1);
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 4));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 12));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 16));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 20));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 24));
        sprtsa.cfr_renamed_442(sprtfd2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 28));
        sprtfd2.cfr_renamed_41();
        return 32;
    }

    private /* synthetic */ int cfr_renamed_3826(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    private /* synthetic */ int cfr_renamed_3827(int arg0) {
        return (arg0 >>> 2 | arg0 << 30) ^ (arg0 >>> 13 | arg0 << 19) ^ (arg0 >>> 22 | arg0 << 10);
    }

    public sprtfd() {
        sprtfd sprtfd2 = this;
        sprtfd2.cfr_renamed_102 = new int[64];
        sprtfd2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3 = n2 = 16;
        while (n3 <= 63) {
            sprtfd sprtfd2 = this;
            int n4 = n2;
            sprtfd sprtfd3 = this;
            int n5 = sprtfd2.cfr_renamed_3822(sprtfd2.cfr_renamed_102[n4 - 2]) + this.cfr_renamed_102[n2 - 7] + sprtfd3.cfr_renamed_3825(sprtfd3.cfr_renamed_102[n2 - 15]) + this.cfr_renamed_102[n2 - 16];
            this.cfr_renamed_102[n4] = n5;
            n3 = ++n2;
        }
        sprtfd sprtfd4 = this;
        n2 = sprtfd4.cfr_renamed_93;
        int n6 = sprtfd4.cfr_renamed_119;
        int n7 = sprtfd4.cfr_renamed_0;
        int n8 = sprtfd4.cfr_renamed_152;
        int n9 = sprtfd4.cfr_renamed_2;
        int n10 = sprtfd4.cfr_renamed_112;
        int n11 = sprtfd4.cfr_renamed_4;
        int n12 = sprtfd4.cfr_renamed_1;
        int n13 = 0;
        int n14 = n = 0;
        while (n14 < 8) {
            n8 += (n12 += this.cfr_renamed_3823(n9) + this.cfr_renamed_3824(n9, n10, n11) + cfr_renamed_86[n13] + this.cfr_renamed_102[n13]);
            n12 += this.cfr_renamed_3827(n2) + this.cfr_renamed_3826(n2, n6, n7);
            n7 += (n11 += this.cfr_renamed_3823(n8) + this.cfr_renamed_3824(n8, n9, n10) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n11 += this.cfr_renamed_3827(n12) + this.cfr_renamed_3826(n12, n2, n6);
            n6 += (n10 += this.cfr_renamed_3823(n7) + this.cfr_renamed_3824(n7, n8, n9) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n10 += this.cfr_renamed_3827(n11) + this.cfr_renamed_3826(n11, n12, n2);
            n2 += (n9 += this.cfr_renamed_3823(n6) + this.cfr_renamed_3824(n6, n7, n8) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n9 += this.cfr_renamed_3827(n10) + this.cfr_renamed_3826(n10, n11, n12);
            n12 += (n8 += this.cfr_renamed_3823(n2) + this.cfr_renamed_3824(n2, n6, n7) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n8 += this.cfr_renamed_3827(n9) + this.cfr_renamed_3826(n9, n10, n11);
            n11 += (n7 += this.cfr_renamed_3823(n12) + this.cfr_renamed_3824(n12, n2, n6) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n7 += this.cfr_renamed_3827(n8) + this.cfr_renamed_3826(n8, n9, n10);
            n10 += (n6 += this.cfr_renamed_3823(n11) + this.cfr_renamed_3824(n11, n12, n2) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            n6 += this.cfr_renamed_3827(n7) + this.cfr_renamed_3826(n7, n8, n9);
            n9 += (n2 += this.cfr_renamed_3823(n10) + this.cfr_renamed_3824(n10, n11, n12) + cfr_renamed_86[++n13] + this.cfr_renamed_102[n13]);
            ++n13;
            n2 += this.cfr_renamed_3827(n6) + this.cfr_renamed_3826(n6, n7, n8);
            n14 = ++n;
        }
        sprtfd sprtfd5 = this;
        sprtfd5.cfr_renamed_93 += n2;
        sprtfd5.cfr_renamed_119 += n6;
        sprtfd5.cfr_renamed_0 += n7;
        sprtfd5.cfr_renamed_152 += n8;
        sprtfd5.cfr_renamed_2 += n9;
        sprtfd5.cfr_renamed_112 += n10;
        sprtfd5.cfr_renamed_4 += n11;
        sprtfd5.cfr_renamed_1 += n12;
        this.cfr_renamed_91 = 0;
        int n15 = n = 0;
        while (n15 < 16) {
            this.cfr_renamed_102[n++] = 0;
            n15 = n;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprtfd(this);
    }
}

