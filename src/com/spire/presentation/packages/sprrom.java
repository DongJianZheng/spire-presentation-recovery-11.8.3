/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprrom
extends sprqqe {
    public sprktm cfr_renamed_91;
    public sprktm cfr_renamed_0;
    public sprktm cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(6);
        sprrom sprrom2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrom sprrom3 = this;
        sprrvm2.cfr_renamed_5004(sprrom3.cfr_renamed_2);
        sprrvm4.cfr_renamed_5004(sprrom3.cfr_renamed_3);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_91);
        sprrvm2.cfr_renamed_5004(sprrom2.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(sprrom2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public sprrom(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_2 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_3 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_91 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_0 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_4 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_1 = (sprktm)enumeration.nextElement();
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_91.cfr_renamed_162();
    }

    public static sprrom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprrom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_0.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public sprrom(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, int arg4, BigInteger arg5) {
        sprrom sprrom2 = this;
        this.cfr_renamed_2 = new sprktm(arg0);
        sprrom2.cfr_renamed_3 = new sprktm(arg1);
        this.cfr_renamed_91 = new sprktm(arg2);
        this.cfr_renamed_0 = new sprktm(arg3);
        this.cfr_renamed_4 = new sprktm(arg4);
        this.cfr_renamed_1 = new sprktm(arg5);
    }

    public static sprrom cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrom) {
            return (sprrom)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprrom((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcno.cfr_renamed_9("w;H4R<Zuy\u001am\u0001\ra\u000fen4L4S0J0Lo\u001e")).append(arg0.getClass().getName()).toString());
    }
}

