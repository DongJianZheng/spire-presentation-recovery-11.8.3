/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;

public class sprpme
implements sprbl {
    private sprkwe cfr_renamed_4;

    public sprpme(sprkwe sprkwe2) {
        this.cfr_renamed_4 = sprkwe2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new spraqe(iOException.getMessage(), iOException);
        }
    }

    @Override
    public spra cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        return new sprcwe(this.cfr_renamed_4.cfr_renamed_4789(), false);
    }
}

