/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdlg;
import com.spire.presentation.packages.spriifa;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class spreno {
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(spriifa.cfr_renamed_9("1\b\u0001\t\u001d\u0010>\u0014\u001c\u00181\u001c\u00029\u0013\t\u0013;\u001b\u0011\u001e-\u0013\t\u001a"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprdlg.cfr_renamed_9("Egufi\u007fJ{hwEsvVgfg^o|cBgfn"));
        }
        return hashSet;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
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
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return spriifa.cfr_renamed_9("1\b\u0001\t\u001d\u0010>\u0014\u001c\u00181\u001c\u00029\u0013\t\u0013;\u001b\u0011\u001e-\u0013\t\u001a");
            }
            case 2: {
                return sprdlg.cfr_renamed_9("Egufi\u007fJ{hwEsvVgfg^o|cBgfn");
            }
        }
        return spriifa.cfr_renamed_9("(\u001c\u0016\u001c\u0012\u0005\u0013R>\u0007\u000e\u0006\u0012\u001f1\u001b\u0013\u0017>\u0013\r6\u001c\u0006\u001cR\u000b\u0013\u0011\u0007\u0018\\");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprdlg.cfr_renamed_9("Egufi\u007fJ{hwEsvVgfgTo~jBgfn");
            }
            case 2: {
                return spriifa.cfr_renamed_9("1\b\u0001\t\u001d\u0010>\u0014\u001c\u00181\u001c\u00029\u0013\t\u00131\u001b\u0013\u0017-\u0013\t\u001a");
            }
        }
        return sprdlg.cfr_renamed_9("Ghyh}q|&Qsar}k^o|cQgbBsrs&dg~sw(");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 1;
        nArray[1] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spriifa.cfr_renamed_9("1\b\u0001\t\u001d\u0010>\u0014\u001c\u00181\u001c\u00029\u0013\t\u0013;\u001b\u0011\u001e-\u0013\t\u001a").equals(arg0)) {
            return 1;
        }
        if (sprdlg.cfr_renamed_9("Egufi\u007fJ{hwEsvVgfg^o|cBgfn").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(spriifa.cfr_renamed_9("'\u0013\u0019\u0013\u001d\n\u001c]1\b\u0001\t\u001d\u0010>\u0014\u001c\u00181\u001c\u00029\u0013\t\u0013]\u001c\u001c\u001f\u0018\\"));
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= spreno.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    private /* synthetic */ spreno() {
    }
}

