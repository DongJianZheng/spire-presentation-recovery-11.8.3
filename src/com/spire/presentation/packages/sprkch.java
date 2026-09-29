/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprrfh;
import com.spire.presentation.packages.spryd;
import java.math.BigInteger;

public class sprkch
extends sprrfh
implements spryd {
    public sprkch(int arg0) {
        super(arg0);
    }

    public sprkch(BigInteger arg0) {
        super(arg0);
    }

    public static sprkch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkch) {
            return (sprkch)arg0;
        }
        if (arg0 != null) {
            return new sprkch(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }
}

