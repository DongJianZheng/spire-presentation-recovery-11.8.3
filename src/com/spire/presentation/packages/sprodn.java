/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprppr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvws;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprodn {
    public static final int cfr_renamed_91 = 8;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprvws.cfr_renamed_9("L\u0015l\u001f");
            }
            case 1: {
                return sprppr.cfr_renamed_9("3($");
            }
            case 2: {
                return "Windows";
            }
            case 4: {
                return sprvws.cfr_renamed_9("W\u0014k\u0002");
            }
            case 8: {
                return sprppr.cfr_renamed_9(".\u0019\u0001\u0018=\u001e\u0017F");
            }
        }
        return sprvws.cfr_renamed_9("W\u0014i\u0014m\rlZX\u0013r?l\u000ep\u0003V\u0013o\u001fq\u000ec\u0017rZt\u001bn\u000fgT");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 4;
        nArray[4] = 8;
        return nArray;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprodn.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprppr.cfr_renamed_9(")\u0018\t\u0012");
            }
            case 1: {
                return sprvws.cfr_renamed_9(">M)");
            }
            case 2: {
                return "Windows";
            }
            case 4: {
                return sprppr.cfr_renamed_9("2\u0019\u000e\u000f");
            }
            case 8: {
                return sprvws.cfr_renamed_9("K\u0014d\u0015X\u0013rK");
            }
        }
        return sprppr.cfr_renamed_9("2\u0019\f\u0019\b\u0000\tW=\u001e\u00172\t\u0003\u0015\u000e3\u001e\n\u0012\u0014\u0003\u0006\u001a\u0017W\u0011\u0016\u000b\u0002\u0002Y");
    }

    private /* synthetic */ sprodn() {
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprvws.cfr_renamed_9("L\u0015l\u001f"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add(sprppr.cfr_renamed_9("3($"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Windows");
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprvws.cfr_renamed_9("W\u0014k\u0002"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprppr.cfr_renamed_9(".\u0019\u0001\u0018=\u001e\u0017F"));
        }
        return hashSet;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprvws.cfr_renamed_9("L\u0015l\u001f").equals(arg0)) {
            return 0;
        }
        if (sprppr.cfr_renamed_9("3($").equals(arg0)) {
            return 1;
        }
        if ("Windows".equals(arg0)) {
            return 2;
        }
        if (sprvws.cfr_renamed_9("W\u0014k\u0002").equals(arg0)) {
            return 4;
        }
        if (sprppr.cfr_renamed_9(".\u0019\u0001\u0018=\u001e\u0017F").equals(arg0)) {
            return 8;
        }
        throw new IllegalArgumentException(sprvws.cfr_renamed_9("/l\u0011l\u0015u\u0014\" k\nG\u0014v\b{.k\u0017g\tv\u001bo\n\"\u0014c\u0017gT"));
    }
}

