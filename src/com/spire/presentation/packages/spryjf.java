/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sproof;
import com.spire.presentation.packages.sprsjf;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class spryjf {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsjf) {
            return ((sprsjf)arg0).cfr_renamed_5650();
        }
        throw new InvalidKeyException(sprnez.cfr_renamed_9("(\u0002%D?C\"\u0007.\r?\n-\u001ak.(&'\n.\u0000. \b\"yC;\u0011\"\u0015*\u0017.C \u00062M"));
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sproof) {
            return ((sproof)arg0).cfr_renamed_5650();
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprcno.cfr_renamed_9("6_;\u0019!\u001e<Z0P!W3Gus6{9W0]0}\u0016\u007fg\u001e%K7R<]uU0Go\u001e")).append(arg0.getClass().getName()).toString());
    }
}

