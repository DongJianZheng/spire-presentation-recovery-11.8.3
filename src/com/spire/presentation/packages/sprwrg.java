/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprsm;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sprwrg
implements sprsm {
    private MessageDigest cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprwrg() {
        try {
            this.cfr_renamed_4 = MessageDigest.getInstance("SHA1");
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException(new StringBuilder().insert(0, spraqe.cfr_renamed_9("KhFgG}\boAgL){Ai$\u00193\b")).append(noSuchAlgorithmException.getMessage()).toString());
        }
    }

    @Override
    public byte[] cfr_renamed_580() {
        return this.cfr_renamed_4.digest();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.reset();
    }

    @Override
    public int cfr_renamed_593() {
        return 2;
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return sprrxj.cfr_renamed_7919(this.cfr_renamed_4);
    }
}

