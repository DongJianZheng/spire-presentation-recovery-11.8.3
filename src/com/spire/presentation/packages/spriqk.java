/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprybl;

public class spriqk
implements sprmr {
    private int[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 32;
    private int[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 8;
    private boolean cfr_renamed_1;
    private int[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private static final int cfr_renamed_4 = -1640531527;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        spriqk spriqk2 = this;
        int n4 = spriqk2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = spriqk2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = n3 = 0;
        while (n6 < 32) {
            int n7 = this.cfr_renamed_91[n3];
            n5 += ((n4 += (n5 << 4 ^ n5 >>> 5) + n5 ^ this.cfr_renamed_112[n3]) << 4 ^ n4 >>> 5) + n4 ^ n7;
            n6 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprwtf.cfr_renamed_9("\u0001i\u001c|");
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
    public int cfr_renamed_1195() {
        return 8;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spronq.cfr_renamed_9("\\uCzYrQ;EzGzX~A~G;EzFhP\u007f\u0015oZ;a^t;\\u\\o\u00156\u0015")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_3 = true;
        sprtpk sprtpk2 = (sprtpk)arg1;
        this.cfr_renamed_2402(sprtpk2.cfr_renamed_1521());
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    public spriqk() {
        spriqk spriqk2 = this;
        spriqk spriqk3 = this;
        spriqk3.cfr_renamed_2 = new int[4];
        spriqk3.cfr_renamed_112 = new int[32];
        spriqk2.cfr_renamed_91 = new int[32];
        spriqk2.cfr_renamed_3 = false;
    }

    private /* synthetic */ int cfr_renamed_3538(byte[] arg0, int arg1) {
        return arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
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
        spriqk spriqk2 = this;
        int n4 = spriqk2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = spriqk2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = n3 = 31;
        while (n6 >= 0) {
            int n7 = this.cfr_renamed_112[n3];
            n4 -= ((n5 -= (n4 << 4 ^ n4 >>> 5) + n4 ^ this.cfr_renamed_91[n3]) << 4 ^ n5 >>> 5) + n5 ^ n7;
            n6 = --n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        if (arg0.length != 16) {
            throw new IllegalArgumentException(sprwtf.cfr_renamed_9("\u0012X \u001d*T#XyP,N-\u001d;Xy\fk\u0005y_0I*\u0013"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            this.cfr_renamed_2[n++] = this.cfr_renamed_3538(arg0, n2);
            n2 += 4;
            n3 = n;
        }
        n2 = 0;
        int n4 = n = 0;
        while (n4 < 32) {
            spriqk spriqk2 = this;
            int n5 = n2;
            spriqk2.cfr_renamed_112[n] = n5 + this.cfr_renamed_2[n5 & 3];
            int n6 = n2 -= 1640531527;
            spriqk2.cfr_renamed_91[n++] = n6 + this.cfr_renamed_2[n6 >>> 11 & 3];
            n4 = n;
        }
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spronq.cfr_renamed_9(";[tA;\\u\\o\\zYrF~Q")).toString());
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprwtf.cfr_renamed_9("0S)H-\u001d;H?[<OyI6RyN1R+I"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(spronq.cfr_renamed_9("ZnAk@o\u0015y@}S~G;AtZ;FsZiA"));
        }
        if (this.cfr_renamed_1) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }
}

