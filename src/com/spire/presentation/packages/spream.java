/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprofg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprufm;
import com.spire.presentation.packages.sprxgf;

public class spream
extends sprqqe {
    private sprufm[] cfr_renamed_4;

    public sprufm[] cfr_renamed_309() {
        return spream.cfr_renamed_11155(this.cfr_renamed_4);
    }

    public String toString() {
        return new StringBuilder().insert(0, sprofg.cfr_renamed_9("R\u001dg\u0000|\u001az\u001cj!}\u000e|\u001a~\tg\u0001|\u0006R\u000bp\r`\u001b)H\\\u0001w@")).append(this.cfr_renamed_4[0].cfr_renamed_310().cfr_renamed_19()).append(")").toString();
    }

    /*
     * WARNING - void declaration
     */
    public spream(sprufm sprufm2) {
        void arg0;
        sprufm[] sprufmArray = new sprufm[1];
        sprufmArray[0] = arg0;
        this.cfr_renamed_4 = sprufmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    private static /* synthetic */ sprufm[] cfr_renamed_11155(sprufm[] arg0) {
        sprufm[] sprufmArray = new sprufm[arg0.length];
        System.arraycopy(arg0, 0, sprufmArray, 0, arg0.length);
        return sprufmArray;
    }

    public spream(sprufm[] sprufmArray) {
        this.cfr_renamed_4 = spream.cfr_renamed_11155(sprufmArray);
    }

    public static spream cfr_renamed_5322(sprhgm arg0) {
        return spream.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_102));
    }

    public static spream cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spream) {
            return (spream)arg0;
        }
        if (arg0 != null) {
            return new spream(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spream(sprlem sprlem2, sprigm sprigm2) {
        this(new sprufm((sprlem)arg0, (sprigm)arg1));
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spream(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(sprquo.cfr_renamed_9("\\A^QJJLA\u000fIN]\u000fJ@P\u000fFJ\u0004JI_PV"));
        }
        this.cfr_renamed_4 = new sprufm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprufm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }
}

