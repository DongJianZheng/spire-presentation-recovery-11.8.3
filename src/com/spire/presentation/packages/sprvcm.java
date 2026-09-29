/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprvcm
extends sprqqe {
    public sprszm cfr_renamed_4;

    public sprjgm[] cfr_renamed_322() {
        int n;
        sprjgm[] sprjgmArray = new sprjgm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprjgmArray[n3] = sprjgm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprjgmArray;
    }

    private /* synthetic */ sprvcm(sprszm sprszm2) {
        sprvcm sprvcm2 = this;
        sprvcm2.cfr_renamed_4 = null;
        sprvcm2.cfr_renamed_4 = sprszm2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprdbd.cfr_renamed_9("k^DhA_\\|GEFX\u0012"));
        stringBuffer.append(string);
        sprjgm[] sprjgmArray = this.cfr_renamed_322();
        int n = 0;
        int n2 = n;
        while (n2 != sprjgmArray.length) {
            stringBuffer.append("    ");
            stringBuffer.append(sprjgmArray[n]);
            stringBuffer.append(string);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public static sprvcm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprvcm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprvcm(sprjgm[] sprjgmArray) {
        void arg0;
        this.cfr_renamed_4 = null;
        sprvcm sprvcm2 = this;
        this.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public static sprvcm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvcm) {
            return (sprvcm)arg0;
        }
        if (arg0 != null) {
            return new sprvcm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprvcm cfr_renamed_5322(sprhgm arg0) {
        return sprvcm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_79));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

