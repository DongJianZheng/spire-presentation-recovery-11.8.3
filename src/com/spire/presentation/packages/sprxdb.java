/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhza;
import com.spire.presentation.packages.sprkbb;
import com.spire.presentation.packages.sprna;
import com.spire.presentation.packages.sprq;
import com.spire.presentation.packages.sprqla;
import java.io.IOException;
import java.io.Writer;

public class sprxdb
extends sprkbb {
    public void cfr_renamed_1591(Object arg0) throws IOException {
        this.cfr_renamed_1592(arg0, null);
    }

    @Override
    public void cfr_renamed_481(sprq arg0) throws IOException {
        super.cfr_renamed_481(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_1592(Object arg0, sprna arg1) throws IOException {
        try {
            super.cfr_renamed_481(new sprhza(arg0, arg1));
            return;
        }
        catch (sprqla sprqla2) {
            if (sprqla2.getCause() instanceof IOException) {
                throw (IOException)sprqla2.getCause();
            }
            throw sprqla2;
        }
    }

    public sprxdb(Writer arg0) {
        super(arg0);
    }
}

