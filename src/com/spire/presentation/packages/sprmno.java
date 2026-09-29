/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvnj;

@sprtea
public final class sprmno {
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprvnj.cfr_renamed_9("naXeMxhiXixq\\m|aTm@").equals(arg0)) {
            return 0;
        }
        if (sprjmo.cfr_renamed_9("HG~Ck^NO~O^WzKIAg^xKy]oJ").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprvnj.cfr_renamed_9("yfGfC\u007fB(ieJX@}_JE|Ai\\LM|M\\UxI(BiAm\u0002"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 3 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprmno() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprjmo.cfr_renamed_9("lcZgOzjkZkzs^o~cVoB");
            }
            case 1: {
                return sprvnj.cfr_renamed_9("JE|Ai\\LM|M\\UxIKCe\\zI{_mH");
            }
        }
        return sprjmo.cfr_renamed_9("_@a@eYd\u000eOCl~f[ylcZgOzjkZkzs^o\u000e|Of[o\u0000");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprvnj.cfr_renamed_9("naXeMxhiXixq\\m|aTm@");
            }
            case 1: {
                return sprjmo.cfr_renamed_9("HG~Ck^NO~O^WzKIAg^xKy]oJ");
            }
        }
        return sprvnj.cfr_renamed_9("]BcBg[f\fMAn|dY{naXeMxhiXixq\\m\f~MdYm\u0002");
    }
}

