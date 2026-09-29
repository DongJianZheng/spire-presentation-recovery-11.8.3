/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprepy;
import com.spire.presentation.packages.sprgpm;
import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriqm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprxlm
extends sprqqe {
    private sprgpm cfr_renamed_2;
    private sprigm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprgpm cfr_renamed_4619() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxlm(sprigm sprigm2, sprgpm sprgpm2, spriqm[] spriqmArray) {
        void arg2;
        void arg0;
        sprxlm sprxlm2 = this;
        sprxlm2.cfr_renamed_3 = arg0;
        sprxlm2.cfr_renamed_2 = sprgpm2;
        sprxlm sprxlm3 = this;
        sprxlm2.cfr_renamed_4 = new sprcen((sprco[])arg2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprxlm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprepy.cfr_renamed_9("d5BtU1W!C:E1\u0006'O.Cn\u0006")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprco sprco2 = (sprco)enumeration.nextElement();
        if (sprco2 instanceof sprnvm) {
            Enumeration enumeration2;
            switch (((sprnvm)sprco2).cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprigm.cfr_renamed_5085((sprnvm)sprco2, true);
                    enumeration2 = enumeration;
                    break;
                }
                case 1: {
                    this.cfr_renamed_2 = sprgpm.cfr_renamed_5085((sprnvm)sprco2, true);
                    enumeration2 = enumeration;
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprhig.cfr_renamed_9("p\nVKF\nUK\\\u001e_\tW\u0019\bK")).append(((sprnvm)sprco2).cfr_renamed_312()).toString());
                }
            }
            sprco2 = (sprco)enumeration2.nextElement();
        }
        if (sprco2 instanceof sprnvm) {
            switch (((sprnvm)sprco2).cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_2 = sprgpm.cfr_renamed_5085((sprnvm)sprco2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprepy.cfr_renamed_9("\u0016G0\u0006 G3\u0006:S9D1Tn\u0006")).append(((sprnvm)sprco2).cfr_renamed_312()).toString());
                }
            }
            sprco2 = (sprco)enumeration.nextElement();
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(sprco2);
        if (enumeration.hasMoreElements()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhig.cfr_renamed_9("p\nVK]\tX\u000eQ\u001f\u0012\u000e\\\b]\u001e\\\u001fW\u0019W\u000f\bK")).append(enumeration.nextElement().getClass()).toString());
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_2));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public static sprxlm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprxlm) {
            return (sprxlm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprxlm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprepy.cfr_renamed_9("O8J1A5JtI6L1E \u0006=HtA1R\u001dH'R5H7Cn\u0006")).append(arg0.getClass().getName()).toString());
    }

    public spriqm[] cfr_renamed_4634() {
        Enumeration enumeration;
        spriqm[] spriqmArray = new spriqm[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spriqmArray[++n] = spriqm.cfr_renamed_23(enumeration3.nextElement());
        }
        return spriqmArray;
    }

    public sprigm cfr_renamed_4633() {
        return this.cfr_renamed_3;
    }
}

