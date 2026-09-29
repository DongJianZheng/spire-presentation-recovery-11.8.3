/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.spravm;
import com.spire.presentation.packages.sprbfk;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxe;
import java.math.BigInteger;
import java.util.Date;

public class sprugk {
    private spravm cfr_renamed_4;

    public Date cfr_renamed_2590() throws sprbfk {
        sprnom sprnom2;
        block4: {
            sprnom2 = this.cfr_renamed_4.cfr_renamed_2590();
            if (sprnom2 == null) {
                return null;
            }
            try {
                if (sprnom2.cfr_renamed_588() == null) break block4;
                return sprnom2.cfr_renamed_588().cfr_renamed_110();
            }
            catch (Exception exception) {
                throw new sprbfk(new StringBuilder().insert(0, sprhig.cfr_renamed_9("G\u0005S\t^\u000e\u0012\u001f]KW\u0013F\u0019S\bFKF\u0002_\u000e\bK")).append(exception.getMessage()).toString(), exception);
            }
        }
        sprqxe sprqxe2 = new sprqxe(sprnom2.cfr_renamed_652());
        return sprqxe2.cfr_renamed_577().cfr_renamed_588();
    }

    public static boolean cfr_renamed_9836(sprugk arg0, sprugk arg1) {
        spravm spravm2 = arg0.cfr_renamed_4;
        spravm spravm3 = arg1.cfr_renamed_4;
        if (spravm2.cfr_renamed_3() != spravm3.cfr_renamed_3()) {
            return false;
        }
        if (!sprugk.cfr_renamed_2591(spravm2.cfr_renamed_2594(), spravm3.cfr_renamed_2594())) {
            return false;
        }
        if (!sprugk.cfr_renamed_2591(spravm2.cfr_renamed_2590(), spravm3.cfr_renamed_2590())) {
            return false;
        }
        if (!sprugk.cfr_renamed_2591(spravm2.cfr_renamed_2595(), spravm3.cfr_renamed_2595())) {
            return false;
        }
        if (!sprugk.cfr_renamed_2591(spravm2.cfr_renamed_98(), spravm3.cfr_renamed_98())) {
            return false;
        }
        if (spravm2.cfr_renamed_596() != null) {
            if (spravm3.cfr_renamed_596() == null) {
                return false;
            }
            byte[] byArray = spravm2.cfr_renamed_596().toByteArray();
            byte[] byArray2 = spravm3.cfr_renamed_596().toByteArray();
            if (byArray2.length < byArray.length) {
                return false;
            }
            if (!sproze.cfr_renamed_92(byArray, sproze.cfr_renamed_533(byArray2, 0, byArray.length))) {
                return false;
            }
        }
        return true;
    }

    public sprugk(byte[] arg0) {
        this(spravm.cfr_renamed_23(arg0));
    }

    public sprugk(spravm spravm2) {
        this.cfr_renamed_4 = spravm2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 2 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    public sprdcm cfr_renamed_2595() {
        if (this.cfr_renamed_4.cfr_renamed_2595() != null) {
            return this.cfr_renamed_4.cfr_renamed_2595();
        }
        return null;
    }

    public spravm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_596() {
        return this.cfr_renamed_4.cfr_renamed_596();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3();
    }

    public spraem cfr_renamed_2592() {
        return this.cfr_renamed_4.cfr_renamed_2592();
    }

    public spraem cfr_renamed_2598() {
        return this.cfr_renamed_4.cfr_renamed_2599();
    }

    public int cfr_renamed_2597() {
        return this.cfr_renamed_4.cfr_renamed_2594().cfr_renamed_97().intValue();
    }

    public spraem cfr_renamed_2596() {
        return this.cfr_renamed_4.cfr_renamed_2596();
    }

    private static /* synthetic */ boolean cfr_renamed_2591(Object arg0, Object arg1) {
        return arg0 == null && arg1 == null || arg0 != null && arg0.equals(arg1);
    }
}

