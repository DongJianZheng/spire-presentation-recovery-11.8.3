/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbo;
import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprdj;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprtrj {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprbo) {
            sprbo sprbo2 = (sprbo)arg0;
            return new sprwrk(sprbo2.getX(), new sprcuk(sprbo2.cfr_renamed_284().cfr_renamed_1155(), sprbo2.cfr_renamed_284().cfr_renamed_1145()));
        }
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprwrk(dHPrivateKey.getX(), new sprcuk(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprtsa.cfr_renamed_9("\u001fI\u0012\u000f\b\b\u0015L\u0019F\bA\u001aQ\\X\u000eA\nI\bM\\C\u0019Q\\N\u0013Z\\m\u0010\b;I\u0011I\u0010\u0006"));
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprdj) {
            sprdj sprdj2 = (sprdj)arg0;
            return new sprssk(sprdj2.getY(), new sprcuk(sprdj2.cfr_renamed_284().cfr_renamed_1155(), sprdj2.cfr_renamed_284().cfr_renamed_1145()));
        }
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprssk(dHPublicKey.getY(), new sprcuk(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprfql.cfr_renamed_9("ZwW1M6Pr\\xM\u007f_o\u0019fLtU\u007fZ6Rs@6_yK6|z\u0019QX{Xz\u0017"));
    }
}

