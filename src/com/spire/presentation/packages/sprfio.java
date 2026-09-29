/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sprtco;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprfio {
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 3;
        int n4 = n2;
        int n5 = 4 << 3;
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

    private /* synthetic */ sprfio() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprosc.cfr_renamed_9("k\u000f^\u0006X\rK\u0017O");
            }
            case 2: {
                return sprtco.cfr_renamed_9(",f\u0015k\u0012a\u001c");
            }
        }
        return sprosc.cfr_renamed_9("6D\bD\f]\r\n$N\nl\nF\u000fg\fN\u0006\n\u0015K\u000f_\u0006\u0004");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprtco.cfr_renamed_9(":c\u000fj\ta\u001a{\u001e");
            }
            case 2: {
                return sprosc.cfr_renamed_9("}\nD\u0007C\rM");
            }
        }
        return sprtco.cfr_renamed_9("Z\u0015d\u0015`\fa[H\u001ff=f\u0017c6`\u001fj[y\u001ac\u000ejU");
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprfio.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(sprosc.cfr_renamed_9("k\u000f^\u0006X\rK\u0017O"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprtco.cfr_renamed_9(",f\u0015k\u0012a\u001c"));
        }
        return hashSet;
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 1;
        nArray[1] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprosc.cfr_renamed_9("k\u000f^\u0006X\rK\u0017O").equals(arg0)) {
            return 1;
        }
        if (sprtco.cfr_renamed_9(",f\u0015k\u0012a\u001c").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprosc.cfr_renamed_9("\u007f\rA\rE\u0014DCm\u0007C%C\u000fF.E\u0007OCD\u0002G\u0006\u0004"));
    }
}

