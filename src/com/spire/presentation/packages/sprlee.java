/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjvg;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprlee
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprnhe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlee(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjvg.cfr_renamed_9("2Y\u0014\u0018\u0003]\u0001M\u0015V\u0013]PK\u0019B\u0015\u0002P")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprnhe.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlee(byte[] byArray) {
        void arg0;
        sprlee sprlee2 = this;
        sprlee2.cfr_renamed_3 = new sprlqe((byte[])arg0);
    }

    public static sprlee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlee) {
            return (sprlee)arg0;
        }
        if (arg0 != null) {
            return new sprlee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_629() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    public sprnhe cfr_renamed_630() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprlee(byte[] byArray, sprnhe sprnhe2) {
        void arg0;
        sprlee sprlee2 = this;
        this.cfr_renamed_3 = new sprlqe((byte[])arg0);
        this.cfr_renamed_4 = sprnhe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlee sprlee2 = this;
        sprlre2.cfr_renamed_49(sprlee2.cfr_renamed_3);
        if (sprlee2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}

