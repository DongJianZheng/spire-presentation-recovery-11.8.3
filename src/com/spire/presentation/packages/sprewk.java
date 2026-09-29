/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkbb;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpnja;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprwjl;

public abstract class sprewk {
    public boolean cfr_renamed_2;
    public spraxk cfr_renamed_3;
    public final sprmr cfr_renamed_4;

    public static byte[] cfr_renamed_10264(short[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length * 2];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprpxe.cfr_renamed_5179(arg0[n], byArray, n++ * 2);
            n2 = n;
        }
        return byArray;
    }

    public static short[] cfr_renamed_10265(byte[] arg0) {
        int n;
        if ((arg0.length & 1) != 0) {
            throw new IllegalArgumentException(sprpnja.cfr_renamed_9("&\u00036\u0003b\u000f7\u00116B \u0007b\u0003,B'\u0014'\fb\f7\u000f \u00070B-\u0004b\u0000;\u0016'\u0011b\u0004-\u0010b\u0003b\u0015+\u0006'B0\u0003&\u000b:"));
        }
        short[] sArray = new short[arg0.length / 2];
        int n2 = n = 0;
        while (n2 != sArray.length) {
            int n3 = n++;
            sArray[n3] = sprpxe.cfr_renamed_5172(arg0, n3 * 2);
            n2 = n;
        }
        return sArray;
    }

    public abstract int cfr_renamed_10263(byte[] var1, int var2, int var3, byte[] var4, int var5);

    public abstract void cfr_renamed_5535(boolean var1, sprbj var2);

    public abstract String cfr_renamed_1315();

    public int cfr_renamed_10267(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprkbb.cfr_renamed_9("h\"kRK\u001cI\u001b@\u0017\u000e\u001cA\u0006\u000e\u001b@\u001bZ\u001bO\u001eG\bK\u0016"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprpnja.cfr_renamed_9("+\f2\u00176B.\u0007,\u00056\nb\u0001#\f,\r6B \u0007b\f'\u0005#\u0016+\u0014'"));
        }
        if (arg0 == null || arg3 == null) {
            throw new NullPointerException(sprkbb.cfr_renamed_9("L\u0007H\u0014K\u0000\u000e\u0004O\u001e[\u0017\u000e\u001b]R@\u0007B\u001e"));
        }
        if (arg0.length < arg1 + arg2) {
            throw new sprddl(sprpnja.cfr_renamed_9("\u000b,\u00127\u0016b\u00007\u0004$\u00070B6\r-B1\n-\u00106"));
        }
        if (arg3.length < arg4 + arg2) {
            throw new sprwjl(sprkbb.cfr_renamed_9("\u001d[\u0006^\u0007ZRL\u0007H\u0014K\u0000\u000e\u0006A\u001d\u000e\u0001F\u001d\\\u0006"));
        }
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_10266(arg0, arg1, arg2, arg3, arg4);
        }
        return this.cfr_renamed_10263(arg0, arg1, arg2, arg3, arg4);
    }

    public sprewk(sprmr sprmr2) {
        this.cfr_renamed_4 = sprmr2;
    }

    public abstract int cfr_renamed_10266(byte[] var1, int var2, int var3, byte[] var4, int var5);
}

