/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdpk;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprqnk {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_9901(sprxgf arg0) {
        try {
            return arg0.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprdpk(new StringBuilder().insert(0, sprhur.cfr_renamed_9("O1b>c$,7i$,5b3c4e>kj,")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static sproug cfr_renamed_9902(byte[] arg0) {
        if (arg0 == null) {
            return new sprfvg(new byte[0]);
        }
        return new sprfvg(sproze.cfr_renamed_158(arg0));
    }
}

