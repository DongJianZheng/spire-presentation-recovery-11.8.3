/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprgom
extends sprqqe {
    private int cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public int cfr_renamed_312() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgom(int n, BigInteger bigInteger) {
        void arg0;
        sprgom sprgom2 = this;
        sprgom2.cfr_renamed_3 = arg0;
        sprgom2.cfr_renamed_4 = bigInteger;
    }

    private /* synthetic */ byte[] cfr_renamed_4686() {
        byte[] byArray = this.cfr_renamed_4.toByteArray();
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return byArray;
    }

    public static sprgom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgom) {
            return (sprgom)arg0;
        }
        if (arg0 != null) {
            return new sprgom(sprnvm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgom(sprnvm sprnvm2) {
        void arg0;
        this.cfr_renamed_3 = sprnvm2.cfr_renamed_312();
        sprgom sprgom2 = this;
        this.cfr_renamed_4 = new BigInteger(1, sproug.cfr_renamed_5085((sprnvm)arg0, false).cfr_renamed_186());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprycn(false, this.cfr_renamed_3, (sprco)new sprfvg(this.cfr_renamed_4686()));
    }
}

