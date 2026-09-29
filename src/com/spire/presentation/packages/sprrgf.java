/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqpp;
import com.spire.presentation.packages.sprwlo;

public final class sprrgf {
    public static int cfr_renamed_828(int arg0, int arg1, int arg2) {
        int n = 0;
        int n2 = sprrgf.cfr_renamed_829(arg1, arg2);
        if (n2 != 0) {
            int n3 = 1 << sprrgf.cfr_renamed_824(arg2);
            for (int i = sprrgf.cfr_renamed_829(arg0, arg2); i != 0; i >>>= 1) {
                if ((byte)(i & 1) != 1) continue;
                n ^= n2;
                if ((n2 <<= 1) < n3) continue;
                n2 ^= arg2;
            }
        }
        return n;
    }

    public static int cfr_renamed_829(int arg0, int arg1) {
        int n = arg0;
        if (arg1 == 0) {
            System.err.println(sprwlo.cfr_renamed_9("#P\u0014M\u0014\u0018FV\t\u0002\u0004GFF\u000fT\u000fF\u0003FF@\u001f\u0002V"));
            return 0;
        }
        int n2 = n;
        while (sprrgf.cfr_renamed_824(n2) >= sprrgf.cfr_renamed_824(arg1)) {
            int n3 = n;
            n2 = n3 ^ arg1 << sprrgf.cfr_renamed_824(n3) - sprrgf.cfr_renamed_824(arg1);
        }
        return n;
    }

    public static int cfr_renamed_830(int arg0, int arg1) {
        int n;
        int n2 = arg0;
        int n3 = n = arg1;
        while (n3 != 0) {
            int n4 = sprrgf.cfr_renamed_829(n2, n);
            n2 = n;
            n3 = n4;
        }
        return n2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3;
        int cfr_ignored_0 = 5 << 4;
        int n4 = n2;
        char c = '\u0001';
        while (n4 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ c);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static int cfr_renamed_822(long arg0) {
        int n = 0;
        long l = arg0;
        while (l != 0L) {
            ++n;
            l = arg0 >>> 1;
        }
        return n - 1;
    }

    public static int cfr_renamed_824(int arg0) {
        int n = -1;
        int n2 = arg0;
        while (n2 != 0) {
            ++n;
            n2 = arg0 >>> 1;
        }
        return n;
    }

    public static long cfr_renamed_821(int arg0, int arg1) {
        long l = 0L;
        if (arg1 != 0) {
            long l2 = (long)arg1 & 0xFFFFFFFFL;
            int n = arg0;
            while (n != 0) {
                if ((byte)(arg0 & 1) == 1) {
                    l ^= l2;
                }
                l2 <<= 1;
                n = arg0 >>>= 1;
            }
        }
        return l;
    }

    public static int cfr_renamed_823(long arg0, int arg1) {
        int n;
        long l = arg0;
        if (arg1 == 0) {
            System.err.println(sprqpp.cfr_renamed_9("\u0011\u0010&\r&Xt\u0016;B6\u0007t\u0006=\u0014=\u00061\u0006t\u0000-Bd"));
            return 0;
        }
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        long l3 = l;
        while (l3 >>> 32 != 0L) {
            long l4 = l;
            l3 = l4 ^ l2 << sprrgf.cfr_renamed_822(l4) - sprrgf.cfr_renamed_822(l2);
        }
        int n2 = n = (int)(l & 0xFFFFFFFFFFFFFFFFL);
        while (sprrgf.cfr_renamed_824(n2) >= sprrgf.cfr_renamed_824(arg1)) {
            int n3 = n;
            n2 = n3 ^ arg1 << sprrgf.cfr_renamed_824(n3) - sprrgf.cfr_renamed_824(arg1);
        }
        return n;
    }

    public static boolean cfr_renamed_827(int arg0) {
        int n;
        if (arg0 == 0) {
            return false;
        }
        int n2 = sprrgf.cfr_renamed_824(arg0) >>> 1;
        int n3 = 2;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n3;
            n3 = sprrgf.cfr_renamed_828(n5, n5, arg0);
            if (sprrgf.cfr_renamed_830(n3 ^ 2, arg0) != 1) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_825(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    public static int cfr_renamed_826(int arg0) {
        int n;
        if (arg0 < 0) {
            System.err.println(sprwlo.cfr_renamed_9("v\u000eGFf\u0003E\u0014G\u0003\u0002\u000fQFL\u0003E\u0007V\u000fT\u0003"));
            return 0;
        }
        if (arg0 > 31) {
            System.err.println(sprqpp.cfr_renamed_9("6<\u0007t&1\u0005&\u00071B=\u0011t\u000f;\u00101B \n1\ftQe"));
            return 0;
        }
        if (arg0 == 0) {
            return 1;
        }
        int n2 = 1 << arg0;
        int n3 = 1 << arg0 + 1;
        int n4 = n = ++n2;
        while (n4 < n3) {
            if (sprrgf.cfr_renamed_827(n)) {
                return n;
            }
            n4 = n += 2;
        }
        return 0;
    }

    private /* synthetic */ sprrgf() {
    }
}

