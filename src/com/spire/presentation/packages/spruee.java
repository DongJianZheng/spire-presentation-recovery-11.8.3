/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdge;
import com.spire.presentation.packages.sprdhe;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sproee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spruee
extends sprkra {
    private sprdhe cfr_renamed_152;
    private sprdge cfr_renamed_112;
    private sprooe cfr_renamed_119;
    private sproee cfr_renamed_91;
    private sprbne cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprmra cfr_renamed_3;
    private sprszd cfr_renamed_4;

    public sprdhe cfr_renamed_93() {
        return this.cfr_renamed_152;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_119.cfr_renamed_97().intValue() != 0) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_119);
        }
        sprlre sprlre3 = sprlre2;
        spruee spruee2 = this;
        sprlre sprlre4 = sprlre2;
        spruee spruee3 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_152);
        sprlre2.cfr_renamed_49(spruee3.cfr_renamed_91);
        sprlre4.cfr_renamed_49(spruee3.cfr_renamed_2);
        sprlre4.cfr_renamed_49(this.cfr_renamed_1);
        sprlre3.cfr_renamed_49(spruee2.cfr_renamed_112);
        sprlre3.cfr_renamed_49(spruee2.cfr_renamed_0);
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public static spruee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruee) {
            return (spruee)arg0;
        }
        if (arg0 != null) {
            return new spruee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproee cfr_renamed_102() {
        return this.cfr_renamed_91;
    }

    public sprbne cfr_renamed_82() {
        return this.cfr_renamed_0;
    }

    public sprdge cfr_renamed_108() {
        return this.cfr_renamed_112;
    }

    public sprije cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    public static spruee cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_1;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_119;
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_4;
    }

    public sprmra cfr_renamed_105() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruee(sprbne sprbne2) {
        int n;
        int n2;
        spruee spruee2;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 6 || arg0.cfr_renamed_84() > 9) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmvz.cfr_renamed_9("f @aW$U4A/G$\u00042M;A{\u0004")).append(arg0.cfr_renamed_84()).toString());
        }
        if (arg0.cfr_renamed_85(0) instanceof sprooe) {
            spruee2 = this;
            this.cfr_renamed_119 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
            n2 = 1;
        } else {
            spruee2 = this;
            this.cfr_renamed_119 = new sprooe(0L);
            n2 = 0;
        }
        spruee2.cfr_renamed_152 = sprdhe.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        int n3 = n2;
        spruee spruee3 = this;
        void v3 = arg0;
        int n4 = n2;
        this.cfr_renamed_91 = sproee.cfr_renamed_23(arg0.cfr_renamed_85(n4 + 1));
        this.cfr_renamed_2 = sprije.cfr_renamed_23(v3.cfr_renamed_85(n4 + 2));
        spruee3.cfr_renamed_1 = sprooe.cfr_renamed_23(v3.cfr_renamed_85(n2 + 3));
        spruee3.cfr_renamed_112 = sprdge.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 4));
        this.cfr_renamed_0 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(n3 + 5));
        int n5 = n = n3 + 6;
        while (n5 < arg0.cfr_renamed_84()) {
            spra spra2 = arg0.cfr_renamed_85(n);
            if (spra2 instanceof sprmra) {
                this.cfr_renamed_3 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (spra2 instanceof sprbne || spra2 instanceof sprszd) {
                this.cfr_renamed_4 = sprszd.cfr_renamed_23(arg0.cfr_renamed_85(n));
            }
            n5 = ++n;
        }
    }
}

