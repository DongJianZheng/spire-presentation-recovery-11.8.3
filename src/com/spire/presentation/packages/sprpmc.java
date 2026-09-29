/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwfp;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public abstract class sprpmc
extends AlgorithmParametersSpi {
    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprwfp.cfr_renamed_9("\u0001[\u0007\\\rL\u000e]@]\u000f\t\u0007L\u0014y\u0001[\u0001D\u0005]\u0005[3Y\u0005J@D\u0015Z\u0014\t\u000eF\u0014\t\u0002L@G\u0015E\f"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    public abstract AlgorithmParameterSpec cfr_renamed_2397(Class var1) throws InvalidParameterSpecException;
}

