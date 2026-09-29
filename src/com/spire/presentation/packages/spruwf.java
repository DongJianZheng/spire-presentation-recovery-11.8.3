/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepk;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.SecureRandom;

public class spruwf {
    public final sprepk cfr_renamed_2;
    public boolean cfr_renamed_3;
    public final SecureRandom cfr_renamed_4;

    public static /* synthetic */ spryye cfr_renamed_5980(byte[] arg0) throws IOException {
        return spruwf.cfr_renamed_5981(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 ^ 5) << 1;
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

    public static /* synthetic */ byte[] cfr_renamed_5982(spryye arg0) {
        return spruwf.cfr_renamed_5983(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_5983(spryye arg0) {
        try {
            return sprrif.cfr_renamed_5658(arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private static /* synthetic */ spryye cfr_renamed_5981(byte[] arg0) throws IOException {
        return sprhyf.cfr_renamed_2615(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruwf(sprddm sprddm2, byte[] byArray, byte[] byArray2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        spruwf spruwf2 = this;
        spruwf2.cfr_renamed_3 = false;
        spruwf spruwf3 = this;
        spruwf2.cfr_renamed_2 = new sprepk((sprddm)arg0, (byte[])arg1, (byte[])arg2);
        spruwf2.cfr_renamed_4 = secureRandom;
    }
}

