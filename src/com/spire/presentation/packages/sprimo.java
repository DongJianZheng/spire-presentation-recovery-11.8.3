/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprimo {
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 4;

    private /* synthetic */ sprimo() {
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(DataColumn.cfr_renamed_9("1\u001d\u001d\u0002\u00177\u001b\u0016\u0007\u0003\u0017"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprsez.cfr_renamed_9(" \u000f\u0002\u00038\t"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(DataColumn.cfr_renamed_9("3\u0017\u000b\u001b\u0014\u0000%\u001d"));
        }
        if ((6 & arg0) == 6) {
            hashSet.add(sprsez.cfr_renamed_9("!\t\u001a\u00038\t"));
        }
        return hashSet;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprimo.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return DataColumn.cfr_renamed_9("1\u001d\u001d\u0002\u00177\u001b\u0016\u0007\u0003\u0017");
            }
            case 2: {
                return sprsez.cfr_renamed_9(" \u000f\u0002\u00038\t");
            }
            case 4: {
                return DataColumn.cfr_renamed_9("3\u0017\u000b\u001b\u0014\u0000%\u001d");
            }
            case 6: {
                return sprsez.cfr_renamed_9("!\t\u001a\u00038\t");
            }
        }
        return DataColumn.cfr_renamed_9("'\u001f\u0019\u001f\u001d\u0006\u001cQ5\u0015\u001b!\u001d\u001d\u000b!\u001d\u0018\u001c\u0005&\b\u0002\u0014R\u0007\u0013\u001d\u0007\u0014\\");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprsez.cfr_renamed_9("%\u0000\t\u001f\u0003*\u000f\u000b\u0013\u001e\u0003");
            }
            case 2: {
                return DataColumn.cfr_renamed_9("=\u001b\u001f\u0017%\u001d");
            }
            case 4: {
                return sprsez.cfr_renamed_9(".\u0003\u0016\u000f\t\u00148\t");
            }
            case 6: {
                return DataColumn.cfr_renamed_9("<\u001d\u0007\u0017%\u001d");
            }
        }
        return sprsez.cfr_renamed_9("3\u0002\r\u0002\t\u001b\bL!\b\u000f<\t\u0000\u001f<\t\u0005\b\u00182\u0015\u0016\tF\u001a\u0007\u0000\u0013\tH");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 6;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (DataColumn.cfr_renamed_9("1\u001d\u001d\u0002\u00177\u001b\u0016\u0007\u0003\u0017").equals(arg0)) {
            return 1;
        }
        if (sprsez.cfr_renamed_9(" \u000f\u0002\u00038\t").equals(arg0)) {
            return 2;
        }
        if (DataColumn.cfr_renamed_9("3\u0017\u000b\u001b\u0014\u0000%\u001d").equals(arg0)) {
            return 4;
        }
        if (sprsez.cfr_renamed_9("!\t\u001a\u00038\t").equals(arg0)) {
            return 6;
        }
        throw new IllegalArgumentException(DataColumn.cfr_renamed_9("$\u001c\u001a\u001c\u001e\u0005\u001fR6\u0016\u0018\"\u001e\u001e\b\"\u001e\u001b\u001f\u0006%\u000b\u0001\u0017Q\u001c\u0010\u001f\u0014\\"));
    }
}

