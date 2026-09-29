/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprrj;

public class sprfmd
extends sprehd {
    private int[] cfr_renamed_88;
    private int cfr_renamed_31;
    private static final int cfr_renamed_272 = 12;
    private static final int cfr_renamed_145 = 6;
    private static final int cfr_renamed_114 = 4;
    private static final int cfr_renamed_96 = 17;
    private int cfr_renamed_105;
    private static final int cfr_renamed_137 = 9;
    private static final int cfr_renamed_79 = 5;
    private static final int cfr_renamed_107 = 21;
    private int cfr_renamed_132;
    private static final int cfr_renamed_102 = 10;
    private static final int cfr_renamed_93 = 15;
    private static final int cfr_renamed_86 = 16;
    private int cfr_renamed_152;
    private static final int cfr_renamed_112 = 23;
    private static final int cfr_renamed_119 = 14;
    private static final int cfr_renamed_91 = 11;
    private static final int cfr_renamed_0 = 22;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 7;
    private static final int cfr_renamed_3 = 16;
    private static final int cfr_renamed_4 = 20;

    private /* synthetic */ int cfr_renamed_3852(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprfmd sprfmd2 = (sprfmd)arg0;
        this.cfr_renamed_3853(sprfmd2);
    }

    private /* synthetic */ int cfr_renamed_3854(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3835(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >>> 8);
        v0[v1 + 2] = (byte)(arg0 >>> 16);
        v0[n2 + 3] = (byte)(arg0 >>> 24);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprfmd sprfmd2 = this;
        sprfmd2.cfr_renamed_3120();
        sprfmd2.cfr_renamed_3835(sprfmd2.cfr_renamed_31, (byte[])arg0, (int)arg1);
        sprfmd2.cfr_renamed_3835(sprfmd2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 4));
        sprfmd2.cfr_renamed_3835(sprfmd2.cfr_renamed_132, (byte[])arg0, (int)(arg1 + 8));
        sprfmd2.cfr_renamed_3835(sprfmd2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 12));
        sprfmd2.cfr_renamed_41();
        return 16;
    }

    private /* synthetic */ void cfr_renamed_3853(sprfmd arg0) {
        sprfmd sprfmd2 = arg0;
        sprfmd sprfmd3 = this;
        sprfmd sprfmd4 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_31 = sprfmd4.cfr_renamed_31;
        sprfmd3.cfr_renamed_152 = sprfmd4.cfr_renamed_152;
        sprfmd3.cfr_renamed_132 = arg0.cfr_renamed_132;
        this.cfr_renamed_1 = sprfmd2.cfr_renamed_1;
        System.arraycopy(sprfmd2.cfr_renamed_88, 0, this.cfr_renamed_88, 0, arg0.cfr_renamed_88.length);
        this.cfr_renamed_105 = arg0.cfr_renamed_105;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprfmd sprfmd2 = this;
        sprfmd sprfmd3 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_31 = 1732584193;
        sprfmd3.cfr_renamed_152 = -271733879;
        sprfmd3.cfr_renamed_132 = -1732584194;
        sprfmd2.cfr_renamed_1 = 271733878;
        sprfmd2.cfr_renamed_105 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_88.length) {
            this.cfr_renamed_88[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprfmd(sprfmd sprfmd2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_88 = new int[16];
        this.cfr_renamed_3853(sprfmd2);
    }

    private /* synthetic */ int cfr_renamed_3855(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_105 > 14) {
            this.cfr_renamed_3473();
        }
        sprfmd sprfmd2 = this;
        sprfmd2.cfr_renamed_88[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprfmd2.cfr_renamed_88[15] = (int)(arg0 >>> 32);
    }

    @Override
    public int cfr_renamed_1218() {
        return 16;
    }

    public sprfmd() {
        sprfmd sprfmd2 = this;
        sprfmd2.cfr_renamed_88 = new int[16];
        sprfmd2.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_88[this.cfr_renamed_105++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.cfr_renamed_105 == 16) {
            this.cfr_renamed_3473();
        }
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprfmd(this);
    }

    private /* synthetic */ int cfr_renamed_3856(int arg0, int arg1, int arg2) {
        return arg1 ^ (arg0 | ~arg2);
    }

    @Override
    public String cfr_renamed_1315() {
        return "MD5";
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprfmd sprfmd2 = this;
        int n2 = sprfmd2.cfr_renamed_31;
        int n3 = sprfmd2.cfr_renamed_152;
        int n4 = sprfmd2.cfr_renamed_132;
        int n5 = sprfmd2.cfr_renamed_1;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_88[0] + -680876936, 7) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_88[1] + -389564586, 12) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_88[2] + 606105819, 17) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_88[3] + -1044525330, 22) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_88[4] + -176418897, 7) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_88[5] + 1200080426, 12) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_88[6] + -1473231341, 17) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_88[7] + -45705983, 22) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_88[8] + 1770035416, 7) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_88[9] + -1958414417, 12) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_88[10] + -42063, 17) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_88[11] + -1990404162, 22) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_88[12] + 1804603682, 7) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_88[13] + -40341101, 12) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_88[14] + -1502002290, 17) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_88[15] + 1236535329, 22) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_88[1] + -165796510, 5) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_88[6] + -1069501632, 9) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_88[11] + 643717713, 14) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_88[0] + -373897302, 20) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_88[5] + -701558691, 5) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_88[10] + 38016083, 9) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_88[15] + -660478335, 14) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_88[4] + -405537848, 20) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_88[9] + 568446438, 5) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_88[14] + -1019803690, 9) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_88[3] + -187363961, 14) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_88[8] + 1163531501, 20) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_88[13] + -1444681467, 5) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_88[2] + -51403784, 9) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_88[7] + 1735328473, 14) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_88[12] + -1926607734, 20) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_88[5] + -378558, 4) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_88[8] + -2022574463, 11) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_88[11] + 1839030562, 16) + n5;
        n3 = sprfmd2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_88[14] + -35309556, 23) + n4;
        n2 = sprfmd2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_88[1] + -1530992060, 4) + n3;
        n5 = sprfmd2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_88[4] + 1272893353, 11) + n2;
        n4 = sprfmd2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_88[7] + -155497632, 16) + n5;
        sprfmd sprfmd3 = this;
        sprfmd sprfmd4 = this;
        n3 = sprfmd4.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + sprfmd4.cfr_renamed_88[10] + -1094730640, 23) + n4;
        sprfmd sprfmd5 = this;
        n2 = sprfmd3.cfr_renamed_494(n2 + sprfmd5.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_88[13] + 681279174, 4) + n3;
        n5 = sprfmd5.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_88[0] + -358537222, 11) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_88[3] + -722521979, 16) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_88[6] + 76029189, 23) + n4;
        n2 = sprfmd3.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_88[9] + -640364487, 4) + n3;
        n5 = sprfmd3.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_88[12] + -421815835, 11) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_88[15] + 530742520, 16) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_88[2] + -995338651, 23) + n4;
        n2 = sprfmd3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_88[0] + -198630844, 6) + n3;
        n5 = sprfmd3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_88[7] + 1126891415, 10) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_88[14] + -1416354905, 15) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_88[5] + -57434055, 21) + n4;
        n2 = sprfmd3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_88[12] + 1700485571, 6) + n3;
        n5 = sprfmd3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_88[3] + -1894986606, 10) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_88[10] + -1051523, 15) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_88[1] + -2054922799, 21) + n4;
        n2 = sprfmd3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_88[8] + 1873313359, 6) + n3;
        n5 = sprfmd3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_88[15] + -30611744, 10) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_88[6] + -1560198380, 15) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_88[13] + 1309151649, 21) + n4;
        n2 = sprfmd3.cfr_renamed_494(n2 + this.cfr_renamed_3856(n3, n4, n5) + this.cfr_renamed_88[4] + -145523070, 6) + n3;
        n5 = sprfmd3.cfr_renamed_494(n5 + this.cfr_renamed_3856(n2, n3, n4) + this.cfr_renamed_88[11] + -1120210379, 10) + n2;
        n4 = sprfmd3.cfr_renamed_494(n4 + this.cfr_renamed_3856(n5, n2, n3) + this.cfr_renamed_88[2] + 718787259, 15) + n5;
        n3 = sprfmd3.cfr_renamed_494(n3 + this.cfr_renamed_3856(n4, n5, n2) + this.cfr_renamed_88[9] + -343485551, 21) + n4;
        sprfmd3.cfr_renamed_31 += n2;
        sprfmd3.cfr_renamed_152 += n3;
        sprfmd3.cfr_renamed_132 += n4;
        sprfmd3.cfr_renamed_1 += n5;
        sprfmd3.cfr_renamed_105 = 0;
        int n6 = n = 0;
        while (n6 != this.cfr_renamed_88.length) {
            this.cfr_renamed_88[n++] = 0;
            n6 = n;
        }
    }
}

