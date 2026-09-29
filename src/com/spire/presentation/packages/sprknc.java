/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprj;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprosda;
import com.spire.presentation.packages.sprshha;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public abstract class sprknc
extends KeyFactorySpi
implements sprj {
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(PKCS8EncodedKeySpec.class) && arg0.getFormat().equals(sprosda.cfr_renamed_9("[wHo(\u0004"))) {
            return new PKCS8EncodedKeySpec(arg0.getEncoded());
        }
        if (arg1.isAssignableFrom(X509EncodedKeySpec.class) && arg0.getFormat().equals(sprshha.cfr_renamed_9("tk\u0019u\u0015"))) {
            return new X509EncodedKeySpec(arg0.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprosda.cfr_renamed_9("eS\u007f\u001cbQ{PnQnR\u007fYo\u001crY\u007f\u001c")).append(arg0).append(" ").append(arg1).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(sprosda.cfr_renamed_9("WnE+O{Yh\u001ceS\u007f\u001cyYhSlRbOnX"));
        }
        try {
            return this.cfr_renamed_1228(sprmke.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(sprshha.cfr_renamed_9("I+O*H HeG Ue_5I&\f+C1\f7I&C\"B,_ H"));
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
            throw new InvalidKeySpecException(sprosda.cfr_renamed_9("WnE+O{Yh\u001ceS\u007f\u001cyYhSlRbOnX"));
        }
        try {
            return this.cfr_renamed_1226(sprdce.cfr_renamed_23(((X509EncodedKeySpec)arg0).getEncoded()));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(sprshha.cfr_renamed_9("I+O*H HeG Ue_5I&\f+C1\f7I&C\"B,_ H"));
        }
    }
}

