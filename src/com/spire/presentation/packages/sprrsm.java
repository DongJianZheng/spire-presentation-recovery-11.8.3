/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprrsm
extends sprqqe {
    public static final sprktm cfr_renamed_112;
    private sprktm cfr_renamed_119;
    public static final sprddm cfr_renamed_91;
    private sprddm cfr_renamed_0;
    public static final sprktm cfr_renamed_1;
    private sprddm cfr_renamed_2;
    public static final sprddm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public static sprrsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrsm) {
            return (sprrsm)arg0;
        }
        if (arg0 != null) {
            return new sprrsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_4597() {
        return this.cfr_renamed_119.cfr_renamed_97();
    }

    public sprrsm() {
        this.cfr_renamed_0 = cfr_renamed_91;
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_4 = cfr_renamed_112;
        this.cfr_renamed_119 = cfr_renamed_1;
    }

    public BigInteger cfr_renamed_4598() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        if (!this.cfr_renamed_0.equals(cfr_renamed_91)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_0));
        }
        if (!this.cfr_renamed_2.equals(cfr_renamed_3)) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_2));
        }
        if (!this.cfr_renamed_4.cfr_renamed_5078(cfr_renamed_112)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_4));
        }
        if (!this.cfr_renamed_119.cfr_renamed_5078(cfr_renamed_1)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 3, (sprco)this.cfr_renamed_119));
        }
        return new sprcen(sprrvm2);
    }

    static {
        cfr_renamed_91 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);
        cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_135, cfr_renamed_91);
        cfr_renamed_112 = new sprktm(20L);
        cfr_renamed_1 = new sprktm(1L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprrsm(sprszm sprszm2) {
        int n;
        this.cfr_renamed_0 = cfr_renamed_91;
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_4 = cfr_renamed_112;
        this.cfr_renamed_119 = cfr_renamed_1;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_0 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_2 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 2: {
                    this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 3: {
                    this.cfr_renamed_119 = sprktm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprnica.cfr_renamed_9("\bL\u0016L\u0012U\u0013\u0002\tC\u001a"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    public sprrsm(sprddm sprddm2, sprddm sprddm3, sprktm sprktm2, sprktm sprktm3) {
        void arg2;
        void arg1;
        void arg0;
        sprrsm sprrsm2 = this;
        sprrsm sprrsm3 = this;
        sprrsm3.cfr_renamed_0 = arg0;
        sprrsm3.cfr_renamed_2 = arg1;
        sprrsm2.cfr_renamed_4 = arg2;
        sprrsm2.cfr_renamed_119 = sprktm3;
    }

    public sprddm cfr_renamed_4596() {
        return this.cfr_renamed_2;
    }
}

