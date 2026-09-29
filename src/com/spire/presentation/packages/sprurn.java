/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprurn {
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public static int cfr_renamed_5644(String arg0) {
        if ("Horizontal".equals(arg0)) {
            return 0;
        }
        if ("Vertical".equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprknf.cfr_renamed_9("a\u0015_\u0015[\fZ[}\u0016U\u001cQ=U\u001fQ?]\tQ\u0018@\u0012[\u0015\u0014\u0015U\u0016QU"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return "Horizontal";
            }
            case 1: {
                return "Vertical";
            }
        }
        return sprmzo.cfr_renamed_9("a\u0016_\u0016[\u000fZX}\u0015U\u001fQ>U\u001cQ<]\nQ\u001b@\u0011[\u0016\u0014\u000eU\u0014A\u001d\u001a");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "Horizontal";
            }
            case 1: {
                return "Vertical";
            }
        }
        return sprknf.cfr_renamed_9(".Z\u0010Z\u0014C\u0015\u00142Y\u001aS\u001er\u001aP\u001ep\u0012F\u001eW\u000f]\u0014Z[B\u001aX\u000eQU");
    }

    private /* synthetic */ sprurn() {
    }
}

