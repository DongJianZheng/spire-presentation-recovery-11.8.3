/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprmtk;
import com.spire.presentation.packages.sprpr;
import com.spire.presentation.packages.spruv;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzrk;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprepj {
    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof spruv) {
            spruv spruv2 = (spruv)arg0;
            sprmsh sprmsh2 = spruv2.cfr_renamed_284().cfr_renamed_130();
            return new sprmtk(spruv2.spr\u3181(), new spriyk(sprmsh2.cfr_renamed_1155(), sprmsh2.cfr_renamed_1604(), sprmsh2.cfr_renamed_1778()));
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprwtba.cfr_renamed_9("[>VxL\u007fQ;]1L6^&\u0018\u0018w\fll\fn\b\u007fH*Z3Q<\u00184]&\u0002\u007f")).append(arg0.getClass().getName()).toString());
    }

    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpr) {
            sprpr sprpr2 = (sprpr)arg0;
            sprmsh sprmsh2 = sprpr2.cfr_renamed_284().cfr_renamed_130();
            return new sprzrk(sprpr2.cfr_renamed_1980(), new spriyk(sprmsh2.cfr_renamed_1155(), sprmsh2.cfr_renamed_1604(), sprmsh2.cfr_renamed_1778()));
        }
        throw new InvalidKeyException(sprebda.cfr_renamed_9("y\u0011tWnPs\u0014\u007f\u001en\u0019|\t:7U#NC.A*Pj\u0002s\u0006{\u0004\u007fPq\u0015c^"));
    }
}

