/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdlca;
import java.security.spec.EncodedKeySpec;

public class sprubi
extends EncodedKeySpec {
    private final String cfr_renamed_4;

    @Override
    public String getFormat() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprubi(byte[] byArray) {
        void arg0;
        void v0 = arg0;
        super((byte[])v0);
        if (v0[0] == 48) {
            this.cfr_renamed_4 = "ASN.1";
            return;
        }
        if (arg0[0] == 111) {
            this.cfr_renamed_4 = "OpenSSH";
            return;
        }
        throw new IllegalArgumentException(sprdlca.cfr_renamed_9("kSuSqJp\u001d|DjX>Xp^qYwSy"));
    }
}

