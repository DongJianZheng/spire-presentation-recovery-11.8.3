/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprcce
extends sprkra {
    private BigInteger cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_312() {
        return this.cfr_renamed_4;
    }

    public static sprcce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcce) {
            return (sprcce)arg0;
        }
        if (arg0 != null) {
            return new sprcce(spryte.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcce(spryte spryte2) {
        void arg0;
        this.cfr_renamed_4 = spryte2.cfr_renamed_312();
        sprcce sprcce2 = this;
        this.cfr_renamed_3 = new BigInteger(1, sprxue.cfr_renamed_341((spryte)arg0, false).cfr_renamed_186());
    }

    private /* synthetic */ byte[] cfr_renamed_4686() {
        byte[] byArray = this.cfr_renamed_3.toByteArray();
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return byArray;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprcce(int n, BigInteger bigInteger) {
        void arg0;
        sprcce sprcce2 = this;
        sprcce2.cfr_renamed_4 = arg0;
        sprcce2.cfr_renamed_3 = bigInteger;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprhse(false, this.cfr_renamed_4, new sprlqe(this.cfr_renamed_4686()));
    }
}

