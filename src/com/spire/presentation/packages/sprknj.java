/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarj;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdph;
import com.spire.presentation.packages.sprinj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprndz;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sprpr;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.spruv;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzqh;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class sprknj
extends sprclj {
    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprqo.spr\ufe34)) {
            return new sprarj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, spronq.cfr_renamed_9("TwRtGrAsX;\\\u007fPuArSrPi\u0015")).append(sprlem2).append(sprndz.cfr_renamed_9("}D3\r6H$\r3B)\r/H>B:C4^8I")).toString());
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(sprzqh.class) && arg0 instanceof spruv) {
            spruv spruv2 = (spruv)arg0;
            sprmsh sprmsh2 = spruv2.cfr_renamed_284().cfr_renamed_130();
            return new sprzqh(spruv2.spr\u3181(), sprmsh2.cfr_renamed_1155(), sprmsh2.cfr_renamed_1604(), sprmsh2.cfr_renamed_1778());
        }
        if (arg1.isAssignableFrom(sprdph.class) && arg0 instanceof sprpr) {
            sprpr sprpr2 = (sprpr)arg0;
            sprmsh sprmsh3 = sprpr2.cfr_renamed_284().cfr_renamed_130();
            return new sprdph(sprpr2.cfr_renamed_1980(), sprmsh3.cfr_renamed_1155(), sprmsh3.cfr_renamed_1604(), sprmsh3.cfr_renamed_1778());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprzqh) {
            return new sprinj((sprzqh)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof spruv) {
            return new sprinj((spruv)arg0);
        }
        if (arg0 instanceof sprpr) {
            return new sprarj((sprpr)arg0);
        }
        throw new InvalidKeyException(spronq.cfr_renamed_9("pPb\u0015oLkP;@u^uZl["));
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprdph) {
            return new sprarj((sprdph)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprqo.spr\ufe34)) {
            return new sprinj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprndz.cfr_renamed_9("L1J2_4Y5@}D9H3Y4K4H/\r")).append(sprlem2).append(spronq.cfr_renamed_9(";\\u\u0015pPb\u0015uZo\u0015iPxZ|[rF~Q")).toString());
    }
}

