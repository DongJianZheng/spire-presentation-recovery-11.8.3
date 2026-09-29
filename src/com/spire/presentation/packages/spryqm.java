/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbim;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;

public class spryqm
extends sprqqe {
    private sprddm cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprjhm cfr_renamed_3;
    private static final sprddm cfr_renamed_4 = new sprddm(sprwr.cfr_renamed_1226);

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryqm(sprszm sprszm2) {
        spryqm spryqm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbim.cfr_renamed_9("&\u0010\u0000Q\u0017\u0014\u0015\u0004\u0001\u001f\u0007\u0014D\u0002\r\u000b\u0001KD")).append(arg0.cfr_renamed_84()).toString());
        }
        int n = 0;
        if (arg0.cfr_renamed_85(0) instanceof sproug) {
            spryqm2 = this;
            this.cfr_renamed_1 = cfr_renamed_4;
        } else {
            spryqm2 = this;
            sprddm sprddm2 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n).cfr_renamed_119());
            ++n;
            this.cfr_renamed_1 = sprddm2;
        }
        sproug sproug2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(n).cfr_renamed_119());
        spryqm2.cfr_renamed_2 = sproug2.cfr_renamed_186();
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_3 = sprjhm.cfr_renamed_23(arg0.cfr_renamed_85(n));
        }
    }

    public sprjhm cfr_renamed_630() {
        return this.cfr_renamed_3;
    }

    public spryqm(sprddm arg0, byte[] arg1) {
        this(arg0, arg1, null);
    }

    public static spryqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryqm) {
            return (spryqm)arg0;
        }
        if (arg0 != null) {
            return new spryqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryqm(sprddm sprddm2, byte[] byArray, sprjhm sprjhm2) {
        void arg2;
        void arg1;
        spryqm spryqm2;
        if (sprddm2 == null) {
            spryqm2 = this;
            this.cfr_renamed_1 = cfr_renamed_4;
        } else {
            void arg0;
            spryqm2 = this;
            this.cfr_renamed_1 = arg0;
        }
        spryqm2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg1);
        this.cfr_renamed_3 = arg2;
    }

    public spryqm(byte[] arg0) {
        this(null, arg0, null);
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (!this.cfr_renamed_1.equals(cfr_renamed_4)) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2).cfr_renamed_119());
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    public spryqm(byte[] arg0, sprjhm arg1) {
        this(null, arg0, arg1);
    }

    public byte[] cfr_renamed_629() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }
}

