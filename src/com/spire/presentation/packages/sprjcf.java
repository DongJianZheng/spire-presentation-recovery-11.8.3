/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriff;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmff;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class sprjcf {
    public static final String cfr_renamed_3 = "com.spire.psmodel.security.emulate.oracle";
    private static final ThreadLocal cfr_renamed_4 = new ThreadLocal();

    public static int cfr_renamed_5152(String arg0, int arg1) {
        String string = sprjcf.cfr_renamed_5153(arg0);
        if (string != null) {
            return Integer.parseInt(string);
        }
        return arg1;
    }

    public static BigInteger cfr_renamed_5154(String arg0) {
        String string = sprjcf.cfr_renamed_5153(arg0);
        if (string != null) {
            return new BigInteger(string);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_5155(String arg0, boolean arg1) {
        try {
            String string = sprjcf.cfr_renamed_5153(arg0);
            if (!arg1) return sprjcf.cfr_renamed_5156(string);
            return sprjcf.cfr_renamed_5157(string);
        }
        catch (AccessControlException accessControlException) {
            return false;
        }
    }

    public static boolean cfr_renamed_5158(String arg0, boolean arg1) {
        boolean bl = sprjcf.cfr_renamed_5159(arg0);
        HashMap<String, String> hashMap = (HashMap<String, String>)cfr_renamed_4.get();
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
            cfr_renamed_4.set(hashMap);
        }
        hashMap.put(arg0, arg1 ? "true" : "false");
        return bl;
    }

    private static /* synthetic */ boolean cfr_renamed_5157(String arg0) {
        if (arg0 == null || arg0.length() != 4) {
            return false;
        }
        return !(arg0.charAt(0) != 't' && arg0.charAt(0) != 'T' || arg0.charAt(1) != 'r' && arg0.charAt(1) != 'R' || arg0.charAt(2) != 'u' && arg0.charAt(2) != 'U' || arg0.charAt(3) != 'e' && arg0.charAt(3) != 'E');
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_5159(String arg0) {
        try {
            return sprjcf.cfr_renamed_5157(sprjcf.cfr_renamed_5153(arg0));
        }
        catch (AccessControlException accessControlException) {
            return false;
        }
    }

    public static Set<String> cfr_renamed_5160(String arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        String string = sprjcf.cfr_renamed_5153(arg0);
        if (string != null) {
            StringTokenizer stringTokenizer;
            StringTokenizer stringTokenizer2 = stringTokenizer = new StringTokenizer(string, ",");
            while (stringTokenizer2.hasMoreElements()) {
                StringTokenizer stringTokenizer3 = stringTokenizer;
                stringTokenizer2 = stringTokenizer3;
                hashSet.add(sprkoe.cfr_renamed_425(stringTokenizer3.nextToken()).trim());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static boolean cfr_renamed_5161(String arg0) {
        String string;
        Map map = (Map)cfr_renamed_4.get();
        if (map != null && (string = (String)map.remove(arg0)) != null) {
            if (map.isEmpty()) {
                cfr_renamed_4.remove();
            }
            return "true".equals(sprkoe.cfr_renamed_425(string));
        }
        return false;
    }

    public static String cfr_renamed_5162(String arg0, String arg1) {
        String string = sprjcf.cfr_renamed_5153(arg0);
        if (string == null) {
            return arg1;
        }
        return string;
    }

    public static String cfr_renamed_5153(String arg0) {
        String string;
        String string2 = (String)AccessController.doPrivileged(new sprmff(arg0));
        if (string2 != null) {
            return string2;
        }
        Map map = (Map)cfr_renamed_4.get();
        if (map != null && (string = (String)map.get(arg0)) != null) {
            return string;
        }
        return (String)AccessController.doPrivileged(new spriff(arg0));
    }

    private /* synthetic */ sprjcf() {
    }

    private static /* synthetic */ boolean cfr_renamed_5156(String arg0) {
        if (arg0 == null || arg0.length() != 5) {
            return false;
        }
        return !(arg0.charAt(0) != 'f' && arg0.charAt(0) != 'F' || arg0.charAt(1) != 'a' && arg0.charAt(1) != 'A' || arg0.charAt(2) != 'l' && arg0.charAt(2) != 'L' || arg0.charAt(3) != 's' && arg0.charAt(3) != 'S' || arg0.charAt(4) != 'e' && arg0.charAt(4) != 'E');
    }
}

