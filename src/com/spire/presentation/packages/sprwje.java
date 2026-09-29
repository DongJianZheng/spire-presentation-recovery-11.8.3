/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprwje
extends sprkra {
    private spra cfr_renamed_3;
    private sprnhe cfr_renamed_4;

    public sprije cfr_renamed_4649() {
        if (this.cfr_renamed_3.cfr_renamed_119() instanceof sprxue) {
            return new sprije("1.3.14.3.2.26");
        }
        return sprnje.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_1473();
    }

    public sprnhe cfr_renamed_630() {
        return this.cfr_renamed_4;
    }

    public static sprwje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwje) {
            return (sprwje)arg0;
        }
        if (arg0 != null) {
            return new sprwje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwje(sprbne sprbne2) {
        void v1;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprljg.cfr_renamed_9("Z]|\u001ckYiI}R{Y8OqF}\u00068")).append(arg0.cfr_renamed_84()).toString());
        }
        if (arg0.cfr_renamed_85(0).cfr_renamed_119() instanceof sprxue) {
            void v0 = arg0;
            v1 = v0;
            this.cfr_renamed_3 = sprxue.cfr_renamed_23(v0.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_3 = sprnje.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v1 = arg0;
        }
        if (v1.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprnhe.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwje(sprije sprije2, byte[] byArray, sprnhe sprnhe2) {
        void arg1;
        void arg0;
        sprwje sprwje2 = this;
        this.cfr_renamed_3 = new sprnje((sprije)arg0, (byte[])arg1);
        this.cfr_renamed_4 = sprnhe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprwje sprwje2 = this;
        sprlre2.cfr_renamed_49(sprwje2.cfr_renamed_3);
        if (sprwje2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public byte[] cfr_renamed_629() {
        if (this.cfr_renamed_3.cfr_renamed_119() instanceof sprxue) {
            return ((sprxue)this.cfr_renamed_3.cfr_renamed_119()).cfr_renamed_186();
        }
        return sprnje.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_580();
    }

    /*
     * WARNING - void declaration
     */
    public sprwje(sprije sprije2, byte[] byArray) {
        void arg1;
        void arg0;
        sprwje sprwje2 = this;
        sprwje2.cfr_renamed_3 = new sprnje((sprije)arg0, (byte[])arg1);
    }
}

