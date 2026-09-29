/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprjyy;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprugo {
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 0;

    private /* synthetic */ sprugo() {
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
                return sprctl.cfr_renamed_9("Y8h1");
            }
            case 1: {
                return sprjyy.cfr_renamed_9("\u0003=1");
            }
        }
        return sprctl.cfr_renamed_9("\u0002`<`8y9.\u0012v'a%z\u0011a9z\u0011a%c6z\u0014a%kwx6b\"ky");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprjyy.cfr_renamed_9("\u001e8/1");
            }
            case 1: {
                return sprctl.cfr_renamed_9("\u0003z1");
            }
        }
        return sprjyy.cfr_renamed_9("\u0002'<'8>9i\u00121'&%=\u0011&9=\u0011&%$6=\u0014&%,w?6%\",y");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprctl.cfr_renamed_9("Y8h1").equals(arg0)) {
            return 0;
        }
        if (sprjyy.cfr_renamed_9("\u0003=1").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprctl.cfr_renamed_9("[9e9a `wK/~8|#H8`#H8|:o#M8|2.9o:ky"));
    }
}

