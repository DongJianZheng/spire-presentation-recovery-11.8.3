/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprbeq;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprvkn {
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 5;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 8;
    public static final int cfr_renamed_4 = 1;

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprbeq.cfr_renamed_9("Q|qv"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add("Top");
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Bottom");
        }
        if ((4 & arg0) == 4) {
            hashSet.add("Left");
        }
        if ((8 & arg0) == 8) {
            hashSet.add("Right");
        }
        return hashSet;
    }

    private /* synthetic */ sprvkn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return spraie.cfr_renamed_9("\u0015%5/");
            }
            case 1: {
                return "Top";
            }
            case 2: {
                return "Bottom";
            }
            case 4: {
                return "Left";
            }
            case 8: {
                return "Right";
            }
        }
        return sprbeq.cfr_renamed_9("Fqxq|h}?_ptvp~\u007fLgmf|gjazRmgvu~pkRqpw|m3irsfz=");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return spraie.cfr_renamed_9("\u0015%5/");
            }
            case 1: {
                return "Top";
            }
            case 2: {
                return "Bottom";
            }
            case 4: {
                return "Left";
            }
            case 8: {
                return "Right";
            }
        }
        return sprbeq.cfr_renamed_9("Fqxq|h}?_ptvp~\u007fLgmf|gjazRmgvu~pkRqpw|m3irsfz=");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spraie.cfr_renamed_9("\u0015%5/").equals(arg0)) {
            return 0;
        }
        if ("Top".equals(arg0)) {
            return 1;
        }
        if ("Bottom".equals(arg0)) {
            return 2;
        }
        if ("Left".equals(arg0)) {
            return 4;
        }
        if ("Right".equals(arg0)) {
            return 8;
        }
        throw new IllegalArgumentException(sprbeq.cfr_renamed_9("J}t}pdq3S|xz|rs@kajpkfmv^akzyr|g^}|{pa?}~~z="));
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
            n |= sprvkn.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }
}

