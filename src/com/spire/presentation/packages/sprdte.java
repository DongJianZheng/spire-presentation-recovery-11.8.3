/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spravz;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtme;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprdte
extends sprkra {
    private sprxue cfr_renamed_1;
    private sprkme cfr_renamed_2;
    private sprtme cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprtme cfr_renamed_4895() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdte(sprooe sprooe2, sprkme sprkme2, sprtme sprtme2, sprxue sprxue2) {
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        if (sprooe2 == null) {
            throw new IllegalArgumentException(sprjgka.cfr_renamed_9("E \u00071\u0016\u0011\u00072+'Ec\u0001\"\f-\r7B!\u0007c\f6\u000e/"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(spravz.cfr_renamed_9("y\u0006*\u0014*\u0000-R~\u0016?\u001b0\u001a*U<\u0010~\u001b+\u00192"));
        }
        sprdte sprdte2 = this;
        this.cfr_renamed_4 = arg0;
        sprdte2.cfr_renamed_2 = arg1;
        sprdte2.cfr_renamed_3 = arg2;
        this.cfr_renamed_1 = arg3;
    }

    public sprooe cfr_renamed_4420() {
        return this.cfr_renamed_4;
    }

    public sprdte(sprooe arg0, sprkme arg1) {
        this(arg0, arg1, null, null);
    }

    public static sprdte cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdte) {
            return (sprdte)arg0;
        }
        if (arg0 != null) {
            return new sprdte(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkme cfr_renamed_648() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprdte(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprkme.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
        if (sprbne2.cfr_renamed_84() >= 3) {
            if (arg0.cfr_renamed_84() == 3) {
                spra spra2 = arg0.cfr_renamed_85(2);
                if (spra2 instanceof sprxue) {
                    this.cfr_renamed_1 = sprxue.cfr_renamed_23(spra2);
                    return;
                }
                this.cfr_renamed_3 = sprtme.cfr_renamed_23(spra2);
                return;
            }
            sprbne sprbne3 = arg0;
            this.cfr_renamed_3 = sprtme.cfr_renamed_23(sprbne3.cfr_renamed_85(2));
            this.cfr_renamed_1 = sprxue.cfr_renamed_23(sprbne3.cfr_renamed_85(3));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdte sprdte2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprdte2.cfr_renamed_2);
        if (sprdte2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        return new sprpse(sprlre2);
    }
}

