/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafba;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprkbz;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class sprwmj
extends KeyFactorySpi {
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof X509EncodedKeySpec) {
            sprvhm sprvhm2;
            block4: {
                try {
                    sprvhm2 = sprvhm.cfr_renamed_23(((X509EncodedKeySpec)arg0).getEncoded());
                    PublicKey publicKey = sprsci.cfr_renamed_5726(sprvhm2);
                    if (publicKey == null) break block4;
                    return publicKey;
                }
                catch (Exception exception) {
                    throw new InvalidKeySpecException(exception.toString());
                }
            }
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprafba.cfr_renamed_9("\u000e)@ \u0001%\u0014)\u0012?@ \u000f3\u000e\"@ \u000f4@\t)\u0002Zf")).append(sprvhm2.cfr_renamed_593().cfr_renamed_593()).toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprkbz.cfr_renamed_9("tmJmNtO#jfXPQfB#UzQf\u001b#")).append(arg0.getClass().getName()).toString());
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(PKCS8EncodedKeySpec.class) && arg0.getFormat().equals(sprafba.cfr_renamed_9("0\r#\u0015C~"))) {
            return new PKCS8EncodedKeySpec(arg0.getEncoded());
        }
        if (arg1.isAssignableFrom(X509EncodedKeySpec.class) && arg0.getFormat().equals(sprkbz.cfr_renamed_9("[\u000f6\u0011:"))) {
            return new X509EncodedKeySpec(arg0.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprafba.cfr_renamed_9("\u000e)\u0014f\t+\u0010*\u0005+\u0005(\u0014#\u0004f\u0019#\u0014f")).append(arg0).append(" ").append(arg1).toString());
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        throw new InvalidKeyException(new StringBuilder().insert(0, sprkbz.cfr_renamed_9("OlU#HnQoDnDmUfE#XfU#")).append(arg0).toString());
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof PKCS8EncodedKeySpec) {
            sprcom sprcom2;
            block4: {
                try {
                    sprcom2 = sprcom.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded());
                    PrivateKey privateKey = sprsci.cfr_renamed_5729(sprcom2);
                    if (privateKey == null) break block4;
                    return privateKey;
                }
                catch (Exception exception) {
                    throw new InvalidKeySpecException(exception.toString());
                }
            }
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprafba.cfr_renamed_9("\u000e)@ \u0001%\u0014)\u0012?@ \u000f3\u000e\"@ \u000f4@\t)\u0002Zf")).append(sprcom2.cfr_renamed_1254().cfr_renamed_593()).toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprkbz.cfr_renamed_9("tmJmNtO#jfXPQfB#UzQf\u001b#")).append(arg0.getClass().getName()).toString());
    }
}

