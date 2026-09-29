/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprzse;
import java.io.IOException;
import java.io.InputStream;

public class sprfue
implements sprwf {
    private sprkwe cfr_renamed_4;

    @Override
    public InputStream cfr_renamed_698() {
        return new sprzse(this.cfr_renamed_4);
    }

    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        return new sprnle(sprbsa.cfr_renamed_471(this.cfr_renamed_698()));
    }

    public sprfue(sprkwe sprkwe2) {
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
            throw new spraqe(new StringBuilder().insert(0, sprseca.cfr_renamed_9("?[3l\u0015q\u0006`\u001f{\u00184\u0015{\u0018b\u0013f\u0002}\u0018sVg\u0002f\u0013u\u001b4\u0002{Vv\u000f`\u00134\u0017f\u0004u\u000f.V")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

