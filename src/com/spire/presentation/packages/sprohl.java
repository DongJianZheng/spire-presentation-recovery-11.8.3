/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.spriq;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtyba;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprohl
extends sprikl
implements spriq {
    public static final int[] cfr_renamed_102;
    private int[] cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 32;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_86 > 14) {
            this.cfr_renamed_3473();
        }
        sprohl sprohl2 = this;
        sprohl2.cfr_renamed_93[14] = (int)(arg0 >>> 32);
        sprohl2.cfr_renamed_93[15] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    private static /* synthetic */ int cfr_renamed_3823(int arg0) {
        return (arg0 >>> 6 | arg0 << 26) ^ (arg0 >>> 11 | arg0 << 21) ^ (arg0 >>> 25 | arg0 << 7);
    }

    private static /* synthetic */ int cfr_renamed_3827(int arg0) {
        return (arg0 >>> 2 | arg0 << 30) ^ (arg0 >>> 13 | arg0 << 19) ^ (arg0 >>> 22 | arg0 << 10);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprohl(this);
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    private static /* synthetic */ int cfr_renamed_3825(int arg0) {
        return (arg0 >>> 7 | arg0 << 25) ^ (arg0 >>> 18 | arg0 << 14) ^ arg0 >>> 3;
    }

    private static /* synthetic */ int cfr_renamed_3822(int arg0) {
        return (arg0 >>> 17 | arg0 << 15) ^ (arg0 >>> 19 | arg0 << 13) ^ arg0 >>> 10;
    }

    private /* synthetic */ void cfr_renamed_10489(sprohl arg0) {
        sprohl sprohl2 = arg0;
        sprohl sprohl3 = this;
        sprohl sprohl4 = arg0;
        sprohl sprohl5 = this;
        sprohl sprohl6 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_0 = sprohl6.cfr_renamed_0;
        sprohl5.cfr_renamed_112 = sprohl6.cfr_renamed_112;
        sprohl5.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_3 = sprohl4.cfr_renamed_3;
        sprohl3.cfr_renamed_4 = sprohl4.cfr_renamed_4;
        sprohl3.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_119 = sprohl2.cfr_renamed_119;
        System.arraycopy(sprohl2.cfr_renamed_93, 0, this.cfr_renamed_93, 0, arg0.cfr_renamed_93.length);
        this.cfr_renamed_86 = arg0.cfr_renamed_86;
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-256";
    }

    public static spriq cfr_renamed_7529() {
        return new sprohl();
    }

    public sprohl(spriil arg0) {
        sprohl sprohl2 = this;
        super(arg0);
        this.cfr_renamed_93 = new int[64];
        sprybl.cfr_renamed_9170(sprohl2.cfr_renamed_10476());
        this.cfr_renamed_41();
    }

    public static spriq cfr_renamed_10490(byte[] arg0) {
        return new sprohl(arg0);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[52 + this.cfr_renamed_86 * 4 + 1];
        sprohl sprohl2 = this;
        super.cfr_renamed_3793(byArray);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_152, byArray, 16);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_0, byArray, 20);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_112, byArray, 24);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_1, byArray, 28);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_3, byArray, 32);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_4, byArray, 36);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_2, byArray, 40);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_119, byArray, 44);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_86, byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_86) {
            sprpxe.cfr_renamed_442(this.cfr_renamed_93[n], byArray, 52 + n++ * 4);
            n2 = n;
        }
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_0.ordinal();
        return byArray;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprohl sprohl2 = (sprohl)arg0;
        this.cfr_renamed_10489(sprohl2);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprohl sprohl2 = this;
        sprohl sprohl3 = this;
        sprohl sprohl4 = this;
        sprohl sprohl5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_152 = 1779033703;
        sprohl5.cfr_renamed_0 = -1150833019;
        sprohl5.cfr_renamed_112 = 1013904242;
        sprohl4.cfr_renamed_1 = -1521486534;
        sprohl4.cfr_renamed_3 = 1359893119;
        sprohl3.cfr_renamed_4 = -1694144372;
        sprohl3.cfr_renamed_2 = 528734635;
        sprohl2.cfr_renamed_119 = 1541459225;
        sprohl2.cfr_renamed_86 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_93.length) {
            this.cfr_renamed_93[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3 = n2 = 16;
        while (n3 <= 63) {
            sprohl sprohl2 = this;
            int n4 = n2;
            int n5 = sprohl.cfr_renamed_3822(sprohl2.cfr_renamed_93[n2 - 2]) + this.cfr_renamed_93[n4 - 7] + sprohl.cfr_renamed_3825(this.cfr_renamed_93[n2 - 15]) + this.cfr_renamed_93[n2 - 16];
            sprohl2.cfr_renamed_93[n4] = n5;
            n3 = ++n2;
        }
        sprohl sprohl3 = this;
        n2 = sprohl3.cfr_renamed_152;
        int n6 = sprohl3.cfr_renamed_0;
        int n7 = sprohl3.cfr_renamed_112;
        int n8 = sprohl3.cfr_renamed_1;
        int n9 = sprohl3.cfr_renamed_3;
        int n10 = sprohl3.cfr_renamed_4;
        int n11 = sprohl3.cfr_renamed_2;
        int n12 = sprohl3.cfr_renamed_119;
        int n13 = 0;
        int n14 = n = 0;
        while (n14 < 8) {
            n8 += (n12 += sprohl.cfr_renamed_3823(n9) + sprohl.cfr_renamed_3824(n9, n10, n11) + cfr_renamed_102[n13] + this.cfr_renamed_93[n13]);
            n12 += sprohl.cfr_renamed_3827(n2) + sprohl.cfr_renamed_3826(n2, n6, n7);
            n7 += (n11 += sprohl.cfr_renamed_3823(n8) + sprohl.cfr_renamed_3824(n8, n9, n10) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n11 += sprohl.cfr_renamed_3827(n12) + sprohl.cfr_renamed_3826(n12, n2, n6);
            n6 += (n10 += sprohl.cfr_renamed_3823(n7) + sprohl.cfr_renamed_3824(n7, n8, n9) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n10 += sprohl.cfr_renamed_3827(n11) + sprohl.cfr_renamed_3826(n11, n12, n2);
            n2 += (n9 += sprohl.cfr_renamed_3823(n6) + sprohl.cfr_renamed_3824(n6, n7, n8) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n9 += sprohl.cfr_renamed_3827(n10) + sprohl.cfr_renamed_3826(n10, n11, n12);
            n12 += (n8 += sprohl.cfr_renamed_3823(n2) + sprohl.cfr_renamed_3824(n2, n6, n7) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n8 += sprohl.cfr_renamed_3827(n9) + sprohl.cfr_renamed_3826(n9, n10, n11);
            n11 += (n7 += sprohl.cfr_renamed_3823(n12) + sprohl.cfr_renamed_3824(n12, n2, n6) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n7 += sprohl.cfr_renamed_3827(n8) + sprohl.cfr_renamed_3826(n8, n9, n10);
            n10 += (n6 += sprohl.cfr_renamed_3823(n11) + sprohl.cfr_renamed_3824(n11, n12, n2) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            n6 += sprohl.cfr_renamed_3827(n7) + sprohl.cfr_renamed_3826(n7, n8, n9);
            n9 += (n2 += sprohl.cfr_renamed_3823(n10) + sprohl.cfr_renamed_3824(n10, n11, n12) + cfr_renamed_102[++n13] + this.cfr_renamed_93[n13]);
            ++n13;
            n2 += sprohl.cfr_renamed_3827(n6) + sprohl.cfr_renamed_3826(n6, n7, n8);
            n14 = ++n;
        }
        sprohl sprohl4 = this;
        sprohl4.cfr_renamed_152 += n2;
        sprohl4.cfr_renamed_0 += n6;
        sprohl4.cfr_renamed_112 += n7;
        sprohl4.cfr_renamed_1 += n8;
        sprohl4.cfr_renamed_3 += n9;
        sprohl4.cfr_renamed_4 += n10;
        sprohl4.cfr_renamed_2 += n11;
        sprohl4.cfr_renamed_119 += n12;
        this.cfr_renamed_86 = 0;
        int n15 = n = 0;
        while (n15 < 16) {
            this.cfr_renamed_93[n++] = 0;
            n15 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprohl(byte[] byArray) {
        int n;
        void arg0;
        sprohl sprohl2 = this;
        void v1 = arg0;
        sprohl sprohl3 = this;
        void v3 = arg0;
        sprohl sprohl4 = this;
        void v5 = arg0;
        super((byte[])arg0);
        this.cfr_renamed_93 = new int[64];
        this.cfr_renamed_152 = sprpxe.cfr_renamed_446((byte[])v5, 16);
        sprohl4.cfr_renamed_0 = sprpxe.cfr_renamed_446((byte[])v5, 20);
        sprohl4.cfr_renamed_112 = sprpxe.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_1 = sprpxe.cfr_renamed_446((byte[])v3, 28);
        sprohl3.cfr_renamed_3 = sprpxe.cfr_renamed_446((byte[])v3, 32);
        sprohl3.cfr_renamed_4 = sprpxe.cfr_renamed_446((byte[])arg0, 36);
        this.cfr_renamed_2 = sprpxe.cfr_renamed_446((byte[])v1, 40);
        sprohl2.cfr_renamed_119 = sprpxe.cfr_renamed_446((byte[])v1, 44);
        sprohl2.cfr_renamed_86 = sprpxe.cfr_renamed_446(byArray, 48);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_86) {
            int n3 = n++;
            this.cfr_renamed_93[n3] = sprpxe.cfr_renamed_446((byte[])arg0, 52 + n3 * 4);
            n2 = n;
        }
    }

    public static spriq cfr_renamed_10491(spriil arg0) {
        return new sprohl(arg0);
    }

    private static /* synthetic */ int cfr_renamed_3826(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg2 & (arg0 ^ arg1);
    }

    public static spriq cfr_renamed_10492(sprgf arg0) {
        if (arg0 instanceof sprohl) {
            return new sprohl((sprohl)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtyba.cfr_renamed_9("7\f&\f,\u001f \u001be\r,\u000e \u001a1I+\u00061I$\u001f$\u0000)\b'\u0005 I#\u00067I,\u00075\u001c1I1\u00105\fe")).append(arg0 != null ? arg0.getClass().getName() : "null").toString());
    }

    public sprohl() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprohl sprohl2 = this;
        sprohl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_152, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 12));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 16));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 20));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 24));
        sprpxe.cfr_renamed_442(sprohl2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 28));
        sprohl2.cfr_renamed_41();
        return 32;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprohl sprohl2 = this;
        return sprhel.cfr_renamed_10472(sprohl2, 256, (spriil)sprohl2.cfr_renamed_0);
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
        cfr_renamed_102 = nArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprohl(sprohl sprohl2) {
        super((sprikl)arg0);
        void arg0;
        this.cfr_renamed_93 = new int[64];
        this.cfr_renamed_10489(sprohl2);
    }

    private static /* synthetic */ int cfr_renamed_3824(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3766(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprohl sprohl2 = this;
        this.cfr_renamed_93[sprohl2.cfr_renamed_86] = sprpxe.cfr_renamed_446((byte[])arg0, (int)arg1);
        if (++sprohl2.cfr_renamed_86 == 16) {
            this.cfr_renamed_3473();
        }
    }
}

