/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmk;
import com.spire.presentation.packages.sprtzd;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

public class spramd
implements sprmk {
    private static final String cfr_renamed_4 = "1.2.840.113549.1.9.16.3.8";

    @Override
    public OutputStream cfr_renamed_1442(OutputStream arg0) {
        return new DeflaterOutputStream(arg0);
    }

    @Override
    public sprije cfr_renamed_615() {
        return new sprije(new sprtzd(cfr_renamed_4));
    }
}

