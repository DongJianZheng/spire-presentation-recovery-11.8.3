/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprogf;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvoy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprako {
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 8;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    private /* synthetic */ sprako() {
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprako.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprvoy.cfr_renamed_9("\u00190;-\u0016256/-").equals(arg0)) {
            return 1;
        }
        if ("Vertical".equals(arg0)) {
            return 2;
        }
        if (sprogf.cfr_renamed_9("\u0011{\"r*d&z\u0002z5\u007f-}&").equals(arg0)) {
            return 4;
        }
        if (sprvoy.cfr_renamed_9("\u0011303)\t(8-3%?1").equals(arg0)) {
            return 8;
        }
        throw new IllegalArgumentException(sprogf.cfr_renamed_9("K-u-q4pc[.x\u0013r6m\u0007l*h&l\u0010j1w-y\fn7w,p0>-\u007f.{m"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprvoy.cfr_renamed_9("\u00190;-\u0016256/-");
            }
            case 2: {
                return "Vertical";
            }
            case 4: {
                return sprogf.cfr_renamed_9("\u0011{\"r*d&z\u0002z5\u007f-}&");
            }
            case 8: {
                return sprvoy.cfr_renamed_9("\u0011303)\t(8-3%?1");
            }
        }
        return sprogf.cfr_renamed_9("\u0016p(p,i->\u0006s%N/k0Z1w5{1M7l*p$Q3j*q-mch\"r6{m");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprvoy.cfr_renamed_9("\u00190;-\u0016256/-");
            }
            case 2: {
                return "Vertical";
            }
            case 4: {
                return sprogf.cfr_renamed_9("\u0011{\"r*d&z\u0002z5\u007f-}&");
            }
            case 8: {
                return sprvoy.cfr_renamed_9("\u0011303)\t(8-3%?1");
            }
        }
        return sprogf.cfr_renamed_9("\u0016p(p,i->\u0006s%N/k0Z1w5{1M7l*p$Q3j*q-mch\"r6{m");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(sprvoy.cfr_renamed_9("\u00190;-\u0016256/-"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Vertical");
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprogf.cfr_renamed_9("\u0011{\"r*d&z\u0002z5\u007f-}&"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprvoy.cfr_renamed_9("\u0011303)\t(8-3%?1"));
        }
        return hashSet;
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        return nArray;
    }
}

