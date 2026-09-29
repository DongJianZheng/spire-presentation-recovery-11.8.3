/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfsz;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;

public class sprizl
extends sprqqe {
    private sprddm cfr_renamed_3;
    private sprgbf cfr_renamed_4;

    public static sprizl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprizl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprizl(sprvhm sprvhm2) {
        void arg0;
        sprizl sprizl2 = this;
        sprizl2.cfr_renamed_3 = arg0.cfr_renamed_593();
        sprizl2.cfr_renamed_4 = sprvhm2.cfr_renamed_2314();
    }

    public sprddm cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprizl(sprddm sprddm2, sprgbf sprgbf2) {
        void arg0;
        sprizl sprizl2 = this;
        sprizl2.cfr_renamed_3 = arg0;
        sprizl2.cfr_renamed_4 = sprgbf2;
    }

    public static sprizl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprizl) {
            return (sprizl)arg0;
        }
        if (arg0 != null) {
            return new sprizl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgbf cfr_renamed_11136() {
        return this.cfr_renamed_4;
    }

    public static sprizl cfr_renamed_5322(sprhgm arg0) {
        return sprizl.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_287));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprizl(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprfsz.cfr_renamed_9("KAZ\\@JGV@\u0019]QALB]\u000eZAWZXGW\u000eV@UW\u0019\u001c\u0019KUKTKWZJ"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

