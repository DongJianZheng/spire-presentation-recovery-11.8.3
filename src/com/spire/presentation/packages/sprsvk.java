/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprvsl;

public class sprsvk
extends sprjyk {
    private static final byte cfr_renamed_3 = 15;
    private static final byte cfr_renamed_4 = -4;

    public static void cfr_renamed_3255(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprvsl.cfr_renamed_9("\u007f\u0000C\u0016\u001e\\\u001fZ\u000f\u0004J\u0016\u000f\u0002Z\u001c[OM\n\u000f]\u001aY\u000f\rF\u001b\\A"));
        }
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        byte[] byArray3 = arg0;
        byte[] byArray4 = arg0;
        byte[] byArray5 = arg0;
        byte[] byArray6 = arg0;
        byArray5[3] = (byte)(byArray5[3] & 0xF);
        byArray6[7] = (byte)(byArray6[7] & 0xF);
        byArray3[11] = (byte)(byArray3[11] & 0xF);
        byArray4[15] = (byte)(byArray4[15] & 0xF);
        byArray[4] = (byte)(byArray[4] & 0xFFFFFFFC);
        byArray2[8] = (byte)(byArray2[8] & 0xFFFFFFFC);
        arg0[12] = (byte)(arg0[12] & 0xFFFFFFFC);
    }

    private static /* synthetic */ void cfr_renamed_3503(byte arg0, byte arg1) {
        if ((arg0 & ~arg1) != 0) {
            throw new IllegalArgumentException(sprqnl.cfr_renamed_9("\u0001W>X$P,\u0019.V:T)Mh_'KhKhI'K<P'WhV.\u0019\u0018V$@y\nx\fhR-@f"));
        }
    }

    public static void cfr_renamed_3472(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprvsl.cfr_renamed_9("\u007f\u0000C\u0016\u001e\\\u001fZ\u000f\u0004J\u0016\u000f\u0002Z\u001c[OM\n\u000f]\u001aY\u000f\rF\u001b\\A"));
        }
        sprsvk.cfr_renamed_3503(arg0[3], (byte)15);
        sprsvk.cfr_renamed_3503(arg0[7], (byte)15);
        sprsvk.cfr_renamed_3503(arg0[11], (byte)15);
        sprsvk.cfr_renamed_3503(arg0[15], (byte)15);
        sprsvk.cfr_renamed_3503(arg0[4], (byte)-4);
        sprsvk.cfr_renamed_3503(arg0[8], (byte)-4);
        sprsvk.cfr_renamed_3503(arg0[12], (byte)-4);
    }

    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = super.cfr_renamed_2405();
        sprsvk.cfr_renamed_3255(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        super.cfr_renamed_5536(new sprgye(arg0.cfr_renamed_1295(), 256));
    }
}

