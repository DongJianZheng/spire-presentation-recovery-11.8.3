/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwgs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprtln {
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 8;
    public static final int cfr_renamed_2 = 5;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 4;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 0;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprkrl.cfr_renamed_9("\u0013+3&%?").equals(arg0)) {
            return 1;
        }
        if (sprwgs.cfr_renamed_9("0j\u0017b\u0011c\u0010c").equals(arg0)) {
            return 2;
        }
        if (sprkrl.cfr_renamed_9("\u0013&!<$32&").equals(arg0)) {
            return 4;
        }
        if (sprwgs.cfr_renamed_9("&r\u0017t\u0010s").equals(arg0)) {
            return 8;
        }
        if (sprkrl.cfr_renamed_9("\u000e=.7").equals(arg0)) {
            return 0;
        }
        throw new IllegalArgumentException(sprwgs.cfr_renamed_9("R\u001bl\u001bh\u0002iUA\u001ai\u0001A\u0019f\u0012tUi\u0014j\u0010)"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprkrl.cfr_renamed_9("\u0013+3&%?");
            }
            case 2: {
                return sprwgs.cfr_renamed_9("0j\u0017b\u0011c\u0010c");
            }
            case 4: {
                return sprkrl.cfr_renamed_9("\u0013&!<$32&");
            }
            case 8: {
                return sprwgs.cfr_renamed_9("&r\u0017t\u0010s");
            }
            case 0: {
                return sprkrl.cfr_renamed_9("\u000e=.7");
            }
        }
        return sprwgs.cfr_renamed_9(" i\u001ei\u001ap\u001b'3h\u001bs3k\u0014`\u0006'\u0003f\u0019r\u0010)");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(sprkrl.cfr_renamed_9("\u0013+3&%?"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprwgs.cfr_renamed_9("0j\u0017b\u0011c\u0010c"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprkrl.cfr_renamed_9("\u0013&!<$32&"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprwgs.cfr_renamed_9("&r\u0017t\u0010s"));
        }
        if ((0 & arg0) == 0) {
            hashSet.add(sprkrl.cfr_renamed_9("\u000e=.7"));
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprwgs.cfr_renamed_9("&~\u0006s\u0010j");
            }
            case 2: {
                return sprkrl.cfr_renamed_9("\u0005?\"7$6%6");
            }
            case 4: {
                return sprwgs.cfr_renamed_9("&s\u0014i\u0011f\u0007s");
            }
            case 8: {
                return sprkrl.cfr_renamed_9("\u0013'\"!%&");
            }
            case 0: {
                return sprwgs.cfr_renamed_9(";h\u001bb");
            }
        }
        return sprkrl.cfr_renamed_9("\u0015<+</%.r\u0006=.&\u0006>!53r63,'%|");
    }

    private /* synthetic */ sprtln() {
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprtln.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }
}

