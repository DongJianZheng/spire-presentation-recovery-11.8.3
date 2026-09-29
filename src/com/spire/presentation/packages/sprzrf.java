/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprkhg;
import com.spire.presentation.packages.sprlkg;
import com.spire.presentation.packages.sprmbg;
import com.spire.presentation.packages.sproof;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprsjf;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprylf;
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

public class sprzrf
extends KeyFactorySpi
implements sprcn {
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.2";

    public KeySpec cfr_renamed_1240(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprsjf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sproof) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprmbg.cfr_renamed_9("iBOYL\\S^HIX\fWIE\fHULI\u0006\f")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("{/E/A6@aE$Wa]1K\"G'G\"O5G.@{\u000e")).append(arg1).append(".").toString());
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprkhg sprkhg2 = sprkhg.cfr_renamed_23(arg0.cfr_renamed_1227());
        return new sproof(new sprvef(sprkhg2.cfr_renamed_1146(), sprkhg2.cfr_renamed_1144(), sprkhg2.cfr_renamed_1145(), sprylf.cfr_renamed_5700(sprkhg2.cfr_renamed_580()).cfr_renamed_1315()));
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        return null;
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
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("{/]4^1A3Z$JaE$Wa]1K\"G'G\"O5G.@{\u000e")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            sprcom2 = sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprmbg.cfr_renamed_9("iB]NPI\u001cXS\fXI_CXI\u001c|woo\u0014yB_CXIXgYUo\\YO\u0006\f")).append(iOException).toString());
        }
        try {
            if (sprbn.cfr_renamed_102.cfr_renamed_5078(sprcom2.cfr_renamed_1254().cfr_renamed_593())) {
                sprlkg sprlkg2 = sprlkg.cfr_renamed_23(sprcom2.cfr_renamed_1229());
                return new sprsjf(new sprwxe(sprlkg2.cfr_renamed_1146(), sprlkg2.cfr_renamed_1150(), sprlkg2.cfr_renamed_845(), sprlkg2.cfr_renamed_1147(), sprlkg2.cfr_renamed_1155(), sprylf.cfr_renamed_5700(sprlkg2.cfr_renamed_580()).cfr_renamed_1315()));
            }
            throw new InvalidKeySpecException(sprqvk.cfr_renamed_9("\u0014@ L-KaZ.\u000e3K\"A&@(]$\u000e\u000eg\u0005\u000e(@ac\"k-G$M$\u000e1[#B(MaE$W"));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprmbg.cfr_renamed_9("yRM^@Y\fHC\u001cHYOSHY\flg\u007f\u007f\u0004iROSHYHwIE\u007fLI_\u0002"));
        }
    }

    public Key cfr_renamed_1241(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsjf || arg0 instanceof sproof) {
            return arg0;
        }
        throw new InvalidKeyException(sprmbg.cfr_renamed_9("yR_I\\LCNXYH\u001cGYU\u001cXE\\Y\u0002"));
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
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("{/]4^1A3Z$JaE$Wa]1K\"G'G\"O5G.@{\u000e")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(iOException.toString());
        }
        try {
            if (sprbn.cfr_renamed_102.cfr_renamed_5078(sprvhm2.cfr_renamed_593().cfr_renamed_593())) {
                sprkhg sprkhg2 = sprkhg.cfr_renamed_23(sprvhm2.cfr_renamed_1227());
                return new sproof(new sprvef(sprkhg2.cfr_renamed_1146(), sprkhg2.cfr_renamed_1144(), sprkhg2.cfr_renamed_1145(), sprylf.cfr_renamed_5700(sprkhg2.cfr_renamed_580()).cfr_renamed_1315()));
            }
            throw new InvalidKeySpecException(sprqvk.cfr_renamed_9("{/O#B$\u000e5Aa\\$M.I/G2Kaa\bjaG/\u000e\fM\u0004B(K\"Ka^3G7O5KaE$W"));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprmbg.cfr_renamed_9("yRM^@Y\fHC\u001cHYOSHY\fd\u0019\f\u0015yB_CXIXgYUo\\YO\u0006\f")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        return null;
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlkg sprlkg2 = sprlkg.cfr_renamed_23(arg0.cfr_renamed_1229().cfr_renamed_119());
        return new sprsjf(new sprwxe(sprlkg2.cfr_renamed_1146(), sprlkg2.cfr_renamed_1150(), sprlkg2.cfr_renamed_845(), sprlkg2.cfr_renamed_1147(), sprlkg2.cfr_renamed_1155(), null));
    }
}

