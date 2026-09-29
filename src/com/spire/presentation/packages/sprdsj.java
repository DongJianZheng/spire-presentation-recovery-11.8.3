/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbo;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spremj;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprjdz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprovh;
import com.spire.presentation.packages.sprqyh;
import com.spire.presentation.packages.sprsxh;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxoj;
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

public class sprdsj
extends sprclj {
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprsxh) {
            return new spremj((sprsxh)arg0);
        }
        if (arg0 instanceof DHPrivateKeySpec) {
            return new spremj((DHPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
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
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            return new spremj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            return new spremj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprgt.cfr_renamed_152)) {
            return new spremj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprqyh.cfr_renamed_9("Q]W^BXDY]\u0011YUU_DXVXUC\u0010")).append(sprlem2).append(sprjdz.cfr_renamed_9(">qp8u}g8pwj8l}}wyvwk{|")).toString());
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            return new sprxoj((DHPublicKey)arg0);
        }
        if (arg0 instanceof DHPrivateKey) {
            return new spremj((DHPrivateKey)arg0);
        }
        if (arg0 instanceof sprdj) {
            return new sprxoj((sprdj)arg0);
        }
        if (arg0 instanceof sprbo) {
            return new spremj((sprbo)arg0);
        }
        throw new InvalidKeyException(sprqyh.cfr_renamed_9("ZUH\u0010EIAU\u0011E_[__F^"));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprovh) {
            return new sprxoj((sprovh)arg0);
        }
        if (arg0 instanceof DHPublicKeySpec) {
            return new sprxoj((DHPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            return new sprxoj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            return new sprxoj(arg0);
        }
        if (sprlem2.cfr_renamed_5078(sprgt.cfr_renamed_152)) {
            return new sprxoj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprjdz.cfr_renamed_9("yr\u007fqjwlvu>qz}plw~w}l8")).append(sprlem2).append(sprqyh.cfr_renamed_9("\u0011Y_\u0010ZUH\u0010__E\u0010CUR_V^XCTT")).toString());
    }
}

