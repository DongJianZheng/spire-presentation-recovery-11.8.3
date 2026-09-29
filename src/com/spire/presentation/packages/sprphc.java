/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprnc;
import com.spire.presentation.packages.sprpc;
import com.spire.presentation.packages.sprpcd;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprsbj;
import com.spire.presentation.packages.sprshd;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprphc {
    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprnc) {
            sprnc sprnc2 = (sprnc)arg0;
            sprrob sprrob2 = sprnc2.cfr_renamed_284().cfr_renamed_130();
            return new sprshd(sprnc2.cfr_renamed_1980(), new sprcfd(sprrob2.cfr_renamed_1155(), sprrob2.cfr_renamed_1604(), sprrob2.cfr_renamed_1778()));
        }
        throw new InvalidKeyException(sprsbj.cfr_renamed_9("K~F8\\?A{Mq\\vNf\bXgL|,\u001c.\u0018?XmAiIkM?CzQ1"));
    }

    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpc) {
            sprpc sprpc2 = (sprpc)arg0;
            sprrob sprrob2 = sprpc2.cfr_renamed_284().cfr_renamed_130();
            return new sprpcd(sprpc2.spr\u3181(), new sprcfd(sprrob2.cfr_renamed_1155(), sprrob2.cfr_renamed_1604(), sprrob2.cfr_renamed_1778()));
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprdmo.cfr_renamed_9("\u0014\\\u0019\u001a\u0003\u001d\u001eY\u0012S\u0003T\u0011DWz8n#\u000eC\fG\u001d\u0007H\u0015Q\u001e^WV\u0012DM\u001d")).append(arg0.getClass().getName()).toString());
    }
}

