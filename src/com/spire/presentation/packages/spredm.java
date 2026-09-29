/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrun;
import com.spire.presentation.packages.sprxgf;

public class spredm
extends sprqqe
implements sprlm {
    public final int cfr_renamed_0 = 1;
    public int cfr_renamed_1;
    public final int cfr_renamed_2 = 999;
    public sprco cfr_renamed_3;
    public final int cfr_renamed_4 = 3;

    /*
     * WARNING - void declaration
     */
    public spredm(String string) {
        void arg0;
        spredm spredm2 = this;
        this.cfr_renamed_4 = 3;
        spredm2.cfr_renamed_0 = 1;
        spredm2.cfr_renamed_2 = 999;
        if (string.length() > 3) {
            throw new IllegalArgumentException(sprefg.cfr_renamed_9("t_lCd\rpDyH#Dm\rbAsEbOfYjN#NlIf\r9\rnL{\rpDyH#Dp\r0"));
        }
        this.cfr_renamed_3 = new sprldn((String)arg0);
    }

    public static spredm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spredm) {
            return (spredm)arg0;
        }
        if (arg0 instanceof sprktm) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(arg0);
            int n = sprktm2.cfr_renamed_5023();
            return new spredm(n);
        }
        if (arg0 instanceof sprpfn) {
            sprpfn sprpfn2 = sprpfn.cfr_renamed_23(arg0);
            return new spredm(sprpfn2.cfr_renamed_314());
        }
        throw new IllegalArgumentException(sprrun.cfr_renamed_9("GSYS]J\\\u001d]_XXQI\u0012T\\\u001dUXFt\\NF\\\\^W"));
    }

    public boolean cfr_renamed_361() {
        return this.cfr_renamed_3 instanceof sprpfn;
    }

    public String cfr_renamed_362() {
        return ((sprpfn)this.cfr_renamed_3).cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public spredm(int n) {
        void arg0;
        spredm spredm2 = this;
        this.cfr_renamed_4 = 3;
        spredm2.cfr_renamed_0 = 1;
        spredm2.cfr_renamed_2 = 999;
        if (n > 999 || arg0 < true) {
            throw new IllegalArgumentException(sprefg.cfr_renamed_9("ZqBmJ#^jWf\rjC#Cv@f_jN#NlIf\r9\rmBw\rjC#\u00052\u0003-\u0014:\u0014*"));
        }
        this.cfr_renamed_3 = new sprktm((long)arg0);
    }

    public int cfr_renamed_363() {
        return ((sprktm)this.cfr_renamed_3).cfr_renamed_5023();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3.cfr_renamed_119();
    }
}

