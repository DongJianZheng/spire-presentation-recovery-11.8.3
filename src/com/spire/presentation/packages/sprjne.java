/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprouba;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprzre;
import java.io.IOException;
import java.io.InputStream;

public class sprjne
implements sprwf {
    private sprzre cfr_renamed_4;

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
            throw new spraqe(new StringBuilder().insert(0, sprouba.cfr_renamed_9("BSNdhy{hbse<hsejnn\u007fue{+o\u007fnn}f<\u007fs+~rhn<jny}r&+")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    @Override
    public InputStream cfr_renamed_698() {
        return this.cfr_renamed_4;
    }

    public sprjne(sprzre sprzre2) {
        this.cfr_renamed_4 = sprzre2;
    }

    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        return new sprlqe(this.cfr_renamed_4.cfr_renamed_954());
    }
}

