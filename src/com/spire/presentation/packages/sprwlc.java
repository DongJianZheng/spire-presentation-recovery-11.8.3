/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprkb;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnhc;
import com.spire.presentation.packages.sprqgc;
import com.spire.presentation.packages.sprqsb;
import com.spire.presentation.packages.sprsb;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprxtb;
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

public class sprwlc
extends sprknc {
    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            return new sprnhc((DHPublicKey)arg0);
        }
        if (arg0 instanceof DHPrivateKey) {
            return new sprqgc((DHPrivateKey)arg0);
        }
        if (arg0 instanceof sprsb) {
            return new sprnhc((sprsb)arg0);
        }
        if (arg0 instanceof sprkb) {
            return new sprqgc((sprkb)arg0);
        }
        throw new InvalidKeyException(SaveToPdfOption.cfr_renamed_9(".\u000b<N1\u00175\u000be\u001b+\u0005+\u00012\u0000"));
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
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprqsb) {
            return new sprqgc((sprqsb)arg0);
        }
        if (arg0 instanceof DHPrivateKeySpec) {
            return new sprqgc((DHPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            return new sprqgc(arg0);
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            return new sprqgc(arg0);
        }
        if (sprtzd2.equals(sprdh.cfr_renamed_91)) {
            return new sprqgc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprutf.cfr_renamed_9(":\f<\u000f)\t/\b6@2\u0004>\u000e/\t=\t>\u0012{")).append(sprtzd2).append(SaveToPdfOption.cfr_renamed_9("e\u0007+N.\u000b<N+\u00011N7\u000b&\u0001\"\u0000,\u001d \n")).toString());
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            return new sprnhc(arg0);
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            return new sprnhc(arg0);
        }
        if (sprtzd2.equals(sprdh.cfr_renamed_91)) {
            return new sprnhc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprutf.cfr_renamed_9(":\f<\u000f)\t/\b6@2\u0004>\u000e/\t=\t>\u0012{")).append(sprtzd2).append(SaveToPdfOption.cfr_renamed_9("e\u0007+N.\u000b<N+\u00011N7\u000b&\u0001\"\u0000,\u001d \n")).toString());
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprxtb) {
            return new sprnhc((sprxtb)arg0);
        }
        if (arg0 instanceof DHPublicKeySpec) {
            return new sprnhc((DHPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }
}

