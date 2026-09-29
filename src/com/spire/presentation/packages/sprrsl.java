/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdik;
import com.spire.presentation.packages.sprdlk;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnnk;
import com.spire.presentation.packages.sprtpk;
import java.security.SecureRandom;

public class sprrsl {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprddm cfr_renamed_10837(sprlem arg0, sprtpk arg1, SecureRandom arg2) throws sprcsl {
        try {
            return sprdik.cfr_renamed_9909(arg0, arg1.cfr_renamed_1521().length * 8, arg2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcsl(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object cfr_renamed_9906(boolean arg0, sprbj arg1, sprddm arg2) throws sprcsl {
        try {
            return sprnnk.cfr_renamed_9906(arg0, arg1, arg2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcsl(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjyk cfr_renamed_9903(sprlem arg0, SecureRandom arg1) throws sprcsl {
        try {
            return sprdlk.cfr_renamed_9903(arg0, arg1);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcsl(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }
}

