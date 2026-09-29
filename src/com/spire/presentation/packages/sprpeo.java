/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprisp;
import com.spire.presentation.packages.sprkko;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprpeo
implements sprrt {
    private sprisp cfr_renamed_2;
    private int cfr_renamed_3;
    private sprgeja cfr_renamed_4 = sprgeja.cfr_renamed_4;

    @Override
    public int cfr_renamed_324() {
        return 4;
    }

    @sprtea
    public void cfr_renamed_16242(sprhio arg0) {
        arg0.cfr_renamed_12261();
        arg0.cfr_renamed_12261();
        sprhio sprhio2 = arg0;
        int n = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        this.cfr_renamed_4 = arg0.cfr_renamed_16068();
        this.cfr_renamed_2.cfr_renamed_722();
        int n2 = 0;
        int n3 = n2;
        while (n3 < n) {
            this.cfr_renamed_2.cfr_renamed_13786(arg0.cfr_renamed_16068());
            n3 = ++n2;
        }
    }

    @sprtea
    public void cfr_renamed_16243(sprgeja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprisp cfr_renamed_16223() {
        return this.cfr_renamed_2;
    }

    public sprpeo() {
        sprpeo sprpeo2 = this;
        sprpeo2.cfr_renamed_2 = new sprisp();
    }

    @sprtea
    public sprgeja cfr_renamed_8505() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_16244(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public int cfr_renamed_12977() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public void cfr_renamed_16200(sprkko arg0) {
        try {
            arg0.cfr_renamed_12254();
            arg0.cfr_renamed_12254();
            arg0.cfr_renamed_12261();
            arg0.cfr_renamed_12254();
            sprkko sprkko2 = arg0;
            int n = sprkko2.cfr_renamed_12254();
            sprkko2.cfr_renamed_12254();
            this.cfr_renamed_4 = arg0.cfr_renamed_16079();
            this.cfr_renamed_2.cfr_renamed_722();
            for (int i = 0; i < n; ++i) {
                int n2;
                sprkko sprkko3 = arg0;
                int n3 = sprkko3.cfr_renamed_13218() & 0xFFFF;
                int n4 = sprkko3.cfr_renamed_13218() & 0xFFFF;
                int n5 = sprkko3.cfr_renamed_13218() & 0xFFFF;
                int n6 = n2 = 0;
                while (n6 < n3 / 2) {
                    sprkko sprkko4 = arg0;
                    int n7 = sprkko4.cfr_renamed_13218() & 0xFFFF;
                    int n8 = sprkko4.cfr_renamed_13218() & 0xFFFF;
                    this.cfr_renamed_2.cfr_renamed_13786(new sprgeja(n7, n4, n8 - n7, n5 - n4));
                    n6 = ++n2;
                }
                arg0.cfr_renamed_13218();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

