/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprflc;
import com.spire.presentation.packages.sprhkc;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprrbia;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwtba;
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

public class sprlic
extends sprknc {
    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        throw new InvalidKeyException(sprrbia.cfr_renamed_9("\u000f\t\u001dL\u0010\u0015\u0014\tD\u0019\n\u0007\n\u0003\u0013\u0002"));
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprji.cfr_renamed_4)) {
            return new sprhkc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprwtba.cfr_renamed_9(">T8W-Q+P2\u00186\\:V+Q9Q:J\u007f")).append(sprtzd2).append(sprrbia.cfr_renamed_9("D\u0005\nL\u000f\t\u001dL\n\u0003\u0010L\u0016\t\u0007\u0003\u0003\u0002\r\u001f\u0001\b")).toString());
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtzd2.equals(sprji.cfr_renamed_4)) {
            return new sprflc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprwtba.cfr_renamed_9(">T8W-Q+P2\u00186\\:V+Q9Q:J\u007f")).append(sprtzd2).append(sprrbia.cfr_renamed_9("D\u0005\nL\u000f\t\u001dL\n\u0003\u0010L\u0016\t\u0007\u0003\u0003\u0002\r\u001f\u0001\b")).toString());
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprkkb) {
            return new sprhkc((sprkkb)arg0);
        }
        if (arg0 instanceof ECPublicKeySpec) {
            return new sprhkc((ECPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprhqb) {
            return new sprflc((sprhqb)arg0);
        }
        if (arg0 instanceof ECPrivateKeySpec) {
            return new sprflc((ECPrivateKeySpec)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(ECPublicKeySpec.class) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            sprlpb sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            return new ECPublicKeySpec(eCPublicKey.getW(), sprijc.cfr_renamed_2311(sprijc.cfr_renamed_2114(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_2113()), sprlpb2));
        }
        if (arg1.isAssignableFrom(ECPrivateKeySpec.class) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            sprlpb sprlpb3 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), sprijc.cfr_renamed_2311(sprijc.cfr_renamed_2114(sprlpb3.cfr_renamed_1769(), sprlpb3.cfr_renamed_2113()), sprlpb3));
        }
        if (arg1.isAssignableFrom(sprkkb.class) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new sprkkb(sprijc.cfr_renamed_2313(eCPublicKey.getParams(), eCPublicKey.getW(), false), sprijc.cfr_renamed_2328(eCPublicKey.getParams(), false));
            }
            sprlpb sprlpb4 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            return new sprkkb(sprijc.cfr_renamed_2313(eCPublicKey.getParams(), eCPublicKey.getW(), false), sprlpb4);
        }
        if (arg1.isAssignableFrom(sprhqb.class) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new sprhqb(eCPrivateKey.getS(), sprijc.cfr_renamed_2328(eCPrivateKey.getParams(), false));
            }
            sprlpb sprlpb5 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            return new sprhqb(eCPrivateKey.getS(), sprlpb5);
        }
        return super.engineGetKeySpec(arg0, arg1);
    }
}

