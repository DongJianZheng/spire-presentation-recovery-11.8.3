/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprjpl;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprmip {
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprbrz.cfr_renamed_9("h\rU\u001fh\tI\u0005]");
            }
            case 1: {
                return sprjpl.cfr_renamed_9("\u0000h!d5");
            }
            case 2: {
                return sprbrz.cfr_renamed_9("v\u0003U\u0003H\u001cZ\u000f^");
            }
            case 3: {
                return sprjpl.cfr_renamed_9("\u0010l>o!d2");
            }
        }
        return sprbrz.cfr_renamed_9("n\u0002P\u0002T\u001bUL}\u0003U\u0018o\u0015K\t]\rX\t\u001b\u001aZ\u0000N\t\u0015");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprjpl.cfr_renamed_9("\u0000l=~\u0000h!d5").equals(arg0)) {
            return 0;
        }
        if (sprbrz.cfr_renamed_9("h\tI\u0005]").equals(arg0)) {
            return 1;
        }
        if (sprjpl.cfr_renamed_9("\u001eb=b }2n6").equals(arg0)) {
            return 2;
        }
        if (sprbrz.cfr_renamed_9("x\rV\u000eI\u0005Z").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(sprjpl.cfr_renamed_9("X=f=b$csK<c'Y*}6k2n6-=l>h}"));
    }

    private /* synthetic */ sprmip() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprbrz.cfr_renamed_9("h\rU\u001fh\tI\u0005]");
            }
            case 1: {
                return sprjpl.cfr_renamed_9("\u0000h!d5");
            }
            case 2: {
                return sprbrz.cfr_renamed_9("v\u0003U\u0003H\u001cZ\u000f^");
            }
            case 3: {
                return sprjpl.cfr_renamed_9("\u0010l>o!d2");
            }
        }
        return sprbrz.cfr_renamed_9("n\u0002P\u0002T\u001bUL}\u0003U\u0018o\u0015K\t]\rX\t\u001b\u001aZ\u0000N\t\u0015");
    }
}

