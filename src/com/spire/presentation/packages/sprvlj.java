/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprhnj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxlj;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class sprvlj
extends sprclj {
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprnsh) {
            return new sprxlj((sprnsh)arg0, sprsci.cfr_renamed_105);
        }
        if (arg0 instanceof ECPublicKeySpec) {
            return new sprxlj((ECPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        throw new InvalidKeyException(sprnvc.cfr_renamed_9("I;[~V'R;\u0002+L5L1U0"));
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_93)) {
            return new sprxlj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_91)) {
            return new sprxlj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_82)) {
            return new sprxlj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprqgo.cfr_renamed_9("\u0003t\u0005w\u0010q\u0016p\u000f8\u000b|\u0007v\u0016q\u0004q\u0007jB")).append(sprlem2).append(sprnvc.cfr_renamed_9("\u00027L~I;[~L1V~P;A1E0K-G:")).toString());
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_93)) {
            return new sprhnj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_91)) {
            return new sprhnj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_82)) {
            return new sprhnj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprqgo.cfr_renamed_9("\u0003t\u0005w\u0010q\u0016p\u000f8\u000b|\u0007v\u0016q\u0004q\u0007jB")).append(sprlem2).append(sprnvc.cfr_renamed_9("\u00027L~I;[~L1V~P;A1E0K-G:")).toString());
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(ECPublicKeySpec.class) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            sprrxh sprrxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new ECPublicKeySpec(eCPublicKey.getW(), sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_2113()), sprrxh2));
        }
        if (arg1.isAssignableFrom(ECPrivateKeySpec.class) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            sprrxh sprrxh3 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_2113()), sprrxh3));
        }
        if (arg1.isAssignableFrom(sprnsh.class) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new sprnsh(sprnlj.cfr_renamed_9155(eCPublicKey.getParams(), eCPublicKey.getW()), sprnlj.cfr_renamed_9150(eCPublicKey.getParams()));
            }
            sprrxh sprrxh4 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new sprnsh(sprnlj.cfr_renamed_9155(eCPublicKey.getParams(), eCPublicKey.getW()), sprrxh4);
        }
        if (arg1.isAssignableFrom(sprguh.class) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new sprguh(eCPrivateKey.getS(), sprnlj.cfr_renamed_9150(eCPrivateKey.getParams()));
            }
            sprrxh sprrxh5 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new sprguh(eCPrivateKey.getS(), sprrxh5);
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprguh) {
            return new sprhnj((sprguh)arg0);
        }
        if (arg0 instanceof ECPrivateKeySpec) {
            return new sprhnj((ECPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }
}

