/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprsro {
    public static sprfqja cfr_renamed_16358(sprqgp arg0) {
        return new sprfqja(arg0.cfr_renamed_12595(), arg0.cfr_renamed_12596(), arg0.cfr_renamed_12597(), arg0.cfr_renamed_12598(), arg0.cfr_renamed_12599(), arg0.cfr_renamed_12600());
    }

    private /* synthetic */ sprsro() {
    }

    public static sprqgp cfr_renamed_16980(sprfqja arg0) {
        float[] fArray = arg0.cfr_renamed_12635();
        return new sprqgp(fArray[0], fArray[1], fArray[2], fArray[3], fArray[4], fArray[5]);
    }

    @sprtea
    public static boolean cfr_renamed_17170(double arg0, double arg1, double arg2) {
        return Math.abs(arg0 - arg1) <= arg2;
    }

    public static String cfr_renamed_17685(float arg0) {
        return sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0), 0, 4, true);
    }

    public static String cfr_renamed_17687(sprsuja arg0) {
        Object[] objectArray = new Object[2];
        objectArray[0] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_1980()), 0, 4, true);
        objectArray[1] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.spr\u3181()), 0, 4, true);
        return sprraia.cfr_renamed_11562(sprnwj.cfr_renamed_9("6#0?mh|n"), objectArray);
    }

    public static String cfr_renamed_17688(sprqgp arg0) {
        Object[] objectArray = new Object[6];
        objectArray[0] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12595()), 0, 4, true);
        objectArray[1] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12596()), 0, 4, true);
        objectArray[2] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12597()), 0, 4, true);
        objectArray[3] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12598()), 0, 4, true);
        objectArray[4] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12599()), 0, 4, true);
        objectArray[5] = sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_15117(arg0.cfr_renamed_12600()), 0, 4, true);
        return sprraia.cfr_renamed_11562(sprskea.cfr_renamed_9("_+Y7\u0004`\u0015f\b;_)Y7\u0004`\u0017f\b;_/Y7\u0004`\u0011f"), objectArray);
    }

    @sprtea
    public static int cfr_renamed_15165(sprqgp arg0) {
        if (arg0 == null) {
            return 0;
        }
        double d = 1.0E-5;
        if (sprsro.cfr_renamed_17170(arg0.cfr_renamed_12596(), 0.0, d) && sprsro.cfr_renamed_17170(arg0.cfr_renamed_12597(), 0.0, d)) {
            if (arg0.cfr_renamed_12595() > 0.0f && arg0.cfr_renamed_12598() > 0.0f) {
                return 0;
            }
            if (arg0.cfr_renamed_12595() < 0.0f && arg0.cfr_renamed_12598() < 0.0f) {
                return 180;
            }
        } else if (sprsro.cfr_renamed_17170(arg0.cfr_renamed_12595(), 0.0, d) && sprsro.cfr_renamed_17170(arg0.cfr_renamed_12598(), 0.0, d)) {
            if (arg0.cfr_renamed_12596() < 0.0f && arg0.cfr_renamed_12597() > 0.0f) {
                return 90;
            }
            if (arg0.cfr_renamed_12596() > 0.0f && arg0.cfr_renamed_12597() < 0.0f) {
                return 270;
            }
        }
        return 0;
    }

    public static String cfr_renamed_17689(double arg0) {
        return sprznp.cfr_renamed_17686(sprtzja.cfr_renamed_17690(arg0), 0, 8, true);
    }
}

