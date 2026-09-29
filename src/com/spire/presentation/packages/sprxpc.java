/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprofc;
import com.spire.presentation.packages.sprtkh;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.security.SignatureException;

public class sprxpc
extends sprofc {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        byte[] byArray = null;
        try {
            byArray = ((sprxue)sprxue.cfr_renamed_184(arg0)).cfr_renamed_186();
        }
        catch (IOException iOException) {
            throw new SignatureException(sprtkh.cfr_renamed_9("\fI\u001bT\u001b\u001b\r^\nT\rR\u0007\\IH\u0000\\\u0007Z\u001dN\u001b^IY\u0010O\fHG"));
        }
        this.cfr_renamed_2505(byArray);
        try {
            return super.engineVerify(new sprlqe(byArray).cfr_renamed_91());
        }
        catch (SignatureException signatureException) {
            throw signatureException;
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprxpc sprxpc2 = this;
        byte[] byArray = sprxue.cfr_renamed_23(super.engineSign()).cfr_renamed_186();
        sprxpc2.cfr_renamed_2505(byArray);
        try {
            return new sprlqe(byArray).cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    public void cfr_renamed_2505(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length / 2) {
            byte by = arg0[n];
            byte[] byArray = arg0;
            byArray[n] = arg0[byArray.length - 1 - n];
            int n3 = arg0.length - 1 - n;
            arg0[n3] = by;
            n2 = ++n;
        }
    }
}

