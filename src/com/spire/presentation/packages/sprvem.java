/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraam;
import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprkxm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.spruuia;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprvem
extends spraam {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_11120(sprlem arg0, String arg1) {
        if (arg1.length() != 0 && arg1.charAt(0) == '#') {
            try {
                return this.cfr_renamed_4446(arg1, 1);
            }
            catch (IOException iOException) {
                throw new RuntimeException(new StringBuilder().insert(0, spruuia.cfr_renamed_9("N4CrYu_0N:I0\r#L9X0\r3B'\r:D1\r")).append(arg0.cfr_renamed_19()).toString());
            }
        }
        if (arg1.length() != 0 && arg1.charAt(0) == '\\') {
            arg1 = arg1.substring(1);
        }
        if (arg0.cfr_renamed_5078(sprebm.cfr_renamed_951) || arg0.cfr_renamed_5078(sprebm.cfr_renamed_287)) {
            return new sprnrm(arg1);
        }
        if (arg0.cfr_renamed_5078(sprebm.cfr_renamed_0)) {
            return new sprkxm(arg1);
        }
        if (!(arg0.cfr_renamed_5078(sprebm.cfr_renamed_957) || arg0.cfr_renamed_5078(sprebm.cfr_renamed_152) || arg0.cfr_renamed_5078(sprebm.cfr_renamed_499) || arg0.cfr_renamed_5078(sprebm.cfr_renamed_105))) {
            return new spraen(arg1);
        }
        return new sprldn(arg1);
    }
}

