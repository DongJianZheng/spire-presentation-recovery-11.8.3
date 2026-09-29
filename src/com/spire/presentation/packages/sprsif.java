/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcpf;
import com.spire.presentation.packages.sprnyq;
import com.spire.presentation.packages.sprpmf;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.sprvhm;
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

public class sprsif
extends KeyFactorySpi
implements sprcn {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprnyq.cfr_renamed_9(",Q\nJ\tO\u0016M\rZ\u001d\u001f\u0012Z\u0000\u001f\nO\u001c\\\u0010Y\u0010\\\u0018K\u0010P\u0017\u0005Y")).append(arg0.getClass()).append(".").toString());
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
        return new sprcpf(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqkh.cfr_renamed_9("gvYv]o\\8Y}K8AhW{[~[{Sl[w\\\"\u0012")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_3215(sprvhm.cfr_renamed_23(byArray));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString(), exception);
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprpmf(arg0);
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprcpf || arg0 instanceof sprpmf) {
            return arg0;
        }
        throw new InvalidKeyException(sprnyq.cfr_renamed_9("j\u0017L\fO\tP\u000bK\u001c[YT\u001cFYK\u0000O\u001c"));
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprcpf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprpmf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqkh.cfr_renamed_9("M\\kGhBw@lW|\u0012sWa\u0012lKhW\"\u0012")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprnyq.cfr_renamed_9(",Q\u0012Q\u0016H\u0017\u001f\u0012Z\u0000\u001f\nO\u001c\\\u0010Y\u0010\\\u0018K\u0010P\u0017\u0005Y")).append(arg1).append(".").toString());
    }
}

