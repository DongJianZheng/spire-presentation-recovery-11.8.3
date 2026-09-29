/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprciaa;
import com.spire.presentation.packages.sprnro;
import com.spire.presentation.packages.sprwed;

public class sprvld
extends sprwed {
    private static final byte cfr_renamed_3 = -4;
    private static final byte cfr_renamed_4 = 15;

    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = super.cfr_renamed_2405();
        sprvld.cfr_renamed_3255(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1222(sprccb sprccb2) {
        void arg0;
        super.cfr_renamed_1222(new sprccb(arg0.cfr_renamed_1295(), 256));
    }

    public static void cfr_renamed_3255(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprnro.cfr_renamed_9("x\u0004D\u0012\u0019X\u0018^\b\u0000M\u0012\b\u0006]\u0018\\KJ\u000e\bY\u001d]\b\tA\u001f[E"));
        }
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        byte[] byArray3 = arg0;
        byte[] byArray4 = arg0;
        byte[] byArray5 = arg0;
        byte[] byArray6 = arg0;
        byArray5[19] = (byte)(byArray5[19] & 0xF);
        byArray6[23] = (byte)(byArray6[23] & 0xF);
        byArray3[27] = (byte)(byArray3[27] & 0xF);
        byArray4[31] = (byte)(byArray4[31] & 0xF);
        byArray[20] = (byte)(byArray[20] & 0xFFFFFFFC);
        byArray2[24] = (byte)(byArray2[24] & 0xFFFFFFFC);
        arg0[28] = (byte)(arg0[28] & 0xFFFFFFFC);
    }

    public static void cfr_renamed_3472(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprciaa.cfr_renamed_9("0N\fXQ\u0012P\u0014@J\u0005X@L\u0015R\u0014\u0001\u0002D@\u0013U\u0017@C\tU\u0013\u000f"));
        }
        sprvld.cfr_renamed_3503(arg0[19], (byte)15);
        sprvld.cfr_renamed_3503(arg0[23], (byte)15);
        sprvld.cfr_renamed_3503(arg0[27], (byte)15);
        sprvld.cfr_renamed_3503(arg0[31], (byte)15);
        sprvld.cfr_renamed_3503(arg0[20], (byte)-4);
        sprvld.cfr_renamed_3503(arg0[24], (byte)-4);
        sprvld.cfr_renamed_3503(arg0[28], (byte)-4);
    }

    private static /* synthetic */ void cfr_renamed_3503(byte arg0, byte arg1) {
        if ((arg0 & ~arg1) != 0) {
            throw new IllegalArgumentException(sprnro.cfr_renamed_9("\"F\u001dI\u0007A\u000f\b\rG\u0019E\n\\KN\u0004ZKZKX\u0004Z\u001fA\u0004FKG\r\b;G\u0007QZ\u001b[\u001dKC\u000eQE"));
        }
    }
}

