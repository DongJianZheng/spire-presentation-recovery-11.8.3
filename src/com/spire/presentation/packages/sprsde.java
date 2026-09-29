/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprulg;
import com.spire.presentation.packages.spruqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;
import java.io.IOException;

public class sprsde
extends sprqje {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_4447(sprtzd arg0, String arg1) {
        if (arg1.length() != 0 && arg1.charAt(0) == '#') {
            try {
                return this.cfr_renamed_4446(arg1, 1);
            }
            catch (IOException iOException) {
                throw new RuntimeException(new StringBuilder().insert(0, sprulg.cfr_renamed_9("\u0006#\u000be\u0011b\u0017'\u0006-\u0001'E4\u0004.\u0010'E$\n0E-\f&E")).append(arg0.cfr_renamed_19()).toString());
            }
        }
        if (arg1.length() != 0 && arg1.charAt(0) == '\\') {
            arg1 = arg1.substring(1);
        }
        if (arg0.equals(spruib.cfr_renamed_272) || arg0.equals(spruib.cfr_renamed_722)) {
            return new sprcae(arg1);
        }
        if (arg0.equals(spruib.cfr_renamed_805)) {
            return new spruqe(arg1);
        }
        if (!(arg0.equals(spruib.cfr_renamed_0) || arg0.equals(spruib.cfr_renamed_86) || arg0.equals(spruib.cfr_renamed_956) || arg0.equals(spruib.cfr_renamed_724))) {
            return new sprxte(arg1);
        }
        return new spraoe(arg1);
    }
}

