/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprigk;
import com.spire.presentation.packages.sprqzz;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprsnn {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprqzz.cfr_renamed_9("94\u0003");
            }
            case 1: {
                return sprigk.cfr_renamed_9("P\u001ay\u0015|\u0019R\u001dk\u0014");
            }
            case 2: {
                return sprqzz.cfr_renamed_9("+4\u0003");
            }
        }
        return sprigk.cfr_renamed_9(")q\u0017q\u0013h\u0012?0p\u001bv\u001f~\u0010L\bm\t|\bj\u000ez:v\u001bj\u000ez(f\fz\\i\u001ds\tzR");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprqzz.cfr_renamed_9("94\u0003").equals(arg0)) {
            return 0;
        }
        if (sprigk.cfr_renamed_9("P\u001ay\u0015|\u0019R\u001dk\u0014").equals(arg0)) {
            return 1;
        }
        if (sprqzz.cfr_renamed_9("+4\u0003").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprigk.cfr_renamed_9("J\u0012t\u0012p\u000bq\\S\u0013x\u0015|\u001ds/k\u000ej\u001fk\tm\u0019Y\u0015x\tm\u0019K\u0005o\u0019?\u0012~\u0011zR"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprqzz.cfr_renamed_9("94\u0003");
            }
            case 1: {
                return sprigk.cfr_renamed_9("P\u001ay\u0015|\u0019R\u001dk\u0014");
            }
            case 2: {
                return sprqzz.cfr_renamed_9("+4\u0003");
            }
        }
        return sprigk.cfr_renamed_9(")q\u0017q\u0013h\u0012?0p\u001bv\u001f~\u0010L\bm\t|\bj\u000ez:v\u001bj\u000ez(f\fz\\i\u001ds\tzR");
    }

    private /* synthetic */ sprsnn() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ 4 << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
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

