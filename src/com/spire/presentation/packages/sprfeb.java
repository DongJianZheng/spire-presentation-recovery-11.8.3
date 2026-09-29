/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbb;
import com.spire.presentation.packages.sprftaa;
import com.spire.presentation.packages.sprgeb;
import com.spire.presentation.packages.sprhdb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprqega;
import com.spire.presentation.packages.spruhb;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprfeb {
    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprdbb) {
            sprdbb sprdbb2 = (sprdbb)arg0;
            return new sprgeb(sprdbb2.cfr_renamed_1143(), sprdbb2.cfr_renamed_1146(), sprdbb2.cfr_renamed_1144(), sprdbb2.cfr_renamed_1145(), sprdbb2.cfr_renamed_1238());
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprqega.cfr_renamed_9("whz.`)}mqg``rp4DwLx`qjq)d|ve}j4bqp.)")).append(arg0.getClass().getName()).toString());
    }

    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprhdb) {
            sprhdb sprhdb2 = (sprhdb)arg0;
            return new spruhb(sprhdb2.cfr_renamed_1143(), sprhdb2.cfr_renamed_1146(), sprhdb2.cfr_renamed_1150(), sprhdb2.cfr_renamed_845(), sprhdb2.cfr_renamed_1147(), sprhdb2.cfr_renamed_1149(), sprhdb2.cfr_renamed_1152(), sprhdb2.cfr_renamed_1151(), sprhdb2.cfr_renamed_1153(), sprhdb2.cfr_renamed_1148(), sprhdb2.cfr_renamed_1238());
        }
        throw new InvalidKeyException(sprftaa.cfr_renamed_9("\u001fA\u0012\u0007\b\u0000\u0015D\u0019N\bI\u001aY\\m\u001fe\u0010I\u0019C\u0019\u0000\fR\u0015V\u001dT\u0019\u0000\u0017E\u0005\u000e"));
    }
}

