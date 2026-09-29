/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfxc;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprtbd;
import com.spire.presentation.packages.sprtzc;
import com.spire.presentation.packages.sprtzd;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class spriwc
extends sprknc {
    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtbd.cfr_renamed_2514(sprtzd2)) {
            return new sprfxc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprjaaa.cfr_renamed_9("\u0000#\u0006 \u0013&\u0015'\fo\b+\u0004!\u0015&\u0007&\u0004=A")).append(sprtzd2).append(sprbyfa.cfr_renamed_9("m;#r&74r#=9r?7.=*<$!(6")).toString());
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(DSAPublicKeySpec.class) && arg0 instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (arg1.isAssignableFrom(DSAPrivateKeySpec.class) && arg0 instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DSAPublicKey) {
            return new sprtzc((DSAPublicKey)arg0);
        }
        if (arg0 instanceof DSAPrivateKey) {
            return new sprfxc((DSAPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprjaaa.cfr_renamed_9("$\u00046A;\u0018?\u0004o\u0014!\n!\u000e8\u000f"));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DSAPublicKeySpec) {
            return new sprtzc((DSAPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DSAPrivateKeySpec) {
            return new sprfxc((DSAPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtbd.cfr_renamed_2514(sprtzd2)) {
            return new sprtzc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprbyfa.cfr_renamed_9("3!5\" $&%?m;)7#&$4$7?r")).append(sprtzd2).append(sprjaaa.cfr_renamed_9("o\b!A$\u00046A!\u000e;A=\u0004,\u000e(\u000f&\u0012*\u0005")).toString());
    }
}

