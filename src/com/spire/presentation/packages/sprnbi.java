/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.AlgorithmParameters;

public class sprnbi {
    private /* synthetic */ sprnbi() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprco cfr_renamed_2383(AlgorithmParameters arg0) throws IOException {
        try {
            return sprxgf.cfr_renamed_184(arg0.getEncoded("ASN.1"));
        }
        catch (Exception exception) {
            return sprxgf.cfr_renamed_184(arg0.getEncoded());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7434(AlgorithmParameters arg0, sprco arg1) throws IOException {
        try {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91(), "ASN.1");
            return;
        }
        catch (Exception exception) {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91());
            return;
        }
    }
}

