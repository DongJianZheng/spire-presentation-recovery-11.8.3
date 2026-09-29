/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprksc;
import com.spire.presentation.packages.sprlyc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvhb;
import com.spire.presentation.packages.sprwcq;
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

public class sprvad
extends sprknc {
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DHPublicKeySpec) {
            return new sprksc((DHPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            return new sprksc(arg0);
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            return new sprksc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprvhb.cfr_renamed_9("\u0003I\u0005J\u0010L\u0016M\u000f\u0005\u000bA\u0007K\u0016L\u0004L\u0007WB")).append(sprtzd2).append(sprwcq.cfr_renamed_9("76y\u007f|:n\u007fy0c\u007fe:t0p1~,r;")).toString());
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            return new sprlyc(arg0);
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            return new sprlyc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprvhb.cfr_renamed_9("\u0003I\u0005J\u0010L\u0016M\u000f\u0005\u000bA\u0007K\u0016L\u0004L\u0007WB")).append(sprtzd2).append(sprwcq.cfr_renamed_9("76y\u007f|:n\u007fy0c\u007fe:t0p1~,r;")).toString());
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

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            return new sprksc((DHPublicKey)arg0);
        }
        if (arg0 instanceof DHPrivateKey) {
            return new sprlyc((DHPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprvhb.cfr_renamed_9("N\u0007\\BQ\u001bU\u0007\u0005\u0017K\tK\rR\f"));
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DHPrivateKeySpec) {
            return new sprlyc((DHPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }
}

