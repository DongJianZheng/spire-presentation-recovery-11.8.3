/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreny;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnah;
import com.spire.presentation.packages.sprsdp;

public class spraah
extends sprnah {
    public static final spraah cfr_renamed_4 = new spraah();

    public static spraah cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraah) {
            return (spraah)arg0;
        }
        if (arg0 != null) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(arg0);
            if (sprktm2.cfr_renamed_97().intValue() != 1800000001) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprsdp.cfr_renamed_9("\u000fI\u0015]\u001c\b")).append(sprktm2.cfr_renamed_97()).append(spreny.cfr_renamed_9("J-\u0019d\u0004+\u001ed[|ZtZtZtZu")).toString());
            }
            return cfr_renamed_4;
        }
        return null;
    }

    public spraah() {
        super(1800000001L);
    }
}

