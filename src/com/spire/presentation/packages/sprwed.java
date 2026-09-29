/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import java.security.SecureRandom;

public class sprwed {
    public int cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    public byte[] cfr_renamed_2405() {
        sprwed sprwed2 = this;
        byte[] byArray = new byte[sprwed2.cfr_renamed_3];
        sprwed2.cfr_renamed_4.nextBytes(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1222(sprccb sprccb2) {
        void arg0;
        sprwed sprwed2 = this;
        sprwed2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprwed2.cfr_renamed_3 = (sprccb2.cfr_renamed_3483() + 7) / 8;
    }
}

