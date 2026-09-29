/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcmk;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.sprmgk;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprnkj;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprrnr;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprxnc;
import com.spire.presentation.packages.spryye;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

public class sprsoj
extends SignatureSpi {
    private static final byte[] cfr_renamed_2 = new byte[0];
    private final String cfr_renamed_3;
    private sprvm cfr_renamed_4;

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprsoj sprsoj2;
        spryye spryye2 = sprsoj.cfr_renamed_9417(arg0);
        if (spryye2 instanceof sprnuk) {
            sprsoj sprsoj3 = this;
            sprsoj2 = sprsoj3;
            sprsoj3.cfr_renamed_4 = sprsoj3.cfr_renamed_9418("Ed25519");
        } else if (spryye2 instanceof sprpxk) {
            sprsoj sprsoj4 = this;
            sprsoj2 = sprsoj4;
            sprsoj4.cfr_renamed_4 = sprsoj4.cfr_renamed_9418("Ed448");
        } else {
            throw new IllegalStateException(sprrnr.cfr_renamed_9("0@6[5^*\\1K!\u000e5['B,MeE WeZ<^ "));
        }
        sprsoj2.cfr_renamed_4.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    private /* synthetic */ sprvm cfr_renamed_9418(String arg0) throws InvalidKeyException {
        if (this.cfr_renamed_3 != null && !arg0.equals(this.cfr_renamed_3)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprxnc.cfr_renamed_9("J/B1S3L1Q(B5FaH$ZaE.Qa")).append(this.cfr_renamed_3).toString());
        }
        if (arg0.equals("Ed448")) {
            return new sprcmk(cfr_renamed_2);
        }
        return new sprmgk();
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    private static /* synthetic */ spryye cfr_renamed_9419(PrivateKey arg0) throws InvalidKeyException {
        return sprnkj.cfr_renamed_1220(arg0);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) throws InvalidParameterException {
        throw new UnsupportedOperationException(sprrnr.cfr_renamed_9("K+I,@ } Z\u0015O7O(K1K7\u000e0@6[5^*\\1K!"));
    }

    @Override
    public Object engineGetParameter(String arg0) throws InvalidParameterException {
        throw new UnsupportedOperationException(sprxnc.cfr_renamed_9("F/D(M$d$W\u0011B3B,F5F3\u00034M2V1S.Q5F%"));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    private static /* synthetic */ spryye cfr_renamed_9417(PublicKey arg0) throws InvalidKeyException {
        return sprnkj.cfr_renamed_1216(arg0);
    }

    public sprsoj(String string) {
        this.cfr_renamed_3 = string;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprsoj sprsoj2;
        spryye spryye2 = sprsoj.cfr_renamed_9419(arg0);
        if (spryye2 instanceof sprbyk) {
            sprsoj sprsoj3 = this;
            sprsoj2 = sprsoj3;
            sprsoj3.cfr_renamed_4 = sprsoj3.cfr_renamed_9418("Ed25519");
        } else if (spryye2 instanceof sprhzk) {
            sprsoj sprsoj4 = this;
            sprsoj2 = sprsoj4;
            sprsoj4.cfr_renamed_4 = sprsoj4.cfr_renamed_9418("Ed448");
        } else {
            throw new IllegalStateException(sprrnr.cfr_renamed_9("[+]0^5A7Z Je^7G3O1KeE WeZ<^ "));
        }
        sprsoj2.cfr_renamed_4.cfr_renamed_5535(true, spryye2);
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            return this.cfr_renamed_4.cfr_renamed_1329();
        }
        catch (sprmml sprmml2) {
            throw new SignatureException(sprmml2.getMessage());
        }
    }
}

