/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprrvca
extends sprkra {
    private byte[] cfr_renamed_4;

    public static sprrvca cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprrvca.cfr_renamed_23(sprxue.cfr_renamed_341(arg0, arg1));
    }

    public static sprrvca cfr_renamed_2757(sprszd arg0) {
        return sprrvca.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_93));
    }

    public byte[] cfr_renamed_327() {
        return this.cfr_renamed_4;
    }

    public sprrvca(sprxue sprxue2) {
        this.cfr_renamed_4 = sprxue2.cfr_renamed_186();
    }

    public sprrvca(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprlqe(this.cfr_renamed_4);
    }

    public static sprrvca cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrvca) {
            return (sprrvca)arg0;
        }
        if (arg0 != null) {
            return new sprrvca(sprxue.cfr_renamed_23(arg0));
        }
        return null;
    }
}

