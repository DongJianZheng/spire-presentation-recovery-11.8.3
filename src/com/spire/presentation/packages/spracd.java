/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprcwc;
import com.spire.presentation.packages.sprgue;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprunfa;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.spryc;
import java.io.IOException;
import java.io.OutputStream;

public class spracd {
    private sprgue cfr_renamed_4;

    public spracd(sprgue sprgue2) {
        this.cfr_renamed_4 = sprgue2;
    }

    public sprgue cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public spracd(byte[] arg0) throws IOException {
        this(spracd.cfr_renamed_1443(arg0));
    }

    public sprvae cfr_renamed_2572() {
        return this.cfr_renamed_4.cfr_renamed_2573().cfr_renamed_1157();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprgue cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprgue.cfr_renamed_23(arg0);
        }
        catch (ClassCastException classCastException) {
            throw new sprcwc(new StringBuilder().insert(0, sprunfa.cfr_renamed_9("Y\u0005X\u0002[\u0016Y\u0001PDP\u0005@\u0005\u000eD")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcwc(new StringBuilder().insert(0, sprbye.cfr_renamed_9("endig}ejl/ln|n2/")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (spraqe spraqe2) {
            if (spraqe2.getCause() instanceof IOException) {
                throw (IOException)spraqe2.getCause();
            }
            throw new sprcwc(new StringBuilder().insert(0, sprunfa.cfr_renamed_9("Y\u0005X\u0002[\u0016Y\u0001PDP\u0005@\u0005\u000eD")).append(spraqe2.getMessage()).toString(), spraqe2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_2574(spryc arg0) throws spriad {
        try {
            spryc spryc2 = arg0;
            OutputStream outputStream = spryc2.cfr_renamed_470();
            spracd spracd2 = this;
            outputStream.write(spracd2.cfr_renamed_4.cfr_renamed_2573().cfr_renamed_104("DER"));
            outputStream.close();
            return spryc2.cfr_renamed_1435(spracd2.cfr_renamed_4.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new spriad(new StringBuilder().insert(0, sprbye.cfr_renamed_9("zfnjcm/|`(\u007fz`kj{|(|ahfn|zzj2/")).append(exception.getMessage()).toString(), exception);
        }
    }
}

