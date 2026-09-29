/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sprusc;
import com.spire.presentation.packages.sprwq;

public class sproak
implements sprwq {
    private final sprgn cfr_renamed_3;
    private final char[] cfr_renamed_4;

    @Override
    public byte[] getEncoded() {
        sproak sproak2 = this;
        return sproak2.cfr_renamed_3.cfr_renamed_9492(sproak2.cfr_renamed_4);
    }

    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return this.cfr_renamed_3.cfr_renamed_324();
    }

    @Override
    public String getAlgorithm() {
        return sprusc.cfr_renamed_9("]-F+K^");
    }

    /*
     * WARNING - void declaration
     */
    public sproak(char[] cArray, sprgn sprgn2) {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = new char[cArray.length];
        this.cfr_renamed_3 = arg1;
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }
}

