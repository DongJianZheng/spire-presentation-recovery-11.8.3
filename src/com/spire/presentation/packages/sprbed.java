/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.AppException;
import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.spryld;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprbed {
    private final BigInteger cfr_renamed_2;
    private final BigInteger[] cfr_renamed_3;
    private final String cfr_renamed_4;

    public String cfr_renamed_3932() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_2;
    }

    public BigInteger[] cfr_renamed_3933() {
        sprbed sprbed2 = this;
        return sprzra.cfr_renamed_550(sprbed2.cfr_renamed_3, sprbed2.cfr_renamed_3.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprbed(String string, BigInteger bigInteger, BigInteger[] bigIntegerArray) {
        void arg2;
        void arg1;
        void arg0;
        sprbed sprbed2 = this;
        spryld.cfr_renamed_3930(arg0, AppException.cfr_renamed_9("0D2Q)F)U!K4l$"));
        spryld.cfr_renamed_3930(arg1, "a");
        spryld.cfr_renamed_3930(arg2, sprbjo.cfr_renamed_9("T|PeSw[uZBM}Pty}MJ\ra"));
        this.cfr_renamed_4 = arg0;
        sprbed2.cfr_renamed_2 = arg1;
        sprbed2.cfr_renamed_3 = sprzra.cfr_renamed_550(bigIntegerArray, bigIntegerArray.length);
    }
}

