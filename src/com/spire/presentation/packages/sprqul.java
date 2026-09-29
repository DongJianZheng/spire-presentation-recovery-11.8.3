/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprsol;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.OutputStream;

public class sprqul {
    private sprsol cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqtm cfr_renamed_10954(char[] arg0, sprvhm arg1) throws sprcsl {
        sprsf sprsf2 = this.cfr_renamed_4.cfr_renamed_1480(arg0);
        OutputStream outputStream = sprsf2.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg1.cfr_renamed_104("DER"));
            outputStream2.close();
            return new sprqtm(sprsf2.cfr_renamed_615(), new sprdye(sprsf2.cfr_renamed_1472()));
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprfke.cfr_renamed_9("_3Y.J?S$Tk_%Y$^\"T,\u001a&[(\u001a\"T;O?\u0000k")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprqul(sprsol sprsol2) {
        this.cfr_renamed_4 = sprsol2;
    }
}

