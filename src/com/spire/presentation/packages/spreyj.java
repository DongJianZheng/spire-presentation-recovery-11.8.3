/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprvhf;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

public class spreyj
extends OutputStream {
    private Signature cfr_renamed_4;

    public spreyj(Signature signature) {
        this.cfr_renamed_4 = signature;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(int arg0) throws IOException {
        try {
            this.cfr_renamed_4.update((byte)arg0);
            return;
        }
        catch (SignatureException signatureException) {
            throw sprvhf.cfr_renamed_5212(signatureException.getMessage(), signatureException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            this.cfr_renamed_4.update(arg0, arg1, arg2);
            return;
        }
        catch (SignatureException signatureException) {
            throw sprvhf.cfr_renamed_5212(signatureException.getMessage(), signatureException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] arg0) throws IOException {
        try {
            this.cfr_renamed_4.update(arg0);
            return;
        }
        catch (SignatureException signatureException) {
            throw sprvhf.cfr_renamed_5212(signatureException.getMessage(), signatureException);
        }
    }
}

