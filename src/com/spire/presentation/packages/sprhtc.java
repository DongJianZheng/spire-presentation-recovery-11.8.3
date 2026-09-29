/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprome;
import com.spire.presentation.packages.sprqpp;
import com.spire.presentation.packages.sprxse;
import com.spire.presentation.packages.sprxtc;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.util.Date;

public class sprhtc {
    private sprome cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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

    public Date cfr_renamed_2590() throws sprxtc {
        sprxse sprxse2;
        block4: {
            sprxse2 = this.cfr_renamed_4.cfr_renamed_2590();
            if (sprxse2 == null) {
                return null;
            }
            try {
                if (sprxse2.cfr_renamed_588() == null) break block4;
                return sprxse2.cfr_renamed_588().cfr_renamed_110();
            }
            catch (Exception exception) {
                throw new sprxtc(new StringBuilder().insert(0, sprqpp.cfr_renamed_9("\u0017:\u00036\u000e1B \rt\u0007,\u0016&\u00037\u0016t\u0016=\u000f1Xt")).append(exception.getMessage()).toString(), exception);
            }
        }
        sprbva sprbva2 = new sprbva(sprxse2.cfr_renamed_652());
        return sprbva2.cfr_renamed_577().cfr_renamed_588();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3();
    }

    private static /* synthetic */ boolean cfr_renamed_2591(Object arg0, Object arg1) {
        return arg0 == null && arg1 == null || arg0 != null && arg0.equals(arg1);
    }

    public spryee cfr_renamed_2592() {
        return this.cfr_renamed_4.cfr_renamed_2592();
    }

    public static boolean cfr_renamed_2593(sprhtc arg0, sprhtc arg1) {
        sprome sprome2 = arg0.cfr_renamed_4;
        sprome sprome3 = arg1.cfr_renamed_4;
        if (sprome2.cfr_renamed_3() != sprome3.cfr_renamed_3()) {
            return false;
        }
        if (!sprhtc.cfr_renamed_2591(sprome2.cfr_renamed_2594(), sprome3.cfr_renamed_2594())) {
            return false;
        }
        if (!sprhtc.cfr_renamed_2591(sprome2.cfr_renamed_2590(), sprome3.cfr_renamed_2590())) {
            return false;
        }
        if (!sprhtc.cfr_renamed_2591(sprome2.cfr_renamed_2595(), sprome3.cfr_renamed_2595())) {
            return false;
        }
        if (!sprhtc.cfr_renamed_2591(sprome2.cfr_renamed_98(), sprome3.cfr_renamed_98())) {
            return false;
        }
        if (sprome2.cfr_renamed_596() != null) {
            if (sprome3.cfr_renamed_596() == null) {
                return false;
            }
            byte[] byArray = sprome2.cfr_renamed_596().toByteArray();
            byte[] byArray2 = sprome3.cfr_renamed_596().toByteArray();
            if (byArray2.length < byArray.length) {
                return false;
            }
            if (!sprzra.cfr_renamed_92(byArray, sprzra.cfr_renamed_533(byArray2, 0, byArray.length))) {
                return false;
            }
        }
        return true;
    }

    public BigInteger cfr_renamed_596() {
        return this.cfr_renamed_4.cfr_renamed_596();
    }

    public spryee cfr_renamed_2596() {
        return this.cfr_renamed_4.cfr_renamed_2596();
    }

    public spriae cfr_renamed_2595() {
        if (this.cfr_renamed_4.cfr_renamed_2595() != null) {
            return this.cfr_renamed_4.cfr_renamed_2595();
        }
        return null;
    }

    public int cfr_renamed_2597() {
        return this.cfr_renamed_4.cfr_renamed_2594().cfr_renamed_97().intValue();
    }

    public sprome cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprhtc(byte[] arg0) {
        this(sprome.cfr_renamed_23(arg0));
    }

    public spryee cfr_renamed_2598() {
        return this.cfr_renamed_4.cfr_renamed_2599();
    }

    public sprhtc(sprome sprome2) {
        this.cfr_renamed_4 = sprome2;
    }
}

