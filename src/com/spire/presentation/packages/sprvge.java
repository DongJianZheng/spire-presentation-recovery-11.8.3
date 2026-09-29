/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprvge
extends sprkra {
    private sprooe cfr_renamed_3;
    private sprmra cfr_renamed_4;

    public sprmra cfr_renamed_2113() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public static sprvge cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprvge.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprvge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvge) {
            return (sprvge)arg0;
        }
        if (arg0 != null) {
            return new sprvge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvge(sprmra sprmra2, sprooe sprooe2) {
        void arg0;
        void arg1;
        if (sprmra2 == null) {
            throw new IllegalArgumentException(spriad.cfr_renamed_9("S-\u0011;\u0010yT=\u00150\u001a1\u0000~\u0016;T0\u00012\u0018"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprdkea.cfr_renamed_9("6xvm\u007fK~}\u007f|tz6(ri\u007ff~|1jt(\u007f}}d"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvge(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spriad.cfr_renamed_9("6?\u0010~\u0007;\u0005+\u00110\u0017;T-\u001d$\u0011dT")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprmra.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprooe cfr_renamed_2618() {
        return this.cfr_renamed_3;
    }
}

