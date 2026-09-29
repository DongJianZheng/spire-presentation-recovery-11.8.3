/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdie;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxwy;
import java.util.Enumeration;

public class sprffe
extends sprkra {
    private sprbne cfr_renamed_4;

    public static sprffe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprffe) {
            return (sprffe)arg0;
        }
        if (arg0 != null) {
            return new sprffe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprffe(sprdie[] sprdieArray) {
        void arg0;
        sprffe sprffe2 = this;
        sprffe2.cfr_renamed_4 = new sprpse((spra[])arg0);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprpse(this.cfr_renamed_4);
    }

    public sprdie[] cfr_renamed_4672() {
        int n;
        sprdie[] sprdieArray = new sprdie[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprdieArray.length) {
            int n3 = n++;
            sprdieArray[n3] = sprdie.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdieArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprffe(sprbne sprbne2) {
        Enumeration enumeration;
        void arg0;
        if (sprbne2.cfr_renamed_84() != 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxwy.cfr_renamed_9("\bW.\u00169S;C/X)SjE#L/\fj")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = (sprbne)arg0.cfr_renamed_85(0);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprdie.cfr_renamed_23(enumeration3.nextElement());
        }
    }
}

