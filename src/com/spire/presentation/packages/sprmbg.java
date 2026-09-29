/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepk;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.spryvf;
import java.io.IOException;
import java.security.SecureRandom;

public class sprmbg {
    public final sprepk cfr_renamed_2;
    public final SecureRandom cfr_renamed_3;
    public boolean cfr_renamed_4;

    public static /* synthetic */ spryvf cfr_renamed_5980(byte[] arg0) {
        return sprmbg.cfr_renamed_5981(arg0);
    }

    public static /* synthetic */ byte[] cfr_renamed_6418(spryvf arg0) {
        return sprmbg.cfr_renamed_6419(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmbg(sprddm sprddm2, byte[] byArray, byte[] byArray2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        sprmbg sprmbg2 = this;
        sprmbg2.cfr_renamed_4 = false;
        sprmbg sprmbg3 = this;
        sprmbg2.cfr_renamed_2 = new sprepk((sprddm)arg0, (byte[])arg1, (byte[])arg2);
        sprmbg2.cfr_renamed_3 = secureRandom;
    }

    private static /* synthetic */ spryvf cfr_renamed_5981(byte[] arg0) {
        sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg0);
        return new spryvf(sprvhm2.cfr_renamed_2314().cfr_renamed_186());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_6419(spryvf arg0) {
        try {
            sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_128);
            return new sprvhm(sprddm2, arg0.cfr_renamed_5697()).cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n4 = n2;
        int n5 = 5 << 3 ^ 4;
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
}

