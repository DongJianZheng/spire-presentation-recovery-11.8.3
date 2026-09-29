/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.spremy;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzcaa;

public class sprrzd
extends sprkra {
    private sprcge[] cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprcge[] cfr_renamed_4646() {
        sprrzd sprrzd2 = this;
        return sprrzd2.cfr_renamed_4647(sprrzd2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrzd(sprbne sprbne2) {
        int n;
        void arg0;
        sprrzd sprrzd2 = this;
        sprrzd2.cfr_renamed_4 = new sprooe(0L);
        if (sprbne2 == null || arg0.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprzcaa.cfr_renamed_9("{\u0017y\u000e5\rgBp\u000fe\u0016lBf\u0007d\u0017p\fv\u00075\u0012t\u0011f\u0007qL"));
        }
        if (arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spremy.cfr_renamed_9("L?f>w#`2qqv4t$`?f4%\"l+`k%")).append(arg0.cfr_renamed_84()).toString());
        }
        void v1 = arg0;
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprere sprere2 = sprere.cfr_renamed_23(v1.cfr_renamed_85(1));
        this.cfr_renamed_3 = new sprcge[sprere2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = sprcge.cfr_renamed_23(sprere2.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre sprlre3 = new sprlre();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprlre3.cfr_renamed_49(this.cfr_renamed_3[n++]);
            n2 = n;
        }
        sprlre2.cfr_renamed_49(new sprcwe(sprlre3));
        return new sprpse(sprlre2);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_97().intValue();
    }

    private /* synthetic */ sprcge[] cfr_renamed_4647(sprcge[] arg0) {
        int n;
        sprcge[] sprcgeArray = new sprcge[arg0.length];
        int n2 = n = 0;
        while (n2 != sprcgeArray.length) {
            int n3 = n++;
            sprcgeArray[n3] = arg0[n3];
            n2 = n;
        }
        return sprcgeArray;
    }

    public sprrzd(sprcge[] sprcgeArray) {
        sprrzd sprrzd2 = this;
        this.cfr_renamed_4 = new sprooe(0L);
        this.cfr_renamed_3 = this.cfr_renamed_4647(sprcgeArray);
    }

    public static sprrzd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrzd) {
            return (sprrzd)arg0;
        }
        if (arg0 != null) {
            return new sprrzd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

