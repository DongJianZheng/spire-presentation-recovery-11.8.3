/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprcty;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprggm
extends sprqqe {
    private final sprdcm[] cfr_renamed_4;

    public static sprggm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprggm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprggm(sprszm sprszm2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new sprdcm[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprdcm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public static sprggm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprggm) {
            return (sprggm)arg0;
        }
        if (arg0 != null) {
            return new sprggm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdcm cfr_renamed_11153(sprlem arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (arg0.cfr_renamed_5078(this.cfr_renamed_4[n].cfr_renamed_330())) {
                return this.cfr_renamed_4[n];
            }
            n2 = ++n;
        }
        return null;
    }

    public String toString() {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append(sprctl.cfr_renamed_9("\"w"));
            }
            stringBuffer.append(this.cfr_renamed_4[n++]);
            n2 = n;
        }
        return new StringBuilder().insert(0, sprcty.cfr_renamed_9("\u0007>6/-=-8%/!\u000b+7-8->7ad\u0000")).append((Object)stringBuffer).append("]").toString();
    }

    private static /* synthetic */ sprdcm[] cfr_renamed_11154(sprdcm[] arg0) {
        sprdcm[] sprdcmArray = new sprdcm[arg0.length];
        System.arraycopy(arg0, 0, sprdcmArray, 0, arg0.length);
        return sprdcmArray;
    }

    public sprdcm[] cfr_renamed_4526() {
        return sprggm.cfr_renamed_11154(this.cfr_renamed_4);
    }

    public sprggm(sprdcm[] sprdcmArray) {
        this.cfr_renamed_4 = sprggm.cfr_renamed_11154(sprdcmArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprggm(sprdcm sprdcm2) {
        void arg0;
        sprdcm[] sprdcmArray = new sprdcm[1];
        sprdcmArray[0] = arg0;
        this.cfr_renamed_4 = sprdcmArray;
    }

    public static sprggm cfr_renamed_5322(sprhgm arg0) {
        return sprggm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_723));
    }
}

