/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdom;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrqm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprltm
extends sprqqe {
    private final sprrqm[] cfr_renamed_4;

    public static sprltm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprltm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprltm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprltm) {
            return (sprltm)arg0;
        }
        if (arg0 != null) {
            return new sprltm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprltm(sprrqm sprrqm2) {
        void arg0;
        sprrqm[] sprrqmArray = new sprrqm[1];
        sprrqmArray[0] = arg0;
        this.cfr_renamed_4 = sprrqmArray;
    }

    public sprltm(sprrqm[] sprrqmArray) {
        this.cfr_renamed_4 = sprdom.cfr_renamed_11225(sprrqmArray);
    }

    public sprrqm[] cfr_renamed_9807() {
        return sprdom.cfr_renamed_11225(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprltm(sprszm sprszm2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new sprrqm[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprrqm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }
}

