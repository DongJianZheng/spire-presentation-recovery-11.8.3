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

public class sprudl
extends sprikl
implements sprvu {
    private static final int cfr_renamed_88 = 9;
    private int cfr_renamed_31;
    private int cfr_renamed_272;
    private int cfr_renamed_145;
    private int[] cfr_renamed_114;
    private static final int cfr_renamed_96 = 6;
    private static final int cfr_renamed_105 = 12;
    private static final int cfr_renamed_137 = 15;
    private int cfr_renamed_79;
    private static final int cfr_renamed_107 = 23;
    private static final int cfr_renamed_132 = 14;
    private static final int cfr_renamed_102 = 5;
    private static final int cfr_renamed_93 = 17;
    private static final int cfr_renamed_86 = 20;
    private static final int cfr_renamed_152 = 22;
    private static final int cfr_renamed_112 = 11;
    private static final int cfr_renamed_119 = 7;
    private static final int cfr_renamed_91 = 10;
    private static final int cfr_renamed_0 = 4;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 16;
    private static final int cfr_renamed_3 = 16;
    private static final int cfr_renamed_4 = 21;

    /*
     * WARNING - void declaration
     */
    public sprudl(byte[] byArray) {
        int n;
        void arg0;
        sprudl sprudl2 = this;
        void v1 = arg0;
        sprudl sprudl3 = this;
        super((byte[])arg0);
        this.cfr_renamed_114 = new int[16];
        sprudl3.cfr_renamed_1 = sprpxe.cfr_renamed_446((byte[])arg0, 16);
        sprudl3.cfr_renamed_145 = sprpxe.cfr_renamed_446((byte[])arg0, 20);
        this.cfr_renamed_272 = sprpxe.cfr_renamed_446((byte[])v1, 24);
        sprudl2.cfr_renamed_79 = sprpxe.cfr_renamed_446((byte[])v1, 28);
        sprudl2.cfr_renamed_31 = sprpxe.cfr_renamed_446(byArray, 32);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_31) {
            int n3 = n++;
            this.cfr_renamed_114[n3] = sprpxe.cfr_renamed_446((byte[])arg0, 36 + n3 * 4);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprudl(sprudl sprudl2) {
        super((sprikl)arg0);
        void arg0;
        this.cfr_renamed_114 = new int[16];
        this.cfr_renamed_10501(sprudl2);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprudl sprudl2 = (sprudl)arg0;
        this.cfr_renamed_10501(sprudl2);
    }

    @Override
    public String cfr_renamed_1315() {
        return "MD5";
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprudl sprudl2 = this;
        return sprhel.cfr_renamed_10474(sprudl2, (spriil)sprudl2.cfr_renamed_0);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[36 + this.cfr_renamed_31 * 4 + 1];
        sprudl sprudl2 = this;
        super.cfr_renamed_3793(byArray);
        sprpxe.cfr_renamed_442(sprudl2.cfr_renamed_1, byArray, 16);
        sprpxe.cfr_renamed_442(sprudl2.cfr_renamed_145, byArray, 20);
        sprpxe.cfr_renamed_442(sprudl2.cfr_renamed_272, byArray, 24);
        sprpxe.cfr_renamed_442(sprudl2.cfr_renamed_79, byArray, 28);
        sprpxe.cfr_renamed_442(sprudl2.cfr_renamed_31, byArray, 32);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_31) {
            sprpxe.cfr_renamed_442(this.cfr_renamed_114[n], byArray, 36 + n++ * 4);
            n2 = n;
        }
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_0.ordinal();
        return byArray;
    }

    public sprudl() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprudl sprudl2 = this;
        sprudl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_437(sprudl2.cfr_renamed_1, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_437(sprudl2.cfr_renamed_145, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_437(sprudl2.cfr_renamed_272, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_437(sprudl2.cfr_renamed_79, (byte[])arg0, (int)(arg1 + 12));
        sprudl2.cfr_renamed_41();
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    public sprudl(spriil spriil2) {
        void arg0;
        sprudl sprudl2 = this;
        super((spriil)arg0);
        sprudl2.cfr_renamed_114 = new int[16];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprudl2, 64, (spriil)arg0));
        sprudl2.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1218() {
        return 16;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_114[this.cfr_renamed_31++] = sprpxe.cfr_renamed_439(arg0, arg1);
        if (this.cfr_renamed_31 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3852(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprudl(this);
    }

    private /* synthetic */ int cfr_renamed_3855(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    private /* synthetic */ int cfr_renamed_3856(int arg0, int arg1, int arg2) {
        return arg1 ^ (arg0 | ~arg2);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprudl sprudl2 = this;
        sprudl sprudl3 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_1 = 1732584193;
        sprudl3.cfr_renamed_145 = -271733879;
        sprudl3.cfr_renamed_272 = -1732584194;
        sprudl2.cfr_renamed_79 = 271733878;
        sprudl2.cfr_renamed_31 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_114.length) {
            this.cfr_renamed_114[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_31 > 14) {
            this.cfr_renamed_3473();
        }
        sprudl sprudl2 = this;
        sprudl2.cfr_renamed_114[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprudl2.cfr_renamed_114[15] = (int)(arg0 >>> 32);
    }

    private /* synthetic */ void cfr_renamed_10501(sprudl arg0) {
        sprudl sprudl2 = arg0;
        sprudl sprudl3 = this;
        sprudl sprudl4 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_1 = sprudl4.cfr_renamed_1;
        sprudl3.cfr_renamed_145 = sprudl4.cfr_renamed_145;
        sprudl3.cfr_renamed_272 = arg0.cfr_renamed_272;
        this.cfr_renamed_79 = sprudl2.cfr_renamed_79;
        System.arraycopy(sprudl2.cfr_renamed_114, 0, this.cfr_renamed_114, 0, arg0.cfr_renamed_114.length);
        this.cfr_renamed_31 = arg0.cfr_renamed_31;
    }

    private /* synthetic */ int cfr_renamed_3854(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprudl sprudl2 = this;
        int n2 = sprudl2.cfr_renamed_1;
        int n3 = sprudl2.cfr_renamed_145;
        int n4 = sprudl2.cfr_renamed_272;
        int n5 = sprudl2.cfr_renamed_79;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_114[0] + -680876936, 7) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_114[1] + -389564586, 12) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_114[2] + 606105819, 17) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_114[3] + -1044525330, 22) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_114[4] + -176418897, 7) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_114[5] + 1200080426, 12) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_114[6] + -1473231341, 17) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_114[7] + -45705983, 22) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_114[8] + 1770035416, 7) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_114[9] + -1958414417, 12) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_114[10] + -42063, 17) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_114[11] + -1990404162, 22) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_114[12] + 1804603682, 7) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_114[13] + -40341101, 12) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_114[14] + -1502002290, 17) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_114[15] + 1236535329, 22) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_114[1] + -165796510, 5) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_114[6] + -1069501632, 9) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_114[11] + 643717713, 14) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_114[0] + -373897302, 20) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_114[5] + -701558691, 5) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_114[10] + 38016083, 9) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_114[15] + -660478335, 14) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_114[4] + -405537848, 20) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_114[9] + 568446438, 5) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_114[14] + -1019803690, 9) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_114[3] + -187363961, 14) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_114[8] + 1163531501, 20) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_114[13] + -1444681467, 5) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_114[2] + -51403784, 9) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_114[7] + 1735328473, 14) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_114[12] + -1926607734, 20) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_114[5] + -378558, 4) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_114[8] + -2022574463, 11) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_114[11] + 1839030562, 16) + n5;
        n3 = sprudl2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_114[14] + -35309556, 23) + n4;
        n2 = sprudl2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_114[1] + -1530992060, 4) + n3;
        n5 = sprudl2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_114[4] + 1272893353, 11) + n2;
        n4 = sprudl2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_114[7] + -155497632, 16) + n5;
        sprudl sprudl3 = this;
        sprudl sprudl4 = this;
        n3 = sprudl4.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + sprudl4.cfr_renamed_114[10] + -1094730640, 23) + n4;
        sprudl sprudl5 = this;
        n2 = sprudl3.cfr_renamed_494(n2 + sprudl5.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_114[13] + 681279174, 4) + n3;
        n5 = sprudl5.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_114[0] + -358537222, 11) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_114[3] + -722521979, 16) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_114[6] + 76029189, 23) + n4;
        n2 = sprudl3.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_114[9] + -640364487, 4) + n3;
        n5 = sprudl3.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_114[12] + -421815835, 11) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_114[15] + 530742520, 16) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_114[2] + -995338651, 23) + n4;
        n2 = sprudl3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_114[0] + -198630844, 6) + n3;
        n5 = sprudl3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_114[7] + 1126891415, 10) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_114[14] + -1416354905, 15) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_114[5] + -57434055, 21) + n4;
        n2 = sprudl3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_114[12] + 1700485571, 6) + n3;
        n5 = sprudl3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_114[3] + -1894986606, 10) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_114[10] + -1051523, 15) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_114[1] + -2054922799, 21) + n4;
        n2 = sprudl3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_114[8] + 1873313359, 6) + n3;
        n5 = sprudl3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_114[15] + -30611744, 10) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_114[6] + -1560198380, 15) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_114[13] + 1309151649, 21) + n4;
        n2 = sprudl3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_114[4] + -145523070, 6) + n3;
        n5 = sprudl3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_114[11] + -1120210379, 10) + n2;
        n4 = sprudl3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_114[2] + 718787259, 15) + n5;
        n3 = sprudl3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_114[9] + -343485551, 21) + n4;
        sprudl3.cfr_renamed_1 += n2;
        sprudl3.cfr_renamed_145 += n3;
        sprudl3.cfr_renamed_272 += n4;
        sprudl3.cfr_renamed_79 += n5;
        sprudl3.cfr_renamed_31 = 0;
        int n6 = n = 0;
        while (n6 != this.cfr_renamed_114.length) {
            this.cfr_renamed_114[n++] = 0;
            n6 = n;
        }
    }
}

