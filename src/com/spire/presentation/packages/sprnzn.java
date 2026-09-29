/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdtn;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprnzn
extends sprqqe {
    private sprgbf cfr_renamed_0;
    private sprgbf cfr_renamed_1;
    private sproug cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprdtn cfr_renamed_4;

    public sprdtn cfr_renamed_15392() {
        return this.cfr_renamed_4;
    }

    public sprnzn(sprszm sprszm2) {
        sprco sprco2;
        Iterator<sprco> iterator = sprszm2.iterator();
        boolean bl = iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sprdtn.cfr_renamed_23(iterator2.next());
        Iterator<sprco> iterator3 = iterator;
        iterator2.hasNext();
        this.cfr_renamed_2 = sproug.cfr_renamed_23(iterator.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        this.cfr_renamed_1 = sprgbf.cfr_renamed_23(iterator.next());
        if (iterator3.hasNext() && (sprco2 = iterator.next()) instanceof sprnvm) {
            this.cfr_renamed_0 = sprgbf.cfr_renamed_23(spresca.cfr_renamed_11777(sprco2, sprnvm.class).cfr_renamed_8122());
        }
    }

    public sprnzn cfr_renamed_15393(sproug arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprnzn cfr_renamed_15394(byte[] byArray) {
        void arg0;
        this.cfr_renamed_1 = new sprdye((byte[])arg0);
        return this;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnzn(sprdtn sprdtn2, sproug sproug2, sprlem sprlem2, sprgbf sprgbf2, sprgbf sprgbf3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnzn sprnzn2 = this;
        sprnzn sprnzn3 = this;
        this.cfr_renamed_4 = arg0;
        sprnzn3.cfr_renamed_2 = arg1;
        sprnzn3.cfr_renamed_3 = arg2;
        sprnzn2.cfr_renamed_1 = arg3;
        sprnzn2.cfr_renamed_0 = sprgbf3;
    }

    public sprnzn() {
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public static sprnzn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnzn) {
            return (sprnzn)arg0;
        }
        if (arg0 != null) {
            return new sprnzn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgbf cfr_renamed_5339() {
        return this.cfr_renamed_0;
    }

    public sproug cfr_renamed_8455() {
        return this.cfr_renamed_2;
    }

    public sprnzn cfr_renamed_15395(sprgbf arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprnzn cfr_renamed_15396(sprdtn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprnzn cfr_renamed_15397(sprgbf arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_1;
    }

    public sprnzn cfr_renamed_15398(sprlem arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprlem cfr_renamed_15399() {
        return this.cfr_renamed_3;
    }
}

