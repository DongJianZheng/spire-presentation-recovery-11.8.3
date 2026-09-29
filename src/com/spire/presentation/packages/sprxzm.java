/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprmfn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.InputStream;

public class sprxzm
implements sprme {
    private sprmfn cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return new sprfvg(this.cfr_renamed_4.cfr_renamed_954());
    }

    public sprxzm(sprmfn sprmfn2) {
        this.cfr_renamed_4 = sprmfn2;
    }

    @Override
    public InputStream cfr_renamed_698() {
        return this.cfr_renamed_4;
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
            throw new sprhbn(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("J5F\u0002`\u001fs\u000ej\u0015mZ`\u0015m\ff\bw\u0013m\u001d#\tw\bf\u001bnZw\u0015#\u0018z\u000efZb\bq\u001bz@#")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

