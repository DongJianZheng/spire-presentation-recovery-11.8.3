/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprzgn {
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 0;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    private /* synthetic */ sprzgn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprcgo.cfr_renamed_9("B\u007fi~Au~\u007f");
            }
            case 1: {
                return sprjre.cfr_renamed_9("]'p(t\u000fp%z");
            }
            case 2: {
                return sprcgo.cfr_renamed_9("\\eteidIx{~ni~");
            }
            case 3: {
                return sprjre.cfr_renamed_9("\rv%v8w\u000fp%z");
            }
        }
        return sprcgo.cfr_renamed_9("Obqbu{t,X`uoq_nmni:z{`oi4");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprjre.cfr_renamed_9("\u0005z.{\u0006p9z").equals(arg0)) {
            return 0;
        }
        if (sprcgo.cfr_renamed_9("X`uoqHub\u007f").equals(arg0)) {
            return 1;
        }
        if (sprjre.cfr_renamed_9("Y\"q\"l#L?~9k.{").equals(arg0)) {
            return 2;
        }
        if (sprcgo.cfr_renamed_9("Jsbs\u007frHub\u007f").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(sprjre.cfr_renamed_9("\u001eq q$h%?\ts$| L?~?zkq*r.1"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ (2 ^ 5);
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
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprcgo.cfr_renamed_9("B\u007fi~Au~\u007f");
            }
            case 1: {
                return sprjre.cfr_renamed_9("]'p(t\u000fp%z");
            }
            case 2: {
                return sprcgo.cfr_renamed_9("\\eteidIx{~ni~");
            }
            case 3: {
                return sprjre.cfr_renamed_9("\rv%v8w\u000fp%z");
            }
        }
        return sprcgo.cfr_renamed_9("Obqbu{t,X`uoq_nmni:z{`oi4");
    }
}

