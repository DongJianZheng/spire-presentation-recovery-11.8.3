/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfsm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvzca;
import com.spire.presentation.packages.sprxgf;

public class sprolm
extends sprqqe {
    private final sprfsm cfr_renamed_0;
    private final sprddm cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprlvm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(5);
        sprolm sprolm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm2.cfr_renamed_5004(sprolm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprolm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        return new sprcen(sprrvm2);
    }

    public sprlvm cfr_renamed_11400() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprolm(sprfsm sprfsm2, sprlvm sprlvm2, sprddm sprddm2, sprddm sprddm3, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprolm sprolm2 = this;
        sprolm sprolm3 = this;
        this.cfr_renamed_0 = arg0;
        sprolm3.cfr_renamed_4 = arg1;
        sprolm3.cfr_renamed_3 = arg2;
        sprolm2.cfr_renamed_1 = arg3;
        sprolm2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    public sprddm cfr_renamed_11401() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprolm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9("\u0011\u000e\u001b\u000f\n\u0012\u001d\u0003\f@\u000b\u0005\t\u0015\u001d\u000e\u001b\u0005X\u0013\u0011\u001a\u001d"));
        }
        void v0 = arg0;
        sprolm sprolm2 = this;
        void v2 = arg0;
        this.cfr_renamed_0 = sprfsm.cfr_renamed_23(v2.cfr_renamed_85(0));
        sprolm2.cfr_renamed_4 = sprlvm.cfr_renamed_23(v2.cfr_renamed_85(1));
        sprolm2.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_1 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(3));
        this.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v0.cfr_renamed_85(4)).cfr_renamed_186());
    }

    public sprddm cfr_renamed_11402() {
        return this.cfr_renamed_3;
    }

    public sprfsm cfr_renamed_3260() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_4894() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public static sprolm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprolm) {
            return (sprolm)arg0;
        }
        if (arg0 != null) {
            return new sprolm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

