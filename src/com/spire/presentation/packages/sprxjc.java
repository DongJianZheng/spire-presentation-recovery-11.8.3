/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasy;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprmke;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class sprxjc
extends KeyFactorySpi {
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(PKCS8EncodedKeySpec.class) && arg0.getFormat().equals(sprasy.cfr_renamed_9("\u0005c\u0016{v\u0010"))) {
            return new PKCS8EncodedKeySpec(arg0.getEncoded());
        }
        if (arg1.isAssignableFrom(X509EncodedKeySpec.class) && arg0.getFormat().equals(sprdkea.cfr_renamed_9("P?=!1"))) {
            return new X509EncodedKeySpec(arg0.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprasy.cfr_renamed_9(";G!\b<E%D0E0F!M1\b,M!\b")).append(arg0).append(" ").append(arg1).toString());
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        throw new InvalidKeyException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("\u007fge(xeadtetfemu(hme(")).append(arg0).toString());
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof X509EncodedKeySpec) {
            sprdce sprdce2;
            block4: {
                try {
                    sprdce2 = sprdce.cfr_renamed_23(((X509EncodedKeySpec)arg0).getEncoded());
                    PublicKey publicKey = sprbrb.cfr_renamed_1255(sprdce2);
                    if (publicKey == null) break block4;
                    return publicKey;
                }
                catch (Exception exception) {
                    throw new InvalidKeySpecException(exception.toString());
                }
            }
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprasy.cfr_renamed_9(";GuN4K!G'QuN:];LuN:Zug\u001clo\b")).append(sprdce2.cfr_renamed_593().cfr_renamed_593()).toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("Dfzf~\u007f\u007f(Zmh[amr(eqam+(")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof PKCS8EncodedKeySpec) {
            sprmke sprmke2;
            block4: {
                try {
                    sprmke2 = sprmke.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded());
                    PrivateKey privateKey = sprbrb.cfr_renamed_1253(sprmke2);
                    if (privateKey == null) break block4;
                    return privateKey;
                }
                catch (Exception exception) {
                    throw new InvalidKeySpecException(exception.toString());
                }
            }
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprasy.cfr_renamed_9(";GuN4K!G'QuN:];LuN:Zug\u001clo\b")).append(sprmke2.cfr_renamed_1254().cfr_renamed_593()).toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("Dfzf~\u007f\u007f(Zmh[amr(eqam+(")).append(arg0.getClass().getName()).toString());
    }
}

