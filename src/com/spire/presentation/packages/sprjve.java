/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprope;
import java.io.IOException;
import java.util.Enumeration;

public class sprjve
extends sprbne {
    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_4613(sprope sprope2) throws IOException {
        Enumeration enumeration;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4787(48);
        v0.cfr_renamed_4787(128);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            arg0.cfr_renamed_2149((spra)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        arg0.cfr_renamed_4787(0);
        arg0.cfr_renamed_4787(0);
    }

    public sprjve(sprlre arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        Enumeration enumeration;
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            n += ((spra)enumeration.nextElement()).cfr_renamed_119().cfr_renamed_4616();
            enumeration2 = enumeration;
        }
        return 2 + n + 2;
    }

    public sprjve(spra arg0) {
        super(arg0);
    }

    public sprjve(spra[] arg0) {
        super(arg0);
    }

    public sprjve() {
    }
}

