/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprhdaa;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnc;
import com.spire.presentation.packages.sprnjb;
import com.spire.presentation.packages.sprpc;
import com.spire.presentation.packages.sprqfc;
import com.spire.presentation.packages.sprqnb;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxfc;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class sprglc
extends sprknc {
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprnjb) {
            return new sprxfc((sprnjb)arg0);
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpc) {
            return new sprqfc((sprpc)arg0);
        }
        if (arg0 instanceof sprnc) {
            return new sprxfc((sprnc)arg0);
        }
        throw new InvalidKeyException(sprhdaa.cfr_renamed_9("\u0017T\u0005\u0011\bH\fT\\D\u0012Z\u0012^\u000b_"));
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprji.cfr_renamed_102)) {
            return new sprqfc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprfdf.cfr_renamed_9("2N4M!K'J>\u0002:F6L'K5K6Ps")).append(sprtzd2).append(sprhdaa.cfr_renamed_9("\\X\u0012\u0011\u0017T\u0005\u0011\u0012^\b\u0011\u000eT\u001f^\u001b_\u0015B\u0019U")).toString());
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprtzd2.equals(sprji.cfr_renamed_102)) {
            return new sprxfc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprfdf.cfr_renamed_9("2N4M!K'J>\u0002:F6L'K5K6Ps")).append(sprtzd2).append(sprhdaa.cfr_renamed_9("\\X\u0012\u0011\u0017T\u0005\u0011\u0012^\b\u0011\u000eT\u001f^\u001b_\u0015B\u0019U")).toString());
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprqnb) {
            return new sprqfc((sprqnb)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(sprqnb.class) && arg0 instanceof sprpc) {
            sprpc sprpc2 = (sprpc)arg0;
            sprrob sprrob2 = sprpc2.cfr_renamed_284().cfr_renamed_130();
            return new sprqnb(sprpc2.spr\u3181(), sprrob2.cfr_renamed_1155(), sprrob2.cfr_renamed_1604(), sprrob2.cfr_renamed_1778());
        }
        if (arg1.isAssignableFrom(sprnjb.class) && arg0 instanceof sprnc) {
            sprnc sprnc2 = (sprnc)arg0;
            sprrob sprrob3 = sprnc2.cfr_renamed_284().cfr_renamed_130();
            return new sprnjb(sprnc2.cfr_renamed_1980(), sprrob3.cfr_renamed_1155(), sprrob3.cfr_renamed_1604(), sprrob3.cfr_renamed_1778());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }
}

