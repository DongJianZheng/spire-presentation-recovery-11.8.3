/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkyl;
import com.spire.presentation.packages.sprkyz;
import com.spire.presentation.packages.sprqqe;
import java.io.IOException;
import java.io.OutputStream;

public class sprpul {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_10955(sprqqe arg0, OutputStream arg1) {
        try {
            arg0.cfr_renamed_8489(arg1, "DER");
            arg1.close();
            return;
        }
        catch (IOException iOException) {
            throw new sprkyl(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("5%!),.`?/k\u0004\u000e\u0012k%%#$$.`$\"!%(4q`")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

