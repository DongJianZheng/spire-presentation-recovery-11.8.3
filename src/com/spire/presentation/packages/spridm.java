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

public class spridm
extends sprqqe {
    private sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spridm(int n, BigInteger bigInteger, sprgbf sprgbf2, sprco sprco2) {
        void arg2;
        void arg3;
        sprrvm sprrvm2;
        void arg1;
        byte[] byArray = sprhdf.cfr_renamed_512((n + 7) / 8, (BigInteger)arg1);
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprrvm3.cfr_renamed_5004(new sprktm(1L));
        sprrvm3.cfr_renamed_5004(new sprfvg(byArray));
        if (arg3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)arg3));
        }
        if (arg2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)arg2));
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public static spridm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spridm) {
            return (spridm)arg0;
        }
        if (arg0 != null) {
            return new spridm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spridm(BigInteger arg0, sprco arg1) {
        this(arg0, null, arg1);
    }

    private /* synthetic */ spridm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    public sprqqe cfr_renamed_9439() {
        return this.cfr_renamed_11197(0, -1);
    }

    public spridm(BigInteger arg0) {
        this(arg0.bitLength(), arg0);
    }

    public spridm(BigInteger arg0, sprgbf arg1, sprco arg2) {
        this(arg0.bitLength(), arg0, arg1, arg2);
    }

    public spridm(int arg0, BigInteger arg1, sprco arg2) {
        this(arg0, arg1, null, arg2);
    }

    public sprxgf cfr_renamed_284() {
        return this.cfr_renamed_9439().cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public spridm(int n, BigInteger bigInteger) {
        sprrvm sprrvm2;
        void arg1;
        byte[] byArray = sprhdf.cfr_renamed_512((n + 7) / 8, (BigInteger)arg1);
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(new sprktm(1L));
        sprrvm3.cfr_renamed_5004(new sprfvg(byArray));
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public sprgbf cfr_renamed_1157() {
        return (sprgbf)this.cfr_renamed_11197(1, 3);
    }

    private /* synthetic */ sprqqe cfr_renamed_11197(int arg0, int arg1) {
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2;
            sprco sprco2 = (sprco)enumeration.nextElement();
            if (!(sprco2 instanceof sprnvm) || !(sprnvm2 = (sprnvm)sprco2).cfr_renamed_10764(arg0)) continue;
            if (arg1 < 0) {
                return sprnvm2.cfr_renamed_8225().cfr_renamed_119();
            }
            return sprnvm2.cfr_renamed_10766(true, arg1);
        }
        return null;
    }

    public BigInteger cfr_renamed_1521() {
        sproug sproug2 = (sproug)this.cfr_renamed_4.cfr_renamed_85(1);
        return new BigInteger(1, sproug2.cfr_renamed_186());
    }
}

