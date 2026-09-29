/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurr;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxlm;
import java.util.Enumeration;

public class spryum
extends sprqqe {
    private sprszm cfr_renamed_3;
    private sprigm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryum(sprigm sprigm2, sprszm sprszm2) {
        void arg0;
        spryum spryum2 = this;
        spryum2.cfr_renamed_4 = arg0;
        spryum2.cfr_renamed_3 = sprszm2;
    }

    public sprigm cfr_renamed_4633() {
        return this.cfr_renamed_4;
    }

    public sprxlm[] cfr_renamed_4632() {
        Enumeration enumeration;
        sprxlm[] sprxlmArray = new sprxlm[this.cfr_renamed_3.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprxlmArray[++n] = sprxlm.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprxlmArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spryum(sprszm sprszm2) {
        void arg0;
        switch (sprszm2.cfr_renamed_84()) {
            case 1: {
                this.cfr_renamed_3 = sprcen.cfr_renamed_23(arg0.cfr_renamed_85(0));
                return;
            }
            case 2: {
                void v0 = arg0;
                this.cfr_renamed_4 = sprigm.cfr_renamed_23(v0.cfr_renamed_85(0));
                this.cfr_renamed_3 = sprcen.cfr_renamed_23(v0.cfr_renamed_85(1));
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("Y>\u007f\u007fh:j*~1x:;,r%~e;")).append(arg0.cfr_renamed_84()).toString());
    }

    public static spryum cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spryum) {
            return (spryum)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new spryum((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprurr.cfr_renamed_9("RcWj\\nW/TmQjX{\u001bfU/\\jOFU|OnUl^5\u001b")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}

