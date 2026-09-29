/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhrf;
import com.spire.presentation.packages.sprnlf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwry;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryrh;
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

public class sprfsf
extends KeyFactorySpi
implements sprcn {
    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprhrf(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, spryrh.cfr_renamed_9("#\u001e\u0005\u0005\u0006\u0000\u0019\u0002\u0002\u0015\u0012P\u001d\u0015\u000fP\u0005\u0000\u0013\u0013\u001f\u0016\u001f\u0013\u0017\u0004\u001f\u001f\u0018JV")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_5653(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprnlf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprhrf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprwry.cfr_renamed_9("\u0014S2H1M.O5X%\u001d*X8\u001d5D1X{\u001d")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, spryrh.cfr_renamed_9("#\u001e\u001d\u001e\u0019\u0007\u0018P\u001d\u0015\u000fP\u0005\u0000\u0013\u0013\u001f\u0016\u001f\u0013\u0017\u0004\u001f\u001f\u0018JV")).append(arg1).append(".").toString());
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprnlf || arg0 instanceof sprhrf) {
            return arg0;
        }
        throw new InvalidKeyException(sprwry.cfr_renamed_9("\u0014S2H1M.O5X%\u001d*X8\u001d5D1X"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprnlf(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, spryrh.cfr_renamed_9("#\u001e\u001d\u001e\u0019\u0007\u0018P\u001d\u0015\u000fP\u0005\u0000\u0013\u0013\u001f\u0016\u001f\u0013\u0017\u0004\u001f\u001f\u0018JV")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_3215(sprvhm.cfr_renamed_23(byArray));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }
}

