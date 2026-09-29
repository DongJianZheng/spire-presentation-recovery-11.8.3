/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdca;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprwq;
import com.spire.presentation.packages.sprzna;

public class spruck
implements sprwq {
    private final char[] cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public spruck(char[] arg0) {
        this(arg0, false);
    }

    @Override
    public String getAlgorithm() {
        return sprzna.cfr_renamed_9("[BHZ:;");
    }

    @Override
    public String getFormat() {
        return sprhdca.cfr_renamed_9("$w7oE\u000e");
    }

    /*
     * WARNING - void declaration
     */
    public spruck(char[] cArray, boolean bl) {
        void arg1;
        char[] arg0;
        if (cArray == null) {
            arg0 = new char[]{};
        }
        this.cfr_renamed_3 = new char[arg0.length];
        this.cfr_renamed_4 = arg1;
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, arg0.length);
    }

    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_3;
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 && this.cfr_renamed_3.length == 0) {
            return new byte[2];
        }
        return sprkuh.cfr_renamed_1516(this.cfr_renamed_3);
    }
}

