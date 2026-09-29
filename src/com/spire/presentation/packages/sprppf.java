/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralf;
import com.spire.presentation.packages.sprcma;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.sprjif;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprppf {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof spralf) {
            spralf spralf2 = (spralf)arg0;
            return new sprhff(spralf2.cfr_renamed_1146(), spralf2.cfr_renamed_1150(), spralf2.cfr_renamed_845(), spralf2.cfr_renamed_1147(), spralf2.cfr_renamed_1152(), spralf2.cfr_renamed_1151(), spralf2.cfr_renamed_1149());
        }
        throw new InvalidKeyException(sprqks.cfr_renamed_9("\u000e\u001d\u0003[\u0019\\\u0004\u0018\b\u0012\u0019\u0015\u000b\u0005M1\u000e9\u0001\u0015\b\u001f\b\\\u001d\u000e\u0004\n\f\b\b\\\u0006\u0019\u0014R"));
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprjif) {
            return ((sprjif)arg0).cfr_renamed_5650();
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprcma.cfr_renamed_9("\u0019&\u0014`\u000eg\u0013#\u001f)\u000e.\u001c>Z\n\u0019\u0002\u0016.\u001f$\u001fg\n2\u0018+\u0013$Z,\u001f>@g")).append(arg0.getClass().getName()).toString());
    }
}

