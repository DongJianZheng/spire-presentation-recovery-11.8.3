/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprpnja;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprbie
extends sprkra {
    private sprije cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprnhe cfr_renamed_3;
    private static final sprije cfr_renamed_4 = new sprije(sprdg.cfr_renamed_119);

    public sprbie(byte[] arg0, sprnhe arg1) {
        this(null, arg0, arg1);
    }

    public sprnhe cfr_renamed_630() {
        return this.cfr_renamed_3;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbie(sprbne sprbne2) {
        sprbie sprbie2;
        void arg0;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpnja.cfr_renamed_9("\u0000\u0003&B1\u00073\u0017'\f!\u0007b\u0011+\u0018'Xb")).append(arg0.cfr_renamed_84()).toString());
        }
        int n = 0;
        if (arg0.cfr_renamed_85(0) instanceof sprxue) {
            sprbie2 = this;
            this.cfr_renamed_1 = cfr_renamed_4;
        } else {
            sprbie2 = this;
            sprije sprije2 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(n).cfr_renamed_119());
            ++n;
            this.cfr_renamed_1 = sprije2;
        }
        sprxue sprxue2 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(n).cfr_renamed_119());
        sprbie2.cfr_renamed_2 = sprxue2.cfr_renamed_186();
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_3 = sprnhe.cfr_renamed_23(arg0.cfr_renamed_85(n));
        }
    }

    public sprbie(byte[] arg0) {
        this(null, arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprbie(sprije sprije2, byte[] byArray, sprnhe sprnhe2) {
        void arg2;
        void arg1;
        sprbie sprbie2;
        if (sprije2 == null) {
            sprbie2 = this;
            this.cfr_renamed_1 = cfr_renamed_4;
        } else {
            void arg0;
            sprbie2 = this;
            this.cfr_renamed_1 = arg0;
        }
        sprbie2.cfr_renamed_2 = arg1;
        this.cfr_renamed_3 = arg2;
    }

    public byte[] cfr_renamed_629() {
        return this.cfr_renamed_2;
    }

    public sprbie(sprije arg0, byte[] arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (!this.cfr_renamed_1.equals(cfr_renamed_4)) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_2).cfr_renamed_119());
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    public static sprbie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbie) {
            return (sprbie)arg0;
        }
        if (arg0 != null) {
            return new sprbie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

