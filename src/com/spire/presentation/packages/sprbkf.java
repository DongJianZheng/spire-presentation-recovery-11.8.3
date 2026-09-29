/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprkif;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpjf;
import com.spire.presentation.packages.sprpqf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgi;
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

public class sprbkf
extends sprpqf {
    private static final Set<sprlem> cfr_renamed_4 = new HashSet<sprlem>();

    public sprbkf() {
        super(cfr_renamed_4);
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpjf || arg0 instanceof sprkif) {
            return arg0;
        }
        throw new InvalidKeyException(sprxgi.cfr_renamed_9("mGK\\HYW[LL\\\tSLA\tLPHL"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprpjf(arg0);
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprpjf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprkif) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdmo.cfr_renamed_9("\"S\u0004H\u0007M\u0018O\u0003X\u0013\u001d\u001cX\u000e\u001d\u0003D\u0007XM\u001d")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprxgi.cfr_renamed_9("|VBVFOG\u0018B]P\u0018ZHL[@^@[HL@WG\u0002\t")).append(arg1).append(".").toString());
    }

    public sprbkf(sprlem arg0) {
        super(arg0);
    }

    static {
        cfr_renamed_4.add(sprjv.cfr_renamed_3034);
        cfr_renamed_4.add(sprjv.cfr_renamed_723);
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprkif(arg0);
    }
}

