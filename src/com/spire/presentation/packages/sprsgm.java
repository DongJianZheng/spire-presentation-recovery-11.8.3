/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcu;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sprrfi;
import com.spire.presentation.packages.sprycm;

public class sprsgm
implements sprcu {
    private /* synthetic */ sprsgm() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int cfr_renamed_7912(int arg0) {
        switch (arg0) {
            case 1: 
            case 2: 
            case 3: {
                return 16;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprokk.cfr_renamed_9("N\u0004q\u000bk\u0003cJF/F.'\u000bk\rh\u0018n\u001eo\u0007'\u001ef\r=J")).append(arg0).toString());
    }

    public static byte[][] cfr_renamed_11110(byte[] arg0, int arg1, int arg2) {
        int n = sprycm.cfr_renamed_7909(arg1);
        int n2 = sprsgm.cfr_renamed_7910(arg2);
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n2];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        System.arraycopy(arg0, byArray.length, byArray2, 0, n2 - 8);
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        return byArrayArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int cfr_renamed_7910(int arg0) {
        switch (arg0) {
            case 1: {
                return 16;
            }
            case 2: {
                return 15;
            }
            case 3: {
                return 12;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrfi.cfr_renamed_9("\\|csy{q2TWTV5syuz`|f}\u007f5ftu/2")).append(arg0).toString());
    }
}

