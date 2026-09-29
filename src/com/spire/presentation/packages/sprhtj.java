/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprwq;

public class sprhtj
implements sprwq {
    private final char[] cfr_renamed_3;
    private final sprgn cfr_renamed_4;

    @Override
    public String getAlgorithm() {
        return sprpug.cfr_renamed_9("hZs\\~*");
    }

    @Override
    public String getFormat() {
        return this.cfr_renamed_4.cfr_renamed_324();
    }

    /*
     * WARNING - void declaration
     */
    public sprhtj(char[] cArray, sprgn sprgn2) {
        void arg0;
        sprhtj sprhtj2 = this;
        sprhtj2.cfr_renamed_3 = sproze.cfr_renamed_1106((char[])arg0);
        sprhtj2.cfr_renamed_4 = sprgn2;
    }

    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_3;
    }

    @Override
    public byte[] getEncoded() {
        sprhtj sprhtj2 = this;
        return sprhtj2.cfr_renamed_4.cfr_renamed_9492(sprhtj2.cfr_renamed_3);
    }
}

