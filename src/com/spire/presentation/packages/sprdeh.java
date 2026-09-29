/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import java.io.IOException;

public class sprdeh
extends sprfvg {
    public static sprdeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdeh) {
            return (sprdeh)arg0;
        }
        if (arg0 != null) {
            return new sprdeh(sproug.cfr_renamed_23(arg0).cfr_renamed_186());
        }
        return null;
    }

    public sprdeh(sprco arg0) throws IOException {
        super(arg0);
    }

    public sprdeh(byte[] arg0) {
        super(arg0);
    }
}

