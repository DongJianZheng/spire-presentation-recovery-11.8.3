/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsjg;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprywe;

@sprtea
public final class spreym {
    public static final int cfr_renamed_1 = 1952;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 1950;
    public static final int cfr_renamed_4 = 1951;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1950: {
                return sprsjg.cfr_renamed_9("9^*P");
            }
            case 1951: {
                return sprywe.cfr_renamed_9("\u0017\u001c\u0015\u0015\u0012\r\u0016");
            }
            case 1952: {
                return sprsjg.cfr_renamed_9("$H*B");
            }
        }
        return sprywe.cfr_renamed_9("\u0006787<.=y\t5:;\u0000-!<24\u001552/<+s/25&<}");
    }

    private /* synthetic */ spreym() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 1950;
        nArray[1] = 1951;
        nArray[2] = 1952;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = 1 << 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public static int cfr_renamed_5644(String arg0) {
        if (sprsjg.cfr_renamed_9("9^*P").equals(arg0)) {
            return 1950;
        }
        if (sprywe.cfr_renamed_9("\u0017\u001c\u0015\u0015\u0012\r\u0016").equals(arg0)) {
            return 1951;
        }
        if (sprsjg.cfr_renamed_9("$H*B").equals(arg0)) {
            return 1952;
        }
        throw new IllegalArgumentException(sprywe.cfr_renamed_9("\f=2=6$7s\u0003?01\n'+68>\u001f?8%6!y=8><}"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1950: {
                return sprsjg.cfr_renamed_9("9^*P");
            }
            case 1951: {
                return sprywe.cfr_renamed_9("\u0017\u001c\u0015\u0015\u0012\r\u0016");
            }
            case 1952: {
                return sprsjg.cfr_renamed_9("$H*B");
            }
        }
        return sprywe.cfr_renamed_9("\u0006787<.=y\t5:;\u0000-!<24\u001552/<+s/25&<}");
    }
}

