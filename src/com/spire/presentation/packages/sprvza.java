/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprhxa;
import java.security.Key;

public class sprvza {
    public static byte[] cfr_renamed_1577(spreya arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return ((Key)arg0.cfr_renamed_1536()).getEncoded();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return (byte[])arg0.cfr_renamed_1536();
        }
        throw new IllegalArgumentException(sprhxa.cfr_renamed_9("B\u0014\\\u0014X\rYZP\u001fY\u001fE\u0013TZ\\\u001fNZC\u0003G\u001f"));
    }
}

