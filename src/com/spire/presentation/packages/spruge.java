/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbtaa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqde;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class spruge
extends sprkra {
    private sprbne cfr_renamed_3;
    private sprmee cfr_renamed_4;

    public static spruge cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruge) {
            return (spruge)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new spruge((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spruna.cfr_renamed_9("\u0006j\u0003c\bg\u0003&\u0000d\u0005c\frOo\u0001&\bc\u001bO\u0001u\u001bg\u0001e\n<O")).append(arg0.getClass().getName()).toString());
    }

    public sprqde[] cfr_renamed_4632() {
        Enumeration enumeration;
        sprqde[] sprqdeArray = new sprqde[this.cfr_renamed_3.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprqdeArray[++n] = sprqde.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprqdeArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spruge(sprbne sprbne2) {
        void arg0;
        switch (sprbne2.cfr_renamed_84()) {
            case 1: {
                this.cfr_renamed_3 = sprpse.cfr_renamed_23(arg0.cfr_renamed_85(0));
                return;
            }
            case 2: {
                void v0 = arg0;
                this.cfr_renamed_4 = sprmee.cfr_renamed_23(v0.cfr_renamed_85(0));
                this.cfr_renamed_3 = sprpse.cfr_renamed_23(v0.cfr_renamed_85(1));
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbtaa.cfr_renamed_9("@)fhq-s=g&a-\";k2gr\"")).append(arg0.cfr_renamed_84()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprmee cfr_renamed_4633() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spruge(sprmee sprmee2, sprbne sprbne2) {
        void arg0;
        spruge spruge2 = this;
        spruge2.cfr_renamed_4 = arg0;
        spruge2.cfr_renamed_3 = sprbne2;
    }
}

