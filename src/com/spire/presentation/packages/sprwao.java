/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzzn;
import java.util.Iterator;

@sprtea
public class sprwao
extends sprqqe {
    private sprgbf cfr_renamed_3;
    private sprzzn cfr_renamed_4;

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprwao(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sprzzn.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        this.cfr_renamed_3 = sprgbf.cfr_renamed_23(iterator.next());
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    public sprwao() {
    }

    /*
     * WARNING - void declaration
     */
    public sprwao cfr_renamed_1371(byte[] byArray) {
        void arg0;
        this.cfr_renamed_3 = new sprdye((byte[])arg0);
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprwao cfr_renamed_15440(sprgbf arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprzzn cfr_renamed_15392() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwao(sprzzn sprzzn2, sprgbf sprgbf2) {
        void arg0;
        sprwao sprwao2 = this;
        sprwao2.cfr_renamed_4 = arg0;
        sprwao2.cfr_renamed_3 = sprgbf2;
    }

    public static sprwao cfr_renamed_23(Object arg0) throws Exception {
        if (arg0 instanceof sprwao) {
            return (sprwao)arg0;
        }
        if (arg0 != null) {
            return new sprwao(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprwao cfr_renamed_15441(sprzzn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }
}

