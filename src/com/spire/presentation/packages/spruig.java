/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprzofa;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

public class spruig {
    public static Key cfr_renamed_7426(sprnfg arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return (Key)arg0.cfr_renamed_1536();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return new SecretKeySpec((byte[])arg0.cfr_renamed_1536(), sprsly.cfr_renamed_9("791"));
        }
        throw new IllegalArgumentException(sprzofa.cfr_renamed_9("\u0007\u007f\u0019\u007f\u001df\u001c1\u0015t\u001ct\u0000x\u00111\u0019t\u000b1\u0006h\u0002t"));
    }
}

