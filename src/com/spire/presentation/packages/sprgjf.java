/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprlmf;
import com.spire.presentation.packages.sprmlf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwtz;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvc;
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

public class sprgjf
extends KeyFactorySpi
implements sprcn {
    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprlmf(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("A\u000b\u007f\u000b{\u0012zE\u007f\u0000mEg\u0015q\u0006}\u0003}\u0006u\u0011}\nz_4")).append(arg0).append(".").toString());
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
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprlmf || arg0 instanceof sprmlf) {
            return arg0;
        }
        throw new InvalidKeyException(sprxvc.cfr_renamed_9("\u0004q\"j!o>m%z5?:z(?%f!z"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("A\u000bg\u0010d\u0015{\u0017`\u0000pE\u007f\u0000mEg\u0015q\u0006}\u0003}\u0006u\u0011}\nz_4")).append(arg0.getClass()).append(".").toString());
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
        if (arg0 instanceof sprlmf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprmlf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("\u0004q\"j!o>m%z5?:z(?%f!zk?")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("A\u000b\u007f\u000b{\u0012zE\u007f\u0000mEg\u0015q\u0006}\u0003}\u0006u\u0011}\nz_4")).append(arg1).append(".").toString());
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprmlf(arg0);
    }
}

