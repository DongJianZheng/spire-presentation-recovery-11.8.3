/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwq;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprsun {
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprcwq.cfr_renamed_9("\n\u001d0\u00158\u001d(\u0013.");
            }
            case 1: {
                return sprqad.cfr_renamed_9("p\u0015K\t");
            }
        }
        return sprcwq.cfr_renamed_9("\t\u00127\u00123\u000b2\\\f\u0018:*=\u00105\u0018=\b3\u000e\b\u0005,\u0019|\n=\u0010)\u0019r");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprqad.cfr_renamed_9("1E\u000bM\u0003E\u0013K\u0015");
            }
            case 1: {
                return sprcwq.cfr_renamed_9("(.\u00132");
            }
        }
        return sprqad.cfr_renamed_9("2J\fJ\bS\t\u00047@\u0001r\u0006H\u000e@\u0006P\bV3]\u0017AGR\u0006H\u0012AI");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprcwq.cfr_renamed_9("\n\u001d0\u00158\u001d(\u0013.").equals(arg0)) {
            return 0;
        }
        if (sprqad.cfr_renamed_9("p\u0015K\t").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprcwq.cfr_renamed_9(")2\u00172\u0013+\u0012|,8\u001a\n\u001d0\u00158\u001d(\u0013.(%\f9\\2\u001d1\u0019r"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 4 ^ 4 << 1;
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

    private /* synthetic */ sprsun() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }
}

