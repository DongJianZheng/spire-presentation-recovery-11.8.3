/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprgon;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprsol;
import com.spire.presentation.packages.sprtlm;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.OutputStream;

public class sprbrl {
    private final sprsol cfr_renamed_4;

    public sprbrl(sprsol sprsol2) {
        this.cfr_renamed_4 = sprsol2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_10956(sprqtm arg0, char[] arg1, sprvhm arg2) throws sprcsl {
        this.cfr_renamed_4.cfr_renamed_10957(sprtlm.cfr_renamed_23(arg0.cfr_renamed_4333().cfr_renamed_284()));
        sprsf sprsf2 = this.cfr_renamed_4.cfr_renamed_1480(arg1);
        OutputStream outputStream = sprsf2.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg2.cfr_renamed_104("DER"));
            outputStream2.close();
            return sproze.cfr_renamed_559(sprsf2.cfr_renamed_1472(), arg0.cfr_renamed_97().cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprgon.cfr_renamed_9("6\u00050\u0018#\t:\u0012=]6\u00130\u00127\u0014=\u001as\u00102\u001es\u0014=\r&\ti]")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

