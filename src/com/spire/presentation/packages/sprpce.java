/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprpce
extends sprkra {
    private sprgpe cfr_renamed_2;
    private spruhe cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public static sprpce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpce) {
            return (sprpce)arg0;
        }
        if (arg0 != null) {
            return new sprpce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprpce(spruhe spruhe2, sprgpe sprgpe2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprpce sprpce2 = this;
        sprpce2.cfr_renamed_3 = arg0;
        sprpce2.cfr_renamed_2 = arg1;
        if (null != arg2) {
            sprpce sprpce3 = this;
            sprpce3.cfr_renamed_4 = new sprooe((BigInteger)arg2);
        }
    }

    public sprgpe cfr_renamed_4679() {
        return this.cfr_renamed_2;
    }

    public spruhe cfr_renamed_4680() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpce(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 2 || arg0.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException();
        }
        void v0 = arg0;
        this.cfr_renamed_3 = spruhe.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprgpe.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public BigInteger cfr_renamed_4681() {
        if (null == this.cfr_renamed_4) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public sprpce(spruhe arg0, sprgpe arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3.cfr_renamed_119());
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        if (null != this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}

