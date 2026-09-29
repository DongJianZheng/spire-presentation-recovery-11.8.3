/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToImageOption;
import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprczj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfwe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzbk;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprttj
extends sprclj {
    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            return new sprczj((DHPublicKey)arg0);
        }
        if (arg0 instanceof DHPrivateKey) {
            return new sprzbk((DHPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprfwe.cfr_renamed_9("@kR._w[k\u000b{EeEa\\`"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            return new sprzbk(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            return new sprzbk(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, SaveToImageOption.cfr_renamed_9("h\u000bn\b{\u000e}\u000fdG`\u0003l\t}\u000eo\u000el\u0015)")).append(sprlem2).append(sprfwe.cfr_renamed_9("\u000bgE.@kR.Ea_.YkHaL`B}Nj")).toString());
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(DHPrivateKeySpec.class) && arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (arg1.isAssignableFrom(DHPublicKeySpec.class) && arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof DHPublicKeySpec)) {
            return super.engineGeneratePublic(arg0);
        }
        try {
            return new sprczj((DHPublicKeySpec)arg0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprboj(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            return new sprczj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            return new sprczj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, SaveToImageOption.cfr_renamed_9("h\u000bn\b{\u000e}\u000fdG`\u0003l\t}\u000eo\u000el\u0015)")).append(sprlem2).append(sprfwe.cfr_renamed_9("\u000bgE.@kR.Ea_.YkHaL`B}Nj")).toString());
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DHPrivateKeySpec) {
            return new sprzbk((DHPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }
}

