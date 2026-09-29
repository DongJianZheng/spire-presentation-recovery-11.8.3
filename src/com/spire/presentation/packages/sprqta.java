/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprqta {
    public static boolean cfr_renamed_463(String arg0) {
        return sprqta.cfr_renamed_464(arg0) || sprqta.cfr_renamed_465(arg0);
    }

    public static boolean cfr_renamed_466(String arg0) {
        int n;
        int n2;
        if (arg0.length() == 0) {
            return false;
        }
        int n3 = 0;
        String string = new StringBuilder().insert(0, arg0).append(":").toString();
        boolean bl = false;
        int n4 = n2 = 0;
        while (n4 < string.length() && (n = string.indexOf(58, n2)) >= n2) {
            if (n3 == 8) {
                return false;
            }
            if (n2 != n) {
                String string2 = string.substring(n2, n);
                if (n == string.length() - 1 && string2.indexOf(46) > 0) {
                    if (!sprqta.cfr_renamed_467(string2)) {
                        return false;
                    }
                    ++n3;
                } else {
                    int n5;
                    try {
                        n5 = Integer.parseInt(string.substring(n2, n), 16);
                    }
                    catch (NumberFormatException numberFormatException) {
                        return false;
                    }
                    if (n5 < 0 || n5 > 65535) {
                        return false;
                    }
                }
            } else {
                if (n != 1 && n != string.length() - 1 && bl) {
                    return false;
                }
                bl = true;
            }
            ++n3;
            n4 = n2 = n + 1;
        }
        return n3 == 8 || bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ boolean cfr_renamed_468(String arg0, int arg1) {
        try {
            int n = Integer.parseInt(arg0);
            return n >= 0 && n <= arg1;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public static boolean cfr_renamed_469(String arg0) {
        return sprqta.cfr_renamed_467(arg0) || sprqta.cfr_renamed_466(arg0);
    }

    public static boolean cfr_renamed_467(String arg0) {
        int n;
        int n2;
        if (arg0.length() == 0) {
            return false;
        }
        int n3 = 0;
        String string = new StringBuilder().insert(0, arg0).append(".").toString();
        int n4 = n2 = 0;
        while (n4 < string.length() && (n = string.indexOf(46, n2)) > n2) {
            int n5;
            if (n3 == 4) {
                return false;
            }
            try {
                n5 = Integer.parseInt(string.substring(n2, n));
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            if (n5 < 0 || n5 > 255) {
                return false;
            }
            ++n3;
            n4 = n2 = n + 1;
        }
        return n3 == 4;
    }

    public static boolean cfr_renamed_465(String arg0) {
        String string = arg0;
        int n = string.indexOf("/");
        String string2 = string.substring(n + 1);
        return n > 0 && sprqta.cfr_renamed_466(arg0.substring(0, n)) && (sprqta.cfr_renamed_466(string2) || sprqta.cfr_renamed_468(string2, 128));
    }

    public static boolean cfr_renamed_464(String arg0) {
        String string = arg0;
        int n = string.indexOf("/");
        String string2 = string.substring(n + 1);
        return n > 0 && sprqta.cfr_renamed_467(arg0.substring(0, n)) && (sprqta.cfr_renamed_467(string2) || sprqta.cfr_renamed_468(string2, 32));
    }
}

