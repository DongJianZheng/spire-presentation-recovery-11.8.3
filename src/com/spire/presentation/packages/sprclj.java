/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdal;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprvhm;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public abstract class sprclj
extends KeyFactorySpi
implements sprcn {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(sprdal.cfr_renamed_9("4\u001c&Y,\t:\u001a\u007f\u00170\r\u007f\u000b:\u001a0\u001e1\u0010%\u001c;"));
        }
        try {
            return this.cfr_renamed_3215(sprvhm.cfr_renamed_23(((X509EncodedKeySpec)arg0).getEncoded()));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqje.cfr_renamed_9("x\u007f~~yty1vtd1naxr=\u007fre=cxrrvsxgty+=")).append(exception.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(sprdal.cfr_renamed_9("4\u001c&Y,\t:\u001a\u007f\u00170\r\u007f\u000b:\u001a0\u001e1\u0010%\u001c;"));
        }
        try {
            return this.cfr_renamed_5653(sprcom.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqje.cfr_renamed_9("x\u007f~~yty1vtd1naxr=\u007fre=cxrrvsxgty+=")).append(exception.getMessage()).toString());
        }
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(PKCS8EncodedKeySpec.class) && arg0.getFormat().equals(sprqje.cfr_renamed_9("AVRN2%"))) {
            return new PKCS8EncodedKeySpec(arg0.getEncoded());
        }
        if (arg1.isAssignableFrom(X509EncodedKeySpec.class) && arg0.getFormat().equals(sprdal.cfr_renamed_9("\u0007WjIf"))) {
            return new X509EncodedKeySpec(arg0.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqje.cfr_renamed_9("\u007fre=xpaqtptsexu=hxe=")).append(arg0).append(" ").append(arg1).toString());
    }
}

