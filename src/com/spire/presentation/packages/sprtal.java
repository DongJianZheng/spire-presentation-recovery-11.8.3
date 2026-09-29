/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprniaa;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprtal
implements sprmr {
    private static final int cfr_renamed_86 = 32;
    private boolean cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private boolean cfr_renamed_91 = false;
    private static final int cfr_renamed_0 = -1640531527;
    private static final int cfr_renamed_1 = 8;
    private static final int cfr_renamed_2 = -957401312;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprtal sprtal2 = this;
        int n4 = sprtal2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprtal2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = 0;
        int n7 = n3 = 0;
        while (n7 != 32) {
            n5 += ((n4 += (n5 << 4) + this.cfr_renamed_4 ^ n5 + (n6 -= 1640531527) ^ (n5 >>> 5) + this.cfr_renamed_3) << 4) + this.cfr_renamed_119 ^ n4 + n6 ^ (n4 >>> 5) + this.cfr_renamed_112;
            n7 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprniaa.cfr_renamed_9("\u000bsDi\u000btEt_tJqBnNy")).toString());
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprpsd.cfr_renamed_9("1\\(G,\u0012:G>T=@xF7]xA0]*F"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(sprniaa.cfr_renamed_9("r^i[h_=IhM{No\u000biDr\u000bnCrYi"));
        }
        if (this.cfr_renamed_152) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprtal sprtal2 = this;
        int n4 = sprtal2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprtal2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = -957401312;
        int n7 = n3 = 0;
        while (n7 != 32) {
            n4 -= ((n5 -= (n4 << 4) + this.cfr_renamed_119 ^ n4 + n6 ^ (n4 >>> 5) + this.cfr_renamed_112) << 4) + this.cfr_renamed_4 ^ n5 + n6 ^ (n5 >>> 5) + this.cfr_renamed_3;
            n6 += 1640531527;
            n7 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpsd.cfr_renamed_9("[6D9^1VxB9@9_=F=@xB9A+W<\u0012,]xf\u001dsx[6[,\u0012u\u0012")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_91 = true;
        sprtpk sprtpk2 = (sprtpk)arg1;
        this.cfr_renamed_2402(sprtpk2.cfr_renamed_1521());
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    private /* synthetic */ int cfr_renamed_3538(byte[] arg0, int arg1) {
        return arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        if (arg0.length != 16) {
            throw new IllegalArgumentException(sprniaa.cfr_renamed_9("`xR=XtQx\u000bp^n_=Ix\u000b,\u0019%\u000b\u007fBiX3"));
        }
        this.cfr_renamed_4 = this.cfr_renamed_3538(arg0, 0);
        this.cfr_renamed_3 = this.cfr_renamed_3538(arg0, 4);
        this.cfr_renamed_119 = this.cfr_renamed_3538(arg0, 8);
        this.cfr_renamed_112 = this.cfr_renamed_3538(arg0, 12);
    }

    private /* synthetic */ void cfr_renamed_3539(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpsd.cfr_renamed_9("f\u001ds");
    }
}

