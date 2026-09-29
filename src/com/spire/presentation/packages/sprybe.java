/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprybe
extends sprkra {
    public sprxue cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprybe(byte[] byArray) {
        void arg0;
        sprybe sprybe2 = this;
        sprybe2.cfr_renamed_4 = new sprlqe((byte[])arg0);
    }

    public static sprybe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprybe) {
            return (sprybe)arg0;
        }
        if (arg0 != null) {
            return new sprybe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprybe(sprbne sprbne2) {
        if (sprbne2.cfr_renamed_84() == 1) {
            void arg0;
            this.cfr_renamed_4 = (sprxue)arg0.cfr_renamed_85(0);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public byte[] cfr_renamed_1205() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_186();
        }
        return null;
    }
}

