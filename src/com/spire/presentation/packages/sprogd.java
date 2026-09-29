/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjnd;
import com.spire.presentation.packages.sprlc;
import java.math.BigInteger;

public class sprogd {
    public sprlc cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3884(BigInteger bigInteger, BigInteger bigInteger2, sprlc sprlc2) {
        void arg1;
        void arg0;
        sprogd sprogd2 = this;
        this.cfr_renamed_4 = arg0;
        sprogd2.cfr_renamed_3 = arg1;
        sprogd2.cfr_renamed_2 = sprlc2;
    }

    /*
     * WARNING - void declaration
     */
    public BigInteger cfr_renamed_3885(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprogd sprogd2 = this;
        BigInteger bigInteger = sprjnd.cfr_renamed_3886(this.cfr_renamed_2, sprogd2.cfr_renamed_4, (byte[])arg0, (byte[])arg1, (byte[])arg2);
        return sprogd2.cfr_renamed_3.modPow(bigInteger, this.cfr_renamed_4);
    }
}

