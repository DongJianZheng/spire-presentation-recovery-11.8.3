/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryny;

@sprtea
public final class sprnhn {
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spryny.cfr_renamed_9("{KIFV\\NLyFVFH@WLN[SJ").equals(arg0)) {
            return 0;
        }
        if (sprhzo.cfr_renamed_9("\u0019\u0013'\u0017?\u001f=\u0013\b\u0019'\u00199\u001f&\u0013?\u0004\"\u0015").equals(arg0)) {
            return 1;
        }
        if (spryny.cfr_renamed_9("iHN\\HHN@UG").equals(arg0)) {
            return 2;
        }
        if (sprhzo.cfr_renamed_9("\u001b\u00139\u0015.\u0006?\u0003*\u001a").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(spryny.cfr_renamed_9("oGQGU^T\thLTM_[SG]`T]_GNZ\u001aG[D_\u0007"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 3 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 5;
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
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprhzo.cfr_renamed_9("\n\u00148\u0019'\u0003?\u0013\b\u0019'\u00199\u001f&\u0013?\u0004\"\u0015");
            }
            case 1: {
                return spryny.cfr_renamed_9("hLVHN@LLyFVFH@WLN[SJ");
            }
            case 2: {
                return sprhzo.cfr_renamed_9("\u0018\u0017?\u00039\u0017?\u001f$\u0018");
            }
            case 3: {
                return spryny.cfr_renamed_9("jLHJ_YN\\[E");
            }
        }
        return sprhzo.cfr_renamed_9("#%\u001d%\u0019<\u0018k$.\u0018/\u00139\u001f%\u0011\u0002\u0018?\u0013%\u00028V=\u0017'\u0003.X");
    }

    private /* synthetic */ sprnhn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return spryny.cfr_renamed_9("{KIFV\\NLyFVFH@WLN[SJ");
            }
            case 1: {
                return sprhzo.cfr_renamed_9("\u0019\u0013'\u0017?\u001f=\u0013\b\u0019'\u00199\u001f&\u0013?\u0004\"\u0015");
            }
            case 2: {
                return spryny.cfr_renamed_9("iHN\\HHN@UG");
            }
            case 3: {
                return sprhzo.cfr_renamed_9("\u001b\u00139\u0015.\u0006?\u0003*\u001a");
            }
        }
        return spryny.cfr_renamed_9("|TBTFMG\u001a{_G^LH@TNsGNLT]I\tLHV\\_\u0007");
    }
}

