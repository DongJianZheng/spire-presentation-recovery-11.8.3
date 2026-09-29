/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazy;
import com.spire.presentation.packages.sprljaa;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprnyn {
    public static final int cfr_renamed_93 = 16;
    public static final int cfr_renamed_86 = 2;
    public static final int cfr_renamed_152 = 1;
    public static final int cfr_renamed_112 = 10;
    public static final int cfr_renamed_119 = 32;
    public static final int cfr_renamed_91 = 64;
    public static final int cfr_renamed_0 = 8;
    public static final int cfr_renamed_1 = 128;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 512;
    public static final int cfr_renamed_4 = 256;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 3 ^ 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 4;
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

    public static int cfr_renamed_5644(String arg0) {
        if (sprljaa.cfr_renamed_9("}\rB\nG\nV\u000fQ").equals(arg0)) {
            return 1;
        }
        if ("Hidden".equals(arg0)) {
            return 2;
        }
        if (sprazy.cfr_renamed_9("\bn1r,").equals(arg0)) {
            return 4;
        }
        if (sprljaa.cfr_renamed_9("-[9[\fY").equals(arg0)) {
            return 8;
        }
        if (sprazy.cfr_renamed_9("R7N7h9h=").equals(arg0)) {
            return 16;
        }
        if (sprljaa.cfr_renamed_9("-[5]\u0006C").equals(arg0)) {
            return 32;
        }
        if (sprazy.cfr_renamed_9("N=}<S6p!").equals(arg0)) {
            return 64;
        }
        if (sprljaa.cfr_renamed_9("/[\u0000_\u0006P").equals(arg0)) {
            return 128;
        }
        if (sprazy.cfr_renamed_9("H7{?p=R7J1y/").equals(arg0)) {
            return 256;
        }
        if (sprljaa.cfr_renamed_9("x\fW\bQ\u0007w\fZ\u0017Q\r@").equals(arg0)) {
            return 512;
        }
        throw new IllegalArgumentException(sprazy.cfr_renamed_9("I6w6s/rxL<z\u0019r6s,},u7r\u001ep9{+<6}5yv"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprljaa.cfr_renamed_9("}\rB\nG\nV\u000fQ");
            }
            case 2: {
                return "Hidden";
            }
            case 4: {
                return sprazy.cfr_renamed_9("\bn1r,");
            }
            case 8: {
                return sprljaa.cfr_renamed_9("-[9[\fY");
            }
            case 16: {
                return sprazy.cfr_renamed_9("R7N7h9h=");
            }
            case 32: {
                return sprljaa.cfr_renamed_9("-[5]\u0006C");
            }
            case 64: {
                return sprazy.cfr_renamed_9("N=}<S6p!");
            }
            case 128: {
                return sprljaa.cfr_renamed_9("/[\u0000_\u0006P");
            }
            case 256: {
                return sprazy.cfr_renamed_9("H7{?p=R7J1y/");
            }
            case 512: {
                return sprljaa.cfr_renamed_9("x\fW\bQ\u0007w\fZ\u0017Q\r@");
            }
        }
        return sprazy.cfr_renamed_9("\rr3r7k6<\bx>]6r7h9h1s6Z4}?oxj9p-yv");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add(sprljaa.cfr_renamed_9("}\rB\nG\nV\u000fQ"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Hidden");
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprazy.cfr_renamed_9("\bn1r,"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprljaa.cfr_renamed_9("-[9[\fY"));
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprazy.cfr_renamed_9("R7N7h9h="));
        }
        if ((0x20 & arg0) == 32) {
            hashSet.add(sprljaa.cfr_renamed_9("-[5]\u0006C"));
        }
        if ((0x40 & arg0) == 64) {
            hashSet.add(sprazy.cfr_renamed_9("N=}<S6p!"));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprljaa.cfr_renamed_9("/[\u0000_\u0006P"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sprazy.cfr_renamed_9("H7{?p=R7J1y/"));
        }
        if ((0x200 & arg0) == 512) {
            hashSet.add(sprljaa.cfr_renamed_9("x\fW\bQ\u0007w\fZ\u0017Q\r@"));
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprazy.cfr_renamed_9("\u0011r.u+u:p=");
            }
            case 2: {
                return "Hidden";
            }
            case 4: {
                return sprljaa.cfr_renamed_9("d\u0011]\r@");
            }
            case 8: {
                return sprazy.cfr_renamed_9("R7F7s5");
            }
            case 16: {
                return sprljaa.cfr_renamed_9("-[1[\u0017U\u0017Q");
            }
            case 32: {
                return sprazy.cfr_renamed_9("R7J1y/");
            }
            case 64: {
                return sprljaa.cfr_renamed_9("1Q\u0002P,Z\u000fM");
            }
            case 128: {
                return sprazy.cfr_renamed_9("P7\u007f3y<");
            }
            case 256: {
                return sprljaa.cfr_renamed_9("7[\u0004S\u000fQ-[5]\u0006C");
            }
            case 512: {
                return sprazy.cfr_renamed_9("\u0014s;w=x\u001bs6h=r,");
            }
        }
        return sprljaa.cfr_renamed_9("a\r_\r[\u0014ZCd\u0007R\"Z\r[\u0017U\u0017]\fZ%X\u0002S\u0010\u0014\u0015U\u000fA\u0006\u001a");
    }

    private /* synthetic */ sprnyn() {
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprnyn.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[10];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 256;
        nArray[9] = 512;
        return nArray;
    }
}

