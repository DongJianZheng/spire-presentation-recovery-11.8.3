/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboe;
import com.spire.presentation.packages.sprgh;
import com.spire.presentation.packages.sprgqg;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprng;
import java.io.IOException;
import java.io.Writer;

public class sprnpg
extends sprlfg {
    public void cfr_renamed_1591(Object arg0) throws IOException {
        this.cfr_renamed_7497(arg0, null);
    }

    public sprnpg(Writer arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_7497(Object arg0, sprgh arg1) throws IOException {
        try {
            super.cfr_renamed_5198(new sprgqg(arg0, arg1));
            return;
        }
        catch (sprboe sprboe2) {
            if (sprboe2.getCause() instanceof IOException) {
                throw (IOException)sprboe2.getCause();
            }
            throw sprboe2;
        }
    }

    @Override
    public void cfr_renamed_5198(sprng arg0) throws IOException {
        super.cfr_renamed_5198(arg0);
    }
}

