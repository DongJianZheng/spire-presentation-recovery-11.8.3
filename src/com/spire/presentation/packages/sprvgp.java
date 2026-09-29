/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlgp;
import com.spire.presentation.packages.sprmbp;
import com.spire.presentation.packages.sprmep;
import com.spire.presentation.packages.sprmkaa;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruhp;
import com.spire.presentation.packages.sprykp;

@sprtea
public class sprvgp {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_496(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            sprmzo sprmzo2 = new sprmzo(sprpdja2);
            if ((short)(sprmzo2.cfr_renamed_12137() & 0xFF) != 3) {
                throw new IllegalStateException(sprmkaa.cfr_renamed_9("O>i%j u\"n5~pW\u0004Bpl5h#s?t~"));
            }
            sprmzo2.cfr_renamed_17456();
            sprmzo sprmzo3 = sprmzo2;
            int n = sprmzo3.cfr_renamed_17456();
            int n2 = sprmzo3.cfr_renamed_17456();
            if (n > n2) throw new IllegalStateException(sprppy.cfr_renamed_9("\rm<%\u0014Q\u0001%=d-dyl*%7j-%/d5l=+"));
            if (n2 >= arg0.length) {
                throw new IllegalStateException(sprppy.cfr_renamed_9("\rm<%\u0014Q\u0001%=d-dyl*%7j-%/d5l=+"));
            }
            sprmzo sprmzo4 = sprmzo2;
            byte[] byArray = sprmzo4.cfr_renamed_16065(n - (int)sprpdja2.cfr_renamed_3274());
            byte[] byArray2 = sprmzo4.cfr_renamed_16065(n2 - (int)sprpdja2.cfr_renamed_3274());
            byte[] byArray3 = sprmzo4.cfr_renamed_16065(arg0.length - (int)sprpdja2.cfr_renamed_3274());
            byte[] byArray4 = sprykp.cfr_renamed_19092(byArray);
            byte[] byArray5 = sprykp.cfr_renamed_19092(byArray2);
            byte[] byArray6 = sprykp.cfr_renamed_19092(byArray3);
            byte[] byArray7 = spruhp.cfr_renamed_19093(byArray4, byArray5, byArray6);
            return byArray7;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 2 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_485(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprruo sprruo2;
            sprruo sprruo3 = sprruo2 = new sprruo(sprpdja2);
            sprruo3.cfr_renamed_11594((byte)3);
            sprruo3.cfr_renamed_17446(0xFFFFFF);
            sprmep sprmep2 = sprlgp.cfr_renamed_485(arg0);
            if (sprmep2 == null) {
                byte[] byArray = null;
                return byArray;
            }
            sprmep sprmep3 = sprmep2;
            byte[] byArray = sprmbp.cfr_renamed_19094(sprmep3.cfr_renamed_19095());
            byte[] byArray2 = sprmbp.cfr_renamed_19094(sprmep3.cfr_renamed_19096());
            byte[] byArray3 = sprmbp.cfr_renamed_19094(sprmep3.cfr_renamed_19097());
            int n = 10 + byArray.length;
            int n2 = byArray2.length + n;
            sprruo sprruo4 = sprruo2;
            sprruo sprruo5 = sprruo2;
            sprruo2.cfr_renamed_17446(n);
            sprruo5.cfr_renamed_17446(n2);
            sprruo5.cfr_renamed_9854(byArray);
            sprruo4.cfr_renamed_9854(byArray2);
            sprruo4.cfr_renamed_9854(byArray3);
            byte[] byArray4 = sprpdja2.cfr_renamed_4529();
            return byArray4;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }
}

