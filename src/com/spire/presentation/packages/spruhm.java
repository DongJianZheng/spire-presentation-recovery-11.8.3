/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprudda;
import java.math.BigInteger;
import java.util.Random;

public abstract class spruhm {
    public static byte[] cfr_renamed_9445(spreuh arg0) {
        arg0 = arg0.cfr_renamed_1775();
        sprlsh sprlsh2 = arg0.cfr_renamed_1969();
        byte[] byArray = sprlsh2.cfr_renamed_91();
        if (!sprlsh2.cfr_renamed_805()) {
            if (spruhm.cfr_renamed_11186(arg0.cfr_renamed_1973().cfr_renamed_8936(sprlsh2)).cfr_renamed_287()) {
                byte[] byArray2 = byArray;
                int n = byArray.length - 1;
                byArray2[n] = (byte)(byArray2[n] | 1);
                return byArray;
            }
            byte[] byArray3 = byArray;
            int n = byArray.length - 1;
            byArray3[n] = (byte)(byArray3[n] & 0xFE);
        }
        return byArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = 4 << 3;
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

    private static /* synthetic */ sprlsh cfr_renamed_11187(sprgxh arg0, sprlsh arg1) {
        if (arg1.cfr_renamed_805()) {
            return arg1;
        }
        sprlsh sprlsh2 = arg0.cfr_renamed_1652(sprck.cfr_renamed_0);
        sprlsh sprlsh3 = null;
        sprlsh sprlsh4 = null;
        Random random = new Random();
        int n = arg1.cfr_renamed_1938();
        do {
            int n2;
            sprlsh sprlsh5 = arg0.cfr_renamed_1652(new BigInteger(n, random));
            sprlsh3 = sprlsh2;
            sprlsh sprlsh6 = arg1;
            int n3 = n2 = 1;
            while (n3 <= n - 1) {
                sprlsh sprlsh7 = sprlsh6.cfr_renamed_1048();
                sprlsh3 = sprlsh3.cfr_renamed_1048().cfr_renamed_8663(sprlsh7.cfr_renamed_8682(sprlsh5));
                sprlsh6 = sprlsh7.cfr_renamed_8663(arg1);
                n3 = ++n2;
            }
            if (sprlsh6.cfr_renamed_805()) continue;
            return null;
        } while ((sprlsh4 = sprlsh3.cfr_renamed_1048().cfr_renamed_8663(sprlsh3)).cfr_renamed_805());
        return sprlsh3;
    }

    private static /* synthetic */ sprlsh cfr_renamed_11186(sprlsh arg0) {
        int n;
        sprlsh sprlsh2 = arg0;
        int n2 = n = 1;
        while (n2 < arg0.cfr_renamed_1938()) {
            sprlsh2 = sprlsh2.cfr_renamed_1048().cfr_renamed_8663(arg0);
            n2 = ++n;
        }
        return sprlsh2;
    }

    public static spreuh cfr_renamed_9446(sprgxh arg0, byte[] arg1) {
        sprlsh sprlsh2;
        sprlsh sprlsh3 = arg0.cfr_renamed_1652(BigInteger.valueOf(arg1[arg1.length - 1] & 1));
        sprlsh sprlsh4 = arg0.cfr_renamed_1652(new BigInteger(1, arg1));
        if (!spruhm.cfr_renamed_11186(sprlsh4).equals(arg0.cfr_renamed_1778())) {
            sprlsh4 = sprlsh4.cfr_renamed_1908();
        }
        sprlsh sprlsh5 = null;
        if (sprlsh4.cfr_renamed_805()) {
            sprlsh2 = sprlsh5 = arg0.cfr_renamed_1997().cfr_renamed_1817();
        } else {
            sprlsh sprlsh6 = sprlsh4.cfr_renamed_1048().cfr_renamed_952().cfr_renamed_8682(arg0.cfr_renamed_1997()).cfr_renamed_8663(arg0.cfr_renamed_1778()).cfr_renamed_8663(sprlsh4);
            sprlsh sprlsh7 = spruhm.cfr_renamed_11187(arg0, sprlsh6);
            if (sprlsh7 != null) {
                if (!spruhm.cfr_renamed_11186(sprlsh7).equals(sprlsh3)) {
                    sprlsh7 = sprlsh7.cfr_renamed_1908();
                }
                sprlsh5 = sprlsh4.cfr_renamed_8682(sprlsh7);
            }
            sprlsh2 = sprlsh5;
        }
        if (sprlsh2 == null) {
            throw new IllegalArgumentException(sprudda.cfr_renamed_9("f3Y<C4K}_2F3[}L2B-]8\\.F2A"));
        }
        return arg0.cfr_renamed_1995(sprlsh4.cfr_renamed_1779(), sprlsh5.cfr_renamed_1779());
    }
}

