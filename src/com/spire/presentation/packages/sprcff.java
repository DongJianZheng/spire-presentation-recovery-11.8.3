/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprcff {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
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

    private static /* synthetic */ boolean cfr_renamed_5192(String string) {
        String arg0;
        String string2 = arg0;
        return sprcff.cfr_renamed_5193(string2, 0, string2.length(), 10, 3, false, 1, 128);
    }

    public static boolean cfr_renamed_467(String arg0) {
        int n;
        int n2 = arg0.length();
        if (n2 < 7 || n2 > 15) {
            return false;
        }
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 3) {
            String string = arg0;
            int n5 = string.indexOf(46, n3);
            if (!sprcff.cfr_renamed_5193(string, n3, n5, 10, 3, true, 0, 255)) {
                return false;
            }
            n3 = n5 + 1;
            n4 = ++n;
        }
        return sprcff.cfr_renamed_5193(arg0, n3, n2, 10, 3, true, 0, 255);
    }

    public static boolean cfr_renamed_465(String arg0) {
        int n = arg0.indexOf("/");
        if (n < 1) {
            return false;
        }
        String string = arg0;
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return sprcff.cfr_renamed_466(string2) && (sprcff.cfr_renamed_466(string3) || sprcff.cfr_renamed_5192(string3));
    }

    public static boolean cfr_renamed_464(String arg0) {
        int n = arg0.indexOf("/");
        if (n < 1) {
            return false;
        }
        String string = arg0;
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return sprcff.cfr_renamed_467(string2) && (sprcff.cfr_renamed_467(string3) || sprcff.cfr_renamed_5194(string3));
    }

    public static boolean cfr_renamed_469(String arg0) {
        return sprcff.cfr_renamed_467(arg0) || sprcff.cfr_renamed_466(arg0);
    }

    private static /* synthetic */ boolean cfr_renamed_5194(String string) {
        String arg0;
        String string2 = arg0;
        return sprcff.cfr_renamed_5193(string2, 0, string2.length(), 10, 2, 0 != 0, 0, 32);
    }

    public static boolean cfr_renamed_466(String arg0) {
        int n;
        int n2;
        if (arg0.length() == 0) {
            return false;
        }
        char c = arg0.charAt(0);
        if (c != ':' && Character.digit(c, 16) < 0) {
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
                    if (++n3 == 8) {
                        return false;
                    }
                    if (!sprcff.cfr_renamed_467(string2)) {
                        return false;
                    }
                } else if (!sprcff.cfr_renamed_5193(string, n2, n, 16, 4, true, 0, 65535)) {
                    return false;
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

    public static boolean cfr_renamed_463(String arg0) {
        return sprcff.cfr_renamed_464(arg0) || sprcff.cfr_renamed_465(arg0);
    }

    private static /* synthetic */ boolean cfr_renamed_5193(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int n;
        boolean bl;
        boolean bl2;
        boolean bl3;
        int n2;
        boolean bl4;
        int n3 = arg2 - arg1;
        if (n3 < 1) {
            bl4 = true;
            n2 = n3;
        } else {
            bl4 = false;
            n2 = n3;
        }
        if (bl4 | n2 > arg4) {
            return false;
        }
        if (n3 > 1) {
            bl3 = true;
            bl2 = arg5;
        } else {
            bl3 = false;
            bl2 = arg5;
        }
        if (bl3 & !bl2 && Character.digit(arg0.charAt(arg1), arg3) <= 0) {
            return false;
        }
        int n4 = 0;
        int n5 = arg1;
        while (n5 < arg2) {
            int n6 = Character.digit(arg0.charAt(arg1), arg3);
            ++arg1;
            int n7 = n6;
            if (n6 < 0) {
                return false;
            }
            n4 *= arg3;
            n4 += n7;
            n5 = arg1;
        }
        if (n4 >= arg6) {
            bl = true;
            n = n4;
        } else {
            bl = false;
            n = n4;
        }
        return bl & n <= arg7;
    }
}

