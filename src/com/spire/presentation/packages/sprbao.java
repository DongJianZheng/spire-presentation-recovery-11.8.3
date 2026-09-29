/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujha;

@sprtea
public final class sprbao {
    public static final int cfr_renamed_152 = 2;
    public static final int cfr_renamed_112 = 7;
    public static final int cfr_renamed_119 = 6;
    public static final int cfr_renamed_91 = 5;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 8;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 3;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    private /* synthetic */ sprbao() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[8];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        nArray[7] = 7;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprboo.cfr_renamed_9("\u0000\u0017\"");
            }
            case 1: {
                return sprujha.cfr_renamed_9("P8b");
            }
            case 2: {
                return sprboo.cfr_renamed_9("(1\u001a\u0010");
            }
            case 3: {
                return sprujha.cfr_renamed_9("\u0017\u007f%@");
            }
            case 4: {
                return sprboo.cfr_renamed_9("(1\u001a\n");
            }
            case 5: {
                return sprujha.cfr_renamed_9("\u0017\u007f%T");
            }
            case 6: {
                return sprboo.cfr_renamed_9("\u001e\u0007,,0");
            }
            case 7: {
                return sprujha.cfr_renamed_9("P8b\u0013`");
            }
        }
        return sprboo.cfr_renamed_9(";6\u00056\u0001/\u0000x><\b\u001c\u000b+\u001a1\u00009\u001a1\u00016(1\u001a\f\u0017(\u000bx\u00189\u0002-\u000bv");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprujha.cfr_renamed_9("N(l").equals(arg0)) {
            return 0;
        }
        if (sprboo.cfr_renamed_9("\u001e\u0007,").equals(arg0)) {
            return 1;
        }
        if (sprujha.cfr_renamed_9("\u0017\u007f%^").equals(arg0)) {
            return 2;
        }
        if (sprboo.cfr_renamed_9("(1\u001a\u000e").equals(arg0)) {
            return 3;
        }
        if (sprujha.cfr_renamed_9("\u0017\u007f%D").equals(arg0)) {
            return 4;
        }
        if (sprboo.cfr_renamed_9("(1\u001a\u001a").equals(arg0)) {
            return 5;
        }
        if (sprujha.cfr_renamed_9("P8b\u0013~").equals(arg0)) {
            return 6;
        }
        if (sprboo.cfr_renamed_9("\u001e\u0007,,.").equals(arg0)) {
            return 7;
        }
        throw new IllegalArgumentException(sprujha.cfr_renamed_9("C?}?y&xqF5p\u0015s\"b8x0b8y?P8b\u0005o!sqx0{48"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprboo.cfr_renamed_9("\u0000\u0017\"");
            }
            case 1: {
                return sprujha.cfr_renamed_9("P8b");
            }
            case 2: {
                return sprboo.cfr_renamed_9("(1\u001a\u0010");
            }
            case 3: {
                return sprujha.cfr_renamed_9("\u0017\u007f%@");
            }
            case 4: {
                return sprboo.cfr_renamed_9("(1\u001a\n");
            }
            case 5: {
                return sprujha.cfr_renamed_9("\u0017\u007f%T");
            }
            case 6: {
                return sprboo.cfr_renamed_9("\u001e\u0007,,0");
            }
            case 7: {
                return sprujha.cfr_renamed_9("P8b\u0013`");
            }
        }
        return sprboo.cfr_renamed_9(";6\u00056\u0001/\u0000x><\b\u001c\u000b+\u001a1\u00009\u001a1\u00016(1\u001a\f\u0017(\u000bx\u00189\u0002-\u000bv");
    }
}

