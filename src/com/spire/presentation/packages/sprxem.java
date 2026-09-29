/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprugb;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprxem
extends sprqqe {
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public sprxem(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        sprxem sprxem2 = this;
        this.cfr_renamed_4 = new sprktm(arg0);
        sprxem2.cfr_renamed_2 = new sprktm(arg1);
        this.cfr_renamed_3 = new sprktm(arg2);
    }

    public static sprxem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxem) {
            return (sprxem)arg0;
        }
        if (arg0 != null) {
            return new sprxem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprxem sprxem2 = this;
        sprrvm2.cfr_renamed_5004(sprxem2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprxem2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxem(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprugb.cfr_renamed_9("L1jp}5\u007f%k>m5.#g*kj.")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprxem sprxem2 = this;
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        sprxem2.cfr_renamed_2 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        sprxem2.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration.nextElement());
    }

    public static sprxem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprxem.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }
}

