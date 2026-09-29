/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprrio {
    public static final int cfr_renamed_102 = 256;
    public static final int cfr_renamed_93 = 6;
    public static final int cfr_renamed_86 = 8;
    public static final int cfr_renamed_152 = 24;
    public static final int cfr_renamed_112 = 0;
    public static final int cfr_renamed_119 = 0;
    public static final int cfr_renamed_91 = 24;
    public static final int cfr_renamed_0 = 11;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sproqr.cfr_renamed_9("+\u00000\u001f\u0001\u000e\u0011\n&?E\u0013E#\u0000\t\u0011O\u0019O1\u0000\u0015");
            }
            case 1: {
                return spruab.cfr_renamed_9("&y\u0017h\u0007l0Y");
            }
            case 2: {
                return "Right";
            }
            case 6: {
                return sproqr.cfr_renamed_9("&\n\u000b\u001b\u0000\u001dE\u0013E'\n\u001d\f\u0015\n\u0001\u0011\u000e\t");
            }
            case 8: {
                return "Bottom";
            }
            case 24: {
                return spruab.cfr_renamed_9("K\u0012z\u0016e\u001ag\u0016)\u000f)%l\u0001}\u001aj\u0012e");
            }
            case 256: {
                return sproqr.cfr_renamed_9("=\u0011\u00037\n\u0004\u000b\f\u0001\u0002");
            }
        }
        return spruab.cfr_renamed_9("\\\u001db\u001df\u0004gSN\u0017`'l\u000b}2e\u001an\u001d)\u0005h\u001f|\u0016'");
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprrio.cfr_renamed_5644(string);
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
                return sproqr.cfr_renamed_9("+\u00000\u001f\u0001\u000e\u0011\n&?E\u0013E#\u0000\t\u0011O\u0019O1\u0000\u0015");
            }
            case 1: {
                return spruab.cfr_renamed_9("&y\u0017h\u0007l0Y");
            }
            case 2: {
                return "Right";
            }
            case 6: {
                return sproqr.cfr_renamed_9("&\n\u000b\u001b\u0000\u001dE\u0013E'\n\u001d\f\u0015\n\u0001\u0011\u000e\t");
            }
            case 8: {
                return "Bottom";
            }
            case 24: {
                return spruab.cfr_renamed_9("K\u0012z\u0016e\u001ag\u0016)\u000f)%l\u0001}\u001aj\u0012e");
            }
            case 256: {
                return sproqr.cfr_renamed_9("=\u0011\u00037\n\u0004\u000b\f\u0001\u0002");
            }
        }
        return spruab.cfr_renamed_9("\\\u001db\u001df\u0004gSN\u0017`'l\u000b}2e\u001an\u001d)\u0005h\u001f|\u0016'");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[11];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 0;
        nArray[3] = 2;
        nArray[4] = 6;
        nArray[5] = 0;
        nArray[6] = 8;
        nArray[7] = 24;
        nArray[8] = 256;
        nArray[9] = 6;
        nArray[10] = 24;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sproqr.cfr_renamed_9("!\n:\u0015\u000b\u0004\u001b\u0000,5").equals(arg0)) {
            return 0;
        }
        if (spruab.cfr_renamed_9("&y\u0017h\u0007l0Y").equals(arg0)) {
            return 1;
        }
        if ("Left".equals(arg0)) {
            return 0;
        }
        if ("Right".equals(arg0)) {
            return 2;
        }
        if (sproqr.cfr_renamed_9(",\u0000\u0001\u0011\n\u0017").equals(arg0)) {
            return 6;
        }
        if ("Top".equals(arg0)) {
            return 0;
        }
        if ("Bottom".equals(arg0)) {
            return 8;
        }
        if (spruab.cfr_renamed_9("1h\u0000l\u001f`\u001dl").equals(arg0)) {
            return 24;
        }
        if (sproqr.cfr_renamed_9("=\u0011\u00037\n\u0004\u000b\f\u0001\u0002").equals(arg0)) {
            return 256;
        }
        if ("Horizontal".equals(arg0)) {
            return 6;
        }
        if ("Vertical".equals(arg0)) {
            return 24;
        }
        throw new IllegalArgumentException(spruab.cfr_renamed_9("&g\u0018g\u001c~\u001d)4m\u001a]\u0016q\u0007H\u001f`\u0014gSg\u0012d\u0016'"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1;
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

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sproqr.cfr_renamed_9("!\n:\u0015\u000b\u0004\u001b\u0000,5"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add(spruab.cfr_renamed_9("&y\u0017h\u0007l0Y"));
        }
        if ((0 & arg0) == 0) {
            hashSet.add("Left");
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Right");
        }
        if ((6 & arg0) == 6) {
            hashSet.add(sproqr.cfr_renamed_9(",\u0000\u0001\u0011\n\u0017"));
        }
        if ((0 & arg0) == 0) {
            hashSet.add("Top");
        }
        if ((8 & arg0) == 8) {
            hashSet.add("Bottom");
        }
        if ((0x18 & arg0) == 24) {
            hashSet.add(spruab.cfr_renamed_9("1h\u0000l\u001f`\u001dl"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sproqr.cfr_renamed_9("=\u0011\u00037\n\u0004\u000b\f\u0001\u0002"));
        }
        if ((6 & arg0) == 6) {
            hashSet.add("Horizontal");
        }
        if ((0x18 & arg0) == 24) {
            hashSet.add("Vertical");
        }
        return hashSet;
    }

    private /* synthetic */ sprrio() {
    }
}

