/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprtrm
extends sprqqe {
    public int cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public int cfr_renamed_2398() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    public static sprtrm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtrm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public sprtrm(int arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        sprtrm sprtrm2 = this;
        this.cfr_renamed_1 = arg0;
        sprtrm sprtrm3 = this;
        sprtrm2.cfr_renamed_2 = new sprktm(arg1);
        sprtrm3.cfr_renamed_3 = new sprktm(arg2);
        sprtrm2.cfr_renamed_4 = new sprktm(arg3);
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public int cfr_renamed_4810() {
        return this.cfr_renamed_1;
    }

    public sprtrm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_1 = ((sprktm)enumeration.nextElement()).cfr_renamed_5023();
        this.cfr_renamed_2 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_3 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_4 = (sprktm)enumeration.nextElement();
    }

    public static sprtrm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtrm) {
            return (sprtrm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprtrm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfvo.cfr_renamed_9("d\u0012[\u001dA\u0015I\\j3~(\u001eH\u001cL}\u001d_\u001d@\u0019Y\u0019_F\r")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprtrm sprtrm2 = this;
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        sprrvm2.cfr_renamed_5004(sprtrm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprtrm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

