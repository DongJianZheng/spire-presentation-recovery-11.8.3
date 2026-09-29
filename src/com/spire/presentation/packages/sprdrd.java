/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprejy;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sprpve;
import java.io.IOException;
import java.io.OutputStream;

public class sprdrd {
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
            throw new sprjod(new StringBuilder().insert(0, sprejy.cfr_renamed_9("\u0002\u0007\u0016\u000b\u001b\fW\u001d\u0018I3,%I\u0012\u0007\u0014\u0006\u0013\fW\u0006\u0015\u0003\u0012\n\u0003SW")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

