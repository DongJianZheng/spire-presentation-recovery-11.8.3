/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjsd;
import com.spire.presentation.packages.sprwtba;

public final class sprhna {
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

    public static int cfr_renamed_822(long arg0) {
        int n = 0;
        long l = arg0;
        while (l != 0L) {
            ++n;
            l = arg0 >>> 1;
        }
        return n - 1;
    }

    private /* synthetic */ sprhna() {
    }

    public static int cfr_renamed_823(long arg0, int arg1) {
        int n;
        long l = arg0;
        if (arg1 == 0) {
            System.err.println(sprwtba.cfr_renamed_9("\u001aJ-W-\u0002\u007fL0\u0018=]\u007f\\6N6\\:\\\u007fZ&\u0018o"));
            return 0;
        }
        long l2 = (long)arg1 & 0xFFFFFFFFL;
        long l3 = l;
        while (l3 >>> 32 != 0L) {
            long l4 = l;
            l3 = l4 ^ l2 << sprhna.cfr_renamed_822(l4) - sprhna.cfr_renamed_822(l2);
        }
        int n2 = n = (int)(l & 0xFFFFFFFFFFFFFFFFL);
        while (sprhna.cfr_renamed_824(n2) >= sprhna.cfr_renamed_824(arg1)) {
            int n3 = n;
            n2 = n3 ^ arg1 << sprhna.cfr_renamed_824(n3) - sprhna.cfr_renamed_824(arg1);
        }
        return n;
    }

    public static int cfr_renamed_825(int arg0, int arg1) {
        return arg0 ^ arg1;
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

    public static int cfr_renamed_826(int arg0) {
        int n;
        if (arg0 < 0) {
            System.err.println(sprjsd.cfr_renamed_9("8\u0000\tH(\r\u000b\u001a\t\rL\u0001\u001fH\u0002\r\u000b\t\u0018\u0001\u001a\r"));
            return 0;
        }
        if (arg0 > 31) {
            System.err.println(sprwtba.cfr_renamed_9("l7]\u007f|:_-]:\u00186K\u007fU0J:\u0018+P:V\u007f\u000bn"));
            return 0;
        }
        if (arg0 == 0) {
            return 1;
        }
        int n2 = 1 << arg0;
        int n3 = 1 << arg0 + 1;
        int n4 = n = ++n2;
        while (n4 < n3) {
            if (sprhna.cfr_renamed_827(n)) {
                return n;
            }
            n4 = n += 2;
        }
        return 0;
    }

    public static int cfr_renamed_828(int arg0, int arg1, int arg2) {
        int n = 0;
        int n2 = sprhna.cfr_renamed_829(arg1, arg2);
        if (n2 != 0) {
            int n3 = 1 << sprhna.cfr_renamed_824(arg2);
            for (int i = sprhna.cfr_renamed_829(arg0, arg2); i != 0; i >>>= 1) {
                if ((byte)(i & 1) != 1) continue;
                n ^= n2;
                if ((n2 <<= 1) < n3) continue;
                n2 ^= arg2;
            }
        }
        return n;
    }

    public static int cfr_renamed_830(int arg0, int arg1) {
        int n;
        int n2 = arg0;
        int n3 = n = arg1;
        while (n3 != 0) {
            int n4 = sprhna.cfr_renamed_829(n2, n);
            n2 = n;
            n3 = n4;
        }
        return n2;
    }

    public static int cfr_renamed_829(int arg0, int arg1) {
        int n = arg0;
        if (arg1 == 0) {
            System.err.println(sprjsd.cfr_renamed_9("-\u001e\u001a\u0003\u001aVH\u0018\u0007L\n\tH\b\u0001\u001a\u0001\b\r\bH\u000e\u0011LX"));
            return 0;
        }
        int n2 = n;
        while (sprhna.cfr_renamed_824(n2) >= sprhna.cfr_renamed_824(arg1)) {
            int n3 = n;
            n2 = n3 ^ arg1 << sprhna.cfr_renamed_824(n3) - sprhna.cfr_renamed_824(arg1);
        }
        return n;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 4 << 1;
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

    public static boolean cfr_renamed_827(int arg0) {
        int n;
        if (arg0 == 0) {
            return false;
        }
        int n2 = sprhna.cfr_renamed_824(arg0) >>> 1;
        int n3 = 2;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n3;
            n3 = sprhna.cfr_renamed_828(n5, n5, arg0);
            if (sprhna.cfr_renamed_830(n3 ^ 2, arg0) != 1) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }
}

