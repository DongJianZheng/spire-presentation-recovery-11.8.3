/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprzt;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

public class sprgml
implements sprzt {
    @Override
    public OutputStream cfr_renamed_1442(OutputStream arg0) {
        return new DeflaterOutputStream(arg0);
    }

    @Override
    public sprddm cfr_renamed_615() {
        return new sprddm(sprgz.cfr_renamed_112);
    }
}

