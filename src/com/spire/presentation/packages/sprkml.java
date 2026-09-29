/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprvbl;
import com.spire.presentation.packages.sprzok;
import java.math.BigInteger;

public class sprkml {
    public sprgf cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public BigInteger cfr_renamed_3885(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprkml sprkml2 = this;
        BigInteger bigInteger = sprvbl.cfr_renamed_10592(this.cfr_renamed_2, sprkml2.cfr_renamed_3, (byte[])arg0, (byte[])arg1, (byte[])arg2);
        return sprkml2.cfr_renamed_4.modPow(bigInteger, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10593(BigInteger bigInteger, BigInteger bigInteger2, sprgf sprgf2) {
        void arg1;
        void arg0;
        sprkml sprkml2 = this;
        this.cfr_renamed_3 = arg0;
        sprkml2.cfr_renamed_4 = arg1;
        sprkml2.cfr_renamed_2 = sprgf2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10594(sprzok sprzok2, sprgf sprgf2) {
        void arg0;
        sprkml sprkml2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = v1.cfr_renamed_1146();
        sprkml2.cfr_renamed_4 = v1.cfr_renamed_1145();
        sprkml2.cfr_renamed_2 = sprgf2;
    }
}

