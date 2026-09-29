/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class spryrm
extends sprqqe {
    private final sprddm cfr_renamed_0;
    private final sprktm cfr_renamed_1;
    private final sprktm cfr_renamed_2;
    private final sproug cfr_renamed_3;
    private static final sprddm cfr_renamed_4 = new sprddm(sprdl.cfr_renamed_1763, sprpen.cfr_renamed_4);

    public sprddm cfr_renamed_2386() {
        if (this.cfr_renamed_0 != null) {
            return this.cfr_renamed_0;
        }
        return cfr_renamed_4;
    }

    public spryrm(byte[] arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, null);
    }

    public BigInteger cfr_renamed_4600() {
        if (this.cfr_renamed_1 != null) {
            return this.cfr_renamed_1.cfr_renamed_97();
        }
        return null;
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_186());
    }

    private /* synthetic */ spryrm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_3 = (sproug)enumeration.nextElement();
        this.cfr_renamed_2 = (sprktm)enumeration.nextElement();
        if (enumeration.hasMoreElements()) {
            Object e;
            Object e2 = enumeration.nextElement();
            if (e2 instanceof sprktm) {
                this.cfr_renamed_1 = sprktm.cfr_renamed_23(e2);
                e = enumeration.hasMoreElements() ? (e2 = enumeration.nextElement()) : (e2 = null);
            } else {
                this.cfr_renamed_1 = null;
                e = e2;
            }
            if (e != null) {
                this.cfr_renamed_0 = sprddm.cfr_renamed_23(e2);
                return;
            }
            this.cfr_renamed_0 = null;
            return;
        }
        this.cfr_renamed_1 = null;
        this.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    public spryrm(byte[] byArray, int n, int n2, sprddm sprddm2) {
        void arg3;
        spryrm spryrm2;
        void arg1;
        void arg0;
        spryrm spryrm3 = this;
        this.cfr_renamed_3 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
        spryrm3.cfr_renamed_2 = new sprktm((long)arg1);
        if (n2 > 0) {
            void arg2;
            spryrm2 = this;
            this.cfr_renamed_1 = new sprktm((long)arg2);
        } else {
            spryrm2 = this;
            this.cfr_renamed_1 = null;
        }
        spryrm2.cfr_renamed_0 = arg3;
    }

    public static spryrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryrm) {
            return (spryrm)arg0;
        }
        if (arg0 != null) {
            return new spryrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        spryrm spryrm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(spryrm2.cfr_renamed_2);
        if (spryrm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_0 != null && !this.cfr_renamed_0.equals(cfr_renamed_4)) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        }
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    public spryrm(byte[] arg0, int arg1) {
        this(arg0, arg1, 0);
    }

    public spryrm(byte[] arg0, int arg1, sprddm arg2) {
        this(arg0, arg1, 0, arg2);
    }

    public boolean cfr_renamed_2431() {
        return this.cfr_renamed_0 == null || this.cfr_renamed_0.equals(cfr_renamed_4);
    }
}

