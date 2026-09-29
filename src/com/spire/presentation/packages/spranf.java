/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnf;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.spropca;
import com.spire.presentation.packages.sprosf;
import com.spire.presentation.packages.sprpqf;
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

public class spranf
extends sprpqf {
    private static final Set<sprlem> cfr_renamed_4 = new HashSet<sprlem>();

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        return new sprcnf(arg0);
    }

    public spranf(sprlem arg0) {
        super(arg0);
    }

    static {
        cfr_renamed_4.add(sprjv.cfr_renamed_580);
        cfr_renamed_4.add(sprjv.cfr_renamed_2807);
        cfr_renamed_4.add(sprjv.cfr_renamed_2141);
        cfr_renamed_4.add(sprjv.cfr_renamed_805);
        cfr_renamed_4.add(sprjv.cfr_renamed_1339);
        cfr_renamed_4.add(sprjv.cfr_renamed_3251);
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        return new sprosf(arg0);
    }

    public final KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprosf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
        } else if (arg0 instanceof sprcnf) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprdyg.cfr_renamed_9("e\u001cC\u0007@\u0002_\u0000D\u0017TR[\u0017IRD\u000b@\u0017\nR")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, spropca.cfr_renamed_9("$5\u001a5\u001e,\u001f{\u001a>\b{\u0002+\u00148\u0018=\u00188\u0010/\u00184\u001faQ")).append(arg1).append(".").toString());
    }

    @Override
    public final Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprosf || arg0 instanceof sprcnf) {
            return arg0;
        }
        throw new InvalidKeyException(sprdyg.cfr_renamed_9("e\u001cC\u0007@\u0002_\u0000D\u0017TR[\u0017IRD\u000b@\u0017"));
    }

    public spranf() {
        super(cfr_renamed_4);
    }
}

