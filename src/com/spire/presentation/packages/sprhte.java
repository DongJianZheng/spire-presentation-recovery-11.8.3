/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprlse;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.util.Enumeration;

public class sprhte
extends sprbne {
    private byte[] cfr_renamed_4;

    @Override
    public synchronized int cfr_renamed_84() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4611();
        }
        return super.cfr_renamed_84();
    }

    private /* synthetic */ void cfr_renamed_4611() {
        sprlse sprlse2;
        sprlse sprlse3 = sprlse2 = new sprlse(this.cfr_renamed_4);
        while (sprlse3.hasMoreElements()) {
            sprlse sprlse4 = sprlse2;
            sprlse3 = sprlse4;
            this.cfr_renamed_4.addElement(sprlse4.nextElement());
        }
        this.cfr_renamed_4 = null;
    }

    @Override
    public sprvva cfr_renamed_4612() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4611();
        }
        return super.cfr_renamed_4612();
    }

    @Override
    public synchronized spra cfr_renamed_85(int arg0) {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4611();
        }
        return super.cfr_renamed_85(arg0);
    }

    @Override
    public synchronized Enumeration cfr_renamed_329() {
        if (this.cfr_renamed_4 == null) {
            return super.cfr_renamed_329();
        }
        return new sprlse(this.cfr_renamed_4);
    }

    public sprhte(byte[] byArray) throws IOException {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        if (this.cfr_renamed_4 != null) {
            arg0.cfr_renamed_4614(48, this.cfr_renamed_4);
            return;
        }
        super.cfr_renamed_4612().cfr_renamed_4613(arg0);
    }

    @Override
    public sprvva cfr_renamed_4615() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4611();
        }
        return super.cfr_renamed_4615();
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        if (this.cfr_renamed_4 != null) {
            return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
        }
        return super.cfr_renamed_4612().cfr_renamed_4616();
    }
}

