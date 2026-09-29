/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasy;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqas;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;

public class sprpnd
implements sprqk {
    private int[] cfr_renamed_112;
    private boolean cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_3664(int arg0) {
        return arg0 & 0x1FF;
    }

    private /* synthetic */ int cfr_renamed_3665(int arg0) {
        return this.cfr_renamed_112[arg0 & 0xFF] + this.cfr_renamed_112[(arg0 >> 16 & 0xFF) + 256];
    }

    private static /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        return (byte)(arg0 ^ this.cfr_renamed_3662());
    }

    public sprpnd() {
        sprpnd sprpnd2 = this;
        sprpnd sprpnd3 = this;
        this.cfr_renamed_1 = new int[512];
        sprpnd3.cfr_renamed_112 = new int[512];
        sprpnd3.cfr_renamed_0 = 0;
        sprpnd2.cfr_renamed_3 = new byte[4];
        sprpnd2.cfr_renamed_2 = 0;
    }

    private static /* synthetic */ int cfr_renamed_3666(int arg0) {
        return sprpnd.cfr_renamed_493(arg0, 7) ^ sprpnd.cfr_renamed_493(arg0, 18) ^ arg0 >>> 3;
    }

    private /* synthetic */ int cfr_renamed_3667(int arg0, int arg1, int arg2) {
        return (sprpnd.cfr_renamed_493(arg0, 10) ^ sprpnd.cfr_renamed_493(arg2, 23)) + sprpnd.cfr_renamed_493(arg1, 8);
    }

    private static /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    private /* synthetic */ byte cfr_renamed_3662() {
        int n;
        if (this.cfr_renamed_2 == 0) {
            sprpnd sprpnd2 = this;
            n = sprpnd2.cfr_renamed_3663();
            sprpnd2.cfr_renamed_3[0] = (byte)(n & 0xFF);
            sprpnd2.cfr_renamed_3[1] = (byte)((n >>= 8) & 0xFF);
            sprpnd2.cfr_renamed_3[2] = (byte)((n >>= 8) & 0xFF);
            sprpnd2.cfr_renamed_3[3] = (byte)((n >>= 8) & 0xFF);
        }
        sprpnd sprpnd3 = this;
        n = this.cfr_renamed_3[sprpnd3.cfr_renamed_2];
        this.cfr_renamed_2 = sprpnd3.cfr_renamed_2 + 1 & 3;
        return (byte)n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (!this.cfr_renamed_119) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprqas.cfr_renamed_9("b\u0012-\bb\u0015,\u00156\u0015#\u0010+\u000f'\u0018")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprasy.cfr_renamed_9("<F%]!\b7]3N0Zu\\:Gu[=G'\\"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprqas.cfr_renamed_9("\u00137\b2\t6\\ \t$\u001a'\u000eb\b-\u0013b\u000f*\u00130\b"));
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

    private static /* synthetic */ int cfr_renamed_3668(int arg0) {
        return sprpnd.cfr_renamed_493(arg0, 17) ^ sprpnd.cfr_renamed_493(arg0, 19) ^ arg0 >>> 10;
    }

    private /* synthetic */ int cfr_renamed_3669(int arg0) {
        return this.cfr_renamed_1[arg0 & 0xFF] + this.cfr_renamed_1[(arg0 >> 16 & 0xFF) + 256];
    }

    private static /* synthetic */ int cfr_renamed_3670(int arg0) {
        return arg0 & 0x3FF;
    }

    private /* synthetic */ int cfr_renamed_3663() {
        int n;
        sprpnd sprpnd2;
        sprpnd sprpnd3 = this;
        int n2 = sprpnd.cfr_renamed_3664(sprpnd3.cfr_renamed_0);
        if (sprpnd3.cfr_renamed_0 < 512) {
            sprpnd sprpnd4 = this;
            sprpnd2 = sprpnd4;
            int n3 = n2;
            sprpnd sprpnd5 = this;
            sprpnd4.cfr_renamed_1[n3] = sprpnd4.cfr_renamed_1[n3] + sprpnd5.cfr_renamed_3667(this.cfr_renamed_1[sprpnd.cfr_renamed_3664(n2 - 3)], this.cfr_renamed_1[sprpnd.cfr_renamed_3664(n2 - 10)], sprpnd5.cfr_renamed_1[sprpnd.cfr_renamed_3664(n2 - 511)]);
            n = sprpnd4.cfr_renamed_3665(sprpnd4.cfr_renamed_1[sprpnd.cfr_renamed_3664(n2 - 12)]) ^ this.cfr_renamed_1[n2];
        } else {
            sprpnd sprpnd6 = this;
            sprpnd2 = sprpnd6;
            int n4 = n2;
            sprpnd sprpnd7 = this;
            sprpnd6.cfr_renamed_112[n4] = sprpnd6.cfr_renamed_112[n4] + sprpnd7.cfr_renamed_3671(this.cfr_renamed_112[sprpnd.cfr_renamed_3664(n2 - 3)], this.cfr_renamed_112[sprpnd.cfr_renamed_3664(n2 - 10)], sprpnd7.cfr_renamed_112[sprpnd.cfr_renamed_3664(n2 - 511)]);
            n = sprpnd6.cfr_renamed_3669(sprpnd6.cfr_renamed_112[sprpnd.cfr_renamed_3664(n2 - 12)]) ^ this.cfr_renamed_112[n2];
        }
        sprpnd2.cfr_renamed_0 = sprpnd.cfr_renamed_3670(this.cfr_renamed_0 + 1);
        return n;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprasy.cfr_renamed_9("\u001dkx\u0019g\u0010");
    }

    private /* synthetic */ int cfr_renamed_3671(int arg0, int arg1, int arg2) {
        return (sprpnd.cfr_renamed_494(arg0, 10) ^ sprpnd.cfr_renamed_494(arg2, 23)) + sprpnd.cfr_renamed_494(arg1, 8);
    }

    private /* synthetic */ void cfr_renamed_1314() {
        int n;
        if (this.cfr_renamed_4.length != 16) {
            throw new IllegalArgumentException(sprqas.cfr_renamed_9("(*\u0019b\u0017'\u0005b\u00117\u000f6\\ \u0019bMpDb\u001e+\b1\\.\u0013,\u001b"));
        }
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_0 = 0;
        int[] nArray = new int[1280];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n >> 2;
            int n4 = nArray[n3] | (this.cfr_renamed_4[n] & 0xFF) << 8 * (n & 3);
            nArray[n3] = n4;
            n2 = ++n;
        }
        System.arraycopy(nArray, 0, nArray, 4, 4);
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91.length && n < 16) {
            int n6 = (n >> 2) + 8;
            int n7 = nArray[n6] | (this.cfr_renamed_91[n] & 0xFF) << 8 * (n & 3);
            nArray[n6] = n7;
            n5 = ++n;
        }
        System.arraycopy(nArray, 8, nArray, 12, 4);
        int n8 = n = 16;
        while (n8 < 1280) {
            int n9 = n;
            int n10 = sprpnd.cfr_renamed_3668(nArray[n9 - 2]) + nArray[n - 7] + sprpnd.cfr_renamed_3666(nArray[n - 15]) + nArray[n - 16] + n;
            nArray[n9] = n10;
            n8 = ++n;
        }
        System.arraycopy(nArray, 256, this.cfr_renamed_1, 0, 512);
        System.arraycopy(nArray, 768, this.cfr_renamed_112, 0, 512);
        int n11 = n = 0;
        while (n11 < 512) {
            this.cfr_renamed_1[n++] = this.cfr_renamed_3663();
            n11 = n;
        }
        int n12 = n = 0;
        while (n12 < 512) {
            this.cfr_renamed_112[n++] = this.cfr_renamed_3663();
            n12 = n;
        }
        this.cfr_renamed_0 = 0;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        sprt sprt2;
        sprt sprt3 = arg1;
        if (sprt3 instanceof sprnjd) {
            this.cfr_renamed_91 = ((sprnjd)arg1).cfr_renamed_1205();
            sprt2 = sprt3 = ((sprnjd)arg1).cfr_renamed_284();
        } else {
            this.cfr_renamed_91 = new byte[0];
            sprt2 = sprt3;
        }
        if (!(sprt2 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprasy.cfr_renamed_9("a;^4D<LuX4Z4E0\\0ZuX4[&M1\b!Gu`\u0016\u0019g\u0010uA;A!\bx\b")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_4 = ((sprnld)sprt3).cfr_renamed_1521();
        this.cfr_renamed_1314();
        this.cfr_renamed_119 = true;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1314();
    }
}

