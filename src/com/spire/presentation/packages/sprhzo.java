/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spropca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkfa;

@sprtea
public final class sprhzo {
    public static final int cfr_renamed_152 = 2;
    public static final int cfr_renamed_112 = 4;
    public static final int cfr_renamed_119 = 6;
    public static final int cfr_renamed_91 = 7;
    public static final int cfr_renamed_0 = 5;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 8;
    public static final int cfr_renamed_4 = 3;

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

    public static int cfr_renamed_5644(String arg0) {
        if (sprtkfa.cfr_renamed_9("<k\u001ca").equals(arg0)) {
            return 0;
        }
        if (spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<@").equals(arg0)) {
            return 1;
        }
        if (sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00156").equals(arg0)) {
            return 2;
        }
        if (spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<B").equals(arg0)) {
            return 3;
        }
        if (sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00150").equals(arg0)) {
            return 4;
        }
        if (spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<D").equals(arg0)) {
            return 5;
        }
        if (sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00152").equals(arg0)) {
            return 6;
        }
        if (spropca.cfr_renamed_9("\u0019\u001d4\u00120 .\u001e/\u0014").equals(arg0)) {
            return 7;
        }
        throw new IllegalArgumentException(sprtkfa.cfr_renamed_9("'j\u0019j\u001ds\u001c$?e\u0000`\u001ds\u001cT\u0013v\u0013c\u0000e\u0002l&}\u0002aRj\u0013i\u0017*"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return spropca.cfr_renamed_9("\u0015\u001e5\u0014");
            }
            case 1: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00155");
            }
            case 2: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<C");
            }
            case 3: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00157");
            }
            case 4: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<E");
            }
            case 5: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00151");
            }
            case 6: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<G");
            }
            case 7: {
                return sprtkfa.cfr_renamed_9("0h\u001dg\u0019U\u0007k\u0006a");
            }
        }
        return spropca.cfr_renamed_9("$5\u001a5\u001e,\u001f{<:\u0003?\u001e,\u001f\u000b\u0010)\u0010<\u0003:\u00013%\"\u0001>Q-\u00107\u0004>_");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprtkfa.cfr_renamed_9("<k\u001ca");
            }
            case 1: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<@");
            }
            case 2: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00156");
            }
            case 3: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<B");
            }
            case 4: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00150");
            }
            case 5: {
                return spropca.cfr_renamed_9("\u0013\u0014:\u00152\u001f<D");
            }
            case 6: {
                return sprtkfa.cfr_renamed_9(":a\u0013`\u001bj\u00152");
            }
            case 7: {
                return spropca.cfr_renamed_9("\u0019\u001d4\u00120 .\u001e/\u0014");
            }
        }
        return sprtkfa.cfr_renamed_9("Q\u001co\u001ck\u0005jRI\u0013v\u0016k\u0005j\"e\u0000e\u0015v\u0013t\u001aP\u000bt\u0017$\u0004e\u001eq\u0017*");
    }

    private /* synthetic */ sprhzo() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

