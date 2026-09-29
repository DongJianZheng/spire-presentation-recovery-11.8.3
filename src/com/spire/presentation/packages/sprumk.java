/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwj;

public class sprumk {
    public static byte[] cfr_renamed_9951(sprwj arg0, int arg1) {
        int n;
        byte[] byArray = new byte[arg1];
        if (arg1 * 8 <= arg0.cfr_renamed_3225()) {
            byte[] byArray2 = arg0.cfr_renamed_3300();
            System.arraycopy(byArray2, 0, byArray, 0, byArray.length);
            return byArray;
        }
        int n2 = arg0.cfr_renamed_3225() / 8;
        int n3 = n = 0;
        while (n3 < byArray.length) {
            int n4;
            byte[] byArray3 = arg0.cfr_renamed_3300();
            if (byArray3.length <= byArray.length - n) {
                System.arraycopy(byArray3, 0, byArray, n, byArray3.length);
                n4 = n;
            } else {
                System.arraycopy(byArray3, 0, byArray, n, byArray.length - n);
                n4 = n;
            }
            n3 = n4 + n2;
        }
        return byArray;
    }
}

