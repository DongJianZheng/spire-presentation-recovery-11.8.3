/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprgoj;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtea;
import java.security.cert.CertificateEncodingException;

@sprtea
public class sprnhj
extends sprgoj {
    private final byte[] cfr_renamed_2;
    private final CertificateEncodingException cfr_renamed_4;

    @Override
    public byte[] getEncoded() throws CertificateEncodingException {
        if (null != this.cfr_renamed_4) {
            throw this.cfr_renamed_4;
        }
        if (null == this.cfr_renamed_2) {
            throw new CertificateEncodingException();
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnhj(sprrr sprrr2, sprndm sprndm2, sprbcm sprbcm2, boolean[] blArray, String string, byte[] byArray, byte[] byArray2, CertificateEncodingException certificateEncodingException) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnhj sprnhj2 = this;
        super((sprrr)arg0, (sprndm)arg1, (sprbcm)arg2, (boolean[])arg3, (String)arg4, (byte[])arg5);
        sprnhj2.cfr_renamed_2 = arg6;
        sprnhj2.cfr_renamed_4 = certificateEncodingException;
    }
}

