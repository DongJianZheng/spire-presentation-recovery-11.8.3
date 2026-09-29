/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprojn;
import com.spire.presentation.packages.sprqif;
import com.spire.presentation.packages.sprssf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzuo;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class spresf
extends KeyFactorySpi
implements sprcn {
    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprssf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprqif) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprojn.cfr_renamed_9("\u001650.3+,)7>'{(>:{7\"3>y{")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprzuo.cfr_renamed_9(";>\u0005>\u0001'\u0000p\u00055\u0017p\u001d \u000b3\u00076\u00073\u000f$\u0007?\u0000jN")).append(arg1).append(".").toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprojn.cfr_renamed_9("\u000e-(6+341/&?c0&\"c(3> 2%2 :72,5y{")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_5653(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprzuo.cfr_renamed_9(";>\u0005>\u0001'\u0000p\u00055\u0017p\u001d \u000b3\u00076\u00073\u000f$\u0007?\u0000jN")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_3215(sprvhm.cfr_renamed_23(byArray));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprqif(arg0);
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprssf(arg0);
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprssf || arg0 instanceof sprqif) {
            return arg0;
        }
        throw new InvalidKeyException(sprojn.cfr_renamed_9("\u001650.3+,)7>'{(>:{7\"3>"));
    }
}

