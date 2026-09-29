/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwnf;
import com.spire.presentation.packages.sprwpf;
import com.spire.presentation.packages.sprxgf;
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

public class sprkqf
extends KeyFactorySpi
implements sprcn {
    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprwpf || arg0 instanceof sprwnf) {
            return arg0;
        }
        throw new InvalidKeyException(sprltq.cfr_renamed_9("4\r\u0012\u0016\u0011\u0013\u000e\u0011\u0015\u0006\u0005C\n\u0006\u0018C\u0015\u001a\u0011\u0006"));
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprwpf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprwnf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, spruzy.cfr_renamed_9("0e\u0016~\u0015{\ny\u0011n\u0001+\u000en\u001c+\u0011r\u0015n_+")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprltq.cfr_renamed_9("6\u000f\b\u000f\f\u0016\rA\b\u0004\u001aA\u0010\u0011\u0006\u0002\n\u0007\n\u0002\u0002\u0015\n\u000e\r[C")).append(arg1).append(".").toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, spruzy.cfr_renamed_9("^\u000b`\u000bd\u0012eE`\u0000rEx\u0015n\u0006b\u0003b\u0006j\u0011b\ne_+")).append(arg0).append(".").toString());
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
        return new sprwnf(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprltq.cfr_renamed_9("6\u000f\u0010\u0014\u0013\u0011\f\u0013\u0017\u0004\u0007A\b\u0004\u001aA\u0010\u0011\u0006\u0002\n\u0007\n\u0002\u0002\u0015\n\u000e\r[C")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_5653(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprwpf(arg0);
    }
}

