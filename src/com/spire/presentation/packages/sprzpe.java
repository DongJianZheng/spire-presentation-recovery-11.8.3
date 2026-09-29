/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjsr;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprsqe;
import com.spire.presentation.packages.sprsre;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprzpe
extends sprkra
implements sprkj {
    public static final int cfr_renamed_91 = 2;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 1;
    private spra cfr_renamed_2;
    private int cfr_renamed_3;
    public static final int cfr_renamed_4 = 3;

    /*
     * WARNING - void declaration
     */
    public sprzpe(int n, sprsre sprsre2) {
        void arg0;
        sprzpe sprzpe2 = this;
        sprzpe2.cfr_renamed_3 = arg0;
        sprzpe2.cfr_renamed_2 = sprsre2;
    }

    public sprzpe() {
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_2 = sprume.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprzpe sprzpe2 = this;
        return new sprhse(false, sprzpe2.cfr_renamed_3, sprzpe2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprzpe(spryte spryte2) {
        sprzpe sprzpe2 = this;
        sprzpe2.cfr_renamed_3 = spryte2.cfr_renamed_312();
        switch (sprzpe2.cfr_renamed_3) {
            case 0: {
                this.cfr_renamed_2 = sprume.cfr_renamed_3;
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_2 = sprsqe.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 2: 
            case 3: {
                void arg0;
                this.cfr_renamed_2 = sprsre.cfr_renamed_341((spryte)arg0, true);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjsr.cfr_renamed_9(".\u001f0\u001f4\u00065Q/\u0010<K{")).append(this.cfr_renamed_3).toString());
    }

    public static sprzpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprzpe) {
            return (sprzpe)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprzpe((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrgo.cfr_renamed_9("oYPVJ^B\u0017IULREC\u001c\u0017")).append(arg0.getClass().getName()).toString());
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public sprzpe(sprsqe sprsqe2) {
        sprzpe sprzpe2 = this;
        sprzpe2.cfr_renamed_3 = 1;
        sprzpe2.cfr_renamed_2 = sprsqe2;
    }

    public spra cfr_renamed_2456() {
        return this.cfr_renamed_2;
    }
}

