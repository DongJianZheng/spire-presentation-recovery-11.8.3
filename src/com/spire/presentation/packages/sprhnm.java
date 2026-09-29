/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprhnm
extends sprqqe {
    private sprgbf cfr_renamed_1;
    private final sprdvm cfr_renamed_2;
    private final sprhvm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(true, arg1, arg2));
        }
    }

    public sprxpm[] cfr_renamed_4414() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprxpm[] sprxpmArray = new sprxpm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprxpmArray.length) {
            int n3 = n++;
            sprxpmArray[n3] = sprxpm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprxpmArray;
    }

    public sprhvm cfr_renamed_4409() {
        return this.cfr_renamed_3;
    }

    public static sprhnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhnm) {
            return (sprhnm)arg0;
        }
        if (arg0 != null) {
            return new sprhnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdvm cfr_renamed_2573() {
        return this.cfr_renamed_2;
    }

    public sprhnm(sprhvm arg0, sprdvm arg1) {
        this(arg0, arg1, null, null);
    }

    private /* synthetic */ sprhnm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_3 = sprhvm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_2 = sprdvm.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_1 = sprgbf.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            this.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, true);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhnm(sprhvm sprhvm2, sprdvm sprdvm2, sprgbf sprgbf2, sprxpm[] sprxpmArray) {
        void arg2;
        void arg1;
        void arg0;
        sprhnm sprhnm2 = this;
        this.cfr_renamed_3 = arg0;
        sprhnm2.cfr_renamed_2 = arg1;
        sprhnm2.cfr_renamed_1 = arg2;
        if (sprxpmArray != null) {
            void arg3;
            sprhnm sprhnm3 = this;
            sprhnm3.cfr_renamed_4 = new sprcen((sprco[])arg3);
        }
    }

    public sprgbf cfr_renamed_4413() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprhnm sprhnm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprhnm2.cfr_renamed_2);
        sprhnm sprhnm3 = this;
        sprhnm3.cfr_renamed_11316(sprrvm2, 0, sprhnm3.cfr_renamed_1);
        sprhnm2.cfr_renamed_11316(sprrvm2, 1, this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprhnm(sprhvm arg0, sprdvm arg1, sprgbf arg2) {
        this(arg0, arg1, arg2, null);
    }
}

