/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgji;
import java.security.AccessController;

public class spruci {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = 3 ^ 5;
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class cfr_renamed_5727(Class arg0, String arg1) {
        try {
            ClassLoader classLoader = arg0.getClassLoader();
            if (classLoader == null) return (Class)AccessController.doPrivileged(new sprgji(arg1));
            return classLoader.loadClass(arg1);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}

