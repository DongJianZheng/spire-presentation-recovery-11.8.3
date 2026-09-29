/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhln;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprruj;
import java.io.IOException;
import java.security.SignatureException;

public class sprjck
extends sprruj {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprjck sprjck2 = this;
        byte[] byArray = sproug.cfr_renamed_23(super.engineSign()).cfr_renamed_186();
        sprjck2.cfr_renamed_2505(byArray);
        try {
            return new sprfvg(byArray).cfr_renamed_91();
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
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        byte[] byArray = null;
        try {
            byArray = ((sproug)sproug.cfr_renamed_184(arg0)).cfr_renamed_186();
        }
        catch (IOException iOException) {
            throw new SignatureException(sprhln.cfr_renamed_9("b{ufu)cldfc`in'znnihs|ul'k~}bz)"));
        }
        this.cfr_renamed_2505(byArray);
        try {
            return super.engineVerify(new sprfvg(byArray).cfr_renamed_91());
        }
        catch (SignatureException signatureException) {
            throw signatureException;
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }
}

