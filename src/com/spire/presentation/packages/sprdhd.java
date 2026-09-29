/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprkep;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;

public class sprdhd
implements sprff {
    private boolean cfr_renamed_86 = false;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private static final int cfr_renamed_1 = -1640531527;
    private static final int cfr_renamed_2 = 32;
    private static final int cfr_renamed_3 = -957401312;
    private static final int cfr_renamed_4 = 8;

    private /* synthetic */ void cfr_renamed_3539(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
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
        sprdhd sprdhd2 = this;
        int n4 = sprdhd2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprdhd2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = -957401312;
        int n7 = n3 = 0;
        while (n7 != 32) {
            n4 -= ((n5 -= (n4 << 4) + this.cfr_renamed_112 ^ n4 + n6 ^ (n4 >>> 5) + this.cfr_renamed_119) << 4) + this.cfr_renamed_0 ^ n5 + n6 ^ (n5 >>> 5) + this.cfr_renamed_152;
            n6 += 1640531527;
            n7 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        if (arg0.length != 16) {
            throw new IllegalArgumentException(sprdfq.cfr_renamed_9("%t\u00171\u001dx\u0014tN|\u001bb\u001a1\ftN \\)Ns\u0007e\u001d?"));
        }
        this.cfr_renamed_0 = this.cfr_renamed_3538(arg0, 0);
        this.cfr_renamed_152 = this.cfr_renamed_3538(arg0, 4);
        this.cfr_renamed_112 = this.cfr_renamed_3538(arg0, 8);
        this.cfr_renamed_119 = this.cfr_renamed_3538(arg0, 12);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_86) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprkep.cfr_renamed_9("sc<ysd=d'd2a:~6i")).toString());
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprjkd(sprdfq.cfr_renamed_9("\u0007\u007f\u001ed\u001a1\fd\bw\u000bcNe\u0001~Nb\u0006~\u001ce"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new spreid(sprkep.cfr_renamed_9("b&y#x'-1x5k6\u007fsy<bs~;b!y"));
        }
        if (this.cfr_renamed_91) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    private /* synthetic */ int cfr_renamed_3538(byte[] arg0, int arg1) {
        return arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfq.cfr_renamed_9("x\u0000g\u000f}\u0007uNa\u000fc\u000f|\u000be\u000bcNa\u000fb\u001dt\n1\u001a~NE+PNx\u0000x\u001a1C1")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_86 = true;
        sprnld sprnld2 = (sprnld)arg1;
        this.cfr_renamed_2402(sprnld2.cfr_renamed_1521());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprdhd sprdhd2 = this;
        int n4 = sprdhd2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprdhd2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = 0;
        int n7 = n3 = 0;
        while (n7 != 32) {
            n5 += ((n4 += (n5 << 4) + this.cfr_renamed_0 ^ n5 + (n6 -= 1640531527) ^ (n5 >>> 5) + this.cfr_renamed_152) << 4) + this.cfr_renamed_112 ^ n4 + n6 ^ (n4 >>> 5) + this.cfr_renamed_119;
            n7 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprkep.cfr_renamed_9("Y\u0016L");
    }
}

