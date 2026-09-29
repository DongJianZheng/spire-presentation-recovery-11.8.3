/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcrm;
import com.spire.presentation.packages.sprgep;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprqfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruen;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprgwm
extends sprqqe {
    private final sprkgn cfr_renamed_1;
    private final sprszm cfr_renamed_2;
    private final sprqfn cfr_renamed_3;
    private final spruen cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprgwm sprgwm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprgwm2.cfr_renamed_2);
        if (sprgwm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprqfn cfr_renamed_11414() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgwm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 2 || arg0.cfr_renamed_84() > 4) {
            throw new IllegalArgumentException(sprgep.cfr_renamed_9("\u0005v\u000fw\u001ej\t{\u00188\u001f}\u001dm\tv\u000f}Lk\u0005b\t"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprqfn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() > 3) {
            sprgwm sprgwm2 = this;
            sprgwm2.cfr_renamed_1 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(2));
            sprgwm2.cfr_renamed_4 = spruen.cfr_renamed_11415(arg0.cfr_renamed_85(3));
            return;
        }
        if (arg0.cfr_renamed_84() > 2) {
            if (arg0.cfr_renamed_85(2) instanceof sprkgn) {
                sprgwm sprgwm3 = this;
                sprgwm3.cfr_renamed_1 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(2));
                sprgwm3.cfr_renamed_4 = null;
                return;
            }
            this.cfr_renamed_1 = null;
            this.cfr_renamed_4 = spruen.cfr_renamed_11415(arg0.cfr_renamed_85(2));
            return;
        }
        this.cfr_renamed_1 = null;
        this.cfr_renamed_4 = null;
    }

    public sprkgn cfr_renamed_11411() {
        return this.cfr_renamed_1;
    }

    public spraen cfr_renamed_647() {
        if (null == this.cfr_renamed_1 || this.cfr_renamed_1 instanceof spraen) {
            return (spraen)this.cfr_renamed_1;
        }
        return new spraen(this.cfr_renamed_1.cfr_renamed_314());
    }

    public spruen cfr_renamed_5670() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgwm(sprqfn sprqfn2, sprszm sprszm2, sprkgn sprkgn2, spruen spruen2) {
        void arg2;
        void arg1;
        void arg0;
        sprgwm sprgwm2 = this;
        sprgwm sprgwm3 = this;
        sprgwm3.cfr_renamed_3 = arg0;
        sprgwm3.cfr_renamed_2 = arg1;
        sprgwm2.cfr_renamed_1 = arg2;
        sprgwm2.cfr_renamed_4 = spruen2;
    }

    public sprybn[] cfr_renamed_11404() {
        return sprcrm.cfr_renamed_11360(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_11410() {
        return this.cfr_renamed_4 != null;
    }

    public static sprgwm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgwm) {
            return (sprgwm)arg0;
        }
        if (arg0 != null) {
            return new sprgwm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

