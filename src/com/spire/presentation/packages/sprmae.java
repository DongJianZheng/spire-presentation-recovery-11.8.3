/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprpbe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryfe;
import java.util.Enumeration;

public class sprmae
extends sprkra {
    private sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmae(sprpbe[] sprpbeArray) {
        this(new spryfe((sprpbe[])arg0));
        void arg0;
    }

    private /* synthetic */ sprmae(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmae(spryfe spryfe2) {
        void arg0;
        sprmae sprmae2 = this;
        sprmae2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public static sprmae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmae) {
            return (sprmae)arg0;
        }
        if (arg0 != null) {
            return new sprmae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spryfe[] cfr_renamed_187() {
        Enumeration enumeration;
        spryfe[] spryfeArray = new spryfe[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spryfeArray[++n] = spryfe.cfr_renamed_23(enumeration3.nextElement());
        }
        return spryfeArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

