/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprldha;
import com.spire.presentation.packages.sprnfg;
import java.security.Key;

public class sprqkg {
    public static byte[] cfr_renamed_7480(sprnfg arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return ((Key)arg0.cfr_renamed_1536()).getEncoded();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return (byte[])arg0.cfr_renamed_1536();
        }
        throw new IllegalArgumentException(sprldha.cfr_renamed_9("\u0016k\bk\fr\r%\u0004`\r`\u0011l\u0000%\b`\u001a%\u0017|\u0013`"));
    }
}

