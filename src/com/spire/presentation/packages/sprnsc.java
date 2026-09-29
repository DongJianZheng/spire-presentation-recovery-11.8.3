/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprjme;
import com.spire.presentation.packages.sprkm;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprnzc;
import com.spire.presentation.packages.sprqrda;
import com.spire.presentation.packages.sprtxd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruxc;
import com.spire.presentation.packages.sprvve;
import com.spire.presentation.packages.spryae;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.math.BigInteger;

public abstract class sprnsc {
    private final spryae cfr_renamed_2;
    private final sprtxd cfr_renamed_3;
    public final sprvve cfr_renamed_4;

    public sprnsc(sprvve sprvve2) {
        sprnsc sprnsc2 = this;
        sprnsc sprnsc3 = this;
        sprnsc2.cfr_renamed_2 = new spryae();
        sprnsc2.cfr_renamed_3 = new sprtxd();
        sprnsc2.cfr_renamed_4 = sprvve2;
    }

    public void cfr_renamed_2600(sprmee arg0) {
        this.cfr_renamed_4.cfr_renamed_2600(arg0);
    }

    public void cfr_renamed_2601(spryee arg0) {
        this.cfr_renamed_4.cfr_renamed_2601(arg0);
    }

    public void cfr_renamed_2602(BigInteger arg0) {
        this.cfr_renamed_4.cfr_renamed_2602(arg0);
    }

    public sprnzc cfr_renamed_2581(spreue arg0) throws spruxc {
        if (!this.cfr_renamed_2.cfr_renamed_29()) {
            sprnsc sprnsc2 = this;
            sprnsc2.cfr_renamed_4.cfr_renamed_2603(sprnsc2.cfr_renamed_2.cfr_renamed_31());
        }
        sprjme sprjme2 = new sprjme(this.cfr_renamed_4.cfr_renamed_1451(), arg0);
        return new sprnzc(new sprnte(sprkm.cfr_renamed_0, sprjme2));
    }

    public void cfr_renamed_2604(sprmee arg0) {
        this.cfr_renamed_4.cfr_renamed_2604(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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

    public void cfr_renamed_2605(spryee arg0) {
        this.cfr_renamed_4.cfr_renamed_2605(arg0);
    }

    public void cfr_renamed_2606(sprmee arg0) {
        this.cfr_renamed_4.cfr_renamed_2606(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws spruxc {
        try {
            this.cfr_renamed_2.cfr_renamed_6(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new spruxc(new StringBuilder().insert(0, sprqrda.cfr_renamed_9("=r0}1g~v0p1w;3;k*v0`7|0)~")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

