/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdlm;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprxno;
import com.spire.presentation.packages.sprzw;
import java.io.IOException;

public class sprfhl
implements sprzw {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_10692(sprddm arg0, int arg1, byte[] arg2) {
        sprdlm sprdlm2 = new sprdlm(arg0, arg2, sprpxe.cfr_renamed_453(arg1));
        try {
            return sprdlm2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprxno.cfr_renamed_9("4@\u0000L\rKAZ\u000e\u000e\u0002\\\u0004O\u0015KAe%hAC\u0000Z\u0004\\\bO\r\u0014A")).append(iOException).toString());
        }
    }
}

