/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprrfh;
import java.math.BigInteger;

public class sprjih
extends sprrfh {
    public sprjih(sprktm arg0) {
        super(arg0);
    }

    public static sprjih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjih) {
            return (sprjih)arg0;
        }
        if (arg0 != null) {
            return new sprjih(sprrfh.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjih(int arg0) {
        super(arg0);
    }

    public sprjih(long arg0) {
        super(arg0);
    }

    public sprjih(BigInteger arg0) {
        super(arg0);
    }

    public sprjih(sprrfh arg0) {
        super(arg0.cfr_renamed_97());
    }
}

