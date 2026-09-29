/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnah;
import java.math.BigInteger;

public class sprkdh
extends sprnah {
    public sprkdh(long arg0) {
        super(arg0);
    }

    private /* synthetic */ sprkdh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public static sprkdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkdh) {
            return (sprkdh)arg0;
        }
        if (arg0 != null) {
            return new sprkdh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkdh(BigInteger arg0) {
        super(arg0);
    }
}

