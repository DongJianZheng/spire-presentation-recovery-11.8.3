/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprygm
extends sprqqe {
    private sprsem[] cfr_renamed_3;
    private sprsem[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprcen(this.cfr_renamed_4)));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)new sprcen(this.cfr_renamed_3)));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprygm(sprsem[] sprsemArray, sprsem[] sprsemArray2) {
        void arg0;
        sprygm sprygm2 = this;
        sprygm2.cfr_renamed_4 = sprygm.cfr_renamed_11140((sprsem[])arg0);
        sprygm2.cfr_renamed_3 = sprygm.cfr_renamed_11140(sprsemArray2);
    }

    private static /* synthetic */ sprsem[] cfr_renamed_11140(sprsem[] arg0) {
        if (arg0 != null) {
            sprsem[] sprsemArray = new sprsem[arg0.length];
            System.arraycopy(arg0, 0, sprsemArray, 0, sprsemArray.length);
            return sprsemArray;
        }
        return null;
    }

    public sprsem[] cfr_renamed_348() {
        return sprygm.cfr_renamed_11140(this.cfr_renamed_4);
    }

    public sprsem[] cfr_renamed_350() {
        return sprygm.cfr_renamed_11140(this.cfr_renamed_3);
    }

    private /* synthetic */ sprsem[] cfr_renamed_11141(sprszm arg0) {
        int n;
        sprsem[] sprsemArray = new sprsem[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprsemArray.length) {
            int n3 = n++;
            sprsemArray[n3] = sprsem.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsemArray;
    }

    private /* synthetic */ sprygm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block4: while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    while (false) {
                    }
                    this.cfr_renamed_4 = this.cfr_renamed_11141(sprszm.cfr_renamed_5085(sprnvm2, false));
                    continue block4;
                }
                case 1: {
                    this.cfr_renamed_3 = this.cfr_renamed_11141(sprszm.cfr_renamed_5085(sprnvm2, false));
                    continue block4;
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwfq.cfr_renamed_9("z9D9@ Aw[6HwJ9L8Z9[2]2Km\u000f")).append(sprnvm2.cfr_renamed_312()).toString());
        }
    }

    public static sprygm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprygm) {
            return (sprygm)arg0;
        }
        if (arg0 != null) {
            return new sprygm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

