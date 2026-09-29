/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprehaa;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprtje
extends sprkra {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public static sprtje cfr_renamed_2757(sprszd arg0) {
        return sprtje.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_102));
    }

    public BigInteger cfr_renamed_4259() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtje(sprbne sprbne2) {
        void arg0;
        int n;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprooe.cfr_renamed_341(spryte2, false).cfr_renamed_97();
            } else if (spryte2.cfr_renamed_312() == 1) {
                this.cfr_renamed_3 = sprooe.cfr_renamed_341(spryte2, false).cfr_renamed_97();
            } else {
                throw new IllegalArgumentException(sprehaa.cfr_renamed_9("\u0001H?H;Q:\u0006 G3\u00061H7I!H C&C0\b"));
            }
            n2 = ++n;
        }
    }

    public static sprtje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtje) {
            return (sprtje)arg0;
        }
        if (arg0 != null) {
            return new sprtje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtje(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprtje sprtje2 = this;
        sprtje2.cfr_renamed_4 = arg0;
        sprtje2.cfr_renamed_3 = bigInteger2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, new sprooe(this.cfr_renamed_4)));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1, new sprooe(this.cfr_renamed_3)));
        }
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_4258() {
        return this.cfr_renamed_4;
    }
}

