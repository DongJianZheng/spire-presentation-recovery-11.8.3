/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprned;
import com.spire.presentation.packages.sprqvn;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

public class sprmdb {
    public static Key cfr_renamed_1535(spreya arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return (Key)arg0.cfr_renamed_1536();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return new SecretKeySpec((byte[])arg0.cfr_renamed_1536(), sprned.cfr_renamed_9("^\u000fX"));
        }
        throw new IllegalArgumentException(sprqvn.cfr_renamed_9("{{e{ab`5ip`p||m5epw5zl~p"));
    }
}

