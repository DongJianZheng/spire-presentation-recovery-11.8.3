/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprlhs;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class spruoo {
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 5;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgtb.cfr_renamed_9("P\u0015o\u0013g");
            }
            case 1: {
                return sprlhs.cfr_renamed_9("1\t\r\u000b\u0011");
            }
            case 2: {
                return sprgtb.cfr_renamed_9(".f\u0002w\u000fq\u001fg");
            }
            case 3: {
                return sprlhs.cfr_renamed_9("8\u0018\u001c\u0011/\u000b\t\u001d\u0001\u001c\u0006\r");
            }
            case 4: {
                return sprgtb.cfr_renamed_9("6j\u0014f\u001bq=q\u001bg\u0013f\u0014w");
            }
        }
        return sprlhs.cfr_renamed_9(",\u0006\u0012\u0006\u0016\u001f\u0017H>\f\u0010*\u000b\u001d\n\u0000-\u0011\t\rY\u001e\u0018\u0004\f\rW");
    }

    private /* synthetic */ spruoo() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprgtb.cfr_renamed_9("P\u0015o\u0013g").equals(arg0)) {
            return 0;
        }
        if (sprlhs.cfr_renamed_9("1\t\r\u000b\u0011").equals(arg0)) {
            return 1;
        }
        if (sprgtb.cfr_renamed_9(".f\u0002w\u000fq\u001fg").equals(arg0)) {
            return 2;
        }
        if (sprlhs.cfr_renamed_9("8\u0018\u001c\u0011/\u000b\t\u001d\u0001\u001c\u0006\r").equals(arg0)) {
            return 3;
        }
        if (sprgtb.cfr_renamed_9("6j\u0014f\u001bq=q\u001bg\u0013f\u0014w").equals(arg0)) {
            return 4;
        }
        throw new IllegalArgumentException(sprlhs.cfr_renamed_9("=\u0017\u0003\u0017\u0007\u000e\u0006Y/\u001d\u0001;\u001a\f\u001b\u0011<\u0000\u0018\u001cH\u0017\t\u0014\rW"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgtb.cfr_renamed_9("P\u0015o\u0013g");
            }
            case 1: {
                return sprlhs.cfr_renamed_9("1\t\r\u000b\u0011");
            }
            case 2: {
                return sprgtb.cfr_renamed_9(".f\u0002w\u000fq\u001fg");
            }
            case 3: {
                return sprlhs.cfr_renamed_9("8\u0018\u001c\u0011/\u000b\t\u001d\u0001\u001c\u0006\r");
            }
            case 4: {
                return sprgtb.cfr_renamed_9("6j\u0014f\u001bq=q\u001bg\u0013f\u0014w");
            }
        }
        return sprlhs.cfr_renamed_9(",\u0006\u0012\u0006\u0016\u001f\u0017H>\f\u0010*\u000b\u001d\n\u0000-\u0011\t\rY\u001e\u0018\u0004\f\rW");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 3 ^ 5;
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

