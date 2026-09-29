/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprmvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprzpm
extends sprqqe {
    private sprmvm[] cfr_renamed_4;

    public static sprzpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzpm) {
            return (sprzpm)arg0;
        }
        if (arg0 != null) {
            return new sprzpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprmvm[] cfr_renamed_11324(sprmvm[] arg0) {
        sprmvm[] sprmvmArray = new sprmvm[arg0.length];
        System.arraycopy(arg0, 0, sprmvmArray, 0, sprmvmArray.length);
        return sprmvmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.length);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4[n++]);
            n2 = n;
        }
        return new sprcen(sprrvm2);
    }

    public static sprzpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprzpm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprzpm(sprmvm[] sprmvmArray) {
        sprzpm sprzpm2 = this;
        sprzpm2.cfr_renamed_4 = sprzpm2.cfr_renamed_11324(sprmvmArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzpm(sprszm sprszm2) {
        void arg0;
        Enumeration enumeration;
        this.cfr_renamed_4 = new sprmvm[sprszm2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_4[++n] = sprmvm.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    public sprmvm[] cfr_renamed_686() {
        sprzpm sprzpm2 = this;
        return sprzpm2.cfr_renamed_11324(sprzpm2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprzpm(sprmvm sprmvm2) {
        void arg0;
        this.cfr_renamed_4 = new sprmvm[1];
        this.cfr_renamed_4[0] = arg0;
    }
}

