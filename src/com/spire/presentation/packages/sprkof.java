/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralf;
import com.spire.presentation.packages.spraqg;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.sprjif;
import com.spire.presentation.packages.sprluda;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprppg;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxe;
import com.spire.presentation.packages.sprzos;
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

public class sprkof
extends KeyFactorySpi
implements sprcn {
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.1";

    public KeySpec cfr_renamed_1240(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof spralf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprjif) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprzos.cfr_renamed_9("\u001c\u0004:\u001f9\u001a&\u0018=\u000f-J\"\u000f0J=\u00139\u000fsJ")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprluda.cfr_renamed_9("\u0004e:e>|?+:n(+\"{4h8m8h0\u007f8d?1q")).append(arg1).append(".").toString());
    }

    public Key cfr_renamed_1241(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof spralf || arg0 instanceof sprjif) {
            return arg0;
        }
        throw new InvalidKeyException(sprzos.cfr_renamed_9("?'\u0019<\u001a9\u0005;\u001e,\u000ei\u0001,\u0013i\u001e0\u001a,D"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        spraqg spraqg2 = spraqg.cfr_renamed_23(arg0.cfr_renamed_1229().cfr_renamed_119());
        return new spralf(new sprhff(spraqg2.cfr_renamed_1146(), spraqg2.cfr_renamed_1150(), spraqg2.cfr_renamed_845(), spraqg2.cfr_renamed_1147(), spraqg2.cfr_renamed_1152(), spraqg2.cfr_renamed_1151(), spraqg2.cfr_renamed_1149()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        sprcom sprcom2;
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprzos.cfr_renamed_9("?'\u0019<\u001a9\u0005;\u001e,\u000ei\u0001,\u0013i\u00199\u000f*\u0003/\u0003*\u000b=\u0003&\u0004sJ")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            sprcom2 = sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprluda.cfr_renamed_9("^?j3g4+%dqo4h>o4+\u0001@\u0012XiN?h>o4o\u001an(X!n21q")).append(iOException).toString());
        }
        try {
            if (sprbn.cfr_renamed_112.cfr_renamed_5078(sprcom2.cfr_renamed_1254().cfr_renamed_593())) {
                spraqg spraqg2 = spraqg.cfr_renamed_23(sprcom2.cfr_renamed_1229());
                return new spralf(new sprhff(spraqg2.cfr_renamed_1146(), spraqg2.cfr_renamed_1150(), spraqg2.cfr_renamed_845(), spraqg2.cfr_renamed_1147(), spraqg2.cfr_renamed_1152(), spraqg2.cfr_renamed_1151(), spraqg2.cfr_renamed_1149()));
            }
            throw new InvalidKeySpecException(sprzos.cfr_renamed_9("?'\u000b+\u0006,J=\u0005i\u0018,\t&\r'\u0003:\u000fi%\u0000.i\u0003'J\u0004\t\f\u0006 \u000f*\u000fi\u001a;\u0003?\u000b=\u000fi\u0001,\u0013"));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprluda.cfr_renamed_9("\u0004e0i=nq\u007f>+5n2d5nq[\u001aH\u00023\u0014e2d5n5@4r\u0002{4h\u007f"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        sprvhm sprvhm2;
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprluda.cfr_renamed_9("\u0004e\"~!{>y%n5+:n(+\"{4h8m8h0\u007f8d?1q")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(iOException.toString());
        }
        try {
            if (sprbn.cfr_renamed_112.cfr_renamed_5078(sprvhm2.cfr_renamed_593().cfr_renamed_593())) {
                sprppg sprppg2 = sprppg.cfr_renamed_23(sprvhm2.cfr_renamed_1227());
                return new sprjif(new sprxxe(sprppg2.cfr_renamed_1146(), sprppg2.cfr_renamed_1144(), sprppg2.cfr_renamed_1145()));
            }
            throw new InvalidKeySpecException(sprluda.cfr_renamed_9("^?j3g4+%dqy4h>l?b\"nqD\u0018Oqb?+\u001ch\u0014g8n2nq{$i=b2+:n("));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprzos.cfr_renamed_9("?'\u000b+\u0006,J=\u0005i\u000e,\t&\u000e,J\u0011_yS\f\u0004*\u0005-\u000f-!,\u0013\u001a\u001a,\tsJ")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprppg sprppg2 = sprppg.cfr_renamed_23(arg0.cfr_renamed_1227());
        return new sprjif(new sprxxe(sprppg2.cfr_renamed_1146(), sprppg2.cfr_renamed_1144(), sprppg2.cfr_renamed_1145()));
    }

    private static /* synthetic */ sprgf cfr_renamed_5700(sprddm arg0) {
        return new sprohl();
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        return null;
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        return null;
    }
}

