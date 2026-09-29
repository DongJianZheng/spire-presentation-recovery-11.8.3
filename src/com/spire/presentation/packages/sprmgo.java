/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreio;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprxry;

@sprtea
public abstract class sprmgo {
    @sprtea
    public static String cfr_renamed_15502(double arg0) {
        double d = arg0;
        if (d == (double)((long)d)) {
            Object[] objectArray = new Object[1];
            objectArray[0] = (long)arg0;
            return sprraia.cfr_renamed_11562(sprxry.cfr_renamed_9("o1.Ei"), objectArray);
        }
        return sprssja.cfr_renamed_15795(arg0, sprpxo.cfr_renamed_9("\u0002,"));
    }

    @sprtea
    public static double cfr_renamed_15505(String arg0) {
        return sprssja.cfr_renamed_13364(arg0, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public spreio cfr_renamed_15796(String arg0) {
        return new spreio(arg0, this.toString());
    }
}

