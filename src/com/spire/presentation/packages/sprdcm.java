/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprobm;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvh;

public class sprdcm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprdcm(sprlem sprlem2) {
        this.cfr_renamed_3 = sprlem2;
    }

    public static sprdcm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprdcm) {
            return (sprdcm)arg0;
        }
        return new sprdcm(sprszm.cfr_renamed_23(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprdcm(sprlem sprlem2, sprszm sprszm2) {
        void arg0;
        sprdcm sprdcm2 = this;
        sprdcm2.cfr_renamed_3 = arg0;
        sprdcm2.cfr_renamed_4 = sprszm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprdcm sprdcm2 = this;
        sprrvm2.cfr_renamed_5004(sprdcm2.cfr_renamed_3);
        if (sprdcm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprlem cfr_renamed_330() {
        return this.cfr_renamed_3;
    }

    public sprszm cfr_renamed_332() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdcm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxvh.cfr_renamed_9("Qqw0`ubev~pu3czjv*3")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        sprdcm sprdcm2 = this;
        stringBuffer.append(sprokp.cfr_renamed_9("D2x4w$44z;{/y<`4{3.}"));
        stringBuffer.append(sprdcm2.cfr_renamed_3);
        if (sprdcm2.cfr_renamed_4 != null) {
            int n;
            StringBuffer stringBuffer2 = new StringBuffer();
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4.cfr_renamed_84()) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(sprxvh.cfr_renamed_9("<3"));
                }
                stringBuffer2.append(sprobm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n++)));
                n2 = n;
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}

