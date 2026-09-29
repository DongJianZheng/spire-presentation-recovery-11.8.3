/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprylp;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public abstract class sprpfi
extends AlgorithmParametersSpi {
    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprylp.cfr_renamed_9("h\u001cn\u001bd\u000bg\u001a)\u001afNn\u000b}>h\u001ch\u0003l\u001al\u001cZ\u001el\r)\u0003|\u001d}Ng\u0001}Nk\u000b)\u0000|\u0002e"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    public abstract AlgorithmParameterSpec cfr_renamed_2397(Class var1) throws InvalidParameterSpecException;

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }
}

