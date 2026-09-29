/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahm;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzfm;
import java.util.Enumeration;

public class sprzhm
extends sprqqe {
    private sprbxm cfr_renamed_86;
    private sprjfn cfr_renamed_152;
    private sprzfm cfr_renamed_112;
    private sprhgm cfr_renamed_119;
    private sprahm cfr_renamed_91;
    private sprigm cfr_renamed_0;
    private sprlem cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprbxm cfr_renamed_586() {
        return this.cfr_renamed_86;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(10);
        sprzhm sprzhm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprzhm sprzhm3 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprzhm3.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(sprzhm3.cfr_renamed_91);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprzhm2.cfr_renamed_152);
        if (sprzhm2.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_112);
        }
        if (this.cfr_renamed_86 != null && this.cfr_renamed_86.cfr_renamed_587()) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_86);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_0));
        }
        if (this.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_119));
        }
        return new sprcen(sprrvm2);
    }

    public static sprzhm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzhm) {
            return (sprzhm)arg0;
        }
        if (arg0 != null) {
            return new sprzhm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_4;
    }

    public sprzfm cfr_renamed_589() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprzhm(sprlem sprlem2, sprahm sprahm2, sprktm sprktm2, sprjfn sprjfn2, sprzfm sprzfm2, sprbxm sprbxm2, sprktm sprktm3, sprigm sprigm2, sprhgm sprhgm2) {
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprzhm sprzhm2 = this;
        sprzhm sprzhm3 = this;
        sprzhm sprzhm4 = this;
        sprzhm sprzhm5 = this;
        sprzhm sprzhm6 = this;
        this.cfr_renamed_2 = new sprktm(1L);
        this.cfr_renamed_1 = arg0;
        sprzhm5.cfr_renamed_91 = arg1;
        sprzhm5.cfr_renamed_4 = arg2;
        sprzhm4.cfr_renamed_152 = arg3;
        sprzhm4.cfr_renamed_112 = arg4;
        sprzhm3.cfr_renamed_86 = arg5;
        sprzhm3.cfr_renamed_3 = arg6;
        sprzhm2.cfr_renamed_0 = arg7;
        sprzhm2.cfr_renamed_119 = sprhgm2;
    }

    public sprjfn cfr_renamed_588() {
        return this.cfr_renamed_152;
    }

    public sprktm cfr_renamed_596() {
        return this.cfr_renamed_3;
    }

    public sprigm cfr_renamed_590() {
        return this.cfr_renamed_0;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_119;
    }

    public sprahm cfr_renamed_592() {
        return this.cfr_renamed_91;
    }

    public sprlem cfr_renamed_598() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprzhm(sprszm arg0) {
        sprzhm sprzhm2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprzhm2.cfr_renamed_2 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_1 = sprlem.cfr_renamed_23(enumeration.nextElement());
        sprzhm2.cfr_renamed_91 = sprahm.cfr_renamed_23(enumeration.nextElement());
        sprzhm2.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement());
        sprzhm2.cfr_renamed_152 = sprjfn.cfr_renamed_23(enumeration.nextElement());
        sprzhm2.cfr_renamed_86 = sprbxm.cfr_renamed_655(false);
        block4: while (enumeration.hasMoreElements()) {
            sprqqe sprqqe2 = (sprqqe)enumeration.nextElement();
            if (sprqqe2 instanceof sprnvm) {
                sprnvm sprnvm2 = (sprnvm)sprqqe2;
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_0 = sprigm.cfr_renamed_5085(sprnvm2, true);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_119 = sprhgm.cfr_renamed_5085(sprnvm2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprxvh.cfr_renamed_9("E}{}\u007fd~3drw3fr|fu3")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            if (sprqqe2 instanceof sprszm || sprqqe2 instanceof sprzfm) {
                this.cfr_renamed_112 = sprzfm.cfr_renamed_23(sprqqe2);
                continue;
            }
            if (sprqqe2 instanceof sprbxm) {
                this.cfr_renamed_86 = sprbxm.cfr_renamed_23(sprqqe2);
                continue;
            }
            if (!(sprqqe2 instanceof sprktm)) continue;
            this.cfr_renamed_3 = sprktm.cfr_renamed_23(sprqqe2);
        }
        return;
    }
}

