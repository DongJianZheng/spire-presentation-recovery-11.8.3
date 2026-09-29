/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprbho {
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = 3 << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ (2 ^ 5);
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
                return sprqbb.cfr_renamed_9("+b\u0006~\u001cl\u0006y)a\u0018e\t");
            }
            case 1: {
                return sprjej.cfr_renamed_9("\fi<Z3k7z");
            }
        }
        return sprqbb.cfr_renamed_9("=c\u0003c\u0007z\u0006--`\u001aL\u0004}\u0000l*a\rc\fL\u0004}\u0000l.b\u001a`\tyH{\ta\u001dhF");
    }

    private /* synthetic */ sprbho() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprjej.cfr_renamed_9("X0u,o>u+Z3k7z").equals(arg0)) {
            return 0;
        }
        if (sprqbb.cfr_renamed_9("^\u001an)a\u0018e\t").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprjej.cfr_renamed_9("\nu4u0l1;\u001av-Z3k7z\u001dw:u;Z3k7z\u0019t-v>o\u007fu>v:5"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprqbb.cfr_renamed_9("+b\u0006~\u001cl\u0006y)a\u0018e\t");
            }
            case 1: {
                return sprjej.cfr_renamed_9("\fi<Z3k7z");
            }
        }
        return sprqbb.cfr_renamed_9("=c\u0003c\u0007z\u0006--`\u001aL\u0004}\u0000l*a\rc\fL\u0004}\u0000l.b\u001a`\tyH{\ta\u001dhF");
    }
}

