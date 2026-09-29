/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprccn
implements sprzy {
    private sprden cfr_renamed_4;

    public sprccn(sprden sprden2) {
        this.cfr_renamed_4 = sprden2;
    }

    @Override
    public sprco cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    public static sprufn cfr_renamed_11307(sprden arg0) throws IOException {
        return new sprufn(arg0.cfr_renamed_4789());
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprccn.cfr_renamed_11307(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new sprhbn(iOException.getMessage(), iOException);
        }
    }
}

