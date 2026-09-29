/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsve;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprjqe
extends sprkra {
    private sprbne cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprjqe sprjqe2 = this;
        sprlre2.cfr_renamed_49(sprjqe2.cfr_renamed_2);
        sprjqe sprjqe3 = this;
        sprjqe3.cfr_renamed_4814(sprlre2, 0, sprjqe3.cfr_renamed_4);
        sprjqe2.cfr_renamed_4814(sprlre2, 1, this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public static sprjqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjqe) {
            return (sprjqe)arg0;
        }
        if (arg0 != null) {
            return new sprjqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsve[] cfr_renamed_4848() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprsve[] sprsveArray = new sprsve[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprsveArray.length) {
            int n3 = n++;
            sprsveArray[n3] = sprsve.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsveArray;
    }

    public sprkme[] cfr_renamed_648() {
        int n;
        sprkme[] sprkmeArray = new sprkme[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprkmeArray.length) {
            int n3 = n++;
            sprkmeArray[n3] = sprkme.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprkmeArray;
    }

    private /* synthetic */ sprjqe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_2 = sprbne.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprbne.cfr_renamed_341(spryte2, true);
                continue;
            }
            this.cfr_renamed_3 = sprbne.cfr_renamed_341(spryte2, true);
        }
    }

    public sproje[] cfr_renamed_4145() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sproje[] sprojeArray = new sproje[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprojeArray.length) {
            int n3 = n++;
            sprojeArray[n3] = sproje.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprojeArray;
    }

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(true, arg1, arg2));
        }
    }
}

