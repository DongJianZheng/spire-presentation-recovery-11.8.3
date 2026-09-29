/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprj;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprllc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprohc;
import com.spire.presentation.packages.sprrbz;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.spryxaa;
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

public class sprwgc
extends sprknc
implements sprj {
    public String cfr_renamed_3;
    public sprwc cfr_renamed_4;

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprkkb) {
            return new sprohc(this.cfr_renamed_3, (sprkkb)arg0, this.cfr_renamed_4);
        }
        if (arg0 instanceof ECPublicKeySpec) {
            return new sprohc(this.cfr_renamed_3, (ECPublicKeySpec)arg0, this.cfr_renamed_4);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtzd2.equals(sprtk.cfr_renamed_137)) {
            return new sprllc(this.cfr_renamed_3, arg0, this.cfr_renamed_4);
        }
        throw new IOException(new StringBuilder().insert(0, spryxaa.cfr_renamed_9("\\)Z*O,I-PeT!X+I,[,X7\u001d")).append(sprtzd2).append(sprrbz.cfr_renamed_9("H\u0005\u0006L\u0003\t\u0011L\u0006\u0003\u001cL\u001a\t\u000b\u0003\u000f\u0002\u0001\u001f\r\b")).toString());
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprhqb) {
            return new sprllc(this.cfr_renamed_3, (sprhqb)arg0, this.cfr_renamed_4);
        }
        if (arg0 instanceof ECPrivateKeySpec) {
            return new sprllc(this.cfr_renamed_3, (ECPrivateKeySpec)arg0, this.cfr_renamed_4);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprtk.cfr_renamed_137)) {
            return new sprohc(this.cfr_renamed_3, arg0, this.cfr_renamed_4);
        }
        throw new IOException(new StringBuilder().insert(0, spryxaa.cfr_renamed_9("\\)Z*O,I-PeT!X+I,[,X7\u001d")).append(sprtzd2).append(sprrbz.cfr_renamed_9("H\u0005\u0006L\u0003\t\u0011L\u0006\u0003\u001cL\u001a\t\u000b\u0003\u000f\u0002\u0001\u001f\r\b")).toString());
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof ECPublicKey) {
            return new sprohc((ECPublicKey)arg0, this.cfr_renamed_4);
        }
        if (arg0 instanceof ECPrivateKey) {
            return new sprllc((ECPrivateKey)arg0, this.cfr_renamed_4);
        }
        throw new InvalidKeyException(spryxaa.cfr_renamed_9(".X<\u001d1D5XeH+V+R2S"));
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

    /*
     * WARNING - void declaration
     */
    public sprwgc(String string, sprwc sprwc2) {
        void arg0;
        sprwgc sprwgc2 = this;
        sprwgc2.cfr_renamed_3 = arg0;
        sprwgc2.cfr_renamed_4 = sprwc2;
    }
}

