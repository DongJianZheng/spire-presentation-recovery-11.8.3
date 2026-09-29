/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprube;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprxhe
extends sprkra {
    private sprbne cfr_renamed_4;

    public static sprxhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxhe) {
            return (sprxhe)arg0;
        }
        if (arg0 != null) {
            return new sprxhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxhe(sprube[] sprubeArray) {
        void arg0;
        sprxhe sprxhe2 = this;
        sprxhe2.cfr_renamed_4 = new sprpse((spra[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxhe(sprbne sprbne2) {
        void arg0;
        Enumeration enumeration;
        Enumeration enumeration2 = enumeration = sprbne2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprube.cfr_renamed_23(enumeration3.nextElement());
        }
        this.cfr_renamed_4 = arg0;
    }

    public sprube[] cfr_renamed_4682() {
        int n;
        sprube[] sprubeArray = new sprube[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprubeArray.length) {
            int n3 = n++;
            sprubeArray[n3] = sprube.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprubeArray;
    }
}

