/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprhhf;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprdue
extends sprkra {
    private sprmee cfr_renamed_3;
    private sprkme cfr_renamed_4;

    public static sprdue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdue) {
            return (sprdue)arg0;
        }
        if (arg0 != null) {
            return new sprdue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprdue(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprkme.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public String toString() {
        return new StringBuilder().insert(0, sprfiz.cfr_renamed_9("*3-6+\u0017\u001c\n\u001c+\u0001\u0011\u0007\u0006\u000bE\u0015o\u001a\u0017\u000f\u000b\u001d\u0004\r\u0011\u0007\n\u00006\u001a\u0004\u001a\u0010\u001d_N")).append(this.cfr_renamed_4).append("\n").append(this.cfr_renamed_3 != null ? new StringBuilder().insert(0, sprhhf.cfr_renamed_9("n3{/i y5s.t\b~$t5s's$h{:")).append(this.cfr_renamed_3).append("\n").toString() : "").append(sprfiz.cfr_renamed_9("\u0018d")).toString();
    }

    public static sprdue cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprdue.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprkme cfr_renamed_4768() {
        return this.cfr_renamed_4;
    }

    public sprdue(sprkme arg0) {
        this(arg0, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdue sprdue2 = this;
        sprlre2.cfr_renamed_49(sprdue2.cfr_renamed_4);
        if (sprdue2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdue(sprkme sprkme2, sprmee sprmee2) {
        void arg0;
        sprdue sprdue2 = this;
        sprdue2.cfr_renamed_4 = arg0;
        sprdue2.cfr_renamed_3 = sprmee2;
    }

    public sprmee cfr_renamed_2607() {
        return this.cfr_renamed_3;
    }
}

