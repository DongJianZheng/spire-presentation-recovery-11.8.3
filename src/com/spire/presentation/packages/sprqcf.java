/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcnaa;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprkcf;
import com.spire.presentation.packages.sprsaf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
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

public class sprqcf
extends KeyFactorySpi
implements sprcn {
    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprkcf(arg0);
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprkcf || arg0 instanceof sprsaf) {
            return arg0;
        }
        throw new InvalidKeyException(sprcnaa.cfr_renamed_9("v\np\u0011s\u0014l\u0016w\u0001gDh\u0001zDw\u001ds\u0001"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("fs`hcm|ogxw=xxj=`mv~z{z~rizr}'3")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_5653(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprcnaa.cfr_renamed_9("\u0011m\u000fm\u000bt\n#\u000ff\u001d#\u0017s\u0001`\re\r`\u0005w\rl\n9D")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            return this.cfr_renamed_3215(sprvhm.cfr_renamed_23(byArray));
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprsaf(arg0);
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprkcf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprsaf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("h}nfmcraivy3vvd3ijmv'3")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprcnaa.cfr_renamed_9("\u0011m\u000fm\u000bt\n#\u000ff\u001d#\u0017s\u0001`\re\r`\u0005w\rl\n9D")).append(arg1).append(".").toString());
    }
}

