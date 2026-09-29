/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqega;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxuy;
import com.spire.presentation.packages.sprycn;

public class sprmmm
extends sprqqe {
    public static final int cfr_renamed_0 = 2;
    private final sprddm cfr_renamed_1;
    private final sprddm cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public sprddm cfr_renamed_4202() {
        return this.cfr_renamed_3;
    }

    public static sprmmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmmm) {
            return (sprmmm)arg0;
        }
        if (arg0 != null) {
            return new sprmmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmmm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprqega.cfr_renamed_9("Gle|qgwl4~ffzn4z}sq34Fzl4fr)g`sgu}a{qHxn{{}}|d4ff)yhwHxn{{}}|d4daz`)vl4yflglz}"));
        }
        this.cfr_renamed_2 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        if (sprnvm2.cfr_renamed_312() == 1) {
            sprmmm sprmmm2 = this;
            sprmmm2.cfr_renamed_1 = sprddm.cfr_renamed_5085(sprnvm2, false);
            sprmmm2.cfr_renamed_3 = null;
            return;
        }
        if (sprnvm2.cfr_renamed_312() == 2) {
            sprmmm sprmmm3 = this;
            sprmmm3.cfr_renamed_1 = null;
            sprmmm3.cfr_renamed_3 = sprddm.cfr_renamed_5085(sprnvm2, false);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxuy.cfr_renamed_9("IPwPsIr\u001eh_{\u001ezQiPx\u0004<")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprmmm sprmmm2 = this;
        sprrvm2.cfr_renamed_5004(sprmmm2.cfr_renamed_2);
        if (sprmmm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprmmm(sprddm sprddm2, int n, sprddm sprddm3) {
        void arg1;
        void arg0;
        void arg2;
        if (sprddm2 == null || arg2 == null) {
            throw new NullPointerException(sprqega.cfr_renamed_9("Hxn{{}}|d]mqg``r`q{g)whzg{}4kq)z|xe"));
        }
        this.cfr_renamed_2 = arg0;
        if (arg1 == true) {
            sprmmm sprmmm2 = this;
            sprmmm2.cfr_renamed_1 = arg2;
            sprmmm2.cfr_renamed_3 = null;
            return;
        }
        if (arg1 == 2) {
            sprmmm sprmmm3 = this;
            sprmmm3.cfr_renamed_1 = null;
            sprmmm3.cfr_renamed_3 = arg2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxuy.cfr_renamed_9("krUrQkP<JeNy\u0004<")).append((int)arg1).toString());
    }
}

