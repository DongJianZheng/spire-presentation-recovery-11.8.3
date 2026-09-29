/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraif;
import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnfo;
import com.spire.presentation.packages.sprpqf;
import com.spire.presentation.packages.sprsnf;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;

public class sprdof
extends sprpqf {
    private static final Set<sprlem> cfr_renamed_4 = new HashSet<sprlem>();

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprsnf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof spraif) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprnfo.cfr_renamed_9("Lfj}ixvzmm}(rm`(mqim#(")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprbnja.cfr_renamed_9("\u0018Z&Z\"C#\u0014&Q4\u0014>D(W$R$W,@$[#\u000em")).append(arg1).append(".").toString());
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsnf || arg0 instanceof spraif) {
            return arg0;
        }
        throw new InvalidKeyException(sprnfo.cfr_renamed_9("Lfj}ixvzmm}(rm`(mqim"));
    }

    public sprdof() {
        super(cfr_renamed_4);
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprsnf(arg0);
    }

    public sprdof(sprlem arg0) {
        super(arg0);
    }

    static {
        cfr_renamed_4.add(sprjv.cfr_renamed_3240);
        cfr_renamed_4.add(sprjv.cfr_renamed_3237);
        cfr_renamed_4.add(sprjv.cfr_renamed_499);
        cfr_renamed_4.add(sprjv.cfr_renamed_287);
        cfr_renamed_4.add(sprjv.cfr_renamed_88);
        cfr_renamed_4.add(sprjv.cfr_renamed_96);
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new spraif(arg0);
    }
}

