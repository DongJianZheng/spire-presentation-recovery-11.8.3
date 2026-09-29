/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakp;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprmhba;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprsum
extends sprqqe {
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprpfn cfr_renamed_4;

    public BigInteger cfr_renamed_359() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_360() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprsum sprsum2 = this;
        sprrvm2.cfr_renamed_5004(sprsum2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprsum2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsum(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprakp.cfr_renamed_9("x\u0005^DI\u0001K\u0011_\nY\u0001\u001a\u0017S\u001e_^\u001a")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprsum sprsum2 = this;
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_4 = sprpfn.cfr_renamed_23(enumeration2.nextElement());
        sprsum2.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        sprsum2.cfr_renamed_2 = sprktm.cfr_renamed_23(enumeration.nextElement());
    }

    public static sprsum cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprsum) {
            return (sprsum)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprsum(sprszm.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(sprmhba.cfr_renamed_9("p+n+j2kej'o f1%,keb q\fk6q$k&`"));
    }

    public sprsum(String arg0, int arg1, int arg2) {
        sprsum sprsum2 = this;
        this.cfr_renamed_4 = new sprldn(arg0, true);
        sprsum2.cfr_renamed_3 = new sprktm(arg1);
        this.cfr_renamed_2 = new sprktm(arg2);
    }

    public String cfr_renamed_358() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }
}

