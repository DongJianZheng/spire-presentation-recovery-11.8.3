/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprope;
import java.io.IOException;
import java.util.Enumeration;

public class sprnqe
extends sprere {
    private int cfr_renamed_4 = -1;

    /*
     * WARNING - void declaration
     */
    public sprnqe(spra[] spraArray) {
        super((spra[])arg0, false);
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprnqe(spra spra2) {
        super((spra)arg0);
        void arg0;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        Enumeration enumeration;
        sprope sprope2 = arg0;
        sprope sprope3 = sprope2.cfr_renamed_4785();
        int n = this.cfr_renamed_4786();
        sprope2.cfr_renamed_4787(49);
        sprope2.cfr_renamed_4782(n);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Object e = enumeration.nextElement();
            sprope3.cfr_renamed_2149((spra)e);
            enumeration2 = enumeration;
        }
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        int n = this.cfr_renamed_4786();
        return 1 + sprcme.cfr_renamed_4586(n) + n;
    }

    /*
     * WARNING - void declaration
     */
    public sprnqe(sprlre sprlre2) {
        super((sprlre)arg0, false);
        void arg0;
    }

    private /* synthetic */ int cfr_renamed_4786() throws IOException {
        if (this.cfr_renamed_4 < 0) {
            Enumeration enumeration;
            int n = 0;
            Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
            while (enumeration2.hasMoreElements()) {
                Object e = enumeration.nextElement();
                n += ((spra)e).cfr_renamed_119().cfr_renamed_4612().cfr_renamed_4616();
                enumeration2 = enumeration;
            }
            this.cfr_renamed_4 = n;
        }
        return this.cfr_renamed_4;
    }

    public sprnqe() {
    }
}

