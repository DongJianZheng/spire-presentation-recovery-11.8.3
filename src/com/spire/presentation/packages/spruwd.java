/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprmiaa;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprsxd;
import com.spire.presentation.packages.sprzod;
import java.io.IOException;
import java.io.OutputStream;

public class spruwd {
    private sprsxd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmoe cfr_renamed_4328(char[] arg0, sprdce arg1) throws sprzod {
        sprha sprha2 = this.cfr_renamed_4.cfr_renamed_1480(arg0);
        OutputStream outputStream = sprha2.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg1.cfr_renamed_104("DER"));
            outputStream2.close();
            return new sprmoe(sprha2.cfr_renamed_615(), new sprmra(sprha2.cfr_renamed_1472()));
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprmiaa.cfr_renamed_9("snusfb\u007fyx6sxuyr\u007fxq6{wu6\u007fxfcb,6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public spruwd(sprsxd sprsxd2) {
        this.cfr_renamed_4 = sprsxd2;
    }
}

