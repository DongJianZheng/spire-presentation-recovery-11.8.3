/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprgse;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprsxd;
import com.spire.presentation.packages.sprwcs;
import com.spire.presentation.packages.sprzod;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;

public class sprfwd {
    private final sprsxd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4331(sprmoe arg0, char[] arg1, sprdce arg2) throws sprzod {
        this.cfr_renamed_4.cfr_renamed_4332(sprgse.cfr_renamed_23(arg0.cfr_renamed_4333().cfr_renamed_284()));
        sprha sprha2 = this.cfr_renamed_4.cfr_renamed_1480(arg1);
        OutputStream outputStream = sprha2.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg2.cfr_renamed_104("DER"));
            outputStream2.close();
            return sprzra.cfr_renamed_92(sprha2.cfr_renamed_1472(), arg0.cfr_renamed_97().cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprwcs.cfr_renamed_9("K\u000bM\u0016^\u0007G\u001c@SK\u001dM\u001cJ\u001a@\u0014\u000e\u001eO\u0010\u000e\u001a@\u0003[\u0007\u0014S")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprfwd(sprsxd sprsxd2) {
        this.cfr_renamed_4 = sprsxd2;
    }
}

