/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprjsm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spreom
extends sprqqe {
    private sprddm cfr_renamed_2;
    private final sprgbf cfr_renamed_3;
    private sprjsm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreom(sprszm sprszm2) {
        int n;
        sprszm sprszm3 = sprszm2;
        int n2 = sprszm3.cfr_renamed_84() - 1;
        this.cfr_renamed_3 = sprgbf.cfr_renamed_23(sprszm3.cfr_renamed_85(n2));
        int n3 = n = --n2;
        while (n3 >= 0) {
            void arg0;
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_2 = sprddm.cfr_renamed_5085(sprnvm2, true);
            } else {
                this.cfr_renamed_4 = sprjsm.cfr_renamed_5085(sprnvm2, true);
            }
            n3 = --n;
        }
    }

    public sprddm cfr_renamed_4881() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(true, arg1, arg2));
        }
    }

    public spreom(sprddm arg0, sprjsm arg1, byte[] arg2) {
        this(arg0, arg1, new sprdye(arg2));
    }

    /*
     * WARNING - void declaration
     */
    public spreom(sprddm sprddm2, sprjsm sprjsm2, sprdye sprdye2) {
        void arg1;
        void arg0;
        spreom spreom2 = this;
        this.cfr_renamed_2 = arg0;
        spreom2.cfr_renamed_4 = arg1;
        spreom2.cfr_renamed_3 = sprdye2;
    }

    public sprjsm cfr_renamed_2443() {
        return this.cfr_renamed_4;
    }

    public sprgbf cfr_renamed_4882() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        spreom spreom2 = this;
        sprrvm sprrvm3 = sprrvm2;
        spreom spreom3 = this;
        spreom3.cfr_renamed_11316(sprrvm2, 0, spreom3.cfr_renamed_2);
        spreom2.cfr_renamed_11316(sprrvm3, 1, this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(spreom2.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static spreom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreom) {
            return (spreom)arg0;
        }
        if (arg0 != null) {
            return new spreom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

