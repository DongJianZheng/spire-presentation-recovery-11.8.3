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
import java.util.Enumeration;

public class spryfe
extends sprkra {
    private sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryfe(sprpbe[] sprpbeArray) {
        void arg0;
        spryfe spryfe2 = this;
        spryfe2.cfr_renamed_4 = new sprpse((spra[])arg0);
    }

    private /* synthetic */ spryfe(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    public static spryfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryfe) {
            return (spryfe)arg0;
        }
        if (arg0 != null) {
            return new spryfe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprpbe[] cfr_renamed_188() {
        Enumeration enumeration;
        sprpbe[] sprpbeArray = new sprpbe[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprpbeArray[++n] = sprpbe.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprpbeArray;
    }
}

