/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtpia;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprmge
extends sprkra {
    private sprije cfr_renamed_91;
    private sprije cfr_renamed_0;
    public static final sprije cfr_renamed_1;
    private sprije cfr_renamed_2;
    public static final sprije cfr_renamed_3;
    public static final sprije cfr_renamed_4;

    public sprmge() {
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_0 = cfr_renamed_4;
        this.cfr_renamed_91 = cfr_renamed_1;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_3 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);
        cfr_renamed_4 = new sprije(sprm.cfr_renamed_123, cfr_renamed_3);
        cfr_renamed_1 = new sprije(sprm.cfr_renamed_953, new sprlqe(new byte[0]));
    }

    public sprije cfr_renamed_4596() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (!this.cfr_renamed_2.equals(cfr_renamed_3)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_2));
        }
        if (!this.cfr_renamed_0.equals(cfr_renamed_4)) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_0));
        }
        if (!this.cfr_renamed_91.equals(cfr_renamed_1)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_91));
        }
        return new sprpse(sprlre2);
    }

    public sprije cfr_renamed_4599() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprmge(sprije sprije2, sprije sprije3, sprije sprije4) {
        void arg1;
        void arg0;
        sprmge sprmge2 = this;
        this.cfr_renamed_2 = arg0;
        sprmge2.cfr_renamed_0 = arg1;
        sprmge2.cfr_renamed_91 = sprije4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprmge(sprbne sprbne2) {
        int n;
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_0 = cfr_renamed_4;
        this.cfr_renamed_91 = cfr_renamed_1;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sprije.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_0 = sprije.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 2: {
                    this.cfr_renamed_91 = sprije.cfr_renamed_341(spryte2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprtpia.cfr_renamed_9("JhThPqQ&KgX"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    public static sprmge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmge) {
            return (sprmge)arg0;
        }
        if (arg0 != null) {
            return new sprmge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

