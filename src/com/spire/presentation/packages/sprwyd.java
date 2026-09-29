/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprjrf;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryae;
import java.io.IOException;
import java.io.OutputStream;

public class sprwyd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_571(spryae arg0, sprtzd arg1, boolean arg2, spra arg3) throws sprqwd {
        try {
            arg0.cfr_renamed_6(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new sprqwd(new StringBuilder().insert(0, sprbva.cfr_renamed_9("pC}L|V3G}A|Fv\u0002vZgG}QzM}\u00183")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_4329(spra arg0, OutputStream arg1) {
        sprpve sprpve2 = new sprpve(arg1);
        try {
            sprpve sprpve3 = sprpve2;
            sprpve3.cfr_renamed_2149(arg0);
            sprpve3.cfr_renamed_2637();
            return;
        }
        catch (IOException iOException) {
            throw new sprfvd(new StringBuilder().insert(0, sprjrf.cfr_renamed_9("\u0003{\u0017w\u001apVa\u001952P$5\u0013{\u0015z\u0012pVz\u0014\u007f\u0013v\u0002/V")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

