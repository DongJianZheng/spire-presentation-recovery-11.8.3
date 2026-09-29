/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhkaa;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproyia;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprosm
extends sprqqe {
    private spravm cfr_renamed_2;
    private sprigm cfr_renamed_3;
    private sprirm cfr_renamed_4;

    public String toString() {
        return new StringBuilder().insert(0, sproyia.cfr_renamed_9("iRnW\u007fa\\qHwY$V\u000e_a\\qHwYMCbBv@eYmBj\u0017$")).append(this.cfr_renamed_2).append("\n").append(sprhkaa.cfr_renamed_9("\u0016i\u0006iH(")).append(this.cfr_renamed_4).append("\n").append(this.cfr_renamed_3 != null ? new StringBuilder().insert(0, sproyia.cfr_renamed_9("p_eCwLgYmBjd`HjYmKmHv\u0017$")).append(this.cfr_renamed_3).append("\n").toString() : "").append(sprhkaa.cfr_renamed_9("\u000f\u0002")).toString();
    }

    public sprosm(spravm arg0, sprirm arg1) {
        this(arg0, arg1, null);
    }

    public spravm cfr_renamed_2608() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprosm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_2 = spravm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprirm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() > 2) {
            this.cfr_renamed_3 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprirm cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    public sprigm cfr_renamed_2607() {
        return this.cfr_renamed_3;
    }

    public static sprosm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprosm) {
            return (sprosm)arg0;
        }
        if (arg0 != null) {
            return new sprosm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprosm sprosm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprosm2.cfr_renamed_4);
        if (sprosm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprosm(spravm spravm2, sprirm sprirm2, sprigm sprigm2) {
        void arg1;
        void arg0;
        sprosm sprosm2 = this;
        this.cfr_renamed_2 = arg0;
        sprosm2.cfr_renamed_4 = arg1;
        sprosm2.cfr_renamed_3 = sprigm2;
    }

    public static sprosm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprosm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

