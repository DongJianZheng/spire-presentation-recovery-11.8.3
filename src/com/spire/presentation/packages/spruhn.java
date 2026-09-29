/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxad;
import com.spire.presentation.packages.sprxpo;

@sprtea
public final class spruhn {
    public static final int cfr_renamed_91 = 3;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 5;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 0;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprxad.cfr_renamed_9("\u001b-\u0005").equals(arg0)) {
            return 0;
        }
        if (sprxpo.cfr_renamed_9("\u0005\u001f\u001b").equals(arg0)) {
            return 1;
        }
        if (sprxad.cfr_renamed_9("\u0003-\u0015").equals(arg0)) {
            return 2;
        }
        if (sprxpo.cfr_renamed_9("\u0015\u001f\u0003").equals(arg0)) {
            return 3;
        }
        if ("Default".equals(arg0)) {
            return 0;
        }
        throw new IllegalArgumentException(sprxad.cfr_renamed_9("\u0002\u0017<\u00178\u000e9Y\u0013\u0010%\u001c4\r>\u00169Y9\u0018:\u001cy"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprxpo.cfr_renamed_9("\u001b\u001f\u0005k+k\u0013.1*\"'#");
            }
            case 1: {
                return sprxad.cfr_renamed_9("\u0005-\u001b");
            }
            case 2: {
                return sprxpo.cfr_renamed_9("\u0003\u001f\u0015");
            }
            case 3: {
                return sprxad.cfr_renamed_9("\u0015-\u0003");
            }
        }
        return sprxpo.cfr_renamed_9("\u001e9 9$ %w\u000f>92(#\"8%w=6'\".y");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprxad.cfr_renamed_9("\u001b-\u0005Y+Y\u0013\u001c1\u0018\"\u0015#");
            }
            case 1: {
                return sprxpo.cfr_renamed_9("\u0005\u001f\u001b");
            }
            case 2: {
                return sprxad.cfr_renamed_9("\u0003-\u0015");
            }
            case 3: {
                return sprxpo.cfr_renamed_9("\u0015\u001f\u0003");
            }
        }
        return sprxad.cfr_renamed_9(",9\u00129\u0016 \u0017w=>\u000b2\u001a#\u00108\u0017w\u000f6\u0015\"\u001cy");
    }

    private /* synthetic */ spruhn() {
    }
}

