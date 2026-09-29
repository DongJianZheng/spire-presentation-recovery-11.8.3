/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgrm;
import com.spire.presentation.packages.sprlkaa;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprptm;
import com.spire.presentation.packages.sprqlm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprbvm
extends sprqqe {
    private sprszm cfr_renamed_2;
    private sprgrm cfr_renamed_3;
    private sprptm cfr_renamed_4;

    public sprgrm cfr_renamed_4826() {
        return this.cfr_renamed_3;
    }

    public sprptm cfr_renamed_609() {
        return this.cfr_renamed_4;
    }

    public static sprbvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbvm) {
            return (sprbvm)arg0;
        }
        if (arg0 != null) {
            return new sprbvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprbvm sprbvm2 = this;
        sprrvm2.cfr_renamed_5004(sprbvm2.cfr_renamed_4);
        sprbvm sprbvm3 = this;
        sprbvm3.cfr_renamed_11322(sprrvm2, sprbvm3.cfr_renamed_3);
        sprbvm2.cfr_renamed_11322(sprrvm2, sprbvm3.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ void cfr_renamed_11322(sprrvm arg0, sprco arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_5004(arg1);
        }
    }

    public sprqlm[] cfr_renamed_4824() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprqlm[] sprqlmArray = new sprqlm[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqlmArray.length) {
            int n3 = n++;
            sprqlmArray[n3] = sprqlm.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqlmArray;
    }

    public static sprbvm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprbvm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprgrm cfr_renamed_2431() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprbvm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = sprptm.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (e instanceof sprnvm || e instanceof sprgrm) {
                this.cfr_renamed_3 = sprgrm.cfr_renamed_23(e);
                continue;
            }
            this.cfr_renamed_2 = sprszm.cfr_renamed_23(e);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprbvm(sprptm sprptm2, sprgrm sprgrm2, sprqlm[] sprqlmArray) {
        void arg2;
        void arg1;
        void arg0;
        if (sprptm2 == null) {
            throw new IllegalArgumentException(sprlkaa.cfr_renamed_9("\u0019X[IJi[J\u0019\u001b]ZPUQO\u001eY[\u001bPNRW"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
        if (arg2 != null) {
            sprbvm sprbvm2 = this;
            sprbvm2.cfr_renamed_2 = new sprcen((sprco[])arg2);
        }
    }
}

