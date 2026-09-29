/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprnkea;
import com.spire.presentation.packages.sprpgaa;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprcxk
implements sprvv {
    private byte[] cfr_renamed_112;
    private boolean cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private int[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_3664(int arg0) {
        return arg0 & 0x1FF;
    }

    private static /* synthetic */ int cfr_renamed_3666(int arg0) {
        return sprcxk.cfr_renamed_493(arg0, 7) ^ sprcxk.cfr_renamed_493(arg0, 18) ^ arg0 >>> 3;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1314();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpgaa.cfr_renamed_9("-BH0W9");
    }

    private static /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    private /* synthetic */ int cfr_renamed_3663() {
        int n;
        sprcxk sprcxk2;
        sprcxk sprcxk3 = this;
        int n2 = sprcxk.cfr_renamed_3664(sprcxk3.cfr_renamed_0);
        if (sprcxk3.cfr_renamed_0 < 512) {
            sprcxk sprcxk4 = this;
            sprcxk2 = sprcxk4;
            int n3 = n2;
            sprcxk sprcxk5 = this;
            sprcxk4.cfr_renamed_2[n3] = sprcxk4.cfr_renamed_2[n3] + sprcxk5.cfr_renamed_3667(this.cfr_renamed_2[sprcxk.cfr_renamed_3664(n2 - 3)], this.cfr_renamed_2[sprcxk.cfr_renamed_3664(n2 - 10)], sprcxk5.cfr_renamed_2[sprcxk.cfr_renamed_3664(n2 - 511)]);
            n = sprcxk4.cfr_renamed_3665(sprcxk4.cfr_renamed_2[sprcxk.cfr_renamed_3664(n2 - 12)]) ^ this.cfr_renamed_2[n2];
        } else {
            sprcxk sprcxk6 = this;
            sprcxk2 = sprcxk6;
            int n4 = n2;
            sprcxk sprcxk7 = this;
            sprcxk6.cfr_renamed_3[n4] = sprcxk6.cfr_renamed_3[n4] + sprcxk7.cfr_renamed_3671(this.cfr_renamed_3[sprcxk.cfr_renamed_3664(n2 - 3)], this.cfr_renamed_3[sprcxk.cfr_renamed_3664(n2 - 10)], sprcxk7.cfr_renamed_3[sprcxk.cfr_renamed_3664(n2 - 511)]);
            n = sprcxk6.cfr_renamed_3669(sprcxk6.cfr_renamed_3[sprcxk.cfr_renamed_3664(n2 - 12)]) ^ this.cfr_renamed_3[n2];
        }
        sprcxk2.cfr_renamed_0 = sprcxk.cfr_renamed_3670(this.cfr_renamed_0 + 1);
        return n;
    }

    private /* synthetic */ byte cfr_renamed_3662() {
        int n;
        if (this.cfr_renamed_91 == 0) {
            sprcxk sprcxk2 = this;
            n = sprcxk2.cfr_renamed_3663();
            sprcxk2.cfr_renamed_112[0] = (byte)(n & 0xFF);
            sprcxk2.cfr_renamed_112[1] = (byte)((n >>= 8) & 0xFF);
            sprcxk2.cfr_renamed_112[2] = (byte)((n >>= 8) & 0xFF);
            sprcxk2.cfr_renamed_112[3] = (byte)((n >>= 8) & 0xFF);
        }
        sprcxk sprcxk3 = this;
        n = this.cfr_renamed_112[sprcxk3.cfr_renamed_91];
        this.cfr_renamed_91 = sprcxk3.cfr_renamed_91 + 1 & 3;
        return (byte)n;
    }

    private /* synthetic */ void cfr_renamed_1314() {
        int n;
        if (this.cfr_renamed_1.length != 16) {
            throw new IllegalArgumentException(sprnkea.cfr_renamed_9("&l\u0017$\u0019a\u000b$\u001fq\u0001pRf\u0017$C6J$\u0010m\u0006wRh\u001dj\u0015"));
        }
        if (this.cfr_renamed_4.length != 16) {
            throw new IllegalArgumentException(sprpgaa.cfr_renamed_9("1i\u0000!,WEl\u0010r\u0011!\u0007dE0W9Ec\fu\u0016!\tn\u000bf"));
        }
        this.cfr_renamed_91 = 0;
        this.cfr_renamed_0 = 0;
        int[] nArray = new int[1280];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n >> 2;
            int n4 = nArray[n3] | (this.cfr_renamed_1[n] & 0xFF) << 8 * (n & 3);
            nArray[n3] = n4;
            n2 = ++n;
        }
        System.arraycopy(nArray, 0, nArray, 4, 4);
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_4.length && n < 16) {
            int n6 = (n >> 2) + 8;
            int n7 = nArray[n6] | (this.cfr_renamed_4[n] & 0xFF) << 8 * (n & 3);
            nArray[n6] = n7;
            n5 = ++n;
        }
        System.arraycopy(nArray, 8, nArray, 12, 4);
        int n8 = n = 16;
        while (n8 < 1280) {
            int n9 = n;
            int n10 = sprcxk.cfr_renamed_3668(nArray[n9 - 2]) + nArray[n - 7] + sprcxk.cfr_renamed_3666(nArray[n - 15]) + nArray[n - 16] + n;
            nArray[n9] = n10;
            n8 = ++n;
        }
        System.arraycopy(nArray, 256, this.cfr_renamed_2, 0, 512);
        System.arraycopy(nArray, 768, this.cfr_renamed_3, 0, 512);
        int n11 = n = 0;
        while (n11 < 512) {
            this.cfr_renamed_2[n++] = this.cfr_renamed_3663();
            n11 = n;
        }
        int n12 = n = 0;
        while (n12 < 512) {
            this.cfr_renamed_3[n++] = this.cfr_renamed_3663();
            n12 = n;
        }
        this.cfr_renamed_0 = 0;
    }

    private /* synthetic */ int cfr_renamed_3665(int arg0) {
        return this.cfr_renamed_3[arg0 & 0xFF] + this.cfr_renamed_3[(arg0 >> 16 & 0xFF) + 256];
    }

    private /* synthetic */ int cfr_renamed_3667(int arg0, int arg1, int arg2) {
        return (sprcxk.cfr_renamed_493(arg0, 10) ^ sprcxk.cfr_renamed_493(arg2, 23)) + sprcxk.cfr_renamed_493(arg1, 8);
    }

    private /* synthetic */ int cfr_renamed_3669(int arg0) {
        return this.cfr_renamed_2[arg0 & 0xFF] + this.cfr_renamed_2[(arg0 >> 16 & 0xFF) + 256];
    }

    private static /* synthetic */ int cfr_renamed_3668(int arg0) {
        return sprcxk.cfr_renamed_493(arg0, 17) ^ sprcxk.cfr_renamed_493(arg0, 19) ^ arg0 >>> 10;
    }

    private /* synthetic */ int cfr_renamed_3671(int arg0, int arg1, int arg2) {
        return (sprcxk.cfr_renamed_494(arg0, 10) ^ sprcxk.cfr_renamed_494(arg2, 23)) + sprcxk.cfr_renamed_494(arg1, 8);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprnkea.cfr_renamed_9("j\u001d$;RRt\u0013w\u0001a\u0016"));
        }
        this.cfr_renamed_4 = ((sprkpk)arg1).cfr_renamed_1205();
        sprbj sprbj2 = ((sprkpk)arg1).cfr_renamed_284();
        if (!(sprbj2 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpgaa.cfr_renamed_9("H\u000bw\u0004m\feEq\u0004s\u0004l\u0000u\u0000sEq\u0004r\u0016d\u0001!\u0011nEI&0W9Eh\u000bh\u0011!H!")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_1 = ((sprtpk)sprbj2).cfr_renamed_1521();
        this.cfr_renamed_1314();
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_119 = true;
    }

    private static /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    private static /* synthetic */ int cfr_renamed_3670(int arg0) {
        return arg0 & 0x3FF;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (!this.cfr_renamed_119) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprnkea.cfr_renamed_9("$\u001ck\u0006$\u001bj\u001bp\u001be\u001em\u0001a\u0016")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprpgaa.cfr_renamed_9("\fo\u0015t\u0011!\u0007t\u0003g\u0000sEu\nnEr\rn\u0017u"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprnkea.cfr_renamed_9("\u001dq\u0006t\u0007pRf\u0007b\u0014a\u0000$\u0006k\u001d$\u0001l\u001dv\u0006"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg4 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_3662());
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        return (byte)(arg0 ^ this.cfr_renamed_3662());
    }

    public sprcxk() {
        sprcxk sprcxk2 = this;
        sprcxk sprcxk3 = this;
        this.cfr_renamed_2 = new int[512];
        sprcxk3.cfr_renamed_3 = new int[512];
        sprcxk3.cfr_renamed_0 = 0;
        sprcxk2.cfr_renamed_112 = new byte[4];
        sprcxk2.cfr_renamed_91 = 0;
    }
}

