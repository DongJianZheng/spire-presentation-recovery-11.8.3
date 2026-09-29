/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlhz;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpqm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprslm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprulm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprnkm
extends sprqqe {
    private sprulm cfr_renamed_2;
    private sprslm cfr_renamed_3;
    private sprpqm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnkm(sprslm sprslm2, sprpqm sprpqm2, sprulm sprulm2) {
        void arg1;
        void arg0;
        sprnkm sprnkm2 = this;
        this.cfr_renamed_3 = arg0;
        sprnkm2.cfr_renamed_4 = arg1;
        sprnkm2.cfr_renamed_2 = sprulm2;
    }

    public static sprnkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnkm) {
            return (sprnkm)arg0;
        }
        if (arg0 != null) {
            return new sprnkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprulm cfr_renamed_4678() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (null != this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3.cfr_renamed_119()));
        }
        if (null != this.cfr_renamed_4) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_4.cfr_renamed_119()));
        }
        if (null != this.cfr_renamed_2) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_2.cfr_renamed_119()));
        }
        return new sprcen(sprrvm2);
    }

    public sprpqm cfr_renamed_4676() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprnkm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 128);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprslm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_4 = sprpqm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2 = sprulm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(sprlhz.cfr_renamed_9("T7Q>Z:Q{I:Z"));
    }

    public sprslm cfr_renamed_4677() {
        return this.cfr_renamed_3;
    }
}

