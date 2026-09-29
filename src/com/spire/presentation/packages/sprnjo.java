/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxm;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprnjo {
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprkto.cfr_renamed_9("\u0016\u0001\b\u0006\u0018\u0010\u0019\u0011\u0012\u0017\u0014\t\u0018\u0006\u001c\u0012\u001e\u0016\u0012");
            }
            case 2: {
                return sprcxm.cfr_renamed_9("c\u001d}\u001an\u0016a\u0012u\u0010q\u001c");
            }
        }
        return sprkto.cfr_renamed_9("\u00109.9* +w\u0000:#\u001674\u0001>72&#,8+w36)\" y");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprcxm.cfr_renamed_9("\u0018f\u0006a\u0016w\u0017v\u001cp\u001an\u0016a\u0012u\u0010q\u001c");
            }
            case 2: {
                return sprkto.cfr_renamed_9("\u0004\u0013\u001a\u0014\t\u0018\u0006\u001c\u0012\u001e\u0016\u0012");
            }
        }
        return sprcxm.cfr_renamed_9("w7I7M.Lyg4D\u0018P:f0P<A-K6LyT8N,Gw");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 1;
        nArray[1] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprkto.cfr_renamed_9("\u0016\u0001\b\u0006\u0018\u0010\u0019\u0011\u0012\u0017\u0014\t\u0018\u0006\u001c\u0012\u001e\u0016\u0012").equals(arg0)) {
            return 1;
        }
        if (sprcxm.cfr_renamed_9("c\u001d}\u001an\u0016a\u0012u\u0010q\u001c").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprkto.cfr_renamed_9("\u0002+<+829e\u0012(1\u0004%&\u0013,% 41>*9e9$: y"));
    }

    private /* synthetic */ sprnjo() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 5 << 3 ^ 5;
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
}

