/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbaa;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfab;
import com.spire.presentation.packages.sprj;
import com.spire.presentation.packages.sprlva;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprndb;
import com.spire.presentation.packages.sproma;
import com.spire.presentation.packages.sprtfb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprvxa;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class sprsfb
extends KeyFactorySpi
implements sprj {
    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprvxa sprvxa2 = sprvxa.cfr_renamed_23(arg0.cfr_renamed_1227());
        return new sprndb(sprvxa2.cfr_renamed_1130(), sprvxa2.cfr_renamed_1132(), sprvxa2.cfr_renamed_1131(), sprvxa2.cfr_renamed_1133());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sproma) {
            return new sprndb((sproma)arg0);
        }
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprcbaa.cfr_renamed_9("W`i`myl.ik{.q~gmkhkmczkal4\"")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_1226(sprdce.cfr_renamed_23(byArray));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprfab sprfab2 = sprfab.cfr_renamed_23(arg0.cfr_renamed_1229());
        return new sprtfb(sprfab2.cfr_renamed_1135(), sprfab2.cfr_renamed_1136(), sprfab2.cfr_renamed_1137(), sprfab2.cfr_renamed_1138(), sprfab2.cfr_renamed_1139(), sprfab2.cfr_renamed_1134());
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprtfb) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
            if (sprlva.class.isAssignableFrom(arg1)) {
                sprtfb sprtfb2 = (sprtfb)arg0;
                return new sprlva(sprtfb2.cfr_renamed_1135(), sprtfb2.cfr_renamed_1136(), sprtfb2.cfr_renamed_1137(), sprtfb2.cfr_renamed_1138(), sprtfb2.cfr_renamed_1139(), sprtfb2.cfr_renamed_1134());
            }
        } else if (arg0 instanceof sprndb) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
            if (sproma.class.isAssignableFrom(arg1)) {
                sprndb sprndb2 = (sprndb)arg0;
                return new sproma(sprndb2.cfr_renamed_1130(), sprndb2.cfr_renamed_1132(), sprndb2.cfr_renamed_1131(), sprndb2.cfr_renamed_1133());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdbd.cfr_renamed_9("yF_]\\XCZXMH\bGMU\bXQ\\M\u0016\b")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprcbaa.cfr_renamed_9("W`i`myl.ik{.q~gmkhkmczkal4\"")).append(arg1).append(".").toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprlva) {
            return new sprtfb((sprlva)arg0);
        }
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdbd.cfr_renamed_9("}B[YX\\G^\\IL\fCIQ\f[\\MOAJAOIXACF\u0016\b")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_1228(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprtfb || arg0 instanceof sprndb) {
            return arg0;
        }
        throw new InvalidKeyException(sprcbaa.cfr_renamed_9("[l}w~rapzgj\"egw\"z{~g"));
    }
}

