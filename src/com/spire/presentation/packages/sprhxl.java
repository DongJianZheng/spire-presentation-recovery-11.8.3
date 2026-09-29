/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spretz;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhtl;
import com.spire.presentation.packages.sprkyp;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprznl;
import java.io.IOException;
import java.io.OutputStream;

public class sprhxl {
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
            throw new sprhtl(new StringBuilder().insert(0, sprkyp.cfr_renamed_9("\u0003\u001a\u0017\u0016\u001a\u0011V\u0000\u0019T21$T\u0013\u001a\u0015\u001b\u0012\u0011V\u001b\u0014\u001e\u0013\u0017\u0002NV")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5280(sprgem arg0, sprlem arg1, boolean arg2, sprco arg3) throws sprznl {
        try {
            arg0.cfr_renamed_4998(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, spretz.cfr_renamed_9("M/@ A:\u000e+@-A*KnK6Z+@=G!@t\u000e")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

