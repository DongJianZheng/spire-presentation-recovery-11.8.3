/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import java.math.BigInteger;

public class sprqjm {
    public int cfr_renamed_11112(sprlsh arg0) {
        return (arg0.cfr_renamed_1938() + 7) / 8;
    }

    public byte[] cfr_renamed_2500(BigInteger arg0, int arg1) {
        byte[] byArray = arg0.toByteArray();
        if (arg1 < byArray.length) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, byArray.length - byArray2.length, byArray2, 0, byArray2.length);
            return byArray2;
        }
        if (arg1 > byArray.length) {
            byte[] byArray3 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray3, byArray3.length - byArray.length, byArray.length);
            return byArray3;
        }
        return byArray;
    }

    public int cfr_renamed_9157(sprgxh arg0) {
        return (arg0.cfr_renamed_1938() + 7) / 8;
    }
}

