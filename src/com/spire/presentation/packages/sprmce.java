/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjsd;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzzz;

public class sprmce
extends sprkra {
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    public sprmee cfr_renamed_3;
    public sprtzd cfr_renamed_4;

    public String toString() {
        return new StringBuilder().insert(0, sprjsd.cfr_renamed_9(")\u000f\u000b\t\u001b\u001f,\t\u001b\u000f\u001a\u0005\u0018\u0018\u0001\u0003\u0006VH#\u0001\b@")).append(this.cfr_renamed_4.cfr_renamed_19()).append(")").toString();
    }

    static {
        cfr_renamed_2 = new sprtzd(sprzzz.cfr_renamed_9("_q]qXq_q[q[qYqZg@m"));
        cfr_renamed_1 = new sprtzd(sprjsd.cfr_renamed_9("]F_FZF]FYFYF[FXPBY"));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprmee cfr_renamed_311() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmce(sprtzd sprtzd2, sprmee sprmee2) {
        void arg0;
        sprmce sprmce2 = this;
        sprmce sprmce3 = this;
        sprmce3.cfr_renamed_4 = null;
        sprmce3.cfr_renamed_3 = null;
        sprmce2.cfr_renamed_4 = arg0;
        sprmce2.cfr_renamed_3 = sprmee2;
    }

    public static sprmce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmce) {
            return (sprmce)arg0;
        }
        if (arg0 != null) {
            return new sprmce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmce(sprbne sprbne2) {
        void arg0;
        sprmce sprmce2 = this;
        sprmce2.cfr_renamed_4 = null;
        sprmce2.cfr_renamed_3 = null;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprzzz.cfr_renamed_9("\u0019-\u00011\t\u007f\u0000*\u0003=\u000b-N0\b\u007f\u000b3\u000b2\u000b1\u001a,N6\u0000\u007f\u001d:\u001f*\u000b1\r:"));
        }
        void v1 = arg0;
        this.cfr_renamed_4 = sprtzd.cfr_renamed_23(v1.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprmee.cfr_renamed_23(v1.cfr_renamed_85(1));
    }

    public sprtzd cfr_renamed_310() {
        return this.cfr_renamed_4;
    }
}

