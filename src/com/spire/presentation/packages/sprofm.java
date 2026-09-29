/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprofm
extends sprqqe {
    private sprszm cfr_renamed_4;

    public sprofm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    public sprxgf cfr_renamed_284() {
        return this.cfr_renamed_4595(0);
    }

    public sprofm(BigInteger bigInteger) {
        sprrvm sprrvm2;
        byte[] byArray = sprhdf.cfr_renamed_514(bigInteger);
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(new sprktm(1L));
        sprrvm3.cfr_renamed_5004(new sprfvg(byArray));
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprofm(BigInteger arg0, sprco arg1) {
        this(arg0, null, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprofm(BigInteger bigInteger, sprgbf sprgbf2, sprco sprco2) {
        void arg1;
        void arg2;
        sprrvm sprrvm2;
        byte[] byArray = sprhdf.cfr_renamed_514(bigInteger);
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprrvm3.cfr_renamed_5004(new sprktm(1L));
        sprrvm3.cfr_renamed_5004(new sprfvg(byArray));
        if (arg2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)arg2));
        }
        if (arg1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)arg1));
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public sprgbf cfr_renamed_1157() {
        return (sprgbf)this.cfr_renamed_4595(1);
    }

    private /* synthetic */ sprxgf cfr_renamed_4595(int arg0) {
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2;
            sprco sprco2 = (sprco)enumeration.nextElement();
            if (!(sprco2 instanceof sprnvm) || (sprnvm2 = (sprnvm)sprco2).cfr_renamed_312() != arg0) continue;
            return sprnvm2.cfr_renamed_8225().cfr_renamed_119();
        }
        return null;
    }

    public BigInteger cfr_renamed_1521() {
        sproug sproug2 = (sproug)this.cfr_renamed_4.cfr_renamed_85(1);
        return new BigInteger(1, sproug2.cfr_renamed_186());
    }
}

